package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes.dex */
class f {

    class a implements h.h.h.b.a {
        final /* synthetic */ Fragment a;

        a(Fragment fragment) {
            this.a = fragment;
        }

        @Override // h.h.h.b.a
        public void a() {
            if (this.a.p() != null) {
                View viewP = this.a.p();
                this.a.v1(null);
                viewP.clearAnimation();
            }
            this.a.x1(null);
        }
    }

    class b implements Animation.AnimationListener {
        final /* synthetic */ ViewGroup a;
        final /* synthetic */ Fragment b;
        final /* synthetic */ x.g c;
        final /* synthetic */ h.h.h.b d;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.b.p() != null) {
                    b.this.b.v1(null);
                    b bVar = b.this;
                    bVar.c.a(bVar.b, bVar.d);
                }
            }
        }

        b(ViewGroup viewGroup, Fragment fragment, x.g gVar, h.h.h.b bVar) {
            this.a = viewGroup;
            this.b = fragment;
            this.c = gVar;
            this.d = bVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class c extends AnimatorListenerAdapter {
        final /* synthetic */ ViewGroup a;
        final /* synthetic */ View b;
        final /* synthetic */ Fragment c;
        final /* synthetic */ x.g d;
        final /* synthetic */ h.h.h.b e;

        c(ViewGroup viewGroup, View view, Fragment fragment, x.g gVar, h.h.h.b bVar) {
            this.a = viewGroup;
            this.b = view;
            this.c = fragment;
            this.d = gVar;
            this.e = bVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.endViewTransition(this.b);
            Animator animatorQ = this.c.q();
            this.c.x1(null);
            if (animatorQ == null || this.a.indexOfChild(this.b) >= 0) {
                return;
            }
            this.d.a(this.c, this.e);
        }
    }

    static class d {
        public final Animation a;
        public final Animator b;

        d(Animator animator) {
            this.a = null;
            this.b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        d(Animation animation) {
            this.a = animation;
            this.b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    static class e extends AnimationSet implements Runnable {
        private final ViewGroup a;
        private final View b;
        private boolean c;
        private boolean d;
        private boolean e;

        e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.e = true;
            this.a = viewGroup;
            this.b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j2, Transformation transformation) {
            this.e = true;
            if (this.c) {
                return !this.d;
            }
            if (!super.getTransformation(j2, transformation)) {
                this.c = true;
                h.h.l.w.a(this.a, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j2, Transformation transformation, float f) {
            this.e = true;
            if (this.c) {
                return !this.d;
            }
            if (!super.getTransformation(j2, transformation, f)) {
                this.c = true;
                h.h.l.w.a(this.a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.c || !this.e) {
                this.a.endViewTransition(this.b);
                this.d = true;
            } else {
                this.e = false;
                this.a.post(this);
            }
        }
    }

    static void a(Fragment fragment, d dVar, x.g gVar) {
        View view = fragment.Q;
        ViewGroup viewGroup = fragment.P;
        viewGroup.startViewTransition(view);
        h.h.h.b bVar = new h.h.h.b();
        bVar.c(new a(fragment));
        gVar.b(fragment, bVar);
        if (dVar.a != null) {
            e eVar = new e(dVar.a, viewGroup, view);
            fragment.v1(fragment.Q);
            eVar.setAnimationListener(new b(viewGroup, fragment, gVar, bVar));
            fragment.Q.startAnimation(eVar);
            return;
        }
        Animator animator = dVar.b;
        fragment.x1(animator);
        animator.addListener(new c(viewGroup, view, fragment, gVar, bVar));
        animator.setTarget(fragment.Q);
        animator.start();
    }

    private static int b(Fragment fragment, boolean z, boolean z2) {
        if (z2) {
            return z ? fragment.I() : fragment.J();
        }
        return z ? fragment.t() : fragment.w();
    }

    static d c(Context context, Fragment fragment, boolean z, boolean z2) {
        int iE = fragment.E();
        int iB = b(fragment, z, z2);
        boolean z3 = false;
        fragment.w1(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.P;
        if (viewGroup != null) {
            int i2 = h.m.b.c;
            if (viewGroup.getTag(i2) != null) {
                fragment.P.setTag(i2, null);
            }
        }
        ViewGroup viewGroup2 = fragment.P;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationR0 = fragment.r0(iE, z, iB);
        if (animationR0 != null) {
            return new d(animationR0);
        }
        Animator animatorS0 = fragment.s0(iE, z, iB);
        if (animatorS0 != null) {
            return new d(animatorS0);
        }
        if (iB == 0 && iE != 0) {
            iB = d(iE, z);
        }
        if (iB != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iB));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, iB);
                    if (animationLoadAnimation != null) {
                        return new d(animationLoadAnimation);
                    }
                    z3 = true;
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                }
            }
            if (!z3) {
                try {
                    Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iB);
                    if (animatorLoadAnimator != null) {
                        return new d(animatorLoadAnimator);
                    }
                } catch (RuntimeException e3) {
                    if (zEquals) {
                        throw e3;
                    }
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iB);
                    if (animationLoadAnimation2 != null) {
                        return new d(animationLoadAnimation2);
                    }
                }
            }
        }
        return null;
    }

    private static int d(int i2, boolean z) {
        if (i2 == 4097) {
            return z ? h.m.a.e : h.m.a.f;
        }
        if (i2 == 4099) {
            return z ? h.m.a.c : h.m.a.d;
        }
        if (i2 != 8194) {
            return -1;
        }
        return z ? h.m.a.a : h.m.a.b;
    }
}
