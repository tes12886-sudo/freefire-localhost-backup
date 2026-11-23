package com.google.android.play.core.assetpacks;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class r1 implements Runnable {
    private final v a;

    private r1(v vVar) {
        this.a = vVar;
    }

    static Runnable a(v vVar) {
        return new r1(vVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.F();
    }
}
