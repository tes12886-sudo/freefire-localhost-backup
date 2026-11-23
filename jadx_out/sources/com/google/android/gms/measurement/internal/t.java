package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class t extends com.google.android.gms.common.internal.y.a {
    public static final Parcelable.Creator<t> CREATOR = new u();
    public final String a;
    public final r b;
    public final String c;
    public final long d;

    t(t tVar, long j2) {
        com.google.android.gms.common.internal.q.k(tVar);
        this.a = tVar.a;
        this.b = tVar.b;
        this.c = tVar.c;
        this.d = j2;
    }

    public t(String str, r rVar, String str2, long j2) {
        this.a = str;
        this.b = rVar;
        this.c = str2;
        this.d = j2;
    }

    public final String toString() {
        String str = this.c;
        String str2 = this.a;
        String strValueOf = String.valueOf(this.b);
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

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        u.a(this, parcel, i2);
    }
}
