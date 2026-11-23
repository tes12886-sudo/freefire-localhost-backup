package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* JADX INFO: loaded from: classes.dex */
final class m8 implements Runnable {
    final /* synthetic */ ComponentName a;
    final /* synthetic */ q8 b;

    m8(q8 q8Var, ComponentName componentName) {
        this.b = q8Var;
        this.a = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r8.x(this.b.c, this.a);
    }
}
