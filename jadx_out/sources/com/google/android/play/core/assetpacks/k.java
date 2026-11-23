package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes.dex */
final class k extends j<ParcelFileDescriptor> {
    k(o oVar, j.d.a.d.a.f.p<ParcelFileDescriptor> pVar) {
        super(oVar, pVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.android.play.core.assetpacks.j, j.d.a.d.a.b.q0
    public final void r0(Bundle bundle, Bundle bundle2) {
        super.r0(bundle, bundle2);
        this.a.e((T) ((ParcelFileDescriptor) bundle.getParcelable("chunk_file_descriptor")));
    }
}
