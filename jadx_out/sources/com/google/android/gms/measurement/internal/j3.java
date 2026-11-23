package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.internal.measurement.Cif;
import com.google.android.gms.internal.measurement.td;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes.dex */
public final class j3 extends f4 {
    private String c;
    private String d;
    private int e;
    private String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f1226g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f1227h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<String> f1228i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f1229j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f1230k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f1231l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f1232m;

    j3(a5 a5Var, long j2) {
        super(a5Var);
        this.f1227h = j2;
    }

    @Override // com.google.android.gms.measurement.internal.f4
    protected final boolean m() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0242 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x020d  */
    /* JADX WARN: Code duplicated, block: B:87:0x0213  */
    /* JADX WARN: Code duplicated, block: B:88:0x0223  */
    /* JADX WARN: Code duplicated, block: B:91:0x022d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0242  */
    /* JADX WARN: Code duplicated, block: B:96:0x0246  */
    /* JADX WARN: Code duplicated, block: B:98:0x0253  */
    @Override // com.google.android.gms.measurement.internal.f4
    @EnsuresNonNull({"appId", "appStore", "appName", "gmpAppId", "gaAppId"})
    protected final void n() {
        String str;
        p3 p3VarW;
        String str2;
        List<String> listZ;
        Iterator<String> it;
        String strB;
        String packageName = this.a.c().getPackageName();
        PackageManager packageManager = this.a.c().getPackageManager();
        String str3 = "Unknown";
        int i2 = Integer.MIN_VALUE;
        String installerPackageName = "unknown";
        if (packageManager == null) {
            this.a.d().o().b("PackageManager is null, app identity information might be inaccurate. appId", r3.x(packageName));
        } else {
            try {
                installerPackageName = packageManager.getInstallerPackageName(packageName);
            } catch (IllegalArgumentException unused) {
                this.a.d().o().b("Error retrieving app installer package name. appId", r3.x(packageName));
            }
            if (installerPackageName == null) {
                installerPackageName = "manual_install";
            } else if (GoogleApiAvailabilityLight.GOOGLE_PLAY_STORE_PACKAGE.equals(installerPackageName)) {
                installerPackageName = "";
            }
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(this.a.c().getPackageName(), 0);
                if (packageInfo != null) {
                    CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                    String string = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : "Unknown";
                    try {
                        str3 = packageInfo.versionName;
                        i2 = packageInfo.versionCode;
                    } catch (PackageManager.NameNotFoundException unused2) {
                        str = str3;
                        str3 = string;
                        this.a.d().o().c("Error retrieving package info. appId, appName", r3.x(packageName), str3);
                        str3 = str;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused3) {
                str = "Unknown";
            }
        }
        this.c = packageName;
        this.f = installerPackageName;
        this.d = str3;
        this.e = i2;
        this.f1226g = 0L;
        boolean z = !TextUtils.isEmpty(this.a.L()) && "am".equals(this.a.M());
        int iL = this.a.l();
        r3 r3VarD = this.a.d();
        switch (iL) {
            case 0:
                p3VarW = r3VarD.w();
                str2 = "App measurement collection enabled";
                break;
            case 1:
                p3VarW = r3VarD.u();
                str2 = "App measurement deactivated via the manifest";
                break;
            case 2:
                p3VarW = r3VarD.w();
                str2 = "App measurement deactivated via the init parameters";
                break;
            case 3:
                p3VarW = r3VarD.u();
                str2 = "App measurement disabled by setAnalyticsCollectionEnabled(false)";
                break;
            case 4:
                p3VarW = r3VarD.u();
                str2 = "App measurement disabled via the manifest";
                break;
            case 5:
                p3VarW = r3VarD.w();
                str2 = "App measurement disabled via the init parameters";
                break;
            case 6:
                p3VarW = r3VarD.t();
                str2 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics";
                break;
            case 7:
                p3VarW = r3VarD.u();
                str2 = "App measurement disabled via the global data collection setting";
                break;
            default:
                p3VarW = r3VarD.u();
                str2 = "App measurement disabled due to denied storage consent";
                break;
        }
        p3VarW.a(str2);
        this.f1230k = "";
        this.f1231l = "";
        this.f1232m = "";
        this.a.a();
        if (z) {
            this.f1231l = this.a.L();
        }
        try {
            String strA = j7.a(this.a.c(), "google_app_id", this.a.P());
            this.f1230k = true != TextUtils.isEmpty(strA) ? strA : "";
            td.a();
            if (!this.a.z().w(null, f3.h0)) {
                if (!TextUtils.isEmpty(strA)) {
                    Context contextC = this.a.c();
                    String strP = this.a.P();
                    com.google.android.gms.common.internal.q.k(contextC);
                    Resources resources = contextC.getResources();
                    if (TextUtils.isEmpty(strP)) {
                        strP = t4.a(contextC);
                    }
                    strB = t4.b("admob_app_id", resources, strP);
                    this.f1231l = strB;
                }
                this.f1228i = null;
                this.a.a();
                listZ = this.a.z().z("analytics.safelisted_events");
                if (listZ == null) {
                    this.f1228i = listZ;
                } else if (listZ.size() == 0) {
                    this.a.d().t().a("Safelisted event list is empty. Ignoring");
                } else {
                    it = listZ.iterator();
                    do {
                        if (!it.hasNext()) {
                            this.f1228i = listZ;
                        }
                    } while (this.a.G().m0("safelisted event", it.next()));
                }
                if (packageManager != null) {
                    this.f1229j = com.google.android.gms.common.o.a.a(this.a.c()) ? 1 : 0;
                } else {
                    this.f1229j = 0;
                }
            }
            Context contextC2 = this.a.c();
            String strP2 = this.a.P();
            com.google.android.gms.common.internal.q.k(contextC2);
            Resources resources2 = contextC2.getResources();
            if (TextUtils.isEmpty(strP2)) {
                strP2 = t4.a(contextC2);
            }
            String strB2 = t4.b("ga_app_id", resources2, strP2);
            this.f1232m = true != TextUtils.isEmpty(strB2) ? strB2 : "";
            if (!TextUtils.isEmpty(strA) || !TextUtils.isEmpty(strB2)) {
                strB = t4.b("admob_app_id", resources2, strP2);
                this.f1231l = strB;
            }
            this.f1228i = null;
            this.a.a();
            listZ = this.a.z().z("analytics.safelisted_events");
            if (listZ == null) {
                this.f1228i = listZ;
            } else if (listZ.size() == 0) {
                this.a.d().t().a("Safelisted event list is empty. Ignoring");
            } else {
                it = listZ.iterator();
                do {
                    if (!it.hasNext()) {
                        this.f1228i = listZ;
                    }
                } while (this.a.G().m0("safelisted event", it.next()));
            }
            if (packageManager != null) {
                this.f1229j = com.google.android.gms.common.o.a.a(this.a.c()) ? 1 : 0;
            } else {
                this.f1229j = 0;
            }
            if (iL == 0) {
                this.a.d().w().c("App measurement enabled for app package, google app id", this.c, TextUtils.isEmpty(this.f1230k) ? this.f1231l : this.f1230k);
            }
        } catch (IllegalStateException e) {
            this.a.d().o().c("Fetching Google App Id failed with exception. appId", r3.x(packageName), e);
        }
        this.f1228i = null;
        this.a.a();
        listZ = this.a.z().z("analytics.safelisted_events");
        if (listZ == null) {
            this.f1228i = listZ;
        } else if (listZ.size() == 0) {
            this.a.d().t().a("Safelisted event list is empty. Ignoring");
        } else {
            it = listZ.iterator();
            do {
                if (!it.hasNext()) {
                    this.f1228i = listZ;
                }
            } while (this.a.G().m0("safelisted event", it.next()));
        }
        if (packageManager != null) {
            this.f1229j = com.google.android.gms.common.o.a.a(this.a.c()) ? 1 : 0;
        } else {
            this.f1229j = 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    final ja o(String str) {
        String str2;
        p3 p3VarS;
        String str3;
        long j2;
        h();
        String strP = p();
        String strQ = q();
        j();
        String str4 = this.d;
        j();
        long j3 = this.e;
        j();
        com.google.android.gms.common.internal.q.k(this.f);
        String str5 = this.f;
        this.a.z().p();
        j();
        h();
        long j4 = this.f1226g;
        long j5 = j4;
        if (j4 == 0) {
            ca caVarG = this.a.G();
            Context contextC = this.a.c();
            String packageName = this.a.c().getPackageName();
            caVarG.h();
            com.google.android.gms.common.internal.q.k(contextC);
            com.google.android.gms.common.internal.q.g(packageName);
            PackageManager packageManager = contextC.getPackageManager();
            MessageDigest messageDigestB = ca.B();
            long j6 = -1;
            j6 = -1;
            if (messageDigestB == null) {
                caVarG.a.d().o().a("Could not get MD5 instance");
            } else {
                if (packageManager != null) {
                    try {
                        if (caVarG.K(contextC, packageName)) {
                            j6 = 0;
                            caVarG = caVarG;
                        } else {
                            Signature[] signatureArr = com.google.android.gms.common.o.c.a(contextC).e(caVarG.a.c().getPackageName(), 64).signatures;
                            if (signatureArr == null || signatureArr.length <= 0) {
                                caVarG.a.d().r().a("Could not get signatures");
                                caVarG = caVarG;
                            } else {
                                long jC = ca.C(messageDigestB.digest(signatureArr[0].toByteArray()));
                                j6 = jC;
                                caVarG = jC;
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        caVarG.a.d().o().b("Package name not found", e);
                        j2 = 0;
                    }
                }
                j2 = 0;
                this.f1226g = j2;
                j5 = j2;
            }
            j2 = j6;
            this.f1226g = j2;
            j5 = j2;
        }
        long j7 = j5;
        boolean zK = this.a.k();
        boolean z = !this.a.A().p;
        h();
        if (this.a.k()) {
            Cif.a();
            if (this.a.z().w(null, f3.j0)) {
                this.a.d().w().a("Disabled IID for tests.");
            } else {
                try {
                    Class<?> clsLoadClass = this.a.c().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                    if (clsLoadClass != null) {
                        try {
                            Object objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, this.a.c());
                            if (objInvoke == null) {
                                str2 = null;
                            } else {
                                try {
                                    str2 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(objInvoke, new Object[0]);
                                } catch (Exception unused) {
                                    p3VarS = this.a.d().t();
                                    str3 = "Failed to retrieve Firebase Instance Id";
                                    p3VarS.a(str3);
                                    str2 = null;
                                }
                            }
                        } catch (Exception unused2) {
                            p3VarS = this.a.d().s();
                            str3 = "Failed to obtain Firebase Analytics instance";
                        }
                    }
                } catch (ClassNotFoundException unused3) {
                }
            }
            str2 = null;
        } else {
            str2 = null;
        }
        a5 a5Var = this.a;
        long jA = a5Var.A().e.a();
        long jMin = jA == 0 ? a5Var.H : Math.min(a5Var.H, jA);
        j();
        int i2 = this.f1229j;
        boolean zB = this.a.z().B();
        h4 h4VarA = this.a.A();
        h4VarA.h();
        boolean z2 = h4VarA.p().getBoolean("deferred_analytics_collection", false);
        j();
        String str6 = this.f1231l;
        Boolean boolY = this.a.z().y("google_analytics_default_allow_ad_personalization_signals");
        Boolean boolValueOf = boolY == null ? null : Boolean.valueOf(!boolY.booleanValue());
        long j8 = this.f1227h;
        List<String> list = this.f1228i;
        td.a();
        return new ja(strP, strQ, str4, j3, str5, 42004L, j7, str, zK, z, str2, 0L, jMin, i2, zB, z2, str6, boolValueOf, j8, list, this.a.z().w(null, f3.h0) ? s() : null, this.a.A().t().d());
    }

    final String p() {
        j();
        com.google.android.gms.common.internal.q.k(this.c);
        return this.c;
    }

    final String q() {
        j();
        com.google.android.gms.common.internal.q.k(this.f1230k);
        return this.f1230k;
    }

    final String r() {
        j();
        return this.f1231l;
    }

    final String s() {
        j();
        com.google.android.gms.common.internal.q.k(this.f1232m);
        return this.f1232m;
    }

    final int t() {
        j();
        return this.e;
    }

    final int u() {
        j();
        return this.f1229j;
    }

    final List<String> v() {
        return this.f1228i;
    }
}
