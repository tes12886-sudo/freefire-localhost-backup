package m.h0;

import com.appff.haptic.base.Utils;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Locale;
import l.d0.p;
import l.d0.q;
import l.y.c.i;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    private static final boolean a(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (i.g(cCharAt, 31) <= 0 || i.g(cCharAt, 127) >= 0 || q.M(" #%/:?@[\\]", cCharAt, 0, false, 6, null) != -1) {
                return true;
            }
            i2 = i3;
        }
        return false;
    }

    private static final boolean b(String str, int i2, int i3, byte[] bArr, int i4) {
        int i5 = i4;
        while (i2 < i3) {
            if (i5 == bArr.length) {
                return false;
            }
            if (i5 != i4) {
                if (str.charAt(i2) != '.') {
                    return false;
                }
                i2++;
            }
            int i6 = i2;
            int i7 = 0;
            while (i6 < i3) {
                char cCharAt = str.charAt(i6);
                if (i.g(cCharAt, 48) < 0 || i.g(cCharAt, 57) > 0) {
                    break;
                }
                if ((i7 == 0 && i2 != i6) || (i7 = ((i7 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i6++;
            }
            if (i6 - i2 == 0) {
                return false;
            }
            bArr[i5] = (byte) i7;
            i5++;
            i2 = i6;
        }
        return i5 == i4 + 4;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0076 A[LOOP:1: B:30:0x0069->B:34:0x0076, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x007c A[EDGE_INSN: B:55:0x007c->B:35:0x007c BREAK  A[LOOP:1: B:30:0x0069->B:34:0x0076], SYNTHETIC] */
    private static final InetAddress c(String str, int i2, int i3) {
        int i4;
        int i5;
        int iG;
        byte[] bArr = new byte[16];
        int i6 = i2;
        int i7 = 0;
        int i8 = -1;
        int i9 = -1;
        while (i6 < i3) {
            if (i7 == 16) {
                return null;
            }
            int i10 = i6 + 2;
            if (i10 <= i3 && p.w(str, "::", i6, false, 4, null)) {
                if (i8 != -1) {
                    return null;
                }
                i7 += 2;
                if (i10 == i3) {
                    i8 = i7;
                    break;
                }
                i9 = i10;
                i8 = i7;
                i6 = i9;
                i4 = 0;
                while (i6 < i3) {
                    iG = d.G(str.charAt(i6));
                    if (iG == -1) {
                        break;
                        break;
                    }
                    i4 = (i4 << 4) + iG;
                    i6++;
                }
                i5 = i6 - i9;
                if (i5 != 0) {
                }
                return null;
            }
            if (i7 != 0) {
                if (!p.w(str, ":", i6, false, 4, null)) {
                    if (!p.w(str, ".", i6, false, 4, null) || !b(str, i9, i3, bArr, i7 - 2)) {
                        return null;
                    }
                    i7 += 2;
                    break;
                }
                i6++;
            }
            i9 = i6;
            i6 = i9;
            i4 = 0;
            while (i6 < i3) {
                iG = d.G(str.charAt(i6));
                if (iG == -1) {
                    break;
                }
                i4 = (i4 << 4) + iG;
                i6++;
            }
            i5 = i6 - i9;
            if (i5 != 0 || i5 > 4) {
                return null;
            }
            int i11 = i7 + 1;
            bArr[i7] = (byte) ((i4 >>> 8) & Utils.MAX_STRENGTH_VALUE);
            i7 = i11 + 1;
            bArr[i11] = (byte) (i4 & Utils.MAX_STRENGTH_VALUE);
        }
        if (i7 != 16) {
            if (i8 == -1) {
                return null;
            }
            int i12 = i7 - i8;
            System.arraycopy(bArr, i8, bArr, 16 - i12, i12);
            Arrays.fill(bArr, i8, (16 - i7) + i8, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    private static final String d(byte[] bArr) {
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < bArr.length) {
            int i6 = i4;
            while (i6 < 16 && bArr[i6] == 0 && bArr[i6 + 1] == 0) {
                i6 += 2;
            }
            int i7 = i6 - i4;
            if (i7 > i5 && i7 >= 4) {
                i3 = i4;
                i5 = i7;
            }
            i4 = i6 + 2;
        }
        n.b bVar = new n.b();
        while (i2 < bArr.length) {
            if (i2 == i3) {
                bVar.z0(58);
                i2 += i5;
                if (i2 == 16) {
                    bVar.z0(58);
                }
            } else {
                if (i2 > 0) {
                    bVar.z0(58);
                }
                bVar.B0((d.b(bArr[i2], Utils.MAX_STRENGTH_VALUE) << 8) | d.b(bArr[i2 + 1], Utils.MAX_STRENGTH_VALUE));
                i2 += 2;
            }
        }
        return bVar.o0();
    }

    public static final String e(String str) {
        i.e(str, "<this>");
        if (!q.C(str, ":", false, 2, null)) {
            try {
                String ascii = IDN.toASCII(str);
                i.d(ascii, "toASCII(host)");
                Locale locale = Locale.US;
                i.d(locale, "US");
                String lowerCase = ascii.toLowerCase(locale);
                i.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if ((lowerCase.length() == 0) || a(lowerCase)) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressC = (p.x(str, "[", false, 2, null) && p.k(str, "]", false, 2, null)) ? c(str, 1, str.length() - 1) : c(str, 0, str.length());
        if (inetAddressC == null) {
            return null;
        }
        byte[] address = inetAddressC.getAddress();
        if (address.length == 16) {
            i.d(address, "address");
            return d(address);
        }
        if (address.length == 4) {
            return inetAddressC.getHostAddress();
        }
        throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
    }
}
