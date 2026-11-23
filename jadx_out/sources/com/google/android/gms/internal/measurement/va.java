package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class va extends j {
    final /* synthetic */ xc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    va(wb wbVar, String str, xc xcVar) {
        super("getValue");
        this.c = xcVar;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final q a(v4 v4Var, List<q> list) {
        v5.a("getValue", 2, list);
        q qVarA = v4Var.a(list.get(0));
        q qVarA2 = v4Var.a(list.get(1));
        String strA = this.c.a(qVarA.b());
        return strA != null ? new u(strA) : qVarA2;
    }
}
