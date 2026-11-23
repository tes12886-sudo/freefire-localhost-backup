package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public class s implements k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final s f448i = new s();
    private Handler e;
    private int a = 0;
    private int b = 0;
    private boolean c = true;
    private boolean d = true;
    private final l f = new l(this);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Runnable f449g = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    t.a f450h = new b();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s.this.i();
            s.this.j();
        }
    }

    class b implements t.a {
        b() {
        }

        @Override // androidx.lifecycle.t.a
        public void a() {
        }

        @Override // androidx.lifecycle.t.a
        public void b() {
            s.this.e();
        }

        @Override // androidx.lifecycle.t.a
        public void c() {
            s.this.f();
        }
    }

    class c extends d {

        class a extends d {
            a() {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                s.this.e();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                s.this.f();
            }
        }

        c() {
        }

        @Override // androidx.lifecycle.d, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT < 29) {
                t.f(activity).h(s.this.f450h);
            }
        }

        @Override // androidx.lifecycle.d, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            s.this.b();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // androidx.lifecycle.d, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            s.this.g();
        }
    }

    private s() {
    }

    public static k k() {
        return f448i;
    }

    static void l(Context context) {
        f448i.h(context);
    }

    @Override // androidx.lifecycle.k
    public g a() {
        return this.f;
    }

    void b() {
        int i2 = this.b - 1;
        this.b = i2;
        if (i2 == 0) {
            this.e.postDelayed(this.f449g, 700L);
        }
    }

    void e() {
        int i2 = this.b + 1;
        this.b = i2;
        if (i2 == 1) {
            if (!this.c) {
                this.e.removeCallbacks(this.f449g);
            } else {
                this.f.h(g.b.ON_RESUME);
                this.c = false;
            }
        }
    }

    void f() {
        int i2 = this.a + 1;
        this.a = i2;
        if (i2 == 1 && this.d) {
            this.f.h(g.b.ON_START);
            this.d = false;
        }
    }

    void g() {
        this.a--;
        j();
    }

    void h(Context context) {
        this.e = new Handler();
        this.f.h(g.b.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new c());
    }

    void i() {
        if (this.b == 0) {
            this.c = true;
            this.f.h(g.b.ON_PAUSE);
        }
    }

    void j() {
        if (this.a == 0 && this.c) {
            this.f.h(g.b.ON_STOP);
            this.d = true;
        }
    }
}
