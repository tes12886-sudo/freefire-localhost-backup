package n.d0;

import l.s;
import l.y.c.i;
import n.e;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:101:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:103:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:104:0x00da  */
    /* JADX WARN: Code duplicated, block: B:162:0x0158  */
    /* JADX WARN: Code duplicated, block: B:164:0x015b  */
    /* JADX WARN: Code duplicated, block: B:167:0x0161  */
    /* JADX WARN: Code duplicated, block: B:169:0x0165  */
    /* JADX WARN: Code duplicated, block: B:170:0x0167  */
    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:241:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:243:0x0200  */
    /* JADX WARN: Code duplicated, block: B:246:0x0206  */
    /* JADX WARN: Code duplicated, block: B:248:0x020a  */
    /* JADX WARN: Code duplicated, block: B:249:0x020c  */
    /* JADX WARN: Code duplicated, block: B:262:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:288:0x0205 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0077  */
    /* JADX WARN: Code duplicated, block: B:54:0x007a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x007f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0081  */
    /* JADX WARN: Code duplicated, block: B:97:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:99:0x00d1 A[DONT_INVERT] */
    public static final int c(byte[] bArr, int i2) {
        int i3;
        boolean z;
        boolean z2;
        int i4;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        int i7;
        boolean z5;
        int length = bArr.length;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < length) {
            byte b = bArr[i8];
            if (b >= 0) {
                int i11 = i10 + 1;
                if (i10 == i2) {
                    return i9;
                }
                if (b != 10 && b != 13) {
                    if (b >= 0 && b <= 31) {
                        z2 = true;
                    } else {
                        if (127 <= b && b <= 159) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    if (!z2) {
                    }
                    return -1;
                }
                if (b == 65533) {
                    return -1;
                }
                i9 += b < 65536 ? 1 : 2;
                i8++;
                while (true) {
                    i10 = i11;
                    if (i8 >= length || bArr[i8] < 0) {
                        break;
                    }
                    int i12 = i8 + 1;
                    byte b2 = bArr[i8];
                    i11 = i10 + 1;
                    if (i10 == i2) {
                        return i9;
                    }
                    if (b2 != 10 && b2 != 13) {
                        if (b2 >= 0 && b2 <= 31) {
                            z = true;
                        } else {
                            if (127 <= b2 && b2 <= 159) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (!z) {
                            if (b2 == 65533) {
                                if (b2 < 65536) {
                                    i3 = 1;
                                } else {
                                    i3 = 2;
                                }
                                i9 += i3;
                                i8 = i12;
                            }
                        }
                    } else if (b2 == 65533) {
                        if (b2 < 65536) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                        }
                        i9 += i3;
                        i8 = i12;
                    }
                    return -1;
                }
            }
            if ((b >> 5) == -2) {
                int i13 = i8 + 1;
                if (length <= i13) {
                    if (i10 == i2) {
                        return i9;
                    }
                    return -1;
                }
                byte b3 = bArr[i8];
                byte b4 = bArr[i13];
                if (!((b4 & 192) == 128)) {
                    if (i10 == i2) {
                        return i9;
                    }
                    return -1;
                }
                int i14 = (b4 ^ 3968) ^ (b3 << 6);
                if (i14 < 128) {
                    if (i10 == i2) {
                        return i9;
                    }
                    return -1;
                }
                i4 = i10 + 1;
                if (i10 == i2) {
                    return i9;
                }
                if (i14 != 10 && i14 != 13) {
                    if (i14 >= 0 && i14 <= 31) {
                        z5 = true;
                    } else {
                        if (127 <= i14 && i14 <= 159) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                    }
                    if (!z5) {
                        if (i14 == 65533) {
                            if (i14 < 65536) {
                                i7 = 1;
                            } else {
                                i7 = 2;
                            }
                            i9 += i7;
                            s sVar = s.a;
                            i8 += 2;
                        }
                    }
                } else if (i14 == 65533) {
                    if (i14 < 65536) {
                        i7 = 1;
                    } else {
                        i7 = 2;
                    }
                    i9 += i7;
                    s sVar2 = s.a;
                    i8 += 2;
                }
                return -1;
            }
            if ((b >> 4) == -2) {
                int i15 = i8 + 2;
                if (length <= i15) {
                    if (i10 == i2) {
                        return i9;
                    }
                    return -1;
                }
                byte b5 = bArr[i8];
                byte b6 = bArr[i8 + 1];
                if (!((b6 & 192) == 128)) {
                    if (i10 == i2) {
                        return i9;
                    }
                    return -1;
                }
                byte b7 = bArr[i15];
                if (!((b7 & 192) == 128)) {
                    if (i10 == i2) {
                        return i9;
                    }
                    return -1;
                }
                int i16 = ((b7 ^ (-123008)) ^ (b6 << 6)) ^ (b5 << 12);
                if (i16 < 2048) {
                    if (i10 == i2) {
                        return i9;
                    }
                    return -1;
                }
                if (55296 <= i16 && i16 <= 57343) {
                    if (i10 == i2) {
                        return i9;
                    }
                    return -1;
                }
                i4 = i10 + 1;
                if (i10 == i2) {
                    return i9;
                }
                if (i16 != 10 && i16 != 13) {
                    if (i16 >= 0 && i16 <= 31) {
                        z4 = true;
                    } else {
                        if (127 <= i16 && i16 <= 159) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                    }
                    if (!z4) {
                        if (i16 == 65533) {
                            if (i16 < 65536) {
                                i6 = 1;
                            } else {
                                i6 = 2;
                            }
                            i9 += i6;
                            s sVar3 = s.a;
                            i8 += 3;
                        }
                    }
                } else if (i16 == 65533) {
                    if (i16 < 65536) {
                        i6 = 1;
                    } else {
                        i6 = 2;
                    }
                    i9 += i6;
                    s sVar4 = s.a;
                    i8 += 3;
                }
                return -1;
            }
            if ((b >> 3) != -2) {
                if (i10 == i2) {
                    return i9;
                }
                return -1;
            }
            int i17 = i8 + 3;
            if (length <= i17) {
                if (i10 == i2) {
                    return i9;
                }
                return -1;
            }
            byte b8 = bArr[i8];
            byte b9 = bArr[i8 + 1];
            if (!((b9 & 192) == 128)) {
                if (i10 == i2) {
                    return i9;
                }
                return -1;
            }
            byte b10 = bArr[i8 + 2];
            if (!((b10 & 192) == 128)) {
                if (i10 == i2) {
                    return i9;
                }
                return -1;
            }
            byte b11 = bArr[i17];
            if (!((b11 & 192) == 128)) {
                if (i10 == i2) {
                    return i9;
                }
                return -1;
            }
            int i18 = (((b11 ^ 3678080) ^ (b10 << 6)) ^ (b9 << 12)) ^ (b8 << 18);
            if (i18 > 1114111) {
                if (i10 == i2) {
                    return i9;
                }
                return -1;
            }
            if (55296 <= i18 && i18 <= 57343) {
                if (i10 == i2) {
                    return i9;
                }
                return -1;
            }
            if (i18 < 65536) {
                if (i10 == i2) {
                    return i9;
                }
                return -1;
            }
            i4 = i10 + 1;
            if (i10 == i2) {
                return i9;
            }
            if (i18 != 10 && i18 != 13) {
                if (i18 >= 0 && i18 <= 31) {
                    z3 = true;
                } else {
                    if (127 <= i18 && i18 <= 159) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
                if (!z3) {
                    if (i18 == 65533) {
                        if (i18 < 65536) {
                            i5 = 1;
                        } else {
                            i5 = 2;
                        }
                        i9 += i5;
                        s sVar5 = s.a;
                        i8 += 4;
                    }
                }
            } else if (i18 == 65533) {
                if (i18 < 65536) {
                    i5 = 1;
                } else {
                    i5 = 2;
                }
                i9 += i5;
                s sVar6 = s.a;
                i8 += 4;
            }
            return -1;
            i10 = i4;
        }
        return i9;
    }

    public static final void d(e eVar, n.b bVar, int i2, int i3) {
        i.e(eVar, "<this>");
        i.e(bVar, "buffer");
        bVar.x0(eVar.f(), i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(char c) {
        if ('0' <= c && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (!('a' <= c && c <= 'f')) {
            c2 = 'A';
            if (!('A' <= c && c <= 'F')) {
                throw new IllegalArgumentException(i.k("Unexpected hex digit: ", Character.valueOf(c)));
            }
        }
        return (c - c2) + 10;
    }

    public static final char[] f() {
        return a;
    }
}
