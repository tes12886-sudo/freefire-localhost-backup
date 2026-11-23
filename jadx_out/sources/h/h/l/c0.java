package h.h.l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {
    private WeakReference<View> a;
    Runnable b = null;
    Runnable c = null;
    int d = -1;

    class a extends AnimatorListenerAdapter {
        final /* synthetic */ d0 a;
        final /* synthetic */ View b;

        a(c0 c0Var, d0 d0Var, View view) {
            this.a = d0Var;
            this.b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a.a(this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.b(this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.a.c(this.b);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ f0 a;
        final /* synthetic */ View b;

        b(c0 c0Var, f0 f0Var, View view) {
            this.a = f0Var;
            this.b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.a.a(this.b);
        }
    }

    static class c implements d0 {
        c0 a;
        boolean b;

        c(c0 c0Var) {
            this.a = c0Var;
        }

        @Override // h.h.l.d0
        public void a(View view) {
            Object tag = view.getTag(2113929216);
            d0 d0Var = tag instanceof d0 ? (d0) tag : null;
            if (d0Var != null) {
                d0Var.a(view);
            }
        }

        @Override // h.h.l.d0
        @SuppressLint({"WrongConstant"})
        public void b(View view) {
            int i2 = this.a.d;
            if (i2 > -1) {
                view.setLayerType(i2, null);
                this.a.d = -1;
            }
            if (Build.VERSION.SDK_INT >= 16 || !this.b) {
                c0 c0Var = this.a;
                Runnable runnable = c0Var.c;
                if (runnable != null) {
                    c0Var.c = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                d0 d0Var = tag instanceof d0 ? (d0) tag : null;
                if (d0Var != null) {
                    d0Var.b(view);
                }
                this.b = true;
            }
        }

        @Override // h.h.l.d0
        public void c(View view) {
            this.b = false;
            if (this.a.d > -1) {
                view.setLayerType(2, null);
            }
            c0 c0Var = this.a;
            Runnable runnable = c0Var.b;
            if (runnable != null) {
                c0Var.b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            d0 d0Var = tag instanceof d0 ? (d0) tag : null;
            if (d0Var != null) {
                d0Var.c(view);
            }
        }
    }

    c0(View view) {
        this.a = new WeakReference<>(view);
    }

    private void g(View view, d0 d0Var) {
        if (d0Var != null) {
            view.animate().setListener(new a(this, d0Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public c0 a(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public void b() {
        View view = this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long c() {
        View view = this.a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public c0 d(long j2) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
        return this;
    }

    public c0 e(Interpolator interpolator) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public c0 f(d0 d0Var) {
        View view = this.a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT < 16) {
                view.setTag(2113929216, d0Var);
                d0Var = new c(this);
            }
            g(view, d0Var);
        }
        return this;
    }

    public c0 h(long j2) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setStartDelay(j2);
        }
        return this;
    }

    public c0 i(f0 f0Var) {
        View view = this.a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            view.animate().setUpdateListener(f0Var != null ? new b(this, f0Var, view) : null);
        }
        return this;
    }

    public void j() {
        View view = this.a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public c0 k(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
