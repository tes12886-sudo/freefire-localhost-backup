package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class ha<T> implements oa<T> {
    private final da a;
    private final db<?, ?> b;
    private final boolean c;
    private final m8<?> d;

    private ha(db<?, ?> dbVar, m8<?> m8Var, da daVar) {
        this.b = dbVar;
        this.c = m8Var.a(daVar);
        this.d = m8Var;
        this.a = daVar;
    }

    static <T> ha<T> i(db<?, ?> dbVar, m8<?> m8Var, da daVar) {
        return new ha<>(dbVar, m8Var, daVar);
    }

    @Override // com.google.android.gms.internal.measurement.oa
    public final boolean a(T t) {
        this.d.b(t);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.oa
    public final int b(T t) {
        db<?, ?> dbVar = this.b;
        int iG = dbVar.g(dbVar.d(t));
        if (!this.c) {
            return iG;
        }
        this.d.b(t);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.oa
    public final void c(T t) {
        this.b.e(t);
        this.d.c(t);
    }

    @Override // com.google.android.gms.internal.measurement.oa
    public final void d(T t, h8 h8Var) {
        this.d.b(t);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.oa
    public final void e(T t, T t2) {
        qa.f(this.b, t, t2);
        if (this.c) {
            qa.e(this.d, t, t2);
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.oa
    public final void f(T t, byte[] bArr, int i2, int i3, o7 o7Var) {
        z8 z8Var = (z8) t;
        if (z8Var.zzc == eb.a()) {
            z8Var.zzc = eb.b();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.oa
    public final int g(T t) {
        int iHashCode = this.b.d(t).hashCode();
        if (!this.c) {
            return iHashCode;
        }
        this.d.b(t);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.oa
    public final boolean h(T t, T t2) {
        if (!this.b.d(t).equals(this.b.d(t2))) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        this.d.b(t);
        this.d.b(t2);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.oa
    public final T zza() {
        return (T) this.a.e().T();
    }
}
