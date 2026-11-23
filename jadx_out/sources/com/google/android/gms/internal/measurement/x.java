package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {
    final List<n0> a = new ArrayList();

    protected x() {
    }

    public abstract q a(String str, v4 v4Var, List<q> list);

    final q b(String str) {
        if (!this.a.contains(v5.e(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        String strValueOf = String.valueOf(str);
        throw new UnsupportedOperationException(strValueOf.length() != 0 ? "Command not implemented: ".concat(strValueOf) : new String("Command not implemented: "));
    }
}
