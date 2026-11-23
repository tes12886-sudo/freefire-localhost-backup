package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class sb {
    private static final pb a;

    static {
        if (nb.f() && nb.g()) {
            int i2 = n7.a;
        }
        a = new qb();
    }

    public static boolean a(byte[] bArr) {
        return a.a(bArr, 0, bArr.length);
    }

    public static boolean b(byte[] bArr, int i2, int i3) {
        return a.a(bArr, i2, i3);
    }

    static int c(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        while (i3 < length && charSequence.charAt(i3) < 128) {
            i3++;
        }
        int i4 = length;
        while (i3 < length) {
            char cCharAt = charSequence.charAt(i3);
            if (cCharAt >= 2048) {
                int length2 = charSequence.length();
                while (i3 < length2) {
                    char cCharAt2 = charSequence.charAt(i3);
                    if (cCharAt2 < 2048) {
                        i2 += (127 - cCharAt2) >>> 31;
                    } else {
                        i2 += 2;
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i3) < 65536) {
                                throw new rb(i3, length2);
                            }
                            i3++;
                        }
                    }
                    i3++;
                }
                i4 += i2;
                break;
            }
            i4 += (127 - cCharAt) >>> 31;
            i3++;
        }
        if (i4 >= length) {
            return i4;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(((long) i4) + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    static int d(CharSequence charSequence, byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        char cCharAt;
        int length = charSequence.length();
        int i7 = i3 + i2;
        int i8 = 0;
        while (i8 < length && (i6 = i8 + i2) < i7 && (cCharAt = charSequence.charAt(i8)) < 128) {
            bArr[i6] = (byte) cCharAt;
            i8++;
        }
        if (i8 == length) {
            return i2 + length;
        }
        int i9 = i2 + i8;
        while (i8 < length) {
            char cCharAt2 = charSequence.charAt(i8);
            if (cCharAt2 >= 128 || i9 >= i7) {
                if (cCharAt2 < 2048 && i9 <= i7 - 2) {
                    int i10 = i9 + 1;
                    bArr[i9] = (byte) ((cCharAt2 >>> 6) | 960);
                    i9 = i10 + 1;
                    bArr[i10] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i9 > i7 - 3) {
                        if (i9 > i7 - 4) {
                            if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i5 = i8 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i5)))) {
                                throw new rb(i8, length);
                            }
                            StringBuilder sb = new StringBuilder(37);
                            sb.append("Failed writing ");
                            sb.append(cCharAt2);
                            sb.append(" at index ");
                            sb.append(i9);
                            throw new ArrayIndexOutOfBoundsException(sb.toString());
                        }
                        int i11 = i8 + 1;
                        if (i11 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i11);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                int i12 = i9 + 1;
                                bArr[i9] = (byte) ((codePoint >>> 18) | 240);
                                int i13 = i12 + 1;
                                bArr[i12] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i14 = i13 + 1;
                                bArr[i13] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i9 = i14 + 1;
                                bArr[i14] = (byte) ((codePoint & 63) | 128);
                                i8 = i11;
                            } else {
                                i8 = i11;
                            }
                        }
                        throw new rb(i8 - 1, length);
                    }
                    int i15 = i9 + 1;
                    bArr[i9] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i16 = i15 + 1;
                    bArr[i15] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i4 = i16 + 1;
                    bArr[i16] = (byte) ((cCharAt2 & '?') | 128);
                }
                i8++;
            } else {
                i4 = i9 + 1;
                bArr[i9] = (byte) cCharAt2;
            }
            i9 = i4;
            i8++;
        }
        return i9;
    }

    static String e(byte[] bArr, int i2, int i3) throws i9 {
        int length = bArr.length;
        if ((i2 | i3 | ((length - i2) - i3)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        int i4 = i2 + i3;
        char[] cArr = new char[i3];
        int i5 = 0;
        while (i2 < i4) {
            byte b = bArr[i2];
            if (!ob.a(b)) {
                break;
            }
            i2++;
            cArr[i5] = (char) b;
            i5++;
        }
        while (i2 < i4) {
            int i6 = i2 + 1;
            byte b2 = bArr[i2];
            if (ob.a(b2)) {
                int i7 = i5 + 1;
                cArr[i5] = (char) b2;
                i2 = i6;
                while (true) {
                    i5 = i7;
                    if (i2 >= i4) {
                        break;
                    }
                    byte b3 = bArr[i2];
                    if (!ob.a(b3)) {
                        break;
                    }
                    i2++;
                    i7 = i5 + 1;
                    cArr[i5] = (char) b3;
                }
            } else if (b2 < -32) {
                if (i6 >= i4) {
                    throw i9.f();
                }
                ob.b(b2, bArr[i6], cArr, i5);
                i2 = i6 + 1;
                i5++;
            } else if (b2 < -16) {
                if (i6 >= i4 - 1) {
                    throw i9.f();
                }
                int i8 = i6 + 1;
                ob.c(b2, bArr[i6], bArr[i8], cArr, i5);
                i2 = i8 + 1;
                i5++;
            } else {
                if (i6 >= i4 - 2) {
                    throw i9.f();
                }
                int i9 = i6 + 1;
                int i10 = i9 + 1;
                ob.d(b2, bArr[i6], bArr[i9], bArr[i10], cArr, i5);
                i5 += 2;
                i2 = i10 + 1;
            }
        }
        return new String(cArr, 0, i5);
    }

    static /* synthetic */ int f(byte[] bArr, int i2, int i3) {
        byte b = bArr[i2 - 1];
        int i4 = i3 - i2;
        if (i4 != 0) {
            if (i4 == 1) {
                byte b2 = bArr[i2];
                if (b <= -12 && b2 <= -65) {
                    return b ^ (b2 << 8);
                }
            } else {
                if (i4 != 2) {
                    throw new AssertionError();
                }
                byte b3 = bArr[i2];
                byte b4 = bArr[i2 + 1];
                if (b <= -12 && b3 <= -65 && b4 <= -65) {
                    return ((b3 << 8) ^ b) ^ (b4 << 16);
                }
            }
        } else if (b <= -12) {
            return b;
        }
        return -1;
    }
}
