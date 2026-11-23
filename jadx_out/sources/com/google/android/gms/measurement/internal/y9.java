package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class y9 extends com.google.android.gms.common.internal.y.a {
    public static final Parcelable.Creator<y9> CREATOR = new z9();
    public final int a;
    public final String b;
    public final long c;
    public final Long d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Double f1303g;

    y9(int i2, String str, long j2, Long l2, Float f, String str2, String str3, Double d) {
        this.a = i2;
        this.b = str;
        this.c = j2;
        this.d = l2;
        if (i2 == 1) {
            this.f1303g = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.f1303g = d;
        }
        this.e = str2;
        this.f = str3;
    }

    y9(aa aaVar) {
        this(aaVar.c, aaVar.d, aaVar.e, aaVar.b);
    }

    y9(String str, long j2, Object obj, String str2) {
        com.google.android.gms.common.internal.q.g(str);
        this.a = 2;
        this.b = str;
        this.c = j2;
        this.f = str2;
        if (obj == null) {
            this.d = null;
            this.f1303g = null;
            this.e = null;
            return;
        }
        if (obj instanceof Long) {
            this.d = (Long) obj;
            this.f1303g = null;
            this.e = null;
        } else if (obj instanceof String) {
            this.d = null;
            this.f1303g = null;
            this.e = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("User attribute given of un-supported type");
            }
            this.d = null;
            this.f1303g = (Double) obj;
            this.e = null;
        }
    }

    public final Object f() {
        Long l2 = this.d;
        if (l2 != null) {
            return l2;
        }
        Double d = this.f1303g;
        if (d != null) {
            return d;
        }
        String str = this.e;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        z9.a(this, parcel, i2);
    }
}
