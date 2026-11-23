package com.google.firebase.analytics;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzee;
import com.google.android.gms.measurement.internal.zzhx;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class d implements zzhx {
    final /* synthetic */ zzee a;

    d(zzee zzeeVar) {
        this.a = zzeeVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final String a() {
        return this.a.M();
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final void b(String str, String str2, Bundle bundle) {
        this.a.y(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final void c(String str) {
        this.a.J(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final void d(String str, String str2, Bundle bundle) {
        this.a.B(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final String e() {
        return this.a.a();
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final String f() {
        return this.a.L();
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final long g() {
        return this.a.N();
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final List<Bundle> h(String str, String str2) {
        return this.a.C(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final String i() {
        return this.a.O();
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final void j(Bundle bundle) {
        this.a.A(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final int k(String str) {
        return this.a.d(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final Map<String, Object> l(String str, String str2, boolean z) {
        return this.a.b(str, str2, z);
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final void m(String str) {
        this.a.K(str);
    }
}
