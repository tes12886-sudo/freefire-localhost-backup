package m;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {
    public static final a a = new a(null);

    public static final class a {

        /* JADX INFO: renamed from: m.c0$a$a, reason: collision with other inner class name */
        public static final class C0261a extends c0 {
            final /* synthetic */ x b;
            final /* synthetic */ n.e c;

            C0261a(x xVar, n.e eVar) {
                this.b = xVar;
                this.c = eVar;
            }

            @Override // m.c0
            public long a() {
                return this.c.t();
            }

            @Override // m.c0
            public x b() {
                return this.b;
            }

            @Override // m.c0
            public void h(n.c cVar) {
                l.y.c.i.e(cVar, "sink");
                cVar.G(this.c);
            }
        }

        public static final class b extends c0 {
            final /* synthetic */ x b;
            final /* synthetic */ int c;
            final /* synthetic */ byte[] d;
            final /* synthetic */ int e;

            b(x xVar, int i2, byte[] bArr, int i3) {
                this.b = xVar;
                this.c = i2;
                this.d = bArr;
                this.e = i3;
            }

            @Override // m.c0
            public long a() {
                return this.c;
            }

            @Override // m.c0
            public x b() {
                return this.b;
            }

            @Override // m.c0
            public void h(n.c cVar) {
                l.y.c.i.e(cVar, "sink");
                cVar.e(this.d, this.e, this.c);
            }
        }

        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }

        public static /* synthetic */ c0 h(a aVar, x xVar, byte[] bArr, int i2, int i3, int i4, Object obj) {
            if ((i4 & 4) != 0) {
                i2 = 0;
            }
            if ((i4 & 8) != 0) {
                i3 = bArr.length;
            }
            return aVar.e(xVar, bArr, i2, i3);
        }

        public static /* synthetic */ c0 i(a aVar, byte[] bArr, x xVar, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                xVar = null;
            }
            if ((i4 & 2) != 0) {
                i2 = 0;
            }
            if ((i4 & 4) != 0) {
                i3 = bArr.length;
            }
            return aVar.g(bArr, xVar, i2, i3);
        }

        public final c0 a(String str, x xVar) {
            l.y.c.i.e(str, "<this>");
            Charset charset = l.d0.d.b;
            if (xVar != null) {
                Charset charsetD = x.d(xVar, null, 1, null);
                if (charsetD == null) {
                    xVar = x.d.b(xVar + "; charset=utf-8");
                } else {
                    charset = charsetD;
                }
            }
            byte[] bytes = str.getBytes(charset);
            l.y.c.i.d(bytes, "this as java.lang.String).getBytes(charset)");
            return g(bytes, xVar, 0, bytes.length);
        }

        public final c0 b(x xVar, String str) {
            l.y.c.i.e(str, "content");
            return a(str, xVar);
        }

        public final c0 c(x xVar, n.e eVar) {
            l.y.c.i.e(eVar, "content");
            return f(eVar, xVar);
        }

        public final c0 d(x xVar, byte[] bArr) {
            l.y.c.i.e(bArr, "content");
            return h(this, xVar, bArr, 0, 0, 12, null);
        }

        public final c0 e(x xVar, byte[] bArr, int i2, int i3) {
            l.y.c.i.e(bArr, "content");
            return g(bArr, xVar, i2, i3);
        }

        public final c0 f(n.e eVar, x xVar) {
            l.y.c.i.e(eVar, "<this>");
            return new C0261a(xVar, eVar);
        }

        public final c0 g(byte[] bArr, x xVar, int i2, int i3) {
            l.y.c.i.e(bArr, "<this>");
            m.h0.d.i(bArr.length, i2, i3);
            return new b(xVar, i3, bArr, i2);
        }
    }

    public static final c0 c(x xVar, String str) {
        return a.b(xVar, str);
    }

    public static final c0 d(x xVar, n.e eVar) {
        return a.c(xVar, eVar);
    }

    public static final c0 e(x xVar, byte[] bArr) {
        return a.d(xVar, bArr);
    }

    public long a() {
        return -1L;
    }

    public abstract x b();

    public boolean f() {
        return false;
    }

    public boolean g() {
        return false;
    }

    public abstract void h(n.c cVar);
}
