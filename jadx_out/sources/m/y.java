package m;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class y extends c0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final x f2321g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final x f2322h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final byte[] f2323i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final byte[] f2324j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final byte[] f2325k;
    private final n.e b;
    private final x c;
    private final List<b> d;
    private final x e;
    private long f;

    public static final class a {
        private final n.e a;
        private x b;
        private final List<b> c;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public a(String str) {
            l.y.c.i.e(str, "boundary");
            this.a = n.e.d.d(str);
            this.b = y.f2321g;
            this.c = new ArrayList();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ a(String str, int i2, l.y.c.f fVar) {
            if ((i2 & 1) != 0) {
                str = UUID.randomUUID().toString();
                l.y.c.i.d(str, "randomUUID().toString()");
            }
            this(str);
        }

        public final a a(u uVar, c0 c0Var) {
            l.y.c.i.e(c0Var, "body");
            b(b.c.a(uVar, c0Var));
            return this;
        }

        public final a b(b bVar) {
            l.y.c.i.e(bVar, "part");
            this.c.add(bVar);
            return this;
        }

        public final y c() {
            if (!this.c.isEmpty()) {
                return new y(this.a, this.b, m.h0.d.R(this.c));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }

        public final a d(x xVar) {
            l.y.c.i.e(xVar, "type");
            if (!l.y.c.i.a(xVar.h(), "multipart")) {
                throw new IllegalArgumentException(l.y.c.i.k("multipart != ", xVar).toString());
            }
            this.b = xVar;
            return this;
        }
    }

    public static final class b {
        public static final a c = new a(null);
        private final u a;
        private final c0 b;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(l.y.c.f fVar) {
                this();
            }

            public final b a(u uVar, c0 c0Var) {
                l.y.c.i.e(c0Var, "body");
                l.y.c.f fVar = null;
                if (!((uVar == null ? null : uVar.b("Content-Type")) == null)) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
                }
                if ((uVar == null ? null : uVar.b("Content-Length")) == null) {
                    return new b(uVar, c0Var, fVar);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
            }
        }

        private b(u uVar, c0 c0Var) {
            this.a = uVar;
            this.b = c0Var;
        }

        public /* synthetic */ b(u uVar, c0 c0Var, l.y.c.f fVar) {
            this(uVar, c0Var);
        }

        public final c0 a() {
            return this.b;
        }

        public final u b() {
            return this.a;
        }
    }

    static {
        x.a aVar = x.d;
        f2321g = aVar.a("multipart/mixed");
        aVar.a("multipart/alternative");
        aVar.a("multipart/digest");
        aVar.a("multipart/parallel");
        f2322h = aVar.a("multipart/form-data");
        f2323i = new byte[]{58, 32};
        f2324j = new byte[]{13, 10};
        f2325k = new byte[]{45, 45};
    }

    public y(n.e eVar, x xVar, List<b> list) {
        l.y.c.i.e(eVar, "boundaryByteString");
        l.y.c.i.e(xVar, "type");
        l.y.c.i.e(list, "parts");
        this.b = eVar;
        this.c = xVar;
        this.d = list;
        this.e = x.d.a(xVar + "; boundary=" + i());
        this.f = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long j(n.c cVar, boolean z) throws EOFException {
        n.b bVar;
        if (z) {
            cVar = new n.b();
            bVar = cVar;
        } else {
            bVar = 0;
        }
        int size = this.d.size();
        long j2 = 0;
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            b bVar2 = this.d.get(i2);
            u uVarB = bVar2.b();
            c0 c0VarA = bVar2.a();
            l.y.c.i.c(cVar);
            cVar.E(f2325k);
            cVar.G(this.b);
            cVar.E(f2324j);
            if (uVarB != null) {
                int size2 = uVarB.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    cVar.R(uVarB.c(i4)).E(f2323i).R(uVarB.h(i4)).E(f2324j);
                }
            }
            x xVarB = c0VarA.b();
            if (xVarB != null) {
                cVar.R("Content-Type: ").R(xVarB.toString()).E(f2324j);
            }
            long jA = c0VarA.a();
            if (jA != -1) {
                cVar.R("Content-Length: ").S(jA).E(f2324j);
            } else if (z) {
                l.y.c.i.c(bVar);
                bVar.Y();
                return -1L;
            }
            byte[] bArr = f2324j;
            cVar.E(bArr);
            if (z) {
                j2 += jA;
            } else {
                c0VarA.h(cVar);
            }
            cVar.E(bArr);
            i2 = i3;
        }
        l.y.c.i.c(cVar);
        byte[] bArr2 = f2325k;
        cVar.E(bArr2);
        cVar.G(this.b);
        cVar.E(bArr2);
        cVar.E(f2324j);
        if (!z) {
            return j2;
        }
        l.y.c.i.c(bVar);
        long jR0 = j2 + bVar.r0();
        bVar.Y();
        return jR0;
    }

    @Override // m.c0
    public long a() throws EOFException {
        long j2 = this.f;
        if (j2 != -1) {
            return j2;
        }
        long j3 = j(null, true);
        this.f = j3;
        return j3;
    }

    @Override // m.c0
    public x b() {
        return this.e;
    }

    @Override // m.c0
    public void h(n.c cVar) throws EOFException {
        l.y.c.i.e(cVar, "sink");
        j(cVar, false);
    }

    public final String i() {
        return this.b.x();
    }
}
