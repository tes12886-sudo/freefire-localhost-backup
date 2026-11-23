package j.d.a.c.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.y.b.u(parcel);
        ArrayList<String> arrayListE = null;
        String strD = null;
        while (parcel.dataPosition() < iU) {
            int iN = com.google.android.gms.common.internal.y.b.n(parcel);
            int i2 = com.google.android.gms.common.internal.y.b.i(iN);
            if (i2 == 1) {
                arrayListE = com.google.android.gms.common.internal.y.b.e(parcel, iN);
            } else if (i2 != 2) {
                com.google.android.gms.common.internal.y.b.t(parcel, iN);
            } else {
                strD = com.google.android.gms.common.internal.y.b.d(parcel, iN);
            }
        }
        com.google.android.gms.common.internal.y.b.h(parcel, iU);
        return new h(arrayListE, strD);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new h[i2];
    }
}
