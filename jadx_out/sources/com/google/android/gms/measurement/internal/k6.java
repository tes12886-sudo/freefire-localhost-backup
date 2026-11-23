package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class k6 implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ long c;
    final /* synthetic */ Bundle d;
    final /* synthetic */ boolean e;
    final /* synthetic */ boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f1242g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ String f1243h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ d7 f1244i;

    k6(d7 d7Var, String str, String str2, long j2, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.f1244i = d7Var;
        this.a = str;
        this.b = str2;
        this.c = j2;
        this.d = bundle;
        this.e = z;
        this.f = z2;
        this.f1242g = z3;
        this.f1243h = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1244i.Z(this.a, this.b, this.c, this.d, this.e, this.f, this.f1242g, this.f1243h);
    }
}
