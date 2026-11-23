package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class x1 extends j.d.a.c.f.f.a implements j {
    x1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // com.google.android.gms.common.internal.j
    public final Account zzb() {
        Parcel parcelJ = j(2, m());
        Account account = (Account) j.d.a.c.f.f.c.a(parcelJ, Account.CREATOR);
        parcelJ.recycle();
        return account;
    }
}
