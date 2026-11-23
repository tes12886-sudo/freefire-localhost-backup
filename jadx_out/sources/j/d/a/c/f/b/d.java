package j.d.a.c.f.b;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.g;

/* JADX INFO: loaded from: classes.dex */
public final class d extends g<e> {
    private final j.d.a.c.b.a.a.C0231a G;

    public d(Context context, Looper looper, com.google.android.gms.common.internal.d dVar, j.d.a.c.b.a.a.C0231a c0231a, com.google.android.gms.common.api.e.b bVar, com.google.android.gms.common.api.e.c cVar) {
        super(context, looper, 68, dVar, bVar, cVar);
        this.G = c0231a;
    }

    @Override // com.google.android.gms.common.internal.c
    protected final Bundle F() {
        j.d.a.c.b.a.a.C0231a c0231a = this.G;
        return c0231a == null ? new Bundle() : c0231a.a();
    }

    @Override // com.google.android.gms.common.internal.c
    protected final String J() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.c
    protected final String K() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    @Override // com.google.android.gms.common.internal.c, com.google.android.gms.common.api.a.f
    public final int k() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.c
    protected final /* synthetic */ IInterface x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof e ? (e) iInterfaceQueryLocalInterface : new f(iBinder);
    }
}
