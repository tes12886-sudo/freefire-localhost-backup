package j.d.e.i;

import j.d.e.g;
import j.d.e.i.b.c;
import j.d.e.j.b;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a implements g {
    private static b b(String str, j.d.e.a aVar, int i2, int i3, Charset charset, int i4, int i5) {
        if (aVar == j.d.e.a.AZTEC) {
            return c(c.d(str.getBytes(charset), i4, i5), i2, i3);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(aVar)));
    }

    private static b c(j.d.e.i.b.a aVar, int i2, int i3) {
        b bVarA = aVar.a();
        if (bVarA == null) {
            throw new IllegalStateException();
        }
        int i4 = bVarA.i();
        int iH = bVarA.h();
        int iMax = Math.max(i2, i4);
        int iMax2 = Math.max(i3, iH);
        int iMin = Math.min(iMax / i4, iMax2 / iH);
        int i5 = (iMax - (i4 * iMin)) / 2;
        int i6 = (iMax2 - (iH * iMin)) / 2;
        b bVar = new b(iMax, iMax2);
        int i7 = 0;
        while (i7 < iH) {
            int i8 = i5;
            int i9 = 0;
            while (i9 < i4) {
                if (bVarA.g(i9, i7)) {
                    bVar.m(i8, i6, iMin, iMin);
                }
                i9++;
                i8 += iMin;
            }
            i7++;
            i6 += iMin;
        }
        return bVar;
    }

    @Override // j.d.e.g
    public b a(String str, j.d.e.a aVar, int i2, int i3, Map<j.d.e.c, ?> map) {
        Charset charset;
        int i4;
        int i5;
        Charset charsetForName = StandardCharsets.ISO_8859_1;
        if (map != null) {
            j.d.e.c cVar = j.d.e.c.CHARACTER_SET;
            if (map.containsKey(cVar)) {
                charsetForName = Charset.forName(map.get(cVar).toString());
            }
            j.d.e.c cVar2 = j.d.e.c.ERROR_CORRECTION;
            int i6 = map.containsKey(cVar2) ? Integer.parseInt(map.get(cVar2).toString()) : 33;
            j.d.e.c cVar3 = j.d.e.c.AZTEC_LAYERS;
            if (map.containsKey(cVar3)) {
                charset = charsetForName;
                i4 = i6;
                i5 = Integer.parseInt(map.get(cVar3).toString());
            } else {
                charset = charsetForName;
                i4 = i6;
            }
            return b(str, aVar, i2, i3, charset, i4, i5);
        }
        charset = charsetForName;
        i4 = 33;
        i5 = 0;
        return b(str, aVar, i2, i3, charset, i4, i5);
    }
}
