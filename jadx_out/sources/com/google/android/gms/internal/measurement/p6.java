package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class p6<T> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f1100g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private static volatile o6 f1101h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final AtomicInteger f1102i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f1103j = 0;
    final n6 a;
    final String b;
    private final T c;
    private volatile int d = -1;
    private volatile T e;
    private final boolean f;

    static {
        new AtomicReference();
        new r6(i6.a);
        f1102i = new AtomicInteger();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ p6(n6 n6Var, String str, Object obj, boolean z, j6 j6Var) {
        if (n6Var.b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.a = n6Var;
        this.b = str;
        this.c = obj;
        this.f = true;
    }

    @Deprecated
    public static void b(final Context context) {
        synchronized (f1100g) {
            o6 o6Var = f1101h;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (o6Var == null || o6Var.a() != context) {
                w5.e();
                q6.c();
                d6.d();
                f1101h = new s5(context, c7.a(new y6(context) { // from class: com.google.android.gms.internal.measurement.h6
                    private final Context a;

                    {
                        this.a = context;
                    }

                    @Override // com.google.android.gms.internal.measurement.y6
                    public final Object zza() {
                        v6 v6VarD;
                        v6 v6VarC;
                        Context contextCreateDeviceProtectedStorageContext = this.a;
                        int i2 = p6.f1103j;
                        String str = Build.TYPE;
                        String str2 = Build.TAGS;
                        if ((!str.equals("eng") && !str.equals("userdebug")) || (!str2.contains("dev-keys") && !str2.contains("test-keys"))) {
                            return v6.c();
                        }
                        if (r5.a() && !contextCreateDeviceProtectedStorageContext.isDeviceProtectedStorage()) {
                            contextCreateDeviceProtectedStorageContext = contextCreateDeviceProtectedStorageContext.createDeviceProtectedStorageContext();
                        }
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            StrictMode.allowThreadDiskWrites();
                            try {
                                File file = new File(contextCreateDeviceProtectedStorageContext.getDir("phenotype_hermetic", 0), "overrides.txt");
                                v6VarD = file.exists() ? v6.d(file) : v6.c();
                            } catch (RuntimeException e) {
                                Log.e("HermeticFileOverrides", "no data dir", e);
                            }
                            if (v6VarD.a()) {
                                File file2 = (File) v6VarD.b();
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                    try {
                                        HashMap map = new HashMap();
                                        HashMap map2 = new HashMap();
                                        while (true) {
                                            String line = bufferedReader.readLine();
                                            if (line == null) {
                                                break;
                                            }
                                            String[] strArrSplit = line.split(" ", 3);
                                            if (strArrSplit.length != 3) {
                                                Log.e("HermeticFileOverrides", line.length() != 0 ? "Invalid: ".concat(line) : new String("Invalid: "));
                                            } else {
                                                String str3 = new String(strArrSplit[0]);
                                                String strDecode = Uri.decode(new String(strArrSplit[1]));
                                                String strDecode2 = (String) map2.get(strArrSplit[2]);
                                                if (strDecode2 == null) {
                                                    String str4 = new String(strArrSplit[2]);
                                                    strDecode2 = Uri.decode(str4);
                                                    if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                        map2.put(str4, strDecode2);
                                                    }
                                                }
                                                if (!map.containsKey(str3)) {
                                                    map.put(str3, new HashMap());
                                                }
                                                ((Map) map.get(str3)).put(strDecode, strDecode2);
                                            }
                                        }
                                        String strValueOf = String.valueOf(file2);
                                        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 7);
                                        sb.append("Parsed ");
                                        sb.append(strValueOf);
                                        Log.i("HermeticFileOverrides", sb.toString());
                                        e6 e6Var = new e6(map);
                                        bufferedReader.close();
                                        v6VarC = v6.d(e6Var);
                                    } catch (Throwable th) {
                                        try {
                                            bufferedReader.close();
                                        } catch (Throwable th2) {
                                            j7.a(th, th2);
                                        }
                                        throw th;
                                    }
                                } catch (IOException e2) {
                                    throw new RuntimeException(e2);
                                }
                            } else {
                                v6VarC = v6.c();
                            }
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            return v6VarC;
                        } catch (Throwable th3) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th3;
                        }
                    }
                }));
                f1102i.incrementAndGet();
            }
        }
    }

    static void c() {
        f1102i.incrementAndGet();
    }

    abstract T a(Object obj);

    public final String d() {
        String str = this.a.d;
        return this.b;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00be A[Catch: all -> 0x011e, TryCatch #0 {, blocks: (B:12:0x001c, B:14:0x0020, B:16:0x0026, B:18:0x003d, B:20:0x0049, B:22:0x0052, B:24:0x0064, B:26:0x006f, B:25:0x0069, B:47:0x00e4, B:49:0x00f4, B:51:0x010a, B:52:0x010d, B:53:0x0111, B:41:0x00be, B:43:0x00da, B:46:0x00e2, B:28:0x0074, B:30:0x007a, B:32:0x0088, B:36:0x00ad, B:38:0x00b7, B:34:0x009f, B:54:0x0116, B:55:0x011b, B:56:0x011c), top: B:63:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00da A[Catch: all -> 0x011e, TryCatch #0 {, blocks: (B:12:0x001c, B:14:0x0020, B:16:0x0026, B:18:0x003d, B:20:0x0049, B:22:0x0052, B:24:0x0064, B:26:0x006f, B:25:0x0069, B:47:0x00e4, B:49:0x00f4, B:51:0x010a, B:52:0x010d, B:53:0x0111, B:41:0x00be, B:43:0x00da, B:46:0x00e2, B:28:0x0074, B:30:0x007a, B:32:0x0088, B:36:0x00ad, B:38:0x00b7, B:34:0x009f, B:54:0x0116, B:55:0x011b, B:56:0x011c), top: B:63:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00df  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e2 A[Catch: all -> 0x011e, TryCatch #0 {, blocks: (B:12:0x001c, B:14:0x0020, B:16:0x0026, B:18:0x003d, B:20:0x0049, B:22:0x0052, B:24:0x0064, B:26:0x006f, B:25:0x0069, B:47:0x00e4, B:49:0x00f4, B:51:0x010a, B:52:0x010d, B:53:0x0111, B:41:0x00be, B:43:0x00da, B:46:0x00e2, B:28:0x0074, B:30:0x007a, B:32:0x0088, B:36:0x00ad, B:38:0x00b7, B:34:0x009f, B:54:0x0116, B:55:0x011b, B:56:0x011c), top: B:63:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00f4 A[Catch: all -> 0x011e, TryCatch #0 {, blocks: (B:12:0x001c, B:14:0x0020, B:16:0x0026, B:18:0x003d, B:20:0x0049, B:22:0x0052, B:24:0x0064, B:26:0x006f, B:25:0x0069, B:47:0x00e4, B:49:0x00f4, B:51:0x010a, B:52:0x010d, B:53:0x0111, B:41:0x00be, B:43:0x00da, B:46:0x00e2, B:28:0x0074, B:30:0x007a, B:32:0x0088, B:36:0x00ad, B:38:0x00b7, B:34:0x009f, B:54:0x0116, B:55:0x011b, B:56:0x011c), top: B:63:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:51:0x010a A[Catch: all -> 0x011e, TryCatch #0 {, blocks: (B:12:0x001c, B:14:0x0020, B:16:0x0026, B:18:0x003d, B:20:0x0049, B:22:0x0052, B:24:0x0064, B:26:0x006f, B:25:0x0069, B:47:0x00e4, B:49:0x00f4, B:51:0x010a, B:52:0x010d, B:53:0x0111, B:41:0x00be, B:43:0x00da, B:46:0x00e2, B:28:0x0074, B:30:0x007a, B:32:0x0088, B:36:0x00ad, B:38:0x00b7, B:34:0x009f, B:54:0x0116, B:55:0x011b, B:56:0x011c), top: B:63:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:52:0x010d A[Catch: all -> 0x011e, TryCatch #0 {, blocks: (B:12:0x001c, B:14:0x0020, B:16:0x0026, B:18:0x003d, B:20:0x0049, B:22:0x0052, B:24:0x0064, B:26:0x006f, B:25:0x0069, B:47:0x00e4, B:49:0x00f4, B:51:0x010a, B:52:0x010d, B:53:0x0111, B:41:0x00be, B:43:0x00da, B:46:0x00e2, B:28:0x0074, B:30:0x007a, B:32:0x0088, B:36:0x00ad, B:38:0x00b7, B:34:0x009f, B:54:0x0116, B:55:0x011b, B:56:0x011c), top: B:63:0x001c }] */
    public final T e() {
        a6 a6VarB;
        Object objA;
        T tA;
        String strC;
        v6<e6> v6VarZza;
        String strA;
        if (!this.f && this.b == null) {
            throw new NullPointerException("flagName must not be null");
        }
        int i2 = f1102i.get();
        if (this.d < i2) {
            synchronized (this) {
                if (this.d < i2) {
                    o6 o6Var = f1101h;
                    if (o6Var == null) {
                        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                    }
                    n6 n6Var = this.a;
                    boolean z = n6Var.f;
                    boolean z2 = n6Var.f1083g;
                    String strC2 = d6.b(o6Var.a()).a("gms:phenotype:phenotype_flag:debug_bypass_phenotype");
                    if (strC2 == null || !q5.c.matcher(strC2).matches()) {
                        if (this.a.b == null) {
                            Context contextA = o6Var.a();
                            String str = this.a.a;
                            a6VarB = q6.b(contextA, null);
                        } else if (f6.a(o6Var.a(), this.a.b)) {
                            boolean z3 = this.a.f1084h;
                            a6VarB = w5.b(o6Var.a().getContentResolver(), this.a.b);
                        } else {
                            a6VarB = null;
                        }
                        if (a6VarB != null && (objA = a6VarB.a(d())) != null) {
                            tA = a(objA);
                        }
                        if (tA != null) {
                            n6 n6Var2 = this.a;
                            boolean z4 = n6Var2.e;
                            u6<Context, Boolean> u6Var = n6Var2.f1085i;
                            d6 d6VarB = d6.b(o6Var.a());
                            n6 n6Var3 = this.a;
                            boolean z5 = n6Var3.e;
                            String str2 = n6Var3.c;
                            strC = d6VarB.a(this.b);
                            if (strC != null) {
                                tA = a(strC);
                            } else {
                                tA = null;
                            }
                            if (tA == null) {
                                tA = this.c;
                            }
                        }
                        v6VarZza = o6Var.b().zza();
                        if (v6VarZza.a()) {
                            e6 e6VarB = v6VarZza.b();
                            n6 n6Var4 = this.a;
                            Uri uri = n6Var4.b;
                            String str3 = n6Var4.a;
                            strA = e6VarB.a(uri, null, n6Var4.d, this.b);
                            if (strA == null) {
                                tA = this.c;
                            } else {
                                tA = a(strA);
                            }
                        }
                        this.e = tA;
                        this.d = i2;
                    } else if (Log.isLoggable("PhenotypeFlag", 3)) {
                        String strValueOf = String.valueOf(d());
                        Log.d("PhenotypeFlag", strValueOf.length() != 0 ? "Bypass reading Phenotype values for flag: ".concat(strValueOf) : new String("Bypass reading Phenotype values for flag: "));
                    }
                    tA = null;
                    if (tA != null) {
                        n6 n6Var5 = this.a;
                        boolean z6 = n6Var5.e;
                        u6<Context, Boolean> u6Var2 = n6Var5.f1085i;
                        d6 d6VarB2 = d6.b(o6Var.a());
                        n6 n6Var6 = this.a;
                        boolean z7 = n6Var6.e;
                        String str4 = n6Var6.c;
                        strC = d6VarB2.a(this.b);
                        if (strC != null) {
                            tA = a(strC);
                        } else {
                            tA = null;
                        }
                        if (tA == null) {
                            tA = this.c;
                        }
                    }
                    v6VarZza = o6Var.b().zza();
                    if (v6VarZza.a()) {
                        e6 e6VarB2 = v6VarZza.b();
                        n6 n6Var7 = this.a;
                        Uri uri2 = n6Var7.b;
                        String str5 = n6Var7.a;
                        strA = e6VarB2.a(uri2, null, n6Var7.d, this.b);
                        if (strA == null) {
                            tA = this.c;
                        } else {
                            tA = a(strA);
                        }
                    }
                    this.e = tA;
                    this.d = i2;
                }
            }
        }
        return this.e;
    }
}
