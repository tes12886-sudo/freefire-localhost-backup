package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class u implements Iterable<q>, q {
    private final String a;

    public u(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.a = str;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final String b() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Double c() {
        double d;
        if (this.a.isEmpty()) {
            d = 0.0d;
        } else {
            try {
                return Double.valueOf(this.a);
            } catch (NumberFormatException unused) {
                d = Double.NaN;
            }
        }
        return Double.valueOf(d);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Boolean d() {
        return Boolean.valueOf(!this.a.isEmpty());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            return this.a.equals(((u) obj).a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Iterator<q> h() {
        return new s(this);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<q> iterator() {
        return new t(this);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q j() {
        return new u(this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v78 */
    /* JADX WARN: Type inference failed for: r0v79, types: [int] */
    @Override // com.google.android.gms.internal.measurement.q
    public final q q(String str, v4 v4Var, List<q> list) {
        String str2;
        String str3;
        String str4;
        byte b;
        u uVar;
        int i2;
        q iVar;
        double dMin;
        double dMin2;
        u uVar2;
        int i3;
        boolean z;
        v4 v4Var2;
        int i4;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str)) {
            str2 = "toLocaleUpperCase";
        } else {
            str2 = "toLocaleUpperCase";
            if (!str2.equals(str) && !"trim".equals(str)) {
                throw new IllegalArgumentException(String.format("%s is not a String function", str));
            }
        }
        switch (str.hashCode()) {
            case -1789698943:
                str3 = "charAt";
                str4 = "hasOwnProperty";
                if (str.equals(str4)) {
                    b = 2;
                } else {
                    b = -1;
                }
                break;
            case -1776922004:
                str3 = "charAt";
                if (str.equals("toString")) {
                    b = 14;
                    str4 = "hasOwnProperty";
                }
                str4 = "hasOwnProperty";
                b = -1;
                break;
            case -1464939364:
                str3 = "charAt";
                if (str.equals("toLocaleLowerCase")) {
                    b = 12;
                    str4 = "hasOwnProperty";
                }
                str4 = "hasOwnProperty";
                b = -1;
                break;
            case -1361633751:
                str3 = "charAt";
                if (str.equals(str3)) {
                    str4 = "hasOwnProperty";
                    b = 0;
                } else {
                    str4 = "hasOwnProperty";
                    b = -1;
                }
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    b = 1;
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    b = -1;
                }
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    b = 13;
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    b = -1;
                }
                break;
            case -906336856:
                if (str.equals("search")) {
                    b = 7;
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    b = -1;
                }
                break;
            case -726908483:
                if (str.equals(str2)) {
                    b = 11;
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    b = -1;
                }
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    b = 4;
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    b = -1;
                }
                break;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    b = 15;
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    b = -1;
                }
                break;
            case 3568674:
                if (str.equals("trim")) {
                    b = 16;
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    b = -1;
                }
                break;
            case 103668165:
                if (str.equals("match")) {
                    b = 5;
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    b = -1;
                }
                break;
            case 109526418:
                if (str.equals("slice")) {
                    b = 8;
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    b = -1;
                }
                break;
            case 109648666:
                if (str.equals("split")) {
                    b = 9;
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    b = -1;
                }
                break;
            case 530542161:
                if (str.equals("substring")) {
                    b = 10;
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    b = -1;
                }
                break;
            case 1094496948:
                if (str.equals("replace")) {
                    b = 6;
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    b = -1;
                }
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    b = 3;
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    b = -1;
                }
                break;
            default:
                str3 = "charAt";
                str4 = "hasOwnProperty";
                b = -1;
                break;
        }
        String strB = "undefined";
        String str5 = str3;
        switch (b) {
            case 0:
                v5.c(str5, 1, list);
                int i5 = list.size() > 0 ? (int) v5.i(v4Var.a(list.get(0)).c().doubleValue()) : 0;
                String str6 = this.a;
                return (i5 < 0 || i5 >= str6.length()) ? q.E : new u(String.valueOf(str6.charAt(i5)));
            case 1:
                uVar = this;
                if (list.size() != 0) {
                    StringBuilder sb = new StringBuilder(uVar.a);
                    for (int i6 = 0; i6 < list.size(); i6++) {
                        sb.append(v4Var.a(list.get(i6)).b());
                    }
                    return new u(sb.toString());
                }
                return uVar;
            case 2:
                v5.a(str4, 1, list);
                String str7 = this.a;
                q qVarA = v4Var.a(list.get(0));
                if (!"length".equals(qVarA.b())) {
                    double dDoubleValue = qVarA.c().doubleValue();
                    if (dDoubleValue != Math.floor(dDoubleValue) || (i2 = (int) dDoubleValue) < 0 || i2 >= str7.length()) {
                        return q.D;
                    }
                }
                return q.C;
            case 3:
                v5.c("indexOf", 2, list);
                iVar = new i(Double.valueOf(this.a.indexOf(list.size() > 0 ? v4Var.a(list.get(0)).b() : "undefined", (int) v5.i(list.size() < 2 ? 0.0d : v4Var.a(list.get(1)).c().doubleValue()))));
                return iVar;
            case 4:
                v5.c("lastIndexOf", 2, list);
                String str8 = this.a;
                String strB2 = list.size() > 0 ? v4Var.a(list.get(0)).b() : "undefined";
                double dDoubleValue2 = list.size() < 2 ? Double.NaN : v4Var.a(list.get(1)).c().doubleValue();
                return new i(Double.valueOf(str8.lastIndexOf(strB2, (int) (Double.isNaN(dDoubleValue2) ? Double.POSITIVE_INFINITY : v5.i(dDoubleValue2)))));
            case 5:
                v5.c("match", 1, list);
                Matcher matcher = Pattern.compile(list.size() > 0 ? v4Var.a(list.get(0)).b() : "").matcher(this.a);
                return matcher.find() ? new f(Arrays.asList(new u(matcher.group()))) : q.y;
            case 6:
                uVar = this;
                v5.c("replace", 2, list);
                q qVarA2 = q.x;
                if (list.size() > 0) {
                    strB = v4Var.a(list.get(0)).b();
                    if (list.size() > 1) {
                        qVarA2 = v4Var.a(list.get(1));
                    }
                }
                String str9 = strB;
                String str10 = uVar.a;
                int iIndexOf = str10.indexOf(str9);
                if (iIndexOf >= 0) {
                    if (qVarA2 instanceof j) {
                        qVarA2 = ((j) qVarA2).a(v4Var, Arrays.asList(new u(str9), new i(Double.valueOf(iIndexOf)), uVar));
                    }
                    String strSubstring = str10.substring(0, iIndexOf);
                    String strB3 = qVarA2.b();
                    String strSubstring2 = str10.substring(iIndexOf + str9.length());
                    StringBuilder sb2 = new StringBuilder(String.valueOf(strSubstring).length() + String.valueOf(strB3).length() + String.valueOf(strSubstring2).length());
                    sb2.append(strSubstring);
                    sb2.append(strB3);
                    sb2.append(strSubstring2);
                    iVar = new u(sb2.toString());
                    return iVar;
                }
                return uVar;
            case 7:
                v5.c("search", 1, list);
                Matcher matcher2 = Pattern.compile(list.size() > 0 ? v4Var.a(list.get(0)).b() : "undefined").matcher(this.a);
                return matcher2.find() ? new i(Double.valueOf(matcher2.start())) : new i(Double.valueOf(-1.0d));
            case 8:
                v5.c("slice", 2, list);
                String str11 = this.a;
                double dI = v5.i(list.size() > 0 ? v4Var.a(list.get(0)).c().doubleValue() : 0.0d);
                if (dI < 0.0d) {
                    double length = str11.length();
                    Double.isNaN(length);
                    dMin = Math.max(length + dI, 0.0d);
                } else {
                    dMin = Math.min(dI, str11.length());
                }
                int i7 = (int) dMin;
                double dI2 = v5.i(list.size() > 1 ? v4Var.a(list.get(1)).c().doubleValue() : str11.length());
                if (dI2 < 0.0d) {
                    double length2 = str11.length();
                    Double.isNaN(length2);
                    dMin2 = Math.max(length2 + dI2, 0.0d);
                } else {
                    dMin2 = Math.min(dI2, str11.length());
                }
                uVar2 = new u(str11.substring(i7, Math.max(0, ((int) dMin2) - i7) + i7));
                return uVar2;
            case 9:
                v5.c("split", 2, list);
                String str12 = this.a;
                if (str12.length() == 0) {
                    return new f(Arrays.asList(this));
                }
                ArrayList arrayList = new ArrayList();
                if (list.size() == 0) {
                    arrayList.add(this);
                } else {
                    String strB4 = v4Var.a(list.get(0)).b();
                    long jH = list.size() > 1 ? v5.h(v4Var.a(list.get(1)).c().doubleValue()) : 2147483647L;
                    if (jH == 0) {
                        return new f();
                    }
                    String[] strArrSplit = str12.split(Pattern.quote(strB4), ((int) jH) + 1);
                    int length3 = strArrSplit.length;
                    if (!strB4.equals("") || length3 <= 0) {
                        i3 = length3;
                        z = false;
                    } else {
                        boolean zEquals = strArrSplit[0].equals("");
                        i3 = length3 - 1;
                        if (!strArrSplit[i3].equals("")) {
                            i3 = length3;
                        }
                        z = zEquals;
                    }
                    if (length3 > jH) {
                        i3--;
                    }
                    for (?? r0 = z; r0 < i3; r0++) {
                        arrayList.add(new u(strArrSplit[r0]));
                    }
                }
                return new f(arrayList);
            case 10:
                v5.c("substring", 2, list);
                String str13 = this.a;
                if (list.size() > 0) {
                    v4Var2 = v4Var;
                    i4 = (int) v5.i(v4Var2.a(list.get(0)).c().doubleValue());
                } else {
                    v4Var2 = v4Var;
                    i4 = 0;
                }
                int i8 = list.size() > 1 ? (int) v5.i(v4Var2.a(list.get(1)).c().doubleValue()) : str13.length();
                int iMin = Math.min(Math.max(i4, 0), str13.length());
                int iMin2 = Math.min(Math.max(i8, 0), str13.length());
                uVar2 = new u(str13.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
                return uVar2;
            case 11:
                v5.a(str2, 0, list);
                return new u(this.a.toUpperCase());
            case 12:
                v5.a("toLocaleLowerCase", 0, list);
                return new u(this.a.toLowerCase());
            case 13:
                v5.a("toLowerCase", 0, list);
                return new u(this.a.toLowerCase(Locale.ENGLISH));
            case 14:
                uVar = this;
                v5.a("toString", 0, list);
                return uVar;
            case 15:
                v5.a("toUpperCase", 0, list);
                return new u(this.a.toUpperCase(Locale.ENGLISH));
            case 16:
                v5.a("toUpperCase", 0, list);
                return new u(this.a.trim());
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append('\"');
        sb.append(str);
        sb.append('\"');
        return sb.toString();
    }
}
