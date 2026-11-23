package com.google.android.vending.licensing;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public interface ILicensingService extends IInterface {

    public static abstract class a extends Binder implements ILicensingService {

        /* JADX INFO: renamed from: com.google.android.vending.licensing.ILicensingService$a$a, reason: collision with other inner class name */
        private static class C0127a implements ILicensingService {
            private IBinder a;

            C0127a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // com.google.android.vending.licensing.ILicensingService
            public void Q0(long j2, String str, d dVar) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.android.vending.licensing.ILicensingService");
                    parcelObtain.writeLong(j2);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    this.a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }
        }

        public static ILicensingService j(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.licensing.ILicensingService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ILicensingService)) ? new C0127a(iBinder) : (ILicensingService) iInterfaceQueryLocalInterface;
        }
    }

    void Q0(long j2, String str, d dVar);
}
