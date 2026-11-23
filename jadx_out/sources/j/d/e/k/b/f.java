package j.d.e.k.b;

import com.appff.haptic.base.Utils;

/* JADX INFO: loaded from: classes.dex */
final class f implements g {
    f() {
    }

    private static void b(char c, StringBuilder sb) {
        if (c >= ' ' && c <= '?') {
            sb.append(c);
        } else {
            if (c < '@' || c > '^') {
                j.e(c);
                throw null;
            }
            sb.append((char) (c - '@'));
        }
    }

    private static String c(CharSequence charSequence, int i2) {
        int length = charSequence.length() - i2;
        if (length == 0) {
            throw new IllegalStateException("StringBuilder must not be empty");
        }
        int iCharAt = (charSequence.charAt(i2) << 18) + ((length >= 2 ? charSequence.charAt(i2 + 1) : (char) 0) << '\f') + ((length >= 3 ? charSequence.charAt(i2 + 2) : (char) 0) << 6) + (length >= 4 ? charSequence.charAt(i2 + 3) : (char) 0);
        char c = (char) ((iCharAt >> 16) & Utils.MAX_STRENGTH_VALUE);
        char c2 = (char) ((iCharAt >> 8) & Utils.MAX_STRENGTH_VALUE);
        char c3 = (char) (iCharAt & Utils.MAX_STRENGTH_VALUE);
        StringBuilder sb = new StringBuilder(3);
        sb.append(c);
        if (length >= 2) {
            sb.append(c2);
        }
        if (length >= 3) {
            sb.append(c3);
        }
        return sb.toString();
    }

    private static void e(h hVar, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length == 0) {
                hVar.o(0);
                return;
            }
            boolean z = true;
            if (length == 1) {
                hVar.p();
                int iA = hVar.g().a() - hVar.a();
                int iF = hVar.f();
                if (iF > iA) {
                    hVar.q(hVar.a() + 1);
                    iA = hVar.g().a() - hVar.a();
                }
                if (iF <= iA && iA <= 2) {
                    hVar.o(0);
                    return;
                }
            }
            if (length > 4) {
                throw new IllegalStateException("Count must not exceed 4");
            }
            int i2 = length - 1;
            String strC = c(charSequence, 0);
            if (!(!hVar.i()) || i2 > 2) {
                z = false;
            }
            if (i2 <= 2) {
                hVar.q(hVar.a() + i2);
                if (hVar.g().a() - hVar.a() >= 3) {
                    hVar.q(hVar.a() + strC.length());
                    z = false;
                }
            }
            if (z) {
                hVar.k();
                hVar.f -= i2;
            } else {
                hVar.s(strC);
            }
            hVar.o(0);
        } catch (Throwable th) {
            hVar.o(0);
            throw th;
        }
    }

    @Override // j.d.e.k.b.g
    public void a(h hVar) {
        StringBuilder sb = new StringBuilder();
        while (hVar.i()) {
            b(hVar.c(), sb);
            hVar.f++;
            if (sb.length() >= 4) {
                hVar.s(c(sb, 0));
                sb.delete(0, 4);
                if (j.n(hVar.d(), hVar.f, d()) != d()) {
                    hVar.o(0);
                    break;
                }
            }
        }
        sb.append((char) 31);
        e(hVar, sb);
    }

    public int d() {
        return 4;
    }
}
