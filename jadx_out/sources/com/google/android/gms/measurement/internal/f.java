package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.de;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes.dex */
public final class f extends u5 {
    private Boolean b;
    private e c;
    private Boolean d;

    f(a5 a5Var) {
        super(a5Var);
        this.c = d.a;
    }

    public static final long I() {
        return f3.d.b(null).longValue();
    }

    public static final long i() {
        return f3.D.b(null).longValue();
    }

    private final String j(String str, String str2) {
        p3 p3VarO;
        String str3;
        try {
            String str4 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            com.google.android.gms.common.internal.q.k(str4);
            return str4;
        } catch (ClassNotFoundException e) {
            e = e;
            p3VarO = this.a.d().o();
            str3 = "Could not find SystemProperties class";
            p3VarO.b(str3, e);
            return "";
        } catch (IllegalAccessException e2) {
            e = e2;
            p3VarO = this.a.d().o();
            str3 = "Could not access SystemProperties.get()";
            p3VarO.b(str3, e);
            return "";
        } catch (NoSuchMethodException e3) {
            e = e3;
            p3VarO = this.a.d().o();
            str3 = "Could not find SystemProperties.get() method";
            p3VarO.b(str3, e);
            return "";
        } catch (InvocationTargetException e4) {
            e = e4;
            p3VarO = this.a.d().o();
            str3 = "SystemProperties.get() threw an exception";
            p3VarO.b(str3, e);
            return "";
        }
    }

    public final boolean A() {
        this.a.a();
        Boolean boolY = y("firebase_analytics_collection_deactivated");
        return boolY != null && boolY.booleanValue();
    }

    public final boolean B() {
        Boolean boolY = y("google_analytics_adid_collection_enabled");
        return boolY == null || boolY.booleanValue();
    }

    public final boolean C() {
        Boolean boolY;
        de.a();
        return !w(null, f3.r0) || (boolY = y("google_analytics_automatic_screen_reporting_enabled")) == null || boolY.booleanValue();
    }

    public final String D() {
        return j("debug.firebase.analytics.app", "");
    }

    public final String E() {
        return j("debug.deferred.deeplink", "");
    }

    public final boolean F(String str) {
        return "1".equals(this.c.b(str, "gaia_collection_enabled"));
    }

    public final boolean G(String str) {
        return "1".equals(this.c.b(str, "measurement.event_sampling_enabled"));
    }

    final boolean H() {
        if (this.b == null) {
            Boolean boolY = y("app_measurement_lite");
            this.b = boolY;
            if (boolY == null) {
                this.b = Boolean.FALSE;
            }
        }
        return this.b.booleanValue() || !this.a.O();
    }

    final void k(e eVar) {
        this.c = eVar;
    }

    final String l() {
        this.a.a();
        return "FA";
    }

    public final int m() {
        ca caVarG = this.a.G();
        Boolean boolQ = caVarG.a.R().q();
        if (caVarG.N() < 201500) {
            return (boolQ == null || boolQ.booleanValue()) ? 25 : 100;
        }
        return 100;
    }

    public final int n(String str) {
        return u(str, f3.I, 25, 100);
    }

    final int o(String str) {
        return u(str, f3.H, 500, 2000);
    }

    public final long p() {
        this.a.a();
        return 42004L;
    }

    @EnsuresNonNull({"this.isMainProcess"})
    public final boolean q() {
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    ApplicationInfo applicationInfo = this.a.c().getApplicationInfo();
                    String strA = com.google.android.gms.common.util.m.a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z = false;
                        if (str != null && str.equals(strA)) {
                            z = true;
                        }
                        this.d = Boolean.valueOf(z);
                    }
                    if (this.d == null) {
                        this.d = Boolean.TRUE;
                        this.a.d().o().a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.d.booleanValue();
    }

    public final String r(String str, d3<String> d3Var) {
        return d3Var.b(str == null ? null : this.c.b(str, d3Var.a()));
    }

    public final long s(String str, d3<Long> d3Var) {
        if (str != null) {
            String strB = this.c.b(str, d3Var.a());
            if (!TextUtils.isEmpty(strB)) {
                try {
                    return d3Var.b(Long.valueOf(Long.parseLong(strB))).longValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return d3Var.b(null).longValue();
    }

    public final int t(String str, d3<Integer> d3Var) {
        if (str != null) {
            String strB = this.c.b(str, d3Var.a());
            if (!TextUtils.isEmpty(strB)) {
                try {
                    return d3Var.b(Integer.valueOf(Integer.parseInt(strB))).intValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return d3Var.b(null).intValue();
    }

    public final int u(String str, d3<Integer> d3Var, int i2, int i3) {
        return Math.max(Math.min(t(str, d3Var), i3), i2);
    }

    public final double v(String str, d3<Double> d3Var) {
        if (str != null) {
            String strB = this.c.b(str, d3Var.a());
            if (!TextUtils.isEmpty(strB)) {
                try {
                    return d3Var.b(Double.valueOf(Double.parseDouble(strB))).doubleValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return d3Var.b(null).doubleValue();
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    public final boolean w(String str, d3<Boolean> d3Var) {
        Boolean boolB;
        if (str == null) {
            boolB = d3Var.b(null);
        } else {
            String strB = this.c.b(str, d3Var.a());
            if (TextUtils.isEmpty(strB)) {
                boolB = d3Var.b(null);
            } else {
                boolB = d3Var.b(Boolean.valueOf(Boolean.parseBoolean(strB)));
            }
        }
        return boolB.booleanValue();
    }

    final Bundle x() {
        try {
            if (this.a.c().getPackageManager() == null) {
                this.a.d().o().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoC = com.google.android.gms.common.o.c.a(this.a.c()).c(this.a.c().getPackageName(), 128);
            if (applicationInfoC != null) {
                return applicationInfoC.metaData;
            }
            this.a.d().o().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            this.a.d().o().b("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    final Boolean y(String str) {
        com.google.android.gms.common.internal.q.g(str);
        Bundle bundleX = x();
        if (bundleX == null) {
            this.a.d().o().a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleX.containsKey(str)) {
            return Boolean.valueOf(bundleX.getBoolean(str));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0042 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0043 A[Catch: NotFoundException -> 0x0048, TRY_LEAVE, TryCatch #0 {NotFoundException -> 0x0048, blocks: (B:11:0x002e, B:14:0x0043), top: B:19:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:19:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    final List<String> z(String str) {
        Integer numValueOf;
        String[] stringArray;
        com.google.android.gms.common.internal.q.g("analytics.safelisted_events");
        Bundle bundleX = x();
        if (bundleX != null) {
            if (bundleX.containsKey("analytics.safelisted_events")) {
                numValueOf = Integer.valueOf(bundleX.getInt("analytics.safelisted_events"));
            }
            if (numValueOf != null) {
                try {
                    stringArray = this.a.c().getResources().getStringArray(numValueOf.intValue());
                    if (stringArray == null) {
                        return null;
                    }
                    return Arrays.asList(stringArray);
                } catch (Resources.NotFoundException e) {
                    this.a.d().o().b("Failed to load string array from metadata: resource not found", e);
                }
            }
            return null;
        }
        this.a.d().o().a("Failed to load metadata: Metadata bundle is null");
        numValueOf = null;
        if (numValueOf != null) {
            stringArray = this.a.c().getResources().getStringArray(numValueOf.intValue());
            if (stringArray == null) {
                return null;
            }
            return Arrays.asList(stringArray);
        }
        return null;
    }
}
