package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public class k9 {
    protected volatile da a;
    private volatile z7 b;

    static {
        l8.a();
    }

    public final int a() {
        if (this.b != null) {
            return ((y7) this.b).c.length;
        }
        if (this.a != null) {
            return this.a.d();
        }
        return 0;
    }

    public final z7 b() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            this.b = this.a == null ? z7.b : this.a.a();
            return this.b;
        }
    }

    protected final void c(da daVar) {
        if (this.a != null) {
            return;
        }
        synchronized (this) {
            if (this.a == null) {
                try {
                    this.a = daVar;
                    this.b = z7.b;
                } catch (i9 unused) {
                    this.a = daVar;
                    this.b = z7.b;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k9)) {
            return false;
        }
        k9 k9Var = (k9) obj;
        da daVar = this.a;
        da daVar2 = k9Var.a;
        if (daVar == null && daVar2 == null) {
            return b().equals(k9Var.b());
        }
        if (daVar != null && daVar2 != null) {
            return daVar.equals(daVar2);
        }
        if (daVar != null) {
            k9Var.c(daVar.h());
            return daVar.equals(k9Var.a);
        }
        c(daVar2.h());
        return this.a.equals(daVar2);
    }

    public int hashCode() {
        return 1;
    }
}
