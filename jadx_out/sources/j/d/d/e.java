package j.d.d;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final String f2052m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final j.d.d.d f2053n = j.d.d.c.a;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final v f2054o = u.a;
    static final v p = u.b;
    private static final j.d.d.a0.a<?> q = j.d.d.a0.a.get(Object.class);
    private final ThreadLocal<Map<j.d.d.a0.a<?>, f<?>>> a;
    private final Map<j.d.d.a0.a<?>, w<?>> b;
    private final j.d.d.z.c c;
    private final j.d.d.z.n.e d;
    final List<x> e;
    final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final boolean f2055g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final boolean f2056h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f2057i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final boolean f2058j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final List<x> f2059k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final List<x> f2060l;

    class a extends w<Number> {
        a(e eVar) {
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Double b(j.d.d.b0.a aVar) {
            if (aVar.n0() != j.d.d.b0.b.NULL) {
                return Double.valueOf(aVar.e0());
            }
            aVar.j0();
            return null;
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(j.d.d.b0.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.b0();
            } else {
                e.d(number.doubleValue());
                cVar.n0(number);
            }
        }
    }

    class b extends w<Number> {
        b(e eVar) {
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Float b(j.d.d.b0.a aVar) {
            if (aVar.n0() != j.d.d.b0.b.NULL) {
                return Float.valueOf((float) aVar.e0());
            }
            aVar.j0();
            return null;
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(j.d.d.b0.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.b0();
            } else {
                e.d(number.floatValue());
                cVar.n0(number);
            }
        }
    }

    class c extends w<Number> {
        c() {
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(j.d.d.b0.a aVar) {
            if (aVar.n0() != j.d.d.b0.b.NULL) {
                return Long.valueOf(aVar.g0());
            }
            aVar.j0();
            return null;
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(j.d.d.b0.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.b0();
            } else {
                cVar.o0(number.toString());
            }
        }
    }

    class d extends w<AtomicLong> {
        final /* synthetic */ w a;

        d(w wVar) {
            this.a = wVar;
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicLong b(j.d.d.b0.a aVar) {
            return new AtomicLong(((Number) this.a.b(aVar)).longValue());
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(j.d.d.b0.c cVar, AtomicLong atomicLong) {
            this.a.d(cVar, Long.valueOf(atomicLong.get()));
        }
    }

    /* JADX INFO: renamed from: j.d.d.e$e, reason: collision with other inner class name */
    class C0239e extends w<AtomicLongArray> {
        final /* synthetic */ w a;

        C0239e(w wVar) {
            this.a = wVar;
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicLongArray b(j.d.d.b0.a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.b();
            while (aVar.Z()) {
                arrayList.add(Long.valueOf(((Number) this.a.b(aVar)).longValue()));
            }
            aVar.u();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i2 = 0; i2 < size; i2++) {
                atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
            }
            return atomicLongArray;
        }

        @Override // j.d.d.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(j.d.d.b0.c cVar, AtomicLongArray atomicLongArray) throws IOException {
            cVar.f();
            int length = atomicLongArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                this.a.d(cVar, Long.valueOf(atomicLongArray.get(i2)));
            }
            cVar.u();
        }
    }

    static class f<T> extends w<T> {
        private w<T> a;

        f() {
        }

        @Override // j.d.d.w
        public T b(j.d.d.b0.a aVar) {
            w<T> wVar = this.a;
            if (wVar != null) {
                return wVar.b(aVar);
            }
            throw new IllegalStateException();
        }

        @Override // j.d.d.w
        public void d(j.d.d.b0.c cVar, T t) {
            w<T> wVar = this.a;
            if (wVar == null) {
                throw new IllegalStateException();
            }
            wVar.d(cVar, t);
        }

        public void e(w<T> wVar) {
            if (this.a != null) {
                throw new AssertionError();
            }
            this.a = wVar;
        }
    }

    public e() {
        this(j.d.d.z.d.f2070g, f2053n, Collections.emptyMap(), false, false, false, true, false, false, false, true, t.a, f2052m, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), f2054o, p);
    }

    e(j.d.d.z.d dVar, j.d.d.d dVar2, Map<Type, g<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, t tVar, String str, int i2, int i3, List<x> list, List<x> list2, List<x> list3, v vVar, v vVar2) {
        this.a = new ThreadLocal<>();
        this.b = new ConcurrentHashMap();
        j.d.d.z.c cVar = new j.d.d.z.c(map, z8);
        this.c = cVar;
        this.f = z;
        this.f2055g = z3;
        this.f2056h = z4;
        this.f2057i = z5;
        this.f2058j = z6;
        this.f2059k = list;
        this.f2060l = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(j.d.d.z.n.n.W);
        arrayList.add(j.d.d.z.n.j.e(vVar));
        arrayList.add(dVar);
        arrayList.addAll(list3);
        arrayList.add(j.d.d.z.n.n.C);
        arrayList.add(j.d.d.z.n.n.f2088m);
        arrayList.add(j.d.d.z.n.n.f2082g);
        arrayList.add(j.d.d.z.n.n.f2084i);
        arrayList.add(j.d.d.z.n.n.f2086k);
        w<Number> wVarP = p(tVar);
        arrayList.add(j.d.d.z.n.n.c(Long.TYPE, Long.class, wVarP));
        arrayList.add(j.d.d.z.n.n.c(Double.TYPE, Double.class, e(z7)));
        arrayList.add(j.d.d.z.n.n.c(Float.TYPE, Float.class, f(z7)));
        arrayList.add(j.d.d.z.n.i.e(vVar2));
        arrayList.add(j.d.d.z.n.n.f2090o);
        arrayList.add(j.d.d.z.n.n.q);
        arrayList.add(j.d.d.z.n.n.b(AtomicLong.class, b(wVarP)));
        arrayList.add(j.d.d.z.n.n.b(AtomicLongArray.class, c(wVarP)));
        arrayList.add(j.d.d.z.n.n.s);
        arrayList.add(j.d.d.z.n.n.x);
        arrayList.add(j.d.d.z.n.n.E);
        arrayList.add(j.d.d.z.n.n.G);
        arrayList.add(j.d.d.z.n.n.b(BigDecimal.class, j.d.d.z.n.n.z));
        arrayList.add(j.d.d.z.n.n.b(BigInteger.class, j.d.d.z.n.n.A));
        arrayList.add(j.d.d.z.n.n.b(j.d.d.z.g.class, j.d.d.z.n.n.B));
        arrayList.add(j.d.d.z.n.n.I);
        arrayList.add(j.d.d.z.n.n.K);
        arrayList.add(j.d.d.z.n.n.O);
        arrayList.add(j.d.d.z.n.n.Q);
        arrayList.add(j.d.d.z.n.n.U);
        arrayList.add(j.d.d.z.n.n.M);
        arrayList.add(j.d.d.z.n.n.d);
        arrayList.add(j.d.d.z.n.c.b);
        arrayList.add(j.d.d.z.n.n.S);
        if (j.d.d.z.p.d.a) {
            arrayList.add(j.d.d.z.p.d.e);
            arrayList.add(j.d.d.z.p.d.d);
            arrayList.add(j.d.d.z.p.d.f);
        }
        arrayList.add(j.d.d.z.n.a.c);
        arrayList.add(j.d.d.z.n.n.b);
        arrayList.add(new j.d.d.z.n.b(cVar));
        arrayList.add(new j.d.d.z.n.h(cVar, z2));
        j.d.d.z.n.e eVar = new j.d.d.z.n.e(cVar);
        this.d = eVar;
        arrayList.add(eVar);
        arrayList.add(j.d.d.z.n.n.X);
        arrayList.add(new j.d.d.z.n.k(cVar, dVar2, dVar, eVar));
        this.e = Collections.unmodifiableList(arrayList);
    }

    private static void a(Object obj, j.d.d.b0.a aVar) {
        if (obj != null) {
            try {
                if (aVar.n0() == j.d.d.b0.b.END_DOCUMENT) {
                } else {
                    throw new l("JSON document was not fully consumed.");
                }
            } catch (j.d.d.b0.d e) {
                throw new s(e);
            } catch (IOException e2) {
                throw new l(e2);
            }
        }
    }

    private static w<AtomicLong> b(w<Number> wVar) {
        return new d(wVar).a();
    }

    private static w<AtomicLongArray> c(w<Number> wVar) {
        return new C0239e(wVar).a();
    }

    static void d(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private w<Number> e(boolean z) {
        return z ? j.d.d.z.n.n.v : new a(this);
    }

    private w<Number> f(boolean z) {
        return z ? j.d.d.z.n.n.u : new b(this);
    }

    private static w<Number> p(t tVar) {
        return tVar == t.a ? j.d.d.z.n.n.t : new c();
    }

    public k A(Object obj, Type type) {
        j.d.d.z.n.g gVar = new j.d.d.z.n.g();
        x(obj, type, gVar);
        return gVar.r0();
    }

    public <T> T g(k kVar, Class<T> cls) {
        return (T) j.d.d.z.k.b(cls).cast(h(kVar, cls));
    }

    public <T> T h(k kVar, Type type) {
        if (kVar == null) {
            return null;
        }
        return (T) i(new j.d.d.z.n.f(kVar), type);
    }

    public <T> T i(j.d.d.b0.a aVar, Type type) {
        boolean zA0 = aVar.a0();
        boolean z = true;
        aVar.s0(true);
        try {
            try {
                try {
                    aVar.n0();
                    z = false;
                    T tB = m(j.d.d.a0.a.get(type)).b(aVar);
                    aVar.s0(zA0);
                    return tB;
                } catch (AssertionError e) {
                    AssertionError assertionError = new AssertionError("AssertionError (GSON 2.9.0): " + e.getMessage());
                    assertionError.initCause(e);
                    throw assertionError;
                } catch (IllegalStateException e2) {
                    throw new s(e2);
                }
            } catch (EOFException e3) {
                if (!z) {
                    throw new s(e3);
                }
                aVar.s0(zA0);
                return null;
            } catch (IOException e4) {
                throw new s(e4);
            }
        } catch (Throwable th) {
            aVar.s0(zA0);
            throw th;
        }
    }

    public <T> T j(Reader reader, Type type) {
        j.d.d.b0.a aVarQ = q(reader);
        T t = (T) i(aVarQ, type);
        a(t, aVarQ);
        return t;
    }

    public <T> T k(String str, Class<T> cls) {
        return (T) j.d.d.z.k.b(cls).cast(l(str, cls));
    }

    public <T> T l(String str, Type type) {
        if (str == null) {
            return null;
        }
        return (T) j(new StringReader(str), type);
    }

    public <T> w<T> m(j.d.d.a0.a<T> aVar) {
        w<T> wVar = (w) this.b.get(aVar == null ? q : aVar);
        if (wVar != null) {
            return wVar;
        }
        Map<j.d.d.a0.a<?>, f<?>> map = this.a.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap<>();
            this.a.set(map);
            z = true;
        }
        f<?> fVar = map.get(aVar);
        if (fVar != null) {
            return fVar;
        }
        try {
            f<?> fVar2 = new f<>();
            map.put(aVar, fVar2);
            Iterator<x> it = this.e.iterator();
            while (it.hasNext()) {
                w<T> wVarA = it.next().a(this, aVar);
                if (wVarA != null) {
                    fVar2.e(wVarA);
                    this.b.put(aVar, wVarA);
                    map.remove(aVar);
                    if (z) {
                        this.a.remove();
                    }
                    return wVarA;
                }
            }
            throw new IllegalArgumentException("GSON (2.9.0) cannot handle " + aVar);
        } catch (Throwable th) {
            map.remove(aVar);
            if (z) {
                this.a.remove();
            }
            throw th;
        }
    }

    public <T> w<T> n(Class<T> cls) {
        return m(j.d.d.a0.a.get((Class) cls));
    }

    public <T> w<T> o(x xVar, j.d.d.a0.a<T> aVar) {
        if (!this.e.contains(xVar)) {
            xVar = this.d;
        }
        boolean z = false;
        for (x xVar2 : this.e) {
            if (z) {
                w<T> wVarA = xVar2.a(this, aVar);
                if (wVarA != null) {
                    return wVarA;
                }
            } else if (xVar2 == xVar) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public j.d.d.b0.a q(Reader reader) {
        j.d.d.b0.a aVar = new j.d.d.b0.a(reader);
        aVar.s0(this.f2058j);
        return aVar;
    }

    public j.d.d.b0.c r(Writer writer) throws IOException {
        if (this.f2055g) {
            writer.write(")]}'\n");
        }
        j.d.d.b0.c cVar = new j.d.d.b0.c(writer);
        if (this.f2057i) {
            cVar.h0("  ");
        }
        cVar.g0(this.f2056h);
        cVar.i0(this.f2058j);
        cVar.j0(this.f);
        return cVar;
    }

    public String s(k kVar) {
        StringWriter stringWriter = new StringWriter();
        w(kVar, stringWriter);
        return stringWriter.toString();
    }

    public String t(Object obj) {
        return obj == null ? s(m.a) : u(obj, obj.getClass());
    }

    public String toString() {
        return "{serializeNulls:" + this.f + ",factories:" + this.e + ",instanceCreators:" + this.c + "}";
    }

    public String u(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        y(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public void v(k kVar, j.d.d.b0.c cVar) {
        boolean zT = cVar.T();
        cVar.i0(true);
        boolean zQ = cVar.Q();
        cVar.g0(this.f2056h);
        boolean zO = cVar.O();
        cVar.j0(this.f);
        try {
            try {
                j.d.d.z.l.b(kVar, cVar);
                cVar.i0(zT);
                cVar.g0(zQ);
                cVar.j0(zO);
            } catch (IOException e) {
                throw new l(e);
            } catch (AssertionError e2) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.9.0): " + e2.getMessage());
                assertionError.initCause(e2);
                throw assertionError;
            }
        } catch (Throwable th) {
            cVar.i0(zT);
            cVar.g0(zQ);
            cVar.j0(zO);
            throw th;
        }
    }

    public void w(k kVar, Appendable appendable) {
        try {
            v(kVar, r(j.d.d.z.l.c(appendable)));
        } catch (IOException e) {
            throw new l(e);
        }
    }

    public void x(Object obj, Type type, j.d.d.b0.c cVar) {
        w wVarM = m(j.d.d.a0.a.get(type));
        boolean zT = cVar.T();
        cVar.i0(true);
        boolean zQ = cVar.Q();
        cVar.g0(this.f2056h);
        boolean zO = cVar.O();
        cVar.j0(this.f);
        try {
            try {
                wVarM.d(cVar, obj);
                cVar.i0(zT);
                cVar.g0(zQ);
                cVar.j0(zO);
            } catch (IOException e) {
                throw new l(e);
            } catch (AssertionError e2) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.9.0): " + e2.getMessage());
                assertionError.initCause(e2);
                throw assertionError;
            }
        } catch (Throwable th) {
            cVar.i0(zT);
            cVar.g0(zQ);
            cVar.j0(zO);
            throw th;
        }
    }

    public void y(Object obj, Type type, Appendable appendable) {
        try {
            x(obj, type, r(j.d.d.z.l.c(appendable)));
        } catch (IOException e) {
            throw new l(e);
        }
    }

    public k z(Object obj) {
        return obj == null ? m.a : A(obj, obj.getClass());
    }
}
