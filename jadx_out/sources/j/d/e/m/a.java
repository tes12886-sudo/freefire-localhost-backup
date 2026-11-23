package j.d.e.m;

import j.d.e.c;
import j.d.e.g;
import j.d.e.h;
import j.d.e.j.b;
import j.d.e.m.b.d;
import j.d.e.m.b.e;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a implements g {
    private static b b(byte[][] bArr, int i2) {
        int i3 = i2 * 2;
        b bVar = new b(bArr[0].length + i3, bArr.length + i3);
        bVar.d();
        int iH = (bVar.h() - i2) - 1;
        int i4 = 0;
        while (i4 < bArr.length) {
            byte[] bArr2 = bArr[i4];
            for (int i5 = 0; i5 < bArr[0].length; i5++) {
                if (bArr2[i5] == 1) {
                    bVar.k(i5 + i2, iH);
                }
            }
            i4++;
            iH--;
        }
        return bVar;
    }

    private static b c(e eVar, String str, int i2, int i3, int i4, int i5) throws h {
        boolean z;
        eVar.e(str, i2);
        byte[][] bArrB = eVar.f().b(1, 4);
        if ((i4 > i3) != (bArrB[0].length < bArrB.length)) {
            bArrB = d(bArrB);
            z = true;
        } else {
            z = false;
        }
        int length = i3 / bArrB[0].length;
        int length2 = i4 / bArrB.length;
        if (length >= length2) {
            length = length2;
        }
        if (length <= 1) {
            return b(bArrB, i5);
        }
        byte[][] bArrB2 = eVar.f().b(length, length << 2);
        if (z) {
            bArrB2 = d(bArrB2);
        }
        return b(bArrB2, i5);
    }

    private static byte[][] d(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) byte.class, bArr[0].length, bArr.length);
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int length = (bArr.length - i2) - 1;
            for (int i3 = 0; i3 < bArr[0].length; i3++) {
                bArr2[i3][length] = bArr[i2][i3];
            }
        }
        return bArr2;
    }

    @Override // j.d.e.g
    public b a(String str, j.d.e.a aVar, int i2, int i3, Map<c, ?> map) {
        int i4;
        int i5;
        if (aVar != j.d.e.a.PDF_417) {
            throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(aVar)));
        }
        e eVar = new e();
        if (map != null) {
            c cVar = c.PDF417_COMPACT;
            if (map.containsKey(cVar)) {
                eVar.h(Boolean.valueOf(map.get(cVar).toString()).booleanValue());
            }
            c cVar2 = c.PDF417_COMPACTION;
            if (map.containsKey(cVar2)) {
                eVar.i(j.d.e.m.b.c.valueOf(map.get(cVar2).toString()));
            }
            c cVar3 = c.PDF417_DIMENSIONS;
            if (map.containsKey(cVar3)) {
                d dVar = (d) map.get(cVar3);
                eVar.j(dVar.a(), dVar.c(), dVar.b(), dVar.d());
            }
            c cVar4 = c.MARGIN;
            int i6 = map.containsKey(cVar4) ? Integer.parseInt(map.get(cVar4).toString()) : 30;
            c cVar5 = c.ERROR_CORRECTION;
            int i7 = map.containsKey(cVar5) ? Integer.parseInt(map.get(cVar5).toString()) : 2;
            c cVar6 = c.CHARACTER_SET;
            if (map.containsKey(cVar6)) {
                eVar.k(Charset.forName(map.get(cVar6).toString()));
            }
            i5 = i6;
            i4 = i7;
        } else {
            i4 = 2;
            i5 = 30;
        }
        return c(eVar, str, i4, i2, i3, i5);
    }
}
