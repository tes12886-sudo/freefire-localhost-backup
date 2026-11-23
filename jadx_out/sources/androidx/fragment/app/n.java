package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.OnBackPressedDispatcher;
import com.appff.haptic.base.Utils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    private static boolean O = false;
    static boolean P = true;
    private androidx.activity.result.c<androidx.activity.result.f> A;
    private androidx.activity.result.c<String[]> B;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private ArrayList<androidx.fragment.app.a> I;
    private ArrayList<Boolean> J;
    private ArrayList<Fragment> K;
    private ArrayList<q> L;
    private androidx.fragment.app.q M;
    private boolean b;
    ArrayList<androidx.fragment.app.a> d;
    private ArrayList<Fragment> e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private OnBackPressedDispatcher f399g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ArrayList<InterfaceC0023n> f404l;
    private androidx.fragment.app.k<?> r;
    private androidx.fragment.app.g s;
    private Fragment t;
    Fragment u;
    private androidx.activity.result.c<Intent> z;
    private final ArrayList<o> a = new ArrayList<>();
    private final v c = new v();
    private final androidx.fragment.app.l f = new androidx.fragment.app.l(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final androidx.activity.b f400h = new c(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicInteger f401i = new AtomicInteger();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map<String, Bundle> f402j = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map<String, Object> f403k = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Map<Fragment, HashSet<h.h.h.b>> f405m = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final x.g f406n = new d();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final androidx.fragment.app.m f407o = new androidx.fragment.app.m(this);
    private final CopyOnWriteArrayList<r> p = new CopyOnWriteArrayList<>();
    int q = -1;
    private androidx.fragment.app.j v = null;
    private androidx.fragment.app.j w = new e();
    private d0 x = null;
    private d0 y = new f(this);
    ArrayDeque<m> C = new ArrayDeque<>();
    private Runnable N = new g();

    class a implements androidx.activity.result.b<androidx.activity.result.a> {
        a() {
        }

        @Override // androidx.activity.result.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(androidx.activity.result.a aVar) {
            m mVarPollFirst = n.this.C.pollFirst();
            if (mVarPollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = mVarPollFirst.a;
            int i2 = mVarPollFirst.b;
            Fragment fragmentI = n.this.c.i(str);
            if (fragmentI != null) {
                fragmentI.l0(i2, aVar.b(), aVar.a());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    class b implements androidx.activity.result.b<Map<String, Boolean>> {
        b() {
        }

        @Override // androidx.activity.result.b
        @SuppressLint({"SyntheticAccessor"})
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Map<String, Boolean> map) {
            StringBuilder sb;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue() ? 0 : -1;
            }
            m mVarPollFirst = n.this.C.pollFirst();
            if (mVarPollFirst == null) {
                sb = new StringBuilder();
                sb.append("No permissions were requested for ");
                sb.append(this);
            } else {
                String str = mVarPollFirst.a;
                int i3 = mVarPollFirst.b;
                Fragment fragmentI = n.this.c.i(str);
                if (fragmentI != null) {
                    fragmentI.K0(i3, strArr, iArr);
                    return;
                } else {
                    sb = new StringBuilder();
                    sb.append("Permission request result delivered for unknown Fragment ");
                    sb.append(str);
                }
            }
            Log.w("FragmentManager", sb.toString());
        }
    }

    class c extends androidx.activity.b {
        c(boolean z) {
            super(z);
        }

        @Override // androidx.activity.b
        public void b() {
            n.this.B0();
        }
    }

    class d implements x.g {
        d() {
        }

        @Override // androidx.fragment.app.x.g
        public void a(Fragment fragment, h.h.h.b bVar) {
            if (bVar.b()) {
                return;
            }
            n.this.Z0(fragment, bVar);
        }

        @Override // androidx.fragment.app.x.g
        public void b(Fragment fragment, h.h.h.b bVar) {
            n.this.f(fragment, bVar);
        }
    }

    class e extends androidx.fragment.app.j {
        e() {
        }

        @Override // androidx.fragment.app.j
        public Fragment a(ClassLoader classLoader, String str) {
            return n.this.t0().e(n.this.t0().k(), str, null);
        }
    }

    class f implements d0 {
        f(n nVar) {
        }

        @Override // androidx.fragment.app.d0
        public c0 a(ViewGroup viewGroup) {
            return new androidx.fragment.app.c(viewGroup);
        }
    }

    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n.this.b0(true);
        }
    }

    class h extends AnimatorListenerAdapter {
        final /* synthetic */ ViewGroup a;
        final /* synthetic */ View b;
        final /* synthetic */ Fragment c;

        h(n nVar, ViewGroup viewGroup, View view, Fragment fragment) {
            this.a = viewGroup;
            this.b = view;
            this.c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.endViewTransition(this.b);
            animator.removeListener(this);
            Fragment fragment = this.c;
            View view = fragment.Q;
            if (view == null || !fragment.I) {
                return;
            }
            view.setVisibility(8);
        }
    }

    class i implements r {
        final /* synthetic */ Fragment a;

        i(n nVar, Fragment fragment) {
            this.a = fragment;
        }

        @Override // androidx.fragment.app.r
        public void b(n nVar, Fragment fragment) {
            this.a.o0(fragment);
        }
    }

    class j implements androidx.activity.result.b<androidx.activity.result.a> {
        j() {
        }

        @Override // androidx.activity.result.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(androidx.activity.result.a aVar) {
            m mVarPollFirst = n.this.C.pollFirst();
            if (mVarPollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = mVarPollFirst.a;
            int i2 = mVarPollFirst.b;
            Fragment fragmentI = n.this.c.i(str);
            if (fragmentI != null) {
                fragmentI.l0(i2, aVar.b(), aVar.a());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    static class k extends androidx.activity.result.g.a<androidx.activity.result.f, androidx.activity.result.a> {
        k() {
        }

        @Override // androidx.activity.result.g.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(Context context, androidx.activity.result.f fVar) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intentA = fVar.a();
            if (intentA != null && (bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intentA.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    androidx.activity.result.f.b bVar = new androidx.activity.result.f.b(fVar.d());
                    bVar.b(null);
                    bVar.c(fVar.c(), fVar.b());
                    fVar = bVar.a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", fVar);
            if (n.F0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // androidx.activity.result.g.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public androidx.activity.result.a c(int i2, Intent intent) {
            return new androidx.activity.result.a(i2, intent);
        }
    }

    public static abstract class l {
        @Deprecated
        public abstract void a(n nVar, Fragment fragment, Bundle bundle);

        public abstract void b(n nVar, Fragment fragment, Context context);

        public abstract void c(n nVar, Fragment fragment, Bundle bundle);

        public abstract void d(n nVar, Fragment fragment);

        public abstract void e(n nVar, Fragment fragment);

        public abstract void f(n nVar, Fragment fragment);

        public abstract void g(n nVar, Fragment fragment, Context context);

        public abstract void h(n nVar, Fragment fragment, Bundle bundle);

        public abstract void i(n nVar, Fragment fragment);

        public abstract void j(n nVar, Fragment fragment, Bundle bundle);

        public abstract void k(n nVar, Fragment fragment);

        public abstract void l(n nVar, Fragment fragment);

        public abstract void m(n nVar, Fragment fragment, View view, Bundle bundle);

        public abstract void n(n nVar, Fragment fragment);
    }

    @SuppressLint({"BanParcelableUsage"})
    static class m implements Parcelable {
        public static final Parcelable.Creator<m> CREATOR = new a();
        String a;
        int b;

        class a implements Parcelable.Creator<m> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public m createFromParcel(Parcel parcel) {
                return new m(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public m[] newArray(int i2) {
                return new m[i2];
            }
        }

        m(Parcel parcel) {
            this.a = parcel.readString();
            this.b = parcel.readInt();
        }

        m(String str, int i2) {
            this.a = str;
            this.b = i2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.a);
            parcel.writeInt(this.b);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.n$n, reason: collision with other inner class name */
    public interface InterfaceC0023n {
        void a();
    }

    interface o {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    private class p implements o {
        final String a;
        final int b;
        final int c;

        p(String str, int i2, int i3) {
            this.a = str;
            this.b = i2;
            this.c = i3;
        }

        @Override // androidx.fragment.app.n.o
        public boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = n.this.u;
            if (fragment == null || this.b >= 0 || this.a != null || !fragment.r().V0()) {
                return n.this.X0(arrayList, arrayList2, this.a, this.b, this.c);
            }
            return false;
        }
    }

    static class q implements Fragment.g {
        final boolean a;
        final androidx.fragment.app.a b;
        private int c;

        q(androidx.fragment.app.a aVar, boolean z) {
            this.a = z;
            this.b = aVar;
        }

        @Override // androidx.fragment.app.Fragment.g
        public void a() {
            int i2 = this.c - 1;
            this.c = i2;
            if (i2 != 0) {
                return;
            }
            this.b.q.h1();
        }

        @Override // androidx.fragment.app.Fragment.g
        public void b() {
            this.c++;
        }

        void c() {
            androidx.fragment.app.a aVar = this.b;
            aVar.q.u(aVar, this.a, false, false);
        }

        void d() {
            boolean z = this.c > 0;
            for (Fragment fragment : this.b.q.s0()) {
                fragment.C1(null);
                if (z && fragment.e0()) {
                    fragment.I1();
                }
            }
            androidx.fragment.app.a aVar = this.b;
            aVar.q.u(aVar, this.a, !z, true);
        }

        public boolean e() {
            return this.c == 0;
        }
    }

    static boolean F0(int i2) {
        return O || Log.isLoggable("FragmentManager", i2);
    }

    private boolean G0(Fragment fragment) {
        return (fragment.M && fragment.N) || fragment.u.o();
    }

    private void M(Fragment fragment) {
        if (fragment == null || !fragment.equals(g0(fragment.f))) {
            return;
        }
        fragment.j1();
    }

    private void M0(h.f.b<Fragment> bVar) {
        int size = bVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragmentN = bVar.n(i2);
            if (!fragmentN.f371l) {
                View viewR1 = fragmentN.r1();
                fragmentN.W = viewR1.getAlpha();
                viewR1.setAlpha(0.0f);
            }
        }
    }

    private void T(int i2) {
        try {
            this.b = true;
            this.c.d(i2);
            O0(i2, false);
            if (P) {
                Iterator<c0> it = s().iterator();
                while (it.hasNext()) {
                    it.next().j();
                }
            }
            this.b = false;
            b0(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    private void W() {
        if (this.H) {
            this.H = false;
            n1();
        }
    }

    private boolean W0(String str, int i2, int i3) {
        b0(false);
        a0(true);
        Fragment fragment = this.u;
        if (fragment != null && i2 < 0 && str == null && fragment.r().V0()) {
            return true;
        }
        boolean zX0 = X0(this.I, this.J, str, i2, i3);
        if (zX0) {
            this.b = true;
            try {
                b1(this.I, this.J);
                q();
            } catch (Throwable th) {
                q();
                throw th;
            }
        }
        o1();
        W();
        this.c.b();
        return zX0;
    }

    private void Y() {
        if (P) {
            Iterator<c0> it = s().iterator();
            while (it.hasNext()) {
                it.next().j();
            }
        } else {
            if (this.f405m.isEmpty()) {
                return;
            }
            for (Fragment fragment : this.f405m.keySet()) {
                n(fragment);
                P0(fragment);
            }
        }
    }

    private int Y0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, h.f.b<Fragment> bVar) {
        int i4 = i3;
        for (int i5 = i3 - 1; i5 >= i2; i5--) {
            androidx.fragment.app.a aVar = arrayList.get(i5);
            boolean zBooleanValue = arrayList2.get(i5).booleanValue();
            if (aVar.x() && !aVar.v(arrayList, i5 + 1, i3)) {
                if (this.L == null) {
                    this.L = new ArrayList<>();
                }
                q qVar = new q(aVar, zBooleanValue);
                this.L.add(qVar);
                aVar.z(qVar);
                if (zBooleanValue) {
                    aVar.q();
                } else {
                    aVar.r(false);
                }
                i4--;
                if (i5 != i4) {
                    arrayList.remove(i5);
                    arrayList.add(i4, aVar);
                }
                d(bVar);
            }
        }
        return i4;
    }

    private void a0(boolean z) {
        if (this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.r == null) {
            if (!this.G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.r.l().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            p();
        }
        if (this.I == null) {
            this.I = new ArrayList<>();
            this.J = new ArrayList<>();
        }
        this.b = true;
        try {
            f0(null, null);
        } finally {
            this.b = false;
        }
    }

    private void b1(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        f0(arrayList, arrayList2);
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!arrayList.get(i2).f428o) {
                if (i3 != i2) {
                    e0(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (arrayList2.get(i2).booleanValue()) {
                    while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).f428o) {
                        i3++;
                    }
                }
                e0(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            e0(arrayList, arrayList2, i3, size);
        }
    }

    private void d(h.f.b<Fragment> bVar) {
        int i2 = this.q;
        if (i2 < 1) {
            return;
        }
        int iMin = Math.min(i2, 5);
        for (Fragment fragment : this.c.n()) {
            if (fragment.a < iMin) {
                Q0(fragment, iMin);
                if (fragment.Q != null && !fragment.I && fragment.U) {
                    bVar.add(fragment);
                }
            }
        }
    }

    private static void d0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            androidx.fragment.app.a aVar = arrayList.get(i2);
            if (arrayList2.get(i2).booleanValue()) {
                aVar.m(-1);
                aVar.r(i2 == i3 + (-1));
            } else {
                aVar.m(1);
                aVar.q();
            }
            i2++;
        }
    }

    private void d1() {
        if (this.f404l != null) {
            for (int i2 = 0; i2 < this.f404l.size(); i2++) {
                this.f404l.get(i2).a();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    private void e0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ?? r1;
        int i4;
        int i5;
        int iY0;
        boolean z;
        ArrayList<Boolean> arrayList3 = arrayList2;
        boolean z2 = arrayList.get(i2).f428o;
        ArrayList<Fragment> arrayList4 = this.K;
        if (arrayList4 == null) {
            this.K = new ArrayList<>();
        } else {
            arrayList4.clear();
        }
        this.K.addAll(this.c.n());
        Fragment fragmentX0 = x0();
        boolean z3 = false;
        for (int i6 = i2; i6 < i3; i6++) {
            androidx.fragment.app.a aVar = arrayList.get(i6);
            fragmentX0 = !arrayList3.get(i6).booleanValue() ? aVar.s(this.K, fragmentX0) : aVar.A(this.K, fragmentX0);
            z3 = z3 || aVar.f420g;
        }
        this.K.clear();
        if (z2 || this.q < 1) {
            r1 = 1;
        } else if (P) {
            for (int i7 = i2; i7 < i3; i7++) {
                Iterator<w.a> it = arrayList.get(i7).a.iterator();
                while (it.hasNext()) {
                    Fragment fragment = it.next().b;
                    if (fragment != null && fragment.s != null) {
                        this.c.p(w(fragment));
                    }
                }
            }
            r1 = 1;
        } else {
            r1 = 1;
            x.C(this.r.k(), this.s, arrayList, arrayList2, i2, i3, false, this.f406n);
        }
        d0(arrayList, arrayList2, i2, i3);
        if (P) {
            boolean zBooleanValue = arrayList3.get(i3 - 1).booleanValue();
            for (int i8 = i2; i8 < i3; i8++) {
                androidx.fragment.app.a aVar2 = arrayList.get(i8);
                if (zBooleanValue) {
                    for (int size = aVar2.a.size() - r1; size >= 0; size--) {
                        Fragment fragment2 = aVar2.a.get(size).b;
                        if (fragment2 != null) {
                            w(fragment2).m();
                        }
                    }
                } else {
                    Iterator<w.a> it2 = aVar2.a.iterator();
                    while (it2.hasNext()) {
                        Fragment fragment3 = it2.next().b;
                        if (fragment3 != null) {
                            w(fragment3).m();
                        }
                    }
                }
            }
            O0(this.q, r1);
            for (c0 c0Var : t(arrayList, i2, i3)) {
                c0Var.r(zBooleanValue);
                c0Var.p();
                c0Var.g();
            }
            i4 = i3;
            arrayList3 = arrayList3;
        } else {
            if (z2) {
                h.f.b bVar = new h.f.b();
                d(bVar);
                i5 = 1;
                i4 = i3;
                iY0 = Y0(arrayList, arrayList2, i2, i3, bVar);
                M0(bVar);
            } else {
                i4 = i3;
                i5 = 1;
                iY0 = i4;
            }
            if (iY0 == i2 || !z2) {
                arrayList3 = arrayList3;
                i4 = i4;
            } else {
                if (this.q >= i5) {
                    z = true;
                    x.C(this.r.k(), this.s, arrayList, arrayList2, i2, iY0, true, this.f406n);
                } else {
                    z = true;
                }
                O0(this.q, z);
            }
        }
        for (int i9 = i2; i9 < i4; i9++) {
            androidx.fragment.app.a aVar3 = arrayList.get(i9);
            if (arrayList3.get(i9).booleanValue() && aVar3.s >= 0) {
                aVar3.s = -1;
            }
            aVar3.y();
        }
        if (z3) {
            d1();
        }
    }

    private void f0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        int iIndexOf;
        int iIndexOf2;
        ArrayList<q> arrayList3 = this.L;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            q qVar = this.L.get(i2);
            if (arrayList == null || qVar.a || (iIndexOf2 = arrayList.indexOf(qVar.b)) == -1 || arrayList2 == null || !arrayList2.get(iIndexOf2).booleanValue()) {
                if (qVar.e() || (arrayList != null && qVar.b.v(arrayList, 0, arrayList.size()))) {
                    this.L.remove(i2);
                    i2--;
                    size--;
                    if (arrayList == null || qVar.a || (iIndexOf = arrayList.indexOf(qVar.b)) == -1 || arrayList2 == null || !arrayList2.get(iIndexOf).booleanValue()) {
                        qVar.d();
                    }
                }
                i2++;
            } else {
                this.L.remove(i2);
                i2--;
                size--;
            }
            qVar.c();
            i2++;
        }
    }

    static int f1(int i2) {
        if (i2 == 4097) {
            return 8194;
        }
        if (i2 == 4099) {
            return 4099;
        }
        if (i2 != 8194) {
            return 0;
        }
        return Utils.TRANSIENT_EVENT;
    }

    private void k0() {
        if (P) {
            Iterator<c0> it = s().iterator();
            while (it.hasNext()) {
                it.next().k();
            }
        } else if (this.L != null) {
            while (!this.L.isEmpty()) {
                this.L.remove(0).d();
            }
        }
    }

    private boolean l0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.a) {
            if (this.a.isEmpty()) {
                return false;
            }
            int size = this.a.size();
            boolean zA = false;
            for (int i2 = 0; i2 < size; i2++) {
                zA |= this.a.get(i2).a(arrayList, arrayList2);
            }
            this.a.clear();
            this.r.l().removeCallbacks(this.N);
            return zA;
        }
    }

    private void l1(Fragment fragment) {
        ViewGroup viewGroupP0 = p0(fragment);
        if (viewGroupP0 == null || fragment.t() + fragment.w() + fragment.I() + fragment.J() <= 0) {
            return;
        }
        int i2 = h.m.b.c;
        if (viewGroupP0.getTag(i2) == null) {
            viewGroupP0.setTag(i2, fragment);
        }
        ((Fragment) viewGroupP0.getTag(i2)).D1(fragment.H());
    }

    private void n(Fragment fragment) {
        HashSet<h.h.h.b> hashSet = this.f405m.get(fragment);
        if (hashSet != null) {
            Iterator<h.h.h.b> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            hashSet.clear();
            x(fragment);
            this.f405m.remove(fragment);
        }
    }

    private androidx.fragment.app.q n0(Fragment fragment) {
        return this.M.h(fragment);
    }

    private void n1() {
        Iterator<u> it = this.c.k().iterator();
        while (it.hasNext()) {
            T0(it.next());
        }
    }

    private void o1() {
        synchronized (this.a) {
            if (this.a.isEmpty()) {
                this.f400h.f(m0() > 0 && I0(this.t));
            } else {
                this.f400h.f(true);
            }
        }
    }

    private void p() {
        if (K0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private ViewGroup p0(Fragment fragment) {
        ViewGroup viewGroup = fragment.P;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.G > 0 && this.s.g()) {
            View viewF = this.s.f(fragment.G);
            if (viewF instanceof ViewGroup) {
                return (ViewGroup) viewF;
            }
        }
        return null;
    }

    private void q() {
        this.b = false;
        this.J.clear();
        this.I.clear();
    }

    private Set<c0> s() {
        HashSet hashSet = new HashSet();
        Iterator<u> it = this.c.k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = it.next().k().P;
            if (viewGroup != null) {
                hashSet.add(c0.o(viewGroup, y0()));
            }
        }
        return hashSet;
    }

    private Set<c0> t(ArrayList<androidx.fragment.app.a> arrayList, int i2, int i3) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i2 < i3) {
            Iterator<w.a> it = arrayList.get(i2).a.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().b;
                if (fragment != null && (viewGroup = fragment.P) != null) {
                    hashSet.add(c0.n(viewGroup, this));
                }
            }
            i2++;
        }
        return hashSet;
    }

    private void v(Fragment fragment) {
        Animator animator;
        if (fragment.Q != null) {
            androidx.fragment.app.f.d dVarC = androidx.fragment.app.f.c(this.r.k(), fragment, !fragment.I, fragment.H());
            if (dVarC == null || (animator = dVarC.b) == null) {
                if (dVarC != null) {
                    fragment.Q.startAnimation(dVarC.a);
                    dVarC.a.start();
                }
                fragment.Q.setVisibility((!fragment.I || fragment.b0()) ? 0 : 8);
                if (fragment.b0()) {
                    fragment.A1(false);
                }
            } else {
                animator.setTarget(fragment.Q);
                if (!fragment.I) {
                    fragment.Q.setVisibility(0);
                } else if (fragment.b0()) {
                    fragment.A1(false);
                } else {
                    ViewGroup viewGroup = fragment.P;
                    View view = fragment.Q;
                    viewGroup.startViewTransition(view);
                    dVarC.b.addListener(new h(this, viewGroup, view, fragment));
                }
                dVarC.b.start();
            }
        }
        D0(fragment);
        fragment.V = false;
        fragment.A0(fragment.I);
    }

    private void x(Fragment fragment) {
        fragment.Z0();
        this.f407o.n(fragment, false);
        fragment.P = null;
        fragment.Q = null;
        fragment.b0 = null;
        fragment.c0.n(null);
        fragment.f374o = false;
    }

    static Fragment z0(View view) {
        Object tag = view.getTag(h.m.b.a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    void A() {
        this.E = false;
        this.F = false;
        this.M.n(false);
        T(0);
    }

    androidx.lifecycle.x A0(Fragment fragment) {
        return this.M.k(fragment);
    }

    void B(Configuration configuration) {
        for (Fragment fragment : this.c.n()) {
            if (fragment != null) {
                fragment.T0(configuration);
            }
        }
    }

    void B0() {
        b0(true);
        if (this.f400h.c()) {
            V0();
        } else {
            this.f399g.c();
        }
    }

    boolean C(MenuItem menuItem) {
        if (this.q < 1) {
            return false;
        }
        for (Fragment fragment : this.c.n()) {
            if (fragment != null && fragment.U0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    void C0(Fragment fragment) {
        if (F0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.I) {
            return;
        }
        fragment.I = true;
        fragment.V = true ^ fragment.V;
        l1(fragment);
    }

    void D() {
        this.E = false;
        this.F = false;
        this.M.n(false);
        T(1);
    }

    void D0(Fragment fragment) {
        if (fragment.f371l && G0(fragment)) {
            this.D = true;
        }
    }

    boolean E(Menu menu, MenuInflater menuInflater) {
        if (this.q < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.c.n()) {
            if (fragment != null && H0(fragment) && fragment.W0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.e != null) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                Fragment fragment2 = this.e.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.w0();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public boolean E0() {
        return this.G;
    }

    void F() {
        this.G = true;
        b0(true);
        Y();
        T(-1);
        this.r = null;
        this.s = null;
        this.t = null;
        if (this.f399g != null) {
            this.f400h.d();
            this.f399g = null;
        }
        androidx.activity.result.c<Intent> cVar = this.z;
        if (cVar != null) {
            cVar.c();
            this.A.c();
            this.B.c();
        }
    }

    void G() {
        T(1);
    }

    void H() {
        for (Fragment fragment : this.c.n()) {
            if (fragment != null) {
                fragment.c1();
            }
        }
    }

    boolean H0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.d0();
    }

    void I(boolean z) {
        for (Fragment fragment : this.c.n()) {
            if (fragment != null) {
                fragment.d1(z);
            }
        }
    }

    boolean I0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        n nVar = fragment.s;
        return fragment.equals(nVar.x0()) && I0(nVar.t);
    }

    void J(Fragment fragment) {
        Iterator<r> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().b(this, fragment);
        }
    }

    boolean J0(int i2) {
        return this.q >= i2;
    }

    boolean K(MenuItem menuItem) {
        if (this.q < 1) {
            return false;
        }
        for (Fragment fragment : this.c.n()) {
            if (fragment != null && fragment.e1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean K0() {
        return this.E || this.F;
    }

    void L(Menu menu) {
        if (this.q < 1) {
            return;
        }
        for (Fragment fragment : this.c.n()) {
            if (fragment != null) {
                fragment.f1(menu);
            }
        }
    }

    void L0(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        if (this.z == null) {
            this.r.p(fragment, intent, i2, bundle);
            return;
        }
        this.C.addLast(new m(fragment.f, i2));
        if (intent != null && bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.z.a(intent);
    }

    void N() {
        T(5);
    }

    void N0(Fragment fragment) {
        if (!this.c.c(fragment.f)) {
            if (F0(3)) {
                Log.d("FragmentManager", "Ignoring moving " + fragment + " to state " + this.q + "since it is not added to " + this);
                return;
            }
            return;
        }
        P0(fragment);
        View view = fragment.Q;
        if (view != null && fragment.U && fragment.P != null) {
            float f2 = fragment.W;
            if (f2 > 0.0f) {
                view.setAlpha(f2);
            }
            fragment.W = 0.0f;
            fragment.U = false;
            androidx.fragment.app.f.d dVarC = androidx.fragment.app.f.c(this.r.k(), fragment, true, fragment.H());
            if (dVarC != null) {
                Animation animation = dVarC.a;
                if (animation != null) {
                    fragment.Q.startAnimation(animation);
                } else {
                    dVarC.b.setTarget(fragment.Q);
                    dVarC.b.start();
                }
            }
        }
        if (fragment.V) {
            v(fragment);
        }
    }

    void O(boolean z) {
        for (Fragment fragment : this.c.n()) {
            if (fragment != null) {
                fragment.h1(z);
            }
        }
    }

    void O0(int i2, boolean z) {
        androidx.fragment.app.k<?> kVar;
        if (this.r == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i2 != this.q) {
            this.q = i2;
            if (P) {
                this.c.r();
            } else {
                Iterator<Fragment> it = this.c.n().iterator();
                while (it.hasNext()) {
                    N0(it.next());
                }
                for (u uVar : this.c.k()) {
                    Fragment fragmentK = uVar.k();
                    if (!fragmentK.U) {
                        N0(fragmentK);
                    }
                    if (fragmentK.f372m && !fragmentK.c0()) {
                        this.c.q(uVar);
                    }
                }
            }
            n1();
            if (this.D && (kVar = this.r) != null && this.q == 7) {
                kVar.q();
                this.D = false;
            }
        }
    }

    boolean P(Menu menu) {
        boolean z = false;
        if (this.q < 1) {
            return false;
        }
        for (Fragment fragment : this.c.n()) {
            if (fragment != null && H0(fragment) && fragment.i1(menu)) {
                z = true;
            }
        }
        return z;
    }

    void P0(Fragment fragment) {
        Q0(fragment, this.q);
    }

    void Q() {
        o1();
        M(this.u);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0063  */
    /* JADX WARN: Code duplicated, block: B:33:0x0068  */
    /* JADX WARN: Code duplicated, block: B:35:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:97:0x015d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0160  */
    void Q0(Fragment fragment, int i2) {
        ViewGroup viewGroup;
        u uVarM = this.c.m(fragment.f);
        int i3 = 1;
        if (uVarM == null) {
            uVarM = new u(this.f407o, this.c, fragment);
            uVarM.t(1);
        }
        if (fragment.f373n && fragment.f374o && fragment.a == 2) {
            i2 = Math.max(i2, 2);
        }
        int iMin = Math.min(i2, uVarM.d());
        int i4 = fragment.a;
        if (i4 <= iMin) {
            if (i4 < iMin && !this.f405m.isEmpty()) {
                n(fragment);
            }
            int i5 = fragment.a;
            if (i5 != -1) {
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 != 4) {
                                if (i5 == 5) {
                                }
                            }
                            if (iMin > 5) {
                                uVarM.p();
                            }
                        }
                        if (iMin > 4) {
                            uVarM.u();
                        }
                        if (iMin > 5) {
                            uVarM.p();
                        }
                    }
                    if (iMin > 2) {
                        uVarM.a();
                    }
                    if (iMin > 4) {
                        uVarM.u();
                    }
                    if (iMin > 5) {
                        uVarM.p();
                    }
                }
                if (iMin > -1) {
                    uVarM.j();
                }
                if (iMin > 1) {
                    uVarM.f();
                }
                if (iMin > 2) {
                    uVarM.a();
                }
                if (iMin > 4) {
                    uVarM.u();
                }
                if (iMin > 5) {
                    uVarM.p();
                }
            } else if (iMin > -1) {
                uVarM.c();
            }
            if (iMin > 0) {
                uVarM.e();
            }
            if (iMin > -1) {
                uVarM.j();
            }
            if (iMin > 1) {
                uVarM.f();
            }
            if (iMin > 2) {
                uVarM.a();
            }
            if (iMin > 4) {
                uVarM.u();
            }
            if (iMin > 5) {
                uVarM.p();
            }
        } else if (i4 > iMin) {
            if (i4 == 0) {
                i3 = iMin;
                if (i3 < 0) {
                    uVarM.i();
                }
                iMin = i3;
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 4) {
                            if (i4 != 5) {
                                if (i4 == 7) {
                                    if (iMin < 7) {
                                        uVarM.n();
                                    }
                                }
                            }
                            if (iMin < 5) {
                                uVarM.v();
                            }
                        }
                        if (iMin < 4) {
                            if (F0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + fragment);
                            }
                            if (fragment.Q != null && this.r.o(fragment) && fragment.c == null) {
                                uVarM.s();
                            }
                        }
                    }
                    if (iMin < 2) {
                        androidx.fragment.app.f.d dVarC = null;
                        View view = fragment.Q;
                        if (view != null && (viewGroup = fragment.P) != null) {
                            viewGroup.endViewTransition(view);
                            fragment.Q.clearAnimation();
                            if (!fragment.g0()) {
                                if (this.q > -1 && !this.G && fragment.Q.getVisibility() == 0 && fragment.W >= 0.0f) {
                                    dVarC = androidx.fragment.app.f.c(this.r.k(), fragment, false, fragment.H());
                                }
                                fragment.W = 0.0f;
                                ViewGroup viewGroup2 = fragment.P;
                                View view2 = fragment.Q;
                                if (dVarC != null) {
                                    androidx.fragment.app.f.a(fragment, dVarC, this.f406n);
                                }
                                viewGroup2.removeView(view2);
                                if (F0(2)) {
                                    Log.v("FragmentManager", "Removing view " + view2 + " for fragment " + fragment + " from container " + viewGroup2);
                                }
                                if (viewGroup2 != fragment.P) {
                                    return;
                                }
                            }
                        }
                        if (this.f405m.get(fragment) == null) {
                            uVarM.h();
                        }
                    }
                }
                if (iMin >= 1) {
                    i3 = iMin;
                } else if (this.f405m.get(fragment) == null) {
                    uVarM.g();
                    i3 = iMin;
                }
                if (i3 < 0) {
                    uVarM.i();
                }
                iMin = i3;
            }
        }
        if (fragment.a != iMin) {
            if (F0(3)) {
                Log.d("FragmentManager", "moveToState: Fragment state for " + fragment + " not updated inline; expected state " + iMin + " found " + fragment.a);
            }
            fragment.a = iMin;
        }
    }

    void R() {
        this.E = false;
        this.F = false;
        this.M.n(false);
        T(7);
    }

    void R0() {
        if (this.r == null) {
            return;
        }
        this.E = false;
        this.F = false;
        this.M.n(false);
        for (Fragment fragment : this.c.n()) {
            if (fragment != null) {
                fragment.j0();
            }
        }
    }

    void S() {
        this.E = false;
        this.F = false;
        this.M.n(false);
        T(5);
    }

    void S0(androidx.fragment.app.h hVar) {
        View view;
        for (u uVar : this.c.k()) {
            Fragment fragmentK = uVar.k();
            if (fragmentK.G == hVar.getId() && (view = fragmentK.Q) != null && view.getParent() == null) {
                fragmentK.P = hVar;
                uVar.b();
            }
        }
    }

    void T0(u uVar) {
        Fragment fragmentK = uVar.k();
        if (fragmentK.R) {
            if (this.b) {
                this.H = true;
                return;
            }
            fragmentK.R = false;
            if (P) {
                uVar.m();
            } else {
                P0(fragmentK);
            }
        }
    }

    void U() {
        this.F = true;
        this.M.n(true);
        T(4);
    }

    public void U0(int i2, int i3) {
        if (i2 >= 0) {
            Z(new p(null, i2, i3), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    void V() {
        T(2);
    }

    public boolean V0() {
        return W0(null, -1, 0);
    }

    public void X(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                Fragment fragment = this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList2 = this.d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                androidx.fragment.app.a aVar = this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.o(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f401i.get());
        synchronized (this.a) {
            int size3 = this.a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size3; i4++) {
                    o oVar = this.a.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(oVar);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.r);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.s);
        if (this.t != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.t);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.q);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.G);
        if (this.D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.D);
        }
    }

    boolean X0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        int i4;
        Boolean bool = Boolean.TRUE;
        ArrayList<androidx.fragment.app.a> arrayList3 = this.d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.d.remove(size));
            arrayList2.add(bool);
        } else {
            if (str != null || i2 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    androidx.fragment.app.a aVar = this.d.get(size2);
                    if ((str != null && str.equals(aVar.t())) || (i2 >= 0 && i2 == aVar.s)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        androidx.fragment.app.a aVar2 = this.d.get(size2);
                        if (str == null || !str.equals(aVar2.t())) {
                            if (i2 < 0 || i2 != aVar2.s) {
                                break;
                            }
                        }
                    }
                }
                i4 = size2;
            } else {
                i4 = -1;
            }
            if (i4 == this.d.size() - 1) {
                return false;
            }
            for (int size3 = this.d.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.d.remove(size3));
                arrayList2.add(bool);
            }
        }
        return true;
    }

    void Z(o oVar, boolean z) {
        if (!z) {
            if (this.r == null) {
                if (!this.G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            p();
        }
        synchronized (this.a) {
            if (this.r == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.a.add(oVar);
                h1();
            }
        }
    }

    void Z0(Fragment fragment, h.h.h.b bVar) {
        HashSet<h.h.h.b> hashSet = this.f405m.get(fragment);
        if (hashSet != null && hashSet.remove(bVar) && hashSet.isEmpty()) {
            this.f405m.remove(fragment);
            if (fragment.a < 5) {
                x(fragment);
                P0(fragment);
            }
        }
    }

    void a1(Fragment fragment) {
        if (F0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.r);
        }
        boolean z = !fragment.c0();
        if (!fragment.J || z) {
            this.c.s(fragment);
            if (G0(fragment)) {
                this.D = true;
            }
            fragment.f372m = true;
            l1(fragment);
        }
    }

    boolean b0(boolean z) {
        a0(z);
        boolean z2 = false;
        while (l0(this.I, this.J)) {
            this.b = true;
            try {
                b1(this.I, this.J);
                q();
                z2 = true;
            } catch (Throwable th) {
                q();
                throw th;
            }
        }
        o1();
        W();
        this.c.b();
        return z2;
    }

    void c0(o oVar, boolean z) {
        if (z && (this.r == null || this.G)) {
            return;
        }
        a0(z);
        if (oVar.a(this.I, this.J)) {
            this.b = true;
            try {
                b1(this.I, this.J);
                q();
            } catch (Throwable th) {
                q();
                throw th;
            }
        }
        o1();
        W();
        this.c.b();
    }

    void c1(Fragment fragment) {
        this.M.m(fragment);
    }

    void e(androidx.fragment.app.a aVar) {
        if (this.d == null) {
            this.d = new ArrayList<>();
        }
        this.d.add(aVar);
    }

    void e1(Parcelable parcelable) {
        u uVar;
        if (parcelable == null) {
            return;
        }
        androidx.fragment.app.p pVar = (androidx.fragment.app.p) parcelable;
        if (pVar.a == null) {
            return;
        }
        this.c.t();
        for (t tVar : pVar.a) {
            if (tVar != null) {
                Fragment fragmentG = this.M.g(tVar.b);
                if (fragmentG != null) {
                    if (F0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragmentG);
                    }
                    uVar = new u(this.f407o, this.c, fragmentG, tVar);
                } else {
                    uVar = new u(this.f407o, this.c, this.r.k().getClassLoader(), q0(), tVar);
                }
                Fragment fragmentK = uVar.k();
                fragmentK.s = this;
                if (F0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragmentK.f + "): " + fragmentK);
                }
                uVar.o(this.r.k().getClassLoader());
                this.c.p(uVar);
                uVar.t(this.q);
            }
        }
        for (Fragment fragment : this.M.j()) {
            if (!this.c.c(fragment.f)) {
                if (F0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + pVar.a);
                }
                this.M.m(fragment);
                fragment.s = this;
                u uVar2 = new u(this.f407o, this.c, fragment);
                uVar2.t(1);
                uVar2.m();
                fragment.f372m = true;
                uVar2.m();
            }
        }
        this.c.u(pVar.b);
        if (pVar.c != null) {
            this.d = new ArrayList<>(pVar.c.length);
            int i2 = 0;
            while (true) {
                androidx.fragment.app.b[] bVarArr = pVar.c;
                if (i2 >= bVarArr.length) {
                    break;
                }
                androidx.fragment.app.a aVarA = bVarArr[i2].a(this);
                if (F0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i2 + " (index " + aVarA.s + "): " + aVarA);
                    PrintWriter printWriter = new PrintWriter(new b0("FragmentManager"));
                    aVarA.p("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(aVarA);
                i2++;
            }
        } else {
            this.d = null;
        }
        this.f401i.set(pVar.d);
        String str = pVar.e;
        if (str != null) {
            Fragment fragmentG0 = g0(str);
            this.u = fragmentG0;
            M(fragmentG0);
        }
        ArrayList<String> arrayList = pVar.f;
        if (arrayList != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                Bundle bundle = pVar.f408g.get(i3);
                bundle.setClassLoader(this.r.k().getClassLoader());
                this.f402j.put(arrayList.get(i3), bundle);
            }
        }
        this.C = new ArrayDeque<>(pVar.f409h);
    }

    void f(Fragment fragment, h.h.h.b bVar) {
        if (this.f405m.get(fragment) == null) {
            this.f405m.put(fragment, new HashSet<>());
        }
        this.f405m.get(fragment).add(bVar);
    }

    u g(Fragment fragment) {
        if (F0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        u uVarW = w(fragment);
        fragment.s = this;
        this.c.p(uVarW);
        if (!fragment.J) {
            this.c.a(fragment);
            fragment.f372m = false;
            if (fragment.Q == null) {
                fragment.V = false;
            }
            if (G0(fragment)) {
                this.D = true;
            }
        }
        return uVarW;
    }

    Fragment g0(String str) {
        return this.c.f(str);
    }

    Parcelable g1() {
        int size;
        k0();
        Y();
        b0(true);
        this.E = true;
        this.M.n(true);
        ArrayList<t> arrayListV = this.c.v();
        androidx.fragment.app.b[] bVarArr = null;
        if (arrayListV.isEmpty()) {
            if (F0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList<String> arrayListW = this.c.w();
        ArrayList<androidx.fragment.app.a> arrayList = this.d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            bVarArr = new androidx.fragment.app.b[size];
            for (int i2 = 0; i2 < size; i2++) {
                bVarArr[i2] = new androidx.fragment.app.b(this.d.get(i2));
                if (F0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i2 + ": " + this.d.get(i2));
                }
            }
        }
        androidx.fragment.app.p pVar = new androidx.fragment.app.p();
        pVar.a = arrayListV;
        pVar.b = arrayListW;
        pVar.c = bVarArr;
        pVar.d = this.f401i.get();
        Fragment fragment = this.u;
        if (fragment != null) {
            pVar.e = fragment.f;
        }
        pVar.f.addAll(this.f402j.keySet());
        pVar.f408g.addAll(this.f402j.values());
        pVar.f409h = new ArrayList<>(this.C);
        return pVar;
    }

    public void h(r rVar) {
        this.p.add(rVar);
    }

    public Fragment h0(int i2) {
        return this.c.g(i2);
    }

    void h1() {
        synchronized (this.a) {
            ArrayList<q> arrayList = this.L;
            boolean z = (arrayList == null || arrayList.isEmpty()) ? false : true;
            boolean z2 = this.a.size() == 1;
            if (z || z2) {
                this.r.l().removeCallbacks(this.N);
                this.r.l().post(this.N);
                o1();
            }
        }
    }

    void i(Fragment fragment) {
        this.M.e(fragment);
    }

    public Fragment i0(String str) {
        return this.c.h(str);
    }

    void i1(Fragment fragment, boolean z) {
        ViewGroup viewGroupP0 = p0(fragment);
        if (viewGroupP0 == null || !(viewGroupP0 instanceof androidx.fragment.app.h)) {
            return;
        }
        ((androidx.fragment.app.h) viewGroupP0).setDrawDisappearingViewsLast(!z);
    }

    int j() {
        return this.f401i.getAndIncrement();
    }

    Fragment j0(String str) {
        return this.c.i(str);
    }

    void j1(Fragment fragment, androidx.lifecycle.g.c cVar) {
        if (fragment.equals(g0(fragment.f)) && (fragment.t == null || fragment.s == this)) {
            fragment.Z = cVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021  */
    /* JADX WARN: Code duplicated, block: B:16:0x0028  */
    /* JADX WARN: Code duplicated, block: B:18:0x0033  */
    /* JADX WARN: Code duplicated, block: B:21:0x003b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0070  */
    /* JADX WARN: Code duplicated, block: B:31:0x0078  */
    /* JADX WARN: Code duplicated, block: B:32:0x008c  */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x0078, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SyntheticAccessor"})
    void k(androidx.fragment.app.k<?> kVar, androidx.fragment.app.g gVar, Fragment fragment) {
        r iVar;
        androidx.fragment.app.q qVar;
        Object obj;
        String str;
        androidx.lifecycle.k kVar2;
        if (this.r != null) {
            throw new IllegalStateException("Already attached");
        }
        this.r = kVar;
        this.s = gVar;
        this.t = fragment;
        if (fragment == null) {
            if (kVar instanceof r) {
                iVar = (r) kVar;
            }
            if (this.t != null) {
                o1();
            }
            if (kVar instanceof androidx.activity.c) {
                androidx.activity.c cVar = (androidx.activity.c) kVar;
                OnBackPressedDispatcher onBackPressedDispatcherC = cVar.c();
                this.f399g = onBackPressedDispatcherC;
                kVar2 = cVar;
                if (fragment != null) {
                    kVar2 = fragment;
                }
                onBackPressedDispatcherC.a(kVar2, this.f400h);
            }
            if (fragment != null) {
                qVar = fragment.s.n0(fragment);
            } else if (kVar instanceof androidx.lifecycle.y) {
                qVar = androidx.fragment.app.q.i(((androidx.lifecycle.y) kVar).j());
            } else {
                qVar = new androidx.fragment.app.q(false);
            }
            this.M = qVar;
            this.M.n(K0());
            this.c.x(this.M);
            obj = this.r;
            if (obj instanceof androidx.activity.result.e) {
                androidx.activity.result.d dVarH = ((androidx.activity.result.e) obj).h();
                if (fragment != null) {
                    str = fragment.f + ":";
                } else {
                    str = "";
                }
                String str2 = "FragmentManager:" + str;
                this.z = dVarH.i(str2 + "StartActivityForResult", new androidx.activity.result.g.c(), new j());
                this.A = dVarH.i(str2 + "StartIntentSenderForResult", new k(), new a());
                this.B = dVarH.i(str2 + "RequestPermissions", new androidx.activity.result.g.b(), new b());
            }
        }
        iVar = new i(this, fragment);
        h(iVar);
        if (this.t != null) {
            o1();
        }
        if (kVar instanceof androidx.activity.c) {
            androidx.activity.c cVar2 = (androidx.activity.c) kVar;
            OnBackPressedDispatcher onBackPressedDispatcherC2 = cVar2.c();
            this.f399g = onBackPressedDispatcherC2;
            kVar2 = cVar2;
            if (fragment != null) {
                kVar2 = fragment;
            }
            onBackPressedDispatcherC2.a(kVar2, this.f400h);
        }
        if (fragment != null) {
            qVar = fragment.s.n0(fragment);
        } else if (kVar instanceof androidx.lifecycle.y) {
            qVar = androidx.fragment.app.q.i(((androidx.lifecycle.y) kVar).j());
        } else {
            qVar = new androidx.fragment.app.q(false);
        }
        this.M = qVar;
        this.M.n(K0());
        this.c.x(this.M);
        obj = this.r;
        if (obj instanceof androidx.activity.result.e) {
            androidx.activity.result.d dVarH2 = ((androidx.activity.result.e) obj).h();
            if (fragment != null) {
                str = fragment.f + ":";
            } else {
                str = "";
            }
            String str3 = "FragmentManager:" + str;
            this.z = dVarH2.i(str3 + "StartActivityForResult", new androidx.activity.result.g.c(), new j());
            this.A = dVarH2.i(str3 + "StartIntentSenderForResult", new k(), new a());
            this.B = dVarH2.i(str3 + "RequestPermissions", new androidx.activity.result.g.b(), new b());
        }
    }

    void k1(Fragment fragment) {
        if (fragment == null || (fragment.equals(g0(fragment.f)) && (fragment.t == null || fragment.s == this))) {
            Fragment fragment2 = this.u;
            this.u = fragment;
            M(fragment2);
            M(this.u);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    void l(Fragment fragment) {
        if (F0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.J) {
            fragment.J = false;
            if (fragment.f371l) {
                return;
            }
            this.c.a(fragment);
            if (F0(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (G0(fragment)) {
                this.D = true;
            }
        }
    }

    public w m() {
        return new androidx.fragment.app.a(this);
    }

    public int m0() {
        ArrayList<androidx.fragment.app.a> arrayList = this.d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    void m1(Fragment fragment) {
        if (F0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.I) {
            fragment.I = false;
            fragment.V = !fragment.V;
        }
    }

    boolean o() {
        boolean zG0 = false;
        for (Fragment fragment : this.c.l()) {
            if (fragment != null) {
                zG0 = G0(fragment);
            }
            if (zG0) {
                return true;
            }
        }
        return false;
    }

    androidx.fragment.app.g o0() {
        return this.s;
    }

    public androidx.fragment.app.j q0() {
        androidx.fragment.app.j jVar = this.v;
        if (jVar != null) {
            return jVar;
        }
        Fragment fragment = this.t;
        return fragment != null ? fragment.s.q0() : this.w;
    }

    public final void r(String str) {
        this.f402j.remove(str);
    }

    v r0() {
        return this.c;
    }

    public List<Fragment> s0() {
        return this.c.n();
    }

    androidx.fragment.app.k<?> t0() {
        return this.r;
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.t;
        if (fragment == null) {
            androidx.fragment.app.k<?> kVar = this.r;
            if (kVar != null) {
                sb.append(kVar.getClass().getSimpleName());
                sb.append("{");
                obj = this.r;
            } else {
                sb.append("null");
            }
            sb.append("}}");
            return sb.toString();
        }
        sb.append(fragment.getClass().getSimpleName());
        sb.append("{");
        obj = this.t;
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    void u(androidx.fragment.app.a aVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            aVar.r(z3);
        } else {
            aVar.q();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2 && this.q >= 1) {
            x.C(this.r.k(), this.s, arrayList, arrayList2, 0, 1, true, this.f406n);
        }
        if (z3) {
            O0(this.q, true);
        }
        for (Fragment fragment : this.c.l()) {
            if (fragment != null && fragment.Q != null && fragment.U && aVar.u(fragment.G)) {
                float f2 = fragment.W;
                if (f2 > 0.0f) {
                    fragment.Q.setAlpha(f2);
                }
                if (z3) {
                    fragment.W = 0.0f;
                } else {
                    fragment.W = -1.0f;
                    fragment.U = false;
                }
            }
        }
    }

    LayoutInflater.Factory2 u0() {
        return this.f;
    }

    androidx.fragment.app.m v0() {
        return this.f407o;
    }

    u w(Fragment fragment) {
        u uVarM = this.c.m(fragment.f);
        if (uVarM != null) {
            return uVarM;
        }
        u uVar = new u(this.f407o, this.c, fragment);
        uVar.o(this.r.k().getClassLoader());
        uVar.t(this.q);
        return uVar;
    }

    Fragment w0() {
        return this.t;
    }

    public Fragment x0() {
        return this.u;
    }

    void y(Fragment fragment) {
        if (F0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.J) {
            return;
        }
        fragment.J = true;
        if (fragment.f371l) {
            if (F0(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.c.s(fragment);
            if (G0(fragment)) {
                this.D = true;
            }
            l1(fragment);
        }
    }

    d0 y0() {
        d0 d0Var = this.x;
        if (d0Var != null) {
            return d0Var;
        }
        Fragment fragment = this.t;
        return fragment != null ? fragment.s.y0() : this.y;
    }

    void z() {
        this.E = false;
        this.F = false;
        this.M.n(false);
        T(4);
    }
}
