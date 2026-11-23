package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends x {
    @Override // com.google.android.gms.internal.measurement.x
    public final q a(String str, v4 v4Var, List<q> list) {
        if (str == null || str.isEmpty() || !v4Var.d(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", str));
        }
        q qVarH = v4Var.h(str);
        if (qVarH instanceof j) {
            return ((j) qVarH).a(v4Var, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", str));
    }
}
