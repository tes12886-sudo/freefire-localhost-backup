package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class q extends androidx.lifecycle.v {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final androidx.lifecycle.w.a f410i = new a();
    private final boolean e;
    private final HashMap<String, Fragment> b = new HashMap<>();
    private final HashMap<String, q> c = new HashMap<>();
    private final HashMap<String, androidx.lifecycle.x> d = new HashMap<>();
    private boolean f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f411g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f412h = false;

    class a implements androidx.lifecycle.w.a {
        a() {
        }

        @Override // androidx.lifecycle.w.a
        public <T extends androidx.lifecycle.v> T a(Class<T> cls) {
            return new q(true);
        }
    }

    q(boolean z) {
        this.e = z;
    }

    static q i(androidx.lifecycle.x xVar) {
        return (q) new androidx.lifecycle.w(xVar, f410i).a(q.class);
    }

    @Override // androidx.lifecycle.v
    protected void d() {
        if (n.F0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f = true;
    }

    void e(Fragment fragment) {
        if (this.f412h) {
            if (n.F0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.b.containsKey(fragment.f)) {
                return;
            }
            this.b.put(fragment.f, fragment);
            if (n.F0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return this.b.equals(qVar.b) && this.c.equals(qVar.c) && this.d.equals(qVar.d);
    }

    void f(Fragment fragment) {
        if (n.F0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        q qVar = this.c.get(fragment.f);
        if (qVar != null) {
            qVar.d();
            this.c.remove(fragment.f);
        }
        androidx.lifecycle.x xVar = this.d.get(fragment.f);
        if (xVar != null) {
            xVar.a();
            this.d.remove(fragment.f);
        }
    }

    Fragment g(String str) {
        return this.b.get(str);
    }

    q h(Fragment fragment) {
        q qVar = this.c.get(fragment.f);
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q(this.e);
        this.c.put(fragment.f, qVar2);
        return qVar2;
    }

    public int hashCode() {
        return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    Collection<Fragment> j() {
        return new ArrayList(this.b.values());
    }

    androidx.lifecycle.x k(Fragment fragment) {
        androidx.lifecycle.x xVar = this.d.get(fragment.f);
        if (xVar != null) {
            return xVar;
        }
        androidx.lifecycle.x xVar2 = new androidx.lifecycle.x();
        this.d.put(fragment.f, xVar2);
        return xVar2;
    }

    boolean l() {
        return this.f;
    }

    void m(Fragment fragment) {
        if (this.f412h) {
            if (n.F0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if ((this.b.remove(fragment.f) != null) && n.F0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    void n(boolean z) {
        this.f412h = z;
    }

    boolean o(Fragment fragment) {
        if (this.b.containsKey(fragment.f)) {
            return this.e ? this.f : !this.f411g;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
