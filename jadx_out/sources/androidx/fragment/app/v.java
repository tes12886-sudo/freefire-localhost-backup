package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class v {
    private final ArrayList<Fragment> a = new ArrayList<>();
    private final HashMap<String, u> b = new HashMap<>();
    private q c;

    v() {
    }

    void a(Fragment fragment) {
        if (this.a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.a) {
            this.a.add(fragment);
        }
        fragment.f371l = true;
    }

    void b() {
        this.b.values().removeAll(Collections.singleton(null));
    }

    boolean c(String str) {
        return this.b.get(str) != null;
    }

    void d(int i2) {
        for (u uVar : this.b.values()) {
            if (uVar != null) {
                uVar.t(i2);
            }
        }
    }

    void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (u uVar : this.b.values()) {
                printWriter.print(str);
                if (uVar != null) {
                    Fragment fragmentK = uVar.k();
                    printWriter.println(fragmentK);
                    fragmentK.i(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = this.a.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    Fragment f(String str) {
        u uVar = this.b.get(str);
        if (uVar != null) {
            return uVar.k();
        }
        return null;
    }

    Fragment g(int i2) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.a.get(size);
            if (fragment != null && fragment.F == i2) {
                return fragment;
            }
        }
        for (u uVar : this.b.values()) {
            if (uVar != null) {
                Fragment fragmentK = uVar.k();
                if (fragmentK.F == i2) {
                    return fragmentK;
                }
            }
        }
        return null;
    }

    Fragment h(String str) {
        if (str != null) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.a.get(size);
                if (fragment != null && str.equals(fragment.H)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (u uVar : this.b.values()) {
            if (uVar != null) {
                Fragment fragmentK = uVar.k();
                if (str.equals(fragmentK.H)) {
                    return fragmentK;
                }
            }
        }
        return null;
    }

    Fragment i(String str) {
        Fragment fragmentL;
        for (u uVar : this.b.values()) {
            if (uVar != null && (fragmentL = uVar.k().l(str)) != null) {
                return fragmentL;
            }
        }
        return null;
    }

    int j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.P;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.a.indexOf(fragment);
        for (int i2 = iIndexOf - 1; i2 >= 0; i2--) {
            Fragment fragment2 = this.a.get(i2);
            if (fragment2.P == viewGroup && (view2 = fragment2.Q) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.a.size()) {
                return -1;
            }
            Fragment fragment3 = this.a.get(iIndexOf);
            if (fragment3.P == viewGroup && (view = fragment3.Q) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    List<u> k() {
        ArrayList arrayList = new ArrayList();
        for (u uVar : this.b.values()) {
            if (uVar != null) {
                arrayList.add(uVar);
            }
        }
        return arrayList;
    }

    List<Fragment> l() {
        ArrayList arrayList = new ArrayList();
        Iterator<u> it = this.b.values().iterator();
        while (it.hasNext()) {
            u next = it.next();
            arrayList.add(next != null ? next.k() : null);
        }
        return arrayList;
    }

    u m(String str) {
        return this.b.get(str);
    }

    List<Fragment> n() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    q o() {
        return this.c;
    }

    void p(u uVar) {
        Fragment fragmentK = uVar.k();
        if (c(fragmentK.f)) {
            return;
        }
        this.b.put(fragmentK.f, uVar);
        if (fragmentK.L) {
            if (fragmentK.K) {
                this.c.e(fragmentK);
            } else {
                this.c.m(fragmentK);
            }
            fragmentK.L = false;
        }
        if (n.F0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragmentK);
        }
    }

    void q(u uVar) {
        Fragment fragmentK = uVar.k();
        if (fragmentK.K) {
            this.c.m(fragmentK);
        }
        if (this.b.put(fragmentK.f, null) != null && n.F0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragmentK);
        }
    }

    void r() {
        Iterator<Fragment> it = this.a.iterator();
        while (it.hasNext()) {
            u uVar = this.b.get(it.next().f);
            if (uVar != null) {
                uVar.m();
            }
        }
        for (u uVar2 : this.b.values()) {
            if (uVar2 != null) {
                uVar2.m();
                Fragment fragmentK = uVar2.k();
                if (fragmentK.f372m && !fragmentK.c0()) {
                    q(uVar2);
                }
            }
        }
    }

    void s(Fragment fragment) {
        synchronized (this.a) {
            this.a.remove(fragment);
        }
        fragment.f371l = false;
    }

    void t() {
        this.b.clear();
    }

    void u(List<String> list) {
        this.a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment fragmentF = f(str);
                if (fragmentF == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (n.F0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + fragmentF);
                }
                a(fragmentF);
            }
        }
    }

    ArrayList<t> v() {
        ArrayList<t> arrayList = new ArrayList<>(this.b.size());
        for (u uVar : this.b.values()) {
            if (uVar != null) {
                Fragment fragmentK = uVar.k();
                t tVarR = uVar.r();
                arrayList.add(tVarR);
                if (n.F0(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragmentK + ": " + tVarR.f419m);
                }
            }
        }
        return arrayList;
    }

    ArrayList<String> w() {
        synchronized (this.a) {
            if (this.a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.a.size());
            for (Fragment fragment : this.a) {
                arrayList.add(fragment.f);
                if (n.F0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment.f + "): " + fragment);
                }
            }
            return arrayList;
        }
    }

    void x(q qVar) {
        this.c = qVar;
    }
}
