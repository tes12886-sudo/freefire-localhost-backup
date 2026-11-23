package n.d0;

import l.y.c.i;
import n.u;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final int a(int[] iArr, int i2, int i3, int i4) {
        i.e(iArr, "<this>");
        int i5 = i4 - 1;
        while (i3 <= i5) {
            int i6 = (i3 + i5) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i2) {
                i3 = i6 + 1;
            } else {
                if (i7 <= i2) {
                    return i6;
                }
                i5 = i6 - 1;
            }
        }
        return (-i3) - 1;
    }

    public static final int b(u uVar, int i2) {
        i.e(uVar, "<this>");
        int iA = a(uVar.z(), i2 + 1, 0, uVar.A().length);
        return iA >= 0 ? iA : iA ^ (-1);
    }
}
