package h.u.c;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class b {
    private WebSettingsBoundaryInterface a;

    public b(WebSettingsBoundaryInterface webSettingsBoundaryInterface) {
        this.a = webSettingsBoundaryInterface;
    }

    public void a(int i2) {
        this.a.setForceDark(i2);
    }
}
