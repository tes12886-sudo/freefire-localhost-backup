package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
class u {
    private final m a;
    private final v b;
    private final Fragment c;
    private boolean d = false;
    private int e = -1;

    class a implements View.OnAttachStateChangeListener {
        final /* synthetic */ View a;

        a(u uVar, View view) {
            this.a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.a.removeOnAttachStateChangeListener(this);
            h.h.l.y.K(this.a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[androidx.lifecycle.g.c.values().length];
            a = iArr;
            try {
                iArr[androidx.lifecycle.g.c.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[androidx.lifecycle.g.c.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[androidx.lifecycle.g.c.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[androidx.lifecycle.g.c.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    u(m mVar, v vVar, Fragment fragment) {
        this.a = mVar;
        this.b = vVar;
        this.c = fragment;
    }

    u(m mVar, v vVar, Fragment fragment, t tVar) {
        this.a = mVar;
        this.b = vVar;
        this.c = fragment;
        fragment.c = null;
        fragment.d = null;
        fragment.r = 0;
        fragment.f374o = false;
        fragment.f371l = false;
        Fragment fragment2 = fragment.f367h;
        fragment.f368i = fragment2 != null ? fragment2.f : null;
        fragment.f367h = null;
        Bundle bundle = tVar.f419m;
        fragment.b = bundle == null ? new Bundle() : bundle;
    }

    u(m mVar, v vVar, ClassLoader classLoader, j jVar, t tVar) {
        this.a = mVar;
        this.b = vVar;
        Fragment fragmentA = jVar.a(classLoader, tVar.a);
        this.c = fragmentA;
        Bundle bundle = tVar.f416j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        fragmentA.y1(tVar.f416j);
        fragmentA.f = tVar.b;
        fragmentA.f373n = tVar.c;
        fragmentA.p = true;
        fragmentA.F = tVar.d;
        fragmentA.G = tVar.e;
        fragmentA.H = tVar.f;
        fragmentA.K = tVar.f413g;
        fragmentA.f372m = tVar.f414h;
        fragmentA.J = tVar.f415i;
        fragmentA.I = tVar.f417k;
        fragmentA.Z = androidx.lifecycle.g.c.values()[tVar.f418l];
        Bundle bundle2 = tVar.f419m;
        fragmentA.b = bundle2 == null ? new Bundle() : bundle2;
        if (n.F0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + fragmentA);
        }
    }

    private boolean l(View view) {
        if (view == this.c.Q) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.c.Q) {
                return true;
            }
        }
        return false;
    }

    private Bundle q() {
        Bundle bundle = new Bundle();
        this.c.l1(bundle);
        this.a.j(this.c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.c.Q != null) {
            s();
        }
        if (this.c.c != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.c.c);
        }
        if (this.c.d != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.c.d);
        }
        if (!this.c.S) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.c.S);
        }
        return bundle;
    }

    void a() {
        if (n.F0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.c);
        }
        Fragment fragment = this.c;
        fragment.R0(fragment.b);
        m mVar = this.a;
        Fragment fragment2 = this.c;
        mVar.a(fragment2, fragment2.b, false);
    }

    void b() {
        int iJ = this.b.j(this.c);
        Fragment fragment = this.c;
        fragment.P.addView(fragment.Q, iJ);
    }

