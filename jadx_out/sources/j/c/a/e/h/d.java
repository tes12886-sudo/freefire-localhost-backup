package j.c.a.e.h;

import android.text.TextUtils;
import j.c.a.e.l.f;

/* JADX INFO: loaded from: classes.dex */
public class d extends a {
    @Override // j.c.a.e.h.a
    public int a() {
        return 20;
    }

    @Override // j.c.a.e.h.a
    public void b(byte[] bArr, int i2, int i3) {
        String str = f.c(bArr, i2, i3).d;
        if (!TextUtils.isEmpty(str)) {
            j.c.a.e.i.a.m(System.currentTimeMillis());
            j.c.a.e.i.a.k(str);
        }
        j.c.a.e.a.b().b("CONNECT_AUTHENTICATION_SERVER", null);
    }
}
