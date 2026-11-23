package com.google.android.play.core.assetpacks;

import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
final class i0 extends c1 {
    final int c;
    final long d;
    final String e;
    final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f1318g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final int f1319h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final long f1320i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int f1321j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final InputStream f1322k;

    i0(int i2, String str, int i3, long j2, String str2, int i4, int i5, int i6, long j3, int i7, InputStream inputStream) {
        super(i2, str);
        this.c = i3;
        this.d = j2;
        this.e = str2;
        this.f = i4;
        this.f1318g = i5;
        this.f1319h = i6;
        this.f1320i = j3;
        this.f1321j = i7;
        this.f1322k = inputStream;
    }

    final boolean a() {
        return this.f1318g + 1 == this.f1319h;
    }
}
