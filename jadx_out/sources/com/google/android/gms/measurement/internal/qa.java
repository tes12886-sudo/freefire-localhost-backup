package com.google.android.gms.measurement.internal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes.dex */
abstract class qa {
    final String a;
    final int b;
    Boolean c;
    Boolean d;
    Long e;
    Long f;

    qa(String str, int i2) {
        this.a = str;
        this.b = i2;
    }

    private static Boolean d(String str, com.google.android.gms.internal.measurement.s3 s3Var, boolean z, String str2, List<String> list, String str3, r3 r3Var) {
        boolean zStartsWith;
        if (s3Var == com.google.android.gms.internal.measurement.s3.IN_LIST) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && s3Var != com.google.android.gms.internal.measurement.s3.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        com.google.android.gms.internal.measurement.m3 m3Var = com.google.android.gms.internal.measurement.m3.UNKNOWN_COMPARISON_TYPE;
        switch (s3Var.ordinal()) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, true != z ? 66 : 0).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (r3Var != null) {
                        r3Var.r().b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                zStartsWith = str.startsWith(str2);
                break;
            case 3:
                zStartsWith = str.endsWith(str2);
                break;
            case 4:
                zStartsWith = str.contains(str2);
                break;
            case 5:
                zStartsWith = str.equals(str2);
                break;
            case 6:
                if (list == null) {
                    return null;
                }
                zStartsWith = list.contains(str);
                break;
            default:
                return null;
        }
        return Boolean.valueOf(zStartsWith);
    }

    static Boolean e(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    static Boolean f(String str, com.google.android.gms.internal.measurement.t3 t3Var, r3 r3Var) {
        List<String> list;
        com.google.android.gms.common.internal.q.k(t3Var);
        if (str == null || !t3Var.x() || t3Var.y() == com.google.android.gms.internal.measurement.s3.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        com.google.android.gms.internal.measurement.s3 s3VarY = t3Var.y();
        com.google.android.gms.internal.measurement.s3 s3Var = com.google.android.gms.internal.measurement.s3.IN_LIST;
        if (s3VarY == s3Var) {
            if (t3Var.E() == 0) {
                return null;
            }
        } else if (!t3Var.z()) {
            return null;
        }
        com.google.android.gms.internal.measurement.s3 s3VarY2 = t3Var.y();
        boolean zC = t3Var.C();
        String strA = (zC || s3VarY2 == com.google.android.gms.internal.measurement.s3.REGEXP || s3VarY2 == s3Var) ? t3Var.A() : t3Var.A().toUpperCase(Locale.ENGLISH);
        if (t3Var.E() == 0) {
            list = null;
        } else {
            List<String> listD = t3Var.D();
            if (!zC) {
                ArrayList arrayList = new ArrayList(listD.size());
                Iterator<String> it = listD.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().toUpperCase(Locale.ENGLISH));
                }
                listD = Collections.unmodifiableList(arrayList);
            }
            list = listD;
        }
        return d(str, s3VarY2, zC, strA, list, s3VarY2 == com.google.android.gms.internal.measurement.s3.REGEXP ? strA : null, r3Var);
    }

    static Boolean g(long j2, com.google.android.gms.internal.measurement.n3 n3Var) {
        try {
            return j(new BigDecimal(j2), n3Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean h(double d, com.google.android.gms.internal.measurement.n3 n3Var) {
        try {
            return j(new BigDecimal(d), n3Var, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean i(String str, com.google.android.gms.internal.measurement.n3 n3Var) {
        if (!x9.C(str)) {
            return null;
        }
        try {
            return j(new BigDecimal(str), n3Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00a9  */
    static Boolean j(BigDecimal bigDecimal, com.google.android.gms.internal.measurement.n3 n3Var, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        com.google.android.gms.common.internal.q.k(n3Var);
        if (n3Var.x() && n3Var.y() != com.google.android.gms.internal.measurement.m3.UNKNOWN_COMPARISON_TYPE) {
            com.google.android.gms.internal.measurement.m3 m3VarY = n3Var.y();
            com.google.android.gms.internal.measurement.m3 m3Var = com.google.android.gms.internal.measurement.m3.BETWEEN;
            if (m3VarY == m3Var) {
                if (!n3Var.D() || !n3Var.G()) {
                    return null;
                }
            } else if (!n3Var.B()) {
                return null;
            }
            com.google.android.gms.internal.measurement.m3 m3VarY2 = n3Var.y();
            if (n3Var.y() == m3Var) {
                if (x9.C(n3Var.E()) && x9.C(n3Var.H())) {
                    try {
                        BigDecimal bigDecimal5 = new BigDecimal(n3Var.E());
                        bigDecimal4 = new BigDecimal(n3Var.H());
                        bigDecimal3 = bigDecimal5;
                        bigDecimal2 = null;
                    } catch (NumberFormatException unused) {
                    }
                }
                return null;
            }
            if (!x9.C(n3Var.C())) {
                return null;
            }
            try {
                bigDecimal2 = new BigDecimal(n3Var.C());
                bigDecimal3 = null;
                bigDecimal4 = null;
            } catch (NumberFormatException unused2) {
            }
            if (m3VarY2 == m3Var) {
                if (bigDecimal3 == null) {
                    return null;
                }
            } else if (bigDecimal2 == null) {
                return null;
            }
            com.google.android.gms.internal.measurement.s3 s3Var = com.google.android.gms.internal.measurement.s3.UNKNOWN_MATCH_TYPE;
            int iOrdinal = m3VarY2.ordinal();
            boolean z = true;
            if (iOrdinal == 1) {
                if (bigDecimal2 == null) {
                    return null;
                }
                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
            }
            if (iOrdinal == 2) {
                if (bigDecimal2 == null) {
                    return null;
                }
                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
            }
            if (iOrdinal != 3) {
                if (iOrdinal != 4 || bigDecimal3 == null) {
                    return null;
                }
                if (bigDecimal.compareTo(bigDecimal3) < 0 || bigDecimal.compareTo(bigDecimal4) > 0) {
                    z = false;
                }
            } else {
                if (bigDecimal2 == null) {
                    return null;
                }
                if (d == 0.0d ? bigDecimal.compareTo(bigDecimal2) != 0 : bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 || bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) >= 0) {
                    z = false;
                }
            }
            return Boolean.valueOf(z);
        }
        return null;
    }

    abstract int a();

    abstract boolean b();

    abstract boolean c();
}
