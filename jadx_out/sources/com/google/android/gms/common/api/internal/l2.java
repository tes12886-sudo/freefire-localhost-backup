package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class l2 {
    public static final Status c = new Status(8, "The connection to Google Play services was lost");
    final Set a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    private final k2 b = new k2(this);

    final void a(BasePendingResult basePendingResult) {
        this.a.add(basePendingResult);
        basePendingResult.q(this.b);
    }

    public final void b() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.a.toArray(new BasePendingResult[0])) {
            basePendingResult.q(null);
            if (basePendingResult.p()) {
                this.a.remove(basePendingResult);
            }
        }
    }
}
