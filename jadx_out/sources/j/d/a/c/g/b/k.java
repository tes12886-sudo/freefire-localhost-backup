package j.d.a.c.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s0;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.y.b.u(parcel);
        int iP = 0;
        s0 s0Var = null;
        while (parcel.dataPosition() < iU) {
            int iN = com.google.android.gms.common.internal.y.b.n(parcel);
            int i2 = com.google.android.gms.common.internal.y.b.i(iN);
            if (i2 == 1) {
                iP = com.google.android.gms.common.internal.y.b.p(parcel, iN);
            } else if (i2 != 2) {
                com.google.android.gms.common.internal.y.b.t(parcel, iN);
            } else {
                s0Var = (s0) com.google.android.gms.common.internal.y.b.c(parcel, iN, s0.CREATOR);
            }
        }
        com.google.android.gms.common.internal.y.b.h(parcel, iU);
        return new j(iP, s0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new j[i2];
    }
}
