package j.c.a.e.f.l;

import j.c.a.e.f.k.d;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private final String a;
    private final int b;
    private int c;
    private Socket d;
    private InputStream e;
    private OutputStream f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f1924g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1925h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private c f1926i;

    public a(String str, int i2, int i3) {
        this.f1924g = -1;
        this.a = str;
        this.b = i2;
        this.f1924g = i3;
    }

    private void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private void c(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException unused) {
            }
        }
    }

    private void n(int i2) {
        this.c = i2;
    }

    private void p() {
        c cVar = this.f1926i;
        if (cVar != null) {
            cVar.f();
        }
    }

    protected void a() {
        c(this.d);
        b(this.e);
        b(this.f);
    }

    public void d() throws d {
        e();
        try {
            Socket socket = new Socket(this.a, this.b);
            this.d = socket;
            socket.setTcpNoDelay(true);
            this.d.setKeepAlive(true);
            this.e = this.d.getInputStream();
            OutputStream outputStream = this.d.getOutputStream();
            this.f = outputStream;
            outputStream.flush();
            n(0);
        } catch (IOException e) {
            j.c.a.e.l.b.b(e);
            e();
            throw new d(e);
        }
    }

    public void e() {
        p();
        n(1);
        a();
    }

    public int f() {
        return this.f1924g;
    }

    public InputStream g() {
        return this.e;
    }

    public boolean h() {
        return this.f1925h;
    }

    public synchronized c i() {
        return this.f1926i;
    }

    public boolean j() {
        return this.c == 1;
    }

    public void k(byte[] bArr) throws j.c.a.e.f.k.b {
        l(bArr, 0, bArr.length);
    }

    public void l(byte[] bArr, int i2, int i3) throws j.c.a.e.f.k.b {
        try {
            this.f.write(bArr, i2, i3);
            this.f.flush();
        } catch (Exception e) {
            j.c.a.e.l.b.b(e);
            e();
            throw new j.c.a.e.f.k.b(e);
        }
    }

    public void m(boolean z) {
        this.f1925h = z;
    }

    public synchronized void o(c cVar) {
        p();
        this.f1926i = cVar;
    }
}
