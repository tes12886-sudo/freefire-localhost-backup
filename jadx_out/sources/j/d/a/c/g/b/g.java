package j.d.a.c.g.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class g extends j.d.a.c.f.d.a implements IInterface {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void c1(int i2) {
        Parcel parcelJ = j();
        parcelJ.writeInt(i2);
        m(7, parcelJ);
    }

    public final void p1(com.google.android.gms.common.internal.j jVar, int i2, boolean z) {
        Parcel parcelJ = j();
        j.d.a.c.f.d.c.e(parcelJ, jVar);
        parcelJ.writeInt(i2);
        j.d.a.c.f.d.c.c(parcelJ, z);
        m(9, parcelJ);
    }

    public final void q1(j jVar, f fVar) {
        Parcel parcelJ = j();
        j.d.a.c.f.d.c.d(parcelJ, jVar);
        j.d.a.c.f.d.c.e(parcelJ, fVar);
        m(12, parcelJ);
    }
}
