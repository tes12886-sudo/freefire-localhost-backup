package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class g7 extends d7 {
    private final f7 a = new f7();

    g7() {
    }

    @Override // com.google.android.gms.internal.measurement.d7
    public final void a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        this.a.a(th, true).add(th2);
    }
}
