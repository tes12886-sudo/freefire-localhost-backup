package androidx.fragment.app;

import android.view.ViewGroup;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {
    int b;
    int c;
    int d;
    int e;
    int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f420g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String f421h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f422i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    CharSequence f423j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f424k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    CharSequence f425l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    ArrayList<String> f426m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ArrayList<String> f427n;
    ArrayList<Runnable> p;
    ArrayList<a> a = new ArrayList<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f428o = false;

    static final class a {
        int a;
        Fragment b;
        int c;
        int d;
        int e;
        int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        androidx.lifecycle.g.c f429g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        androidx.lifecycle.g.c f430h;

        a() {
        }

        a(int i2, Fragment fragment) {
            this.a = i2;
            this.b = fragment;
            androidx.lifecycle.g.c cVar = androidx.lifecycle.g.c.RESUMED;
            this.f429g = cVar;
            this.f430h = cVar;
        }
    }

    w(j jVar, ClassLoader classLoader) {
    }

    public w b(int i2, Fragment fragment, String str) {
        j(i2, fragment, str, 1);
        return this;
    }

    w c(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.P = viewGroup;
        b(viewGroup.getId(), fragment, str);
        return this;
    }

    public w d(Fragment fragment, String str) {
        j(0, fragment, str, 1);
        return this;
    }

    void e(a aVar) {
        this.a.add(aVar);
        aVar.c = this.b;
        aVar.d = this.c;
        aVar.e = this.d;
        aVar.f = this.e;
    }

    public abstract int f();

    public abstract int g();

    public abstract void h();

    public w i() {
        if (this.f420g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        return this;
    }

    void j(int i2, Fragment fragment, String str, int i3) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.H;
            if (str2 != null && !str.equals(str2)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.H + " now " + str);
            }
            fragment.H = str;
        }
        if (i2 != 0) {
            if (i2 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i4 = fragment.F;
            if (i4 != 0 && i4 != i2) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.F + " now " + i2);
            }
            fragment.F = i2;
            fragment.G = i2;
        }
        e(new a(i3, fragment));
    }

    public w k(Fragment fragment) {
        e(new a(3, fragment));
        return this;
    }

    public w l(boolean z) {
        this.f428o = z;
        return this;
    }
}
