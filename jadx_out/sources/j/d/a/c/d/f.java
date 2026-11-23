package j.d.a.c.d;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Parcelable.Creator<a> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.y.b.u(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < iU) {
            int iN = com.google.android.gms.common.internal.y.b.n(parcel);
            if (com.google.android.gms.common.internal.y.b.i(iN) != 1) {
                com.google.android.gms.common.internal.y.b.t(parcel, iN);
            } else {
                intent = (Intent) com.google.android.gms.common.internal.y.b.c(parcel, iN, Intent.CREATOR);
            }
        }
        com.google.android.gms.common.internal.y.b.h(parcel, iU);
        return new a(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a[] newArray(int i2) {
        return new a[i2];
    }
}