    void c() {
        if (n.F0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.c);
        }
        Fragment fragment = this.c;
        Fragment fragment2 = fragment.f367h;
        u uVarM = null;
        if (fragment2 != null) {
            u uVarM2 = this.b.m(fragment2.f);
            if (uVarM2 == null) {
                throw new IllegalStateException("Fragment " + this.c + " declared target fragment " + this.c.f367h + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.c;
            fragment3.f368i = fragment3.f367h.f;
            fragment3.f367h = null;
            uVarM = uVarM2;
        } else {
            String str = fragment.f368i;
            if (str != null && (uVarM = this.b.m(str)) == null) {
                throw new IllegalStateException("Fragment " + this.c + " declared target fragment " + this.c.f368i + " that does not belong to this FragmentManager!");
            }
        }
        if (uVarM != null && (n.P || uVarM.k().a < 1)) {
            uVarM.m();
        }
        Fragment fragment4 = this.c;
        fragment4.t = fragment4.s.t0();
        Fragment fragment5 = this.c;
        fragment5.v = fragment5.s.w0();
        this.a.g(this.c, false);
        this.c.S0();
        this.a.b(this.c, false);
    }

    int d() {
        Fragment fragment;
        ViewGroup viewGroup;
        Fragment fragment2 = this.c;
        if (fragment2.s == null) {
            return fragment2.a;
        }
        int iMin = this.e;
        int i2 = b.a[fragment2.Z.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                iMin = Math.min(iMin, 5);
            } else if (i2 != 3) {
                iMin = i2 != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0);
            } else {
                iMin = Math.min(iMin, 1);
            }
        }
        Fragment fragment3 = this.c;
        if (fragment3.f373n) {
            if (fragment3.f374o) {
                iMin = Math.max(this.e, 2);
                View view = this.c.Q;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.e < 4 ? Math.min(iMin, fragment3.a) : Math.min(iMin, 1);
            }
        }
        if (!this.c.f371l) {
            iMin = Math.min(iMin, 1);
        }
        c0.e.b bVarL = null;
        if (n.P && (viewGroup = (fragment = this.c).P) != null) {
            bVarL = c0.n(viewGroup, fragment.G()).l(this);
        }
        if (bVarL == c0.e.b.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (bVarL == c0.e.b.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            Fragment fragment4 = this.c;
            if (fragment4.f372m) {
                iMin = fragment4.c0() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        Fragment fragment5 = this.c;
        if (fragment5.R && fragment5.a < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (n.F0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + this.c);
        }
        return iMin;
    }

    void e() {
        if (n.F0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.c);
        }
        Fragment fragment = this.c;
        if (fragment.Y) {
            fragment.s1(fragment.b);
            this.c.a = 1;
            return;
        }
        this.a.h(fragment, fragment.b, false);
        Fragment fragment2 = this.c;
        fragment2.V0(fragment2.b);
        m mVar = this.a;
        Fragment fragment3 = this.c;
        mVar.c(fragment3, fragment3.b, false);
    }

    void f() {
        String resourceName;
        if (this.c.f373n) {
            return;
        }
        if (n.F0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.c);
        }
        Fragment fragment = this.c;
        LayoutInflater layoutInflaterB1 = fragment.b1(fragment.b);
        ViewGroup viewGroup = null;
        Fragment fragment2 = this.c;
        ViewGroup viewGroup2 = fragment2.P;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i2 = fragment2.G;
            if (i2 != 0) {
                if (i2 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment2.s.o0().f(this.c.G);
                if (viewGroup == null) {
                    Fragment fragment3 = this.c;
                    if (!fragment3.p) {
                        try {
                            resourceName = fragment3.M().getResourceName(this.c.G);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.c.G) + " (" + resourceName + ") for fragment " + this.c);
                    }
                }
            }
        }
        Fragment fragment4 = this.c;
        fragment4.P = viewGroup;
        fragment4.X0(layoutInflaterB1, viewGroup, fragment4.b);
        View view = this.c.Q;
        if (view != null) {
            boolean z = false;
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.c;
            fragment5.Q.setTag(h.m.b.a, fragment5);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment6 = this.c;
            if (fragment6.I) {
                fragment6.Q.setVisibility(8);
            }
            if (h.h.l.y.z(this.c.Q)) {
                h.h.l.y.K(this.c.Q);
            } else {
                View view2 = this.c.Q;
                view2.addOnAttachStateChangeListener(new a(this, view2));
            }
            this.c.o1();
            m mVar = this.a;
            Fragment fragment7 = this.c;
            mVar.m(fragment7, fragment7.Q, fragment7.b, false);
            int visibility = this.c.Q.getVisibility();
            float alpha = this.c.Q.getAlpha();
            if (n.P) {
                this.c.E1(alpha);
                Fragment fragment8 = this.c;
                if (fragment8.P != null && visibility == 0) {
                    View viewFindFocus = fragment8.Q.findFocus();
                    if (viewFindFocus != null) {
                        this.c.z1(viewFindFocus);
                        if (n.F0(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + this.c);
                        }
                    }
                    this.c.Q.setAlpha(0.0f);
                }
            } else {
                Fragment fragment9 = this.c;
                if (visibility == 0 && fragment9.P != null) {
                    z = true;
                }
                fragment9.U = z;
            }
        }
        this.c.a = 2;
    }

    void g() {
        Fragment fragmentF;
        if (n.F0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.c);
        }
        Fragment fragment = this.c;
        boolean zIsChangingConfigurations = true;
        boolean z = fragment.f372m && !fragment.c0();
        if (!(z || this.b.o().o(this.c))) {
            String str = this.c.f368i;
            if (str != null && (fragmentF = this.b.f(str)) != null && fragmentF.K) {
                this.c.f367h = fragmentF;
            }
            this.c.a = 0;
            return;
        }
        k<?> kVar = this.c.t;
        if (kVar instanceof androidx.lifecycle.y) {
            zIsChangingConfigurations = this.b.o().l();
        } else if (kVar.k() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) kVar.k()).isChangingConfigurations();
        }
        if (z || zIsChangingConfigurations) {
            this.b.o().f(this.c);
        }
        this.c.Y0();
        this.a.d(this.c, false);
        for (u uVar : this.b.k()) {
            if (uVar != null) {
                Fragment fragmentK = uVar.k();
                if (this.c.f.equals(fragmentK.f368i)) {
                    fragmentK.f367h = this.c;
                    fragmentK.f368i = null;
                }
            }
        }
        Fragment fragment2 = this.c;
        String str2 = fragment2.f368i;
        if (str2 != null) {
            fragment2.f367h = this.b.f(str2);
        }
        this.b.q(this);
    }

    void h() {
        View view;
        if (n.F0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.c);
        }
        Fragment fragment = this.c;
        ViewGroup viewGroup = fragment.P;
        if (viewGroup != null && (view = fragment.Q) != null) {
            viewGroup.removeView(view);
        }
        this.c.Z0();
        this.a.n(this.c, false);
        Fragment fragment2 = this.c;
        fragment2.P = null;
        fragment2.Q = null;
        fragment2.b0 = null;
        fragment2.c0.n(null);
        this.c.f374o = false;
    }

    void i() {
        if (n.F0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.c);
        }
        this.c.a1();
        boolean z = false;
        this.a.e(this.c, false);
        Fragment fragment = this.c;
        fragment.a = -1;
        fragment.t = null;
        fragment.v = null;
        fragment.s = null;
        if (fragment.f372m && !fragment.c0()) {
            z = true;
        }
        if (z || this.b.o().o(this.c)) {
            if (n.F0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.c);
            }
            this.c.Y();
        }
    }

    void j() {
        Fragment fragment = this.c;
        if (fragment.f373n && fragment.f374o && !fragment.q) {
            if (n.F0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.c);
            }
            Fragment fragment2 = this.c;
            fragment2.X0(fragment2.b1(fragment2.b), null, this.c.b);
            View view = this.c.Q;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.c;
                fragment3.Q.setTag(h.m.b.a, fragment3);
                Fragment fragment4 = this.c;
                if (fragment4.I) {
                    fragment4.Q.setVisibility(8);
                }
                this.c.o1();
                m mVar = this.a;
                Fragment fragment5 = this.c;
                mVar.m(fragment5, fragment5.Q, fragment5.b, false);
                this.c.a = 2;
            }
        }
    }

    Fragment k() {
        return this.c;
    }

    void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.d) {
            if (n.F0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
                return;
            }
            return;
        }
        try {
            this.d = true;
            while (true) {
                int iD = d();
                Fragment fragment = this.c;
                int i2 = fragment.a;
                if (iD == i2) {
                    if (n.P && fragment.V) {
                        if (fragment.Q != null && (viewGroup = fragment.P) != null) {
                            c0 c0VarN = c0.n(viewGroup, fragment.G());
                            if (this.c.I) {
                                c0VarN.c(this);
                            } else {
                                c0VarN.e(this);
                            }
                        }
                        Fragment fragment2 = this.c;
                        n nVar = fragment2.s;
                        if (nVar != null) {
                            nVar.D0(fragment2);
                        }
                        Fragment fragment3 = this.c;
                        fragment3.V = false;
                        fragment3.A0(fragment3.I);
                    }
                    return;
                }
                if (iD <= i2) {
                    switch (i2 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            g();
                            break;
                        case 1:
                            h();
                            this.c.a = 1;
                            break;
                        case 2:
                            fragment.f374o = false;
                            fragment.a = 2;
                            break;
                        case 3:
                            if (n.F0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.c);
                            }
                            Fragment fragment4 = this.c;
                            if (fragment4.Q != null && fragment4.c == null) {
                                s();
                            }
                            Fragment fragment5 = this.c;
                            if (fragment5.Q != null && (viewGroup3 = fragment5.P) != null) {
                                c0.n(viewGroup3, fragment5.G()).d(this);
                            }
                            this.c.a = 3;
                            break;
                        case 4:
                            v();
                            break;
                        case 5:
                            fragment.a = 5;
                            break;
                        case 6:
                            n();
                            break;
                    }
                } else {
                    switch (i2 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (fragment.Q != null && (viewGroup2 = fragment.P) != null) {
                                c0.n(viewGroup2, fragment.G()).b(c0.e.c.c(this.c.Q.getVisibility()), this);
                            }
                            this.c.a = 4;
                            break;
                        case 5:
                            u();
                            break;
                        case 6:
                            fragment.a = 6;
                            break;
                        case 7:
                            p();
                            break;
                    }
                }
            }
        } finally {
            this.d = false;
        }
    }

    void n() {
        if (n.F0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.c);
        }
        this.c.g1();
        this.a.f(this.c, false);
    }

    void o(ClassLoader classLoader) {
        Bundle bundle = this.c.b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.c;
        fragment.c = fragment.b.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.c;
        fragment2.d = fragment2.b.getBundle("android:view_registry_state");
        Fragment fragment3 = this.c;
        fragment3.f368i = fragment3.b.getString("android:target_state");
        Fragment fragment4 = this.c;
        if (fragment4.f368i != null) {
            fragment4.f369j = fragment4.b.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.c;
        Boolean bool = fragment5.e;
        if (bool != null) {
            fragment5.S = bool.booleanValue();
            this.c.e = null;
        } else {
            fragment5.S = fragment5.b.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.c;
        if (fragment6.S) {
            return;
        }
        fragment6.R = true;
    }

    void p() {
        if (n.F0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.c);
        }
        View viewZ = this.c.z();
        if (viewZ != null && l(viewZ)) {
            boolean zRequestFocus = viewZ.requestFocus();
            if (n.F0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(viewZ);
                sb.append(" ");
                sb.append(zRequestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(this.c);
                sb.append(" resulting in focused view ");
                sb.append(this.c.Q.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.c.z1(null);
        this.c.k1();
        this.a.i(this.c, false);
        Fragment fragment = this.c;
        fragment.b = null;
        fragment.c = null;
        fragment.d = null;
    }

    t r() {
        t tVar = new t(this.c);
        Fragment fragment = this.c;
        if (fragment.a <= -1 || tVar.f419m != null) {
            tVar.f419m = fragment.b;
        } else {
            Bundle bundleQ = q();
            tVar.f419m = bundleQ;
            if (this.c.f368i != null) {
                if (bundleQ == null) {
                    tVar.f419m = new Bundle();
                }
                tVar.f419m.putString("android:target_state", this.c.f368i);
                int i2 = this.c.f369j;
                if (i2 != 0) {
                    tVar.f419m.putInt("android:target_req_state", i2);
                }
            }
        }
        return tVar;
    }

    void s() {
        if (this.c.Q == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.c.Q.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.c.c = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.c.b0.h(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.c.d = bundle;
    }

    void t(int i2) {
        this.e = i2;
    }

    void u() {
        if (n.F0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.c);
        }
        this.c.m1();
        this.a.k(this.c, false);
    }

    void v() {
        if (n.F0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.c);
        }
        this.c.n1();
        this.a.l(this.c, false);
    }
}
