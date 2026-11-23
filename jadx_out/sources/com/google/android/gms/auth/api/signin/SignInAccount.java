package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.q;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class SignInAccount extends com.google.android.gms.common.internal.y.a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new k();

    @Deprecated
    private String a;
    private GoogleSignInAccount b;

    @Deprecated
    private String c;

    SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.b = googleSignInAccount;
        q.h(str, "8.3 and 8.4 SDKs require non-null email");
        this.a = str;
        q.h(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.c = str2;
    }

    @Nullable
    public final GoogleSignInAccount d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.y.c.a(parcel);
        com.google.android.gms.common.internal.y.c.n(parcel, 4, this.a, false);
        com.google.android.gms.common.internal.y.c.m(parcel, 7, this.b, i2, false);
        com.google.android.gms.common.internal.y.c.n(parcel, 8, this.c, false);
        com.google.android.gms.common.internal.y.c.b(parcel, iA);
    }
}
