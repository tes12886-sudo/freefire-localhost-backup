package j.d.a.c.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.u0;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iU = com.google.android.gms.common.internal.y.b.u(parcel);
        ConnectionResult connectionResult = null;
        u0 u0Var = null;
        int iP = 0;
        while (parcel.dataPosition() < iU) {
            int iN = com.google.android.gms.common.internal.y.b.n(parcel);
            int i2 = com.google.android.gms.common.internal.y.b.i(iN);
            if (i2 == 1) {
                iP = com.google.android.gms.common.internal.y.b.p(parcel, iN);
            } else if (i2 == 2) {
                connectionResult = (ConnectionResult) com.google.android.gms.common.internal.y.b.c(parcel, iN, ConnectionResult.CREATOR);
            } else if (i2 != 3) {
                com.google.android.gms.common.internal.y.b.t(parcel, iN);
            } else {
                u0Var = (u0) com.google.android.gms.common.internal.y.b.c(parcel, iN, u0.CREATOR);
            }
        }
        com.google.android.gms.common.internal.y.b.h(parcel, iU);
        return new l(iP, connectionResult, u0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new l[i2];
    }
}
