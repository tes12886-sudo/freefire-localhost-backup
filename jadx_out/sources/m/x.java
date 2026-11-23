package m;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class x {
    public static final a d = new a(null);
    private static final Pattern e = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final Pattern f = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    private final String a;
    private final String b;
    private final String[] c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }

        public final x a(String str) {
            l.y.c.i.e(str, "<this>");
            Matcher matcher = x.e.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
            }
            String strGroup = matcher.group(1);
            l.y.c.i.d(strGroup, "typeSubtype.group(1)");
            Locale locale = Locale.US;
            l.y.c.i.d(locale, "US");
            String lowerCase = strGroup.toLowerCase(locale);
            l.y.c.i.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String strGroup2 = matcher.group(2);
            l.y.c.i.d(strGroup2, "typeSubtype.group(2)");
            l.y.c.i.d(locale, "US");
            String lowerCase2 = strGroup2.toLowerCase(locale);
            l.y.c.i.d(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = x.f.matcher(str);
            for (int iEnd = matcher.end(); iEnd < str.length(); iEnd = matcher2.end()) {
                matcher2.region(iEnd, str.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Parameter is not formatted correctly: \"");
                    String strSubstring = str.substring(iEnd);
                    l.y.c.i.d(strSubstring, "this as java.lang.String).substring(startIndex)");
                    sb.append(strSubstring);
                    sb.append("\" for: \"");
                    sb.append(str);
                    sb.append('\"');
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                String strGroup3 = matcher2.group(1);
                if (strGroup3 != null) {
                    String strGroup4 = matcher2.group(2);
                    if (strGroup4 == null) {
                        strGroup4 = matcher2.group(3);
                    } else if (l.d0.p.x(strGroup4, "'", false, 2, null) && l.d0.p.k(strGroup4, "'", false, 2, null) && strGroup4.length() > 2) {
                        strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                        l.y.c.i.d(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    arrayList.add(strGroup3);
                    arrayList.add(strGroup4);
                }
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return new x(str, lowerCase, lowerCase2, (String[]) array, null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        public final x b(String str) {
            l.y.c.i.e(str, "<this>");
            try {
                return a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    private x(String str, String str2, String str3, String[] strArr) {
        this.a = str;
        this.b = str2;
        this.c = strArr;
    }

    public /* synthetic */ x(String str, String str2, String str3, String[] strArr, l.y.c.f fVar) {
        this(str, str2, str3, strArr);
    }

    public static /* synthetic */ Charset d(x xVar, Charset charset, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = null;
        }
        return xVar.c(charset);
    }

    public static final x e(String str) {
        return d.a(str);
    }

    public static final x g(String str) {
        return d.b(str);
    }

    public final Charset c(Charset charset) {
        String strF = f("charset");
        if (strF == null) {
            return charset;
        }
        try {
            return Charset.forName(strF);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof x) && l.y.c.i.a(((x) obj).a, this.a);
    }

    public final String f(String str) {
        l.y.c.i.e(str, "name");
        int i2 = 0;
        int iB = l.w.c.b(0, this.c.length - 1, 2);
        if (iB < 0) {
            return null;
        }
        while (true) {
            int i3 = i2 + 2;
            if (l.d0.p.l(this.c[i2], str, true)) {
                return this.c[i2 + 1];
            }
            if (i2 == iB) {
                return null;
            }
            i2 = i3;
        }
    }

    public final String h() {
        return this.b;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a;
    }
}
