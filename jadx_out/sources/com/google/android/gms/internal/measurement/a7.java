package com.google.android.gms.internal.measurement;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
final class a7<T> implements y6<T> {
    volatile y6<T> a;
    volatile boolean b;

    @NullableDecl
    T c;

    a7(y6<T> y6Var) {
        y6Var.getClass();
        this.a = y6Var;
    }

    public final String toString() {
        Object string = this.a;
        if (string == null) {
            String strValueOf = String.valueOf(this.c);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(strValueOf);
            sb.append(">");
            string = sb.toString();
        }
        String strValueOf2 = String.valueOf(string);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(strValueOf2);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.y6
    public final T zza() {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    T tZza = this.a.zza();
                    this.c = tZza;
                    this.b = true;
                    this.a = null;
                    return tZza;
                }
            }
        }
        return this.c;
    }
}
