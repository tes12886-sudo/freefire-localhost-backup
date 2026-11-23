package j.d.a.c.f.c;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.internal.g;

/* JADX INFO: loaded from: classes.dex */
public final class b extends g<c> {
    private final Bundle G;

    public b(Context context, Looper looper, com.google.android.gms.common.internal.d dVar, j.d.a.c.b.a.c cVar, com.google.android.gms.common.api.e.b bVar, com.google.android.gms.common.api.e.c cVar2) {
        super(context, looper, 16, dVar, bVar, cVar2);
        if (cVar != null) {
            throw new NoSuchMethodError();
        }
        this.G = new Bundle();
    }

    @Override // com.google.android.gms.common.internal.c
    protected final Bundle F() {
        return this.G;
    }

    @Override // com.google.android.gms.common.internal.c
    protected final String J() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // com.google.android.gms.common.internal.c
    protected final String K() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // com.google.android.gms.common.internal.c, com.google.android.gms.common.api.a.f
    public final int k() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.c, com.google.android.gms.common.api.a.f
    public final boolean u() {
        com.google.android.gms.common.internal.d dVarO0 = o0();
        return (TextUtils.isEmpty(dVarO0.b()) || dVarO0.e(j.d.a.c.b.a.b.c).isEmpty()) ? false : true;
    }

    @Override // com.google.android.gms.common.internal.c
    protected final /* synthetic */ IInterface x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return iInterfaceQueryLocalInterface instanceof c ? (c) iInterfaceQueryLocalInterface : new d(iBinder);
    }
}
