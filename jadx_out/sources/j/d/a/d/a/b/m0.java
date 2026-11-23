package j.d.a.d.a.b;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends j0 implements o0 {
    m0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
    }

    @Override // j.d.a.d.a.b.o0
    public final void A0(String str, Bundle bundle, q0 q0Var) {
        Parcel parcelJ = j();
        parcelJ.writeString(str);
        l0.b(parcelJ, bundle);
        l0.c(parcelJ, q0Var);
        m(5, parcelJ);
    }

    @Override // j.d.a.d.a.b.o0
    public final void B(String str, List<Bundle> list, Bundle bundle, q0 q0Var) {
        Parcel parcelJ = j();
        parcelJ.writeString(str);
        parcelJ.writeTypedList(list);
        l0.b(parcelJ, bundle);
        l0.c(parcelJ, q0Var);
        m(14, parcelJ);
    }

    @Override // j.d.a.d.a.b.o0
    public final void E0(String str, Bundle bundle, q0 q0Var) {
        Parcel parcelJ = j();
        parcelJ.writeString(str);
        l0.b(parcelJ, bundle);
        l0.c(parcelJ, q0Var);
        m(10, parcelJ);
    }

    @Override // j.d.a.d.a.b.o0
    public final void H0(String str, Bundle bundle, Bundle bundle2, q0 q0Var) {
        Parcel parcelJ = j();
        parcelJ.writeString(str);
        l0.b(parcelJ, bundle);
        l0.b(parcelJ, bundle2);
        l0.c(parcelJ, q0Var);
        m(11, parcelJ);
    }

    @Override // j.d.a.d.a.b.o0
    public final void S0(String str, Bundle bundle, Bundle bundle2, q0 q0Var) {
        Parcel parcelJ = j();
        parcelJ.writeString(str);
        l0.b(parcelJ, bundle);
        l0.b(parcelJ, bundle2);
        l0.c(parcelJ, q0Var);
        m(6, parcelJ);
    }

    @Override // j.d.a.d.a.b.o0
    public final void b0(String str, Bundle bundle, Bundle bundle2, q0 q0Var) {
        Parcel parcelJ = j();
        parcelJ.writeString(str);
        l0.b(parcelJ, bundle);
        l0.b(parcelJ, bundle2);
        l0.c(parcelJ, q0Var);
        m(9, parcelJ);
    }

    @Override // j.d.a.d.a.b.o0
    public final void y(String str, Bundle bundle, Bundle bundle2, q0 q0Var) {
        Parcel parcelJ = j();
        parcelJ.writeString(str);
        l0.b(parcelJ, bundle);
        l0.b(parcelJ, bundle2);
        l0.c(parcelJ, q0Var);
        m(7, parcelJ);
    }
}
