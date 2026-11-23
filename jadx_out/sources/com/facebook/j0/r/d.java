package com.facebook.j0.r;

import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import l.y.c.i;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    public static final class a implements View.OnTouchListener {
        private final com.facebook.j0.r.g.a a;
        private final WeakReference<View> b;
        private final WeakReference<View> c;
        private final View.OnTouchListener d;
        private boolean e;

        public a(com.facebook.j0.r.g.a aVar, View view, View view2) {
            i.e(aVar, "mapping");
            i.e(view, "rootView");
            i.e(view2, "hostView");
            this.a = aVar;
            this.b = new WeakReference<>(view2);
            this.c = new WeakReference<>(view);
            this.d = com.facebook.j0.r.g.f.h(view2);
            this.e = true;
        }

        public final boolean a() {
            return this.e;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            i.e(view, "view");
            i.e(motionEvent, "motionEvent");
            View view2 = this.c.get();
            View view3 = this.b.get();
            if (view2 != null && view3 != null && motionEvent.getAction() == 1) {
                com.facebook.j0.r.a.c(this.a, view2, view3);
            }
            View.OnTouchListener onTouchListener = this.d;
            return onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
        }
    }

    private d() {
    }

    public static final a a(com.facebook.j0.r.g.a aVar, View view, View view2) {
        if (com.facebook.internal.m0.i.a.d(d.class)) {
            return null;
        }
        try {
            i.e(aVar, "mapping");
            i.e(view, "rootView");
            i.e(view2, "hostView");
            return new a(aVar, view, view2);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, d.class);
            return null;
        }
    }
}
