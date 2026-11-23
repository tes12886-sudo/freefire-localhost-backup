package j.g.a.a.a;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class u {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    static volatile u f2150g;
    l<x> a;
    l<e> b;
    j.g.a.a.a.y.d<x> c;
    private final p d;
    private final Context e;
    private volatile f f;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            u.f2150g.b();
        }
    }

    u(p pVar) {
        this(pVar, new ConcurrentHashMap(), null);
    }

    u(p pVar, ConcurrentHashMap<k, n> concurrentHashMap, n nVar) {
        this.d = pVar;
        Context contextD = m.f().d(e());
        this.e = contextD;
        this.a = new i(new j.g.a.a.a.y.k.b(contextD, "session_store"), new x.a(), "active_twittersession", "twittersession");
        this.b = new i(new j.g.a.a.a.y.k.b(contextD, "session_store"), new e.a(), "active_guestsession", "guestsession");
        this.c = new j.g.a.a.a.y.d<>(this.a, m.f().e(), new j.g.a.a.a.y.h());
    }

    private synchronized void a() {
        if (this.f == null) {
            this.f = new f(new j.g.a.a.a.y.j.e(this, new j.g.a.a.a.y.g()), this.b);
        }
    }

    public static u f() {
        if (f2150g == null) {
            synchronized (u.class) {
                if (f2150g == null) {
                    f2150g = new u(m.f().h());
                    m.f().e().execute(new a());
                }
            }
        }
        return f2150g;
    }

    void b() {
        this.a.c();
        this.b.c();
        d();
        this.c.a(m.f().c());
    }

    public p c() {
        return this.d;
    }

    public f d() {
        if (this.f == null) {
            a();
        }
        return this.f;
    }

    public String e() {
        return "com.twitter.sdk.android:twitter-core";
    }

    public l<x> g() {
        return this.a;
    }

    public String h() {
        return "4.0.19P2";
    }
}
