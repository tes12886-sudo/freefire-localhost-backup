package m.h0.k;

import l.d0.p;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final e a = new e();
    public static final n.e b = n.e.d.d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    private static final String[] c = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    private static final String[] d = new String[64];
    private static final String[] e;

    static {
        int i2 = 0;
        String[] strArr = new String[256];
        for (int i3 = 0; i3 < 256; i3++) {
            String binaryString = Integer.toBinaryString(i3);
            l.y.c.i.d(binaryString, "toBinaryString(it)");
            strArr[i3] = p.s(m.h0.d.q("%8s", binaryString), ' ', '0', false, 4, null);
        }
        e = strArr;
        String[] strArr2 = d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i4 = 0;
        while (i4 < 1) {
            int i5 = iArr[i4];
            i4++;
            String[] strArr3 = d;
            strArr3[i5 | 8] = l.y.c.i.k(strArr3[i5], "|PADDED");
        }
        String[] strArr4 = d;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i6 = 0;
        while (i6 < 3) {
            int i7 = iArr2[i6];
            i6++;
            int i8 = 0;
            while (i8 < 1) {
                int i9 = iArr[i8];
                i8++;
                String[] strArr5 = d;
                int i10 = i9 | i7;
                StringBuilder sb = new StringBuilder();
                sb.append((Object) strArr5[i9]);
                sb.append('|');
                sb.append((Object) strArr5[i7]);
                strArr5[i10] = sb.toString();
                strArr5[i10 | 8] = ((Object) strArr5[i9]) + '|' + ((Object) strArr5[i7]) + "|PADDED";
            }
        }
        int length = d.length;
        while (i2 < length) {
            int i11 = i2 + 1;
            String[] strArr6 = d;
            if (strArr6[i2] == null) {
                strArr6[i2] = e[i2];
            }
            i2 = i11;
        }
    }

    private e() {
    }

    public final String a(int i2, int i3) {
        String str;
        boolean z;
        int i4;
        Object obj;
        String str2;
        String str3;
        if (i3 == 0) {
            return "";
        }
        if (i2 != 2 && i2 != 3) {
            if (i2 == 4 || i2 == 6) {
                return i3 == 1 ? "ACK" : e[i3];
            }
            if (i2 != 7 && i2 != 8) {
                String[] strArr = d;
                if (i3 < strArr.length) {
                    str = strArr[i3];
                    l.y.c.i.c(str);
                } else {
                    str = e[i3];
                }
                String str4 = str;
                if (i2 == 5 && (i3 & 4) != 0) {
                    z = false;
                    i4 = 4;
                    obj = null;
                    str2 = "HEADERS";
                    str3 = "PUSH_PROMISE";
                } else {
                    if (i2 != 0 || (i3 & 32) == 0) {
                        return str4;
                    }
                    z = false;
                    i4 = 4;
                    obj = null;
                    str2 = "PRIORITY";
                    str3 = "COMPRESSED";
                }
                return p.t(str4, str2, str3, z, i4, obj);
            }
        }
        return e[i3];
    }

    public final String b(int i2) {
        String[] strArr = c;
        return i2 < strArr.length ? strArr[i2] : m.h0.d.q("0x%02x", Integer.valueOf(i2));
    }

    public final String c(boolean z, int i2, int i3, int i4, int i5) {
        return m.h0.d.q("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i2), Integer.valueOf(i3), b(i4), a(i4, i5));
    }
}
