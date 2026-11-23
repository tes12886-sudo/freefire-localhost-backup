package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes.dex */
final class z1 extends s2 {
    final /* synthetic */ String e;
    final /* synthetic */ String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ Context f1154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ Bundle f1155h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ zzee f1156i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z1(zzee zzeeVar, String str, String str2, Context context, Bundle bundle) {
        super(zzeeVar, true);
        this.f1156i = zzeeVar;
        this.e = str;
        this.f = str2;
        this.f1154g = context;
        this.f1155h = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.s2
    public final void a() {
        String str;
        String str2;
        String str3;
        try {
            zzee zzeeVar = this.f1156i;
            if (zzee.s(this.e, this.f)) {
                String str4 = this.f;
                str2 = this.e;
                str3 = str4;
                str = this.f1156i.a;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            com.google.android.gms.common.internal.q.k(this.f1154g);
            zzee zzeeVar2 = this.f1156i;
            zzeeVar2.f1159h = zzeeVar2.v(this.f1154g, true);
            if (this.f1156i.f1159h == null) {
                Log.w(this.f1156i.a, "Failed to connect to measurement client.");
                return;
            }
            int iA = DynamiteModule.a(this.f1154g, ModuleDescriptor.MODULE_ID);
            int iB = DynamiteModule.b(this.f1154g, ModuleDescriptor.MODULE_ID);
            o1 o1Var = new o1(42004L, Math.max(iA, iB), iB < iA, str, str2, str3, this.f1155h, com.google.android.gms.measurement.internal.t4.a(this.f1154g));
            f1 f1Var = this.f1156i.f1159h;
            com.google.android.gms.common.internal.q.k(f1Var);
            f1Var.initialize(j.d.a.c.e.b.c1(this.f1154g), o1Var, this.a);
        } catch (Exception e) {
            this.f1156i.q(e, true, false);
        }
    }
}
