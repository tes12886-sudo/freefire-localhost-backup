package com.google.android.gms.common.internal.z;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.x;

/* JADX INFO: loaded from: classes.dex */
public final class q extends com.google.android.gms.common.internal.g {
    private final x G;

    public q(Context context, Looper looper, com.google.android.gms.common.internal.d dVar, x xVar, com.google.android.gms.common.api.internal.f fVar, com.google.android.gms.common.api.internal.l lVar) {
        super(context, looper, 270, dVar, fVar, lVar);
        this.G = xVar;
    }

    @Override // com.google.android.gms.common.internal.c
    public final com.google.android.gms.common.c[] A() {
        return j.d.a.c.f.d.f.b;
    }

    @Override // com.google.android.gms.common.internal.c
    protected final Bundle F() {
        return this.G.c();
    }

    @Override // com.google.android.gms.common.internal.c
    protected final String J() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.c
    protected final String K() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.c
    protected final boolean N() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.c, com.google.android.gms.common.api.a.f
    public final int k() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.c
    protected final /* synthetic */ IInterface x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof j ? (j) iInterfaceQueryLocalInterface : new j(iBinder);
    }
}
