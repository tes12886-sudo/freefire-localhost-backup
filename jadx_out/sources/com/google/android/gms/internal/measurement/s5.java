package com.google.android.gms.internal.measurement;

import android.content.Context;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class s5 extends o6 {
    private final Context a;
    private final y6<v6<e6>> b;

    s5(Context context, @Nullable y6<v6<e6>> y6Var) {
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        this.a = context;
        this.b = y6Var;
    }

    @Override // com.google.android.gms.internal.measurement.o6
    final Context a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.measurement.o6
    @Nullable
    final y6<v6<e6>> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o6) {
            o6 o6Var = (o6) obj;
            if (this.a.equals(o6Var.a())) {
                y6<v6<e6>> y6Var = this.b;
                y6<v6<e6>> y6VarB = o6Var.b();
                if (y6Var != null ? y6Var.equals(y6VarB) : y6VarB == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        y6<v6<e6>> y6Var = this.b;
        return iHashCode ^ (y6Var == null ? 0 : y6Var.hashCode());
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 46 + String.valueOf(strValueOf2).length());
        sb.append("FlagsContext{context=");
        sb.append(strValueOf);
        sb.append(", hermeticFileOverrides=");
        sb.append(strValueOf2);
        sb.append("}");
        return sb.toString();
    }
}
