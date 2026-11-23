package l.d0;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class s extends r {
    public static String v0(String str, int i2) {
        l.y.c.i.e(str, "<this>");
        if (i2 >= 0) {
            String strSubstring = str.substring(0, l.a0.i.c(i2, str.length()));
            l.y.c.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i2 + " is less than zero.").toString());
    }
}
