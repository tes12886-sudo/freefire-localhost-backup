package j.d.e.n.c;

import com.appff.haptic.base.Utils;
import j.d.a.e.a.a.i.g;
import j.d.e.h;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    private static final int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[j.d.e.n.b.b.values().length];
            a = iArr;
            try {
                iArr[j.d.e.n.b.b.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[j.d.e.n.b.b.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[j.d.e.n.b.b.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[j.d.e.n.b.b.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static void a(String str, j.d.e.j.a aVar, String str2) throws h {
        try {
            for (byte b : str.getBytes(str2)) {
                aVar.e(b, 8);
            }
        } catch (UnsupportedEncodingException e) {
            throw new h(e);
        }
    }

    static void b(CharSequence charSequence, j.d.e.j.a aVar) throws h {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length) {
            int iP = p(charSequence.charAt(i2));
            if (iP == -1) {
                throw new h();
            }
            int i3 = i2 + 1;
            if (i3 < length) {
                int iP2 = p(charSequence.charAt(i3));
                if (iP2 == -1) {
                    throw new h();
                }
                aVar.e((iP * 45) + iP2, 11);
                i2 += 2;
            } else {
                aVar.e(iP, 6);
                i2 = i3;
            }
        }
    }

    static void c(String str, j.d.e.n.b.b bVar, j.d.e.j.a aVar, String str2) throws h {
        int i2 = a.a[bVar.ordinal()];
        if (i2 == 1) {
            h(str, aVar);
            return;
        }
        if (i2 == 2) {
            b(str, aVar);
        } else if (i2 == 3) {
            a(str, aVar, str2);
        } else {
            if (i2 != 4) {
                throw new h("Invalid mode: ".concat(String.valueOf(bVar)));
            }
            e(str, aVar);
        }
    }

    private static void d(j.d.e.j.c cVar, j.d.e.j.a aVar) {
        aVar.e(j.d.e.n.b.b.ECI.a(), 4);
        aVar.e(cVar.c(), 8);
    }

    static void e(String str, j.d.e.j.a aVar) throws h {
        int i2;
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            for (int i3 = 0; i3 < length; i3 += 2) {
                int i4 = ((bytes[i3] & 255) << 8) | (bytes[i3 + 1] & 255);
                int i5 = 33088;
                if (i4 >= 33088 && i4 <= 40956) {
                    i2 = i4 - i5;
                } else if (i4 < 57408 || i4 > 60351) {
                    i2 = -1;
                } else {
                    i5 = 49472;
                    i2 = i4 - i5;
                }
                if (i2 == -1) {
                    throw new h("Invalid byte sequence");
                }
                aVar.e(((i2 >> 8) * g.STATUS_RUNNING) + (i2 & Utils.MAX_STRENGTH_VALUE), 13);
            }
        } catch (UnsupportedEncodingException e) {
            throw new h(e);
        }
    }

    static void f(int i2, j.d.e.n.b.c cVar, j.d.e.n.b.b bVar, j.d.e.j.a aVar) throws h {
        int iC = bVar.c(cVar);
        int i3 = 1 << iC;
        if (i2 < i3) {
            aVar.e(i2, iC);
            return;
        }
        throw new h(i2 + " is bigger than " + (i3 - 1));
    }

    static void g(j.d.e.n.b.b bVar, j.d.e.j.a aVar) {
        aVar.e(bVar.a(), 4);
    }

    static void h(CharSequence charSequence, j.d.e.j.a aVar) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length) {
            int iCharAt = charSequence.charAt(i2) - '0';
            int i3 = i2 + 2;
            if (i3 < length) {
                aVar.e((iCharAt * 100) + ((charSequence.charAt(i2 + 1) - '0') * 10) + (charSequence.charAt(i3) - '0'), 10);
                i2 += 3;
            } else {
                i2++;
                if (i2 < length) {
                    aVar.e((iCharAt * 10) + (charSequence.charAt(i2) - '0'), 7);
                    i2 = i3;
                } else {
                    aVar.e(iCharAt, 4);
                }
            }
        }
    }

    private static int i(j.d.e.n.b.b bVar, j.d.e.j.a aVar, j.d.e.j.a aVar2, j.d.e.n.b.c cVar) {
        return aVar.k() + bVar.c(cVar) + aVar2.k();
    }

    private static int j(b bVar) {
        return d.a(bVar) + d.c(bVar) + d.d(bVar) + d.e(bVar);
    }

    private static int k(j.d.e.j.a aVar, j.d.e.n.b.a aVar2, j.d.e.n.b.c cVar, b bVar) throws h {
        int i2 = Integer.MAX_VALUE;
        int i3 = -1;
        for (int i4 = 0; i4 < 8; i4++) {
            e.a(aVar, aVar2, cVar, i4, bVar);
            int iJ = j(bVar);
            if (iJ < i2) {
                i3 = i4;
                i2 = iJ;
            }
        }
        return i3;
    }

    private static j.d.e.n.b.b l(String str, String str2) {
        if ("Shift_JIS".equals(str2) && s(str)) {
            return j.d.e.n.b.b.KANJI;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= '0' && cCharAt <= '9') {
                z2 = true;
            } else {
                if (p(cCharAt) == -1) {
                    return j.d.e.n.b.b.BYTE;
                }
                z = true;
            }
        }
        if (z) {
            return j.d.e.n.b.b.ALPHANUMERIC;
        }
        return z2 ? j.d.e.n.b.b.NUMERIC : j.d.e.n.b.b.BYTE;
    }

    private static j.d.e.n.b.c m(int i2, j.d.e.n.b.a aVar) throws h {
        for (int i3 = 1; i3 <= 40; i3++) {
            j.d.e.n.b.c cVarE = j.d.e.n.b.c.e(i3);
            if (v(i2, cVarE, aVar)) {
                return cVarE;
            }
        }
        throw new h("Data too big");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0095  */
    public static f n(String str, j.d.e.n.b.a aVar, Map<j.d.e.c, ?> map) throws h {
        j.d.e.n.b.c cVarT;
        j.d.e.j.c cVarA;
        boolean z = map != null && map.containsKey(j.d.e.c.CHARACTER_SET);
        String string = z ? map.get(j.d.e.c.CHARACTER_SET).toString() : "ISO-8859-1";
        j.d.e.n.b.b bVarL = l(str, string);
        j.d.e.j.a aVar2 = new j.d.e.j.a();
        j.d.e.n.b.b bVar = j.d.e.n.b.b.BYTE;
        if (bVarL == bVar && z && (cVarA = j.d.e.j.c.a(string)) != null) {
            d(cVarA, aVar2);
        }
        if ((map != null && map.containsKey(j.d.e.c.GS1_FORMAT)) && Boolean.valueOf(map.get(j.d.e.c.GS1_FORMAT).toString()).booleanValue()) {
            g(j.d.e.n.b.b.FNC1_FIRST_POSITION, aVar2);
        }
        g(bVarL, aVar2);
        j.d.e.j.a aVar3 = new j.d.e.j.a();
        c(str, bVarL, aVar3, string);
        if (map != null) {
            j.d.e.c cVar = j.d.e.c.QR_VERSION;
            if (map.containsKey(cVar)) {
                cVarT = j.d.e.n.b.c.e(Integer.parseInt(map.get(cVar).toString()));
                if (!v(i(bVarL, aVar2, aVar3, cVarT), cVarT, aVar)) {
                    throw new h("Data too big for requested version");
                }
            } else {
                cVarT = t(aVar, bVarL, aVar2, aVar3);
            }
        } else {
            cVarT = t(aVar, bVarL, aVar2, aVar3);
        }
        j.d.e.j.a aVar4 = new j.d.e.j.a();
        aVar4.d(aVar2);
        f(bVarL == bVar ? aVar3.m() : str.length(), cVarT, bVarL, aVar4);
        aVar4.d(aVar3);
        j.d.e.n.b.c.b bVarC = cVarT.c(aVar);
        int iD = cVarT.d() - bVarC.d();
        u(iD, aVar4);
        j.d.e.j.a aVarR = r(aVar4, cVarT.d(), iD, bVarC.c());
        f fVar = new f();
        fVar.c(aVar);
        fVar.f(bVarL);
        fVar.g(cVarT);
        int iB = cVarT.b();
        b bVar2 = new b(iB, iB);
        int iK = k(aVarR, aVar, cVarT, bVar2);
        fVar.d(iK);
        e.a(aVarR, aVar, cVarT, iK, bVar2);
        fVar.e(bVar2);
        return fVar;
    }

    static byte[] o(byte[] bArr, int i2) {
        int length = bArr.length;
        int[] iArr = new int[length + i2];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = bArr[i3] & 255;
        }
        new j.d.e.j.d.c(j.d.e.j.d.a.f2120k).b(iArr, i2);
        byte[] bArr2 = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr2[i4] = (byte) iArr[length + i4];
        }
        return bArr2;
    }

    static int p(int i2) {
        int[] iArr = a;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    static void q(int i2, int i3, int i4, int i5, int[] iArr, int[] iArr2) throws h {
        if (i5 >= i4) {
            throw new h("Block ID too large");
        }
        int i6 = i2 % i4;
        int i7 = i4 - i6;
        int i8 = i2 / i4;
        int i9 = i8 + 1;
        int i10 = i3 / i4;
        int i11 = i10 + 1;
        int i12 = i8 - i10;
        int i13 = i9 - i11;
        if (i12 != i13) {
            throw new h("EC bytes mismatch");
        }
        if (i4 != i7 + i6) {
            throw new h("RS blocks mismatch");
        }
        if (i2 != ((i10 + i12) * i7) + ((i11 + i13) * i6)) {
            throw new h("Total bytes mismatch");
        }
        if (i5 < i7) {
            iArr[0] = i10;
            iArr2[0] = i12;
        } else {
            iArr[0] = i11;
            iArr2[0] = i13;
        }
    }

    static j.d.e.j.a r(j.d.e.j.a aVar, int i2, int i3, int i4) throws h {
        if (aVar.m() != i3) {
            throw new h("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i4);
        int i5 = 0;
        int iMax = 0;
        int iMax2 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            q(i2, i3, i4, i6, iArr, iArr2);
            int i7 = iArr[0];
            byte[] bArr = new byte[i7];
            aVar.o(i5 << 3, bArr, 0, i7);
            byte[] bArrO = o(bArr, iArr2[0]);
            arrayList.add(new j.d.e.n.c.a(bArr, bArrO));
            iMax = Math.max(iMax, i7);
            iMax2 = Math.max(iMax2, bArrO.length);
            i5 += iArr[0];
        }
        if (i3 != i5) {
            throw new h("Data bytes does not match offset");
        }
        j.d.e.j.a aVar2 = new j.d.e.j.a();
        for (int i8 = 0; i8 < iMax; i8++) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] bArrA = ((j.d.e.n.c.a) it.next()).a();
                if (i8 < bArrA.length) {
                    aVar2.e(bArrA[i8], 8);
                }
            }
        }
        for (int i9 = 0; i9 < iMax2; i9++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] bArrB = ((j.d.e.n.c.a) it2.next()).b();
                if (i9 < bArrB.length) {
                    aVar2.e(bArrB[i9], 8);
                }
            }
        }
        if (i2 == aVar2.m()) {
            return aVar2;
        }
        throw new h("Interleaving error: " + i2 + " and " + aVar2.m() + " differ.");
    }

    private static boolean s(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i2 = 0; i2 < length; i2 += 2) {
                int i3 = bytes[i2] & 255;
                if ((i3 < 129 || i3 > 159) && (i3 < 224 || i3 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    private static j.d.e.n.b.c t(j.d.e.n.b.a aVar, j.d.e.n.b.b bVar, j.d.e.j.a aVar2, j.d.e.j.a aVar3) {
        return m(i(bVar, aVar2, aVar3, m(i(bVar, aVar2, aVar3, j.d.e.n.b.c.e(1)), aVar)), aVar);
    }

    static void u(int i2, j.d.e.j.a aVar) throws h {
        int i3 = i2 << 3;
        if (aVar.k() > i3) {
            throw new h("data bits cannot fit in the QR Code" + aVar.k() + " > " + i3);
        }
        for (int i4 = 0; i4 < 4 && aVar.k() < i3; i4++) {
            aVar.a(false);
        }
        int iK = aVar.k() & 7;
        if (iK > 0) {
            while (iK < 8) {
                aVar.a(false);
                iK++;
            }
        }
        int iM = i2 - aVar.m();
        for (int i5 = 0; i5 < iM; i5++) {
            aVar.e((i5 & 1) == 0 ? 236 : 17, 8);
        }
        if (aVar.k() != i3) {
            throw new h("Bits size does not equal capacity");
        }
    }

    private static boolean v(int i2, j.d.e.n.b.c cVar, j.d.e.n.b.a aVar) {
        return cVar.d() - cVar.c(aVar).d() >= (i2 + 7) / 8;
    }
}
