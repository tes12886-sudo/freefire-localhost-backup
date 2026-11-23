package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class d<R extends com.google.android.gms.common.api.j, A extends com.google.android.gms.common.api.a.b> extends BasePendingResult<R> implements e<R> {
    private final com.google.android.gms.common.api.a.c<A> r;
    private final com.google.android.gms.common.api.a<?> s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected d(com.google.android.gms.common.api.a<?> aVar, com.google.android.gms.common.api.e eVar) {
        super(eVar);
        com.google.android.gms.common.internal.q.l(eVar, "GoogleApiClient must not be null");
        com.google.android.gms.common.internal.q.l(aVar, "Api must not be null");
        this.r = aVar.b();
        this.s = aVar;
    }

    private void w(RemoteException remoteException) {
        x(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    @Override // com.google.android.gms.common.api.internal.e
    public /* bridge */ /* synthetic */ void a(Object obj) {
        super.j((com.google.android.gms.common.api.j) obj);
    }

    protected abstract void r(A a);

    public final com.google.android.gms.common.api.a<?> s() {
        return this.s;
    }

    public final com.google.android.gms.common.api.a.c<A> t() {
        return this.r;
    }

    protected void u(R r) {
    }

    public final void v(A a) throws DeadObjectException {
        try {
            r(a);
        } catch (DeadObjectException e) {
            w(e);
            throw e;
        } catch (RemoteException e2) {
            w(e2);
        }
    }

    public final void x(Status status) {
        com.google.android.gms.common.internal.q.b(!status.n(), "Failed result must not be success");
        R rF = f(status);
        j(rF);
        u(rF);
    }
}
