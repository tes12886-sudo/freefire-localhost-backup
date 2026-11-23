package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class p {
    final String a;
    final String b;
    final long c;
    final long d;
    final long e;
    final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final long f1248g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Long f1249h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final Long f1250i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final Long f1251j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final Boolean f1252k;

    p(String str, String str2, long j2, long j3, long j4, long j5, long j6, Long l2, Long l3, Long l4, Boolean bool) {
        com.google.android.gms.common.internal.q.g(str);
        com.google.android.gms.common.internal.q.g(str2);
        com.google.android.gms.common.internal.q.a(j2 >= 0);
        com.google.android.gms.common.internal.q.a(j3 >= 0);
        com.google.android.gms.common.internal.q.a(j4 >= 0);
        com.google.android.gms.common.internal.q.a(j6 >= 0);
        this.a = str;
        this.b = str2;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
        this.f1248g = j6;
        this.f1249h = l2;
        this.f1250i = l3;
        this.f1251j = l4;
        this.f1252k = bool;
    }

    final p a(long j2) {
        return new p(this.a, this.b, this.c, this.d, this.e, j2, this.f1248g, this.f1249h, this.f1250i, this.f1251j, this.f1252k);
    }

    final p b(long j2, long j3) {
        return new p(this.a, this.b, this.c, this.d, this.e, this.f, j2, Long.valueOf(j3), this.f1250i, this.f1251j, this.f1252k);
    }

    final p c(Long l2, Long l3, Boolean bool) {
        return new p(this.a, this.b, this.c, this.d, this.e, this.f, this.f1248g, this.f1249h, l2, l3, (bool == null || bool.booleanValue()) ? bool : null);
    }
}
