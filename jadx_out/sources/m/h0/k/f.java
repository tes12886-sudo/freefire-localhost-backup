package m.h0.k;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import l.s;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Closeable {
    public static final b L = new b(null);
    private static final m M;
    private long F;
    private long G;
    private final Socket H;
    private final m.h0.k.j I;
    private final d J;
    private final Set<Integer> K;
    private final boolean a;
    private final c b;
    private final Map<Integer, m.h0.k.i> c;
    private final String d;
    private int e;
    private int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f2250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final m.h0.g.e f2251h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final m.h0.g.d f2252i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final m.h0.g.d f2253j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final m.h0.g.d f2254k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final m.h0.k.l f2255l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f2256m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f2257n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f2258o;
    private long p;
    private long q;
    private long r;
    private final m s;
    private m t;
    private long u;
    private long v;

    public static final class a {
        private boolean a;
        private final m.h0.g.e b;
        public Socket c;
        public String d;
        public n.d e;
        public n.c f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private c f2259g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private m.h0.k.l f2260h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f2261i;

        public a(boolean z, m.h0.g.e eVar) {
            l.y.c.i.e(eVar, "taskRunner");
            this.a = z;
            this.b = eVar;
            this.f2259g = c.a;
            this.f2260h = m.h0.k.l.a;
        }

        public final f a() {
            return new f(this);
        }

        public final boolean b() {
            return this.a;
        }

        public final String c() {
            String str = this.d;
            if (str != null) {
                return str;
            }
            l.y.c.i.q("connectionName");
            throw null;
        }

        public final c d() {
            return this.f2259g;
        }

        public final int e() {
            return this.f2261i;
        }

        public final m.h0.k.l f() {
            return this.f2260h;
        }

        public final n.c g() {
            n.c cVar = this.f;
            if (cVar != null) {
                return cVar;
            }
            l.y.c.i.q("sink");
            throw null;
        }

        public final Socket h() {
            Socket socket = this.c;
            if (socket != null) {
                return socket;
            }
            l.y.c.i.q("socket");
            throw null;
        }

        public final n.d i() {
            n.d dVar = this.e;
            if (dVar != null) {
                return dVar;
            }
            l.y.c.i.q("source");
            throw null;
        }

        public final m.h0.g.e j() {
            return this.b;
        }

        public final a k(c cVar) {
            l.y.c.i.e(cVar, "listener");
            n(cVar);
            return this;
        }

        public final a l(int i2) {
            o(i2);
            return this;
        }

        public final void m(String str) {
            l.y.c.i.e(str, "<set-?>");
            this.d = str;
        }

        public final void n(c cVar) {
            l.y.c.i.e(cVar, "<set-?>");
            this.f2259g = cVar;
        }

        public final void o(int i2) {
            this.f2261i = i2;
        }

        public final void p(n.c cVar) {
            l.y.c.i.e(cVar, "<set-?>");
            this.f = cVar;
        }

        public final void q(Socket socket) {
            l.y.c.i.e(socket, "<set-?>");
            this.c = socket;
        }

        public final void r(n.d dVar) {
            l.y.c.i.e(dVar, "<set-?>");
            this.e = dVar;
        }

        public final a s(Socket socket, String str, n.d dVar, n.c cVar) {
            String strK;
            l.y.c.i.e(socket, "socket");
            l.y.c.i.e(str, "peerName");
            l.y.c.i.e(dVar, "source");
            l.y.c.i.e(cVar, "sink");
            q(socket);
            if (b()) {
                strK = m.h0.d.f2189h + ' ' + str;
            } else {
                strK = l.y.c.i.k("MockWebServer ", str);
            }
            m(strK);
            r(dVar);
            p(cVar);
            return this;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(l.y.c.f fVar) {
            this();
        }

        public final m a() {
            return f.M;
        }
    }

    public static abstract class c {
        public static final c a = new a();

        public static final class a extends c {
            a() {
            }

            @Override // m.h0.k.f.c
            public void c(m.h0.k.i iVar) {
                l.y.c.i.e(iVar, "stream");
                iVar.d(m.h0.k.b.REFUSED_STREAM, null);
            }
        }

        public void b(f fVar, m mVar) {
            l.y.c.i.e(fVar, "connection");
            l.y.c.i.e(mVar, "settings");
        }

        public abstract void c(m.h0.k.i iVar);
    }

    public final class d implements m.h0.k.h.c, l.y.b.a<s> {
        private final m.h0.k.h a;
        final /* synthetic */ f b;

        public static final class a extends m.h0.g.a {
            final /* synthetic */ f e;
            final /* synthetic */ l.y.c.l f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, boolean z, f fVar, l.y.c.l lVar) {
                super(str, z);
                this.e = fVar;
                this.f = lVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // m.h0.g.a
            public long f() {
                this.e.l0().b(this.e, (m) this.f.a);
                return -1L;
            }
        }

        public static final class b extends m.h0.g.a {
            final /* synthetic */ f e;
            final /* synthetic */ m.h0.k.i f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, boolean z, f fVar, m.h0.k.i iVar) {
                super(str, z);
                this.e = fVar;
                this.f = iVar;
            }

            @Override // m.h0.g.a
            public long f() {
                try {
                    this.e.l0().c(this.f);
                    return -1L;
                } catch (IOException e) {
                    m.h0.l.h.a.g().j(l.y.c.i.k("Http2Connection.Listener failure for ", this.e.j0()), 4, e);
                    try {
                        this.f.d(m.h0.k.b.PROTOCOL_ERROR, e);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }
        }

        public static final class c extends m.h0.g.a {
            final /* synthetic */ f e;
            final /* synthetic */ int f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f2262g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, boolean z, f fVar, int i2, int i3) {
                super(str, z);
                this.e = fVar;
                this.f = i2;
                this.f2262g = i3;
            }

            @Override // m.h0.g.a
            public long f() {
                this.e.O0(true, this.f, this.f2262g);
                return -1L;
            }
        }

        /* JADX INFO: renamed from: m.h0.k.f$d$d, reason: collision with other inner class name */
        public static final class C0265d extends m.h0.g.a {
            final /* synthetic */ d e;
            final /* synthetic */ boolean f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ m f2263g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0265d(String str, boolean z, d dVar, boolean z2, m mVar) {
                super(str, z);
                this.e = dVar;
                this.f = z2;
                this.f2263g = mVar;
            }

            @Override // m.h0.g.a
            public long f() {
                this.e.l(this.f, this.f2263g);
                return -1L;
            }
        }

        public d(f fVar, m.h0.k.h hVar) {
            l.y.c.i.e(fVar, "this$0");
            l.y.c.i.e(hVar, "reader");
            this.b = fVar;
            this.a = hVar;
        }

        @Override // l.y.b.a
        public /* bridge */ /* synthetic */ s a() throws Throwable {
            m();
            return s.a;
        }

        @Override // m.h0.k.h.c
        public void b() {
        }

        @Override // m.h0.k.h.c
        public void c(boolean z, m mVar) {
            l.y.c.i.e(mVar, "settings");
            this.b.f2252i.i(new C0265d(l.y.c.i.k(this.b.j0(), " applyAndAckSettings"), true, this, z, mVar), 0L);
        }

        @Override // m.h0.k.h.c
        public void d(boolean z, int i2, n.d dVar, int i3) {
            l.y.c.i.e(dVar, "source");
            if (this.b.C0(i2)) {
                this.b.y0(i2, dVar, i3, z);
                return;
            }
            m.h0.k.i iVarQ0 = this.b.q0(i2);
            if (iVarQ0 == null) {
                this.b.Q0(i2, m.h0.k.b.PROTOCOL_ERROR);
                long j2 = i3;
                this.b.L0(j2);
                dVar.skip(j2);
                return;
            }
            iVarQ0.w(dVar, i3);
            if (z) {
                iVarQ0.x(m.h0.d.b, true);
            }
        }

        @Override // m.h0.k.h.c
        public void e(boolean z, int i2, int i3) {
            if (!z) {
                this.b.f2252i.i(new c(l.y.c.i.k(this.b.j0(), " ping"), true, this.b, i2, i3), 0L);
                return;
            }
            f fVar = this.b;
            synchronized (fVar) {
                try {
                    if (i2 == 1) {
                        fVar.f2257n++;
                    } else if (i2 != 2) {
                        if (i2 == 3) {
                            fVar.q++;
                            fVar.notifyAll();
                        }
                        s sVar = s.a;
                    } else {
                        fVar.p++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // m.h0.k.h.c
        public void f(int i2, int i3, int i4, boolean z) {
        }

        @Override // m.h0.k.h.c
        public void g(int i2, m.h0.k.b bVar) {
            l.y.c.i.e(bVar, "errorCode");
            if (this.b.C0(i2)) {
                this.b.B0(i2, bVar);
                return;
            }
            m.h0.k.i iVarD0 = this.b.D0(i2);
            if (iVarD0 == null) {
                return;
            }
            iVarD0.y(bVar);
        }

        @Override // m.h0.k.h.c
        public void h(boolean z, int i2, int i3, List<m.h0.k.c> list) {
            l.y.c.i.e(list, "headerBlock");
            if (this.b.C0(i2)) {
                this.b.z0(i2, list, z);
                return;
            }
            f fVar = this.b;
            synchronized (fVar) {
                m.h0.k.i iVarQ0 = fVar.q0(i2);
                if (iVarQ0 != null) {
                    s sVar = s.a;
                    iVarQ0.x(m.h0.d.O(list), z);
                    return;
                }
                if (fVar.f2250g) {
                    return;
                }
                if (i2 <= fVar.k0()) {
                    return;
                }
                if (i2 % 2 == fVar.m0() % 2) {
                    return;
                }
                m.h0.k.i iVar = new m.h0.k.i(i2, fVar, false, z, m.h0.d.O(list));
                fVar.F0(i2);
                fVar.r0().put(Integer.valueOf(i2), iVar);
                fVar.f2251h.i().i(new b(fVar.j0() + '[' + i2 + "] onStream", true, fVar, iVar), 0L);
            }
        }

        @Override // m.h0.k.h.c
        public void i(int i2, long j2) {
            Object obj;
            if (i2 == 0) {
                f fVar = this.b;
                synchronized (fVar) {
                    fVar.G = fVar.s0() + j2;
                    fVar.notifyAll();
                    s sVar = s.a;
                    obj = fVar;
                }
            } else {
                m.h0.k.i iVarQ0 = this.b.q0(i2);
                if (iVarQ0 == null) {
                    return;
                }
                synchronized (iVarQ0) {
                    iVarQ0.a(j2);
                    s sVar2 = s.a;
                    obj = iVarQ0;
                }
            }
        }

        @Override // m.h0.k.h.c
        public void j(int i2, int i3, List<m.h0.k.c> list) {
            l.y.c.i.e(list, "requestHeaders");
            this.b.A0(i3, list);
        }

        @Override // m.h0.k.h.c
        public void k(int i2, m.h0.k.b bVar, n.e eVar) {
            int i3;
            Object[] array;
            l.y.c.i.e(bVar, "errorCode");
            l.y.c.i.e(eVar, "debugData");
            eVar.t();
            f fVar = this.b;
            synchronized (fVar) {
                i3 = 0;
                array = fVar.r0().values().toArray(new m.h0.k.i[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                fVar.f2250g = true;
                s sVar = s.a;
            }
            m.h0.k.i[] iVarArr = (m.h0.k.i[]) array;
            int length = iVarArr.length;
            while (i3 < length) {
                m.h0.k.i iVar = iVarArr[i3];
                i3++;
                if (iVar.j() > i2 && iVar.t()) {
                    iVar.y(m.h0.k.b.REFUSED_STREAM);
                    this.b.D0(iVar.j());
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void l(boolean z, m mVar) {
            T t;
            long jC;
            int i2;
            m.h0.k.i[] iVarArr;
            l.y.c.i.e(mVar, "settings");
            l.y.c.l lVar = new l.y.c.l();
            m.h0.k.j jVarU0 = this.b.u0();
            f fVar = this.b;
            synchronized (jVarU0) {
                synchronized (fVar) {
                    m mVarO0 = fVar.o0();
                    if (z) {
                        t = mVar;
                    } else {
                        m mVar2 = new m();
                        mVar2.g(mVarO0);
                        mVar2.g(mVar);
                        t = mVar2;
                    }
                    lVar.a = t;
                    jC = ((long) ((m) t).c()) - ((long) mVarO0.c());
                    i2 = 0;
                    if (jC == 0 || fVar.r0().isEmpty()) {
                        iVarArr = null;
                    } else {
                        Object[] array = fVar.r0().values().toArray(new m.h0.k.i[0]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        }
                        iVarArr = (m.h0.k.i[]) array;
                    }
                    fVar.H0((m) lVar.a);
                    fVar.f2254k.i(new a(l.y.c.i.k(fVar.j0(), " onSettings"), true, fVar, lVar), 0L);
                    s sVar = s.a;
                }
                try {
                    fVar.u0().b((m) lVar.a);
                } catch (IOException e) {
                    fVar.h0(e);
                }
                s sVar2 = s.a;
            }
            if (iVarArr != null) {
                int length = iVarArr.length;
                while (i2 < length) {
                    m.h0.k.i iVar = iVarArr[i2];
                    i2++;
                    synchronized (iVar) {
                        iVar.a(jC);
                        s sVar3 = s.a;
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [m.h0.k.b] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable, m.h0.k.h] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public void m() throws Throwable {
            m.h0.k.b bVar;
            m.h0.k.b bVar2 = m.h0.k.b.INTERNAL_ERROR;
            IOException e = null;
            try {
                try {
                    this.a.f(this);
                    while (this.a.c(false, this)) {
                    }
                    m.h0.k.b bVar3 = m.h0.k.b.NO_ERROR;
                    try {
                        this.b.g0(bVar3, m.h0.k.b.CANCEL, null);
                        bVar = bVar3;
                    } catch (IOException e2) {
                        e = e2;
                        m.h0.k.b bVar4 = m.h0.k.b.PROTOCOL_ERROR;
                        f fVar = this.b;
                        fVar.g0(bVar4, bVar4, e);
                        bVar = fVar;
                    }
                } catch (Throwable th) {
                    th = th;
                    this.b.g0(bVar, bVar2, e);
                    m.h0.d.j(this.a);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (Throwable th2) {
                th = th2;
                bVar = bVar2;
                this.b.g0(bVar, bVar2, e);
                m.h0.d.j(this.a);
                throw th;
            }
            bVar2 = this.a;
            m.h0.d.j(bVar2);
        }
    }

    public static final class e extends m.h0.g.a {
        final /* synthetic */ f e;
        final /* synthetic */ int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ n.b f2264g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f2265h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f2266i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, boolean z, f fVar, int i2, n.b bVar, int i3, boolean z2) {
            super(str, z);
            this.e = fVar;
            this.f = i2;
            this.f2264g = bVar;
            this.f2265h = i3;
            this.f2266i = z2;
        }

        @Override // m.h0.g.a
        public long f() {
            try {
                boolean zD = this.e.f2255l.d(this.f, this.f2264g, this.f2265h, this.f2266i);
                if (zD) {
                    this.e.u0().Y(this.f, m.h0.k.b.CANCEL);
                }
                if (!zD && !this.f2266i) {
                    return -1L;
                }
                synchronized (this.e) {
                    this.e.K.remove(Integer.valueOf(this.f));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* JADX INFO: renamed from: m.h0.k.f$f, reason: collision with other inner class name */
    public static final class C0266f extends m.h0.g.a {
        final /* synthetic */ f e;
        final /* synthetic */ int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f2267g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f2268h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0266f(String str, boolean z, f fVar, int i2, List list, boolean z2) {
            super(str, z);
            this.e = fVar;
            this.f = i2;
            this.f2267g = list;
            this.f2268h = z2;
        }

        @Override // m.h0.g.a
        public long f() {
            boolean zB = this.e.f2255l.b(this.f, this.f2267g, this.f2268h);
            if (zB) {
                try {
                    this.e.u0().Y(this.f, m.h0.k.b.CANCEL);
                } catch (IOException unused) {
                    return -1L;
                }
            }
            if (!zB && !this.f2268h) {
                return -1L;
            }
            synchronized (this.e) {
                this.e.K.remove(Integer.valueOf(this.f));
            }
            return -1L;
        }
    }

    public static final class g extends m.h0.g.a {
        final /* synthetic */ f e;
        final /* synthetic */ int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f2269g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, boolean z, f fVar, int i2, List list) {
            super(str, z);
            this.e = fVar;
            this.f = i2;
            this.f2269g = list;
        }

        @Override // m.h0.g.a
        public long f() {
            if (!this.e.f2255l.a(this.f, this.f2269g)) {
                return -1L;
            }
            try {
                this.e.u0().Y(this.f, m.h0.k.b.CANCEL);
                synchronized (this.e) {
                    this.e.K.remove(Integer.valueOf(this.f));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    public static final class h extends m.h0.g.a {
        final /* synthetic */ f e;
        final /* synthetic */ int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ m.h0.k.b f2270g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z, f fVar, int i2, m.h0.k.b bVar) {
            super(str, z);
            this.e = fVar;
            this.f = i2;
            this.f2270g = bVar;
        }

        @Override // m.h0.g.a
        public long f() {
            this.e.f2255l.c(this.f, this.f2270g);
            synchronized (this.e) {
                this.e.K.remove(Integer.valueOf(this.f));
                s sVar = s.a;
            }
            return -1L;
        }
    }

    public static final class i extends m.h0.g.a {
        final /* synthetic */ f e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, boolean z, f fVar) {
            super(str, z);
            this.e = fVar;
        }

        @Override // m.h0.g.a
        public long f() {
            this.e.O0(false, 2, 0);
            return -1L;
        }
    }

    public static final class j extends m.h0.g.a {
        final /* synthetic */ f e;
        final /* synthetic */ long f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, f fVar, long j2) {
            super(str, false, 2, null);
            this.e = fVar;
            this.f = j2;
        }

        @Override // m.h0.g.a
        public long f() {
            boolean z;
            synchronized (this.e) {
                if (this.e.f2257n < this.e.f2256m) {
                    z = true;
                } else {
                    this.e.f2256m++;
                    z = false;
                }
            }
            f fVar = this.e;
            if (z) {
                fVar.h0(null);
                return -1L;
            }
            fVar.O0(false, 1, 0);
            return this.f;
        }
    }

    public static final class k extends m.h0.g.a {
        final /* synthetic */ f e;
        final /* synthetic */ int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ m.h0.k.b f2271g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, boolean z, f fVar, int i2, m.h0.k.b bVar) {
            super(str, z);
            this.e = fVar;
            this.f = i2;
            this.f2271g = bVar;
        }

        @Override // m.h0.g.a
        public long f() {
            try {
                this.e.P0(this.f, this.f2271g);
                return -1L;
            } catch (IOException e) {
                this.e.h0(e);
                return -1L;
            }
        }
    }

    public static final class l extends m.h0.g.a {
        final /* synthetic */ f e;
        final /* synthetic */ int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f2272g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, boolean z, f fVar, int i2, long j2) {
            super(str, z);
            this.e = fVar;
            this.f = i2;
            this.f2272g = j2;
        }

        @Override // m.h0.g.a
        public long f() {
            try {
                this.e.u0().a0(this.f, this.f2272g);
                return -1L;
            } catch (IOException e) {
                this.e.h0(e);
                return -1L;
            }
        }
    }

    static {
        m mVar = new m();
        mVar.h(7, 65535);
        mVar.h(5, 16384);
        M = mVar;
    }

    public f(a aVar) {
        l.y.c.i.e(aVar, "builder");
        boolean zB = aVar.b();
        this.a = zB;
        this.b = aVar.d();
        this.c = new LinkedHashMap();
        String strC = aVar.c();
        this.d = strC;
        this.f = aVar.b() ? 3 : 2;
        m.h0.g.e eVarJ = aVar.j();
        this.f2251h = eVarJ;
        m.h0.g.d dVarI = eVarJ.i();
        this.f2252i = dVarI;
        this.f2253j = eVarJ.i();
        this.f2254k = eVarJ.i();
        this.f2255l = aVar.f();
        m mVar = new m();
        if (aVar.b()) {
            mVar.h(7, 16777216);
        }
        this.s = mVar;
        m mVar2 = M;
        this.t = mVar2;
        this.G = mVar2.c();
        this.H = aVar.h();
        this.I = new m.h0.k.j(aVar.g(), zB);
        this.J = new d(this, new m.h0.k.h(aVar.i(), zB));
        this.K = new LinkedHashSet();
        if (aVar.e() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(aVar.e());
            dVarI.i(new j(l.y.c.i.k(strC, " ping"), this, nanos), nanos);
        }
    }

    public static /* synthetic */ void K0(f fVar, boolean z, m.h0.g.e eVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            eVar = m.h0.g.e.f2197i;
        }
        fVar.J0(z, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h0(IOException iOException) {
        m.h0.k.b bVar = m.h0.k.b.PROTOCOL_ERROR;
        g0(bVar, bVar, iOException);
    }

    private final m.h0.k.i w0(int i2, List<m.h0.k.c> list, boolean z) {
        int iM0;
        m.h0.k.i iVar;
        boolean z2;
        boolean z3 = !z;
        synchronized (this.I) {
            synchronized (this) {
                if (m0() > 1073741823) {
                    I0(m.h0.k.b.REFUSED_STREAM);
                }
                if (this.f2250g) {
                    throw new m.h0.k.a();
                }
                iM0 = m0();
                G0(m0() + 2);
                iVar = new m.h0.k.i(iM0, this, z3, false, null);
                z2 = !z || t0() >= s0() || iVar.r() >= iVar.q();
                if (iVar.u()) {
                    r0().put(Integer.valueOf(iM0), iVar);
                }
                s sVar = s.a;
            }
            if (i2 == 0) {
                u0().F(z3, iM0, list);
            } else {
                if (!(true ^ i0())) {
                    throw new IllegalArgumentException("client streams shouldn't have associated stream IDs".toString());
                }
                u0().T(i2, iM0, list);
            }
        }
        if (z2) {
            this.I.flush();
        }
        return iVar;
    }

    public final void A0(int i2, List<m.h0.k.c> list) {
        l.y.c.i.e(list, "requestHeaders");
        synchronized (this) {
            if (this.K.contains(Integer.valueOf(i2))) {
                Q0(i2, m.h0.k.b.PROTOCOL_ERROR);
                return;
            }
            this.K.add(Integer.valueOf(i2));
            this.f2253j.i(new g(this.d + '[' + i2 + "] onRequest", true, this, i2, list), 0L);
        }
    }

    public final void B0(int i2, m.h0.k.b bVar) {
        l.y.c.i.e(bVar, "errorCode");
        this.f2253j.i(new h(this.d + '[' + i2 + "] onReset", true, this, i2, bVar), 0L);
    }

    public final boolean C0(int i2) {
        return i2 != 0 && (i2 & 1) == 0;
    }

    public final synchronized m.h0.k.i D0(int i2) {
        m.h0.k.i iVarRemove;
        iVarRemove = this.c.remove(Integer.valueOf(i2));
        notifyAll();
        return iVarRemove;
    }

    public final void E0() {
        synchronized (this) {
            long j2 = this.p;
            long j3 = this.f2258o;
            if (j2 < j3) {
                return;
            }
            this.f2258o = j3 + 1;
            this.r = System.nanoTime() + ((long) 1000000000);
            s sVar = s.a;
            this.f2252i.i(new i(l.y.c.i.k(this.d, " ping"), true, this), 0L);
        }
    }

    public final void F0(int i2) {
        this.e = i2;
    }

    public final void G0(int i2) {
        this.f = i2;
    }

    public final void H0(m mVar) {
        l.y.c.i.e(mVar, "<set-?>");
        this.t = mVar;
    }

    public final void I0(m.h0.k.b bVar) {
        l.y.c.i.e(bVar, "statusCode");
        synchronized (this.I) {
            l.y.c.k kVar = new l.y.c.k();
            synchronized (this) {
                if (this.f2250g) {
                    return;
                }
                this.f2250g = true;
                kVar.a = k0();
                s sVar = s.a;
                u0().u(kVar.a, bVar, m.h0.d.a);
            }
        }
    }

    public final void J0(boolean z, m.h0.g.e eVar) {
        l.y.c.i.e(eVar, "taskRunner");
        if (z) {
            this.I.c();
            this.I.Z(this.s);
            int iC = this.s.c();
            if (iC != 65535) {
                this.I.a0(0, iC - 65535);
            }
        }
        eVar.i().i(new m.h0.g.c(this.d, true, this.J), 0L);
    }

    public final synchronized void L0(long j2) {
        long j3 = this.u + j2;
        this.u = j3;
        long j4 = j3 - this.v;
        if (j4 >= this.s.c() / 2) {
            R0(0, j4);
            this.v += j4;
        }
    }

    public final void M0(int i2, boolean z, n.b bVar, long j2) {
        int iMin;
        long j3;
        if (j2 == 0) {
            this.I.f(z, i2, bVar, 0);
            return;
        }
        while (j2 > 0) {
            synchronized (this) {
                while (t0() >= s0()) {
                    try {
                        if (!r0().containsKey(Integer.valueOf(i2))) {
                            throw new IOException("stream closed");
                        }
                        wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                    throw th;
                }
                iMin = Math.min((int) Math.min(j2, s0() - t0()), u0().O());
                j3 = iMin;
                this.F = t0() + j3;
                s sVar = s.a;
            }
            j2 -= j3;
            this.I.f(z && j2 == 0, i2, bVar, iMin);
        }
    }

    public final void N0(int i2, boolean z, List<m.h0.k.c> list) {
        l.y.c.i.e(list, "alternating");
        this.I.F(z, i2, list);
    }

    public final void O0(boolean z, int i2, int i3) {
        try {
            this.I.Q(z, i2, i3);
        } catch (IOException e2) {
            h0(e2);
        }
    }

    public final void P0(int i2, m.h0.k.b bVar) {
        l.y.c.i.e(bVar, "statusCode");
        this.I.Y(i2, bVar);
    }

    public final void Q0(int i2, m.h0.k.b bVar) {
        l.y.c.i.e(bVar, "errorCode");
        this.f2252i.i(new k(this.d + '[' + i2 + "] writeSynReset", true, this, i2, bVar), 0L);
    }

    public final void R0(int i2, long j2) {
        this.f2252i.i(new l(this.d + '[' + i2 + "] windowUpdate", true, this, i2, j2), 0L);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        g0(m.h0.k.b.NO_ERROR, m.h0.k.b.CANCEL, null);
    }

    public final void flush() {
        this.I.flush();
    }

    public final void g0(m.h0.k.b bVar, m.h0.k.b bVar2, IOException iOException) {
        int i2;
        l.y.c.i.e(bVar, "connectionCode");
        l.y.c.i.e(bVar2, "streamCode");
        if (m.h0.d.f2188g && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        try {
            I0(bVar);
        } catch (IOException unused) {
        }
        Object[] array = null;
        synchronized (this) {
            if (!r0().isEmpty()) {
                array = r0().values().toArray(new m.h0.k.i[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                r0().clear();
            }
            s sVar = s.a;
        }
        m.h0.k.i[] iVarArr = (m.h0.k.i[]) array;
        if (iVarArr != null) {
            for (m.h0.k.i iVar : iVarArr) {
                try {
                    iVar.d(bVar2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            u0().close();
        } catch (IOException unused3) {
        }
        try {
            p0().close();
        } catch (IOException unused4) {
        }
        this.f2252i.o();
        this.f2253j.o();
        this.f2254k.o();
    }

    public final boolean i0() {
        return this.a;
    }

    public final String j0() {
        return this.d;
    }

    public final int k0() {
        return this.e;
    }

    public final c l0() {
        return this.b;
    }

    public final int m0() {
        return this.f;
    }

    public final m n0() {
        return this.s;
    }

    public final m o0() {
        return this.t;
    }

    public final Socket p0() {
        return this.H;
    }

    public final synchronized m.h0.k.i q0(int i2) {
        return this.c.get(Integer.valueOf(i2));
    }

    public final Map<Integer, m.h0.k.i> r0() {
        return this.c;
    }

    public final long s0() {
        return this.G;
    }

    public final long t0() {
        return this.F;
    }

    public final m.h0.k.j u0() {
        return this.I;
    }

    public final synchronized boolean v0(long j2) {
        if (this.f2250g) {
            return false;
        }
        return this.p >= this.f2258o || j2 < this.r;
    }

    public final m.h0.k.i x0(List<m.h0.k.c> list, boolean z) {
        l.y.c.i.e(list, "requestHeaders");
        return w0(0, list, z);
    }

    public final void y0(int i2, n.d dVar, int i3, boolean z) {
        l.y.c.i.e(dVar, "source");
        n.b bVar = new n.b();
        long j2 = i3;
        dVar.P(j2);
        dVar.I(bVar, j2);
        this.f2253j.i(new e(this.d + '[' + i2 + "] onData", true, this, i2, bVar, i3, z), 0L);
    }

    public final void z0(int i2, List<m.h0.k.c> list, boolean z) {
        l.y.c.i.e(list, "requestHeaders");
        this.f2253j.i(new C0266f(this.d + '[' + i2 + "] onHeaders", true, this, i2, list, z), 0L);
    }
}
