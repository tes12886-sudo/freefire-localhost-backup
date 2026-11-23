package com.google.android.play.core.assetpacks;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class f2 implements j.d.a.d.a.f.c {
    private final v a;

    private f2(v vVar) {
        this.a = vVar;
    }

    static j.d.a.d.a.f.c a(v vVar) {
        return new f2(vVar);
    }

    @Override // j.d.a.d.a.f.c
    public final void onSuccess(Object obj) {
        this.a.a((List) obj);
    }
}
