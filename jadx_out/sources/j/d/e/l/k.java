package j.d.e.l;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class k extends q {
    @Override // j.d.e.l.n, j.d.e.g
    public j.d.e.j.b a(String str, j.d.e.a aVar, int i2, int i3, Map<j.d.e.c, ?> map) {
        if (aVar == j.d.e.a.EAN_8) {
            return super.a(str, aVar, i2, i3, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(aVar)));
    }

    @Override // j.d.e.l.n
    public boolean[] c(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + p.b(str);
            } catch (j.d.e.d e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            if (length != 8) {
                throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length)));
            }
            try {
                if (!p.a(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (j.d.e.d unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        boolean[] zArr = new boolean[67];
        int iB = n.b(zArr, 0, p.a, true) + 0;
        for (int i2 = 0; i2 <= 3; i2++) {
            iB += n.b(zArr, iB, p.d[Character.digit(str.charAt(i2), 10)], false);
        }
        int iB2 = iB + n.b(zArr, iB, p.b, false);
        for (int i3 = 4; i3 <= 7; i3++) {
            iB2 += n.b(zArr, iB2, p.d[Character.digit(str.charAt(i3), 10)], true);
        }
        n.b(zArr, iB2, p.a, true);
        return zArr;
    }
}
