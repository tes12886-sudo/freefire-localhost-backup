package j.d.a.c.d;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class a extends com.google.android.gms.common.internal.y.a {
    public static final Parcelable.Creator<a> CREATOR = new f();
    private Intent a;

    public a(Intent intent) {
        this.a = intent;
    }

    public final Intent f() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.y.c.a(parcel);
        com.google.android.gms.common.internal.y.c.m(parcel, 1, this.a, i2, false);
        com.google.android.gms.common.internal.y.c.b(parcel, iA);
    }
}
