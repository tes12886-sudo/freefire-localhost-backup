package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.LiveData;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.k, androidx.lifecycle.y, androidx.savedstate.c {
    static final Object g0 = new Object();
    int F;
    int G;
    String H;
    boolean I;
    boolean J;
    boolean K;
    boolean L;
    boolean M;
    private boolean O;
    ViewGroup P;
    View Q;
    boolean R;
    d T;
    boolean U;
    boolean V;
    float W;
    LayoutInflater X;
    boolean Y;
    androidx.lifecycle.l a0;
    Bundle b;
    a0 b0;
    SparseArray<Parcelable> c;
    Bundle d;
    androidx.savedstate.b d0;
    Boolean e;
    private int e0;
    private final ArrayList<f> f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Bundle f366g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Fragment f367h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f369j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f371l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f372m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f373n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f374o;
    boolean p;
    boolean q;
    int r;
    n s;
    k<?> t;
    Fragment v;
    int a = -1;
    String f = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    String f368i = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Boolean f370k = null;
    n u = new o();
    boolean N = true;
    boolean S = true;
    androidx.lifecycle.g.c Z = androidx.lifecycle.g.c.RESUMED;
    androidx.lifecycle.p<androidx.lifecycle.k> c0 = new androidx.lifecycle.p<>();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.g(false);
        }
    }

    class b implements Runnable {
        final /* synthetic */ c0 a;

        b(Fragment fragment, c0 c0Var) {
            this.a = c0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.g();
        }
    }

    class c extends androidx.fragment.app.g {
        c() {
        }

        @Override // androidx.fragment.app.g
        public View f(int i2) {
            View view = Fragment.this.Q;
            if (view != null) {
                return view.findViewById(i2);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        @Override // androidx.fragment.app.g
        public boolean g() {
            return Fragment.this.Q != null;
        }
    }

    static class d {
        View a;
        Animator b;
        boolean c;
        int d;
        int e;
        int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f375g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f376h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        ArrayList<String> f377i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        ArrayList<String> f378j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f379k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f380l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f381m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f382n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f383o;
        Object p;
        Boolean q;
        Boolean r;
        androidx.core.app.o s;
        androidx.core.app.o t;
        float u;
        View v;
        boolean w;
        g x;
        boolean y;

        d() {
            Object obj = Fragment.g0;
            this.f380l = obj;
            this.f381m = null;
            this.f382n = obj;
            this.f383o = null;
            this.p = obj;
            this.u = 1.0f;
            this.v = null;
        }
    }

    public static class e extends RuntimeException {
        public e(String str, Exception exc) {
            super(str, exc);
        }
    }

    private static abstract class f {
        private f() {
        }

        abstract void a();
    }

    interface g {
        void a();

        void b();
    }

    public Fragment() {
        new AtomicInteger();
        this.f0 = new ArrayList<>();
        X();
    }

    private int D() {
        androidx.lifecycle.g.c cVar = this.Z;
        return (cVar == androidx.lifecycle.g.c.INITIALIZED || this.v == null) ? cVar.ordinal() : Math.min(cVar.ordinal(), this.v.D());
    }

    private void X() {
        this.a0 = new androidx.lifecycle.l(this);
        this.d0 = androidx.savedstate.b.a(this);
    }

    @Deprecated
    public static Fragment Z(Context context, String str, Bundle bundle) {
        try {
            Fragment fragmentNewInstance = j.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragmentNewInstance.getClass().getClassLoader());
                fragmentNewInstance.y1(bundle);
            }
            return fragmentNewInstance;
        } catch (IllegalAccessException e2) {
            throw new e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new e("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new e("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }

    private d k() {
        if (this.T == null) {
            this.T = new d();
        }
        return this.T;
    }

    private void t1() {
        if (n.F0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.Q != null) {
            u1(this.b);
        }
        this.b = null;
    }

    @Deprecated
    public final n A() {
        return this.s;
    }

    public void A0(boolean z) {
    }

    void A1(boolean z) {
        k().y = z;
    }

    public final Object B() {
        k<?> kVar = this.t;
        if (kVar == null) {
            return null;
        }
        return kVar.m();
    }

    @Deprecated
    public void B0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.O = true;
    }

    void B1(int i2) {
        if (this.T == null && i2 == 0) {
            return;
        }
        k();
        this.T.f376h = i2;
    }

    @Deprecated
    public LayoutInflater C(Bundle bundle) {
        k<?> kVar = this.t;
        if (kVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterN = kVar.n();
        h.h.l.i.b(layoutInflaterN, this.u.u0());
        return layoutInflaterN;
    }

    public void C0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.O = true;
        k<?> kVar = this.t;
        Activity activityI = kVar == null ? null : kVar.i();
        if (activityI != null) {
            this.O = false;
            B0(activityI, attributeSet, bundle);
        }
    }

    void C1(g gVar) {
        k();
        d dVar = this.T;
        g gVar2 = dVar.x;
        if (gVar == gVar2) {
            return;
        }
        if (gVar != null && gVar2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if (dVar.w) {
            dVar.x = gVar;
        }
        if (gVar != null) {
            gVar.b();
        }
    }

    public void D0(boolean z) {
    }

    void D1(boolean z) {
        if (this.T == null) {
            return;
        }
        k().c = z;
    }

    int E() {
        d dVar = this.T;
        if (dVar == null) {
            return 0;
        }
        return dVar.f376h;
    }

    public boolean E0(MenuItem menuItem) {
        return false;
    }

    void E1(float f2) {
        k().u = f2;
    }

    public final Fragment F() {
        return this.v;
    }

    public void F0(Menu menu) {
    }

    @Deprecated
    public void F1(boolean z) {
        this.K = z;
        n nVar = this.s;
        if (nVar == null) {
            this.L = true;
        } else if (z) {
            nVar.i(this);
        } else {
            nVar.c1(this);
        }
    }

    public final n G() {
        n nVar = this.s;
        if (nVar != null) {
            return nVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public void G0() {
        this.O = true;
    }

    void G1(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        k();
        d dVar = this.T;
        dVar.f377i = arrayList;
        dVar.f378j = arrayList2;
    }

    boolean H() {
        d dVar = this.T;
        if (dVar == null) {
            return false;
        }
        return dVar.c;
    }

    public void H0(boolean z) {
    }

    @Deprecated
    public void H1(@SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        if (this.t != null) {
            G().L0(this, intent, i2, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    int I() {
        d dVar = this.T;
        if (dVar == null) {
            return 0;
        }
        return dVar.f;
    }

    public void I0(Menu menu) {
    }

    public void I1() {
        if (this.T == null || !k().w) {
            return;
        }
        if (this.t == null) {
            k().w = false;
        } else if (Looper.myLooper() != this.t.l().getLooper()) {
            this.t.l().postAtFrontOfQueue(new a());
        } else {
            g(true);
        }
    }

    int J() {
        d dVar = this.T;
        if (dVar == null) {
            return 0;
        }
        return dVar.f375g;
    }

    public void J0(boolean z) {
    }

    float K() {
        d dVar = this.T;
        if (dVar == null) {
            return 1.0f;
        }
        return dVar.u;
    }

    @Deprecated
    public void K0(int i2, String[] strArr, int[] iArr) {
    }

    public Object L() {
        d dVar = this.T;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f382n;
        return obj == g0 ? x() : obj;
    }

    public void L0() {
        this.O = true;
    }

    public final Resources M() {
        return q1().getResources();
    }

    public void M0(Bundle bundle) {
    }

    @Deprecated
    public final boolean N() {
        return this.K;
    }

    public void N0() {
        this.O = true;
    }

    public Object O() {
        d dVar = this.T;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f380l;
        return obj == g0 ? u() : obj;
    }

    public void O0() {
        this.O = true;
    }

    public Object P() {
        d dVar = this.T;
        if (dVar == null) {
            return null;
        }
        return dVar.f383o;
    }

    public void P0(View view, Bundle bundle) {
    }

    public Object Q() {
        d dVar = this.T;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.p;
        return obj == g0 ? P() : obj;
    }

    public void Q0(Bundle bundle) {
        this.O = true;
    }

    ArrayList<String> R() {
        ArrayList<String> arrayList;
        d dVar = this.T;
        return (dVar == null || (arrayList = dVar.f377i) == null) ? new ArrayList<>() : arrayList;
    }

    void R0(Bundle bundle) {
        this.u.R0();
        this.a = 3;
        this.O = false;
        k0(bundle);
        if (this.O) {
            t1();
            this.u.z();
        } else {
            throw new e0("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    ArrayList<String> S() {
        ArrayList<String> arrayList;
        d dVar = this.T;
        return (dVar == null || (arrayList = dVar.f378j) == null) ? new ArrayList<>() : arrayList;
    }

    void S0() {
        Iterator<f> it = this.f0.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f0.clear();
        this.u.k(this.t, h(), this);
        this.a = 0;
        this.O = false;
        n0(this.t.k());
        if (this.O) {
            this.s.J(this);
            this.u.A();
        } else {
            throw new e0("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    public final String T(int i2) {
        return M().getString(i2);
    }

    void T0(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.u.B(configuration);
    }

    @Deprecated
    public final Fragment U() {
        String str;
        Fragment fragment = this.f367h;
        if (fragment != null) {
            return fragment;
        }
        n nVar = this.s;
        if (nVar == null || (str = this.f368i) == null) {
            return null;
        }
        return nVar.g0(str);
    }

    boolean U0(MenuItem menuItem) {
        if (this.I) {
            return false;
        }
        if (p0(menuItem)) {
            return true;
        }
        return this.u.C(menuItem);
    }

    public View V() {
        return this.Q;
    }

    void V0(Bundle bundle) {
        this.u.R0();
        this.a = 1;
        this.O = false;
        if (Build.VERSION.SDK_INT >= 19) {
            this.a0.a(new androidx.lifecycle.i() { // from class: androidx.fragment.app.Fragment.5
                @Override // androidx.lifecycle.i
                public void d(androidx.lifecycle.k kVar, androidx.lifecycle.g.b bVar) {
                    View view;
                    if (bVar != androidx.lifecycle.g.b.ON_STOP || (view = Fragment.this.Q) == null) {
                        return;
                    }
                    view.cancelPendingInputEvents();
                }
            });
        }
        this.d0.c(bundle);
        q0(bundle);
        this.Y = true;
        if (this.O) {
            this.a0.h(androidx.lifecycle.g.b.ON_CREATE);
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onCreate()");
    }

    public LiveData<androidx.lifecycle.k> W() {
        return this.c0;
    }

    boolean W0(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.I) {
            return false;
        }
        if (this.M && this.N) {
            z = true;
            t0(menu, menuInflater);
        }
        return z | this.u.E(menu, menuInflater);
    }

    void X0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.u.R0();
        this.q = true;
        this.b0 = new a0(this, j());
        View viewU0 = u0(layoutInflater, viewGroup, bundle);
        this.Q = viewU0;
        if (viewU0 == null) {
            if (this.b0.f()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.b0 = null;
        } else {
            this.b0.e();
            androidx.lifecycle.z.a(this.Q, this.b0);
            androidx.lifecycle.a0.a(this.Q, this.b0);
            androidx.savedstate.d.a(this.Q, this.b0);
            this.c0.n(this.b0);
        }
    }

    void Y() {
        X();
        this.f = UUID.randomUUID().toString();
        this.f371l = false;
        this.f372m = false;
        this.f373n = false;
        this.f374o = false;
        this.p = false;
        this.r = 0;
        this.s = null;
        this.u = new o();
        this.t = null;
        this.F = 0;
        this.G = 0;
        this.H = null;
        this.I = false;
        this.J = false;
    }

    void Y0() {
        this.u.F();
        this.a0.h(androidx.lifecycle.g.b.ON_DESTROY);
        this.a = 0;
        this.O = false;
        this.Y = false;
        v0();
        if (this.O) {
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onDestroy()");
    }

    void Z0() {
        this.u.G();
        if (this.Q != null && this.b0.a().b().a(androidx.lifecycle.g.c.CREATED)) {
            this.b0.b(androidx.lifecycle.g.b.ON_DESTROY);
        }
        this.a = 1;
        this.O = false;
        x0();
        if (this.O) {
            h.p.a.a.b(this).d();
            this.q = false;
        } else {
            throw new e0("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    @Override // androidx.lifecycle.k
    public androidx.lifecycle.g a() {
        return this.a0;
    }

    public final boolean a0() {
        return this.t != null && this.f371l;
    }

    void a1() {
        this.a = -1;
        this.O = false;
        y0();
        this.X = null;
        if (this.O) {
            if (this.u.E0()) {
                return;
            }
            this.u.F();
            this.u = new o();
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onDetach()");
    }

    boolean b0() {
        d dVar = this.T;
        if (dVar == null) {
            return false;
        }
        return dVar.y;
    }

    LayoutInflater b1(Bundle bundle) {
        LayoutInflater layoutInflaterZ0 = z0(bundle);
        this.X = layoutInflaterZ0;
        return layoutInflaterZ0;
    }

    final boolean c0() {
        return this.r > 0;
    }

    void c1() {
        onLowMemory();
        this.u.H();
    }

    @Override // androidx.savedstate.c
    public final SavedStateRegistry d() {
        return this.d0.b();
    }

    public final boolean d0() {
        n nVar;
        return this.N && ((nVar = this.s) == null || nVar.H0(this.v));
    }

    void d1(boolean z) {
        D0(z);
        this.u.I(z);
    }

    boolean e0() {
        d dVar = this.T;
        if (dVar == null) {
            return false;
        }
        return dVar.w;
    }

    boolean e1(MenuItem menuItem) {
        if (this.I) {
            return false;
        }
        if (this.M && this.N && E0(menuItem)) {
            return true;
        }
        return this.u.K(menuItem);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final boolean f0() {
        return this.f372m;
    }

    void f1(Menu menu) {
        if (this.I) {
            return;
        }
        if (this.M && this.N) {
            F0(menu);
        }
        this.u.L(menu);
    }

    void g(boolean z) {
        ViewGroup viewGroup;
        n nVar;
        d dVar = this.T;
        g gVar = null;
        if (dVar != null) {
            dVar.w = false;
            g gVar2 = dVar.x;
            dVar.x = null;
            gVar = gVar2;
        }
        if (gVar != null) {
            gVar.a();
            return;
        }
        if (!n.P || this.Q == null || (viewGroup = this.P) == null || (nVar = this.s) == null) {
            return;
        }
        c0 c0VarN = c0.n(viewGroup, nVar);
        c0VarN.p();
        if (z) {
            this.t.l().post(new b(this, c0VarN));
        } else {
            c0VarN.g();
        }
    }

    final boolean g0() {
        Fragment fragmentF = F();
        return fragmentF != null && (fragmentF.f0() || fragmentF.g0());
    }

    void g1() {
        this.u.N();
        if (this.Q != null) {
            this.b0.b(androidx.lifecycle.g.b.ON_PAUSE);
        }
        this.a0.h(androidx.lifecycle.g.b.ON_PAUSE);
        this.a = 6;
        this.O = false;
        G0();
        if (this.O) {
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onPause()");
    }

    androidx.fragment.app.g h() {
        return new c();
    }

    public final boolean h0() {
        return this.a >= 7;
    }

    void h1(boolean z) {
        H0(z);
        this.u.O(z);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.F));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.G));
        printWriter.print(" mTag=");
        printWriter.println(this.H);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.a);
        printWriter.print(" mWho=");
        printWriter.print(this.f);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.r);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f371l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f372m);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f373n);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f374o);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.I);
        printWriter.print(" mDetached=");
        printWriter.print(this.J);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.N);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.M);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.K);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.S);
        if (this.s != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.s);
        }
        if (this.t != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.t);
        }
        if (this.v != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.v);
        }
        if (this.f366g != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f366g);
        }
        if (this.b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.b);
        }
        if (this.c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.c);
        }
        if (this.d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.d);
        }
        Fragment fragmentU = U();
        if (fragmentU != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(fragmentU);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f369j);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(H());
        if (t() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(t());
        }
        if (w() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(w());
        }
        if (I() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(I());
        }
        if (J() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(J());
        }
        if (this.P != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.P);
        }
        if (this.Q != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.Q);
        }
        if (p() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(p());
        }
        if (s() != null) {
            h.p.a.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.u + ":");
        this.u.X(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final boolean i0() {
        n nVar = this.s;
        if (nVar == null) {
            return false;
        }
        return nVar.K0();
    }

    boolean i1(Menu menu) {
        boolean z = false;
        if (this.I) {
            return false;
        }
        if (this.M && this.N) {
            z = true;
            I0(menu);
        }
        return z | this.u.P(menu);
    }

    @Override // androidx.lifecycle.y
    public androidx.lifecycle.x j() {
        if (this.s == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (D() != androidx.lifecycle.g.c.INITIALIZED.ordinal()) {
            return this.s.A0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    void j0() {
        this.u.R0();
    }

    void j1() {
        boolean zI0 = this.s.I0(this);
        Boolean bool = this.f370k;
        if (bool == null || bool.booleanValue() != zI0) {
            this.f370k = Boolean.valueOf(zI0);
            J0(zI0);
            this.u.Q();
        }
    }

    @Deprecated
    public void k0(Bundle bundle) {
        this.O = true;
    }

    void k1() {
        this.u.R0();
        this.u.b0(true);
        this.a = 7;
        this.O = false;
        L0();
        if (!this.O) {
            throw new e0("Fragment " + this + " did not call through to super.onResume()");
        }
        androidx.lifecycle.l lVar = this.a0;
        androidx.lifecycle.g.b bVar = androidx.lifecycle.g.b.ON_RESUME;
        lVar.h(bVar);
        if (this.Q != null) {
            this.b0.b(bVar);
        }
        this.u.R();
    }

    Fragment l(String str) {
        return str.equals(this.f) ? this : this.u.j0(str);
    }

    @Deprecated
    public void l0(int i2, int i3, Intent intent) {
        if (n.F0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i2 + " resultCode: " + i3 + " data: " + intent);
        }
    }

    void l1(Bundle bundle) {
        M0(bundle);
        this.d0.d(bundle);
        Parcelable parcelableG1 = this.u.g1();
        if (parcelableG1 != null) {
            bundle.putParcelable("android:support:fragments", parcelableG1);
        }
    }

    public final androidx.fragment.app.e m() {
        k<?> kVar = this.t;
        if (kVar == null) {
            return null;
        }
        return (androidx.fragment.app.e) kVar.i();
    }

    @Deprecated
    public void m0(Activity activity) {
        this.O = true;
    }

    void m1() {
        this.u.R0();
        this.u.b0(true);
        this.a = 5;
        this.O = false;
        N0();
        if (!this.O) {
            throw new e0("Fragment " + this + " did not call through to super.onStart()");
        }
        androidx.lifecycle.l lVar = this.a0;
        androidx.lifecycle.g.b bVar = androidx.lifecycle.g.b.ON_START;
        lVar.h(bVar);
        if (this.Q != null) {
            this.b0.b(bVar);
        }
        this.u.S();
    }

    public boolean n() {
        Boolean bool;
        d dVar = this.T;
        if (dVar == null || (bool = dVar.r) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void n0(Context context) {
        this.O = true;
        k<?> kVar = this.t;
        Activity activityI = kVar == null ? null : kVar.i();
        if (activityI != null) {
            this.O = false;
            m0(activityI);
        }
    }

    void n1() {
        this.u.U();
        if (this.Q != null) {
            this.b0.b(androidx.lifecycle.g.b.ON_STOP);
        }
        this.a0.h(androidx.lifecycle.g.b.ON_STOP);
        this.a = 4;
        this.O = false;
        O0();
        if (this.O) {
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onStop()");
    }

    public boolean o() {
        Boolean bool;
        d dVar = this.T;
        if (dVar == null || (bool = dVar.q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    @Deprecated
    public void o0(Fragment fragment) {
    }

    void o1() {
        P0(this.Q, this.b);
        this.u.V();
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.O = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        p1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.O = true;
    }

    View p() {
        d dVar = this.T;
        if (dVar == null) {
            return null;
        }
        return dVar.a;
    }

    public boolean p0(MenuItem menuItem) {
        return false;
    }

    public final androidx.fragment.app.e p1() {
        androidx.fragment.app.e eVarM = m();
        if (eVarM != null) {
            return eVarM;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    Animator q() {
        d dVar = this.T;
        if (dVar == null) {
            return null;
        }
        return dVar.b;
    }

    public void q0(Bundle bundle) {
        this.O = true;
        s1(bundle);
        if (this.u.J0(1)) {
            return;
        }
        this.u.D();
    }

    public final Context q1() {
        Context contextS = s();
        if (contextS != null) {
            return contextS;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final n r() {
        if (this.t != null) {
            return this.u;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public Animation r0(int i2, boolean z, int i3) {
        return null;
    }

    public final View r1() {
        View viewV = V();
        if (viewV != null) {
            return viewV;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public Context s() {
        k<?> kVar = this.t;
        if (kVar == null) {
            return null;
        }
        return kVar.k();
    }

    public Animator s0(int i2, boolean z, int i3) {
        return null;
    }

    void s1(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.u.e1(parcelable);
        this.u.D();
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2) {
        H1(intent, i2, null);
    }

    int t() {
        d dVar = this.T;
        if (dVar == null) {
            return 0;
        }
        return dVar.d;
    }

    public void t0(Menu menu, MenuInflater menuInflater) {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f);
        if (this.F != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.F));
        }
        if (this.H != null) {
            sb.append(" tag=");
            sb.append(this.H);
        }
        sb.append(")");
        return sb.toString();
    }

    public Object u() {
        d dVar = this.T;
        if (dVar == null) {
            return null;
        }
        return dVar.f379k;
    }

    public View u0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = this.e0;
        if (i2 != 0) {
            return layoutInflater.inflate(i2, viewGroup, false);
        }
        return null;
    }

    final void u1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.c;
        if (sparseArray != null) {
            this.Q.restoreHierarchyState(sparseArray);
            this.c = null;
        }
        if (this.Q != null) {
            this.b0.g(this.d);
            this.d = null;
        }
        this.O = false;
        Q0(bundle);
        if (this.O) {
            if (this.Q != null) {
                this.b0.b(androidx.lifecycle.g.b.ON_CREATE);
            }
        } else {
            throw new e0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    androidx.core.app.o v() {
        d dVar = this.T;
        if (dVar == null) {
            return null;
        }
        return dVar.s;
    }

    public void v0() {
        this.O = true;
    }

    void v1(View view) {
        k().a = view;
    }

    int w() {
        d dVar = this.T;
        if (dVar == null) {
            return 0;
        }
        return dVar.e;
    }

    public void w0() {
    }

    void w1(int i2, int i3, int i4, int i5) {
        if (this.T == null && i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            return;
        }
        k().d = i2;
        k().e = i3;
        k().f = i4;
        k().f375g = i5;
    }

    public Object x() {
        d dVar = this.T;
        if (dVar == null) {
            return null;
        }
        return dVar.f381m;
    }

    public void x0() {
        this.O = true;
    }

    void x1(Animator animator) {
        k().b = animator;
    }

    androidx.core.app.o y() {
        d dVar = this.T;
        if (dVar == null) {
            return null;
        }
        return dVar.t;
    }

    public void y0() {
        this.O = true;
    }

    public void y1(Bundle bundle) {
        if (this.s != null && i0()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f366g = bundle;
    }

    View z() {
        d dVar = this.T;
        if (dVar == null) {
            return null;
        }
        return dVar.v;
    }

    public LayoutInflater z0(Bundle bundle) {
        return C(bundle);
    }

    void z1(View view) {
        k().v = view;
    }
}
