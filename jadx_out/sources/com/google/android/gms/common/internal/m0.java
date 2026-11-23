package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.GoogleApiAvailabilityLight;

/* JADX INFO: loaded from: classes.dex */
public final class m0 {
    private final SparseIntArray a = new SparseIntArray();
    private GoogleApiAvailabilityLight b;

    public m0(GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        q.k(googleApiAvailabilityLight);
        this.b = googleApiAvailabilityLight;
    }

    public final int a(Context context, int i2) {
        return this.a.get(i2, -1);
    }

    public final int b(Context context, com.google.android.gms.common.api.a.f fVar) {
        q.k(context);
        q.k(fVar);
        int i2 = 0;
        if (!fVar.i()) {
            return 0;
        }
        int iK = fVar.k();
        int iA = a(context, iK);
        if (iA == -1) {
            int i3 = 0;
            while (true) {
                if (i3 >= this.a.size()) {
                    i2 = -1;
                    break;
                }
                int iKeyAt = this.a.keyAt(i3);
                if (iKeyAt > iK && this.a.get(iKeyAt) == 0) {
                    break;
                }
                i3++;
            }
            iA = i2 == -1 ? this.b.isGooglePlayServicesAvailable(context, iK) : i2;
            this.a.put(iK, iA);
        }
        return iA;
    }

    public final void c() {
        this.a.clear();
    }
}
