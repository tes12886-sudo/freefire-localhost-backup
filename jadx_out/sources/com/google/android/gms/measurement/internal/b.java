package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class b extends com.google.android.gms.common.internal.y.a {
    public static final Parcelable.Creator<b> CREATOR = new c();
    public String a;
    public String b;
    public y9 c;
    public long d;
    public boolean e;
    public String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f1169g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f1170h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public t f1171i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f1172j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t f1173k;

    b(b bVar) {
        com.google.android.gms.common.internal.q.k(bVar);
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.f1169g = bVar.f1169g;
        this.f1170h = bVar.f1170h;
        this.f1171i = bVar.f1171i;
        this.f1172j = bVar.f1172j;
        this.f1173k = bVar.f1173k;
    }

    b(String str, String str2, y9 y9Var, long j2, boolean z, String str3, t tVar, long j3, t tVar2, long j4, t tVar3) {
        this.a = str;
        this.b = str2;
        this.c = y9Var;
        this.d = j2;
        this.e = z;
        this.f = str3;
        this.f1169g = tVar;
        this.f1170h = j3;
        this.f1171i = tVar2;
        this.f1172j = j4;
        this.f1173k = tVar3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.y.c.a(parcel);
        com.google.android.gms.common.internal.y.c.n(parcel, 2, this.a, false);
        com.google.android.gms.common.internal.y.c.n(parcel, 3, this.b, false);
        com.google.android.gms.common.internal.y.c.m(parcel, 4, this.c, i2, false);
        com.google.android.gms.common.internal.y.c.k(parcel, 5, this.d);
        com.google.android.gms.common.internal.y.c.c(parcel, 6, this.e);
        com.google.android.gms.common.internal.y.c.n(parcel, 7, this.f, false);
        com.google.android.gms.common.internal.y.c.m(parcel, 8, this.f1169g, i2, false);
        com.google.android.gms.common.internal.y.c.k(parcel, 9, this.f1170h);
        com.google.android.gms.common.internal.y.c.m(parcel, 10, this.f1171i, i2, false);
        com.google.android.gms.common.internal.y.c.k(parcel, 11, this.f1172j);
        com.google.android.gms.common.internal.y.c.m(parcel, 12, this.f1173k, i2, false);
        com.google.android.gms.common.internal.y.c.b(parcel, iA);
    }
}
