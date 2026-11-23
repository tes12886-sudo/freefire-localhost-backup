package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class n6 {
    final Uri b;
    final String a = null;
    final String c = "";
    final String d = "";
    final boolean e = false;
    final boolean f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final boolean f1083g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final boolean f1084h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    final u6<Context, Boolean> f1085i = null;

    public n6(Uri uri) {
        this.b = uri;
    }

    public final p6<Long> a(String str, long j2) {
        return new j6(this, str, Long.valueOf(j2), true);
    }

    public final p6<Boolean> b(String str, boolean z) {
        return new k6(this, str, Boolean.valueOf(z), true);
    }

    public final p6<Double> c(String str, double d) {
        return new l6(this, "measurement.test.double_flag", Double.valueOf(-3.0d), true);
    }

    public final p6<String> d(String str, String str2) {
        return new m6(this, str, str2, true);
    }
}
