package h.u;

import android.annotation.SuppressLint;
import android.webkit.WebSettings;
import h.u.c.c;
import h.u.c.d;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private static h.u.c.b a(WebSettings webSettings) {
        return d.c().a(webSettings);
    }

    @SuppressLint({"NewApi"})
    public static void b(WebSettings webSettings, int i2) {
        c cVarA = c.a("FORCE_DARK");
        if (cVarA.d()) {
            webSettings.setForceDark(i2);
        } else {
            if (!cVarA.e()) {
                throw c.c();
            }
            a(webSettings).a(i2);
        }
    }
}
