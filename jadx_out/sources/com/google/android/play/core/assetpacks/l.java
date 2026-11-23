package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class l extends j<List<String>> {
    final /* synthetic */ o c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(o oVar, j.d.a.d.a.f.p<List<String>> pVar) {
        super(oVar, pVar);
        this.c = oVar;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.android.play.core.assetpacks.j, j.d.a.d.a.b.q0
    public final void C0(List<Bundle> list) {
        super.C0(list);
        this.a.e((T) o.u(this.c, list));
    }
}
