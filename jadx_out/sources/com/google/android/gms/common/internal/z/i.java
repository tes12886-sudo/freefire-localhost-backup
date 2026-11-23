package com.google.android.gms.common.internal.z;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class i extends com.google.android.gms.common.internal.g<m> {
    public i(Context context, Looper looper, com.google.android.gms.common.internal.d dVar, com.google.android.gms.common.api.e.b bVar, com.google.android.gms.common.api.e.c cVar) {
        super(context, looper, 39, dVar, bVar, cVar);
    }

    @Override // com.google.android.gms.common.internal.c
    protected final String J() {
        return "com.google.android.gms.common.internal.service.ICommonService";
    }

    @Override // com.google.android.gms.common.internal.c
    public final String K() {
        return "com.google.android.gms.common.service.START";
    }

    @Override // com.google.android.gms.common.internal.c
    protected final /* synthetic */ IInterface x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
        return iInterfaceQueryLocalInterface instanceof m ? (m) iInterfaceQueryLocalInterface : new m(iBinder);
    }
}
