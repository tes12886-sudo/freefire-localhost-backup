package n;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {
    private static final byte[] a;

    static {
        e.a aVar = e.d;
        a = aVar.d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").f();
        aVar.d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").f();
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00b8 A[LOOP:1: B:16:0x003e->B:63:0x00b8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:87:0x00b4 A[SYNTHETIC] */
    public static final byte[] a(String str) {
        int i2;
        int i3;
        int i4;
        int i5;
        char cCharAt;
        l.y.c.i.e(str, "<this>");
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i6 = (int) ((((long) length) * 6) / 8);
        byte[] bArr = new byte[i6];
        if (length > 0) {
            int i7 = 0;
            i3 = 0;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                int i10 = i7 + 1;
                char cCharAt2 = str.charAt(i7);
                if ('A' <= cCharAt2 && cCharAt2 <= 'Z') {
                    i5 = cCharAt2 - 'A';
                } else {
                    if ('a' <= cCharAt2 && cCharAt2 <= 'z') {
                        i5 = cCharAt2 - 'G';
                    } else {
                        if ('0' <= cCharAt2 && cCharAt2 <= '9') {
                            i5 = cCharAt2 + 4;
                        } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                            i5 = 62;
                        } else {
                            if (cCharAt2 == '/' || cCharAt2 == '_') {
                                i5 = 63;
                            } else if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                                return null;
                            }
                            if (i10 >= length) {
                                i2 = i8;
                                i4 = i9;
                                break;
                            }
                            i7 = i10;
                        }
                    }
                }
                i9 = (i9 << 6) | i5;
                i8++;
                if (i8 % 4 == 0) {
                    int i11 = i3 + 1;
                    bArr[i3] = (byte) (i9 >> 16);
                    int i12 = i11 + 1;
                    bArr[i11] = (byte) (i9 >> 8);
                    i3 = i12 + 1;
                    bArr[i12] = (byte) i9;
                }
                if (i10 >= length) {
                    i2 = i8;
                    i4 = i9;
                    break;
                }
                i7 = i10;
            }
        } else {
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i13 = i2 % 4;
        if (i13 == 1) {
            return null;
        }
        if (i13 == 2) {
            bArr[i3] = (byte) ((i4 << 12) >> 16);
            i3++;
        } else if (i13 == 3) {
            int i14 = i4 << 6;
            int i15 = i3 + 1;
            bArr[i3] = (byte) (i14 >> 16);
            i3 = i15 + 1;
            bArr[i15] = (byte) (i14 >> 8);
        }
        if (i3 == i6) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i3);
        l.y.c.i.d(bArrCopyOf, "java.util.Arrays.copyOf(this, newSize)");
        return bArrCopyOf;
    }

    public static final String b(byte[] bArr, byte[] bArr2) {
        l.y.c.i.e(bArr, "<this>");
        l.y.c.i.e(bArr2, "map");
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i2 + 1;
            byte b = bArr[i2];
            int i5 = i4 + 1;
            byte b2 = bArr[i4];
            int i6 = i5 + 1;
            byte b3 = bArr[i5];
            int i7 = i3 + 1;
            bArr3[i3] = bArr2[(b & 255) >> 2];
            int i8 = i7 + 1;
            bArr3[i7] = bArr2[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i9 = i8 + 1;
            bArr3[i8] = bArr2[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i3 = i9 + 1;
            bArr3[i9] = bArr2[b3 & 63];
            i2 = i6;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b4 = bArr[i2];
            int i10 = i3 + 1;
            bArr3[i3] = bArr2[(b4 & 255) >> 2];
            int i11 = i10 + 1;
            bArr3[i10] = bArr2[(b4 & 3) << 4];
            byte b5 = (byte) 61;
            bArr3[i11] = b5;
            bArr3[i11 + 1] = b5;
        } else if (length2 == 2) {
            int i12 = i2 + 1;
            byte b6 = bArr[i2];
            byte b7 = bArr[i12];
            int i13 = i3 + 1;
            bArr3[i3] = bArr2[(b6 & 255) >> 2];
            int i14 = i13 + 1;
            bArr3[i13] = bArr2[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            bArr3[i14] = bArr2[(b7 & 15) << 2];
            bArr3[i14 + 1] = (byte) 61;
        }
        return b0.b(bArr3);
    }

    public static /* synthetic */ String c(byte[] bArr, byte[] bArr2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bArr2 = a;
        }
        return b(bArr, bArr2);
    }
}
