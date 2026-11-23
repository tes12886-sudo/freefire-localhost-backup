package androidx.fragment.app;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class x {
    private static final int[] a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};
    static final z b;
    static final z c;

    class a implements Runnable {
        final /* synthetic */ g a;
        final /* synthetic */ Fragment b;
        final /* synthetic */ h.h.h.b c;

        a(g gVar, Fragment fragment, h.h.h.b bVar) {
            this.a = gVar;
            this.b = fragment;
            this.c = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(this.b, this.c);
        }
    }

    class b implements Runnable {
        final /* synthetic */ ArrayList a;

        b(ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            x.B(this.a, 4);
        }
    }

    class c implements Runnable {
        final /* synthetic */ g a;
        final /* synthetic */ Fragment b;
        final /* synthetic */ h.h.h.b c;

        c(g gVar, Fragment fragment, h.h.h.b bVar) {
            this.a = gVar;
            this.b = fragment;
            this.c = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(this.b, this.c);
        }
    }

    class d implements Runnable {
        final /* synthetic */ Object a;
        final /* synthetic */ z b;
        final /* synthetic */ View c;
        final /* synthetic */ Fragment d;
        final /* synthetic */ ArrayList e;
        final /* synthetic */ ArrayList f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ArrayList f431g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Object f432h;

        d(Object obj, z zVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.a = obj;
            this.b = zVar;
            this.c = view;
            this.d = fragment;
            this.e = arrayList;
            this.f = arrayList2;
            this.f431g = arrayList3;
            this.f432h = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.a;
            if (obj != null) {
                this.b.p(obj, this.c);
                this.f.addAll(x.k(this.b, this.a, this.d, this.e, this.c));
            }
            if (this.f431g != null) {
                if (this.f432h != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.c);
                    this.b.q(this.f432h, this.f431g, arrayList);
                }
                this.f431g.clear();
                this.f431g.add(this.c);
            }
        }
    }

    class e implements Runnable {
        final /* synthetic */ Fragment a;
        final /* synthetic */ Fragment b;
        final /* synthetic */ boolean c;
        final /* synthetic */ h.f.a d;
        final /* synthetic */ View e;
        final /* synthetic */ z f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Rect f433g;

        e(Fragment fragment, Fragment fragment2, boolean z, h.f.a aVar, View view, z zVar, Rect rect) {
            this.a = fragment;
            this.b = fragment2;
            this.c = z;
            this.d = aVar;
            this.e = view;
            this.f = zVar;
            this.f433g = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            x.f(this.a, this.b, this.c, this.d, false);
            View view = this.e;
            if (view != null) {
                this.f.k(view, this.f433g);
            }
        }
    }

    class f implements Runnable {
        final /* synthetic */ z a;
        final /* synthetic */ h.f.a b;
        final /* synthetic */ Object c;
        final /* synthetic */ h d;
        final /* synthetic */ ArrayList e;
        final /* synthetic */ View f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Fragment f434g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Fragment f435h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f436i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ ArrayList f437j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ Object f438k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ Rect f439l;

        f(z zVar, h.f.a aVar, Object obj, h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.a = zVar;
            this.b = aVar;
            this.c = obj;
            this.d = hVar;
            this.e = arrayList;
            this.f = view;
            this.f434g = fragment;
            this.f435h = fragment2;
            this.f436i = z;
            this.f437j = arrayList2;
            this.f438k = obj2;
            this.f439l = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.f.a<String, View> aVarH = x.h(this.a, this.b, this.c, this.d);
            if (aVarH != null) {
                this.e.addAll(aVarH.values());
                this.e.add(this.f);
            }
            x.f(this.f434g, this.f435h, this.f436i, aVarH, false);
            Object obj = this.c;
            if (obj != null) {
                this.a.A(obj, this.f437j, this.e);
                View viewT = x.t(aVarH, this.d, this.f438k, this.f436i);
                if (viewT != null) {
                    this.a.k(viewT, this.f439l);
                }
            }
        }
    }

    interface g {
        void a(Fragment fragment, h.h.h.b bVar);

        void b(Fragment fragment, h.h.h.b bVar);
    }

    static class h {
        public Fragment a;
        public boolean b;
        public androidx.fragment.app.a c;
        public Fragment d;
        public boolean e;
        public androidx.fragment.app.a f;

        h() {
        }
    }

    static {
        b = Build.VERSION.SDK_INT >= 21 ? new y() : null;
        c = x();
    }

    private static void A(z zVar, Object obj, Object obj2, h.f.a<String, View> aVar, boolean z, androidx.fragment.app.a aVar2) {
        ArrayList<String> arrayList = aVar2.f426m;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = aVar.get((z ? aVar2.f427n : aVar2.f426m).get(0));
        zVar.v(obj, view);
        if (obj2 != null) {
            zVar.v(obj2, view);
        }
    }

    static void B(ArrayList<View> arrayList, int i2) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i2);
        }
    }

    static void C(Context context, androidx.fragment.app.g gVar, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, boolean z, g gVar2) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray();
        for (int i4 = i2; i4 < i3; i4++) {
            androidx.fragment.app.a aVar = arrayList.get(i4);
            if (arrayList2.get(i4).booleanValue()) {
                e(aVar, sparseArray, z);
            } else {
                c(aVar, sparseArray, z);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(context);
            int size = sparseArray.size();
            for (int i5 = 0; i5 < size; i5++) {
                int iKeyAt = sparseArray.keyAt(i5);
                h.f.a<String, String> aVarD = d(iKeyAt, arrayList, arrayList2, i2, i3);
                h hVar = (h) sparseArray.valueAt(i5);
                if (gVar.g() && (viewGroup = (ViewGroup) gVar.f(iKeyAt)) != null) {
                    if (z) {
                        o(viewGroup, hVar, view, aVarD, gVar2);
                    } else {
                        n(viewGroup, hVar, view, aVarD, gVar2);
                    }
                }
            }
        }
    }

    private static void a(ArrayList<View> arrayList, h.f.a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View viewL = aVar.l(size);
            if (collection.contains(h.h.l.y.v(viewL))) {
                arrayList.add(viewL);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x006e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0070  */
    /* JADX WARN: Code duplicated, block: B:63:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x007f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0082  */
    /* JADX WARN: Code duplicated, block: B:69:0x008a  */
    /* JADX WARN: Code duplicated, block: B:70:0x008c  */
    private static void b(androidx.fragment.app.a aVar, w.a aVar2, SparseArray<h> sparseArray, boolean z, boolean z2) {
        int i2;
        boolean z3;
        boolean z4;
        boolean z5;
        View view;
        boolean z6;
        Fragment fragment = aVar2.b;
        if (fragment == null || (i2 = fragment.G) == 0) {
            return;
        }
        int i3 = z ? a[aVar2.a] : aVar2.a;
        boolean z7 = false;
        boolean z8 = true;
        if (i3 == 1) {
            if (z2) {
                z3 = fragment.U;
            } else if (!fragment.f371l || fragment.I) {
                z3 = false;
            } else {
                z3 = true;
            }
            z7 = z3;
            z4 = false;
            z5 = false;
        } else if (i3 == 3) {
            boolean z9 = fragment.f371l;
            if (z2 ? !z9 || fragment.I : z9 || (view = fragment.Q) == null || view.getVisibility() != 0 || fragment.W < 0.0f) {
                z6 = false;
            } else {
                z6 = true;
            }
            z5 = z6;
            z4 = true;
            z8 = false;
        } else if (i3 != 4) {
            if (i3 != 5) {
                if (i3 != 6) {
                    if (i3 != 7) {
                        z4 = false;
                        z8 = false;
                    } else {
                        if (z2) {
                            z3 = fragment.U;
                        } else {
                            if (fragment.f371l) {
                            }
                            z3 = false;
                        }
                        z7 = z3;
                        z4 = false;
                    }
                }
                boolean z10 = fragment.f371l;
                if (z2) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                z5 = z6;
                z4 = true;
                z8 = false;
            } else {
                if (!z2) {
                    z3 = fragment.I;
                } else if (fragment.V && !fragment.I && fragment.f371l) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z7 = z3;
                z4 = false;
            }
            z5 = false;
        } else {
            if (!z2 ? !(!fragment.f371l || fragment.I) : fragment.V && fragment.f371l && fragment.I) {
                z6 = false;
            } else {
                z6 = true;
            }
            z5 = z6;
            z4 = true;
            z8 = false;
        }
        h hVarP = sparseArray.get(i2);
        if (z7) {
            hVarP = p(hVarP, sparseArray, i2);
            hVarP.a = fragment;
            hVarP.b = z;
            hVarP.c = aVar;
        }
        if (!z2 && z8) {
            if (hVarP != null && hVarP.d == fragment) {
                hVarP.d = null;
            }
            if (!aVar.f428o) {
                n nVar = aVar.q;
                nVar.r0().p(nVar.w(fragment));
                nVar.P0(fragment);
            }
        }
        if (z5 && (hVarP == null || hVarP.d == null)) {
            hVarP = p(hVarP, sparseArray, i2);
            hVarP.d = fragment;
            hVarP.e = z;
            hVarP.f = aVar;
        }
        if (z2 || !z4 || hVarP == null || hVarP.a != fragment) {
            return;
        }
        hVarP.a = null;
    }

    public static void c(androidx.fragment.app.a aVar, SparseArray<h> sparseArray, boolean z) {
        int size = aVar.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            b(aVar, aVar.a.get(i2), sparseArray, false, z);
        }
    }

    private static h.f.a<String, String> d(int i2, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i3, int i4) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        h.f.a<String, String> aVar = new h.f.a<>();
        for (int i5 = i4 - 1; i5 >= i3; i5--) {
            androidx.fragment.app.a aVar2 = arrayList.get(i5);
            if (aVar2.u(i2)) {
                boolean zBooleanValue = arrayList2.get(i5).booleanValue();
                ArrayList<String> arrayList5 = aVar2.f426m;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (zBooleanValue) {
                        arrayList3 = aVar2.f426m;
                        arrayList4 = aVar2.f427n;
                    } else {
                        ArrayList<String> arrayList6 = aVar2.f426m;
                        arrayList3 = aVar2.f427n;
                        arrayList4 = arrayList6;
                    }
                    for (int i6 = 0; i6 < size; i6++) {
                        String str = arrayList4.get(i6);
                        String str2 = arrayList3.get(i6);
                        String strRemove = aVar.remove(str2);
                        if (strRemove != null) {
                            aVar.put(str, strRemove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    public static void e(androidx.fragment.app.a aVar, SparseArray<h> sparseArray, boolean z) {
        if (aVar.q.o0().g()) {
            for (int size = aVar.a.size() - 1; size >= 0; size--) {
                b(aVar, aVar.a.get(size), sparseArray, true, z);
            }
        }
    }

    static void f(Fragment fragment, Fragment fragment2, boolean z, h.f.a<String, View> aVar, boolean z2) {
        androidx.core.app.o oVarV = z ? fragment2.v() : fragment.v();
        if (oVarV != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = aVar == null ? 0 : aVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(aVar.i(i2));
                arrayList.add(aVar.l(i2));
            }
            if (z2) {
                oVarV.c(arrayList2, arrayList, null);
            } else {
                oVarV.b(arrayList2, arrayList, null);
            }
        }
    }

    private static boolean g(z zVar, List<Object> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!zVar.e(list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    static h.f.a<String, View> h(z zVar, h.f.a<String, String> aVar, Object obj, h hVar) {
        androidx.core.app.o oVarV;
        ArrayList<String> arrayList;
        String strQ;
        Fragment fragment = hVar.a;
        View viewV = fragment.V();
        if (aVar.isEmpty() || obj == null || viewV == null) {
            aVar.clear();
            return null;
        }
        h.f.a<String, View> aVar2 = new h.f.a<>();
        zVar.j(aVar2, viewV);
        androidx.fragment.app.a aVar3 = hVar.c;
        if (hVar.b) {
            oVarV = fragment.y();
            arrayList = aVar3.f426m;
        } else {
            oVarV = fragment.v();
            arrayList = aVar3.f427n;
        }
        if (arrayList != null) {
            aVar2.n(arrayList);
            aVar2.n(aVar.values());
        }
        if (oVarV != null) {
            oVarV.a(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar2.get(str);
                if (view == null) {
                    String strQ2 = q(aVar, str);
                    if (strQ2 != null) {
                        aVar.remove(strQ2);
                    }
                } else if (!str.equals(h.h.l.y.v(view)) && (strQ = q(aVar, str)) != null) {
                    aVar.put(strQ, h.h.l.y.v(view));
                }
            }
        } else {
            y(aVar, aVar2);
        }
        return aVar2;
    }

    private static h.f.a<String, View> i(z zVar, h.f.a<String, String> aVar, Object obj, h hVar) {
        androidx.core.app.o oVarY;
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = hVar.d;
        h.f.a<String, View> aVar2 = new h.f.a<>();
        zVar.j(aVar2, fragment.r1());
        androidx.fragment.app.a aVar3 = hVar.f;
        if (hVar.e) {
            oVarY = fragment.v();
            arrayList = aVar3.f427n;
        } else {
            oVarY = fragment.y();
            arrayList = aVar3.f426m;
        }
        if (arrayList != null) {
            aVar2.n(arrayList);
        }
        if (oVarY != null) {
            oVarY.a(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar2.get(str);
                if (view == null) {
                    aVar.remove(str);
                } else if (!str.equals(h.h.l.y.v(view))) {
                    aVar.put(h.h.l.y.v(view), aVar.remove(str));
                }
            }
        } else {
            aVar.n(aVar2.keySet());
        }
        return aVar2;
    }

    private static z j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object objX = fragment.x();
            if (objX != null) {
                arrayList.add(objX);
            }
            Object objO = fragment.O();
            if (objO != null) {
                arrayList.add(objO);
            }
            Object objQ = fragment.Q();
            if (objQ != null) {
                arrayList.add(objQ);
            }
        }
        if (fragment2 != null) {
            Object objU = fragment2.u();
            if (objU != null) {
                arrayList.add(objU);
            }
            Object objL = fragment2.L();
            if (objL != null) {
                arrayList.add(objL);
            }
            Object objP = fragment2.P();
            if (objP != null) {
                arrayList.add(objP);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        z zVar = b;
        if (zVar != null && g(zVar, arrayList)) {
            return zVar;
        }
        z zVar2 = c;
        if (zVar2 != null && g(zVar2, arrayList)) {
            return zVar2;
        }
        if (zVar == null && zVar2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    static ArrayList<View> k(z zVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View viewV = fragment.V();
        if (viewV != null) {
            zVar.f(arrayList2, viewV);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        zVar.b(obj, arrayList2);
        return arrayList2;
    }

    private static Object l(z zVar, ViewGroup viewGroup, View view, h.f.a<String, String> aVar, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Rect rect;
        Fragment fragment = hVar.a;
        Fragment fragment2 = hVar.d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar.b;
        Object objU = aVar.isEmpty() ? null : u(zVar, fragment, fragment2, z);
        h.f.a<String, View> aVarI = i(zVar, aVar, objU, hVar);
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(aVarI.values());
            obj3 = objU;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z, aVarI, true);
        if (obj3 != null) {
            rect = new Rect();
            zVar.z(obj3, view, arrayList);
            A(zVar, obj3, obj2, aVarI, hVar.e, hVar.f);
            if (obj != null) {
                zVar.u(obj, rect);
            }
        } else {
            rect = null;
        }
        h.h.l.w.a(viewGroup, new f(zVar, aVar, obj3, hVar, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect));
        return obj3;
    }

    private static Object m(z zVar, ViewGroup viewGroup, View view, h.f.a<String, String> aVar, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        Fragment fragment = hVar.a;
        Fragment fragment2 = hVar.d;
        if (fragment != null) {
            fragment.r1().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar.b;
        Object objU = aVar.isEmpty() ? null : u(zVar, fragment, fragment2, z);
        h.f.a<String, View> aVarI = i(zVar, aVar, objU, hVar);
        h.f.a<String, View> aVarH = h(zVar, aVar, objU, hVar);
        if (aVar.isEmpty()) {
            if (aVarI != null) {
                aVarI.clear();
            }
            if (aVarH != null) {
                aVarH.clear();
            }
            obj3 = null;
        } else {
            a(arrayList, aVarI, aVar.keySet());
            a(arrayList2, aVarH, aVar.values());
            obj3 = objU;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z, aVarI, true);
        if (obj3 != null) {
            arrayList2.add(view);
            zVar.z(obj3, view, arrayList);
            A(zVar, obj3, obj2, aVarI, hVar.e, hVar.f);
            Rect rect2 = new Rect();
            View viewT = t(aVarH, hVar, obj, z);
            if (viewT != null) {
                zVar.u(obj, rect2);
            }
            rect = rect2;
            view2 = viewT;
        } else {
            view2 = null;
            rect = null;
        }
        h.h.l.w.a(viewGroup, new e(fragment, fragment2, z, aVarH, view2, zVar, rect));
        return obj3;
    }

    private static void n(ViewGroup viewGroup, h hVar, View view, h.f.a<String, String> aVar, g gVar) {
        Object obj;
        Fragment fragment = hVar.a;
        Fragment fragment2 = hVar.d;
        z zVarJ = j(fragment2, fragment);
        if (zVarJ == null) {
            return;
        }
        boolean z = hVar.b;
        boolean z2 = hVar.e;
        Object objR = r(zVarJ, fragment, z);
        Object objS = s(zVarJ, fragment2, z2);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object objL = l(zVarJ, viewGroup, view, aVar, hVar, arrayList, arrayList2, objR, objS);
        if (objR == null && objL == null) {
            obj = objS;
            if (obj == null) {
                return;
            }
        } else {
            obj = objS;
        }
        ArrayList<View> arrayListK = k(zVarJ, obj, fragment2, arrayList, view);
        if (arrayListK == null || arrayListK.isEmpty()) {
            obj = null;
        }
        Object obj2 = obj;
        zVarJ.a(objR, view);
        Object objV = v(zVarJ, objR, obj2, objL, fragment, hVar.b);
        if (fragment2 != null && arrayListK != null && (arrayListK.size() > 0 || arrayList.size() > 0)) {
            h.h.h.b bVar = new h.h.h.b();
            gVar.b(fragment2, bVar);
            zVarJ.w(fragment2, objV, bVar, new c(gVar, fragment2, bVar));
        }
        if (objV != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            zVarJ.t(objV, objR, arrayList3, obj2, arrayListK, objL, arrayList2);
            z(zVarJ, viewGroup, fragment, view, arrayList2, objR, arrayList3, obj2, arrayListK);
            zVarJ.x(viewGroup, arrayList2, aVar);
            zVarJ.c(viewGroup, objV);
            zVarJ.s(viewGroup, arrayList2, aVar);
        }
    }

    private static void o(ViewGroup viewGroup, h hVar, View view, h.f.a<String, String> aVar, g gVar) {
        Object obj;
        Fragment fragment = hVar.a;
        Fragment fragment2 = hVar.d;
        z zVarJ = j(fragment2, fragment);
        if (zVarJ == null) {
            return;
        }
        boolean z = hVar.b;
        boolean z2 = hVar.e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object objR = r(zVarJ, fragment, z);
        Object objS = s(zVarJ, fragment2, z2);
        Object objM = m(zVarJ, viewGroup, view, aVar, hVar, arrayList2, arrayList, objR, objS);
        if (objR == null && objM == null) {
            obj = objS;
            if (obj == null) {
                return;
            }
        } else {
            obj = objS;
        }
        ArrayList<View> arrayListK = k(zVarJ, obj, fragment2, arrayList2, view);
        ArrayList<View> arrayListK2 = k(zVarJ, objR, fragment, arrayList, view);
        B(arrayListK2, 4);
        Object objV = v(zVarJ, objR, obj, objM, fragment, z);
        if (fragment2 != null && arrayListK != null && (arrayListK.size() > 0 || arrayList2.size() > 0)) {
            h.h.h.b bVar = new h.h.h.b();
            gVar.b(fragment2, bVar);
            zVarJ.w(fragment2, objV, bVar, new a(gVar, fragment2, bVar));
        }
        if (objV != null) {
            w(zVarJ, obj, fragment2, arrayListK);
            ArrayList<String> arrayListO = zVarJ.o(arrayList);
            zVarJ.t(objV, objR, arrayListK2, obj, arrayListK, objM, arrayList);
            zVarJ.c(viewGroup, objV);
            zVarJ.y(viewGroup, arrayList2, arrayList, arrayListO, aVar);
            B(arrayListK2, 0);
            zVarJ.A(objM, arrayList2, arrayList);
        }
    }

    private static h p(h hVar, SparseArray<h> sparseArray, int i2) {
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        sparseArray.put(i2, hVar2);
        return hVar2;
    }

    static String q(h.f.a<String, String> aVar, String str) {
        int size = aVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (str.equals(aVar.l(i2))) {
                return aVar.i(i2);
            }
        }
        return null;
    }

    private static Object r(z zVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return zVar.g(z ? fragment.L() : fragment.u());
    }

    private static Object s(z zVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return zVar.g(z ? fragment.O() : fragment.x());
    }

    static View t(h.f.a<String, View> aVar, h hVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        androidx.fragment.app.a aVar2 = hVar.c;
        if (obj == null || aVar == null || (arrayList = aVar2.f426m) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get((z ? aVar2.f426m : aVar2.f427n).get(0));
    }

    private static Object u(z zVar, Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return zVar.B(zVar.g(z ? fragment2.Q() : fragment.P()));
    }

    private static Object v(z zVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        boolean zO;
        if (obj == null || obj2 == null || fragment == null) {
            zO = true;
        } else {
            zO = z ? fragment.o() : fragment.n();
        }
        return zO ? zVar.n(obj2, obj, obj3) : zVar.m(obj2, obj, obj3);
    }

    private static void w(z zVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.f371l && fragment.I && fragment.V) {
            fragment.A1(true);
            zVar.r(obj, fragment.V(), arrayList);
            h.h.l.w.a(fragment.P, new b(arrayList));
        }
    }

    private static z x() {
        try {
            return (z) Class.forName("androidx.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static void y(h.f.a<String, String> aVar, h.f.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.l(size))) {
                aVar.j(size);
            }
        }
    }

    private static void z(z zVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        h.h.l.w.a(viewGroup, new d(obj, zVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }
}
