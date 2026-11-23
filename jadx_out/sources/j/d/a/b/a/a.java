package j.d.a.b.a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import j.d.a.a.b;
import j.d.a.a.c;

/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: j.d.a.b.a.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0228a extends b implements a {

        /* JADX INFO: renamed from: j.d.a.b.a.a$a$a, reason: collision with other inner class name */
        public static class C0229a extends j.d.a.a.a implements a {
            C0229a(IBinder iBinder) {
                super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            }

            @Override // j.d.a.b.a.a
            public final Bundle P(Bundle bundle) {
                Parcel parcelJ = j();
                c.b(parcelJ, bundle);
                Parcel parcelM = m(parcelJ);
                Bundle bundle2 = (Bundle) c.a(parcelM, Bundle.CREATOR);
                parcelM.recycle();
                return bundle2;
            }
        }

        public static a j(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new C0229a(iBinder);
        }
    }

    Bundle P(Bundle bundle);
}
