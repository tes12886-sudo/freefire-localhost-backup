package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class i8 implements Runnable {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ ja d;
    final /* synthetic */ r8 e;

    i8(r8 r8Var, AtomicReference atomicReference, String str, String str2, String str3, ja jaVar) {
        this.e = r8Var;
        this.a = atomicReference;
        this.b = str2;
        this.c = str3;
        this.d = jaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        List<b> listL0;
        synchronized (this.a) {
            try {
                try {
                    i3 i3Var = this.e.d;
                    if (i3Var == null) {
                        this.e.a.d().o().d("(legacy) Failed to get conditional properties; not connected to service", null, this.b, this.c);
                        this.a.set(Collections.emptyList());
                        this.a.notify();
                        return;
                    }
                    if (TextUtils.isEmpty(null)) {
                        com.google.android.gms.common.internal.q.k(this.d);
                        atomicReference2 = this.a;
                        listL0 = i3Var.q(this.b, this.c, this.d);
                    } else {
                        atomicReference2 = this.a;
                        listL0 = i3Var.L0(null, this.b, this.c);
                    }
                    atomicReference2.set(listL0);
                    this.e.D();
                    atomicReference = this.a;
                    atomicReference.notify();
                } catch (RemoteException e) {
                    this.e.a.d().o().d("(legacy) Failed to get conditional properties; remote exception", null, this.b, e);
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
