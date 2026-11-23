import argparse, datetime, json, mimetypes, pathlib
from http.server import BaseHTTPRequestHandler, ThreadingHTTPServer
from urllib.parse import urlparse

ROOT = pathlib.Path(__file__).parent
RESPONSE_FILE = ROOT / "version_response.json"
LOG_FILE = ROOT / "localhost_server.log"
ASSETS_DIR = ROOT / "assets"

DEFAULT_RESPONSE = {
    "result": 0,
    "ret": 0,
    "code": 0,
    "msg": "ok",
    "version": "1.98.1",
    "verAddr": "http://localhost:8080/live/",
    "serverAddr": "127.0.0.1",
    "majorServerAddr": "127.0.0.1",
    "cdnAddr": "http://127.0.0.1:8080/",
    "logServerAddr": "127.0.0.1",
    "networkLogServerAddr": "127.0.0.1",
    "networkDetectionServerAddr": "127.0.0.1",
    "isIOSReview": False,
}


def load_response():
    if RESPONSE_FILE.exists():
        return json.loads(RESPONSE_FILE.read_text(encoding="utf-8"))
    return DEFAULT_RESPONSE


def log_line(text):
    stamp = datetime.datetime.now().strftime("%Y-%m-%d %H:%M:%S")
    with LOG_FILE.open("a", encoding="utf-8") as f:
        f.write(f"[{stamp}] {text}\n")


class Handler(BaseHTTPRequestHandler):
    protocol_version = "HTTP/1.1"
    server_version = "FFLocal/1.0"

    def log_message(self, fmt, *args):
        log_line("%s - %s" % (self.address_string(), fmt % args))

    def _body(self):
        length = int(self.headers.get("Content-Length", "0") or 0)
        return self.rfile.read(length) if length else b""

    def _headers(self, content_type, length):
        self.send_response(200)
        self.send_header("Content-Type", content_type)
        self.send_header("Content-Length", str(length))
        self.send_header("Cache-Control", "no-store")
        self.send_header("Access-Control-Allow-Origin", "*")
        self.send_header("Access-Control-Allow-Headers", "*")
        self.send_header("Access-Control-Allow-Methods", "GET, POST, OPTIONS")
        self.send_header("Connection", "close")
        self.end_headers()

    def _respond(self, payload, status=200):
        body = json.dumps(payload, ensure_ascii=False).encode("utf-8")
        self.send_response(status)
        self.send_header("Content-Type", "application/json; charset=utf-8")
        self.send_header("Content-Length", str(len(body)))
        self.send_header("Access-Control-Allow-Origin", "*")
        self.send_header("Access-Control-Allow-Headers", "*")
        self.send_header("Access-Control-Allow-Methods", "GET, POST, OPTIONS")
        self.send_header("Connection", "close")
        self.end_headers()
        self.wfile.write(body)

    def _respond_file(self, path):
        rel = path.lstrip("/").split("/", 1)[1] if "/" in path.lstrip("/") else ""
        name = pathlib.Path(rel).name
        target = ASSETS_DIR / rel
        if not target.is_file():
            target = ASSETS_DIR / name
        if not name or not target.is_file():
            self._respond({"ok": False, "asset": name}, status=404)
            return
        body = target.read_bytes()
        ctype = mimetypes.guess_type(name)[0] or "application/octet-stream"
        if name.endswith(".ff_extend"):
            ctype = "image/png"
        self._headers(ctype, len(body))
        self.wfile.write(body)

    def handle_any(self):
        raw = self._body()
        parsed = urlparse(self.path)
        log_line(f"{self.command} {self.path} len={len(raw)} body={raw[:512]!r}")
        if self.command == "OPTIONS":
            self._respond({"ok": True})
            return
        if parsed.path.rstrip("/") == "/health":
            self._respond({"ok": True, "service": "localhost version server"})
            return
        if parsed.path.startswith("/assets/"):
            self._respond_file(parsed.path)
            return
        payload = load_response()
        payload.setdefault("requestPath", self.path)
        self._respond(payload)

    do_GET = handle_any
    do_POST = handle_any
    do_PUT = handle_any
    do_OPTIONS = handle_any


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--host", default="127.0.0.1")
    ap.add_argument("--port", type=int, default=8080)
    args = ap.parse_args()

    log_line(f"starting on http://{args.host}:{args.port}/live/")
    print(f"listening on http://{args.host}:{args.port}/live/")
    print(f"response file: {RESPONSE_FILE}")
    print(f"log file: {LOG_FILE}")
    ThreadingHTTPServer((args.host, args.port), Handler).serve_forever()


if __name__ == "__main__":
    main()
