package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.z1;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends com.google.android.gms.common.internal.y.a {
    public static final Parcelable.Creator<j0> CREATOR = new k0();
    private final String a;

    @Nullable
    private final a0 b;
    private final boolean c;
    private final boolean d;

    j0(String str, @Nullable IBinder iBinder, boolean z, boolean z2) {
        this.a = str;
        b0 b0Var = null;
        if (iBinder != null) {
            try {
                j.d.a.c.e.a aVarC = z1.m(iBinder).c();
                byte[] bArr = aVarC == null ? null : (byte[]) j.d.a.c.e.b.o(aVarC);
                if (bArr != null) {
                    b0Var = new b0(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.b = b0Var;
        this.c = z;
        this.d = z2;
    }

    j0(String str, @Nullable a0 a0Var, boolean z, boolean z2) {
        this.a = str;
        this.b = a0Var;
        this.c = z;
        this.d = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.y.c.a(parcel);
        com.google.android.gms.common.internal.y.c.n(parcel, 1, this.a, false);
        a0 a0Var = this.b;
        if (a0Var == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            a0Var = null;
        }
        com.google.android.gms.common.internal.y.c.h(parcel, 2, a0Var, false);
        com.google.android.gms.common.internal.y.c.c(parcel, 3, this.c);
        com.google.android.gms.common.internal.y.c.c(parcel, 4, this.d);
        com.google.android.gms.common.internal.y.c.b(parcel, iA);
    }
}
