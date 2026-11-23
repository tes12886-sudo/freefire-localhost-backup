package l.d0;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final d a = new d();
    public static final Charset b;
    private static Charset c;
    private static Charset d;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        l.y.c.i.d(charsetForName, "forName(\"UTF-8\")");
        b = charsetForName;
        l.y.c.i.d(Charset.forName("UTF-16"), "forName(\"UTF-16\")");
        l.y.c.i.d(Charset.forName("UTF-16BE"), "forName(\"UTF-16BE\")");
        l.y.c.i.d(Charset.forName("UTF-16LE"), "forName(\"UTF-16LE\")");
        l.y.c.i.d(Charset.forName("US-ASCII"), "forName(\"US-ASCII\")");
        l.y.c.i.d(Charset.forName("ISO-8859-1"), "forName(\"ISO-8859-1\")");
    }

    private d() {
    }

    public final Charset a() {
        Charset charset = d;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32BE");
        l.y.c.i.d(charsetForName, "forName(\"UTF-32BE\")");
        d = charsetForName;
        return charsetForName;
    }

    public final Charset b() {
        Charset charset = c;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32LE");
        l.y.c.i.d(charsetForName, "forName(\"UTF-32LE\")");
        c = charsetForName;
        return charsetForName;
    }
}
