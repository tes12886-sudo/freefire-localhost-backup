package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    private static final String f = "com.facebook.internal.b";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static b f596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f597h = new a(null);
    private String a;
    private long b;
    private String c;
    private String d;
    private boolean e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }

        private final b a(b bVar) {
            bVar.b = System.currentTimeMillis();
            b.f596g = bVar;
            return bVar;
        }

        private final b b(Context context) {
            b bVarC = c(context);
            if (bVarC != null) {
                return bVarC;
            }
            b bVarD = d(context);
            return bVarD == null ? new b() : bVarD;
        }

        private final b c(Context context) {
            Object objP;
            try {
                if (!g(context)) {
                    return null;
                }
                Method methodG = h0.G("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class);
                if (methodG != null && (objP = h0.P(null, methodG, context)) != null) {
                    Method methodF = h0.F(objP.getClass(), "getId", new Class[0]);
                    Method methodF2 = h0.F(objP.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
                    if (methodF != null && methodF2 != null) {
                        b bVar = new b();
                        bVar.a = (String) h0.P(objP, methodF, new Object[0]);
                        Boolean bool = (Boolean) h0.P(objP, methodF2, new Object[0]);
                        bVar.e = bool != null ? bool.booleanValue() : false;
                        return bVar;
                    }
                }
                return null;
            } catch (Exception e) {
                h0.e0("android_id", e);
                return null;
            }
        }

        private final b d(Context context) {
            c cVar = new c();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                if (context.bindService(intent, cVar, 1)) {
                    try {
                        C0056b c0056b = new C0056b(cVar.a());
                        b bVar = new b();
                        bVar.a = c0056b.j();
                        bVar.e = c0056b.m();
                        return bVar;
                    } catch (Exception e) {
                        h0.e0("android_id", e);
                        return null;
                    } finally {
                        context.unbindService(cVar);
                    }
                }
            } catch (SecurityException unused) {
            }
            return null;
        }

        private final String f(Context context) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.getInstallerPackageName(context.getPackageName());
            }
            return null;
        }

        private final boolean g(Context context) {
            Method methodG = h0.G("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
            if (methodG == null) {
                return false;
            }
            Object objP = h0.P(null, methodG, context);
            return (objP instanceof Integer) && !(l.y.c.i.a(objP, 0) ^ true);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x006a A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:17:0x006c A[Catch: all -> 0x00f0, Exception -> 0x00f2, TryCatch #5 {Exception -> 0x00f2, all -> 0x00f0, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:10:0x0033, B:12:0x0055, B:15:0x0064, B:21:0x007d, B:23:0x0083, B:25:0x0088, B:27:0x008c, B:17:0x006c, B:48:0x00e8, B:49:0x00ef), top: B:67:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:19:0x0079  */
        /* JADX WARN: Code duplicated, block: B:61:0x0116  */
        public final b e(Context context) throws Throwable {
            Cursor cursor;
            Uri uri;
            String str;
            l.y.c.i.e(context, "context");
            b bVarB = b(context);
            Cursor cursor2 = null;
            try {
                if (l.y.c.i.a(Looper.myLooper(), Looper.getMainLooper())) {
                    throw new com.facebook.n("getAttributionIdentifiers cannot be called on the main thread.");
                }
                b bVar = b.f596g;
                if (bVar != null && System.currentTimeMillis() - bVar.b < 3600000) {
                    return bVar;
                }
                String[] strArr = {"aid", "androidid", "limit_tracking"};
                ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0);
                ProviderInfo providerInfoResolveContentProvider2 = context.getPackageManager().resolveContentProvider("com.facebook.wakizashi.provider.AttributionIdProvider", 0);
                if (providerInfoResolveContentProvider != null) {
                    String str2 = providerInfoResolveContentProvider.packageName;
                    l.y.c.i.d(str2, "contentProviderInfo.packageName");
                    if (!n.a(context, str2)) {
                        if (providerInfoResolveContentProvider2 != null) {
                            String str3 = providerInfoResolveContentProvider2.packageName;
                            l.y.c.i.d(str3, "wakizashiProviderInfo.packageName");
                            str = n.a(context, str3) ? "content://com.facebook.wakizashi.provider.AttributionIdProvider" : "content://com.facebook.katana.provider.AttributionIdProvider";
                        }
                        uri = null;
                    }
                    uri = Uri.parse(str);
                } else {
                    if (providerInfoResolveContentProvider2 != null) {
                        String str4 = providerInfoResolveContentProvider2.packageName;
                        l.y.c.i.d(str4, "wakizashiProviderInfo.packageName");
                        if (n.a(context, str4)) {
                            uri = Uri.parse(str);
                        }
                    }
                    uri = null;
                }
                String strF = f(context);
                if (strF != null) {
                    bVarB.d = strF;
                }
                if (uri == null) {
                    a(bVarB);
                    return bVarB;
                }
                Cursor cursorQuery = context.getContentResolver().query(uri, strArr, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            int columnIndex = cursorQuery.getColumnIndex("aid");
                            int columnIndex2 = cursorQuery.getColumnIndex("androidid");
                            int columnIndex3 = cursorQuery.getColumnIndex("limit_tracking");
                            bVarB.c = cursorQuery.getString(columnIndex);
                            if (columnIndex2 > 0 && columnIndex3 > 0 && bVarB.h() == null) {
                                bVarB.a = cursorQuery.getString(columnIndex2);
                                bVarB.e = Boolean.parseBoolean(cursorQuery.getString(columnIndex3));
                            }
                            cursorQuery.close();
                            a(bVarB);
                            return bVarB;
                        }
                    } catch (Exception e) {
                        cursor = cursorQuery;
                        e = e;
                        try {
                            h0.f0(b.f, "Caught unexpected exception in getAttributionId(): " + e);
                            if (cursor != null) {
                                cursor.close();
                            }
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            cursor2 = cursor;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        cursor2 = cursorQuery;
                        th = th2;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        throw th;
                    }
                }
                a(bVarB);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return bVarB;
            } catch (Exception e2) {
                e = e2;
                cursor = null;
            } catch (Throwable th3) {
                th = th3;
            }
        }

        public final boolean h(Context context) throws Throwable {
            l.y.c.i.e(context, "context");
            b bVarE = e(context);
            return bVarE != null && bVarE.k();
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.b$b, reason: collision with other inner class name */
    private static final class C0056b implements IInterface {
        private final IBinder a;

        public C0056b(IBinder iBinder) {
            l.y.c.i.e(iBinder, "binder");
            this.a = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.a;
        }

        public final String j() {
            Parcel parcelObtain = Parcel.obtain();
            l.y.c.i.d(parcelObtain, "Parcel.obtain()");
            Parcel parcelObtain2 = Parcel.obtain();
            l.y.c.i.d(parcelObtain2, "Parcel.obtain()");
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        public final boolean m() {
            Parcel parcelObtain = Parcel.obtain();
            l.y.c.i.d(parcelObtain, "Parcel.obtain()");
            Parcel parcelObtain2 = Parcel.obtain();
            l.y.c.i.d(parcelObtain2, "Parcel.obtain()");
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(1);
                this.a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    private static final class c implements ServiceConnection {
        private final AtomicBoolean a = new AtomicBoolean(false);
        private final BlockingQueue<IBinder> b = new LinkedBlockingDeque();

        public final IBinder a() throws InterruptedException {
            if (!(!this.a.compareAndSet(true, true))) {
                throw new IllegalStateException("Binder already consumed".toString());
            }
            IBinder iBinderTake = this.b.take();
            l.y.c.i.d(iBinderTake, "queue.take()");
            return iBinderTake;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.b.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public final String h() {
        if (com.facebook.r.x() && com.facebook.r.e()) {
            return this.a;
        }
        return null;
    }

    public final String i() {
        return this.d;
    }

    public final String j() {
        return this.c;
    }

    public final boolean k() {
        return this.e;
    }
}
