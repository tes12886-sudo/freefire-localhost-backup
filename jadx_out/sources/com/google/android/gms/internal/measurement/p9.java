package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class p9 extends q9 {
    /* synthetic */ p9(n9 n9Var) {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.q9
    final void a(Object obj, long j2) {
        ((f9) nb.s(obj, j2)).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.q9
    final <E> void b(Object obj, Object obj2, long j2) {
        f9 f9VarK = (f9) nb.s(obj, j2);
        f9 f9Var = (f9) nb.s(obj2, j2);
        int size = f9VarK.size();
        int size2 = f9Var.size();
        if (size > 0 && size2 > 0) {
            if (!f9VarK.zza()) {
                f9VarK = f9VarK.k(size2 + size);
            }
            f9VarK.addAll(f9Var);
        }
        if (size > 0) {
            f9Var = f9VarK;
        }
        nb.t(obj, j2, f9Var);
    }
}
