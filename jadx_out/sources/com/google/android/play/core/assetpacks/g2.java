package com.google.android.play.core.assetpacks;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class g2 implements j.d.a.d.a.f.b {
    static final j.d.a.d.a.f.b a = new g2();

    private g2() {
    }

    @Override // j.d.a.d.a.f.b
    public final void onFailure(Exception exc) {
        h2.e.e(String.format("Could not sync active asset packs. %s", exc), new Object[0]);
    }
}
