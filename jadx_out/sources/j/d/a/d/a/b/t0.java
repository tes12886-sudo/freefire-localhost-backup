package j.d.a.d.a.b;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class t0 extends j0 implements u0 {
    t0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    @Override // j.d.a.d.a.b.u0
    public final void C(Bundle bundle, Bundle bundle2) {
        Parcel parcelJ = j();
        l0.b(parcelJ, bundle);
        l0.b(parcelJ, bundle2);
        m(2, parcelJ);
    }

    @Override // j.d.a.d.a.b.u0
    public final void I(Bundle bundle) {
        Parcel parcelJ = j();
        l0.b(parcelJ, bundle);
        m(4, parcelJ);
    }

    @Override // j.d.a.d.a.b.u0
    public final void i0(Bundle bundle) {
        Parcel parcelJ = j();
        l0.b(parcelJ, bundle);
        m(3, parcelJ);
    }
}
