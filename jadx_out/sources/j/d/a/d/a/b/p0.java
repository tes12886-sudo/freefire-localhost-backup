package j.d.a.d.a.b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class p0 extends k0 implements q0 {
    public p0() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    @Override // j.d.a.d.a.b.k0
    protected final boolean j(int i2, Parcel parcel) {
        switch (i2) {
            case 2:
                t(parcel.readInt(), (Bundle) l0.a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                int i3 = parcel.readInt();
                n0(i3);
                return true;
            case 4:
                int i4 = parcel.readInt();
                n1(i4);
                return true;
            case 5:
                C0(parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 6:
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle = (Bundle) l0.a(parcel, creator);
                m0(bundle);
                return true;
            case 7:
                o0((Bundle) l0.a(parcel, Bundle.CREATOR));
                return true;
            case 8:
                Parcelable.Creator creator2 = Bundle.CREATOR;
                Bundle bundle2 = (Bundle) l0.a(parcel, creator2);
                Y(bundle2);
                return true;
            case 9:
            default:
                return false;
            case 10:
                Parcelable.Creator creator3 = Bundle.CREATOR;
                Bundle bundle3 = (Bundle) l0.a(parcel, creator3);
                r(bundle3);
                return true;
            case 11:
                Parcelable.Creator creator4 = Bundle.CREATOR;
                c0((Bundle) l0.a(parcel, creator4), (Bundle) l0.a(parcel, creator4));
                return true;
            case 12:
                Parcelable.Creator creator5 = Bundle.CREATOR;
                r0((Bundle) l0.a(parcel, creator5), (Bundle) l0.a(parcel, creator5));
                return true;
            case 13:
                Parcelable.Creator creator6 = Bundle.CREATOR;
                V0((Bundle) l0.a(parcel, creator6), (Bundle) l0.a(parcel, creator6));
                return true;
            case 14:
                Parcelable.Creator creator7 = Bundle.CREATOR;
                D();
                return true;
            case 15:
                i1();
                return true;
        }
    }
}
