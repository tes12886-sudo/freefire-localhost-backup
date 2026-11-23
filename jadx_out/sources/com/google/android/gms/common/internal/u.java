package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class u extends com.google.android.gms.common.internal.y.a {
    public static final Parcelable.Creator<u> CREATOR = new a0();
    private final int a;

    @Nullable
    private List b;

    public u(int i2, @Nullable List list) {
        this.a = i2;
        this.b = list;
    }

    public final int f() {
        return this.a;
    }

    public final List h() {
        return this.b;
    }

    public final void j(n nVar) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.b.add(nVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.y.c.a(parcel);
        com.google.android.gms.common.internal.y.c.i(parcel, 1, this.a);
        com.google.android.gms.common.internal.y.c.q(parcel, 2, this.b, false);
        com.google.android.gms.common.internal.y.c.b(parcel, iA);
    }
}
