package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ja extends com.google.android.gms.common.internal.y.a {
    public static final Parcelable.Creator<ja> CREATOR = new ka();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f1233g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f1234h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f1235i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f1236j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f1237k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f1238l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f1239m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f1240n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f1241o;
    public final boolean p;
    public final String q;
    public final Boolean r;
    public final long s;
    public final List<String> t;
    public final String u;
    public final String v;

    ja(String str, String str2, String str3, long j2, String str4, long j3, long j4, String str5, boolean z, boolean z2, String str6, long j5, long j6, int i2, boolean z3, boolean z4, String str7, Boolean bool, long j7, List<String> list, String str8, String str9) {
        com.google.android.gms.common.internal.q.g(str);
        this.a = str;
        this.b = true != TextUtils.isEmpty(str2) ? str2 : null;
        this.c = str3;
        this.f1236j = j2;
        this.d = str4;
        this.e = j3;
        this.f = j4;
        this.f1233g = str5;
        this.f1234h = z;
        this.f1235i = z2;
        this.f1237k = str6;
        this.f1238l = j5;
        this.f1239m = j6;
        this.f1240n = i2;
        this.f1241o = z3;
        this.p = z4;
        this.q = str7;
        this.r = bool;
        this.s = j7;
        this.t = list;
        this.u = str8;
        this.v = str9;
    }

    ja(String str, String str2, String str3, String str4, long j2, long j3, String str5, boolean z, boolean z2, long j4, String str6, long j5, long j6, int i2, boolean z3, boolean z4, String str7, Boolean bool, long j7, List<String> list, String str8, String str9) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f1236j = j4;
        this.d = str4;
        this.e = j2;
        this.f = j3;
        this.f1233g = str5;
        this.f1234h = z;
        this.f1235i = z2;
        this.f1237k = str6;
        this.f1238l = j5;
        this.f1239m = j6;
        this.f1240n = i2;
        this.f1241o = z3;
        this.p = z4;
        this.q = str7;
        this.r = bool;
        this.s = j7;
        this.t = list;
        this.u = str8;
        this.v = str9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.y.c.a(parcel);
        com.google.android.gms.common.internal.y.c.n(parcel, 2, this.a, false);
        com.google.android.gms.common.internal.y.c.n(parcel, 3, this.b, false);
        com.google.android.gms.common.internal.y.c.n(parcel, 4, this.c, false);
        com.google.android.gms.common.internal.y.c.n(parcel, 5, this.d, false);
        com.google.android.gms.common.internal.y.c.k(parcel, 6, this.e);
        com.google.android.gms.common.internal.y.c.k(parcel, 7, this.f);
        com.google.android.gms.common.internal.y.c.n(parcel, 8, this.f1233g, false);
        com.google.android.gms.common.internal.y.c.c(parcel, 9, this.f1234h);
        com.google.android.gms.common.internal.y.c.c(parcel, 10, this.f1235i);
        com.google.android.gms.common.internal.y.c.k(parcel, 11, this.f1236j);
        com.google.android.gms.common.internal.y.c.n(parcel, 12, this.f1237k, false);
        com.google.android.gms.common.internal.y.c.k(parcel, 13, this.f1238l);
        com.google.android.gms.common.internal.y.c.k(parcel, 14, this.f1239m);
        com.google.android.gms.common.internal.y.c.i(parcel, 15, this.f1240n);
        com.google.android.gms.common.internal.y.c.c(parcel, 16, this.f1241o);
        com.google.android.gms.common.internal.y.c.c(parcel, 18, this.p);
        com.google.android.gms.common.internal.y.c.n(parcel, 19, this.q, false);
        com.google.android.gms.common.internal.y.c.d(parcel, 21, this.r, false);
        com.google.android.gms.common.internal.y.c.k(parcel, 22, this.s);
        com.google.android.gms.common.internal.y.c.o(parcel, 23, this.t, false);
        com.google.android.gms.common.internal.y.c.n(parcel, 24, this.u, false);
        com.google.android.gms.common.internal.y.c.n(parcel, 25, this.v, false);
        com.google.android.gms.common.internal.y.c.b(parcel, iA);
    }
}
