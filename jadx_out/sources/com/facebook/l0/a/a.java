package com.facebook.l0.a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: com.facebook.l0.a.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0096a extends Binder implements a {

        /* JADX INFO: renamed from: com.facebook.l0.a.a$a$a, reason: collision with other inner class name */
        private static class C0097a implements a {
            public static a b;
            private IBinder a;

            C0097a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // com.facebook.l0.a.a
            public int O(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.a.transact(1, parcelObtain, parcelObtain2, 0) && AbstractBinderC0096a.m() != null) {
                        return AbstractBinderC0096a.m().O(bundle);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }
        }

        public static a j(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0097a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        public static a m() {
            return C0097a.b;
        }
    }

    int O(Bundle bundle);
}
