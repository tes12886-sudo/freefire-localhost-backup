package j.d.e.k.b;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    public static int a(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        int i3 = 0;
        if (i2 < length) {
            loop0: while (true) {
                char cCharAt = charSequence.charAt(i2);
                while (f(cCharAt) && i2 < length) {
                    i3++;
                    i2++;
                    if (i2 < length) {
                    }
                }
                break loop0;
            }
        }
        return i3;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0074  */
    /* JADX WARN: Code duplicated, block: B:26:0x00af  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b8 A[LOOP:1: B:27:0x00b2->B:29:0x00b8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x006e A[SYNTHETIC] */
    public static String b(String str, l lVar, j.d.e.b bVar, j.d.e.b bVar2) {
        int iA;
        int iA2;
        StringBuilder sbB;
        char c;
        int iE = 0;
        g[] gVarArr = {new a(), new c(), new m(), new n(), new f(), new b()};
        h hVar = new h(str);
        hVar.n(lVar);
        hVar.l(bVar, bVar2);
        if (!str.startsWith("[)>\u001e05\u001d") || !str.endsWith("\u001e\u0004")) {
            c = (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) ? (char) 237 : (char) 236;
            while (hVar.i()) {
                gVarArr[iE].a(hVar);
                if (hVar.e() >= 0) {
                    iE = hVar.e();
                    hVar.j();
                }
            }
            iA = hVar.a();
            hVar.p();
            iA2 = hVar.g().a();
            if (iA < iA2 && iE != 0 && iE != 5 && iE != 4) {
                hVar.r((char) 254);
            }
            sbB = hVar.b();
            if (sbB.length() < iA2) {
                sbB.append((char) 129);
            }
            while (sbB.length() < iA2) {
                sbB.append(o((char) 129, sbB.length() + 1));
            }
            return hVar.b().toString();
        }
        hVar.r(c);
        hVar.m(2);
        hVar.f += 7;
        while (hVar.i()) {
            gVarArr[iE].a(hVar);
            if (hVar.e() >= 0) {
                iE = hVar.e();
                hVar.j();
            }
        }
        iA = hVar.a();
        hVar.p();
        iA2 = hVar.g().a();
        if (iA < iA2) {
            hVar.r((char) 254);
        }
        sbB = hVar.b();
        if (sbB.length() < iA2) {
            sbB.append((char) 129);
        }
        while (sbB.length() < iA2) {
            sbB.append(o((char) 129, sbB.length() + 1));
        }
        return hVar.b().toString();
    }

    private static int c(float[] fArr, int[] iArr, int i2, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        for (int i3 = 0; i3 < 6; i3++) {
            iArr[i3] = (int) Math.ceil(fArr[i3]);
            int i4 = iArr[i3];
            if (i2 > i4) {
                Arrays.fill(bArr, (byte) 0);
                i2 = i4;
            }
            if (i2 == i4) {
                bArr[i3] = (byte) (bArr[i3] + 1);
            }
        }
        return i2;
    }

    private static int d(byte[] bArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            i2 += bArr[i3];
        }
        return i2;
    }

    static void e(char c) {
        String hexString = Integer.toHexString(c);
        throw new IllegalArgumentException("Illegal character: " + c + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    static boolean f(char c) {
        return c >= '0' && c <= '9';
    }

    static boolean g(char c) {
        return c >= 128 && c <= 255;
    }

    private static boolean h(char c) {
        if (c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    private static boolean i(char c) {
        return c >= ' ' && c <= '^';
    }

    private static boolean j(char c) {
        if (c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }

    private static boolean k(char c) {
        if (m(c) || c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    private static boolean l(char c) {
        return false;
    }

    private static boolean m(char c) {
        return c == '\r' || c == '*' || c == '>';
    }

    static int n(CharSequence charSequence, int i2, int i3) {
        char c;
        if (i2 >= charSequence.length()) {
            return i3;
        }
        float[] fArr = {1.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.25f};
        if (i3 == 0) {
            // fill-array-data instruction
            fArr[0] = 0.0f;
            fArr[1] = 1.0f;
            fArr[2] = 1.0f;
            fArr[3] = 1.0f;
            fArr[4] = 1.0f;
            fArr[5] = 1.25f;
        } else {
            fArr[i3] = 0.0f;
        }
        int i4 = 0;
        while (true) {
            int i5 = i2 + i4;
            if (i5 == charSequence.length()) {
                byte[] bArr = new byte[6];
                int[] iArr = new int[6];
                int iC = c(fArr, iArr, Integer.MAX_VALUE, bArr);
                int iD = d(bArr);
                if (iArr[0] == iC) {
                    return 0;
                }
                if (iD == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (iD == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (iD != 1 || bArr[2] <= 0) {
                    return (iD != 1 || bArr[3] <= 0) ? 1 : 3;
                }
                return 2;
            }
            char cCharAt = charSequence.charAt(i5);
            i4++;
            if (f(cCharAt)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (g(cCharAt)) {
                fArr[0] = (float) Math.ceil(fArr[0]);
                fArr[0] = fArr[0] + 2.0f;
            } else {
                fArr[0] = (float) Math.ceil(fArr[0]);
                fArr[0] = fArr[0] + 1.0f;
            }
            if (h(cCharAt)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (g(cCharAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (j(cCharAt)) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (g(cCharAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (k(cCharAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (g(cCharAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (i(cCharAt)) {
                fArr[4] = fArr[4] + 0.75f;
            } else if (g(cCharAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            if (l(cCharAt)) {
                c = 5;
                fArr[5] = fArr[5] + 4.0f;
            } else {
                c = 5;
                fArr[5] = fArr[5] + 1.0f;
            }
            if (i4 >= 4) {
                int[] iArr2 = new int[6];
                byte[] bArr2 = new byte[6];
                c(fArr, iArr2, Integer.MAX_VALUE, bArr2);
                int iD2 = d(bArr2);
                if (iArr2[0] < iArr2[c] && iArr2[0] < iArr2[1] && iArr2[0] < iArr2[2] && iArr2[0] < iArr2[3] && iArr2[0] < iArr2[4]) {
                    return 0;
                }
                if (iArr2[5] < iArr2[0] || bArr2[1] + bArr2[2] + bArr2[3] + bArr2[4] == 0) {
                    return 5;
                }
                if (iD2 == 1 && bArr2[4] > 0) {
                    return 4;
                }
                if (iD2 == 1 && bArr2[2] > 0) {
                    return 2;
                }
                if (iD2 == 1 && bArr2[3] > 0) {
                    return 3;
                }
                if (iArr2[1] + 1 < iArr2[0] && iArr2[1] + 1 < iArr2[5] && iArr2[1] + 1 < iArr2[4] && iArr2[1] + 1 < iArr2[2]) {
                    if (iArr2[1] < iArr2[3]) {
                        return 1;
                    }
                    if (iArr2[1] == iArr2[3]) {
                        for (int i6 = i2 + i4 + 1; i6 < charSequence.length(); i6++) {
                            char cCharAt2 = charSequence.charAt(i6);
                            if (m(cCharAt2)) {
                                return 3;
                            }
                            if (!k(cCharAt2)) {
                                break;
                            }
                        }
                        return 1;
                    }
                }
            }
        }
    }

    private static char o(char c, int i2) {
        int i3 = c + ((i2 * 149) % 253) + 1;
        if (i3 > 254) {
            i3 -= 254;
        }
        return (char) i3;
    }
}
