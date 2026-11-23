package com.google.android.gms.common.api.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class i0 extends o0 {
    private final ArrayList b;
    final /* synthetic */ p0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(p0 p0Var, ArrayList arrayList) {
        super(p0Var, null);
        this.c = p0Var;
        this.b = arrayList;
    }

    @Override // com.google.android.gms.common.api.internal.o0
    public final void a() {
        p0 p0Var = this.c;
        p0Var.a.f949n.p = p0.x(p0Var);
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.google.android.gms.common.api.a.f fVar = (com.google.android.gms.common.api.a.f) arrayList.get(i2);
            p0 p0Var2 = this.c;
            fVar.f(p0Var2.f982o, p0Var2.a.f949n.p);
        }
    }
}
