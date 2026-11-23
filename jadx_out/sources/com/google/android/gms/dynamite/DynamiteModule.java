package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.util.DynamiteApi;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
public final class DynamiteModule {

    @GuardedBy("DynamiteModule.class")
    private static Boolean d = null;

    @GuardedBy("DynamiteModule.class")
    private static String e = null;

    @GuardedBy("DynamiteModule.class")
    private static boolean f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @GuardedBy("DynamiteModule.class")
    private static int f1041g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @GuardedBy("DynamiteModule.class")
    private static Boolean f1042h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @GuardedBy("DynamiteModule.class")
    private static l f1046l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @GuardedBy("DynamiteModule.class")
    private static m f1047m;
    private final Context a;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final ThreadLocal f1043i = new ThreadLocal();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final ThreadLocal f1044j = new d();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final b.a f1045k = new e();
    public static final b b = new f();
    public static final b c = new g();

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {

        @GuardedBy("DynamiteLoaderClassLoader.class")
        public static ClassLoader sClassLoader;
    }

    public static class a extends Exception {
        /* synthetic */ a(String str, k kVar) {
            super(str);
        }

        /* synthetic */ a(String str, Throwable th, k kVar) {
            super(str, th);
        }
    }

    public interface b {

        public interface a {
            int a(Context context, String str);

            int b(Context context, String str, boolean z);
        }

        /* JADX INFO: renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b, reason: collision with other inner class name */
        public static class C0125b {
            public int a = 0;
            public int b = 0;
            public int c = 0;
        }

        C0125b a(Context context, String str, a aVar);
    }

    private DynamiteModule(Context context) {
        q.k(context);
        this.a = context;
    }

