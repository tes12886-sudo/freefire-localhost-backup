package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: loaded from: classes.dex */
public final class s0 extends com.google.android.gms.common.internal.y.a {
    public static final Parcelable.Creator<s0> CREATOR = new t0();
    final int a;
    private final Account b;
    private final int c;
    private final GoogleSignInAccount d;

    s0(int i2, Account account, int i3, GoogleSignInAccount googleSignInAccount) {
        this.a = i2;
        this.b = account;
        this.c = i3;
        this.d = googleSignInAccount;
    }

    public s0(Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i2, googleSignInAccount);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.y.c.a(parcel);
        com.google.android.gms.common.internal.y.c.i(parcel, 1, this.a);
        com.google.android.gms.common.internal.y.c.m(parcel, 2, this.b, i2, false);
        com.google.android.gms.common.internal.y.c.i(parcel, 3, this.c);
        com.google.android.gms.common.internal.y.c.m(parcel, 4, this.d, i2, false);
        com.google.android.gms.common.internal.y.c.b(parcel, iA);
    }
}
