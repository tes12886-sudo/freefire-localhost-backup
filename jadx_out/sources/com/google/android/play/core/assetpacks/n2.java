package com.google.android.play.core.assetpacks;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;

/* JADX INFO: loaded from: classes.dex */
public final class n2 implements j.d.a.d.a.b.h0<Object> {
    private final j.d.a.d.a.b.h0 a;
    private final j.d.a.d.a.b.h0 b;
    private final /* synthetic */ int c = 0;

    public n2(j.d.a.d.a.b.h0<h2> h0Var, j.d.a.d.a.b.h0<Context> h0Var2) {
        this.a = h0Var;
        this.b = h0Var2;
    }

    public n2(j.d.a.d.a.b.h0<Context> h0Var, j.d.a.d.a.b.h0<v> h0Var2, byte[] bArr) {
        this.b = h0Var;
        this.a = h0Var2;
    }

    public n2(j.d.a.d.a.b.h0<Context> h0Var, j.d.a.d.a.b.h0<o0> h0Var2, char[] cArr) {
        this.a = h0Var;
        this.b = h0Var2;
    }

    public n2(j.d.a.d.a.b.h0<v> h0Var, j.d.a.d.a.b.h0<s2> h0Var2, int[] iArr) {
        this.b = h0Var;
        this.a = h0Var2;
    }

    public n2(j.d.a.d.a.b.h0<Context> h0Var, j.d.a.d.a.b.h0<u1> h0Var2, short[] sArr) {
        this.a = h0Var;
        this.b = h0Var2;
    }

    @Override // j.d.a.d.a.b.h0
    public final /* bridge */ /* synthetic */ Object a() {
        int i2 = this.c;
        if (i2 == 0) {
            Object objA = this.a.a();
            Context contextA = ((o2) this.b).a();
            h2 h2Var = (h2) objA;
            j.d.a.d.a.b.s.a(contextA.getPackageManager(), new ComponentName(contextA.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"), 4);
            j.d.a.d.a.b.s.a(contextA.getPackageManager(), new ComponentName(contextA.getPackageName(), "com.google.android.play.core.assetpacks.ExtractionForegroundService"), 4);
            PlayCoreDialogWrapperActivity.a(contextA);
            j.d.a.d.a.b.s.d(h2Var);
            return h2Var;
        }
        if (i2 == 1) {
            return new b0(((o2) this.b).a(), (v) this.a.a());
        }
        if (i2 == 2) {
            return new o(((o2) this.a).a(), (o0) this.b.a());
        }
        if (i2 == 3) {
            return new v(((o2) this.a).a(), (u1) this.b.a());
        }
        return new w1((v) this.b.a(), j.d.a.d.a.b.g0.c(this.a));
    }
}
