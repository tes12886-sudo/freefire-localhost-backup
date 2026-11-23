package com.facebook.j0.r;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import com.facebook.internal.h0;
import com.facebook.internal.t;
import com.facebook.internal.u;
import com.facebook.internal.y;
import com.facebook.n;
import com.facebook.r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import l.d0.p;
import l.d0.q;
import l.y.c.i;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    private static final String f = "com.facebook.j0.r.c";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static c f649g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f650h = new a(null);
    private final Handler a;
    private final Set<Activity> b;
    private final Set<ViewTreeObserverOnGlobalLayoutListenerC0075c> c;
    private HashSet<String> d;
    private final HashMap<Integer, HashSet<String>> e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }

        public final synchronized c a() {
            c cVarA;
            if (c.a() == null) {
                c.d(new c(null));
            }
            cVarA = c.a();
            if (cVarA == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher");
            }
            return cVarA;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0050  */
        /* JADX WARN: Code duplicated, block: B:23:0x0066  */
        /* JADX WARN: Code duplicated, block: B:24:0x007f  */
        /* JADX WARN: Code duplicated, block: B:28:0x00a5  */
        /* JADX WARN: Code duplicated, block: B:33:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:34:0x00c2  */
        /* JADX WARN: Code duplicated, block: B:40:0x005a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:41:0x00c5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:44:0x0020 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:46:0x00b2 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:48:0x009f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:49:0x009f A[SYNTHETIC] */
        public final Bundle b(com.facebook.j0.r.g.a aVar, View view, View view2) {
            List<com.facebook.j0.r.g.b> listC;
            ViewTreeObserverOnGlobalLayoutListenerC0075c.a aVar2;
            List<com.facebook.j0.r.g.c> listB;
            int i2;
            int i3;
            String simpleName;
            View view3;
            String strK;
            boolean z;
            String strA;
            i.e(view, "rootView");
            i.e(view2, "hostView");
            Bundle bundle = new Bundle();
            if (aVar != null && (listC = aVar.c()) != null) {
                for (com.facebook.j0.r.g.b bVar : listC) {
                    if (bVar.d() != null) {
                        if (bVar.d().length() > 0) {
                            strA = bVar.a();
                            strK = bVar.d();
                        } else if (bVar.b().size() <= 0) {
                            if (i.a(bVar.c(), "relative")) {
                                aVar2 = ViewTreeObserverOnGlobalLayoutListenerC0075c.f;
                                listB = bVar.b();
                                i2 = 0;
                                i3 = -1;
                                simpleName = view2.getClass().getSimpleName();
                                i.d(simpleName, "hostView.javaClass.simpleName");
                                view3 = view2;
                            } else {
                                aVar2 = ViewTreeObserverOnGlobalLayoutListenerC0075c.f;
                                listB = bVar.b();
                                i2 = 0;
                                i3 = -1;
                                simpleName = view.getClass().getSimpleName();
                                i.d(simpleName, "rootView.javaClass.simpleName");
                                view3 = view;
                            }
                            for (b bVar2 : aVar2.a(aVar, view3, listB, i2, i3, simpleName)) {
                                if (bVar2.a() == null) {
                                    strK = com.facebook.j0.r.g.f.k(bVar2.a());
                                    if (strK.length() > 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        strA = bVar.a();
                                    }
                                }
                            }
                        }
                        bundle.putString(strA, strK);
                        break;
                        break;
                    }
                    if (bVar.b().size() <= 0) {
                        if (i.a(bVar.c(), "relative")) {
                            aVar2 = ViewTreeObserverOnGlobalLayoutListenerC0075c.f;
                            listB = bVar.b();
                            i2 = 0;
                            i3 = -1;
                            simpleName = view2.getClass().getSimpleName();
                            i.d(simpleName, "hostView.javaClass.simpleName");
                            view3 = view2;
                        } else {
                            aVar2 = ViewTreeObserverOnGlobalLayoutListenerC0075c.f;
                            listB = bVar.b();
                            i2 = 0;
                            i3 = -1;
                            simpleName = view.getClass().getSimpleName();
                            i.d(simpleName, "rootView.javaClass.simpleName");
                            view3 = view;
                        }
                        while (r1.hasNext()) {
                            if (bVar2.a() == null) {
                                strK = com.facebook.j0.r.g.f.k(bVar2.a());
                                if (strK.length() > 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    strA = bVar.a();
                                    bundle.putString(strA, strK);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            return bundle;
        }
    }

    public static final class b {
        private final WeakReference<View> a;
        private final String b;

        public b(View view, String str) {
            i.e(view, "view");
            i.e(str, "viewMapKey");
            this.a = new WeakReference<>(view);
            this.b = str;
        }

        public final View a() {
            WeakReference<View> weakReference = this.a;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        public final String b() {
            return this.b;
        }
    }

    /* JADX INFO: renamed from: com.facebook.j0.r.c$c, reason: collision with other inner class name */
    public static final class ViewTreeObserverOnGlobalLayoutListenerC0075c implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {
        public static final a f = new a(null);
        private final WeakReference<View> a;
        private List<com.facebook.j0.r.g.a> b;
        private final Handler c;
        private final HashSet<String> d;
        private final String e;

        /* JADX INFO: renamed from: com.facebook.j0.r.c$c$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(l.y.c.f fVar) {
                this();
            }

            private final List<View> b(ViewGroup viewGroup) {
                ArrayList arrayList = new ArrayList();
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    i.d(childAt, "child");
                    if (childAt.getVisibility() == 0) {
                        arrayList.add(childAt);
                    }
                }
                return arrayList;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
            
                if ((!l.y.c.i.a(r9.getClass().getSimpleName(), (java.lang.String) r11.get(r11.size() - 1))) == false) goto L16;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private final boolean c(View view, com.facebook.j0.r.g.c cVar, int i2) {
                if (cVar.e() != -1 && i2 != cVar.e()) {
                    return false;
                }
                if (!i.a(view.getClass().getCanonicalName(), cVar.a())) {
                    if (new l.d0.f(".*android\\..*").a(cVar.a())) {
                        List listI0 = q.i0(cVar.a(), new String[]{"."}, false, 0, 6, null);
                        if (!listI0.isEmpty()) {
                        }
                    }
                    return false;
                }
                if ((cVar.f() & com.facebook.j0.r.g.c.a.ID.a()) > 0 && cVar.d() != view.getId()) {
                    return false;
                }
                if ((cVar.f() & com.facebook.j0.r.g.c.a.TEXT.a()) > 0) {
                    String strH = cVar.h();
                    String strK = com.facebook.j0.r.g.f.k(view);
                    String strJ = h0.j(h0.C0(strK), "");
                    if ((!i.a(strH, strK)) && (!i.a(strH, strJ))) {
                        return false;
                    }
                }
                if ((cVar.f() & com.facebook.j0.r.g.c.a.DESCRIPTION.a()) > 0) {
                    String strB = cVar.b();
                    String string = view.getContentDescription() == null ? "" : view.getContentDescription().toString();
                    String strJ2 = h0.j(h0.C0(string), "");
                    if ((!i.a(strB, string)) && (!i.a(strB, strJ2))) {
                        return false;
                    }
                }
                if ((cVar.f() & com.facebook.j0.r.g.c.a.HINT.a()) > 0) {
                    String strC = cVar.c();
                    String strI = com.facebook.j0.r.g.f.i(view);
                    String strJ3 = h0.j(h0.C0(strI), "");
                    if ((!i.a(strC, strI)) && (!i.a(strC, strJ3))) {
                        return false;
                    }
                }
                if ((cVar.f() & com.facebook.j0.r.g.c.a.TAG.a()) > 0) {
                    String strG = cVar.g();
                    String string2 = view.getTag() == null ? "" : view.getTag().toString();
                    String strJ4 = h0.j(h0.C0(string2), "");
                    if ((!i.a(strG, string2)) && (!i.a(strG, strJ4))) {
                        return false;
                    }
                }
                return true;
            }

            /* JADX WARN: Code duplicated, block: B:29:0x00a5  */
            /* JADX WARN: Code duplicated, block: B:31:0x00b2 A[LOOP:0: B:30:0x00b0->B:31:0x00b2, LOOP_END] */
            public final List<b> a(com.facebook.j0.r.g.a aVar, View view, List<com.facebook.j0.r.g.c> list, int i2, int i3, String str) {
                b bVar;
                List<View> listB;
                int size;
                int i4;
                i.e(list, "path");
                i.e(str, "mapKey");
                String str2 = str + '.' + i3;
                ArrayList arrayList = new ArrayList();
                if (view == null) {
                    return arrayList;
                }
                if (i2 < list.size()) {
                    com.facebook.j0.r.g.c cVar = list.get(i2);
                    if (i.a(cVar.a(), "..")) {
                        ViewParent parent = view.getParent();
                        if (parent instanceof ViewGroup) {
                            List<View> listB2 = b((ViewGroup) parent);
                            int size2 = listB2.size();
                            for (int i5 = 0; i5 < size2; i5++) {
                                arrayList.addAll(a(aVar, listB2.get(i5), list, i2 + 1, i5, str2));
                            }
                        }
                        return arrayList;
                    }
                    if (i.a(cVar.a(), ".")) {
                        arrayList.add(new b(view, str2));
                        return arrayList;
                    }
                    if (!c(view, cVar, i3)) {
                        return arrayList;
                    }
                    if (i2 == list.size() - 1) {
                        bVar = new b(view, str2);
                    }
                    if (view instanceof ViewGroup) {
                        listB = b((ViewGroup) view);
                        size = listB.size();
                        for (i4 = 0; i4 < size; i4++) {
                            arrayList.addAll(a(aVar, listB.get(i4), list, i2 + 1, i4, str2));
                        }
                    }
                    return arrayList;
                }
                bVar = new b(view, str2);
                arrayList.add(bVar);
                if (view instanceof ViewGroup) {
                    listB = b((ViewGroup) view);
                    size = listB.size();
                    while (i4 < size) {
                        arrayList.addAll(a(aVar, listB.get(i4), list, i2 + 1, i4, str2));
                    }
                }
                return arrayList;
            }
        }

        public ViewTreeObserverOnGlobalLayoutListenerC0075c(View view, Handler handler, HashSet<String> hashSet, String str) {
            i.e(handler, "handler");
            i.e(hashSet, "listenerSet");
            i.e(str, "activityName");
            this.a = new WeakReference<>(view);
            this.c = handler;
            this.d = hashSet;
            this.e = str;
            handler.postDelayed(this, 200L);
        }

        private final void a(b bVar, View view, com.facebook.j0.r.g.a aVar) {
            if (aVar == null) {
                return;
            }
            try {
                View viewA = bVar.a();
                if (viewA != null) {
                    View viewA2 = com.facebook.j0.r.g.f.a(viewA);
                    if (viewA2 != null && com.facebook.j0.r.g.f.d.p(viewA, viewA2)) {
                        d(bVar, view, aVar);
                        return;
                    }
                    String name = viewA.getClass().getName();
                    i.d(name, "view.javaClass.name");
                    if (p.x(name, "com.facebook.react", false, 2, null)) {
                        return;
                    }
                    if (!(viewA instanceof AdapterView)) {
                        b(bVar, view, aVar);
                    } else if (viewA instanceof ListView) {
                        c(bVar, view, aVar);
                    }
                }
            } catch (Exception e) {
                h0.e0(c.b(), e);
            }
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0026  */
        private final void b(b bVar, View view, com.facebook.j0.r.g.a aVar) {
            boolean z;
            View viewA = bVar.a();
            if (viewA != null) {
                String strB = bVar.b();
                View.OnClickListener onClickListenerG = com.facebook.j0.r.g.f.g(viewA);
                if (!(onClickListenerG instanceof com.facebook.j0.r.a.ViewOnClickListenerC0073a)) {
                    z = false;
                } else {
                    if (onClickListenerG == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener");
                    }
                    if (((com.facebook.j0.r.a.ViewOnClickListenerC0073a) onClickListenerG).a()) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (this.d.contains(strB) || z) {
                    return;
                }
                viewA.setOnClickListener(com.facebook.j0.r.a.a(aVar, view, viewA));
                this.d.add(strB);
            }
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0028  */
        private final void c(b bVar, View view, com.facebook.j0.r.g.a aVar) {
            boolean z;
            AdapterView adapterView = (AdapterView) bVar.a();
            if (adapterView != null) {
                String strB = bVar.b();
                AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
                if (!(onItemClickListener instanceof com.facebook.j0.r.a.b)) {
                    z = false;
                } else {
                    if (onItemClickListener == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener");
                    }
                    if (((com.facebook.j0.r.a.b) onItemClickListener).a()) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (this.d.contains(strB) || z) {
                    return;
                }
                adapterView.setOnItemClickListener(com.facebook.j0.r.a.b(aVar, view, adapterView));
                this.d.add(strB);
            }
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0026  */
        private final void d(b bVar, View view, com.facebook.j0.r.g.a aVar) {
            boolean z;
            View viewA = bVar.a();
            if (viewA != null) {
                String strB = bVar.b();
                View.OnTouchListener onTouchListenerH = com.facebook.j0.r.g.f.h(viewA);
                if (!(onTouchListenerH instanceof com.facebook.j0.r.d.a)) {
                    z = false;
                } else {
                    if (onTouchListenerH == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener");
                    }
                    if (((com.facebook.j0.r.d.a) onTouchListenerH).a()) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (this.d.contains(strB) || z) {
                    return;
                }
                viewA.setOnTouchListener(com.facebook.j0.r.d.a(aVar, view, viewA));
                this.d.add(strB);
            }
        }

        private final void e(com.facebook.j0.r.g.a aVar, View view) {
            if (aVar == null || view == null) {
                return;
            }
            String strA = aVar.a();
            if ((strA == null || strA.length() == 0) || !(!i.a(aVar.a(), this.e))) {
                List<com.facebook.j0.r.g.c> listD = aVar.d();
                if (listD.size() > 25) {
                    return;
                }
                Iterator<b> it = f.a(aVar, view, listD, 0, -1, this.e).iterator();
                while (it.hasNext()) {
                    a(it.next(), view, aVar);
                }
            }
        }

        private final void f() {
            List<com.facebook.j0.r.g.a> list = this.b;
            if (list == null || this.a.get() == null) {
                return;
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                e(list.get(i2), this.a.get());
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            f();
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            f();
        }

        @Override // java.lang.Runnable
        public void run() {
            View view;
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                t tVarJ = u.j(r.g());
                if (tVarJ != null && tVarJ.b()) {
                    List<com.facebook.j0.r.g.a> listB = com.facebook.j0.r.g.a.e.b(tVarJ.e());
                    this.b = listB;
                    if (listB == null || (view = this.a.get()) == null) {
                        return;
                    }
                    i.d(view, "rootView.get() ?: return");
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    i.d(viewTreeObserver, "observer");
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalLayoutListener(this);
                        viewTreeObserver.addOnScrollChangedListener(this);
                    }
                    f();
                }
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    static final class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                c.c(c.this);
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    private c() {
        this.a = new Handler(Looper.getMainLooper());
        Set<Activity> setNewSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        i.d(setNewSetFromMap, "Collections.newSetFromMap(WeakHashMap())");
        this.b = setNewSetFromMap;
        this.c = new LinkedHashSet();
        this.d = new HashSet<>();
        this.e = new HashMap<>();
    }

    public /* synthetic */ c(l.y.c.f fVar) {
        this();
    }

    public static final /* synthetic */ c a() {
        if (com.facebook.internal.m0.i.a.d(c.class)) {
            return null;
        }
        try {
            return f649g;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c.class);
            return null;
        }
    }

    public static final /* synthetic */ String b() {
        if (com.facebook.internal.m0.i.a.d(c.class)) {
            return null;
        }
        try {
            return f;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c.class);
            return null;
        }
    }

    public static final /* synthetic */ void c(c cVar) {
        if (com.facebook.internal.m0.i.a.d(c.class)) {
            return;
        }
        try {
            cVar.g();
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c.class);
        }
    }

    public static final /* synthetic */ void d(c cVar) {
        if (com.facebook.internal.m0.i.a.d(c.class)) {
            return;
        }
        try {
            f649g = cVar;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c.class);
        }
    }

    private final void g() {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            for (Activity activity : this.b) {
                if (activity != null) {
                    View viewE = com.facebook.j0.v.b.e(activity);
                    String simpleName = activity.getClass().getSimpleName();
                    i.d(simpleName, "activity.javaClass.simpleName");
                    this.c.add(new ViewTreeObserverOnGlobalLayoutListenerC0075c(viewE, this.a, this.d, simpleName));
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    private final void i() {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            Thread threadCurrentThread = Thread.currentThread();
            Looper mainLooper = Looper.getMainLooper();
            i.d(mainLooper, "Looper.getMainLooper()");
            if (threadCurrentThread == mainLooper.getThread()) {
                g();
            } else {
                this.a.post(new d());
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    public final void e(Activity activity) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            i.e(activity, "activity");
            if (y.b()) {
                return;
            }
            Thread threadCurrentThread = Thread.currentThread();
            Looper mainLooper = Looper.getMainLooper();
            i.d(mainLooper, "Looper.getMainLooper()");
            if (threadCurrentThread != mainLooper.getThread()) {
                throw new n("Can't add activity to CodelessMatcher on non-UI thread");
            }
            this.b.add(activity);
            this.d.clear();
            HashSet<String> hashSet = this.e.get(Integer.valueOf(activity.hashCode()));
            if (hashSet != null) {
                i.d(hashSet, "it");
                this.d = hashSet;
            }
            i();
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    public final void f(Activity activity) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            i.e(activity, "activity");
            this.e.remove(Integer.valueOf(activity.hashCode()));
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    public final void h(Activity activity) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            i.e(activity, "activity");
            if (y.b()) {
                return;
            }
            Thread threadCurrentThread = Thread.currentThread();
            Looper mainLooper = Looper.getMainLooper();
            i.d(mainLooper, "Looper.getMainLooper()");
            if (threadCurrentThread != mainLooper.getThread()) {
                throw new n("Can't remove activity from CodelessMatcher on non-UI thread");
            }
            this.b.remove(activity);
            this.c.clear();
            HashMap<Integer, HashSet<String>> map = this.e;
            Integer numValueOf = Integer.valueOf(activity.hashCode());
            Object objClone = this.d.clone();
            if (objClone == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.HashSet<kotlin.String> /* = java.util.HashSet<kotlin.String> */");
            }
            map.put(numValueOf, (HashSet) objClone);
            this.d.clear();
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }
}
