package com.google.android.vending.licensing.n;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private static final byte[] a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] b = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9};

    public static byte[] a(String str) {
        byte[] bytes = str.getBytes();
        return b(bytes, 0, bytes.length);
    }

    public static byte[] b(byte[] bArr, int i2, int i3) {
        return c(bArr, i2, i3, b);
    }

    public static byte[] c(byte[] bArr, int i2, int i3, byte[] bArr2) throws b {
        byte[] bArr3 = new byte[((i3 * 3) / 4) + 2];
        byte[] bArr4 = new byte[4];
        int i4 = 0;
        int iD = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = i5 + i2;
            byte b2 = (byte) (bArr[i6] & 127);
            byte b3 = bArr2[b2];
            if (b3 < -5) {
                throw new b("Bad Base64 input character at " + i5 + ": " + ((int) bArr[i6]) + "(decimal)");
            }
            if (b3 >= -1) {
                if (b2 == 61) {
                    int i7 = i3 - i5;
                    byte b4 = (byte) (bArr[(i3 - 1) + i2] & 127);
                    if (i4 == 0 || i4 == 1) {
                        throw new b("invalid padding byte '=' at byte offset " + i5);
                    }
                    if ((i4 == 3 && i7 > 2) || (i4 == 4 && i7 > 1)) {
                        throw new b("padding byte '=' falsely signals end of encoded value at offset " + i5);
                    }
                    if (b4 != 61 && b4 != 10) {
                        throw new b("encoded value has invalid trailing byte");
                    }
                    break;
                    break;
                }
                int i8 = i4 + 1;
                bArr4[i4] = b2;
                if (i8 == 4) {
                    iD += d(bArr4, 0, bArr3, iD, bArr2);
                    i4 = 0;
                } else {
                    i4 = i8;
                }
            }
        }
        if (i4 != 0) {
            if (i4 == 1) {
                throw new b("single trailing character at offset " + (i3 - 1));
            }
            bArr4[i4] = 61;
            iD += d(bArr4, 0, bArr3, iD, bArr2);
        }
        byte[] bArr5 = new byte[iD];
        System.arraycopy(bArr3, 0, bArr5, 0, iD);
        return bArr5;
    }

    private static int d(byte[] bArr, int i2, byte[] bArr2, int i3, byte[] bArr3) {
        int i4 = i2 + 2;
        if (bArr[i4] == 61) {
            bArr2[i3] = (byte) ((((bArr3[bArr[i2 + 1]] << 24) >>> 12) | ((bArr3[bArr[i2]] << 24) >>> 6)) >>> 16);
            return 1;
        }
        int i5 = i2 + 3;
        if (bArr[i5] == 61) {
            int i6 = ((bArr3[bArr[i4]] << 24) >>> 18) | ((bArr3[bArr[i2 + 1]] << 24) >>> 12) | ((bArr3[bArr[i2]] << 24) >>> 6);
            bArr2[i3] = (byte) (i6 >>> 16);
            bArr2[i3 + 1] = (byte) (i6 >>> 8);
            return 2;
        }
        int i7 = ((bArr3[bArr[i5]] << 24) >>> 24) | ((bArr3[bArr[i2 + 1]] << 24) >>> 12) | ((bArr3[bArr[i2]] << 24) >>> 6) | ((bArr3[bArr[i4]] << 24) >>> 18);
        bArr2[i3] = (byte) (i7 >> 16);
        bArr2[i3 + 1] = (byte) (i7 >> 8);
        bArr2[i3 + 2] = (byte) i7;
        return 3;
    }

    public static String e(byte[] bArr) {
        return f(bArr, 0, bArr.length, a, true);
    }

    public static String f(byte[] bArr, int i2, int i3, byte[] bArr2, boolean z) {
        byte[] bArrG = g(bArr, i2, i3, bArr2, Integer.MAX_VALUE);
        int length = bArrG.length;
        while (!z && length > 0 && bArrG[length - 1] == 61) {
            length--;
        }
        return new String(bArrG, 0, length);
    }

    public static byte[] g(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) {
        int i5 = ((i3 + 2) / 3) * 4;
        byte[] bArr3 = new byte[i5 + (i5 / i4)];
        int i6 = i3 - 2;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < i6) {
            int i10 = ((bArr[i7 + i2] << 24) >>> 8) | ((bArr[(i7 + 1) + i2] << 24) >>> 16) | ((bArr[(i7 + 2) + i2] << 24) >>> 24);
            bArr3[i8] = bArr2[i10 >>> 18];
            int i11 = i8 + 1;
            bArr3[i11] = bArr2[(i10 >>> 12) & 63];
            bArr3[i8 + 2] = bArr2[(i10 >>> 6) & 63];
            bArr3[i8 + 3] = bArr2[i10 & 63];
            i9 += 4;
            if (i9 == i4) {
                bArr3[i8 + 4] = 10;
                i8 = i11;
                i9 = 0;
            }
            i7 += 3;
            i8 += 4;
        }
        if (i7 < i3) {
            h(bArr, i7 + i2, i3 - i7, bArr3, i8, bArr2);
            if (i9 + 4 == i4) {
                bArr3[i8 + 4] = 10;
            }
        }
        return bArr3;
    }

    private static byte[] h(byte[] bArr, int i2, int i3, byte[] bArr2, int i4, byte[] bArr3) {
        int i5 = (i3 > 0 ? (bArr[i2] << 24) >>> 8 : 0) | (i3 > 1 ? (bArr[i2 + 1] << 24) >>> 16 : 0) | (i3 > 2 ? (bArr[i2 + 2] << 24) >>> 24 : 0);
        if (i3 == 1) {
            bArr2[i4] = bArr3[i5 >>> 18];
            bArr2[i4 + 1] = bArr3[(i5 >>> 12) & 63];
            bArr2[i4 + 2] = 61;
            bArr2[i4 + 3] = 61;
            return bArr2;
        }
        if (i3 == 2) {
            bArr2[i4] = bArr3[i5 >>> 18];
            bArr2[i4 + 1] = bArr3[(i5 >>> 12) & 63];
            bArr2[i4 + 2] = bArr3[(i5 >>> 6) & 63];
            bArr2[i4 + 3] = 61;
            return bArr2;
        }
        if (i3 != 3) {
            return bArr2;
        }
        bArr2[i4] = bArr3[i5 >>> 18];
        bArr2[i4 + 1] = bArr3[(i5 >>> 12) & 63];
        bArr2[i4 + 2] = bArr3[(i5 >>> 6) & 63];
        bArr2[i4 + 3] = bArr3[i5 & 63];
        return bArr2;
    }
}
