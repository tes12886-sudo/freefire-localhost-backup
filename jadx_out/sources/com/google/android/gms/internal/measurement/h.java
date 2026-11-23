package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h implements q {
    private final q a;
    private final String b;

    public h() {
        throw null;
    }

    public h(String str) {
        this.a = q.x;
        this.b = str;
    }

    public h(String str, q qVar) {
        this.a = qVar;
        this.b = str;
    }

    public final q a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final String b() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Double c() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Boolean d() {
        throw new IllegalStateException("Control is not a boolean");
    }

    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.b.equals(hVar.b) && this.a.equals(hVar.a);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Iterator<q> h() {
        return null;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q j() {
        return new h(this.b, this.a.j());
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q q(String str, v4 v4Var, List<q> list) {
        throw new IllegalStateException("Control does not have functions");
    }
}
