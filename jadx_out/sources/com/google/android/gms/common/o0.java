package com.google.android.gms.common;

import android.util.Log;
import com.google.errorprone.annotations.CheckReturnValue;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
class o0 {
    private static final o0 d = new o0(true, 3, 1, null, null);
    final boolean a;

    @Nullable
    final String b;

    @Nullable
    final Throwable c;

    private o0(boolean z, int i2, int i3, @Nullable String str, @Nullable Throwable th) {
        this.a = z;
        this.b = str;
        this.c = th;
    }

    @Deprecated
    static o0 b() {
        return d;
    }

    static o0 c(String str) {
        return new o0(false, 1, 5, str, null);
    }

    static o0 d(String str, Throwable th) {
        return new o0(false, 1, 5, str, th);
    }

    static o0 f(int i2) {
        return new o0(true, i2, 1, null, null);
    }

    static o0 g(int i2, int i3, String str, @Nullable Throwable th) {
        return new o0(false, i2, i3, str, th);
    }

    @Nullable
    String a() {
        return this.b;
    }

    final void e() {
        if (this.a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.c != null) {
            Log.d("GoogleCertificatesRslt", a(), this.c);
        } else {
            Log.d("GoogleCertificatesRslt", a());
        }
    }
}
