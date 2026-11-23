package o;

import javax.annotation.Nullable;
import m.d0;
import m.e0;

/* JADX INFO: loaded from: classes.dex */
public final class t<T> {
    private final d0 a;

    @Nullable
    private final T b;

    @Nullable
    private final e0 c;

    private t(d0 d0Var, @Nullable T t, @Nullable e0 e0Var) {
        this.a = d0Var;
        this.b = t;
        this.c = e0Var;
    }

    public static <T> t<T> c(e0 e0Var, d0 d0Var) {
        defpackage.e.a(e0Var, "body == null");
        defpackage.e.a(d0Var, "rawResponse == null");
        if (d0Var.Y()) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new t<>(d0Var, null, e0Var);
    }

    public static <T> t<T> h(@Nullable T t, d0 d0Var) {
        defpackage.e.a(d0Var, "rawResponse == null");
        if (d0Var.Y()) {
            return new t<>(d0Var, t, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    @Nullable
    public T a() {
        return this.b;
    }

    public int b() {
        return this.a.l();
    }

    @Nullable
    public e0 d() {
        return this.c;
    }

    public m.u e() {
        return this.a.T();
    }

    public boolean f() {
        return this.a.Y();
    }

    public String g() {
        return this.a.Z();
    }

    public String toString() {
        return this.a.toString();
    }
}
