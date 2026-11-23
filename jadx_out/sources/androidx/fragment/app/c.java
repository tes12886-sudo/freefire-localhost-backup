package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class c extends c0 {

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c0.e.c.values().length];
            a = iArr;
            try {
                iArr[c0.e.c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c0.e.c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c0.e.c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c0.e.c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    class b implements Runnable {
        final /* synthetic */ List a;
        final /* synthetic */ c0.e b;

        b(List list, c0.e eVar) {
            this.a = list;
            this.b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a.contains(this.b)) {
                this.a.remove(this.b);
                c.this.s(this.b);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.c$c, reason: collision with other inner class name */
    class C0021c extends AnimatorListenerAdapter {
        final /* synthetic */ ViewGroup a;
        final /* synthetic */ View b;
        final /* synthetic */ boolean c;
        final /* synthetic */ c0.e d;
        final /* synthetic */ k e;

        C0021c(c cVar, ViewGroup viewGroup, View view, boolean z, c0.e eVar, k kVar) {
            this.a = viewGroup;
            this.b = view;
            this.c = z;
            this.d = eVar;
            this.e = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.endViewTransition(this.b);
            if (this.c) {
                this.d.e().a(this.b);
            }
            this.e.a();
        }
    }

    class d implements h.h.h.b.a {
        final /* synthetic */ Animator a;

        d(c cVar, Animator animator) {
            this.a = animator;
        }

        @Override // h.h.h.b.a
        public void a() {
            this.a.end();
        }
    }

    class e implements Animation.AnimationListener {
        final /* synthetic */ ViewGroup a;
        final /* synthetic */ View b;
        final /* synthetic */ k c;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.a.endViewTransition(eVar.b);
                e.this.c.a();
            }
        }

        e(c cVar, ViewGroup viewGroup, View view, k kVar) {
            this.a = viewGroup;
            this.b = view;
            this.c = kVar;
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

    class f implements h.h.h.b.a {
        final /* synthetic */ View a;
        final /* synthetic */ ViewGroup b;
        final /* synthetic */ k c;

        f(c cVar, View view, ViewGroup viewGroup, k kVar) {
            this.a = view;
            this.b = viewGroup;
            this.c = kVar;
        }

        @Override // h.h.h.b.a
        public void a() {
            this.a.clearAnimation();
            this.b.endViewTransition(this.a);
            this.c.a();
        }
    }

    class g implements Runnable {
        final /* synthetic */ c0.e a;
        final /* synthetic */ c0.e b;
        final /* synthetic */ boolean c;
        final /* synthetic */ h.f.a d;

        g(c cVar, c0.e eVar, c0.e eVar2, boolean z, h.f.a aVar) {
            this.a = eVar;
            this.b = eVar2;
            this.c = z;
            this.d = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            x.f(this.a.f(), this.b.f(), this.c, this.d, false);
        }
    }

    class h implements Runnable {
        final /* synthetic */ z a;
        final /* synthetic */ View b;
        final /* synthetic */ Rect c;

        h(c cVar, z zVar, View view, Rect rect) {
            this.a = zVar;
            this.b = view;
            this.c = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.k(this.b, this.c);
        }
    }

    class i implements Runnable {
        final /* synthetic */ ArrayList a;

        i(c cVar, ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            x.B(this.a, 4);
        }
    }

    class j implements Runnable {
        final /* synthetic */ m a;

        j(c cVar, m mVar) {
            this.a = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a();
        }
    }

    private static class k extends l {
        private boolean c;
        private boolean d;
        private androidx.fragment.app.f.d e;

        k(c0.e eVar, h.h.h.b bVar, boolean z) {
            super(eVar, bVar);
            this.d = false;
            this.c = z;
        }

        androidx.fragment.app.f.d e(Context context) {
            if (this.d) {
                return this.e;
            }
            androidx.fragment.app.f.d dVarC = androidx.fragment.app.f.c(context, b().f(), b().e() == c0.e.c.VISIBLE, this.c);
            this.e = dVarC;
            this.d = true;
            return dVarC;
        }
    }

    private static class l {
        private final c0.e a;
        private final h.h.h.b b;

        l(c0.e eVar, h.h.h.b bVar) {
            this.a = eVar;
            this.b = bVar;
        }

        void a() {
            this.a.d(this.b);
        }

        c0.e b() {
            return this.a;
        }

        h.h.h.b c() {
            return this.b;
        }

        boolean d() {
            c0.e.c cVar;
            c0.e.c cVarD = c0.e.c.d(this.a.f().Q);
            c0.e.c cVarE = this.a.e();
            return cVarD == cVarE || !(cVarD == (cVar = c0.e.c.VISIBLE) || cVarE == cVar);
        }
    }

    private static class m extends l {
        private final Object c;
        private final boolean d;
        private final Object e;

        m(c0.e eVar, h.h.h.b bVar, boolean z, boolean z2) {
            boolean zO;
            Object objQ;
            super(eVar, bVar);
            if (eVar.e() == c0.e.c.VISIBLE) {
                Fragment fragmentF = eVar.f();
                this.c = z ? fragmentF.L() : fragmentF.u();
                Fragment fragmentF2 = eVar.f();
                zO = z ? fragmentF2.o() : fragmentF2.n();
            } else {
                Fragment fragmentF3 = eVar.f();
                this.c = z ? fragmentF3.O() : fragmentF3.x();
                zO = true;
            }
            this.d = zO;
            if (z2) {
                Fragment fragmentF4 = eVar.f();
                objQ = z ? fragmentF4.Q() : fragmentF4.P();
            } else {
                objQ = null;
            }
            this.e = objQ;
        }

        private z f(Object obj) {
            if (obj == null) {
                return null;
            }
            z zVar = x.b;
            if (zVar != null && zVar.e(obj)) {
                return zVar;
            }
            z zVar2 = x.c;
            if (zVar2 != null && zVar2.e(obj)) {
                return zVar2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().f() + " is not a valid framework Transition or AndroidX Transition");
        }

        z e() {
            z zVarF = f(this.c);
            z zVarF2 = f(this.e);
            if (zVarF == null || zVarF2 == null || zVarF == zVarF2) {
                return zVarF != null ? zVarF : zVarF2;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().f() + " returned Transition " + this.c + " which uses a different Transition  type than its shared element transition " + this.e);
        }

        public Object g() {
            return this.e;
        }

        Object h() {
            return this.c;
        }

        public boolean i() {
            return this.e != null;
        }

        boolean j() {
            return this.d;
        }
    }

    c(ViewGroup viewGroup) {
        super(viewGroup);
    }

    private void w(List<k> list, List<c0.e> list2, boolean z, Map<c0.e, Boolean> map) {
        StringBuilder sb;
        String str;
        androidx.fragment.app.f.d dVarE;
        ViewGroup viewGroupM = m();
        Context context = viewGroupM.getContext();
        ArrayList<k> arrayList = new ArrayList();
        boolean z2 = false;
        for (k kVar : list) {
            if (kVar.d() || (dVarE = kVar.e(context)) == null) {
                kVar.a();
            } else {
                Animator animator = dVarE.b;
                if (animator == null) {
                    arrayList.add(kVar);
                } else {
                    c0.e eVarB = kVar.b();
                    Fragment fragmentF = eVarB.f();
                    if (Boolean.TRUE.equals(map.get(eVarB))) {
                        if (n.F0(2)) {
                            Log.v("FragmentManager", "Ignoring Animator set on " + fragmentF + " as this Fragment was involved in a Transition.");
                        }
                        kVar.a();
                    } else {
                        boolean z3 = eVarB.e() == c0.e.c.GONE;
                        if (z3) {
                            list2.remove(eVarB);
                        }
                        View view = fragmentF.Q;
                        viewGroupM.startViewTransition(view);
                        animator.addListener(new C0021c(this, viewGroupM, view, z3, eVarB, kVar));
                        animator.setTarget(view);
                        animator.start();
                        kVar.c().c(new d(this, animator));
                        z2 = true;
                    }
                }
            }
        }
        for (k kVar2 : arrayList) {
            c0.e eVarB2 = kVar2.b();
            Fragment fragmentF2 = eVarB2.f();
            if (z) {
                if (n.F0(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(fragmentF2);
                    str = " as Animations cannot run alongside Transitions.";
                    sb.append(str);
                    Log.v("FragmentManager", sb.toString());
                }
                kVar2.a();
            } else if (z2) {
                if (n.F0(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(fragmentF2);
                    str = " as Animations cannot run alongside Animators.";
                    sb.append(str);
                    Log.v("FragmentManager", sb.toString());
                }
                kVar2.a();
            } else {
                View view2 = fragmentF2.Q;
                androidx.fragment.app.f.d dVarE2 = kVar2.e(context);
                h.h.k.e.f(dVarE2);
                Animation animation = dVarE2.a;
                h.h.k.e.f(animation);
                Animation animation2 = animation;
                if (eVarB2.e() != c0.e.c.REMOVED) {
                    view2.startAnimation(animation2);
                    kVar2.a();
                } else {
                    viewGroupM.startViewTransition(view2);
                    androidx.fragment.app.f.e eVar = new androidx.fragment.app.f.e(animation2, viewGroupM, view2);
                    eVar.setAnimationListener(new e(this, viewGroupM, view2, kVar2));
                    view2.startAnimation(eVar);
                }
                kVar2.c().c(new f(this, view2, viewGroupM, kVar2));
            }
        }
    }

    private Map<c0.e, Boolean> x(List<m> list, List<c0.e> list2, boolean z, c0.e eVar, c0.e eVar2) {
        View view;
        Boolean bool;
        View view2;
        Object obj;
        Object obj2;
        View view3;
        ArrayList<View> arrayList;
        Rect rect;
        Boolean bool2;
        HashMap map;
        View view4;
        ArrayList<View> arrayList2;
        c cVar;
        c0.e eVar3;
        Boolean bool3;
        androidx.core.app.o oVarV;
        androidx.core.app.o oVarY;
        Boolean bool4;
        int i2;
        View view5;
        String strQ;
        Boolean bool5;
        c cVar2 = this;
        c0.e eVar4 = eVar;
        c0.e eVar5 = eVar2;
        Boolean bool6 = Boolean.TRUE;
        Boolean bool7 = Boolean.FALSE;
        HashMap map2 = new HashMap();
        z zVar = null;
        for (m mVar : list) {
            if (!mVar.d()) {
                z zVarE = mVar.e();
                if (zVar == null) {
                    zVar = zVarE;
                } else if (zVarE != null && zVar != zVarE) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mVar.b().f() + " returned Transition " + mVar.h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (zVar == null) {
            for (m mVar2 : list) {
                map2.put(mVar2.b(), bool7);
                mVar2.a();
            }
            return map2;
        }
        View view6 = new View(m().getContext());
        Rect rect2 = new Rect();
        ArrayList<View> arrayList3 = new ArrayList<>();
        ArrayList<View> arrayList4 = new ArrayList<>();
        h.f.a aVar = new h.f.a();
        Iterator<m> it = list.iterator();
        Object obj3 = null;
        View view7 = null;
        boolean z2 = false;
        while (true) {
            view = view7;
            if (!it.hasNext()) {
                break;
            }
            m next = it.next();
            if (!next.i() || eVar4 == null || eVar5 == null) {
                arrayList = arrayList3;
                rect = rect2;
                bool2 = bool7;
                map = map2;
                view4 = view6;
                arrayList2 = arrayList4;
                cVar = cVar2;
                eVar3 = eVar4;
                bool3 = bool6;
                view7 = view;
            } else {
                Object objB = zVar.B(zVar.g(next.g()));
                ArrayList<String> arrayListR = eVar2.f().R();
                ArrayList<String> arrayListR2 = eVar.f().R();
                ArrayList<String> arrayListS = eVar.f().S();
                Rect rect3 = rect2;
                bool2 = bool7;
                int i3 = 0;
                while (i3 < arrayListS.size()) {
                    int iIndexOf = arrayListR.indexOf(arrayListS.get(i3));
                    ArrayList<String> arrayList5 = arrayListS;
                    if (iIndexOf != -1) {
                        arrayListR.set(iIndexOf, arrayListR2.get(i3));
                    }
                    i3++;
                    arrayListS = arrayList5;
                }
                ArrayList<String> arrayListS2 = eVar2.f().S();
                Fragment fragmentF = eVar.f();
                if (z == 0) {
                    oVarV = fragmentF.y();
                    oVarY = eVar2.f().v();
                } else {
                    oVarV = fragmentF.v();
                    oVarY = eVar2.f().y();
                }
                int i4 = 0;
                for (int size = arrayListR.size(); i4 < size; size = size) {
                    aVar.put(arrayListR.get(i4), arrayListS2.get(i4));
                    i4++;
                }
                h.f.a<String, View> aVar2 = new h.f.a<>();
                cVar2.u(aVar2, eVar.f().Q);
                aVar2.n(arrayListR);
                if (oVarV != null) {
                    oVarV.a(arrayListR, aVar2);
                    int size2 = arrayListR.size() - 1;
                    while (size2 >= 0) {
                        String str = arrayListR.get(size2);
                        View view8 = aVar2.get(str);
                        if (view8 == null) {
                            aVar.remove(str);
                            bool5 = bool6;
                        } else {
                            bool5 = bool6;
                            if (!str.equals(h.h.l.y.v(view8))) {
                                aVar.put(h.h.l.y.v(view8), (String) aVar.remove(str));
                            }
                        }
                        size2--;
                        bool6 = bool5;
                    }
                    bool4 = bool6;
                } else {
                    bool4 = bool6;
                    aVar.n(aVar2.keySet());
                }
                h.f.a<String, View> aVar3 = new h.f.a<>();
                cVar2.u(aVar3, eVar2.f().Q);
                aVar3.n(arrayListS2);
                aVar3.n(aVar.values());
                if (oVarY != null) {
                    oVarY.a(arrayListS2, aVar3);
                    for (int size3 = arrayListS2.size() - 1; size3 >= 0; size3--) {
                        String str2 = arrayListS2.get(size3);
                        View view9 = aVar3.get(str2);
                        if (view9 == null) {
                            String strQ2 = x.q(aVar, str2);
                            if (strQ2 != null) {
                                aVar.remove(strQ2);
                            }
                        } else if (!str2.equals(h.h.l.y.v(view9)) && (strQ = x.q(aVar, str2)) != null) {
                            aVar.put(strQ, h.h.l.y.v(view9));
                        }
                    }
                } else {
                    x.y(aVar, aVar3);
                }
                cVar2.v(aVar2, aVar.keySet());
                cVar2.v(aVar3, aVar.values());
                if (aVar.isEmpty()) {
                    arrayList3.clear();
                    arrayList4.clear();
                    eVar5 = eVar2;
                    arrayList = arrayList3;
                    map = map2;
                    view4 = view6;
                    rect = rect3;
                    view7 = view;
                    bool3 = bool4;
                    obj3 = null;
                    arrayList2 = arrayList4;
                    cVar = cVar2;
                    eVar3 = eVar;
                } else {
                    x.f(eVar2.f(), eVar.f(), z, aVar2, true);
                    HashMap map3 = map2;
                    arrayList2 = arrayList4;
                    View view10 = view6;
                    ArrayList<View> arrayList6 = arrayList3;
                    h.h.l.w.a(m(), new g(this, eVar2, eVar, z, aVar3));
                    arrayList6.addAll(aVar2.values());
                    if (arrayListR.isEmpty()) {
                        i2 = 0;
                        view7 = view;
                    } else {
                        i2 = 0;
                        View view11 = aVar2.get(arrayListR.get(0));
                        zVar.v(objB, view11);
                        view7 = view11;
                    }
                    arrayList2.addAll(aVar3.values());
                    if (arrayListS2.isEmpty() || (view5 = aVar3.get(arrayListS2.get(i2))) == null) {
                        cVar = this;
                        rect = rect3;
                    } else {
                        cVar = this;
                        rect = rect3;
                        h.h.l.w.a(m(), new h(cVar, zVar, view5, rect));
                        z2 = true;
                    }
                    zVar.z(objB, view10, arrayList6);
                    view4 = view10;
                    arrayList = arrayList6;
                    zVar.t(objB, null, null, null, null, objB, arrayList2);
                    eVar3 = eVar;
                    bool3 = bool4;
                    map = map3;
                    map.put(eVar3, bool3);
                    eVar5 = eVar2;
                    map.put(eVar5, bool3);
                    obj3 = objB;
                }
            }
            view6 = view4;
            zVar = zVar;
            bool6 = bool3;
            bool7 = bool2;
            rect2 = rect;
            eVar4 = eVar3;
            arrayList3 = arrayList;
            cVar2 = cVar;
            arrayList4 = arrayList2;
            aVar = aVar;
            map2 = map;
        }
        h.f.a aVar4 = aVar;
        ArrayList<View> arrayList7 = arrayList3;
        Rect rect4 = rect2;
        Boolean bool8 = bool7;
        HashMap map4 = map2;
        View view12 = view6;
        z zVar2 = zVar;
        ArrayList<View> arrayList8 = arrayList4;
        c cVar3 = cVar2;
        c0.e eVar6 = eVar4;
        Boolean bool9 = bool6;
        ArrayList arrayList9 = new ArrayList();
        Object objN = null;
        Object objN2 = null;
        for (Iterator<m> it2 = list.iterator(); it2.hasNext(); it2 = it2) {
            m next2 = it2.next();
            if (next2.d()) {
                map4.put(next2.b(), bool8);
                next2.a();
            } else {
                Boolean bool10 = bool8;
                Object objG = zVar2.g(next2.h());
                Object obj4 = objN;
                c0.e eVarB = next2.b();
                boolean z3 = obj3 != null && (eVarB == eVar6 || eVarB == eVar5);
                if (objG == null) {
                    if (!z3) {
                        map4.put(eVarB, bool10);
                        next2.a();
                    }
                    view2 = view12;
                    arrayList7 = arrayList7;
                    bool = bool10;
                    view3 = view;
                    objN = obj4;
                } else {
                    bool = bool10;
                    ArrayList<View> arrayList10 = new ArrayList<>();
                    Object obj5 = objN2;
                    cVar3.t(arrayList10, eVarB.f().Q);
                    if (z3) {
                        if (eVarB == eVar6) {
                            arrayList10.removeAll(arrayList7);
                        } else {
                            arrayList10.removeAll(arrayList8);
                        }
                    }
                    if (arrayList10.isEmpty()) {
                        zVar2.a(objG, view12);
                        view2 = view12;
                        obj2 = objG;
                        obj = obj5;
                    } else {
                        zVar2.b(objG, arrayList10);
                        view2 = view12;
                        obj = obj5;
                        zVar2.t(objG, objG, arrayList10, null, null, null, null);
                        if (eVarB.e() == c0.e.c.GONE) {
                            list2.remove(eVarB);
                            ArrayList<View> arrayList11 = new ArrayList<>(arrayList10);
                            arrayList11.remove(eVarB.f().Q);
                            obj2 = objG;
                            zVar2.r(obj2, eVarB.f().Q, arrayList11);
                            h.h.l.w.a(m(), new i(cVar3, arrayList10));
                        } else {
                            obj2 = objG;
                        }
                    }
                    if (eVarB.e() == c0.e.c.VISIBLE) {
                        arrayList9.addAll(arrayList10);
                        if (z2) {
                            zVar2.u(obj2, rect4);
                        }
                        view3 = view;
                    } else {
                        view3 = view;
                        zVar2.v(obj2, view3);
                    }
                    map4.put(eVarB, bool9);
                    if (next2.j()) {
                        objN2 = obj;
                        objN = zVar2.n(obj4, obj2, null);
                    } else {
                        objN = obj4;
                        objN2 = zVar2.n(obj, obj2, null);
                    }
                }
                view = view3;
                arrayList7 = arrayList7;
                bool8 = bool;
                view12 = view2;
            }
        }
        ArrayList<View> arrayList12 = arrayList7;
        Object objM = zVar2.m(objN, objN2, obj3);
        for (m mVar3 : list) {
            if (!mVar3.d()) {
                Object objH = mVar3.h();
                c0.e eVarB2 = mVar3.b();
                boolean z4 = obj3 != null && (eVarB2 == eVar6 || eVarB2 == eVar5);
                if (objH != null || z4) {
                    if (h.h.l.y.A(m())) {
                        zVar2.w(mVar3.b().f(), objM, mVar3.c(), new j(cVar3, mVar3));
                    } else {
                        if (n.F0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Container " + m() + " has not been laid out. Completing operation " + eVarB2);
                        }
                        mVar3.a();
                    }
                }
            }
        }
        if (!h.h.l.y.A(m())) {
            return map4;
        }
        x.B(arrayList9, 4);
        ArrayList<String> arrayListO = zVar2.o(arrayList8);
        zVar2.c(m(), objM);
        zVar2.y(m(), arrayList12, arrayList8, arrayListO, aVar4);
        x.B(arrayList9, 0);
        zVar2.A(obj3, arrayList12, arrayList8);
        return map4;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0085  */
    @Override // androidx.fragment.app.c0
    void f(List<c0.e> list, boolean z) {
        c0.e eVar = null;
        c0.e eVar2 = null;
        for (c0.e eVar3 : list) {
            c0.e.c cVarD = c0.e.c.d(eVar3.f().Q);
            int i2 = a.a[eVar3.e().ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                if (cVarD == c0.e.c.VISIBLE && eVar == null) {
                    eVar = eVar3;
                }
            } else if (i2 == 4 && cVarD != c0.e.c.VISIBLE) {
                eVar2 = eVar3;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(list);
        for (c0.e eVar4 : list) {
            h.h.h.b bVar = new h.h.h.b();
            eVar4.j(bVar);
            arrayList.add(new k(eVar4, bVar, z));
            h.h.h.b bVar2 = new h.h.h.b();
            eVar4.j(bVar2);
            boolean z2 = false;
            if (z) {
                if (eVar4 == eVar) {
                    z2 = true;
                }
            } else if (eVar4 == eVar2) {
                z2 = true;
            }
            arrayList2.add(new m(eVar4, bVar2, z, z2));
            eVar4.a(new b(arrayList3, eVar4));
        }
        Map<c0.e, Boolean> mapX = x(arrayList2, arrayList3, z, eVar, eVar2);
        w(arrayList, arrayList3, mapX.containsValue(Boolean.TRUE), mapX);
        Iterator<c0.e> it = arrayList3.iterator();
        while (it.hasNext()) {
            s(it.next());
        }
        arrayList3.clear();
    }

    void s(c0.e eVar) {
        eVar.e().a(eVar.f().Q);
    }

    void t(ArrayList<View> arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (h.h.l.a0.a(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                t(arrayList, childAt);
            }
        }
    }

    void u(Map<String, View> map, View view) {
        String strV = h.h.l.y.v(view);
        if (strV != null) {
            map.put(strV, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    u(map, childAt);
                }
            }
        }
    }

    void v(h.f.a<String, View> aVar, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = aVar.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(h.h.l.y.v(it.next().getValue()))) {
                it.remove();
            }
        }
    }
}
