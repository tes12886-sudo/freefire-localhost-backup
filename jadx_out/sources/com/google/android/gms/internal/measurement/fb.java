package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class fb extends db<eb, eb> {
    fb() {
    }

    @Override // com.google.android.gms.internal.measurement.db
    final /* bridge */ /* synthetic */ void a(eb ebVar, int i2, long j2) {
        ebVar.h(i2 << 3, Long.valueOf(j2));
    }

    @Override // com.google.android.gms.internal.measurement.db
    final /* bridge */ /* synthetic */ eb b() {
        return eb.b();
    }

    @Override // com.google.android.gms.internal.measurement.db
    final /* bridge */ /* synthetic */ void c(Object obj, eb ebVar) {
        ((z8) obj).zzc = ebVar;
    }

    @Override // com.google.android.gms.internal.measurement.db
    final /* bridge */ /* synthetic */ eb d(Object obj) {
        return ((z8) obj).zzc;
    }

    @Override // com.google.android.gms.internal.measurement.db
    final void e(Object obj) {
        ((z8) obj).zzc.d();
    }

    @Override // com.google.android.gms.internal.measurement.db
    final /* bridge */ /* synthetic */ eb f(eb ebVar, eb ebVar2) {
        eb ebVar3 = ebVar2;
        return ebVar3.equals(eb.a()) ? ebVar : eb.c(ebVar, ebVar3);
    }

    @Override // com.google.android.gms.internal.measurement.db
    final /* bridge */ /* synthetic */ int g(eb ebVar) {
        return ebVar.e();
    }

    @Override // com.google.android.gms.internal.measurement.db
    final /* bridge */ /* synthetic */ int h(eb ebVar) {
        return ebVar.f();
    }

    @Override // com.google.android.gms.internal.measurement.db
    final /* bridge */ /* synthetic */ void i(eb ebVar, h8 h8Var) {
        ebVar.i(h8Var);
    }
}
