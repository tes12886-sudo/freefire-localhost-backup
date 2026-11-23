package j.f.a;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class e<E> {
    public static final e<Integer> c;
    public static final e<Integer> d;
    public static final e<Long> e;
    public static final e<Long> f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e<String> f2142g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e<n.e> f2143h;
    private final j.f.a.a a;
    e<List<E>> b;

    static class a extends e<String> {
        a(j.f.a.a aVar, Class cls) {
            super(aVar, cls);
        }

        @Override // j.f.a.e
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public String c(j.f.a.f fVar) {
            return fVar.k();
        }

        @Override // j.f.a.e
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public void f(j.f.a.g gVar, String str) {
            gVar.i(str);
        }

        @Override // j.f.a.e
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public int j(String str) {
            return j.f.a.g.c(str);
        }
    }

    static class b extends e<n.e> {
        b(j.f.a.a aVar, Class cls) {
            super(aVar, cls);
        }

        @Override // j.f.a.e
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public n.e c(j.f.a.f fVar) {
            return fVar.h();
        }

        @Override // j.f.a.e
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public void f(j.f.a.g gVar, n.e eVar) {
            gVar.f(eVar);
        }

        @Override // j.f.a.e
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public int j(n.e eVar) {
            return eVar.t();
        }
    }

    class c extends e<List<E>> {
        c(j.f.a.a aVar, Class cls) {
            super(aVar, cls);
        }

        @Override // j.f.a.e
        public /* bridge */ /* synthetic */ void f(j.f.a.g gVar, Object obj) {
            o(gVar, (List) obj);
            throw null;
        }

        @Override // j.f.a.e
        public /* bridge */ /* synthetic */ int j(Object obj) {
            q((List) obj);
            throw null;
        }

        @Override // j.f.a.e
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public List<E> c(j.f.a.f fVar) {
            return Collections.singletonList(e.this.c(fVar));
        }

        public void o(j.f.a.g gVar, List<E> list) {
            throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
        }

        @Override // j.f.a.e
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void i(j.f.a.g gVar, int i2, List<E> list) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                e.this.i(gVar, i2, list.get(i3));
            }
        }

        public int q(List<E> list) {
            throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
        }

        @Override // j.f.a.e
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public int k(int i2, List<E> list) {
            int size = list.size();
            int iK = 0;
            for (int i3 = 0; i3 < size; i3++) {
                iK += e.this.k(i2, list.get(i3));
            }
            return iK;
        }
    }

    static class d extends e<Integer> {
        d(j.f.a.a aVar, Class cls) {
            super(aVar, cls);
        }

        @Override // j.f.a.e
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Integer c(j.f.a.f fVar) {
            return Integer.valueOf(fVar.l());
        }

        @Override // j.f.a.e
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public void f(j.f.a.g gVar, Integer num) {
            gVar.k(num.intValue());
        }

        @Override // j.f.a.e
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public int j(Integer num) {
            return j.f.a.g.d(num.intValue());
        }
    }

    /* JADX INFO: renamed from: j.f.a.e$e, reason: collision with other inner class name */
    static class C0252e extends e<Integer> {
        C0252e(j.f.a.a aVar, Class cls) {
            super(aVar, cls);
        }

        @Override // j.f.a.e
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Integer c(j.f.a.f fVar) {
            return Integer.valueOf(fVar.i());
        }

        @Override // j.f.a.e
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public void f(j.f.a.g gVar, Integer num) {
            gVar.g(num.intValue());
        }

        @Override // j.f.a.e
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public int j(Integer num) {
            return 4;
        }
    }

    static class f extends e<Long> {
        f(j.f.a.a aVar, Class cls) {
            super(aVar, cls);
        }

        @Override // j.f.a.e
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Long c(j.f.a.f fVar) {
            return Long.valueOf(fVar.m());
        }

        @Override // j.f.a.e
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public void f(j.f.a.g gVar, Long l2) {
            gVar.l(l2.longValue());
        }

        @Override // j.f.a.e
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public int j(Long l2) {
            return j.f.a.g.e(l2.longValue());
        }
    }

    static class g extends e<Long> {
        g(j.f.a.a aVar, Class cls) {
            super(aVar, cls);
        }

        @Override // j.f.a.e
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Long c(j.f.a.f fVar) {
            return Long.valueOf(fVar.j());
        }

        @Override // j.f.a.e
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public void f(j.f.a.g gVar, Long l2) {
            gVar.h(l2.longValue());
        }

        @Override // j.f.a.e
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public int j(Long l2) {
            return 8;
        }
    }

    static {
        j.f.a.a aVar = j.f.a.a.VARINT;
        c = new d(aVar, Integer.class);
        d = new C0252e(j.f.a.a.FIXED32, Integer.class);
        e = new f(aVar, Long.class);
        f = new g(j.f.a.a.FIXED64, Long.class);
        j.f.a.a aVar2 = j.f.a.a.LENGTH_DELIMITED;
        f2142g = new a(aVar2, String.class);
        f2143h = new b(aVar2, n.e.class);
    }

    public e(j.f.a.a aVar, Class<?> cls) {
        this.a = aVar;
    }

    private e<List<E>> b() {
        return new c(this.a, List.class);
    }

    public static <M> e<M> l(Class<M> cls) {
        try {
            return (e) cls.getField("ADAPTER").get(null);
        } catch (IllegalAccessException | NoSuchFieldException e2) {
            throw new IllegalArgumentException("failed to access " + cls.getName() + "#ADAPTER", e2);
        }
    }

    public final e<List<E>> a() {
        e<List<E>> eVar = this.b;
        if (eVar != null) {
            return eVar;
        }
        e<List<E>> eVarB = b();
        this.b = eVarB;
        return eVarB;
    }

    public abstract E c(j.f.a.f fVar);

    public final E d(n.d dVar) {
        j.f.a.d.a(dVar, "source == null");
        return c(new j.f.a.f(dVar));
    }

    public final E e(byte[] bArr) {
        j.f.a.d.a(bArr, "bytes == null");
        n.b bVar = new n.b();
        bVar.w0(bArr);
        return d(bVar);
    }

    public abstract void f(j.f.a.g gVar, E e2);

    public final void g(n.c cVar, E e2) {
        j.f.a.d.a(e2, "value == null");
        j.f.a.d.a(cVar, "sink == null");
        f(new j.f.a.g(cVar), e2);
    }

    public final byte[] h(E e2) {
        j.f.a.d.a(e2, "value == null");
        n.b bVar = new n.b();
        try {
            g(bVar, e2);
            return bVar.i0();
        } catch (IOException e3) {
            throw new AssertionError(e3);
        }
    }

    public void i(j.f.a.g gVar, int i2, E e2) {
        gVar.j(i2, this.a);
        if (this.a == j.f.a.a.LENGTH_DELIMITED) {
            gVar.k(j(e2));
        }
        f(gVar, e2);
    }

    public abstract int j(E e2);

    public int k(int i2, E e2) {
        int iJ = j(e2);
        if (this.a == j.f.a.a.LENGTH_DELIMITED) {
            iJ += j.f.a.g.d(iJ);
        }
        return iJ + j.f.a.g.b(i2);
    }

    public String m(E e2) {
        return e2.toString();
    }
}
