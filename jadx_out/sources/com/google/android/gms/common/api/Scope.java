package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class Scope extends com.google.android.gms.common.internal.y.a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new r();
    final int a;
    private final String b;

    Scope(int i2, String str) {
        com.google.android.gms.common.internal.q.h(str, "scopeUri must not be null or empty");
        this.a = i2;
        this.b = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.b.equals(((Scope) obj).b);
        }
        return false;
    }

    public String f() {
        return this.b;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.y.c.a(parcel);
        com.google.android.gms.common.internal.y.c.i(parcel, 1, this.a);
        com.google.android.gms.common.internal.y.c.n(parcel, 2, f(), false);
        com.google.android.gms.common.internal.y.c.b(parcel, iA);
    }
}
