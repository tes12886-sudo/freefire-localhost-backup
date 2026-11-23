package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class s7 implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ ja c;
    final /* synthetic */ boolean d;
    final /* synthetic */ com.google.android.gms.internal.measurement.i1 e;
    final /* synthetic */ r8 f;

    s7(r8 r8Var, String str, String str2, ja jaVar, boolean z, com.google.android.gms.internal.measurement.i1 i1Var) {
        this.f = r8Var;
        this.a = str;
        this.b = str2;
        this.c = jaVar;
        this.d = z;
        this.e = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Bundle bundle;
        RemoteException e;
        Bundle bundle2 = new Bundle();
        try {
            i3 i3Var = this.f.d;
            if (i3Var == null) {
                this.f.a.d().o().c("Failed to get user properties; not connected to service", this.a, this.b);
                this.f.a.G().W(this.e, bundle2);
                return;
            }
            com.google.android.gms.common.internal.q.k(this.c);
            List<y9> listJ0 = i3Var.J0(this.a, this.b, this.d, this.c);
            bundle = new Bundle();
            if (listJ0 != null) {
                for (y9 y9Var : listJ0) {
                    String str = y9Var.e;
                    if (str != null) {
                        bundle.putString(y9Var.b, str);
                    } else {
                        Long l2 = y9Var.d;
                        if (l2 != null) {
                            bundle.putLong(y9Var.b, l2.longValue());
                        } else {
                            Double d = y9Var.f1303g;
                            if (d != null) {
                                bundle.putDouble(y9Var.b, d.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    this.f.D();
                    this.f.a.G().W(this.e, bundle);
                } catch (RemoteException e2) {
                    e = e2;
                    this.f.a.d().o().c("Failed to get user properties; remote exception", this.a, e);
                    this.f.a.G().W(this.e, bundle);
                }
            } catch (Throwable th) {
                th = th;
                bundle2 = bundle;
                this.f.a.G().W(this.e, bundle2);
                throw th;
            }
        } catch (RemoteException e3) {
            bundle = bundle2;
            e = e3;
        } catch (Throwable th2) {
            th = th2;
            this.f.a.G().W(this.e, bundle2);
            throw th;
        }
    }
}
