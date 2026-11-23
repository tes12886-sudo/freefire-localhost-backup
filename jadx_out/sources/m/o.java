package m;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class o {
    public static final String a(String str, String str2, Charset charset) {
        l.y.c.i.e(str, "username");
        l.y.c.i.e(str2, "password");
        l.y.c.i.e(charset, "charset");
        return l.y.c.i.k("Basic ", n.e.d.c(str + ':' + str2, charset).a());
    }
}
