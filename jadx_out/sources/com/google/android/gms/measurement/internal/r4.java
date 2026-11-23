package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.xc;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class r4 implements xc {
    final /* synthetic */ String a;
    final /* synthetic */ s4 b;

    r4(s4 s4Var, String str) {
        this.b = s4Var;
        this.a = str;
    }

    @Override // com.google.android.gms.internal.measurement.xc
    public final String a(String str) {
        Map map = (Map) this.b.d.get(this.a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
