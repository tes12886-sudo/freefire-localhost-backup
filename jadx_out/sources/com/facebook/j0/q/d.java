package com.facebook.j0.q;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import com.facebook.j0.m;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import l.d0.p;
import l.d0.q;
import l.y.c.f;
import l.y.c.i;

/* JADX INFO: loaded from: classes.dex */
public final class d implements ViewTreeObserver.OnGlobalFocusChangeListener {
    private final Set<String> a;
    private final Handler b;
    private final WeakReference<Activity> c;
    private final AtomicBoolean d;
    public static final a f = new a(null);
    private static final Map<Integer, d> e = new HashMap();

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String c(String str, String str2) {
            return i.a("r2", str) ? new l.d0.f("[^\\d.]").b(str2, "") : str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:19:0x004b  */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final void d(Map<String, String> map, String str, String str2) {
            switch (str.hashCode()) {
                case 3585:
                    if (str.equals("r3")) {
                        str2 = (p.x(str2, "m", false, 2, null) || p.x(str2, "b", false, 2, null) || p.x(str2, "ge", false, 2, null)) ? "m" : "f";
                    }
                    map.put(str, str2);
                    return;
                case 3586:
                    if (str.equals("r4")) {
                        str2 = new l.d0.f("[^a-z]+").b(str2, "");
                    }
                    map.put(str, str2);
                    return;
                case 3587:
                    if (str.equals("r5")) {
                        str2 = new l.d0.f("[^a-z]+").b(str2, "");
                    }
                    map.put(str, str2);
                    return;
                case 3588:
                    if (str.equals("r6") && q.C(str2, "-", false, 2, null)) {
                        Object[] array = new l.d0.f("-").c(str2, 0).toArray(new String[0]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                        str2 = ((String[]) array)[0];
                    }
                    map.put(str, str2);
                    return;
                default:
                    map.put(str, str2);
                    return;
            }
        }

        public final void e(Activity activity) {
            i.e(activity, "activity");
            int iHashCode = activity.hashCode();
            Map mapA = d.a();
            Integer numValueOf = Integer.valueOf(iHashCode);
            Object dVar = mapA.get(numValueOf);
            if (dVar == null) {
                dVar = new d(activity, null);
                mapA.put(numValueOf, dVar);
            }
            d.c((d) dVar);
        }
    }

    static final class b implements Runnable {
        final /* synthetic */ View b;

        b(View view) {
            this.b = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                View view = this.b;
                if (view instanceof EditText) {
                    d.b(d.this, view);
                }
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    private d(Activity activity) {
        this.a = new LinkedHashSet();
        this.b = new Handler(Looper.getMainLooper());
        this.c = new WeakReference<>(activity);
        this.d = new AtomicBoolean(false);
    }

    public /* synthetic */ d(Activity activity, f fVar) {
        this(activity);
    }

    public static final /* synthetic */ Map a() {
        if (com.facebook.internal.m0.i.a.d(d.class)) {
            return null;
        }
        try {
            return e;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, d.class);
            return null;
        }
    }

    public static final /* synthetic */ void b(d dVar, View view) {
        if (com.facebook.internal.m0.i.a.d(d.class)) {
            return;
        }
        try {
            dVar.e(view);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, d.class);
        }
    }

    public static final /* synthetic */ void c(d dVar) {
        if (com.facebook.internal.m0.i.a.d(d.class)) {
            return;
        }
        try {
            dVar.g();
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, d.class);
        }
    }

    private final void d(View view) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            f(new b(view));
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    private final void e(View view) {
        String strC;
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            if (view == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.EditText");
            }
            String string = ((EditText) view).getText().toString();
            if (string == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            String string2 = q.u0(string).toString();
            if (string2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = string2.toLowerCase();
            i.d(lowerCase, "(this as java.lang.String).toLowerCase()");
            if (!(lowerCase.length() == 0) && !this.a.contains(lowerCase) && lowerCase.length() <= 100) {
                this.a.add(lowerCase);
                HashMap map = new HashMap();
                List<String> listB = com.facebook.j0.q.b.b(view);
                List<String> listA = null;
                for (c cVar : c.e.c()) {
                    a aVar = f;
                    String strC2 = aVar.c(cVar.c(), lowerCase);
                    if (!(cVar.d().length() > 0) || com.facebook.j0.q.b.f(strC2, cVar.d())) {
                        if (com.facebook.j0.q.b.e(listB, cVar.b())) {
                            strC = cVar.c();
                        } else {
                            if (listA == null) {
                                listA = com.facebook.j0.q.b.a(view);
                            }
                            if (com.facebook.j0.q.b.e(listA, cVar.b())) {
                                strC = cVar.c();
                            }
                        }
                        aVar.d(map, strC, strC2);
                    }
                }
                m.b.d(map);
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    private final void f(Runnable runnable) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            Thread threadCurrentThread = Thread.currentThread();
            Looper mainLooper = Looper.getMainLooper();
            i.d(mainLooper, "Looper.getMainLooper()");
            if (threadCurrentThread == mainLooper.getThread()) {
                runnable.run();
            } else {
                this.b.post(runnable);
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    private final void g() {
        View viewE;
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            if (this.d.getAndSet(true) || (viewE = com.facebook.j0.v.b.e(this.c.get())) == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = viewE.getViewTreeObserver();
            i.d(viewTreeObserver, "observer");
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalFocusChangeListener(this);
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(View view, View view2) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        if (view != null) {
            try {
                d(view);
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
                return;
            }
        }
        if (view2 != null) {
            d(view2);
        }
    }
}
