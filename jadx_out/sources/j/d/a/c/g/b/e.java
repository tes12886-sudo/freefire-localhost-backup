package j.d.a.c.g.b;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends j.d.a.c.f.d.b implements f {
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // j.d.a.c.f.d.b
    protected final boolean p1(int i2, Parcel parcel, Parcel parcel2, int i3) {
        switch (i2) {
            case 3:
                j.d.a.c.f.d.c.b(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
            case 6:
                j.d.a.c.f.d.c.b(parcel);
                parcel2.writeNoException();
                return true;
            case 5:
            default:
                return false;
            case 7:
                j.d.a.c.f.d.c.b(parcel);
                parcel2.writeNoException();
                return true;
            case 8:
                l lVar = (l) j.d.a.c.f.d.c.a(parcel, l.CREATOR);
                j.d.a.c.f.d.c.b(parcel);
                g0(lVar);
                parcel2.writeNoException();
                return true;
            case 9:
                j.d.a.c.f.d.c.b(parcel);
                parcel2.writeNoException();
                return true;
        }
    }
}
