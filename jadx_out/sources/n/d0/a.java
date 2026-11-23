package n.d0;

import java.io.EOFException;
import l.y.c.i;
import n.b0;
import n.o;
import n.s;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static final byte[] a = b0.a("0123456789abcdef");

    public static final byte[] a() {
        return a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public static final String b(n.b bVar, long j2) throws EOFException {
        String strI;
        i.e(bVar, "<this>");
        long j3 = 1;
        if (j2 > 0) {
            long j4 = j2 - 1;
            if (bVar.d0(j4) == ((byte) 13)) {
                strI = bVar.i(j4);
                j3 = 2;
            } else {
                strI = bVar.i(j2);
            }
        } else {
            strI = bVar.i(j2);
        }
        bVar.skip(j3);
        return strI;
    }

    public static final int c(n.b bVar, o oVar, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        s sVar;
        i.e(bVar, "<this>");
        i.e(oVar, "options");
        s sVar2 = bVar.a;
        if (sVar2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = sVar2.a;
        int i6 = sVar2.b;
        int i7 = sVar2.c;
        int[] iArrH = oVar.h();
        s sVar3 = sVar2;
        int i8 = 0;
        int i9 = -1;
        loop0: while (true) {
            int i10 = i8 + 1;
            int i11 = iArrH[i8];
            int i12 = i10 + 1;
            int i13 = iArrH[i10];
            if (i13 != -1) {
                i9 = i13;
            }
            if (sVar3 == null) {
                break;
            }
            if (i11 >= 0) {
                i2 = i6 + 1;
                int i14 = bArr[i6] & 255;
                int i15 = i12 + i11;
                while (i12 != i15) {
                    if (i14 == iArrH[i12]) {
                        i3 = iArrH[i12 + i11];
                        if (i2 == i7) {
                            sVar3 = sVar3.f;
                            i.c(sVar3);
                            i2 = sVar3.b;
                            bArr = sVar3.a;
                            i7 = sVar3.c;
                            if (sVar3 == sVar2) {
                                sVar3 = null;
                            }
                        }
                    } else {
                        i12++;
                    }
                }
                return i9;
            }
            int i16 = i12 + (i11 * (-1));
            while (true) {
                int i17 = i6 + 1;
                int i18 = i12 + 1;
                if ((bArr[i6] & 255) != iArrH[i12]) {
                    return i9;
                }
                boolean z2 = i18 == i16;
                if (i17 == i7) {
                    i.c(sVar3);
                    s sVar4 = sVar3.f;
                    i.c(sVar4);
                    i5 = sVar4.b;
                    byte[] bArr2 = sVar4.a;
                    i4 = sVar4.c;
                    if (sVar4 != sVar2) {
                        sVar = sVar4;
                        bArr = bArr2;
                    } else {
                        if (!z2) {
                            break loop0;
                        }
                        bArr = bArr2;
                        sVar = null;
                    }
                } else {
                    s sVar5 = sVar3;
                    i4 = i7;
                    i5 = i17;
                    sVar = sVar5;
                }
                if (z2) {
                    i3 = iArrH[i18];
                    i2 = i5;
                    i7 = i4;
                    sVar3 = sVar;
                    break;
                }
                i6 = i5;
                i7 = i4;
                i12 = i18;
                sVar3 = sVar;
            }
            if (i3 >= 0) {
                return i3;
            }
            i8 = -i3;
            i6 = i2;
        }
        if (z) {
            return -2;
        }
        return i9;
    }

    public static /* synthetic */ int d(n.b bVar, o oVar, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return c(bVar, oVar, z);
    }
}
