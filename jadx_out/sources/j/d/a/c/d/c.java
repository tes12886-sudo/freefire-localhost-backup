package j.d.a.c.d;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
interface c extends IInterface {

    public static class a implements c {
        private final IBinder a;

        a(IBinder iBinder) {
            this.a = iBinder;
        }

        @Override // j.d.a.c.d.c
        public void U(Message message) {
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
            parcelObtain.writeInt(1);
            message.writeToParcel(parcelObtain, 0);
            try {
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

    void U(Message message);
}
