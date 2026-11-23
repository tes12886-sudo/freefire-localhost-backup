package j.d.a.c.f.a;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class f extends a implements d {
    f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // j.d.a.c.f.a.d
    public final String e() {
        Parcel parcelM = m(1, j());
        String string = parcelM.readString();
        parcelM.recycle();
        return string;
    }

    @Override // j.d.a.c.f.a.d
    public final boolean s0(boolean z) {
        Parcel parcelJ = j();
        c.a(parcelJ, true);
        Parcel parcelM = m(2, parcelJ);
        boolean zB = c.b(parcelM);
        parcelM.recycle();
        return zB;
    }
}
