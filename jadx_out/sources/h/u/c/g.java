package h.u.c;

import android.webkit.WebSettings;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class g {
    private final WebkitToCompatConverterBoundaryInterface a;

    public g(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.a = webkitToCompatConverterBoundaryInterface;
    }

    public b a(WebSettings webSettings) {
        return new b((WebSettingsBoundaryInterface) org.chromium.support_lib_boundary.a.a.a(WebSettingsBoundaryInterface.class, this.a.convertSettings(webSettings)));
    }
}
