package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes.dex */
public final class r3 extends v5 {
    private char c;
    private long d;
    private String e;
    private final p3 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p3 f1256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p3 f1257h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final p3 f1258i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p3 f1259j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final p3 f1260k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final p3 f1261l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final p3 f1262m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final p3 f1263n;

    r3(a5 a5Var) {
        super(a5Var);
        this.c = (char) 0;
        this.d = -1L;
        this.f = new p3(this, 6, false, false);
        this.f1256g = new p3(this, 6, true, false);
        this.f1257h = new p3(this, 6, false, true);
        this.f1258i = new p3(this, 5, false, false);
        this.f1259j = new p3(this, 5, true, false);
        this.f1260k = new p3(this, 5, false, true);
        this.f1261l = new p3(this, 4, false, false);
        this.f1262m = new p3(this, 3, false, false);
        this.f1263n = new p3(this, 2, false, false);
    }

    static String A(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String strB = B(z, obj);
        String strB2 = B(z, obj2);
        String strB3 = B(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strB)) {
            sb.append(str2);
            sb.append(strB);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strB2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strB2);
        }
        if (!TextUtils.isEmpty(strB3)) {
            sb.append(str3);
            sb.append(strB3);
        }
        return sb.toString();
    }

    static String B(boolean z, Object obj) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l2 = (Long) obj;
            if (Math.abs(l2.longValue()) < 100) {
                return String.valueOf(obj);
            }
            String str = String.valueOf(obj).charAt(0) == '-' ? "-" : "";
            String strValueOf = String.valueOf(Math.abs(l2.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder(str.length() + 43 + str.length());
            sb.append(str);
            sb.append(jRound);
            sb.append("...");
            sb.append(str);
            sb.append(jRound2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof q3) {
                return ((q3) obj).a;
            }
            return z ? "-" : String.valueOf(obj);
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String strG = G(a5.class.getCanonicalName());
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && G(className).equals(strG)) {
                sb2.append(": ");
                sb2.append(stackTraceElement);
                break;
            }
        }
        return sb2.toString();
    }

    static /* synthetic */ long F(r3 r3Var, long j2) {
        r3Var.d = 42004L;
        return 42004L;
    }

    private static String G(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf == -1 ? str : str.substring(0, iLastIndexOf);
    }

    protected static Object x(String str) {
        if (str == null) {
            return null;
        }
        return new q3(str);
    }

    @Override // com.google.android.gms.measurement.internal.v5
    protected final boolean i() {
        return false;
    }

    public final p3 o() {
        return this.f;
    }

    public final p3 p() {
        return this.f1256g;
    }

    public final p3 q() {
        return this.f1257h;
    }

    public final p3 r() {
        return this.f1258i;
    }

    public final p3 s() {
        return this.f1259j;
    }

    public final p3 t() {
        return this.f1260k;
    }

    public final p3 u() {
        return this.f1261l;
    }

    public final p3 v() {
        return this.f1262m;
    }

    public final p3 w() {
        return this.f1263n;
    }

    protected final void y(int i2, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(z(), i2)) {
            Log.println(i2, z(), A(false, str, obj, obj2, obj3));
        }
        if (z2 || i2 < 5) {
            return;
        }
        com.google.android.gms.common.internal.q.k(str);
        x4 x4VarE = this.a.E();
        if (x4VarE == null) {
            Log.println(6, z(), "Scheduler not set. Not logging error/warn");
        } else if (x4VarE.k()) {
            x4VarE.r(new o3(this, i2 >= 9 ? 8 : i2, str, obj, obj2, obj3));
        } else {
            Log.println(6, z(), "Scheduler not initialized. Not logging error/warn");
        }
    }

    @EnsuresNonNull({"logTagDoNotUseDirectly"})
    protected final String z() {
        String str;
        synchronized (this) {
            if (this.e == null) {
                this.e = this.a.N() != null ? this.a.N() : this.a.z().l();
            }
            com.google.android.gms.common.internal.q.k(this.e);
            str = this.e;
        }
        return str;
    }
}
