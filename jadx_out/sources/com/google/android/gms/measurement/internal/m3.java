package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class m3 extends v5 {
    protected static final AtomicReference<String[]> c = new AtomicReference<>();
    protected static final AtomicReference<String[]> d = new AtomicReference<>();
    protected static final AtomicReference<String[]> e = new AtomicReference<>();

    m3(a5 a5Var) {
        super(a5Var);
    }

    private static final String u(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        com.google.android.gms.common.internal.q.k(strArr);
        com.google.android.gms.common.internal.q.k(strArr2);
        com.google.android.gms.common.internal.q.k(atomicReference);
        com.google.android.gms.common.internal.q.a(strArr.length == strArr2.length);
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (ca.G(str, strArr[i2])) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i2];
                    if (str2 == null) {
                        str2 = strArr2[i2] + "(" + strArr[i2] + ")";
                        strArr3[i2] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    @Override // com.google.android.gms.measurement.internal.v5
    protected final boolean i() {
        return false;
    }

    protected final boolean o() {
        this.a.a();
        return this.a.K() && Log.isLoggable(this.a.d().z(), 3);
    }

    protected final String p(String str) {
        if (str == null) {
            return null;
        }
        return !o() ? str : u(str, y5.c, y5.a, c);
    }

    protected final String q(String str) {
        if (str == null) {
            return null;
        }
        return !o() ? str : u(str, z5.b, z5.a, d);
    }

    protected final String r(String str) {
        if (str == null) {
            return null;
        }
        if (!o()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return u(str, a6.b, a6.a, e);
        }
        return "experiment_id(" + str + ")";
    }

    protected final String s(Bundle bundle) {
        String strT;
        if (bundle == null) {
            return null;
        }
        if (!o()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(q(str));
            sb.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                strT = t(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strT = t((Object[]) obj);
            } else {
                strT = obj instanceof ArrayList ? t(((ArrayList) obj).toArray()) : String.valueOf(obj);
            }
            sb.append(strT);
        }
        sb.append("}]");
        return sb.toString();
    }

    protected final String t(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            String strS = obj instanceof Bundle ? s((Bundle) obj) : String.valueOf(obj);
            if (strS != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(strS);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
