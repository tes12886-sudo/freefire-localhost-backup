package j.d.a.c.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s0;

/* JADX INFO: loaded from: classes.dex */
public final class j extends com.google.android.gms.common.internal.y.a {
    public static final Parcelable.Creator<j> CREATOR = new k();
    final int a;
    final s0 b;

    j(int i2, s0 s0Var) {
        this.a = i2;
        this.b = s0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.y.c.a(parcel);
        com.google.android.gms.common.internal.y.c.i(parcel, 1, this.a);
        com.google.android.gms.common.internal.y.c.m(parcel, 2, this.b, i2, false);
        com.google.android.gms.common.internal.y.c.b(parcel, iA);
    }
}
