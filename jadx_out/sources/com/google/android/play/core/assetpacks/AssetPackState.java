package com.google.android.play.core.assetpacks;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class AssetPackState {
    public static AssetPackState b(String str, int i2, int i3, long j2, long j3, double d, int i4) {
        return new z(str, i2, i3, j2, j3, (int) Math.rint(100.0d * d), i4);
    }

    static AssetPackState d(Bundle bundle, String str, o0 o0Var, t tVar) {
        int i2 = bundle.getInt(j.d.a.d.a.b.i0.a("status", str));
        tVar.a(i2, str);
        int i3 = bundle.getInt(j.d.a.d.a.b.i0.a("error_code", str));
        long j2 = bundle.getLong(j.d.a.d.a.b.i0.a("bytes_downloaded", str));
        long j3 = bundle.getLong(j.d.a.d.a.b.i0.a("total_bytes_to_download", str));
        double dB = o0Var.b(str);
        long j4 = bundle.getLong(j.d.a.d.a.b.i0.a("pack_version", str));
        long j5 = bundle.getLong(j.d.a.d.a.b.i0.a("pack_base_version", str));
        return b(str, i2, i3, j2, j3, dB, (i2 != 4 || j5 == 0 || j5 == j4) ? 1 : 2);
    }

    public abstract int a();

    public abstract long c();

    public abstract int e();

    public abstract String f();

    public abstract int g();

    public abstract long h();

    public abstract int i();
}
