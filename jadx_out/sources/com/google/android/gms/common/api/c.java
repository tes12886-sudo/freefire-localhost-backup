package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class c extends Exception {
    private final h.f.a a;

    public c(h.f.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (com.google.android.gms.common.api.internal.b bVar : this.a.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) this.a.get(bVar);
            com.google.android.gms.common.internal.q.k(connectionResult);
            ConnectionResult connectionResult2 = connectionResult;
            z &= !connectionResult2.n();
            arrayList.add(bVar.b() + ": " + String.valueOf(connectionResult2));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        sb.append(TextUtils.join("; ", arrayList));
        return sb.toString();
    }
}
