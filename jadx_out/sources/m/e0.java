package m;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class e0 implements Closeable {
    public static final b b = new b(null);
    private Reader a;

    public static final class a extends Reader {
        private final n.d a;
        private final Charset b;
        private boolean c;
        private Reader d;

        public a(n.d dVar, Charset charset) {
            l.y.c.i.e(dVar, "source");
            l.y.c.i.e(charset, "charset");
            this.a = dVar;
            this.b = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            l.s sVar;
            this.c = true;
            Reader reader = this.d;
            if (reader == null) {
                sVar = null;
            } else {
                reader.close();
                sVar = l.s.a;
            }
            if (sVar == null) {
                this.a.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i2, int i3) throws IOException {
            l.y.c.i.e(cArr, "cbuf");
            if (this.c) {
                throw new IOException("Stream closed");
            }
            Reader inputStreamReader = this.d;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.a.W(), m.h0.d.H(this.a, this.b));
                this.d = inputStreamReader;
            }
            return inputStreamReader.read(cArr, i2, i3);
        }
    }

    public static final class b {

        public static final class a extends e0 {
            final /* synthetic */ x c;
            final /* synthetic */ long d;
            final /* synthetic */ n.d e;

            a(x xVar, long j2, n.d dVar) {
                this.c = xVar;
                this.d = j2;
                this.e = dVar;
            }

            @Override // m.e0
            public n.d F() {
                return this.e;
            }

            @Override // m.e0
            public long j() {
                return this.d;
            }

            @Override // m.e0
            public x l() {
                return this.c;
            }
        }

        private b() {
        }

        public /* synthetic */ b(l.y.c.f fVar) {
            this();
        }

        public static /* synthetic */ e0 d(b bVar, byte[] bArr, x xVar, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                xVar = null;
            }
            return bVar.c(bArr, xVar);
        }

        public final e0 a(x xVar, long j2, n.d dVar) {
            l.y.c.i.e(dVar, "content");
            return b(dVar, xVar, j2);
        }

        public final e0 b(n.d dVar, x xVar, long j2) {
            l.y.c.i.e(dVar, "<this>");
            return new a(xVar, j2, dVar);
        }

        public final e0 c(byte[] bArr, x xVar) {
            l.y.c.i.e(bArr, "<this>");
            n.b bVar = new n.b();
            bVar.w0(bArr);
            return b(bVar, xVar, bArr.length);
        }
    }

    private final Charset f() {
        x xVarL = l();
        Charset charsetC = xVarL == null ? null : xVarL.c(l.d0.d.b);
        return charsetC == null ? l.d0.d.b : charsetC;
    }

    public static final e0 u(x xVar, long j2, n.d dVar) {
        return b.a(xVar, j2, dVar);
    }

    public abstract n.d F();

    public final String O() throws IOException {
        n.d dVarF = F();
        try {
            String strV = dVarF.V(m.h0.d.H(dVarF, f()));
            l.x.a.a(dVarF, null);
            return strV;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                l.x.a.a(dVarF, th);
                throw th2;
            }
        }
    }

    public final InputStream b() {
        return F().W();
    }

    public final Reader c() {
        Reader reader = this.a;
        if (reader != null) {
            return reader;
        }
        a aVar = new a(F(), f());
        this.a = aVar;
        return aVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m.h0.d.j(F());
    }

    public abstract long j();

    public abstract x l();
}
