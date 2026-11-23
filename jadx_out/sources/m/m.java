package m;

import com.FF.voiceengine.FFVoiceConst;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f2303j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f2304k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f2305l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f2306m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Pattern f2307n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    private final String a;
    private final String b;
    private final long c;
    private final String d;
    private final String e;
    private final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f2308g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f2309h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f2310i;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:32:0x0041  */
        private final int a(String str, int i2, int i3, boolean z) {
            boolean z2;
            while (i2 < i3) {
                int i4 = i2 + 1;
                char cCharAt = str.charAt(i2);
                if ((cCharAt >= ' ' || cCharAt == '\t') && cCharAt < 127) {
                    if (!(cCharAt <= '9' && '0' <= cCharAt)) {
                        if (!(cCharAt <= 'z' && 'a' <= cCharAt)) {
                            z2 = (cCharAt <= 'Z' && 'A' <= cCharAt) || cCharAt == ':';
                        }
                    }
                }
                if (z2 == (!z)) {
                    return i2;
                }
                i2 = i4;
            }
            return i3;
        }

        private final boolean b(String str, String str2) {
            if (l.y.c.i.a(str, str2)) {
                return true;
            }
            return l.d0.p.k(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !m.h0.d.g(str);
        }

        private final String f(String str) {
            if (!(!l.d0.p.k(str, ".", false, 2, null))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            String strE = m.h0.c.e(l.d0.q.b0(str, "."));
            if (strE != null) {
                return strE;
            }
            throw new IllegalArgumentException();
        }

        private final long g(String str, int i2, int i3) {
            int iA = a(str, i2, i3, false);
            Matcher matcher = m.f2307n.matcher(str);
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int iN = -1;
            int i7 = -1;
            int i8 = -1;
            while (iA < i3) {
                int iA2 = a(str, iA + 1, i3, true);
                matcher.region(iA, iA2);
                if (i5 == -1 && matcher.usePattern(m.f2307n).matches()) {
                    String strGroup = matcher.group(1);
                    l.y.c.i.d(strGroup, "matcher.group(1)");
                    i5 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    l.y.c.i.d(strGroup2, "matcher.group(2)");
                    i7 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    l.y.c.i.d(strGroup3, "matcher.group(3)");
                    i8 = Integer.parseInt(strGroup3);
                } else if (i6 == -1 && matcher.usePattern(m.f2306m).matches()) {
                    String strGroup4 = matcher.group(1);
                    l.y.c.i.d(strGroup4, "matcher.group(1)");
                    i6 = Integer.parseInt(strGroup4);
                } else if (iN == -1 && matcher.usePattern(m.f2305l).matches()) {
                    String strGroup5 = matcher.group(1);
                    l.y.c.i.d(strGroup5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    l.y.c.i.d(locale, "US");
                    String lowerCase = strGroup5.toLowerCase(locale);
                    l.y.c.i.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String strPattern = m.f2305l.pattern();
                    l.y.c.i.d(strPattern, "MONTH_PATTERN.pattern()");
                    iN = l.d0.q.N(strPattern, lowerCase, 0, false, 6, null) / 4;
                } else if (i4 == -1 && matcher.usePattern(m.f2304k).matches()) {
                    String strGroup6 = matcher.group(1);
                    l.y.c.i.d(strGroup6, "matcher.group(1)");
                    i4 = Integer.parseInt(strGroup6);
                }
                iA = a(str, iA2 + 1, i3, false);
            }
            if (70 <= i4 && i4 < 100) {
                i4 += 1900;
            }
            if (i4 >= 0 && i4 < 70) {
                i4 += 2000;
            }
            if (!(i4 >= 1601)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(iN != -1)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(1 <= i6 && i6 < 32)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i5 >= 0 && i5 < 24)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i7 >= 0 && i7 < 60)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i8 >= 0 && i8 < 60)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(m.h0.d.e);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i4);
            gregorianCalendar.set(2, iN - 1);
            gregorianCalendar.set(5, i6);
            gregorianCalendar.set(11, i5);
            gregorianCalendar.set(12, i7);
            gregorianCalendar.set(13, i8);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        private final long h(String str) {
            try {
                long j2 = Long.parseLong(str);
                if (j2 <= 0) {
                    return Long.MIN_VALUE;
                }
                return j2;
            } catch (NumberFormatException e) {
                if (new l.d0.f("-?\\d+").a(str)) {
                    return l.d0.p.x(str, "-", false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e;
            }
        }

        public final m c(v vVar, String str) {
            l.y.c.i.e(vVar, "url");
            l.y.c.i.e(str, "setCookie");
            return d(System.currentTimeMillis(), vVar, str);
        }

        /* JADX WARN: Code duplicated, block: B:46:0x00dc A[PHI: r1
  0x00dc: PHI (r1v23 long) = (r1v8 long), (r1v11 long) binds: [B:45:0x00da, B:56:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
        public final m d(long j2, v vVar, String str) {
            long j3;
            long j4;
            m mVar;
            String str2;
            String str3;
            l.y.c.i.e(vVar, "url");
            l.y.c.i.e(str, "setCookie");
            int iO = m.h0.d.o(str, ';', 0, 0, 6, null);
            int iO2 = m.h0.d.o(str, '=', 0, iO, 2, null);
            if (iO2 == iO) {
                return null;
            }
            String strW = m.h0.d.W(str, 0, iO2, 1, null);
            if ((strW.length() == 0) || m.h0.d.v(strW) != -1) {
                return null;
            }
            String strV = m.h0.d.V(str, iO2 + 1, iO);
            if (m.h0.d.v(strV) != -1) {
                return null;
            }
            int i2 = iO + 1;
            int length = str.length();
            String strF = null;
            String str4 = null;
            long jH = -1;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = true;
            long jG = 253402300799999L;
            while (i2 < length) {
                int iM = m.h0.d.m(str, ';', i2, length);
                int iM2 = m.h0.d.m(str, '=', i2, iM);
                String strV2 = m.h0.d.V(str, i2, iM2);
                String strV3 = iM2 < iM ? m.h0.d.V(str, iM2 + 1, iM) : "";
                if (l.d0.p.l(strV2, "expires", true)) {
                    try {
                        jG = g(strV3, 0, strV3.length());
                        z3 = true;
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (l.d0.p.l(strV2, "max-age", true)) {
                    jH = h(strV3);
                    z3 = true;
                } else if (l.d0.p.l(strV2, "domain", true)) {
                    strF = f(strV3);
                    z4 = false;
                } else if (l.d0.p.l(strV2, "path", true)) {
                    str4 = strV3;
                } else if (l.d0.p.l(strV2, "secure", true)) {
                    z = true;
                } else if (l.d0.p.l(strV2, "httponly", true)) {
                    z2 = true;
                }
                i2 = iM + 1;
            }
            long j5 = Long.MIN_VALUE;
            if (jH == Long.MIN_VALUE) {
                j3 = j5;
            } else if (jH != -1) {
                j5 = j2 + (jH <= 9223372036854775L ? jH * ((long) FFVoiceConst.FFVoiceEvent.FFVoice_EVENT_EOF) : Long.MAX_VALUE);
                if (j5 >= j2) {
                    j4 = 253402300799999L;
                    if (j5 <= 253402300799999L) {
                        j3 = j5;
                    }
                } else {
                    j4 = 253402300799999L;
                }
                j3 = j4;
            } else {
                j3 = jG;
            }
            String strI = vVar.i();
            if (strF == null) {
                str2 = strI;
                mVar = null;
            } else {
                if (!b(strI, strF)) {
                    return null;
                }
                mVar = null;
                str2 = strF;
            }
            if (strI.length() != str2.length() && PublicSuffixDatabase.e.c().c(str2) == null) {
                return mVar;
            }
            String strSubstring = "/";
            String str5 = str4;
            if (str5 == null || !l.d0.p.x(str5, "/", false, 2, mVar)) {
                String strD = vVar.d();
                int iR = l.d0.q.R(strD, '/', 0, false, 6, null);
                if (iR != 0) {
                    strSubstring = strD.substring(0, iR);
                    l.y.c.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                str3 = strSubstring;
            } else {
                str3 = str5;
            }
            return new m(strW, strV, j3, str2, str3, z, z2, z3, z4, null);
        }

        public final List<m> e(v vVar, u uVar) {
            l.y.c.i.e(vVar, "url");
            l.y.c.i.e(uVar, "headers");
            List<String> listJ = uVar.j("Set-Cookie");
            int size = listJ.size();
            ArrayList arrayList = null;
            int i2 = 0;
            while (i2 < size) {
                int i3 = i2 + 1;
                m mVarC = c(vVar, listJ.get(i2));
                if (mVarC != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(mVarC);
                }
                i2 = i3;
            }
            if (arrayList == null) {
                return l.t.m.g();
            }
            List<m> listUnmodifiableList = Collections.unmodifiableList(arrayList);
            l.y.c.i.d(listUnmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
            return listUnmodifiableList;
        }
    }

    private m(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = j2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.f2308g = z2;
        this.f2309h = z3;
        this.f2310i = z4;
    }

    public /* synthetic */ m(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, l.y.c.f fVar) {
        this(str, str2, j2, str3, str4, z, z2, z3, z4);
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (l.y.c.i.a(mVar.a, this.a) && l.y.c.i.a(mVar.b, this.b) && mVar.c == this.c && l.y.c.i.a(mVar.d, this.d) && l.y.c.i.a(mVar.e, this.e) && mVar.f == this.f && mVar.f2308g == this.f2308g && mVar.f2309h == this.f2309h && mVar.f2310i == this.f2310i) {
                return true;
            }
        }
        return false;
    }

    public final long f() {
        return this.c;
    }

    public final boolean g() {
        return this.f2310i;
    }

    public final boolean h() {
        return this.f2308g;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return ((((((((((((((((527 + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + defpackage.b.a(this.c)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + defpackage.a.a(this.f)) * 31) + defpackage.a.a(this.f2308g)) * 31) + defpackage.a.a(this.f2309h)) * 31) + defpackage.a.a(this.f2310i);
    }

    public final String i() {
        return this.a;
    }

    public final String j() {
        return this.e;
    }

    public final boolean k() {
        return this.f2309h;
    }

    public final boolean l() {
        return this.f;
    }

    public final String m(boolean z) {
        String strB;
        StringBuilder sb = new StringBuilder();
        sb.append(i());
        sb.append('=');
        sb.append(n());
        if (k()) {
            if (f() == Long.MIN_VALUE) {
                strB = "; max-age=0";
            } else {
                sb.append("; expires=");
                strB = m.h0.i.c.b(new Date(f()));
            }
            sb.append(strB);
        }
        if (!g()) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(e());
        }
        sb.append("; path=");
        sb.append(j());
        if (l()) {
            sb.append("; secure");
        }
        if (h()) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        l.y.c.i.d(string, "toString()");
        return string;
    }

    public final String n() {
        return this.b;
    }

    public String toString() {
        return m(false);
    }
}
