package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import h.h.l.y;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {
    private static final int r = ViewConfiguration.getTapTimeout();
    final View c;
    private Runnable d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f332g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f333h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f337l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f338m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f339n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f340o;
    private boolean p;
    private boolean q;
    final C0017a a = new C0017a();
    private final Interpolator b = new AccelerateInterpolator();
    private float[] e = {0.0f, 0.0f};
    private float[] f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float[] f334i = {0.0f, 0.0f};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float[] f335j = {0.0f, 0.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float[] f336k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    private static class C0017a {
        private int a;
        private int b;
        private float c;
        private float d;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private float f344j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f345k;
        private long e = Long.MIN_VALUE;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f343i = -1;
        private long f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f341g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f342h = 0;

        C0017a() {
        }

        private float e(long j2) {
            long j3 = this.e;
            if (j2 < j3) {
                return 0.0f;
            }
            long j4 = this.f343i;
            if (j4 < 0 || j2 < j4) {
                return a.e((j2 - j3) / this.a, 0.0f, 1.0f) * 0.5f;
            }
            float f = this.f344j;
            return (1.0f - f) + (f * a.e((j2 - j4) / this.f345k, 0.0f, 1.0f));
        }

        private float g(float f) {
            return ((-4.0f) * f * f) + (f * 4.0f);
        }

        public void a() {
            if (this.f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fG = g(e(jCurrentAnimationTimeMillis));
            long j2 = jCurrentAnimationTimeMillis - this.f;
            this.f = jCurrentAnimationTimeMillis;
            float f = j2 * fG;
            this.f341g = (int) (this.c * f);
            this.f342h = (int) (f * this.d);
        }

        public int b() {
            return this.f341g;
        }

        public int c() {
            return this.f342h;
        }

        public int d() {
            float f = this.c;
            return (int) (f / Math.abs(f));
        }

        public int f() {
            float f = this.d;
            return (int) (f / Math.abs(f));
        }

        public boolean h() {
            return this.f343i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f343i + ((long) this.f345k);
        }

        public void i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f345k = a.f((int) (jCurrentAnimationTimeMillis - this.e), 0, this.b);
            this.f344j = e(jCurrentAnimationTimeMillis);
            this.f343i = jCurrentAnimationTimeMillis;
        }

        public void j(int i2) {
            this.b = i2;
        }

        public void k(int i2) {
            this.a = i2;
        }

        public void l(float f, float f2) {
            this.c = f;
            this.d = f2;
        }

        public void m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.e = jCurrentAnimationTimeMillis;
            this.f343i = -1L;
            this.f = jCurrentAnimationTimeMillis;
            this.f344j = 0.5f;
            this.f341g = 0;
            this.f342h = 0;
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f340o) {
                if (aVar.f338m) {
                    aVar.f338m = false;
                    aVar.a.m();
                }
                C0017a c0017a = a.this.a;
                if (c0017a.h() || !a.this.u()) {
                    a.this.f340o = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f339n) {
                    aVar2.f339n = false;
                    aVar2.c();
                }
                c0017a.a();
                a.this.j(c0017a.b(), c0017a.c());
                y.I(a.this.c, this);
            }
        }
    }

    public a(View view) {
        this.c = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (int) ((1575.0f * f) + 0.5f);
        o(f2, f2);
        float f3 = (int) ((f * 315.0f) + 0.5f);
        p(f3, f3);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(r);
        r(500);
        q(500);
    }

    private float d(int i2, float f, float f2, float f3) {
        float fH = h(this.e[i2], f2, this.f[i2], f);
        if (fH == 0.0f) {
            return 0.0f;
        }
        float f4 = this.f334i[i2];
        float f5 = this.f335j[i2];
        float f6 = this.f336k[i2];
        float f7 = f4 * f3;
        return fH > 0.0f ? e(fH * f7, f5, f6) : -e((-fH) * f7, f5, f6);
    }

    static float e(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    static int f(int i2, int i3, int i4) {
        if (i2 > i4) {
            return i4;
        }
        return i2 < i3 ? i3 : i2;
    }

    private float g(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i2 = this.f332g;
        if (i2 == 0 || i2 == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.f340o && i2 == 1) {
                    return 1.0f;
                }
            }
        } else if (i2 == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    private float h(float f, float f2, float f3, float f4) {
        float interpolation;
        float fE = e(f * f2, 0.0f, f3);
        float fG = g(f2 - f4, fE) - g(f4, fE);
        if (fG < 0.0f) {
            interpolation = -this.b.getInterpolation(-fG);
        } else {
            if (fG <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.b.getInterpolation(fG);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    private void i() {
        if (this.f338m) {
            this.f340o = false;
        } else {
            this.a.i();
        }
    }

    private void v() {
        int i2;
        if (this.d == null) {
            this.d = new b();
        }
        this.f340o = true;
        this.f338m = true;
        if (this.f337l || (i2 = this.f333h) <= 0) {
            this.d.run();
        } else {
            y.J(this.c, this.d, i2);
        }
        this.f337l = true;
    }

    public abstract boolean a(int i2);

    public abstract boolean b(int i2);

    void c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.c.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public abstract void j(int i2, int i3);

    public a k(int i2) {
        this.f333h = i2;
        return this;
    }

    public a l(int i2) {
        this.f332g = i2;
        return this;
    }

    public a m(boolean z) {
        if (this.p && !z) {
            i();
        }
        this.p = z;
        return this;
    }

    public a n(float f, float f2) {
        float[] fArr = this.f;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    public a o(float f, float f2) {
        float[] fArr = this.f336k;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.p) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                i();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    i();
                }
            }
            return this.q && this.f340o;
        }
        this.f339n = true;
        this.f337l = false;
        this.a.l(d(0, motionEvent.getX(), view.getWidth(), this.c.getWidth()), d(1, motionEvent.getY(), view.getHeight(), this.c.getHeight()));
        if (!this.f340o && u()) {
            v();
        }
        if (this.q) {
            return false;
        }
    }

    public a p(float f, float f2) {
        float[] fArr = this.f335j;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    public a q(int i2) {
        this.a.j(i2);
        return this;
    }

    public a r(int i2) {
        this.a.k(i2);
        return this;
    }

    public a s(float f, float f2) {
        float[] fArr = this.e;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    public a t(float f, float f2) {
        float[] fArr = this.f334i;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    boolean u() {
        C0017a c0017a = this.a;
        int iF = c0017a.f();
        int iD = c0017a.d();
        return (iF != 0 && b(iF)) || (iD != 0 && a(iD));
    }
}
