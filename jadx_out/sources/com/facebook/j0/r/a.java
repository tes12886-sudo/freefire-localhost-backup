package com.facebook.j0.r;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.facebook.j0.g;
import com.facebook.r;
import java.lang.ref.WeakReference;
import l.y.c.i;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final a a = new a();

    /* JADX INFO: renamed from: com.facebook.j0.r.a$a, reason: collision with other inner class name */
    public static final class ViewOnClickListenerC0073a implements View.OnClickListener {
        private com.facebook.j0.r.g.a a;
        private WeakReference<View> b;
        private WeakReference<View> c;
        private View.OnClickListener d;
        private boolean e;

        public ViewOnClickListenerC0073a(com.facebook.j0.r.g.a aVar, View view, View view2) {
            i.e(aVar, "mapping");
            i.e(view, "rootView");
            i.e(view2, "hostView");
            this.a = aVar;
            this.b = new WeakReference<>(view2);
            this.c = new WeakReference<>(view);
            this.d = com.facebook.j0.r.g.f.g(view2);
            this.e = true;
        }

        public final boolean a() {
            return this.e;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                i.e(view, "view");
                View.OnClickListener onClickListener = this.d;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                View view2 = this.c.get();
                View view3 = this.b.get();
                if (view2 == null || view3 == null) {
                    return;
                }
                com.facebook.j0.r.g.a aVar = this.a;
                if (aVar == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.internal.EventBinding");
                }
                a.c(aVar, view2, view3);
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    public static final class b implements AdapterView.OnItemClickListener {
        private com.facebook.j0.r.g.a a;
        private WeakReference<AdapterView<?>> b;
        private WeakReference<View> c;
        private AdapterView.OnItemClickListener d;
        private boolean e;

        public b(com.facebook.j0.r.g.a aVar, View view, AdapterView<?> adapterView) {
            i.e(aVar, "mapping");
            i.e(view, "rootView");
            i.e(adapterView, "hostView");
            this.a = aVar;
            this.b = new WeakReference<>(adapterView);
            this.c = new WeakReference<>(view);
            this.d = adapterView.getOnItemClickListener();
            this.e = true;
        }

        public final boolean a() {
            return this.e;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            i.e(view, "view");
            AdapterView.OnItemClickListener onItemClickListener = this.d;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(adapterView, view, i2, j2);
            }
            View view2 = this.c.get();
            AdapterView<?> adapterView2 = this.b.get();
            if (view2 == null || adapterView2 == null) {
                return;
            }
            a.c(this.a, view2, adapterView2);
        }
    }

    static final class c implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ Bundle b;

        c(String str, Bundle bundle) {
            this.a = str;
            this.b = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                g.b.f(r.f()).b(this.a, this.b);
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    private a() {
    }

    public static final ViewOnClickListenerC0073a a(com.facebook.j0.r.g.a aVar, View view, View view2) {
        if (com.facebook.internal.m0.i.a.d(a.class)) {
            return null;
        }
        try {
            i.e(aVar, "mapping");
            i.e(view, "rootView");
            i.e(view2, "hostView");
            return new ViewOnClickListenerC0073a(aVar, view, view2);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, a.class);
            return null;
        }
    }

    public static final b b(com.facebook.j0.r.g.a aVar, View view, AdapterView<?> adapterView) {
        if (com.facebook.internal.m0.i.a.d(a.class)) {
            return null;
        }
        try {
            i.e(aVar, "mapping");
            i.e(view, "rootView");
            i.e(adapterView, "hostView");
            return new b(aVar, view, adapterView);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, a.class);
            return null;
        }
    }

    public static final void c(com.facebook.j0.r.g.a aVar, View view, View view2) {
        if (com.facebook.internal.m0.i.a.d(a.class)) {
            return;
        }
        try {
            i.e(aVar, "mapping");
            i.e(view, "rootView");
            i.e(view2, "hostView");
            String strB = aVar.b();
            Bundle bundleB = com.facebook.j0.r.c.f650h.b(aVar, view, view2);
            a.d(bundleB);
            r.n().execute(new c(strB, bundleB));
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, a.class);
        }
    }

    public final void d(Bundle bundle) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            i.e(bundle, "parameters");
            String string = bundle.getString("_valueToSum");
            if (string != null) {
                bundle.putDouble("_valueToSum", com.facebook.j0.v.b.g(string));
            }
            bundle.putString("_is_fb_codeless", "1");
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }
}
