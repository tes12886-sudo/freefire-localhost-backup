package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class p7 {
    static int a(byte[] bArr, int i2, o7 o7Var) {
        int i3 = i2 + 1;
        byte b = bArr[i2];
        if (b < 0) {
            return b(b, bArr, i3, o7Var);
        }
        o7Var.a = b;
        return i3;
    }

    static int b(int i2, byte[] bArr, int i3, o7 o7Var) {
        int i4;
        int i5;
        int i6 = i2 & 127;
        int i7 = i3 + 1;
        byte b = bArr[i3];
        if (b < 0) {
            int i8 = i6 | ((b & 127) << 7);
            int i9 = i7 + 1;
            byte b2 = bArr[i7];
            if (b2 >= 0) {
                i4 = b2 << 14;
            } else {
                i6 = i8 | ((b2 & 127) << 14);
                i7 = i9 + 1;
                byte b3 = bArr[i9];
                if (b3 >= 0) {
                    i5 = b3 << 21;
                } else {
                    i8 = i6 | ((b3 & 127) << 21);
                    i9 = i7 + 1;
                    byte b4 = bArr[i7];
                    if (b4 >= 0) {
                        i4 = b4 << 28;
                    } else {
                        int i10 = i8 | ((b4 & 127) << 28);
                        while (true) {
                            int i11 = i9 + 1;
                            if (bArr[i9] >= 0) {
                                o7Var.a = i10;
                                return i11;
                            }
                            i9 = i11;
                        }
                    }
                }
            }
            o7Var.a = i8 | i4;
            return i9;
        }
        i5 = b << 7;
        o7Var.a = i6 | i5;
        return i7;
    }

    static int c(byte[] bArr, int i2, o7 o7Var) {
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        if (j2 >= 0) {
            o7Var.b = j2;
            return i3;
        }
        int i4 = i3 + 1;
        byte b = bArr[i3];
        long j3 = (j2 & 127) | (((long) (b & 127)) << 7);
        int i5 = 7;
        while (b < 0) {
            int i6 = i4 + 1;
            byte b2 = bArr[i4];
            i5 += 7;
            j3 |= ((long) (b2 & 127)) << i5;
            b = b2;
            i4 = i6;
        }
        o7Var.b = j3;
        return i4;
    }

    static int d(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    static long e(byte[] bArr, int i2) {
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    static int f(byte[] bArr, int i2, o7 o7Var) {
        int iA = a(bArr, i2, o7Var);
        int i3 = o7Var.a;
        if (i3 < 0) {
            throw i9.b();
        }
        if (i3 == 0) {
            o7Var.c = "";
            return iA;
        }
        o7Var.c = new String(bArr, iA, i3, g9.a);
        return iA + i3;
    }

    static int g(byte[] bArr, int i2, o7 o7Var) {
        int iA = a(bArr, i2, o7Var);
        int i3 = o7Var.a;
        if (i3 < 0) {
            throw i9.b();
        }
        if (i3 == 0) {
            o7Var.c = "";
            return iA;
        }
        o7Var.c = sb.e(bArr, iA, i3);
        return iA + i3;
    }

    static int h(byte[] bArr, int i2, o7 o7Var) {
        int iA = a(bArr, i2, o7Var);
        int i3 = o7Var.a;
        if (i3 < 0) {
            throw i9.b();
        }
        if (i3 > bArr.length - iA) {
            throw i9.a();
        }
        if (i3 == 0) {
            o7Var.c = z7.b;
            return iA;
        }
        o7Var.c = z7.q(bArr, iA, i3);
        return iA + i3;
    }

    static int i(oa oaVar, byte[] bArr, int i2, int i3, o7 o7Var) {
        int iB = i2 + 1;
        int i4 = bArr[i2];
        if (i4 < 0) {
            iB = b(i4, bArr, iB, o7Var);
            i4 = o7Var.a;
        }
        int i5 = iB;
        if (i4 < 0 || i4 > i3 - i5) {
            throw i9.a();
        }
        Object objZza = oaVar.zza();
        int i6 = i4 + i5;
        oaVar.f(objZza, bArr, i5, i6, o7Var);
        oaVar.c(objZza);
        o7Var.c = objZza;
        return i6;
    }

    static int j(oa oaVar, byte[] bArr, int i2, int i3, int i4, o7 o7Var) {
        ga gaVar = (ga) oaVar;
        Object objZza = gaVar.zza();
        int iD = gaVar.D(objZza, bArr, i2, i3, i4, o7Var);
        gaVar.c(objZza);
        o7Var.c = objZza;
        return iD;
    }

    static int k(int i2, byte[] bArr, int i3, int i4, f9<?> f9Var, o7 o7Var) {
        a9 a9Var = (a9) f9Var;
        int iA = a(bArr, i3, o7Var);
        while (true) {
            a9Var.f(o7Var.a);
            if (iA >= i4) {
                break;
            }
            int iA2 = a(bArr, iA, o7Var);
            if (i2 != o7Var.a) {
                break;
            }
            iA = a(bArr, iA2, o7Var);
        }
        return iA;
    }

    static int l(byte[] bArr, int i2, f9<?> f9Var, o7 o7Var) {
        a9 a9Var = (a9) f9Var;
        int iA = a(bArr, i2, o7Var);
        int i3 = o7Var.a + iA;
        while (iA < i3) {
            iA = a(bArr, iA, o7Var);
            a9Var.f(o7Var.a);
        }
        if (iA == i3) {
            return iA;
        }
        throw i9.a();
    }

    static int m(oa<?> oaVar, int i2, byte[] bArr, int i3, int i4, f9<?> f9Var, o7 o7Var) {
        int i5 = i(oaVar, bArr, i3, i4, o7Var);
        while (true) {
            f9Var.add(o7Var.c);
            if (i5 >= i4) {
                break;
            }
            int iA = a(bArr, i5, o7Var);
            if (i2 != o7Var.a) {
                break;
            }
            i5 = i(oaVar, bArr, iA, i4, o7Var);
        }
        return i5;
    }

    static int n(int i2, byte[] bArr, int i3, int i4, eb ebVar, o7 o7Var) {
        if ((i2 >>> 3) == 0) {
            throw i9.c();
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            int iC = c(bArr, i3, o7Var);
            ebVar.h(i2, Long.valueOf(o7Var.b));
            return iC;
        }
        if (i5 == 1) {
            ebVar.h(i2, Long.valueOf(e(bArr, i3)));
            return i3 + 8;
        }
        if (i5 == 2) {
            int iA = a(bArr, i3, o7Var);
            int i6 = o7Var.a;
            if (i6 < 0) {
                throw i9.b();
            }
            if (i6 > bArr.length - iA) {
                throw i9.a();
            }
            ebVar.h(i2, i6 == 0 ? z7.b : z7.q(bArr, iA, i6));
            return iA + i6;
        }
        if (i5 != 3) {
            if (i5 != 5) {
                throw i9.c();
            }
            ebVar.h(i2, Integer.valueOf(d(bArr, i3)));
            return i3 + 4;
        }
        int i7 = (i2 & (-8)) | 4;
        eb ebVarB = eb.b();
        int i8 = 0;
        while (i3 < i4) {
            int iA2 = a(bArr, i3, o7Var);
            int i9 = o7Var.a;
            i8 = i9;
            if (i9 == i7) {
                i3 = iA2;
                break;
            }
            int iN = n(i8, bArr, iA2, i4, ebVarB, o7Var);
            i8 = i9;
            i3 = iN;
        }
        if (i3 > i4 || i8 != i7) {
            throw i9.e();
        }
        ebVar.h(i2, ebVarB);
        return i3;
    }
}
