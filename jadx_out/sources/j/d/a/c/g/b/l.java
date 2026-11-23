package j.d.a.c.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.u0;

/* JADX INFO: loaded from: classes.dex */
public final class l extends com.google.android.gms.common.internal.y.a {
    public static final Parcelable.Creator<l> CREATOR = new m();
    final int a;
    private final ConnectionResult b;
    private final u0 c;

    l(int i2, ConnectionResult connectionResult, u0 u0Var) {
        this.a = i2;
        this.b = connectionResult;
        this.c = u0Var;
    }

    public final ConnectionResult f() {
        return this.b;
    }

    public final u0 h() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.y.c.a(parcel);
        com.google.android.gms.common.internal.y.c.i(parcel, 1, this.a);
        com.google.android.gms.common.internal.y.c.m(parcel, 2, this.b, i2, false);
        com.google.android.gms.common.internal.y.c.m(parcel, 3, this.c, i2, false);
        com.google.android.gms.common.internal.y.c.b(parcel, iA);
    }
}
