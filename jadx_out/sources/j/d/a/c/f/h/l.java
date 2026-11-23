package j.d.a.c.f.h;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class l extends o implements n {
    l(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    @Override // j.d.a.c.f.h.n
    public final Bundle E(int i2, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel parcelJ = j();
        parcelJ.writeInt(i2);
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        q.b(parcelJ, bundle);
        q.b(parcelJ, bundle2);
        Parcel parcelM = m(901, parcelJ);
        Bundle bundle3 = (Bundle) q.a(parcelM, Bundle.CREATOR);
        parcelM.recycle();
        return bundle3;
    }

    @Override // j.d.a.c.f.h.n
    public final int G(int i2, String str, String str2) {
        Parcel parcelJ = j();
        parcelJ.writeInt(i2);
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        Parcel parcelM = m(1, parcelJ);
        int i3 = parcelM.readInt();
        parcelM.recycle();
        return i3;
    }

    @Override // j.d.a.c.f.h.n
    public final Bundle G0(int i2, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelJ = j();
        parcelJ.writeInt(9);
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        parcelJ.writeString(str3);
        q.b(parcelJ, bundle);
        Parcel parcelM = m(11, parcelJ);
        Bundle bundle2 = (Bundle) q.a(parcelM, Bundle.CREATOR);
        parcelM.recycle();
        return bundle2;
    }

    @Override // j.d.a.c.f.h.n
    public final int H(int i2, String str, String str2) {
        Parcel parcelJ = j();
        parcelJ.writeInt(3);
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        Parcel parcelM = m(5, parcelJ);
        int i3 = parcelM.readInt();
        parcelM.recycle();
        return i3;
    }

    @Override // j.d.a.c.f.h.n
    public final Bundle K0(int i2, String str, String str2, String str3, String str4) {
        Parcel parcelJ = j();
        parcelJ.writeInt(3);
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        parcelJ.writeString(str3);
        parcelJ.writeString(null);
        Parcel parcelM = m(3, parcelJ);
        Bundle bundle = (Bundle) q.a(parcelM, Bundle.CREATOR);
        parcelM.recycle();
        return bundle;
    }

    @Override // j.d.a.c.f.h.n
    public final Bundle L(int i2, String str, String str2, Bundle bundle) {
        Parcel parcelJ = j();
        parcelJ.writeInt(9);
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        q.b(parcelJ, bundle);
        Parcel parcelM = m(12, parcelJ);
        Bundle bundle2 = (Bundle) q.a(parcelM, Bundle.CREATOR);
        parcelM.recycle();
        return bundle2;
    }

    @Override // j.d.a.c.f.h.n
    public final Bundle S(int i2, String str, String str2, String str3, String str4, Bundle bundle) {
        Parcel parcelJ = j();
        parcelJ.writeInt(i2);
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        parcelJ.writeString(str3);
        parcelJ.writeString(null);
        q.b(parcelJ, bundle);
        Parcel parcelM = m(8, parcelJ);
        Bundle bundle2 = (Bundle) q.a(parcelM, Bundle.CREATOR);
        parcelM.recycle();
        return bundle2;
    }

    @Override // j.d.a.c.f.h.n
    public final Bundle X(int i2, String str, String str2, Bundle bundle) {
        Parcel parcelJ = j();
        parcelJ.writeInt(3);
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        q.b(parcelJ, bundle);
        Parcel parcelM = m(2, parcelJ);
        Bundle bundle2 = (Bundle) q.a(parcelM, Bundle.CREATOR);
        parcelM.recycle();
        return bundle2;
    }

    @Override // j.d.a.c.f.h.n
    public final Bundle b1(int i2, String str, String str2, Bundle bundle) {
        Parcel parcelJ = j();
        parcelJ.writeInt(9);
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        q.b(parcelJ, bundle);
        Parcel parcelM = m(902, parcelJ);
        Bundle bundle2 = (Bundle) q.a(parcelM, Bundle.CREATOR);
        parcelM.recycle();
        return bundle2;
    }

    @Override // j.d.a.c.f.h.n
    public final int y0(int i2, String str, String str2, Bundle bundle) {
        Parcel parcelJ = j();
        parcelJ.writeInt(i2);
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        q.b(parcelJ, bundle);
        Parcel parcelM = m(10, parcelJ);
        int i3 = parcelM.readInt();
        parcelM.recycle();
        return i3;
    }

    @Override // j.d.a.c.f.h.n
    public final Bundle z0(int i2, String str, String str2, String str3) {
        Parcel parcelJ = j();
        parcelJ.writeInt(3);
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        parcelJ.writeString(str3);
        Parcel parcelM = m(4, parcelJ);
        Bundle bundle = (Bundle) q.a(parcelM, Bundle.CREATOR);
        parcelM.recycle();
        return bundle;
    }
}
