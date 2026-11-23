'use strict';

// Generic network observer: logs connect() destinations and TLS plaintext as hex.
// Attach: frida -U -p <PID> -l net_sniff.js

const MAX_BYTES = 256;

function hex(buf, len) {
  const n = Math.min(len | 0, MAX_BYTES);
  const bytes = buf.readByteArray(n);
  if (!bytes) return '';
  const u = new Uint8Array(bytes);
  let s = '';
  for (let i = 0; i < n; i++) s += u[i].toString(16).padStart(2, '0');
  return s + (len > n ? '...[' + len + ']' : '');
}

function findExport(moduleName, name) {
  try {
    if (moduleName) return Process.getModuleByName(moduleName).getExportByName(name);
    return Module.getGlobalExportByName(name);
  } catch (e) {
    return null;
  }
}

function hookConnect() {
  const p = findExport('libc.so', 'connect') || findExport(null, 'connect');
  if (!p) return console.log('[!] connect not found');
  Interceptor.attach(p, {
    onEnter(args) {
      const sa = args[1];
      if (sa.readU16() === 2) { // AF_INET
        const raw = sa.add(2).readU16();
        const port = (raw >> 8) | ((raw & 0xff) << 8);
        const b = new Uint8Array(sa.add(4).readByteArray(4));
        console.log('[CONNECT] ' + b[0] + '.' + b[1] + '.' + b[2] + '.' + b[3] + ':' + port);
      }
    }
  });
  console.log('[+] hooked connect');
}

function hookSSL(name, label) {
  const p = findExport('libssl.so', name) || findExport(null, name);
  if (!p) { console.log('[!] ' + name + ' not found'); return; }
  Interceptor.attach(p, {
    onEnter(args) {
      this.buf = args[1];
      this.len = args[2].toInt32();
    },
    onLeave(ret) {
      const n = ret.toInt32();
      if (n > 0) console.log('[' + label + '] len=' + n + ' hex=' + hex(this.buf, n));
    }
  });
  console.log('[+] hooked ' + name + ' @ ' + p);
}

function hookRaw(name, label) {
  const p = findExport('libc.so', name) || findExport(null, name);
  if (!p) return;
  Interceptor.attach(p, {
    onEnter(args) {
      this.fd = args[0].toInt32();
      this.buf = args[1];
      this.len = args[2].toInt32();
    },
    onLeave(ret) {
      const n = ret.toInt32();
      if (n > 0 && this.len > 0)
        console.log('[' + label + ' fd=' + this.fd + ' len=' + n + ' hex=' + hex(this.buf, Math.min(n, this.len)));
    }
  });
  console.log('[+] hooked ' + name);
}

hookConnect();
hookSSL('SSL_write', 'TLS-OUT');
hookSSL('SSL_read', 'TLS-IN');
hookRaw('send', 'RAW-OUT');
hookRaw('recv', 'RAW-IN');
console.log('[*] net_sniff ready');
