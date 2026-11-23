package j.d.e.l;

/* JADX INFO: loaded from: classes.dex */
public final class b extends n {
    private static final char[] a;
    private static final char[] b = {'T', 'N', '*', 'E'};
    private static final char[] c = {'/', ':', '+', '.'};
    private static final char d;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        a = cArr;
        d = cArr[0];
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0083  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:40:0x00df  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:53:0x0101  */
    /* JADX WARN: Code duplicated, block: B:54:0x0104  */
    /* JADX WARN: Code duplicated, block: B:55:0x0107  */
    /* JADX WARN: Code duplicated, block: B:56:0x010a  */
    /* JADX WARN: Code duplicated, block: B:60:0x0112  */
    /* JADX WARN: Code duplicated, block: B:63:0x011b A[LOOP:2: B:58:0x010d->B:63:0x011b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x0142  */
    /* JADX WARN: Code duplicated, block: B:89:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0116 A[SYNTHETIC] */
    @Override // j.d.e.l.n
    public boolean[] c(String str) {
        StringBuilder sb;
        int i2;
        int i3;
        boolean[] zArr;
        int i4;
        int i5;
        char upperCase;
        int i6;
        char[] cArr;
        int i7;
        int i8;
        boolean z;
        int i9;
        if (str.length() >= 2) {
            char upperCase2 = Character.toUpperCase(str.charAt(0));
            char upperCase3 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr2 = a;
            boolean zA = a.a(cArr2, upperCase2);
            boolean zA2 = a.a(cArr2, upperCase3);
            char[] cArr3 = b;
            boolean zA3 = a.a(cArr3, upperCase2);
            boolean zA4 = a.a(cArr3, upperCase3);
            if (zA) {
                if (!zA2) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(String.valueOf(str)));
                }
            } else if (!zA3) {
                if (zA2 || zA4) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(String.valueOf(str)));
                }
                sb = new StringBuilder();
            } else if (!zA4) {
                throw new IllegalArgumentException("Invalid start/end guards: ".concat(String.valueOf(str)));
            }
            i2 = 20;
            for (i3 = 1; i3 < str.length() - 1; i3++) {
                if (!Character.isDigit(str.charAt(i3)) || str.charAt(i3) == '-' || str.charAt(i3) == '$') {
                    i2 += 9;
                } else {
                    if (!a.a(c, str.charAt(i3))) {
                        throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i3) + '\'');
                    }
                    i2 += 10;
                }
            }
            zArr = new boolean[i2 + (str.length() - 1)];
            i5 = 0;
            for (i4 = 0; i4 < str.length(); i4++) {
                upperCase = Character.toUpperCase(str.charAt(i4));
                if (i4 != 0 || i4 == str.length() - 1) {
                    if (upperCase == '*') {
                        upperCase = 'C';
                    } else if (upperCase == 'E') {
                        upperCase = 'D';
                    } else if (upperCase == 'N') {
                        upperCase = 'B';
                    } else if (upperCase == 'T') {
                        upperCase = 'A';
                    }
                }
                i6 = 0;
                while (true) {
                    cArr = a.a;
                    if (i6 < cArr.length) {
                        i7 = 0;
                        break;
                    }
                    if (upperCase == cArr[i6]) {
                        i7 = a.b[i6];
                        break;
                    }
                    i6++;
                }
                i8 = 0;
                z = true;
                while (true) {
                    i9 = 0;
                    while (i8 < 7) {
                        zArr[i5] = z;
                        i5++;
                        if (((i7 >> (6 - i8)) & 1) != 0 || i9 == 1) {
                            z = !z;
                            i8++;
                        } else {
                            i9++;
                        }
                    }
                    break;
                }
                if (i4 < str.length() - 1) {
                    zArr[i5] = false;
                    i5++;
                }
            }
            return zArr;
        }
        sb = new StringBuilder();
        char c2 = d;
        sb.append(c2);
        sb.append(str);
        sb.append(c2);
        str = sb.toString();
        i2 = 20;
        while (i3 < str.length() - 1) {
            if (Character.isDigit(str.charAt(i3))) {
                i2 += 9;
            } else {
                i2 += 9;
            }
        }
        zArr = new boolean[i2 + (str.length() - 1)];
        i5 = 0;
        while (i4 < str.length()) {
            upperCase = Character.toUpperCase(str.charAt(i4));
            if (i4 != 0) {
                if (upperCase == '*') {
                    upperCase = 'C';
                } else if (upperCase == 'E') {
                    upperCase = 'D';
                } else if (upperCase == 'N') {
                    upperCase = 'B';
                } else if (upperCase == 'T') {
                    upperCase = 'A';
                }
            } else if (upperCase == '*') {
                upperCase = 'C';
            } else if (upperCase == 'E') {
                upperCase = 'D';
            } else if (upperCase == 'N') {
                upperCase = 'B';
            } else if (upperCase == 'T') {
                upperCase = 'A';
            }
            i6 = 0;
            while (true) {
                cArr = a.a;
                if (i6 < cArr.length) {
                    i7 = 0;
                    break;
                }
                if (upperCase == cArr[i6]) {
                    i7 = a.b[i6];
                    break;
                }
                i6++;
            }
            i8 = 0;
            z = true;
            while (true) {
                i9 = 0;
                while (true) {
                    zArr[i5] = z;
                    i5++;
                    if (((i7 >> (6 - i8)) & 1) != 0) {
                    }
                    z = !z;
                    i8++;
                    i9++;
                }
            }
            if (i4 < str.length() - 1) {
                zArr[i5] = false;
                i5++;
            }
        }
        return zArr;
    }
}
