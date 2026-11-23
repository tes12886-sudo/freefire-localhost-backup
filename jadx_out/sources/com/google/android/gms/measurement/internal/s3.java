package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class s3 {
    public final String a;
    public final String b;
    public final long c;
    public final Bundle d;

    public s3(String str, String str2, Bundle bundle, long j2) {
        this.a = str;
        this.b = str2;
        this.d = bundle;
        this.c = j2;
    }

    public static s3 a(t tVar) {
        return new s3(tVar.a, tVar.c, tVar.b.q(), tVar.d);
    }

    public final t b() {
        return new t(this.a, new r(new Bundle(this.d)), this.b, this.c);
    }

    public final String toString() {
        String str = this.b;
        String str2 = this.a;
        String strValueOf = String.valueOf(this.d);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 21 + String.valueOf(str2).length() + String.valueOf(strValueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(strValueOf);
        return sb.toString();
    }
}
