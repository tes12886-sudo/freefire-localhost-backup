package j.d.a.c.g.b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class b extends com.google.android.gms.common.internal.y.a implements com.google.android.gms.common.api.j {
    public static final Parcelable.Creator<b> CREATOR = new c();
    final int a;
    private int b;
    private Intent c;

    public b() {
        this(2, 0, null);
    }

    b(int i2, int i3, Intent intent) {
        this.a = i2;
        this.b = i3;
        this.c = intent;
    }

    @Override // com.google.android.gms.common.api.j
    public final Status c() {
        return this.b == 0 ? Status.f : Status.f923j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.y.c.a(parcel);
        com.google.android.gms.common.internal.y.c.i(parcel, 1, this.a);
        com.google.android.gms.common.internal.y.c.i(parcel, 2, this.b);
        com.google.android.gms.common.internal.y.c.m(parcel, 3, this.c, i2, false);
        com.google.android.gms.common.internal.y.c.b(parcel, iA);
    }
}
