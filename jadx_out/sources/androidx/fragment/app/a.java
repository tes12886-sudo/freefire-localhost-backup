package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class a extends w implements n.o {
    final n q;
    boolean r;
    int s;

    a(n nVar) {
        super(nVar.q0(), nVar.t0() != null ? nVar.t0().k().getClassLoader() : null);
        this.s = -1;
        this.q = nVar;
    }

    private static boolean w(w.a aVar) {
        Fragment fragment = aVar.b;
        return (fragment == null || !fragment.f371l || fragment.Q == null || fragment.J || fragment.I || !fragment.e0()) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    Fragment A(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            w.a aVar = this.a.get(size);
            int i2 = aVar.a;
            if (i2 == 1) {
                arrayList.remove(aVar.b);
            } else if (i2 != 3) {
                switch (i2) {
                    case 6:
                        arrayList.add(aVar.b);
                        break;
                    case 7:
                        arrayList.remove(aVar.b);
                        break;
                    case 8:
                        fragment = null;
                        break;
                    case 9:
                        fragment = aVar.b;
                        break;
                    case 10:
                        aVar.f430h = aVar.f429g;
                        break;
                }
            } else {
                arrayList.add(aVar.b);
            }
        }
        return fragment;
    }

    @Override // androidx.fragment.app.n.o
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (n.F0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f420g) {
            return true;
        }
        this.q.e(this);
        return true;
    }

    @Override // androidx.fragment.app.w
    public int f() {
        return n(false);
    }

    @Override // androidx.fragment.app.w
    public int g() {
        return n(true);
    }

    @Override // androidx.fragment.app.w
    public void h() {
        i();
        this.q.c0(this, true);
    }

    @Override // androidx.fragment.app.w
    void j(int i2, Fragment fragment, String str, int i3) {
        super.j(i2, fragment, str, i3);
        fragment.s = this.q;
    }

    @Override // androidx.fragment.app.w
    public w k(Fragment fragment) {
        n nVar = fragment.s;
        if (nVar == null || nVar == this.q) {
            super.k(fragment);
            return this;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    void m(int i2) {
        if (this.f420g) {
            if (n.F0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i2);
            }
            int size = this.a.size();
            for (int i3 = 0; i3 < size; i3++) {
                w.a aVar = this.a.get(i3);
                Fragment fragment = aVar.b;
                if (fragment != null) {
                    fragment.r += i2;
                    if (n.F0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.b + " to " + aVar.b.r);
                    }
                }
            }
        }
    }

    int n(boolean z) {
        if (this.r) {
            throw new IllegalStateException("commit already called");
        }
        if (n.F0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new b0("FragmentManager"));
            o("  ", printWriter);
            printWriter.close();
        }
        this.r = true;
        this.s = this.f420g ? this.q.j() : -1;
        this.q.Z(this, z);
        return this.s;
    }

    public void o(String str, PrintWriter printWriter) {
        p(str, printWriter, true);
    }

    public void p(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f421h);
            printWriter.print(" mIndex=");
            printWriter.print(this.s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.r);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.b != 0 || this.c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.f422i != 0 || this.f423j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f422i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f423j);
            }
            if (this.f424k != 0 || this.f425l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f424k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f425l);
            }
        }
        if (this.a.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            w.a aVar = this.a.get(i2);
            switch (aVar.a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i2);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.b);
            if (z) {
                if (aVar.c != 0 || aVar.d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.d));
                }
                if (aVar.e != 0 || aVar.f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f));
                }
            }
        }
    }

    void q() {
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            w.a aVar = this.a.get(i2);
            Fragment fragment = aVar.b;
            if (fragment != null) {
                fragment.D1(false);
                fragment.B1(this.f);
                fragment.G1(this.f426m, this.f427n);
            }
            switch (aVar.a) {
                case 1:
                    fragment.w1(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.q.i1(fragment, false);
                    this.q.g(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.a);
                case 3:
                    fragment.w1(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.q.a1(fragment);
                    break;
                case 4:
                    fragment.w1(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.q.C0(fragment);
                    break;
                case 5:
                    fragment.w1(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.q.i1(fragment, false);
                    this.q.m1(fragment);
                    break;
                case 6:
                    fragment.w1(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.q.y(fragment);
                    break;
                case 7:
                    fragment.w1(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.q.i1(fragment, false);
                    this.q.l(fragment);
                    break;
                case 8:
                    this.q.k1(fragment);
                    break;
                case 9:
                    this.q.k1(null);
                    break;
                case 10:
                    this.q.j1(fragment, aVar.f430h);
                    break;
            }
            if (!this.f428o && aVar.a != 1 && fragment != null && !n.P) {
                this.q.N0(fragment);
            }
        }
        if (this.f428o || n.P) {
            return;
        }
        n nVar = this.q;
        nVar.O0(nVar.q, true);
    }

    void r(boolean z) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            w.a aVar = this.a.get(size);
            Fragment fragment = aVar.b;
            if (fragment != null) {
                fragment.D1(true);
                fragment.B1(n.f1(this.f));
                fragment.G1(this.f427n, this.f426m);
            }
            switch (aVar.a) {
                case 1:
                    fragment.w1(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.q.i1(fragment, true);
                    this.q.a1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.a);
                case 3:
                    fragment.w1(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.q.g(fragment);
                    break;
                case 4:
                    fragment.w1(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.q.m1(fragment);
                    break;
                case 5:
                    fragment.w1(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.q.i1(fragment, true);
                    this.q.C0(fragment);
                    break;
                case 6:
                    fragment.w1(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.q.l(fragment);
                    break;
                case 7:
                    fragment.w1(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.q.i1(fragment, true);
                    this.q.y(fragment);
                    break;
                case 8:
                    this.q.k1(null);
                    break;
                case 9:
                    this.q.k1(fragment);
                    break;
                case 10:
                    this.q.j1(fragment, aVar.f429g);
                    break;
            }
            if (!this.f428o && aVar.a != 3 && fragment != null && !n.P) {
                this.q.N0(fragment);
            }
        }
        if (this.f428o || !z || n.P) {
            return;
        }
        n nVar = this.q;
        nVar.O0(nVar.q, true);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b2  */
    Fragment s(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i2 = 0;
        while (i2 < this.a.size()) {
            w.a aVar = this.a.get(i2);
            int i3 = aVar.a;
            if (i3 == 1) {
                arrayList.add(aVar.b);
            } else if (i3 == 2) {
                Fragment fragment3 = aVar.b;
                int i4 = fragment3.G;
                boolean z = false;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    Fragment fragment4 = arrayList.get(size);
                    if (fragment4.G == i4) {
                        if (fragment4 == fragment3) {
                            z = true;
                        } else {
                            if (fragment4 == fragment2) {
                                this.a.add(i2, new w.a(9, fragment4));
                                i2++;
                                fragment2 = null;
                            }
                            w.a aVar2 = new w.a(3, fragment4);
                            aVar2.c = aVar.c;
                            aVar2.e = aVar.e;
                            aVar2.d = aVar.d;
                            aVar2.f = aVar.f;
                            this.a.add(i2, aVar2);
                            arrayList.remove(fragment4);
                            i2++;
                        }
                    }
                }
                if (z) {
                    this.a.remove(i2);
                    i2--;
                } else {
                    aVar.a = 1;
                    arrayList.add(fragment3);
                }
            } else if (i3 == 3 || i3 == 6) {
                arrayList.remove(aVar.b);
                Fragment fragment5 = aVar.b;
                if (fragment5 == fragment2) {
                    this.a.add(i2, new w.a(9, fragment5));
                    i2++;
                    fragment2 = null;
                }
            } else if (i3 == 7) {
                arrayList.add(aVar.b);
            } else if (i3 == 8) {
                this.a.add(i2, new w.a(9, fragment2));
                i2++;
                fragment2 = aVar.b;
            }
            i2++;
        }
        return fragment2;
    }

    public String t() {
        return this.f421h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.s >= 0) {
            sb.append(" #");
            sb.append(this.s);
        }
        if (this.f421h != null) {
            sb.append(" ");
            sb.append(this.f421h);
        }
        sb.append("}");
        return sb.toString();
    }

    boolean u(int i2) {
        int size = this.a.size();
        for (int i3 = 0; i3 < size; i3++) {
            Fragment fragment = this.a.get(i3).b;
            int i4 = fragment != null ? fragment.G : 0;
            if (i4 != 0 && i4 == i2) {
                return true;
            }
        }
        return false;
    }

    boolean v(ArrayList<a> arrayList, int i2, int i3) {
        if (i3 == i2) {
            return false;
        }
        int size = this.a.size();
        int i4 = -1;
        for (int i5 = 0; i5 < size; i5++) {
            Fragment fragment = this.a.get(i5).b;
            int i6 = fragment != null ? fragment.G : 0;
            if (i6 != 0 && i6 != i4) {
                for (int i7 = i2; i7 < i3; i7++) {
                    a aVar = arrayList.get(i7);
                    int size2 = aVar.a.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        Fragment fragment2 = aVar.a.get(i8).b;
                        if ((fragment2 != null ? fragment2.G : 0) == i6) {
                            return true;
                        }
                    }
                }
                i4 = i6;
            }
        }
        return false;
    }

    boolean x() {
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            if (w(this.a.get(i2))) {
                return true;
            }
        }
        return false;
    }

    public void y() {
        if (this.p != null) {
            for (int i2 = 0; i2 < this.p.size(); i2++) {
                this.p.get(i2).run();
            }
            this.p = null;
        }
    }

    void z(Fragment.g gVar) {
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            w.a aVar = this.a.get(i2);
            if (w(aVar)) {
                aVar.b.C1(gVar);
            }
        }
    }
}
