package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class n3 extends com.google.android.gms.common.internal.c<i3> {
    public n3(Context context, Looper looper, com.google.android.gms.common.internal.c.a aVar, com.google.android.gms.common.internal.c.b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    @Override // com.google.android.gms.common.internal.c
    protected final String J() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // com.google.android.gms.common.internal.c
    protected final String K() {
        return "com.google.android.gms.measurement.START";
    }

    @Override // com.google.android.gms.common.internal.c, com.google.android.gms.common.api.a.f
    public final int k() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.c
    public final /* bridge */ /* synthetic */ IInterface x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof i3 ? (i3) iInterfaceQueryLocalInterface : new g3(iBinder);
    }
}
