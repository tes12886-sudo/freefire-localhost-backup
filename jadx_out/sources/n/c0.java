package n;

import com.appff.haptic.base.Utils;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {
    private static final int a = -1234567890;

    public static final boolean a(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        l.y.c.i.e(bArr, "a");
        l.y.c.i.e(bArr2, "b");
        if (i4 <= 0) {
            return true;
        }
        int i5 = 0;
        while (true) {
            int i6 = i5 + 1;
            if (bArr[i5 + i2] != bArr2[i5 + i3]) {
                return false;
            }
            if (i6 >= i4) {
                return true;
            }
            i5 = i6;
        }
    }

    public static final void b(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j3 + " byteCount=" + j4);
        }
    }

    public static final int c(e eVar, int i2) {
        l.y.c.i.e(eVar, "<this>");
        return i2 == a ? eVar.t() : i2;
    }

    public static final int d(int i2) {
        return ((i2 & Utils.MAX_STRENGTH_VALUE) << 24) | (((-16777216) & i2) >>> 24) | ((16711680 & i2) >>> 8) | ((65280 & i2) << 8);
    }

    public static final long e(long j2) {
        return ((j2 & 255) << 56) | (((-72057594037927936L) & j2) >>> 56) | ((71776119061217280L & j2) >>> 40) | ((280375465082880L & j2) >>> 24) | ((1095216660480L & j2) >>> 8) | ((4278190080L & j2) << 8) | ((16711680 & j2) << 24) | ((65280 & j2) << 40);
    }

    public static final short f(short s) {
        int i2 = s & 65535;
        return (short) (((i2 & Utils.MAX_STRENGTH_VALUE) << 8) | ((65280 & i2) >>> 8));
    }

    public static final String g(byte b) {
        return l.d0.p.h(new char[]{n.d0.b.f()[(b >> 4) & 15], n.d0.b.f()[b & 15]});
    }

    public static final String h(int i2) {
        if (i2 == 0) {
            return "0";
        }
        int i3 = 0;
        char[] cArr = {n.d0.b.f()[(i2 >> 28) & 15], n.d0.b.f()[(i2 >> 24) & 15], n.d0.b.f()[(i2 >> 20) & 15], n.d0.b.f()[(i2 >> 16) & 15], n.d0.b.f()[(i2 >> 12) & 15], n.d0.b.f()[(i2 >> 8) & 15], n.d0.b.f()[(i2 >> 4) & 15], n.d0.b.f()[i2 & 15]};
        while (i3 < 8 && cArr[i3] == '0') {
            i3++;
        }
        return l.d0.p.i(cArr, i3, 8);
    }
}