    public static int a(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (o.a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e2) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage())));
            return 0;
        }
    }

    public static int b(Context context, String str) {
        return e(context, str, false);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0209 A[Catch: all -> 0x0212, TRY_ENTER, TryCatch #1 {, blocks: (B:28:0x00a2, B:30:0x00a8, B:31:0x00aa, B:101:0x0209, B:102:0x0211), top: B:147:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x028b A[Catch: all -> 0x02d4, TryCatch #2 {all -> 0x02d4, blocks: (B:3:0x0025, B:7:0x006f, B:12:0x0077, B:15:0x007d, B:26:0x009f, B:107:0x0216, B:108:0x0221, B:110:0x0223, B:112:0x0225, B:113:0x022d, B:131:0x028b, B:132:0x02a2, B:115:0x022f, B:117:0x024d, B:119:0x025e, B:129:0x0282, B:130:0x028a, B:133:0x02a3, B:134:0x02d3), top: B:148:0x0025, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x00d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x007d A[Catch: all -> 0x02d4, TRY_LEAVE, TryCatch #2 {all -> 0x02d4, blocks: (B:3:0x0025, B:7:0x006f, B:12:0x0077, B:15:0x007d, B:26:0x009f, B:107:0x0216, B:108:0x0221, B:110:0x0223, B:112:0x0225, B:113:0x022d, B:131:0x028b, B:132:0x02a2, B:115:0x022f, B:117:0x024d, B:119:0x025e, B:129:0x0282, B:130:0x028a, B:133:0x02a3, B:134:0x02d3), top: B:148:0x0025, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0087  */
    /* JADX WARN: Code duplicated, block: B:19:0x008b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0096  */
    /* JADX WARN: Code duplicated, block: B:25:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a8 A[Catch: all -> 0x0212, TryCatch #1 {, blocks: (B:28:0x00a2, B:30:0x00a8, B:31:0x00aa, B:101:0x0209, B:102:0x0211), top: B:147:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ad A[Catch: all -> 0x0215, a -> 0x0222, RemoteException -> 0x0224, TRY_ENTER, TryCatch #7 {RemoteException -> 0x0224, a -> 0x0222, all -> 0x0215, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x0140, B:55:0x0116, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:66:0x014d, B:67:0x0155, B:70:0x0158, B:71:0x0159, B:73:0x017d, B:75:0x0184, B:77:0x018c, B:83:0x01c5, B:85:0x01cb, B:95:0x01ee, B:96:0x01f6, B:78:0x019b, B:79:0x01a3, B:81:0x01a6, B:82:0x01b6, B:97:0x01f7, B:98:0x01ff, B:99:0x0200, B:100:0x0208, B:105:0x0214), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b4 A[Catch: all -> 0x0215, a -> 0x0222, RemoteException -> 0x0224, TryCatch #7 {RemoteException -> 0x0224, a -> 0x0222, all -> 0x0215, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x0140, B:55:0x0116, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:66:0x014d, B:67:0x0155, B:70:0x0158, B:71:0x0159, B:73:0x017d, B:75:0x0184, B:77:0x018c, B:83:0x01c5, B:85:0x01cb, B:95:0x01ee, B:96:0x01f6, B:78:0x019b, B:79:0x01a3, B:81:0x01a6, B:82:0x01b6, B:97:0x01f7, B:98:0x01ff, B:99:0x0200, B:100:0x0208, B:105:0x0214), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d8 A[Catch: all -> 0x0215, a -> 0x0222, RemoteException -> 0x0224, TRY_ENTER, TryCatch #7 {RemoteException -> 0x0224, a -> 0x0222, all -> 0x0215, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x0140, B:55:0x0116, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:66:0x014d, B:67:0x0155, B:70:0x0158, B:71:0x0159, B:73:0x017d, B:75:0x0184, B:77:0x018c, B:83:0x01c5, B:85:0x01cb, B:95:0x01ee, B:96:0x01f6, B:78:0x019b, B:79:0x01a3, B:81:0x01a6, B:82:0x01b6, B:97:0x01f7, B:98:0x01ff, B:99:0x0200, B:100:0x0208, B:105:0x0214), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x014d A[Catch: all -> 0x0215, a -> 0x0222, RemoteException -> 0x0224, TryCatch #7 {RemoteException -> 0x0224, a -> 0x0222, all -> 0x0215, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x0140, B:55:0x0116, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:66:0x014d, B:67:0x0155, B:70:0x0158, B:71:0x0159, B:73:0x017d, B:75:0x0184, B:77:0x018c, B:83:0x01c5, B:85:0x01cb, B:95:0x01ee, B:96:0x01f6, B:78:0x019b, B:79:0x01a3, B:81:0x01a6, B:82:0x01b6, B:97:0x01f7, B:98:0x01ff, B:99:0x0200, B:100:0x0208, B:105:0x0214), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0159 A[Catch: all -> 0x0215, a -> 0x0222, RemoteException -> 0x0224, TryCatch #7 {RemoteException -> 0x0224, a -> 0x0222, all -> 0x0215, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x0140, B:55:0x0116, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:66:0x014d, B:67:0x0155, B:70:0x0158, B:71:0x0159, B:73:0x017d, B:75:0x0184, B:77:0x018c, B:83:0x01c5, B:85:0x01cb, B:95:0x01ee, B:96:0x01f6, B:78:0x019b, B:79:0x01a3, B:81:0x01a6, B:82:0x01b6, B:97:0x01f7, B:98:0x01ff, B:99:0x0200, B:100:0x0208, B:105:0x0214), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x017d A[Catch: all -> 0x0215, a -> 0x0222, RemoteException -> 0x0224, TryCatch #7 {RemoteException -> 0x0224, a -> 0x0222, all -> 0x0215, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x0140, B:55:0x0116, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:66:0x014d, B:67:0x0155, B:70:0x0158, B:71:0x0159, B:73:0x017d, B:75:0x0184, B:77:0x018c, B:83:0x01c5, B:85:0x01cb, B:95:0x01ee, B:96:0x01f6, B:78:0x019b, B:79:0x01a3, B:81:0x01a6, B:82:0x01b6, B:97:0x01f7, B:98:0x01ff, B:99:0x0200, B:100:0x0208, B:105:0x0214), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0184 A[Catch: all -> 0x0215, a -> 0x0222, RemoteException -> 0x0224, TryCatch #7 {RemoteException -> 0x0224, a -> 0x0222, all -> 0x0215, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x0140, B:55:0x0116, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:66:0x014d, B:67:0x0155, B:70:0x0158, B:71:0x0159, B:73:0x017d, B:75:0x0184, B:77:0x018c, B:83:0x01c5, B:85:0x01cb, B:95:0x01ee, B:96:0x01f6, B:78:0x019b, B:79:0x01a3, B:81:0x01a6, B:82:0x01b6, B:97:0x01f7, B:98:0x01ff, B:99:0x0200, B:100:0x0208, B:105:0x0214), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x018c A[Catch: all -> 0x0215, a -> 0x0222, RemoteException -> 0x0224, TryCatch #7 {RemoteException -> 0x0224, a -> 0x0222, all -> 0x0215, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x0140, B:55:0x0116, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:66:0x014d, B:67:0x0155, B:70:0x0158, B:71:0x0159, B:73:0x017d, B:75:0x0184, B:77:0x018c, B:83:0x01c5, B:85:0x01cb, B:95:0x01ee, B:96:0x01f6, B:78:0x019b, B:79:0x01a3, B:81:0x01a6, B:82:0x01b6, B:97:0x01f7, B:98:0x01ff, B:99:0x0200, B:100:0x0208, B:105:0x0214), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x019b A[Catch: all -> 0x0215, a -> 0x0222, RemoteException -> 0x0224, TryCatch #7 {RemoteException -> 0x0224, a -> 0x0222, all -> 0x0215, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x0140, B:55:0x0116, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:66:0x014d, B:67:0x0155, B:70:0x0158, B:71:0x0159, B:73:0x017d, B:75:0x0184, B:77:0x018c, B:83:0x01c5, B:85:0x01cb, B:95:0x01ee, B:96:0x01f6, B:78:0x019b, B:79:0x01a3, B:81:0x01a6, B:82:0x01b6, B:97:0x01f7, B:98:0x01ff, B:99:0x0200, B:100:0x0208, B:105:0x0214), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x01a6 A[Catch: all -> 0x0215, a -> 0x0222, RemoteException -> 0x0224, TryCatch #7 {RemoteException -> 0x0224, a -> 0x0222, all -> 0x0215, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x0140, B:55:0x0116, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:66:0x014d, B:67:0x0155, B:70:0x0158, B:71:0x0159, B:73:0x017d, B:75:0x0184, B:77:0x018c, B:83:0x01c5, B:85:0x01cb, B:95:0x01ee, B:96:0x01f6, B:78:0x019b, B:79:0x01a3, B:81:0x01a6, B:82:0x01b6, B:97:0x01f7, B:98:0x01ff, B:99:0x0200, B:100:0x0208, B:105:0x0214), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01b6 A[Catch: all -> 0x0215, a -> 0x0222, RemoteException -> 0x0224, TryCatch #7 {RemoteException -> 0x0224, a -> 0x0222, all -> 0x0215, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x0140, B:55:0x0116, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:66:0x014d, B:67:0x0155, B:70:0x0158, B:71:0x0159, B:73:0x017d, B:75:0x0184, B:77:0x018c, B:83:0x01c5, B:85:0x01cb, B:95:0x01ee, B:96:0x01f6, B:78:0x019b, B:79:0x01a3, B:81:0x01a6, B:82:0x01b6, B:97:0x01f7, B:98:0x01ff, B:99:0x0200, B:100:0x0208, B:105:0x0214), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01cb A[Catch: all -> 0x0215, a -> 0x0222, RemoteException -> 0x0224, TRY_LEAVE, TryCatch #7 {RemoteException -> 0x0224, a -> 0x0222, all -> 0x0215, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x0140, B:55:0x0116, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:66:0x014d, B:67:0x0155, B:70:0x0158, B:71:0x0159, B:73:0x017d, B:75:0x0184, B:77:0x018c, B:83:0x01c5, B:85:0x01cb, B:95:0x01ee, B:96:0x01f6, B:78:0x019b, B:79:0x01a3, B:81:0x01a6, B:82:0x01b6, B:97:0x01f7, B:98:0x01ff, B:99:0x0200, B:100:0x0208, B:105:0x0214), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:89:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ee A[Catch: all -> 0x0215, a -> 0x0222, RemoteException -> 0x0224, TRY_ENTER, TryCatch #7 {RemoteException -> 0x0224, a -> 0x0222, all -> 0x0215, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x0140, B:55:0x0116, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:66:0x014d, B:67:0x0155, B:70:0x0158, B:71:0x0159, B:73:0x017d, B:75:0x0184, B:77:0x018c, B:83:0x01c5, B:85:0x01cb, B:95:0x01ee, B:96:0x01f6, B:78:0x019b, B:79:0x01a3, B:81:0x01a6, B:82:0x01b6, B:97:0x01f7, B:98:0x01ff, B:99:0x0200, B:100:0x0208, B:105:0x0214), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01f7 A[Catch: all -> 0x0215, a -> 0x0222, RemoteException -> 0x0224, TryCatch #7 {RemoteException -> 0x0224, a -> 0x0222, all -> 0x0215, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x0140, B:55:0x0116, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:66:0x014d, B:67:0x0155, B:70:0x0158, B:71:0x0159, B:73:0x017d, B:75:0x0184, B:77:0x018c, B:83:0x01c5, B:85:0x01cb, B:95:0x01ee, B:96:0x01f6, B:78:0x019b, B:79:0x01a3, B:81:0x01a6, B:82:0x01b6, B:97:0x01f7, B:98:0x01ff, B:99:0x0200, B:100:0x0208, B:105:0x0214), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0200 A[Catch: all -> 0x0215, a -> 0x0222, RemoteException -> 0x0224, TryCatch #7 {RemoteException -> 0x0224, a -> 0x0222, all -> 0x0215, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x0140, B:55:0x0116, B:63:0x0143, B:64:0x0144, B:65:0x014c, B:66:0x014d, B:67:0x0155, B:70:0x0158, B:71:0x0159, B:73:0x017d, B:75:0x0184, B:77:0x018c, B:83:0x01c5, B:85:0x01cb, B:95:0x01ee, B:96:0x01f6, B:78:0x019b, B:79:0x01a3, B:81:0x01a6, B:82:0x01b6, B:97:0x01f7, B:98:0x01ff, B:99:0x0200, B:100:0x0208, B:105:0x0214), top: B:152:0x00a1 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:131:0x028b, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x00b4, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:71:0x0159, please report this as an issue */
    public static DynamiteModule d(Context context, b bVar, String str) {
        int i2;
        Boolean bool;
        l lVarK;
        int iD;
        j.d.a.c.e.a aVarP1;
        Object objO;
        DynamiteModule dynamiteModule;
        i iVar;
        Cursor cursor;
        m mVar;
        i iVar2;
        Boolean boolValueOf;
        j.d.a.c.e.a aVarO;
        Cursor cursor2;
        ThreadLocal threadLocal = f1043i;
        i iVar3 = (i) threadLocal.get();
        i iVar4 = new i(null);
        threadLocal.set(iVar4);
        ThreadLocal threadLocal2 = f1044j;
        long jLongValue = ((Long) threadLocal2.get()).longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            b.C0125b c0125bA = bVar.a(context, str, f1045k);
            Log.i("DynamiteModule", "Considering local module " + str + ":" + c0125bA.a + " and remote module " + str + ":" + c0125bA.b);
            int i3 = c0125bA.c;
            if (i3 != 0) {
                if (i3 != -1) {
                    if (i3 == 1 || c0125bA.b != 0) {
                        if (i3 == -1) {
                            DynamiteModule dynamiteModuleG = g(context, str);
                            if (jLongValue == 0) {
                                threadLocal2.remove();
                            } else {
                                threadLocal2.set(Long.valueOf(jLongValue));
                            }
                            cursor2 = iVar4.a;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            threadLocal.set(iVar3);
                            return dynamiteModuleG;
                        }
                        if (i3 == 1) {
                            throw new a("VersionPolicy returned invalid code:" + i3, null);
                        }
                        try {
                            i2 = c0125bA.b;
                            try {
                                synchronized (DynamiteModule.class) {
                                    if (j(context)) {
                                        throw new a("Remote loading disabled", null);
                                    }
                                    bool = d;
                                }
                                if (bool != null) {
                                    throw new a("Failed to determine which loading route to use.", null);
                                }
                                if (bool.booleanValue()) {
                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i2);
                                    synchronized (DynamiteModule.class) {
                                        mVar = f1047m;
                                    }
                                    if (mVar != null) {
                                        throw new a("DynamiteLoaderV2 was not cached.", null);
                                    }
                                    iVar2 = (i) threadLocal.get();
                                    if (iVar2 != null || iVar2.a == null) {
                                        throw new a("No result cursor", null);
                                    }
                                    Context applicationContext = context.getApplicationContext();
                                    Cursor cursor3 = iVar2.a;
                                    j.d.a.c.e.b.c1(null);
                                    synchronized (DynamiteModule.class) {
                                        boolValueOf = Boolean.valueOf(f1041g >= 2);
                                    }
                                    if (boolValueOf.booleanValue()) {
                                        Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                        aVarO = mVar.c1(j.d.a.c.e.b.c1(applicationContext), str, i2, j.d.a.c.e.b.c1(cursor3));
                                    } else {
                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                        aVarO = mVar.o(j.d.a.c.e.b.c1(applicationContext), str, i2, j.d.a.c.e.b.c1(cursor3));
                                    }
                                    Context context2 = (Context) j.d.a.c.e.b.o(aVarO);
                                    if (context2 == null) {
                                        throw new a("Failed to get module context", null);
                                    }
                                    dynamiteModule = new DynamiteModule(context2);
                                } else {
                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i2);
                                    lVarK = k(context);
                                    if (lVarK != null) {
                                        throw new a("Failed to create IDynamiteLoader.", null);
                                    }
                                    iD = lVarK.d();
                                    if (iD >= 3) {
                                        iVar = (i) threadLocal.get();
                                        if (iVar != null) {
                                            throw new a("No cached result cursor holder", null);
                                        }
                                        aVarP1 = lVarK.q1(j.d.a.c.e.b.c1(context), str, i2, j.d.a.c.e.b.c1(iVar.a));
                                    } else if (iD == 2) {
                                        Log.w("DynamiteModule", "IDynamite loader version = 2");
                                        aVarP1 = lVarK.r1(j.d.a.c.e.b.c1(context), str, i2);
                                    } else {
                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                        aVarP1 = lVarK.p1(j.d.a.c.e.b.c1(context), str, i2);
                                    }
                                    objO = j.d.a.c.e.b.o(aVarP1);
                                    if (objO != null) {
                                        throw new a("Failed to load remote module.", null);
                                    }
                                    dynamiteModule = new DynamiteModule((Context) objO);
                                }
                                if (jLongValue == 0) {
                                    threadLocal2.remove();
                                } else {
                                    threadLocal2.set(Long.valueOf(jLongValue));
                                }
                                cursor = iVar4.a;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                threadLocal.set(iVar3);
                                return dynamiteModule;
                            } catch (RemoteException e2) {
                                throw new a("Failed to load remote module.", e2, null);
                            } catch (a e3) {
                                throw e3;
                            } catch (Throwable th) {
                                com.google.android.gms.common.util.g.a(context, th);
                                throw new a("Failed to load remote module.", th, null);
                            }
                        } catch (a e4) {
                            Log.w("DynamiteModule", "Failed to load remote module: " + e4.getMessage());
                            int i4 = c0125bA.a;
                            if (i4 == 0 || bVar.a(context, str, new j(i4, 0)).c != -1) {
                                throw new a("Remote load failed. No local fallback found.", e4, null);
                            }
                            DynamiteModule dynamiteModuleG2 = g(context, str);
                            ThreadLocal threadLocal3 = f1044j;
                            if (jLongValue == 0) {
                                threadLocal3.remove();
                            } else {
                                threadLocal3.set(Long.valueOf(jLongValue));
                            }
                            Cursor cursor4 = iVar4.a;
                            if (cursor4 != null) {
                                cursor4.close();
                            }
                            f1043i.set(iVar3);
                            return dynamiteModuleG2;
                        }
                    }
                } else if (c0125bA.a != 0) {
                    i3 = -1;
                    if (i3 == 1) {
                    }
                    if (i3 == -1) {
                        DynamiteModule dynamiteModuleG3 = g(context, str);
                        if (jLongValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(Long.valueOf(jLongValue));
                        }
                        cursor2 = iVar4.a;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        threadLocal.set(iVar3);
                        return dynamiteModuleG3;
                    }
                    if (i3 == 1) {
                        throw new a("VersionPolicy returned invalid code:" + i3, null);
                    }
                    i2 = c0125bA.b;
                    synchronized (DynamiteModule.class) {
                        if (j(context)) {
                            throw new a("Remote loading disabled", null);
                        }
                        bool = d;
                        if (bool != null) {
                            throw new a("Failed to determine which loading route to use.", null);
                        }
                        if (bool.booleanValue()) {
                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i2);
                            synchronized (DynamiteModule.class) {
                                mVar = f1047m;
                                if (mVar != null) {
                                    throw new a("DynamiteLoaderV2 was not cached.", null);
                                }
                                iVar2 = (i) threadLocal.get();
                                if (iVar2 != null) {
                                }
                                throw new a("No result cursor", null);
                            }
                        }
                        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i2);
                        lVarK = k(context);
                        if (lVarK != null) {
                            throw new a("Failed to create IDynamiteLoader.", null);
                        }
                        iD = lVarK.d();
                        if (iD >= 3) {
                            iVar = (i) threadLocal.get();
                            if (iVar != null) {
                                throw new a("No cached result cursor holder", null);
                            }
                            aVarP1 = lVarK.q1(j.d.a.c.e.b.c1(context), str, i2, j.d.a.c.e.b.c1(iVar.a));
                        } else if (iD == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                            aVarP1 = lVarK.r1(j.d.a.c.e.b.c1(context), str, i2);
                        } else {
                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                            aVarP1 = lVarK.p1(j.d.a.c.e.b.c1(context), str, i2);
                        }
                        objO = j.d.a.c.e.b.o(aVarP1);
                        if (objO != null) {
                            throw new a("Failed to load remote module.", null);
                        }
                        dynamiteModule = new DynamiteModule((Context) objO);
                        if (jLongValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(Long.valueOf(jLongValue));
                        }
                        cursor = iVar4.a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(iVar3);
                        return dynamiteModule;
                    }
                }
            }
            throw new a("No acceptable module " + str + " found. Local version is " + c0125bA.a + " and remote version is " + c0125bA.b + ".", null);
        } catch (Throwable th2) {
            ThreadLocal threadLocal4 = f1044j;
            if (jLongValue == 0) {
                threadLocal4.remove();
            } else {
                threadLocal4.set(Long.valueOf(jLongValue));
            }
            Cursor cursor5 = iVar4.a;
            if (cursor5 != null) {
                cursor5.close();
            }
            f1043i.set(iVar3);
            throw th2;
        }
    }

    /* JADX INFO: Removed unreachable split cross block B:136:0x01ae */
    /* JADX WARN: Code duplicated, block: B:95:0x015e A[Catch: all -> 0x01ba, TRY_ENTER, TRY_LEAVE, TryCatch #12 {all -> 0x01ba, blocks: (B:4:0x0006, B:62:0x00d1, B:64:0x00d7, B:69:0x00f8, B:91:0x0150, B:95:0x015e, B:116:0x01b3, B:117:0x01b6, B:111:0x01ab, B:67:0x00dd, B:120:0x01b9, B:5:0x0007, B:8:0x000d, B:9:0x0029, B:60:0x00cd, B:19:0x0046, B:41:0x0096, B:44:0x0099, B:53:0x00ad, B:61:0x00d0, B:59:0x00b3), top: B:140:0x0006, inners: #7, #11 }] */
    public static int e(Context context, String str, boolean z) {
        ClassLoader systemClassLoader;
        Throwable th;
        RemoteException e2;
        Cursor cursor;
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = Boolean.FALSE;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool3 = d;
                Cursor cursor2 = null;
                int iO = 0;
                if (bool3 == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                            if (classLoader == ClassLoader.getSystemClassLoader()) {
                                bool = bool2;
                            } else if (classLoader != null) {
                                try {
                                    h(classLoader);
                                } catch (a unused) {
                                }
                            } else {
                                if (!j(context)) {
                                    return 0;
                                }
                                if (f || bool.equals(null)) {
                                    systemClassLoader = ClassLoader.getSystemClassLoader();
                                } else {
                                    try {
                                        int iF = f(context, str, z, true);
                                        String str2 = e;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader classLoaderA = com.google.android.gms.dynamite.b.a();
                                            if (classLoaderA == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    String str3 = e;
                                                    q.k(str3);
                                                    classLoaderA = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                                } else {
                                                    String str4 = e;
                                                    q.k(str4);
                                                    classLoaderA = new c(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            h(classLoaderA);
                                            declaredField.set(null, classLoaderA);
                                            d = bool;
                                            return iF;
                                        }
                                        return iF;
                                    } catch (a unused2) {
                                        systemClassLoader = ClassLoader.getSystemClassLoader();
                                    }
                                }
                                declaredField.set(null, systemClassLoader);
                                bool = bool2;
                            }
                            bool2 = bool;
                            d = bool2;
                            bool3 = bool2;
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e3) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e3.toString());
                    }
                }
                if (bool3.booleanValue()) {
                    try {
                        return f(context, str, z, false);
                    } catch (a e4) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e4.getMessage());
                        return 0;
                    }
                }
                l lVarK = k(context);
                try {
                    if (lVarK != null) {
                        try {
                            int iD = lVarK.d();
                            if (iD >= 3) {
                                i iVar = (i) f1043i.get();
                                if (iVar == null || (cursor = iVar.a) == null) {
                                    Cursor cursor3 = (Cursor) j.d.a.c.e.b.o(lVarK.s1(j.d.a.c.e.b.c1(context), str, z, ((Long) f1044j.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i2 = cursor3.getInt(0);
                                                cursor2 = (i2 <= 0 || !i(cursor3)) ? cursor3 : null;
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                iO = i2;
                                            } else {
                                                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                                if (cursor3 != null) {
                                                    cursor3.close();
                                                }
                                            }
                                        } catch (RemoteException e5) {
                                            e2 = e5;
                                            cursor2 = cursor3;
                                            Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e2.getMessage());
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor2 = cursor3;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                        if (cursor3 != null) {
                                            cursor3.close();
                                        }
                                    }
                                } else {
                                    iO = cursor.getInt(0);
                                }
                            } else if (iD == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                iO = lVarK.c1(j.d.a.c.e.b.c1(context), str, z);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                iO = lVarK.o(j.d.a.c.e.b.c1(context), str, z);
                            }
                        } catch (RemoteException e6) {
                            e2 = e6;
                        }
                    }
                    return iO;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            com.google.android.gms.common.util.g.a(context, th4);
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00c9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    private static int f(Context context, String str, boolean z, boolean z2) throws Throwable {
        Throwable th;
        Exception e2;
        ?? r0 = 0;
        ?? r1 = 0;
        ?? r2 = 0;
        ?? r3 = 0;
        try {
            try {
                boolean z3 = true;
                Cursor cursorQuery = context.getContentResolver().query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(((Long) f1044j.get()).longValue())).build(), null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            boolean z4 = false;
                            int i2 = cursorQuery.getInt(0);
                            if (i2 > 0) {
                                synchronized (DynamiteModule.class) {
                                    e = cursorQuery.getString(2);
                                    int columnIndex = cursorQuery.getColumnIndex("loaderVersion");
                                    if (columnIndex >= 0) {
                                        f1041g = cursorQuery.getInt(columnIndex);
                                    }
                                    int columnIndex2 = cursorQuery.getColumnIndex("disableStandaloneDynamiteLoader2");
                                    if (columnIndex2 >= 0) {
                                        if (cursorQuery.getInt(columnIndex2) == 0) {
                                            z3 = false;
                                        }
                                        f = z3;
                                        z4 = z3;
                                    }
                                }
                                if (i(cursorQuery)) {
                                    cursorQuery = null;
                                }
                            }
                            if (z2 && z4) {
                                throw new a("forcing fallback to container DynamiteLoader impl", r2 == true ? 1 : 0);
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return i2;
                        }
                    } catch (Exception e3) {
                        e2 = e3;
                        if (e2 instanceof a) {
                            throw e2;
                        }
                        throw new a("V2 version check failed", e2, r1 == true ? 1 : 0);
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new a("Failed to connect to dynamite module ContentResolver.", r3 == true ? 1 : 0);
            } catch (Throwable th2) {
                th = th2;
                r0 = context;
                if (r0 != 0) {
                    r0.close();
                }
                throw th;
            }
        } catch (Exception e4) {
            e2 = e4;
        } catch (Throwable th3) {
            th = th3;
            if (r0 != 0) {
                r0.close();
            }
            throw th;
        }
    }

    private static DynamiteModule g(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context.getApplicationContext());
    }

    @GuardedBy("DynamiteModule.class")
    private static void h(ClassLoader classLoader) throws a {
        m mVar;
        k kVar = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                mVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                mVar = iInterfaceQueryLocalInterface instanceof m ? (m) iInterfaceQueryLocalInterface : new m(iBinder);
            }
            f1047m = mVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new a("Failed to instantiate dynamite loader", e2, kVar);
        }
    }

    private static boolean i(Cursor cursor) {
        i iVar = (i) f1043i.get();
        if (iVar == null || iVar.a != null) {
            return false;
        }
        iVar.a = cursor;
        return true;
    }

    @GuardedBy("DynamiteModule.class")
    private static boolean j(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f1042h)) {
            return true;
        }
        boolean zBooleanValue = false;
        if (f1042h == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                zBooleanValue = true;
            }
            Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
            f1042h = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
            if (zBooleanValue && providerInfoResolveContentProvider != null && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f = true;
            }
        }
        if (!zBooleanValue) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return zBooleanValue;
    }

    private static l k(Context context) {
        l lVar;
        synchronized (DynamiteModule.class) {
            l lVar2 = f1046l;
            if (lVar2 != null) {
                return lVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    lVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    lVar = iInterfaceQueryLocalInterface instanceof l ? (l) iInterfaceQueryLocalInterface : new l(iBinder);
                }
                if (lVar != null) {
                    f1046l = lVar;
                    return lVar;
                }
            } catch (Exception e2) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e2.getMessage());
            }
            return null;
        }
    }

    public IBinder c(String str) throws a {
        try {
            return (IBinder) this.a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new a("Failed to instantiate module class: ".concat(String.valueOf(str)), e2, null);
        }
    }
}
