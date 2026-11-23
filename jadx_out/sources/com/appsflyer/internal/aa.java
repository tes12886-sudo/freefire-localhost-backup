package com.appsflyer.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class aa {
    public final long AFInAppEventParameterName;
    private final boolean AFInAppEventType;
    public final String AFKeystoreWrapper;

    static final class b implements IInterface {
        private final IBinder values;

        b(IBinder iBinder) {
            this.values = iBinder;
        }

        public final String AFKeystoreWrapper() {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.values.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.values;
        }

        final boolean valueOf() {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(1);
                this.values.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    static final class d {
        final String valueOf;
        private final boolean values;

        d(String str, boolean z) {
            this.valueOf = str;
            this.values = z;
        }

        final boolean valueOf() {
            return this.values;
        }
    }

    static final class e implements ServiceConnection {
        boolean AFInAppEventParameterName;
        final LinkedBlockingQueue<IBinder> values;

        private e() {
            this.values = new LinkedBlockingQueue<>(1);
            this.AFInAppEventParameterName = false;
        }

        /* synthetic */ e(byte b) {
            this();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.values.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    aa() {
    }

    public aa(String str, long j2, boolean z) {
        this.AFKeystoreWrapper = str;
        this.AFInAppEventParameterName = j2;
        this.AFInAppEventType = z;
    }

    static d values(Context context) throws PackageManager.NameNotFoundException, IOException {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        context.getPackageManager().getPackageInfo(GoogleApiAvailabilityLight.GOOGLE_PLAY_STORE_PACKAGE, 0);
        e eVar = new e((byte) 0);
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try {
            if (!context.bindService(intent, eVar, 1)) {
                if (context != null) {
                    context.unbindService(eVar);
                }
                throw new IOException("Google Play connection failed");
            }
            if (eVar.AFInAppEventParameterName) {
                throw new IllegalStateException("Cannot call get on this connection more than once");
            }
            eVar.AFInAppEventParameterName = true;
            IBinder iBinderPoll = eVar.values.poll(10L, TimeUnit.SECONDS);
            if (iBinderPoll == null) {
                throw new TimeoutException("Timed out waiting for the service connection");
            }
            b bVar = new b(iBinderPoll);
            d dVar = new d(bVar.AFKeystoreWrapper(), bVar.valueOf());
            if (context != null) {
                context.unbindService(eVar);
            }
            return dVar;
        } catch (Throwable th) {
            if (context != null) {
                context.unbindService(eVar);
            }
            throw th;
        }
    }

    public final boolean valueOf() {
        return this.AFInAppEventType;
    }
}
