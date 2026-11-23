package l.d0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Serializable {
    private final Pattern a;

    private static final class a implements Serializable {
        private final String a;
        private final int b;

        public a(String str, int i2) {
            l.y.c.i.e(str, "pattern");
            this.a = str;
            this.b = i2;
        }

        private final Object readResolve() {
            Pattern patternCompile = Pattern.compile(this.a, this.b);
            l.y.c.i.d(patternCompile, "compile(pattern, flags)");
            return new f(patternCompile);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f(String str) {
        l.y.c.i.e(str, "pattern");
        Pattern patternCompile = Pattern.compile(str);
        l.y.c.i.d(patternCompile, "compile(pattern)");
        this(patternCompile);
    }

    public f(Pattern pattern) {
        l.y.c.i.e(pattern, "nativePattern");
        this.a = pattern;
    }

    private final Object writeReplace() {
        String strPattern = this.a.pattern();
        l.y.c.i.d(strPattern, "nativePattern.pattern()");
        return new a(strPattern, this.a.flags());
    }

    public final boolean a(CharSequence charSequence) {
        l.y.c.i.e(charSequence, "input");
        return this.a.matcher(charSequence).matches();
    }

    public final String b(CharSequence charSequence, String str) {
        l.y.c.i.e(charSequence, "input");
        l.y.c.i.e(str, "replacement");
        String strReplaceAll = this.a.matcher(charSequence).replaceAll(str);
        l.y.c.i.d(strReplaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return strReplaceAll;
    }

    public final List<String> c(CharSequence charSequence, int i2) {
        l.y.c.i.e(charSequence, "input");
        q.d0(i2);
        Matcher matcher = this.a.matcher(charSequence);
        if (i2 == 1 || !matcher.find()) {
            return l.t.l.b(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(i2 > 0 ? l.a0.i.c(i2, 10) : 10);
        int iEnd = 0;
        int i3 = i2 - 1;
        do {
            arrayList.add(charSequence.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i3 >= 0 && arrayList.size() == i3) {
                break;
            }
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(iEnd, charSequence.length()).toString());
        return arrayList;
    }

    public String toString() {
        String string = this.a.toString();
        l.y.c.i.d(string, "nativePattern.toString()");
        return string;
    }
}
