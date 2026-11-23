package j.d.e.k;

import j.d.e.c;
import j.d.e.g;
import j.d.e.j.b;
import j.d.e.k.b.e;
import j.d.e.k.b.i;
import j.d.e.k.b.j;
import j.d.e.k.b.k;
import j.d.e.k.b.l;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a implements g {
    private static b b(j.d.e.n.c.b bVar, int i2, int i3) {
        b bVar2;
        int iE = bVar.e();
        int iD = bVar.d();
        int iMax = Math.max(i2, iE);
        int iMax2 = Math.max(i3, iD);
        int iMin = Math.min(iMax / iE, iMax2 / iD);
        int i4 = (iMax - (iE * iMin)) / 2;
        int i5 = (iMax2 - (iD * iMin)) / 2;
        if (i3 < iD || i2 < iE) {
            bVar2 = new b(iE, iD);
            i4 = 0;
            i5 = 0;
        } else {
            bVar2 = new b(i2, i3);
        }
        bVar2.d();
        int i6 = 0;
        while (i6 < iD) {
            int i7 = i4;
            int i8 = 0;
            while (i8 < iE) {
                if (bVar.b(i8, i6) == 1) {
                    bVar2.m(i7, i5, iMin, iMin);
                }
                i8++;
                i7 += iMin;
            }
            i6++;
            i5 += iMin;
        }
        return bVar2;
    }

    private static b c(e eVar, k kVar, int i2, int i3) {
        int iH = kVar.h();
        int iG = kVar.g();
        j.d.e.n.c.b bVar = new j.d.e.n.c.b(kVar.j(), kVar.i());
        int i4 = 0;
        for (int i5 = 0; i5 < iG; i5++) {
            if (i5 % kVar.e == 0) {
                int i6 = 0;
                for (int i7 = 0; i7 < kVar.j(); i7++) {
                    bVar.g(i6, i4, i7 % 2 == 0);
                    i6++;
                }
                i4++;
            }
            int i8 = 0;
            for (int i9 = 0; i9 < iH; i9++) {
                if (i9 % kVar.d == 0) {
                    bVar.g(i8, i4, true);
                    i8++;
                }
                bVar.g(i8, i4, eVar.e(i9, i5));
                i8++;
                int i10 = kVar.d;
                if (i9 % i10 == i10 - 1) {
                    bVar.g(i8, i4, i5 % 2 == 0);
                    i8++;
                }
            }
            i4++;
            int i11 = kVar.e;
            if (i5 % i11 == i11 - 1) {
                int i12 = 0;
                for (int i13 = 0; i13 < kVar.j(); i13++) {
                    bVar.g(i12, i4, true);
                    i12++;
                }
                i4++;
            }
        }
        return b(bVar, i2, i3);
    }

    @Override // j.d.e.g
    public b a(String str, j.d.e.a aVar, int i2, int i3, Map<c, ?> map) {
        j.d.e.b bVar;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (aVar != j.d.e.a.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(aVar)));
        }
        if (i2 < 0 || i3 < 0) {
            throw new IllegalArgumentException("Requested dimensions can't be negative: " + i2 + 'x' + i3);
        }
        l lVar = l.FORCE_NONE;
        j.d.e.b bVar2 = null;
        if (map != null) {
            l lVar2 = (l) map.get(c.DATA_MATRIX_SHAPE);
            if (lVar2 != null) {
                lVar = lVar2;
            }
            j.d.e.b bVar3 = (j.d.e.b) map.get(c.MIN_SIZE);
            if (bVar3 == null) {
                bVar3 = null;
            }
            bVar = (j.d.e.b) map.get(c.MAX_SIZE);
            if (bVar == null) {
                bVar = null;
            }
            bVar2 = bVar3;
        } else {
            bVar = null;
        }
        String strB = j.b(str, lVar, bVar2, bVar);
        k kVarL = k.l(strB.length(), lVar, bVar2, bVar, true);
        e eVar = new e(i.c(strB, kVarL), kVarL.h(), kVarL.g());
        eVar.h();
        return c(eVar, kVarL, i2, i3);
    }
}
