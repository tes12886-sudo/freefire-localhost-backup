package j.d.e.i.b;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    private static final int[] a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    private static int[] a(j.d.e.j.a aVar, int i2, int i3) {
        int[] iArr = new int[i3];
        int iK = aVar.k() / i2;
        for (int i4 = 0; i4 < iK; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                i5 |= aVar.i((i4 * i2) + i6) ? 1 << ((i2 - i6) - 1) : 0;
            }
            iArr[i4] = i5;
        }
        return iArr;
    }

    private static void b(j.d.e.j.b bVar, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4 += 2) {
            int i5 = i2 - i4;
            int i6 = i5;
            while (true) {
                int i7 = i2 + i4;
                if (i6 <= i7) {
                    bVar.k(i6, i5);
                    bVar.k(i6, i7);
                    bVar.k(i5, i6);
                    bVar.k(i7, i6);
                    i6++;
                }
            }
        }
        int i8 = i2 - i3;
        bVar.k(i8, i8);
        int i9 = i8 + 1;
        bVar.k(i9, i8);
        bVar.k(i8, i9);
        int i10 = i2 + i3;
        bVar.k(i10, i8);
        bVar.k(i10, i9);
        bVar.k(i10, i10 - 1);
    }

    private static void c(j.d.e.j.b bVar, boolean z, int i2, j.d.e.j.a aVar) {
        int i3 = i2 / 2;
        int i4 = 0;
        if (z) {
            while (i4 < 7) {
                int i5 = (i3 - 3) + i4;
                if (aVar.i(i4)) {
                    bVar.k(i5, i3 - 5);
                }
                if (aVar.i(i4 + 7)) {
                    bVar.k(i3 + 5, i5);
                }
                if (aVar.i(20 - i4)) {
                    bVar.k(i5, i3 + 5);
                }
                if (aVar.i(27 - i4)) {
                    bVar.k(i3 - 5, i5);
                }
                i4++;
            }
            return;
        }
        while (i4 < 10) {
            int i6 = (i3 - 5) + i4 + (i4 / 5);
            if (aVar.i(i4)) {
                bVar.k(i6, i3 - 7);
            }
            if (aVar.i(i4 + 10)) {
                bVar.k(i3 + 7, i6);
            }
            if (aVar.i(29 - i4)) {
                bVar.k(i6, i3 + 7);
            }
            if (aVar.i(39 - i4)) {
                bVar.k(i3 - 7, i6);
            }
            i4++;
        }
    }

    public static a d(byte[] bArr, int i2, int i3) {
        j.d.e.j.a aVarH;
        int i4;
        boolean z;
        int iAbs;
        int i5;
        int i6;
        j.d.e.j.a aVarA = new d(bArr).a();
        int iK = ((aVarA.k() * i2) / 100) + 11;
        int iK2 = aVarA.k() + iK;
        int i7 = 0;
        int i8 = 1;
        if (i3 != 0) {
            z = i3 < 0;
            iAbs = Math.abs(i3);
            if (iAbs > (z ? 4 : 32)) {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i3)));
            }
            i5 = i(iAbs, z);
            i4 = a[iAbs];
            int i9 = i5 - (i5 % i4);
            aVarH = h(aVarA, i4);
            if (aVarH.k() + iK > i9) {
                throw new IllegalArgumentException("Data to large for user specified layer");
            }
            if (z && aVarH.k() > (i4 << 6)) {
                throw new IllegalArgumentException("Data to large for user specified layer");
            }
        } else {
            j.d.e.j.a aVarH2 = null;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i10 > 32) {
                    throw new IllegalArgumentException("Data too large for an Aztec code");
                }
                boolean z2 = i10 <= 3;
                int i12 = z2 ? i10 + 1 : i10;
                int i13 = i(i12, z2);
                if (iK2 <= i13) {
                    if (aVarH2 == null || i11 != a[i12]) {
                        int i14 = a[i12];
                        i11 = i14;
                        aVarH2 = h(aVarA, i14);
                    }
                    int i15 = i13 - (i13 % i11);
                    if ((!z2 || aVarH2.k() <= (i11 << 6)) && aVarH2.k() + iK <= i15) {
                        aVarH = aVarH2;
                        i4 = i11;
                        z = z2;
                        iAbs = i12;
                        i5 = i13;
                        break;
                    }
                }
                i10++;
                i7 = 0;
                i8 = 1;
            }
        }
        j.d.e.j.a aVarE = e(aVarH, i5, i4);
        int iK3 = aVarH.k() / i4;
        j.d.e.j.a aVarF = f(z, iAbs, iK3);
        int i16 = (z ? 11 : 14) + (iAbs << 2);
        int[] iArr = new int[i16];
        int i17 = 2;
        if (z) {
            for (int i18 = 0; i18 < i16; i18++) {
                iArr[i18] = i18;
            }
            i6 = i16;
        } else {
            int i19 = i16 / 2;
            i6 = i16 + 1 + (((i19 - 1) / 15) * 2);
            int i20 = i6 / 2;
            for (int i21 = 0; i21 < i19; i21++) {
                int i22 = (i21 / 15) + i21;
                iArr[(i19 - i21) - i8] = (i20 - i22) - 1;
                iArr[i19 + i21] = i22 + i20 + i8;
            }
        }
        j.d.e.j.b bVar = new j.d.e.j.b(i6);
        int i23 = 0;
        int i24 = 0;
        while (i23 < iAbs) {
            int i25 = ((iAbs - i23) << i17) + (z ? 9 : 12);
            int i26 = 0;
            while (i26 < i25) {
                int i27 = i26 << 1;
                while (i7 < i17) {
                    if (aVarE.i(i24 + i27 + i7)) {
                        int i28 = i23 << 1;
                        bVar.k(iArr[i28 + i7], iArr[i28 + i26]);
                    }
                    if (aVarE.i((i25 << 1) + i24 + i27 + i7)) {
                        int i29 = i23 << 1;
                        bVar.k(iArr[i29 + i26], iArr[((i16 - 1) - i29) - i7]);
                    }
                    if (aVarE.i((i25 << 2) + i24 + i27 + i7)) {
                        int i30 = (i16 - 1) - (i23 << 1);
                        bVar.k(iArr[i30 - i7], iArr[i30 - i26]);
                    }
                    if (aVarE.i((i25 * 6) + i24 + i27 + i7)) {
                        int i31 = i23 << 1;
                        bVar.k(iArr[((i16 - 1) - i31) - i26], iArr[i31 + i7]);
                    }
                    i7++;
                    i17 = 2;
                }
                i26++;
                i7 = 0;
                i17 = 2;
            }
            i24 += i25 << 3;
            i23++;
            i7 = 0;
            i17 = 2;
        }
        c(bVar, z, i6, aVarF);
        int i32 = i6 / 2;
        if (z) {
            b(bVar, i32, 5);
        } else {
            b(bVar, i32, 7);
            int i33 = 0;
            int i34 = 0;
            while (i34 < (i16 / 2) - 1) {
                for (int i35 = i32 & 1; i35 < i6; i35 += 2) {
                    int i36 = i32 - i33;
                    bVar.k(i36, i35);
                    int i37 = i32 + i33;
                    bVar.k(i37, i35);
                    bVar.k(i35, i36);
                    bVar.k(i35, i37);
                }
                i34 += 15;
                i33 += 16;
            }
        }
        a aVar = new a();
        aVar.c(z);
        aVar.f(i6);
        aVar.d(iAbs);
        aVar.b(iK3);
        aVar.e(bVar);
        return aVar;
    }

    private static j.d.e.j.a e(j.d.e.j.a aVar, int i2, int i3) {
        int iK = aVar.k() / i3;
        j.d.e.j.d.c cVar = new j.d.e.j.d.c(g(i3));
        int i4 = i2 / i3;
        int[] iArrA = a(aVar, i3, i4);
        cVar.b(iArrA, i4 - iK);
        j.d.e.j.a aVar2 = new j.d.e.j.a();
        aVar2.e(0, i2 % i3);
        for (int i5 : iArrA) {
            aVar2.e(i5, i3);
        }
        return aVar2;
    }

    static j.d.e.j.a f(boolean z, int i2, int i3) {
        int i4;
        j.d.e.j.a aVar = new j.d.e.j.a();
        int i5 = i2 - 1;
        if (z) {
            aVar.e(i5, 2);
            aVar.e(i3 - 1, 6);
            i4 = 28;
        } else {
            aVar.e(i5, 5);
            aVar.e(i3 - 1, 11);
            i4 = 40;
        }
        return e(aVar, i4, 4);
    }

    private static j.d.e.j.d.a g(int i2) {
        if (i2 == 4) {
            return j.d.e.j.d.a.f2119j;
        }
        if (i2 == 6) {
            return j.d.e.j.d.a.f2118i;
        }
        if (i2 == 8) {
            return j.d.e.j.d.a.f2121l;
        }
        if (i2 == 10) {
            return j.d.e.j.d.a.f2117h;
        }
        if (i2 == 12) {
            return j.d.e.j.d.a.f2116g;
        }
        throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i2)));
    }

    static j.d.e.j.a h(j.d.e.j.a aVar, int i2) {
        j.d.e.j.a aVar2 = new j.d.e.j.a();
        int iK = aVar.k();
        int i3 = (1 << i2) - 2;
        int i4 = 0;
        while (i4 < iK) {
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                int i7 = i4 + i6;
                if (i7 >= iK || aVar.i(i7)) {
                    i5 |= 1 << ((i2 - 1) - i6);
                }
            }
            int i8 = i5 & i3;
            if (i8 == i3) {
                aVar2.e(i8, i2);
                i4--;
            } else if (i8 == 0) {
                i8 = i5 | 1;
                aVar2.e(i8, i2);
                i4--;
            } else {
                aVar2.e(i5, i2);
            }
            i4 += i2;
        }
        return aVar2;
    }

    private static int i(int i2, boolean z) {
        return ((z ? 88 : 112) + (i2 << 4)) * i2;
    }
}
