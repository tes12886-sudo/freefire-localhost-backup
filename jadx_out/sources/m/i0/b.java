package m.i0;

import java.io.EOFException;
import l.y.c.i;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final boolean a(n.b bVar) {
        i.e(bVar, "<this>");
        try {
            n.b bVar2 = new n.b();
            bVar.c0(bVar2, 0L, l.a0.i.d(bVar.r0(), 64L));
            int i2 = 0;
            while (i2 < 16) {
                i2++;
                if (bVar2.z()) {
                    return true;
                }
                int iP0 = bVar2.p0();
                if (Character.isISOControl(iP0) && !Character.isWhitespace(iP0)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
