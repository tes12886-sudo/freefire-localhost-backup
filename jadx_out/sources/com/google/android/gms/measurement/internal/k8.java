package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class k8 implements Runnable {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ ja d;
    final /* synthetic */ boolean e;
    final /* synthetic */ r8 f;

    k8(r8 r8Var, AtomicReference atomicReference, String str, String str2, String str3, ja jaVar, boolean z) {
        this.f = r8Var;
        this.a = atomicReference;
        this.b = str2;
        this.c = str3;
        this.d = jaVar;
        this.e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        List<y9> listE1;
        synchronized (this.a) {
            try {
                try {
                    i3 i3Var = this.f.d;
                    if (i3Var == null) {
                        this.f.a.d().o().d("(legacy) Failed to get user properties; not connected to service", null, this.b, this.c);
                        this.a.set(Collections.emptyList());
                        this.a.notify();
                        return;
                    }
                    if (TextUtils.isEmpty(null)) {
                        com.google.android.gms.common.internal.q.k(this.d);
                        atomicReference2 = this.a;
                        listE1 = i3Var.J0(this.b, this.c, this.e, this.d);
                    } else {
                        atomicReference2 = this.a;
                        listE1 = i3Var.e1(null, this.b, this.c, this.e);
                    }
                    atomicReference2.set(listE1);
                    this.f.D();
                    atomicReference = this.a;
                    atomicReference.notify();
                } catch (RemoteException e) {
                    this.f.a.d().o().d("(legacy) Failed to get user properties; remote exception", null, this.b, e);
                    this.a.set(Collections.emptyList());
                    atomicReference = this.a;
                }
            } catch (Throwable th) {
                this.a.notify();
                throw th;
            }
        }
    }
}
