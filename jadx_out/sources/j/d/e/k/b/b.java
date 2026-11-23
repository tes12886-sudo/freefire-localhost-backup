package j.d.e.k.b;

import com.appff.haptic.base.Utils;

/* JADX INFO: loaded from: classes.dex */
final class b implements g {
    b() {
    }

    private static char c(char c, int i2) {
        int i3 = c + ((i2 * 149) % Utils.MAX_STRENGTH_VALUE) + 1;
        return i3 <= 255 ? (char) i3 : (char) (i3 - 256);
    }

    @Override // j.d.e.k.b.g
    public void a(h hVar) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) 0);
        while (hVar.i()) {
            sb.append(hVar.c());
            hVar.f++;
            if (j.n(hVar.d(), hVar.f, b()) != b()) {
                hVar.o(0);
                break;
            }
        }
        int length = sb.length() - 1;
        int iA = hVar.a() + length + 1;
        hVar.q(iA);
        boolean z = hVar.g().a() - iA > 0;
        if (hVar.i() || z) {
            if (length <= 249) {
                sb.setCharAt(0, (char) length);
            } else {
                if (length > 1555) {
                    throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
                }
                sb.setCharAt(0, (char) ((length / 250) + 249));
                sb.insert(1, (char) (length % 250));
            }
        }
        int length2 = sb.length();
        for (int i2 = 0; i2 < length2; i2++) {
            hVar.r(c(sb.charAt(i2), hVar.a() + 1));
        }
    }

    public int b() {
        return 5;
    }
}
