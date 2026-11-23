package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class r extends com.google.android.gms.common.internal.y.a implements Iterable<String> {
    public static final Parcelable.Creator<r> CREATOR = new s();
    private final Bundle a;

    r(Bundle bundle) {
        this.a = bundle;
    }

    final Object f(String str) {
        return this.a.get(str);
    }

    final Long h(String str) {
        return Long.valueOf(this.a.getLong("value"));
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new q(this);
    }

    final Double j(String str) {
        return Double.valueOf(this.a.getDouble("value"));
    }

    final String l(String str) {
        return this.a.getString(str);
    }

    public final int n() {
        return this.a.size();
    }

    public final Bundle q() {
        return new Bundle(this.a);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.y.c.a(parcel);
        com.google.android.gms.common.internal.y.c.e(parcel, 2, q(), false);
        com.google.android.gms.common.internal.y.c.b(parcel, iA);
    }
}
