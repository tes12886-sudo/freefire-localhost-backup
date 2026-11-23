package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class r7 extends f4 {
    private volatile k7 c;
    private k7 d;
    protected k7 e;
    private final Map<Activity, k7> f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Activity f1264g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f1265h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile k7 f1266i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private k7 f1267j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f1268k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Object f1269l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f1270m;

    public r7(a5 a5Var) {
        super(a5Var);
        this.f1269l = new Object();
        this.f = new ConcurrentHashMap();
    }

    static /* synthetic */ void E(r7 r7Var, Bundle bundle, k7 k7Var, k7 k7Var2, long j2) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        r7Var.p(k7Var, k7Var2, j2, true, r7Var.a.G().t(null, "screen_view", bundle, null, true));
    }

    static /* synthetic */ k7 I(r7 r7Var, k7 k7Var) {
        r7Var.f1267j = null;
        return null;
    }

    private final void o(Activity activity, k7 k7Var, boolean z) {
        k7 k7Var2;
        k7 k7Var3 = this.c == null ? this.d : this.c;
        if (k7Var.b == null) {
            k7Var2 = new k7(k7Var.a, activity != null ? t(activity.getClass(), "Activity") : null, k7Var.c, k7Var.e, k7Var.f);
        } else {
            k7Var2 = k7Var;
        }
        this.d = this.c;
        this.c = k7Var2;
        this.a.f().r(new m7(this, k7Var2, k7Var3, this.a.e().c(), z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:53:0x00e2  */
    public final void p(k7 k7Var, k7 k7Var2, long j2, boolean z, Bundle bundle) {
        d7 d7VarF;
        long jA;
        h();
        boolean z2 = false;
        if (z && this.e != null) {
            z2 = true;
        }
        if (z2) {
            q(this.e, true, j2);
        }
        if (k7Var2 == null || k7Var2.c != k7Var.c || !ca.G(k7Var2.b, k7Var.b) || !ca.G(k7Var2.a, k7Var.a)) {
            Bundle bundle2 = new Bundle();
            f fVarZ = this.a.z();
            d3<Boolean> d3Var = f3.s0;
            if (fVarZ.w(null, d3Var)) {
                bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            }
            x(k7Var, bundle2, true);
            if (k7Var2 != null) {
                String str = k7Var2.a;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = k7Var2.b;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", k7Var2.c);
            }
            if (z2) {
                e9 e9Var = this.a.C().e;
                long j3 = j2 - e9Var.b;
                e9Var.b = j2;
                if (j3 > 0) {
                    this.a.G().Q(bundle2, j3);
                }
            }
            String str3 = "auto";
            if (this.a.z().w(null, d3Var)) {
                if (!this.a.z().C()) {
                    bundle2.putLong("_mst", 1L);
                }
                if (true == k7Var.e) {
                    str3 = "app";
                }
            }
            if (this.a.z().w(null, d3Var)) {
                long jA2 = this.a.e().a();
                if (k7Var.e) {
                    long j4 = k7Var.f;
                    if (j4 != 0) {
                        jA = j4;
                    } else {
                        jA = jA2;
                    }
                } else {
                    jA = jA2;
                }
                d7VarF = this.a.F();
            } else {
                d7VarF = this.a.F();
                a5 a5Var = d7VarF.a;
                d7VarF.h();
                jA = d7VarF.a.e().a();
            }
            d7VarF.Y(str3, "_vs", jA, bundle2);
        }
        this.e = k7Var;
        if (this.a.z().w(null, f3.s0) && k7Var.e) {
            this.f1267j = k7Var;
        }
        this.a.R().W(k7Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(k7 k7Var, boolean z, long j2) {
        this.a.g().k(this.a.e().c());
        if (!this.a.C().e.d(k7Var != null && k7Var.d, z, j2) || k7Var == null) {
            return;
        }
        k7Var.d = false;
    }

    private final k7 r(Activity activity) {
        com.google.android.gms.common.internal.q.k(activity);
        k7 k7Var = this.f.get(activity);
        if (k7Var == null) {
            k7 k7Var2 = new k7(null, t(activity.getClass(), "Activity"), this.a.G().h0());
            this.f.put(activity, k7Var2);
            k7Var = k7Var2;
        }
        return (this.a.z().w(null, f3.s0) && this.f1266i != null) ? this.f1266i : k7Var;
    }

    public static void x(k7 k7Var, Bundle bundle, boolean z) {
        if (k7Var != null) {
            if (!bundle.containsKey("_sc") || z) {
                String str = k7Var.a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = k7Var.b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", k7Var.c);
                return;
            }
            z = false;
        }
        if (k7Var == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public final void A(Activity activity) {
        if (this.a.z().w(null, f3.s0)) {
            synchronized (this.f1269l) {
                this.f1268k = true;
                if (activity != this.f1264g) {
                    synchronized (this.f1269l) {
                        this.f1264g = activity;
                        this.f1265h = false;
                    }
                    if (this.a.z().w(null, f3.r0) && this.a.z().C()) {
                        this.f1266i = null;
                        this.a.f().r(new q7(this));
                    }
                }
            }
        }
        if (this.a.z().w(null, f3.r0) && !this.a.z().C()) {
            this.c = this.f1266i;
            this.a.f().r(new n7(this));
        } else {
            o(activity, r(activity), false);
            d2 d2VarG = this.a.g();
            d2VarG.a.f().r(new c1(d2VarG, d2VarG.a.e().c()));
        }
    }

    public final void B(Activity activity) {
        if (this.a.z().w(null, f3.s0)) {
            synchronized (this.f1269l) {
                this.f1268k = false;
                this.f1265h = true;
            }
        }
        long jC = this.a.e().c();
        if (this.a.z().w(null, f3.r0) && !this.a.z().C()) {
            this.c = null;
            this.a.f().r(new o7(this, jC));
        } else {
            k7 k7VarR = r(activity);
            this.d = this.c;
            this.c = null;
            this.a.f().r(new p7(this, k7VarR, jC));
        }
    }

    public final void C(Activity activity, Bundle bundle) {
        k7 k7Var;
        if (!this.a.z().C() || bundle == null || (k7Var = this.f.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", k7Var.c);
        bundle2.putString("name", k7Var.a);
        bundle2.putString("referrer_name", k7Var.b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public final void D(Activity activity) {
        synchronized (this.f1269l) {
            if (activity == this.f1264g) {
                this.f1264g = null;
            }
        }
        if (this.a.z().C()) {
            this.f.remove(activity);
        }
    }

    @Override // com.google.android.gms.measurement.internal.f4
    protected final boolean m() {
        return false;
    }

    public final k7 s(boolean z) {
        j();
        h();
        if (!this.a.z().w(null, f3.s0) || !z) {
            return this.e;
        }
        k7 k7Var = this.e;
        return k7Var != null ? k7Var : this.f1267j;
    }

    final String t(Class<?> cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] strArrSplit = canonicalName.split("\\.");
        int length = strArrSplit.length;
        String str2 = length > 0 ? strArrSplit[length - 1] : "";
        int length2 = str2.length();
        this.a.z();
        if (length2 <= 100) {
            return str2;
        }
        this.a.z();
        return str2.substring(0, 100);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r2 > 100) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        if (r4 > 100) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(Bundle bundle, long j2) {
        String strT;
        if (!this.a.z().w(null, f3.s0)) {
            this.a.d().t().a("Manual screen reporting is disabled.");
            return;
        }
        synchronized (this.f1269l) {
            if (!this.f1268k) {
                this.a.d().t().a("Cannot log screen view event when the app is in the background.");
                return;
            }
            String string = bundle.getString("screen_name");
            if (string != null) {
                if (string.length() > 0) {
                    int length = string.length();
                    this.a.z();
                }
                this.a.d().t().b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                return;
            }
            String string2 = bundle.getString("screen_class");
            if (string2 != null) {
                if (string2.length() > 0) {
                    int length2 = string2.length();
                    this.a.z();
                }
                this.a.d().t().b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                return;
            }
            if (string2 == null) {
                Activity activity = this.f1264g;
                strT = activity != null ? t(activity.getClass(), "Activity") : "Activity";
            } else {
                strT = string2;
            }
            k7 k7Var = this.c;
            if (this.f1265h && k7Var != null) {
                this.f1265h = false;
                boolean zG = ca.G(k7Var.b, strT);
                boolean zG2 = ca.G(k7Var.a, string);
                if (zG && zG2) {
                    this.a.d().t().a("Ignoring call to log screen view event with duplicate parameters.");
                    return;
                }
            }
            this.a.d().w().c("Logging screen view with name, class", string == null ? "null" : string, strT == null ? "null" : strT);
            k7 k7Var2 = this.c == null ? this.d : this.c;
            k7 k7Var3 = new k7(string, strT, this.a.G().h0(), true, j2);
            this.c = k7Var3;
            this.d = k7Var2;
            this.f1266i = k7Var3;
            this.a.f().r(new l7(this, bundle, k7Var3, k7Var2, this.a.e().c()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r1 <= 100) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b4, code lost:
    
        if (r1 <= 100) goto L39;
     */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(Activity activity, String str, String str2) {
        if (!this.a.z().C()) {
            this.a.d().t().a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        k7 k7Var = this.c;
        if (k7Var == null) {
            this.a.d().t().a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (this.f.get(activity) == null) {
            this.a.d().t().a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = t(activity.getClass(), "Activity");
        }
        boolean zG = ca.G(k7Var.b, str2);
        boolean zG2 = ca.G(k7Var.a, str);
        if (zG && zG2) {
            this.a.d().t().a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null) {
            if (str.length() > 0) {
                int length = str.length();
                this.a.z();
            }
            this.a.d().t().b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null) {
            if (str2.length() > 0) {
                int length2 = str2.length();
                this.a.z();
            }
            this.a.d().t().b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        this.a.d().w().c("Setting current screen to name, class", str == null ? "null" : str, str2);
        k7 k7Var2 = new k7(str, str2, this.a.G().h0());
        this.f.put(activity, k7Var2);
        o(activity, k7Var2, true);
    }

    public final k7 w() {
        return this.c;
    }

    public final void y(String str, k7 k7Var) {
        h();
        synchronized (this) {
            String str2 = this.f1270m;
            if (str2 == null || str2.equals(str) || k7Var != null) {
                this.f1270m = str;
            }
        }
    }

    public final void z(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.a.z().C() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f.put(activity, new k7(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }
}
