package j.d.e.l;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f extends n {
    private static void f(int i2, int[] iArr) {
        for (int i3 = 0; i3 < 9; i3++) {
            int i4 = 1;
            if (((1 << (8 - i3)) & i2) != 0) {
                i4 = 2;
            }
            iArr[i3] = i4;
        }
    }

    private static String g(String str) {
        String str2;
        int i2;
        int i3;
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < length; i4++) {
            char cCharAt = str.charAt(i4);
            if (cCharAt != 0) {
                if (cCharAt != ' ') {
                    if (cCharAt == '@') {
                        str2 = "%V";
                    } else if (cCharAt == '`') {
                        str2 = "%W";
                    } else if (cCharAt != '-' && cCharAt != '.') {
                        if (cCharAt <= 26) {
                            sb.append('$');
                            i2 = cCharAt - 1;
                        } else if (cCharAt < ' ') {
                            sb.append('%');
                            i2 = cCharAt - 27;
                        } else if (cCharAt <= ',' || cCharAt == '/' || cCharAt == ':') {
                            sb.append('/');
                            i2 = cCharAt - '!';
                        } else {
                            if (cCharAt <= '9') {
                                i3 = (cCharAt - '0') + 48;
                            } else if (cCharAt <= '?') {
                                sb.append('%');
                                i3 = (cCharAt - ';') + 70;
                            } else if (cCharAt <= 'Z') {
                                i2 = cCharAt - 'A';
                            } else if (cCharAt <= '_') {
                                sb.append('%');
                                i3 = (cCharAt - '[') + 75;
                            } else if (cCharAt <= 'z') {
                                sb.append('+');
                                i2 = cCharAt - 'a';
                            } else {
                                if (cCharAt > 127) {
                                    throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i4) + "'");
                                }
                                sb.append('%');
                                i3 = (cCharAt - '{') + 80;
                            }
                            cCharAt = (char) i3;
                        }
                        i3 = i2 + 65;
                        cCharAt = (char) i3;
                    }
                }
                sb.append(cCharAt);
            } else {
                str2 = "%U";
            }
            sb.append(str2);
        }
        return sb.toString();
    }

    @Override // j.d.e.l.n, j.d.e.g
    public j.d.e.j.b a(String str, j.d.e.a aVar, int i2, int i3, Map<j.d.e.c, ?> map) {
        if (aVar == j.d.e.a.CODE_39) {
            return super.a(str, aVar, i2, i3, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(String.valueOf(aVar)));
    }

    @Override // j.d.e.l.n
    public boolean[] c(String str) {
        int length = str.length();
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        for (int i2 = 0; i2 < length; i2++) {
            if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i2)) < 0) {
                str = g(str);
                length = str.length();
                if (length <= 80) {
                    break;
                }
                throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length + " (extended full ASCII mode)");
            }
        }
        int[] iArr = new int[9];
        int i3 = length + 25;
        for (int i4 = 0; i4 < length; i4++) {
            f(e.a["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i4))], iArr);
            for (int i5 = 0; i5 < 9; i5++) {
                i3 += iArr[i5];
            }
        }
        boolean[] zArr = new boolean[i3];
        f(148, iArr);
        int iB = n.b(zArr, 0, iArr, true);
        int[] iArr2 = {1};
        int iB2 = iB + n.b(zArr, iB, iArr2, false);
        for (int i6 = 0; i6 < length; i6++) {
            f(e.a["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i6))], iArr);
            int iB3 = iB2 + n.b(zArr, iB2, iArr, true);
            iB2 = iB3 + n.b(zArr, iB3, iArr2, false);
        }
        f(148, iArr);
        n.b(zArr, iB2, iArr, true);
        return zArr;
    }
}
