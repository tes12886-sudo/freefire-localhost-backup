package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class ra extends za {
    ra(int i2) {
        super(i2, null);
    }

    @Override // com.google.android.gms.internal.measurement.za
    public final void a() {
        if (!b()) {
            for (int i2 = 0; i2 < c(); i2++) {
                Map.Entry entryD = d(i2);
                if (((p8) entryD.getKey()).b()) {
                    entryD.setValue(Collections.unmodifiableList((List) entryD.getValue()));
                }
            }
            for (Map.Entry entry : e()) {
                if (((p8) entry.getKey()).b()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
