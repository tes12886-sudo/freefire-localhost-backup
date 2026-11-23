package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final g c = new g(null, null);
    private final Boolean a;
    private final Boolean b;

    public g(Boolean bool, Boolean bool2) {
        this.a = bool;
        this.b = bool2;
    }

    public static String a(Bundle bundle) {
        String string = bundle.getString("ad_storage");
        if (string != null && o(string) == null) {
            return string;
        }
        String string2 = bundle.getString("analytics_storage");
        if (string2 == null || o(string2) != null) {
            return null;
        }
        return string2;
    }

    public static g b(Bundle bundle) {
        return bundle == null ? c : new g(o(bundle.getString("ad_storage")), o(bundle.getString("analytics_storage")));
    }

    public static g c(String str) {
        Boolean boolP;
        Boolean bool = null;
        if (str != null) {
            Boolean boolP2 = str.length() >= 3 ? p(str.charAt(2)) : null;
            boolP = str.length() >= 4 ? p(str.charAt(3)) : null;
            bool = boolP2;
        } else {
            boolP = null;
        }
        return new g(bool, boolP);
    }

    static Boolean j(Boolean bool, Boolean bool2) {
        if (bool == null) {
            return bool2;
        }
        if (bool2 == null) {
            return bool;
        }
        boolean z = false;
        if (bool.booleanValue() && bool2.booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static boolean m(int i2, int i3) {
        return i2 <= i3;
    }

    static final int n(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    private static Boolean o(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    private static Boolean p(char c2) {
        if (c2 == '0') {
            return Boolean.FALSE;
        }
        if (c2 != '1') {
            return null;
        }
        return Boolean.TRUE;
    }

    private static final char q(Boolean bool) {
        if (bool == null) {
            return '-';
        }
        return bool.booleanValue() ? '1' : '0';
    }

    public final String d() {
        return "G1" + q(this.a) + q(this.b);
    }

    public final Boolean e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return n(this.a) == n(gVar.a) && n(this.b) == n(gVar.b);
    }

    public final boolean f() {
        Boolean bool = this.a;
        return bool == null || bool.booleanValue();
    }

    public final Boolean g() {
        return this.b;
    }

    public final boolean h() {
        Boolean bool = this.b;
        return bool == null || bool.booleanValue();
    }

    public final int hashCode() {
        return ((n(this.a) + 527) * 31) + n(this.b);
    }

    public final boolean i(g gVar) {
        Boolean bool = this.a;
        Boolean bool2 = Boolean.FALSE;
        if (bool != bool2 || gVar.a == bool2) {
            return this.b == bool2 && gVar.b != bool2;
        }
        return true;
    }

    public final g k(g gVar) {
        return new g(j(this.a, gVar.a), j(this.b, gVar.b));
    }

    public final g l(g gVar) {
        Boolean bool = this.a;
        if (bool == null) {
            bool = gVar.a;
        }
        Boolean bool2 = this.b;
        if (bool2 == null) {
            bool2 = gVar.b;
        }
        return new g(bool, bool2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConsentSettings: ");
        sb.append("adStorage=");
        Boolean bool = this.a;
        if (bool == null) {
            sb.append("uninitialized");
        } else {
            sb.append(true != bool.booleanValue() ? "denied" : "granted");
        }
        sb.append(", analyticsStorage=");
        Boolean bool2 = this.b;
        if (bool2 == null) {
            sb.append("uninitialized");
        } else {
            sb.append(true == bool2.booleanValue() ? "granted" : "denied");
        }
        return sb.toString();
    }
}
