package j.d.a.c.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h extends com.google.android.gms.common.internal.y.a implements com.google.android.gms.common.api.j {
    public static final Parcelable.Creator<h> CREATOR = new i();
    private final List a;
    private final String b;

    public h(List list, String str) {
        this.a = list;
        this.b = str;
    }

    @Override // com.google.android.gms.common.api.j
    public final Status c() {
        return this.b != null ? Status.f : Status.f923j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.y.c.a(parcel);
        com.google.android.gms.common.internal.y.c.o(parcel, 1, this.a, false);
        com.google.android.gms.common.internal.y.c.n(parcel, 2, this.b, false);
        com.google.android.gms.common.internal.y.c.b(parcel, iA);
    }
}
