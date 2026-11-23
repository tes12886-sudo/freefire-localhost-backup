package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.o;

/* JADX INFO: loaded from: classes.dex */
public class c extends com.google.android.gms.common.internal.y.a {
    public static final Parcelable.Creator<c> CREATOR = new t();
    private final String a;

    @Deprecated
    private final int b;
    private final long c;

    public c(String str, int i2, long j2) {
        this.a = str;
        this.b = i2;
        this.c = j2;
    }

    public c(String str, long j2) {
        this.a = str;
        this.c = j2;
        this.b = -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (((f() != null && f().equals(cVar.f())) || (f() == null && cVar.f() == null)) && h() == cVar.h()) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        return this.a;
    }

    public long h() {
        long j2 = this.c;
        return j2 == -1 ? this.b : j2;
    }

    public final int hashCode() {
        return o.b(f(), Long.valueOf(h()));
    }

    public final String toString() {
        o.a aVarC = o.c(this);
        aVarC.a("name", f());
        aVarC.a("version", Long.valueOf(h()));
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.y.c.a(parcel);
        com.google.android.gms.common.internal.y.c.n(parcel, 1, f(), false);
        com.google.android.gms.common.internal.y.c.i(parcel, 2, this.b);
        com.google.android.gms.common.internal.y.c.k(parcel, 3, h());
        com.google.android.gms.common.internal.y.c.b(parcel, iA);
    }
}
