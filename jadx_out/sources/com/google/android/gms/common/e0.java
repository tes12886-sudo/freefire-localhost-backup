package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.a1;
import com.google.android.gms.common.internal.b1;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.errorprone.annotations.CheckReturnValue;
import java.security.MessageDigest;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
final class e0 {
    static final c0 a;
    static final c0 b;
    private static volatile b1 c;
    private static final Object d;
    private static Context e;

    static {
        new w(a0.o("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new x(a0.o("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        a = new y(a0.o("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        b = new z(a0.o("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        d = new Object();
    }

    static o0 a(String str, a0 a0Var, boolean z, boolean z2) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return f(str, a0Var, z, z2);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    static o0 b(String str, boolean z, boolean z2, boolean z3) {
        return g(str, z, false, false, true);
    }

    static /* synthetic */ String c(boolean z, String str, a0 a0Var) {
        String str2 = true != (!z && f(str, a0Var, true, false).a) ? "not allowed" : "debug cert rejected";
        MessageDigest messageDigestB = com.google.android.gms.common.util.a.b("SHA-256");
        com.google.android.gms.common.internal.q.k(messageDigestB);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, com.google.android.gms.common.util.j.a(messageDigestB.digest(a0Var.c1())), Boolean.valueOf(z), "12451000.false");
    }

    static synchronized void d(Context context) {
        if (e != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            e = context.getApplicationContext();
        }
    }

    static boolean e() {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                h();
                return c.a();
            } finally {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            }
        } catch (RemoteException | DynamiteModule.a e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return false;
        }
    }

    private static o0 f(final String str, final a0 a0Var, final boolean z, boolean z2) {
        try {
            h();
            com.google.android.gms.common.internal.q.k(e);
            try {
                return c.T(new j0(str, a0Var, z, z2), j.d.a.c.e.b.c1(e.getPackageManager())) ? o0.b() : new m0(new Callable() { // from class: com.google.android.gms.common.v
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return e0.c(z, str, a0Var);
                    }
                }, null);
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return o0.d("module call", e2);
            }
        } catch (DynamiteModule.a e3) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            return o0.d("module init: ".concat(String.valueOf(e3.getMessage())), e3);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder, j.d.a.c.e.a] */
    private static o0 g(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        String strConcat;
        o0 o0VarD;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            com.google.android.gms.common.internal.q.k(e);
            try {
                h();
                f0 f0Var = new f0(str, z, false, j.d.a.c.e.b.c1(e), false);
                try {
                    h0 h0VarU0 = z4 ? c.U0(f0Var) : c.s(f0Var);
                    if (h0VarU0.h()) {
                        o0VarD = o0.f(h0VarU0.j());
                    } else {
                        String strF = h0VarU0.f();
                        PackageManager.NameNotFoundException nameNotFoundException = h0VarU0.l() == 4 ? new PackageManager.NameNotFoundException() : null;
                        if (strF == null) {
                            strF = "error checking package certificate";
                        }
                        o0VarD = o0.g(h0VarU0.j(), h0VarU0.l(), strF, nameNotFoundException);
                    }
                } catch (RemoteException e2) {
                    e = e2;
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                    strConcat = "module call";
                    o0VarD = o0.d(strConcat, e);
                }
            } catch (DynamiteModule.a e3) {
                e = e3;
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                strConcat = "module init: ".concat(String.valueOf(e.getMessage()));
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return o0VarD;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }

    private static void h() {
        if (c != null) {
            return;
        }
        com.google.android.gms.common.internal.q.k(e);
        synchronized (d) {
            if (c == null) {
                c = a1.m(DynamiteModule.d(e, DynamiteModule.b, "com.google.android.gms.googlecertificates").c("com.google.android.gms.common.GoogleCertificatesImpl"));
            }
        }
    }
}
