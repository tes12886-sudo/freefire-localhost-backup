package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: loaded from: classes.dex */
public class f extends com.google.android.gms.common.internal.y.a {
    public static final Parcelable.Creator<f> CREATOR = new o1();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final Scope[] f1012o = new Scope[0];
    static final com.google.android.gms.common.c[] p = new com.google.android.gms.common.c[0];
    final int a;
    final int b;
    int c;
    String d;
    IBinder e;
    Scope[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Bundle f1013g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Account f1014h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    com.google.android.gms.common.c[] f1015i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    com.google.android.gms.common.c[] f1016j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f1017k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f1018l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f1019m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f1020n;

    f(int i2, int i3, int i4, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, com.google.android.gms.common.c[] cVarArr, com.google.android.gms.common.c[] cVarArr2, boolean z, int i5, boolean z2, String str2) {
        scopeArr = scopeArr == null ? f1012o : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        cVarArr = cVarArr == null ? p : cVarArr;
        cVarArr2 = cVarArr2 == null ? p : cVarArr2;
        this.a = i2;
        this.b = i3;
        this.c = i4;
        if ("com.google.android.gms".equals(str)) {
            this.d = "com.google.android.gms";
        } else {
            this.d = str;
        }
        if (i2 < 2) {
            this.f1014h = iBinder != null ? a.o(j.a.m(iBinder)) : null;
        } else {
            this.e = iBinder;
            this.f1014h = account;
        }
        this.f = scopeArr;
        this.f1013g = bundle;
        this.f1015i = cVarArr;
        this.f1016j = cVarArr2;
        this.f1017k = z;
        this.f1018l = i5;
        this.f1019m = z2;
        this.f1020n = str2;
    }

    public final String f() {
        return this.f1020n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        o1.a(this, parcel, i2);
    }
}
