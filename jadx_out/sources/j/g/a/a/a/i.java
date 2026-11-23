package j.g.a.a.a;

import j.g.a.a.a.k;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class i<T extends k> implements l<T> {
    private final j.g.a.a.a.y.k.a a;
    private final j.g.a.a.a.y.k.d<T> b;
    private final ConcurrentHashMap<Long, T> c;
    private final ConcurrentHashMap<Long, j.g.a.a.a.y.k.c<T>> d;
    private final j.g.a.a.a.y.k.c<T> e;
    private final AtomicReference<T> f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f2147g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f2148h;

    public i(j.g.a.a.a.y.k.a aVar, j.g.a.a.a.y.k.d<T> dVar, String str, String str2) {
        this(aVar, dVar, new ConcurrentHashMap(1), new ConcurrentHashMap(1), new j.g.a.a.a.y.k.c(aVar, dVar, str), str2);
    }

    i(j.g.a.a.a.y.k.a aVar, j.g.a.a.a.y.k.d<T> dVar, ConcurrentHashMap<Long, T> concurrentHashMap, ConcurrentHashMap<Long, j.g.a.a.a.y.k.c<T>> concurrentHashMap2, j.g.a.a.a.y.k.c<T> cVar, String str) {
        this.f2148h = true;
        this.a = aVar;
        this.b = dVar;
        this.c = concurrentHashMap;
        this.d = concurrentHashMap2;
        this.e = cVar;
        this.f = new AtomicReference<>();
        this.f2147g = str;
    }

    private void e(long j2, T t, boolean z) {
        this.c.put(Long.valueOf(j2), t);
        j.g.a.a.a.y.k.c<T> cVar = this.d.get(Long.valueOf(j2));
        if (cVar == null) {
            cVar = new j.g.a.a.a.y.k.c<>(this.a, this.b, d(j2));
            this.d.putIfAbsent(Long.valueOf(j2), cVar);
        }
        cVar.b(t);
        T t2 = this.f.get();
        if (t2 == null || t2.b() == j2 || z) {
            synchronized (this) {
                this.f.compareAndSet(t2, t);
                this.e.b(t);
            }
        }
    }

    private void g() {
        T tA = this.e.a();
        if (tA != null) {
            e(tA.b(), tA, false);
        }
    }

    private synchronized void h() {
        if (this.f2148h) {
            g();
            j();
            this.f2148h = false;
        }
    }

    private void j() {
        T tA;
        for (Map.Entry<String, ?> entry : this.a.get().getAll().entrySet()) {
            if (f(entry.getKey()) && (tA = this.b.a((String) entry.getValue())) != null) {
                e(tA.b(), tA, false);
            }
        }
    }

    @Override // j.g.a.a.a.l
    public void a(T t) {
        if (t == null) {
            throw new IllegalArgumentException("Session must not be null!");
        }
        i();
        e(t.b(), t, true);
    }

    @Override // j.g.a.a.a.l
    public Map<Long, T> b() {
        i();
        return Collections.unmodifiableMap(this.c);
    }

    @Override // j.g.a.a.a.l
    public T c() {
        i();
        return this.f.get();
    }

    String d(long j2) {
        return this.f2147g + "_" + j2;
    }

    boolean f(String str) {
        return str.startsWith(this.f2147g);
    }

    void i() {
        if (this.f2148h) {
            h();
        }
    }
}
