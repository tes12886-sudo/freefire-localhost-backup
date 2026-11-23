package j.d.a.c.e;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: j.d.a.c.e.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0233a extends j.d.a.c.f.f.b implements a {
        public AbstractBinderC0233a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static a m(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new c(iBinder);
        }
    }
}
