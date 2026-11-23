package n;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class m {
    private static final Logger a = Logger.getLogger("okio.Okio");

    public static final boolean b(AssertionError assertionError) {
        l.y.c.i.e(assertionError, "<this>");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message == null ? false : l.d0.q.C(message, "getsockname failed", false, 2, null);
    }

    public static final v c(Socket socket) throws IOException {
        l.y.c.i.e(socket, "<this>");
        w wVar = new w(socket);
        OutputStream outputStream = socket.getOutputStream();
        l.y.c.i.d(outputStream, "getOutputStream()");
        return wVar.x(new p(outputStream, wVar));
    }

    public static final x d(InputStream inputStream) {
        l.y.c.i.e(inputStream, "<this>");
        return new k(inputStream, new y());
    }

    public static final x e(Socket socket) throws IOException {
        l.y.c.i.e(socket, "<this>");
        w wVar = new w(socket);
        InputStream inputStream = socket.getInputStream();
        l.y.c.i.d(inputStream, "getInputStream()");
        return wVar.y(new k(inputStream, wVar));
    }
}
