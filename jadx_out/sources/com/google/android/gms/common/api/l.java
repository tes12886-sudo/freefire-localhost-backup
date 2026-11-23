package com.google.android.gms.common.api;

import android.util.Log;
import com.google.android.gms.common.api.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class l<R extends j> implements k<R> {
    @Override // com.google.android.gms.common.api.k
    public final void a(R r) {
        Status statusC = r.c();
        if (statusC.n()) {
            c(r);
            return;
        }
        b(statusC);
        if (r instanceof h) {
            try {
                ((h) r).a();
            } catch (RuntimeException e) {
                Log.w("ResultCallbacks", "Unable to release ".concat(String.valueOf(String.valueOf(r))), e);
            }
        }
    }

    public abstract void b(Status status);

    public abstract void c(R r);
}
