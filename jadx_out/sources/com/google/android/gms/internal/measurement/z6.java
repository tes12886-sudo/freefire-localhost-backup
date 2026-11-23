package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
final class z6<T> implements Serializable, y6 {
    final y6<T> a;
    volatile transient boolean b;

    @NullableDecl
    transient T c;

    z6(y6<T> y6Var) {
        y6Var.getClass();
        this.a = y6Var;
    }

    public final String toString() {
        Object string;
        if (this.b) {
            String strValueOf = String.valueOf(this.c);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(strValueOf);
            sb.append(">");
            string = sb.toString();
        } else {
            string = this.a;
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
                    return tZza;
                }
            }
        }
        return this.c;
    }
}
