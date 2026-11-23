package com.google.android.play.core.assetpacks;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class o0 {
    private final Map<String, Double> a = new HashMap();

    o0() {
    }

    final synchronized void a(String str) {
        this.a.put(str, Double.valueOf(0.0d));
    }

    final synchronized double b(String str) {
        Double d = this.a.get(str);
        if (d == null) {
            return 0.0d;
        }
        return d.doubleValue();
    }

    final synchronized double c(String str, c1 c1Var) {
        double d;
        double d2 = ((i0) c1Var).f1318g;
        Double.isNaN(d2);
        double d3 = d2 + 1.0d;
        double d4 = ((i0) c1Var).f1319h;
        Double.isNaN(d4);
        d = d3 / d4;
        this.a.put(str, Double.valueOf(d));
        return d;
    }
}
