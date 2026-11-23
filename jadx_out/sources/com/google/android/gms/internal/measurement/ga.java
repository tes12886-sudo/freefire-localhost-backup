package com.google.android.gms.internal.measurement;

import com.appff.haptic.base.Utils;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class ga<T> implements oa<T> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int[] f1051o = new int[0];
    private static final Unsafe p = nb.v();
    private final int[] a;
    private final Object[] b;
    private final int c;
    private final int d;
    private final da e;
    private final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f1052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int[] f1053h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f1054i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f1055j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final q9 f1056k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final db<?, ?> f1057l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final m8<?> f1058m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final y9 f1059n;

    /* JADX WARN: Multi-variable type inference failed */
    private ga(int[] iArr, int[] iArr2, Object[] objArr, int i2, int i3, da daVar, boolean z, boolean z2, int[] iArr3, int i4, int i5, ia iaVar, q9 q9Var, db<?, ?> dbVar, m8<?> m8Var, y9 y9Var) {
        this.a = iArr;
        this.b = iArr2;
        this.c = objArr;
        this.d = i2;
        this.f1052g = daVar;
        boolean z3 = false;
        if (dbVar != 0 && dbVar.a(i3)) {
            z3 = true;
        }
        this.f = z3;
        this.f1053h = z2;
        this.f1054i = iArr3;
        this.f1055j = i4;
        this.f1056k = iaVar;
        this.f1057l = q9Var;
        this.f1058m = dbVar;
        this.e = i3;
        this.f1059n = m8Var;
    }

    private final <K, V> void A(h8 h8Var, int i2, Object obj, int i3) {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private static final void B(int i2, Object obj, h8 h8Var) {
        if (obj instanceof String) {
            h8Var.x(i2, (String) obj);
        } else {
            h8Var.y(i2, (z7) obj);
        }
    }

    static eb C(Object obj) {
        z8 z8Var = (z8) obj;
        eb ebVar = z8Var.zzc;
        if (ebVar != eb.a()) {
            return ebVar;
        }
        eb ebVarB = eb.b();
        z8Var.zzc = ebVarB;
        return ebVarB;
    }

    static <T> ga<T> E(Class<T> cls, aa aaVar, ia iaVar, q9 q9Var, db<?, ?> dbVar, m8<?> m8Var, y9 y9Var) {
        if (aaVar instanceof na) {
            return F((na) aaVar, iaVar, q9Var, dbVar, m8Var, y9Var);
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x025d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0260  */
    /* JADX WARN: Code duplicated, block: B:127:0x0278  */
    /* JADX WARN: Code duplicated, block: B:128:0x027b  */
    /* JADX WARN: Code duplicated, block: B:162:0x032b  */
    /* JADX WARN: Code duplicated, block: B:177:0x0378  */
    /* JADX WARN: Code duplicated, block: B:180:0x0385  */
    static <T> ga<T> F(na naVar, ia iaVar, q9 q9Var, db<?, ?> dbVar, m8<?> m8Var, y9 y9Var) {
        int i2;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        char cCharAt;
        int i8;
        char cCharAt2;
        int i9;
        char cCharAt3;
        int i10;
        char cCharAt4;
        int i11;
        char cCharAt5;
        int i12;
        char cCharAt6;
        int i13;
        char cCharAt7;
        int i14;
        char cCharAt8;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int iObjectFieldOffset;
        int i20;
        int iObjectFieldOffset2;
        int i21;
        Field fieldG;
        char cCharAt9;
        int i22;
        int i23;
        int i24;
        int i25;
        Object obj;
        Field fieldG2;
        int i26;
        Object obj2;
        Field fieldG3;
        int i27;
        char cCharAt10;
        int i28;
        char cCharAt11;
        int i29;
        char cCharAt12;
        int i30;
        char cCharAt13;
        boolean z = naVar.b() == 2;
        String strA = naVar.a();
        int length = strA.length();
        char c = 55296;
        if (strA.charAt(0) >= 55296) {
            int i31 = 1;
            while (true) {
                i2 = i31 + 1;
                if (strA.charAt(i31) < 55296) {
                    break;
                }
                i31 = i2;
            }
        } else {
            i2 = 1;
        }
        int i32 = i2 + 1;
        int iCharAt4 = strA.charAt(i2);
        if (iCharAt4 >= 55296) {
            int i33 = iCharAt4 & 8191;
            int i34 = 13;
            while (true) {
                i30 = i32 + 1;
                cCharAt13 = strA.charAt(i32);
                if (cCharAt13 < 55296) {
                    break;
                }
                i33 |= (cCharAt13 & 8191) << i34;
                i34 += 13;
                i32 = i30;
            }
            iCharAt4 = i33 | (cCharAt13 << i34);
            i32 = i30;
        }
        if (iCharAt4 == 0) {
            iArr = f1051o;
            i4 = 0;
            iCharAt = 0;
            i6 = 0;
            iCharAt2 = 0;
            i5 = 0;
            iCharAt3 = 0;
            i3 = 0;
        } else {
            int i35 = i32 + 1;
            int iCharAt5 = strA.charAt(i32);
            if (iCharAt5 >= 55296) {
                int i36 = iCharAt5 & 8191;
                int i37 = 13;
                while (true) {
                    i14 = i35 + 1;
                    cCharAt8 = strA.charAt(i35);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i36 |= (cCharAt8 & 8191) << i37;
                    i37 += 13;
                    i35 = i14;
                }
                iCharAt5 = i36 | (cCharAt8 << i37);
                i35 = i14;
            }
            int i38 = i35 + 1;
            int iCharAt6 = strA.charAt(i35);
            if (iCharAt6 >= 55296) {
                int i39 = iCharAt6 & 8191;
                int i40 = 13;
                while (true) {
                    i13 = i38 + 1;
                    cCharAt7 = strA.charAt(i38);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i39 |= (cCharAt7 & 8191) << i40;
                    i40 += 13;
                    i38 = i13;
                }
                iCharAt6 = i39 | (cCharAt7 << i40);
                i38 = i13;
            }
            int i41 = i38 + 1;
            iCharAt = strA.charAt(i38);
            if (iCharAt >= 55296) {
                int i42 = iCharAt & 8191;
                int i43 = 13;
                while (true) {
                    i12 = i41 + 1;
                    cCharAt6 = strA.charAt(i41);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt6 & 8191) << i43;
                    i43 += 13;
                    i41 = i12;
                }
                iCharAt = i42 | (cCharAt6 << i43);
                i41 = i12;
            }
            int i44 = i41 + 1;
            int iCharAt7 = strA.charAt(i41);
            if (iCharAt7 >= 55296) {
                int i45 = iCharAt7 & 8191;
                int i46 = 13;
                while (true) {
                    i11 = i44 + 1;
                    cCharAt5 = strA.charAt(i44);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt5 & 8191) << i46;
                    i46 += 13;
                    i44 = i11;
                }
                iCharAt7 = i45 | (cCharAt5 << i46);
                i44 = i11;
            }
            int i47 = i44 + 1;
            iCharAt2 = strA.charAt(i44);
            if (iCharAt2 >= 55296) {
                int i48 = iCharAt2 & 8191;
                int i49 = 13;
                while (true) {
                    i10 = i47 + 1;
                    cCharAt4 = strA.charAt(i47);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt4 & 8191) << i49;
                    i49 += 13;
                    i47 = i10;
                }
                iCharAt2 = i48 | (cCharAt4 << i49);
                i47 = i10;
            }
            int i50 = i47 + 1;
            int iCharAt8 = strA.charAt(i47);
            if (iCharAt8 >= 55296) {
                int i51 = iCharAt8 & 8191;
                int i52 = 13;
                while (true) {
                    i9 = i50 + 1;
                    cCharAt3 = strA.charAt(i50);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt3 & 8191) << i52;
                    i52 += 13;
                    i50 = i9;
                }
                iCharAt8 = i51 | (cCharAt3 << i52);
                i50 = i9;
            }
            int i53 = i50 + 1;
            int iCharAt9 = strA.charAt(i50);
            if (iCharAt9 >= 55296) {
                int i54 = iCharAt9 & 8191;
                int i55 = 13;
                while (true) {
                    i8 = i53 + 1;
                    cCharAt2 = strA.charAt(i53);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt2 & 8191) << i55;
                    i55 += 13;
                    i53 = i8;
                }
                iCharAt9 = i54 | (cCharAt2 << i55);
                i53 = i8;
            }
            int i56 = i53 + 1;
            iCharAt3 = strA.charAt(i53);
            if (iCharAt3 >= 55296) {
                int i57 = iCharAt3 & 8191;
                int i58 = 13;
                while (true) {
                    i7 = i56 + 1;
                    cCharAt = strA.charAt(i56);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i57 |= (cCharAt & 8191) << i58;
                    i58 += 13;
                    i56 = i7;
                }
                iCharAt3 = i57 | (cCharAt << i58);
                i56 = i7;
            }
            iArr = new int[iCharAt3 + iCharAt8 + iCharAt9];
            i3 = iCharAt5 + iCharAt5 + iCharAt6;
            i4 = iCharAt5;
            i32 = i56;
            int i59 = iCharAt8;
            i5 = iCharAt7;
            i6 = i59;
        }
        Unsafe unsafe = p;
        Object[] objArrC = naVar.c();
        Class<?> cls = naVar.zzb().getClass();
        int[] iArr2 = new int[iCharAt2 * 3];
        Object[] objArr = new Object[iCharAt2 + iCharAt2];
        int i60 = iCharAt3 + i6;
        int i61 = iCharAt3;
        int i62 = i60;
        int i63 = 0;
        int i64 = 0;
        while (i32 < length) {
            int i65 = i32 + 1;
            int iCharAt10 = strA.charAt(i32);
            if (iCharAt10 >= c) {
                int i66 = iCharAt10 & 8191;
                int i67 = i65;
                int i68 = 13;
                while (true) {
                    i29 = i67 + 1;
                    cCharAt12 = strA.charAt(i67);
                    if (cCharAt12 < c) {
                        break;
                    }
                    i66 |= (cCharAt12 & 8191) << i68;
                    i68 += 13;
                    i67 = i29;
                }
                iCharAt10 = i66 | (cCharAt12 << i68);
                i15 = i29;
            } else {
                i15 = i65;
            }
            int i69 = i15 + 1;
            int iCharAt11 = strA.charAt(i15);
            if (iCharAt11 >= c) {
                int i70 = iCharAt11 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i28 = i71 + 1;
                    cCharAt11 = strA.charAt(i71);
                    i16 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i70 |= (cCharAt11 & 8191) << i72;
                    i72 += 13;
                    i71 = i28;
                    length = i16;
                }
                iCharAt11 = i70 | (cCharAt11 << i72);
                i17 = i28;
            } else {
                i16 = length;
                i17 = i69;
            }
            int i73 = iCharAt11 & Utils.MAX_STRENGTH_VALUE;
            int i74 = iCharAt3;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i64] = i63;
                i64++;
            }
            if (i73 >= 51) {
                int i75 = i17 + 1;
                int iCharAt12 = strA.charAt(i17);
                if (iCharAt12 >= 55296) {
                    int i76 = iCharAt12 & 8191;
                    int i77 = i75;
                    int i78 = 13;
                    while (true) {
                        i27 = i77 + 1;
                        cCharAt10 = strA.charAt(i77);
                        i18 = i5;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i76 |= (cCharAt10 & 8191) << i78;
                        i78 += 13;
                        i77 = i27;
                        i5 = i18;
                    }
                    iCharAt12 = i76 | (cCharAt10 << i78);
                    i23 = i27;
                } else {
                    i18 = i5;
                    i23 = i75;
                }
                int i79 = i73 - 51;
                i20 = i23;
                if (i79 == 9 || i79 == 17) {
                    int i80 = i63 / 3;
                    i24 = i3 + 1;
                    objArr[i80 + i80 + 1] = objArrC[i3];
                } else {
                    if (i79 == 12 && !z) {
                        int i81 = i63 / 3;
                        i24 = i3 + 1;
                        objArr[i81 + i81 + 1] = objArrC[i3];
                    }
                    i25 = iCharAt12 + iCharAt12;
                    obj = objArrC[i25];
                    if (obj instanceof Field) {
                        fieldG2 = (Field) obj;
                    } else {
                        fieldG2 = G(cls, (String) obj);
                        objArrC[i25] = fieldG2;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldG2);
                    i26 = i25 + 1;
                    obj2 = objArrC[i26];
                    if (obj2 instanceof Field) {
                        fieldG3 = (Field) obj2;
                    } else {
                        fieldG3 = G(cls, (String) obj2);
                        objArrC[i26] = fieldG3;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldG3);
                    strA = strA;
                    cls = cls;
                    iObjectFieldOffset2 = iObjectFieldOffset4;
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i21 = 0;
                }
                i3 = i24;
                i25 = iCharAt12 + iCharAt12;
                obj = objArrC[i25];
                if (obj instanceof Field) {
                    fieldG2 = (Field) obj;
                } else {
                    fieldG2 = G(cls, (String) obj);
                    objArrC[i25] = fieldG2;
                }
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldG2);
                i26 = i25 + 1;
                obj2 = objArrC[i26];
                if (obj2 instanceof Field) {
                    fieldG3 = (Field) obj2;
                } else {
                    fieldG3 = G(cls, (String) obj2);
                    objArrC[i26] = fieldG3;
                }
                int iObjectFieldOffset6 = (int) unsafe.objectFieldOffset(fieldG3);
                strA = strA;
                cls = cls;
                iObjectFieldOffset2 = iObjectFieldOffset6;
                iObjectFieldOffset = iObjectFieldOffset5;
                i21 = 0;
            } else {
                i18 = i5;
                int i82 = i3 + 1;
                Field fieldG4 = G(cls, (String) objArrC[i3]);
                if (i73 == 9 || i73 == 17) {
                    int i83 = i63 / 3;
                    objArr[i83 + i83 + 1] = fieldG4.getType();
                } else {
                    if (i73 == 27 || i73 == 49) {
                        int i84 = i63 / 3;
                        i22 = i82 + 1;
                        objArr[i84 + i84 + 1] = objArrC[i82];
                    } else if (i73 == 12 || i73 == 30 || i73 == 44) {
                        if (!z) {
                            int i85 = i63 / 3;
                            i22 = i82 + 1;
                            objArr[i85 + i85 + 1] = objArrC[i82];
                        }
                    } else if (i73 == 50) {
                        int i86 = i61 + 1;
                        iArr[i61] = i63;
                        int i87 = i63 / 3;
                        int i88 = i87 + i87;
                        int i89 = i82 + 1;
                        objArr[i88] = objArrC[i82];
                        if ((iCharAt11 & 2048) != 0) {
                            i82 = i89 + 1;
                            objArr[i88 + 1] = objArrC[i89];
                            i61 = i86;
                        } else {
                            i61 = i86;
                            i19 = i89;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldG4);
                        if ((iCharAt11 & Utils.CONTINUOUS_EVENT) == 4096 || i73 > 17) {
                            i20 = i17;
                            iObjectFieldOffset2 = 1048575;
                            i21 = 0;
                        } else {
                            int i90 = i17 + 1;
                            int iCharAt13 = strA.charAt(i17);
                            if (iCharAt13 >= 55296) {
                                int i91 = iCharAt13 & 8191;
                                int i92 = 13;
                                while (true) {
                                    i20 = i90 + 1;
                                    cCharAt9 = strA.charAt(i90);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i91 |= (cCharAt9 & 8191) << i92;
                                    i92 += 13;
                                    i90 = i20;
                                }
                                iCharAt13 = i91 | (cCharAt9 << i92);
                            } else {
                                i20 = i90;
                            }
                            int i93 = i4 + i4 + (iCharAt13 / 32);
                            Object obj3 = objArrC[i93];
                            if (obj3 instanceof Field) {
                                fieldG = (Field) obj3;
                            } else {
                                fieldG = G(cls, (String) obj3);
                                objArrC[i93] = fieldG;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldG);
                            i21 = iCharAt13 % 32;
                        }
                        if (i73 >= 18 && i73 <= 49) {
                            iArr[i62] = iObjectFieldOffset;
                            i62++;
                        }
                        i3 = i19;
                    }
                    i19 = i22;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldG4);
                    if ((iCharAt11 & Utils.CONTINUOUS_EVENT) == 4096) {
                        i20 = i17;
                        iObjectFieldOffset2 = 1048575;
                        i21 = 0;
                    } else {
                        i20 = i17;
                        iObjectFieldOffset2 = 1048575;
                        i21 = 0;
                    }
                    if (i73 >= 18) {
                        iArr[i62] = iObjectFieldOffset;
                        i62++;
                    }
                    i3 = i19;
                }
                i19 = i82;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldG4);
                if ((iCharAt11 & Utils.CONTINUOUS_EVENT) == 4096) {
                    i20 = i17;
                    iObjectFieldOffset2 = 1048575;
                    i21 = 0;
                } else {
                    i20 = i17;
                    iObjectFieldOffset2 = 1048575;
                    i21 = 0;
                }
                if (i73 >= 18) {
                    iArr[i62] = iObjectFieldOffset;
                    i62++;
                }
                i3 = i19;
            }
            int i94 = i63 + 1;
            iArr2[i63] = iCharAt10;
            int i95 = i94 + 1;
            iArr2[i94] = ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | (i73 << 20) | iObjectFieldOffset;
            i63 = i95 + 1;
            iArr2[i95] = (i21 << 20) | iObjectFieldOffset2;
            cls = cls;
            iCharAt = iCharAt;
            iCharAt3 = i74;
            i32 = i20;
            length = i16;
            objArr = objArr;
            strA = strA;
            iArr2 = iArr2;
            i5 = i18;
            c = 55296;
        }
        return new ga<>(iArr2, objArr, iCharAt, i5, naVar.zzb(), z, false, iArr, iCharAt3, i60, iaVar, q9Var, dbVar, m8Var, y9Var, null);
    }

    private static Field G(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(string).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(string);
            throw new RuntimeException(sb.toString());
        }
    }

    private final void H(T t, T t2, int i2) {
        long jI = i(i2) & 1048575;
        if (s(t2, i2)) {
            Object objS = nb.s(t, jI);
            Object objS2 = nb.s(t2, jI);
            if (objS != null && objS2 != null) {
                objS2 = g9.i(objS, objS2);
            } else if (objS2 == null) {
                return;
            }
            nb.t(t, jI, objS2);
            t(t, i2);
        }
    }

    private final void I(T t, T t2, int i2) {
        int i3 = i(i2);
        int i4 = this.a[i2];
        long j2 = i3 & 1048575;
        if (u(t2, i4, i2)) {
            Object objS = u(t, i4, i2) ? nb.s(t, j2) : null;
            Object objS2 = nb.s(t2, j2);
            if (objS != null && objS2 != null) {
                objS2 = g9.i(objS, objS2);
            } else if (objS2 == null) {
                return;
            }
            nb.t(t, j2, objS2);
            v(t, i4, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01c3 A[PHI: r7
  0x01c3: PHI (r7v104 int) = 
  (r7v67 int)
  (r7v70 int)
  (r7v73 int)
  (r7v76 int)
  (r7v79 int)
  (r7v82 int)
  (r7v85 int)
  (r7v88 int)
  (r7v91 int)
  (r7v94 int)
  (r7v97 int)
  (r7v100 int)
  (r7v103 int)
  (r7v107 int)
 binds: [B:112:0x01c1, B:109:0x01b4, B:106:0x01a7, B:103:0x019a, B:100:0x018d, B:97:0x0180, B:94:0x0173, B:91:0x0166, B:88:0x0158, B:85:0x014a, B:82:0x013c, B:79:0x012e, B:76:0x0120, B:73:0x0112] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:130:0x026a  */
    /* JADX WARN: Code duplicated, block: B:155:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:156:0x02d3 A[PHI: r7
  0x02d3: PHI (r7v134 java.lang.Object) = (r7v14 java.lang.Object), (r7v130 java.lang.Object), (r7v137 java.lang.Object) binds: [B:163:0x0302, B:44:0x00a0, B:155:0x02cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:159:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:165:0x0305 A[PHI: r7
  0x0305: PHI (r7v126 java.lang.Object) = (r7v14 java.lang.Object), (r7v130 java.lang.Object) binds: [B:163:0x0302, B:44:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:168:0x0316  */
    /* JADX WARN: Code duplicated, block: B:177:0x032d  */
    /* JADX WARN: Code duplicated, block: B:186:0x0347  */
    /* JADX WARN: Code duplicated, block: B:190:0x035c  */
    /* JADX WARN: Code duplicated, block: B:193:0x036a  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d5  */
    private final int J(T t) {
        int i2;
        long jO;
        Object object;
        int iN;
        int iN2;
        int iN3;
        long jO2;
        int iU;
        int iT;
        int iY;
        int iA;
        Unsafe unsafe = p;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        for (int i6 = 0; i6 < this.a.length; i6 += 3) {
            int i7 = i(i6);
            int i8 = this.a[i6];
            int iK = k(i7);
            if (iK <= 17) {
                int i9 = this.a[i6 + 2];
                int i10 = i9 & 1048575;
                i2 = 1 << (i9 >>> 20);
                if (i10 != i5) {
                    i4 = unsafe.getInt(t, i10);
                    i5 = i10;
                }
            } else {
                i2 = 0;
            }
            long j2 = i7 & 1048575;
            switch (iK) {
                case 0:
                    if ((i4 & i2) != 0) {
                        iU = g8.A(i8 << 3) + 8;
                        i3 += iU;
                    }
                    break;
                case 1:
                    if ((i4 & i2) != 0) {
                        iU = g8.A(i8 << 3) + 4;
                        i3 += iU;
                    }
                    break;
                case 2:
                    if ((i4 & i2) != 0) {
                        jO = unsafe.getLong(t, j2);
                        iU = g8.A(i8 << 3) + g8.B(jO);
                        i3 += iU;
                    }
                    break;
                case 3:
                    if ((i4 & i2) != 0) {
                        jO = unsafe.getLong(t, j2);
                        iU = g8.A(i8 << 3) + g8.B(jO);
                        i3 += iU;
                    }
                    break;
                case 4:
                    if ((i4 & i2) != 0) {
                        iN2 = unsafe.getInt(t, j2);
                        iY = g8.A(i8 << 3);
                        iT = g8.z(iN2);
                        iA = iY + iT;
                        i3 += iA;
                    }
                    break;
                case 5:
                    if ((i4 & i2) != 0) {
                        iU = g8.A(i8 << 3) + 8;
                        i3 += iU;
                    }
                    break;
                case 6:
                    if ((i4 & i2) != 0) {
                        iU = g8.A(i8 << 3) + 4;
                        i3 += iU;
                    }
                    break;
                case 7:
                    if ((i4 & i2) != 0) {
                        iU = g8.A(i8 << 3) + 1;
                        i3 += iU;
                    }
                    break;
                case 8:
                    if ((i4 & i2) != 0) {
                        object = unsafe.getObject(t, j2);
                        if (object instanceof z7) {
                            int iA2 = g8.A(i8 << 3);
                            int iD = ((z7) object).d();
                            iA = iA2 + g8.A(iD) + iD;
                        } else {
                            iY = g8.A(i8 << 3);
                            iT = g8.C((String) object);
                            iA = iY + iT;
                        }
                        i3 += iA;
                    }
                    break;
                case 9:
                    if ((i4 & i2) != 0) {
                        iU = qa.Y(i8, unsafe.getObject(t, j2), O(i6));
                        i3 += iU;
                    }
                    break;
                case 10:
                    if ((i4 & i2) != 0) {
                        object = unsafe.getObject(t, j2);
                        int iA3 = g8.A(i8 << 3);
                        int iD2 = ((z7) object).d();
                        iA = iA3 + g8.A(iD2) + iD2;
                        i3 += iA;
                    }
                    break;
                case 11:
                    if ((i4 & i2) != 0) {
                        iN = unsafe.getInt(t, j2);
                        iY = g8.A(i8 << 3);
                        iT = g8.A(iN);
                        iA = iY + iT;
                        i3 += iA;
                    }
                    break;
                case 12:
                    if ((i4 & i2) != 0) {
                        iN2 = unsafe.getInt(t, j2);
                        iY = g8.A(i8 << 3);
                        iT = g8.z(iN2);
                        iA = iY + iT;
                        i3 += iA;
                    }
                    break;
                case 13:
                    if ((i4 & i2) != 0) {
                        iU = g8.A(i8 << 3) + 4;
                        i3 += iU;
                    }
                    break;
                case 14:
                    if ((i4 & i2) != 0) {
                        iU = g8.A(i8 << 3) + 8;
                        i3 += iU;
                    }
                    break;
                case 15:
                    if ((i4 & i2) != 0) {
                        iN3 = unsafe.getInt(t, j2);
                        iY = g8.A(i8 << 3);
                        iN = (iN3 >> 31) ^ (iN3 + iN3);
                        iT = g8.A(iN);
                        iA = iY + iT;
                        i3 += iA;
                    }
                    break;
                case 16:
                    if ((i4 & i2) != 0) {
                        jO2 = unsafe.getLong(t, j2);
                        iY = g8.A(i8 << 3);
                        iT = g8.B((jO2 >> 63) ^ (jO2 + jO2));
                        iA = iY + iT;
                        i3 += iA;
                    }
                    break;
                case 17:
                    if ((i4 & i2) != 0) {
                        iU = g8.e(i8, (da) unsafe.getObject(t, j2), O(i6));
                        i3 += iU;
                    }
                    break;
                case 18:
                case 23:
                case 32:
                    iU = qa.U(i8, (List) unsafe.getObject(t, j2), false);
                    i3 += iU;
                    break;
                case 19:
                case 24:
                case 31:
                    iU = qa.S(i8, (List) unsafe.getObject(t, j2), false);
                    i3 += iU;
                    break;
                case 20:
                    iU = qa.E(i8, (List) unsafe.getObject(t, j2), false);
                    i3 += iU;
                    break;
                case 21:
                    iU = qa.G(i8, (List) unsafe.getObject(t, j2), false);
                    i3 += iU;
                    break;
                case 22:
                    iU = qa.M(i8, (List) unsafe.getObject(t, j2), false);
                    i3 += iU;
                    break;
                case 25:
                    iU = qa.W(i8, (List) unsafe.getObject(t, j2), false);
                    i3 += iU;
                    break;
                case 26:
                    iU = qa.X(i8, (List) unsafe.getObject(t, j2));
                    i3 += iU;
                    break;
                case 27:
                    iU = qa.Z(i8, (List) unsafe.getObject(t, j2), O(i6));
                    i3 += iU;
                    break;
                case 28:
                    iU = qa.a0(i8, (List) unsafe.getObject(t, j2));
                    i3 += iU;
                    break;
                case 29:
                    iU = qa.O(i8, (List) unsafe.getObject(t, j2), false);
                    i3 += iU;
                    break;
                case 30:
                    iU = qa.K(i8, (List) unsafe.getObject(t, j2), false);
                    i3 += iU;
                    break;
                case 33:
                    iU = qa.Q(i8, (List) unsafe.getObject(t, j2), false);
                    i3 += iU;
                    break;
                case 34:
                    iU = qa.I(i8, (List) unsafe.getObject(t, j2), false);
                    i3 += iU;
                    break;
                case 35:
                    iT = qa.T((List) unsafe.getObject(t, j2));
                    if (iT > 0) {
                        iY = g8.y(i8) + g8.A(iT);
                        iA = iY + iT;
                        i3 += iA;
                    }
                    break;
                case 36:
                    iT = qa.R((List) unsafe.getObject(t, j2));
                    if (iT > 0) {
                        iY = g8.y(i8) + g8.A(iT);
                        iA = iY + iT;
                        i3 += iA;
                    }
                    break;
                case 37:
                    iT = qa.D((List) unsafe.getObject(t, j2));
                    if (iT > 0) {
                        iY = g8.y(i8) + g8.A(iT);
                        iA = iY + iT;
                        i3 += iA;
                    }
                    break;
                case 38:
                    iT = qa.F((List) unsafe.getObject(t, j2));
                    if (iT > 0) {
                        iY = g8.y(i8) + g8.A(iT);
                        iA = iY + iT;
                        i3 += iA;
                    }
                    break;
                case 39:
                    iT = qa.L((List) unsafe.getObject(t, j2));
                    if (iT > 0) {
                        iY = g8.y(i8) + g8.A(iT);
                        iA = iY + iT;
                        i3 += iA;
                    }
                    break;
                case 40:
                    iT = qa.T((List) unsafe.getObject(t, j2));
                    if (iT > 0) {
                        iY = g8.y(i8) + g8.A(iT);
                        iA = iY + iT;
                        i3 += iA;
                    }
                    break;
                case 41:
                    iT = qa.R((List) unsafe.getObject(t, j2));
                    if (iT > 0) {
                        iY = g8.y(i8) + g8.A(iT);
                        iA = iY + iT;
                        i3 += iA;
                    }
                    break;
                case 42:
                    iT = qa.V((List) unsafe.getObject(t, j2));
                    if (iT > 0) {
                        iY = g8.y(i8) + g8.A(iT);
                        iA = iY + iT;
                        i3 += iA;
                    }
                    break;
                case 43:
                    iT = qa.N((List) unsafe.getObject(t, j2));
                    if (iT > 0) {
                        iY = g8.y(i8) + g8.A(iT);
                        iA = iY + iT;
                        i3 += iA;
                    }
                    break;
                case 44:
                    iT = qa.J((List) unsafe.getObject(t, j2));
                    if (iT > 0) {
                        iY = g8.y(i8) + g8.A(iT);
                        iA = iY + iT;
                        i3 += iA;
                    }
                    break;
                case 45:
                    iT = qa.R((List) unsafe.getObject(t, j2));
                    if (iT > 0) {
                        iY = g8.y(i8) + g8.A(iT);
                        iA = iY + iT;
                        i3 += iA;
                    }
                    break;
                case 46:
                    iT = qa.T((List) unsafe.getObject(t, j2));
                    if (iT > 0) {
                        iY = g8.y(i8) + g8.A(iT);
                        iA = iY + iT;
                        i3 += iA;
                    }
                    break;
                case 47:
                    iT = qa.P((List) unsafe.getObject(t, j2));
                    if (iT > 0) {
                        iY = g8.y(i8) + g8.A(iT);
                        iA = iY + iT;
                        i3 += iA;
                    }
                    break;
                case 48:
                    iT = qa.H((List) unsafe.getObject(t, j2));
                    if (iT > 0) {
                        iY = g8.y(i8) + g8.A(iT);
                        iA = iY + iT;
                        i3 += iA;
                    }
                    break;
                case 49:
                    iU = qa.b0(i8, (List) unsafe.getObject(t, j2), O(i6));
                    i3 += iU;
                    break;
                case 50:
                    y9.a(i8, unsafe.getObject(t, j2), P(i6));
                    break;
                case 51:
                    if (u(t, i8, i6)) {
                        iU = g8.A(i8 << 3) + 8;
                        i3 += iU;
                    }
                    break;
                case 52:
                    if (u(t, i8, i6)) {
                        iU = g8.A(i8 << 3) + 4;
                        i3 += iU;
                    }
                    break;
                case 53:
                    if (u(t, i8, i6)) {
                        jO = o(t, j2);
                        iU = g8.A(i8 << 3) + g8.B(jO);
                        i3 += iU;
                    }
                    break;
                case 54:
                    if (u(t, i8, i6)) {
                        jO = o(t, j2);
                        iU = g8.A(i8 << 3) + g8.B(jO);
                        i3 += iU;
                    }
                    break;
                case 55:
                    if (u(t, i8, i6)) {
                        iN2 = n(t, j2);
                        iY = g8.A(i8 << 3);
                        iT = g8.z(iN2);
                        iA = iY + iT;
                        i3 += iA;
                    }
                    break;
                case 56:
                    if (u(t, i8, i6)) {
                        iU = g8.A(i8 << 3) + 8;
                        i3 += iU;
                    }
                    break;
                case 57:
                    if (u(t, i8, i6)) {
                        iU = g8.A(i8 << 3) + 4;
                        i3 += iU;
                    }
                    break;
                case 58:
                    if (u(t, i8, i6)) {
                        iU = g8.A(i8 << 3) + 1;
                        i3 += iU;
                    }
                    break;
                case 59:
                    if (u(t, i8, i6)) {
                        object = unsafe.getObject(t, j2);
                        if (object instanceof z7) {
                            int iA4 = g8.A(i8 << 3);
                            int iD3 = ((z7) object).d();
                            iA = iA4 + g8.A(iD3) + iD3;
                        } else {
                            iY = g8.A(i8 << 3);
                            iT = g8.C((String) object);
                            iA = iY + iT;
                        }
                        i3 += iA;
                    }
                    break;
                case 60:
                    if (u(t, i8, i6)) {
                        iU = qa.Y(i8, unsafe.getObject(t, j2), O(i6));
                        i3 += iU;
                    }
                    break;
                case 61:
                    if (u(t, i8, i6)) {
                        object = unsafe.getObject(t, j2);
                        int iA5 = g8.A(i8 << 3);
                        int iD4 = ((z7) object).d();
                        iA = iA5 + g8.A(iD4) + iD4;
                        i3 += iA;
                    }
                    break;
                case 62:
                    if (u(t, i8, i6)) {
                        iN = n(t, j2);
                        iY = g8.A(i8 << 3);
                        iT = g8.A(iN);
                        iA = iY + iT;
                        i3 += iA;
                    }
                    break;
                case 63:
                    if (u(t, i8, i6)) {
                        iN2 = n(t, j2);
                        iY = g8.A(i8 << 3);
                        iT = g8.z(iN2);
                        iA = iY + iT;
                        i3 += iA;
                    }
                    break;
                case 64:
                    if (u(t, i8, i6)) {
                        iU = g8.A(i8 << 3) + 4;
                        i3 += iU;
                    }
                    break;
                case 65:
                    if (u(t, i8, i6)) {
                        iU = g8.A(i8 << 3) + 8;
                        i3 += iU;
                    }
                    break;
                case 66:
                    if (u(t, i8, i6)) {
                        iN3 = n(t, j2);
                        iY = g8.A(i8 << 3);
                        iN = (iN3 >> 31) ^ (iN3 + iN3);
                        iT = g8.A(iN);
                        iA = iY + iT;
                        i3 += iA;
                    }
                    break;
                case 67:
                    if (u(t, i8, i6)) {
                        jO2 = o(t, j2);
                        iY = g8.A(i8 << 3);
                        iT = g8.B((jO2 >> 63) ^ (jO2 + jO2));
                        iA = iY + iT;
                        i3 += iA;
                    }
                    break;
                case 68:
                    if (u(t, i8, i6)) {
                        iU = g8.e(i8, (da) unsafe.getObject(t, j2), O(i6));
                        i3 += iU;
                    }
                    break;
            }
        }
        db<?, ?> dbVar = this.f1057l;
        int iH = i3 + dbVar.h(dbVar.d(t));
        if (!this.f) {
            return iH;
        }
        this.f1058m.b(t);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01ba A[PHI: r4
  0x01ba: PHI (r4v107 int) = 
  (r4v70 int)
  (r4v73 int)
  (r4v76 int)
  (r4v79 int)
  (r4v82 int)
  (r4v85 int)
  (r4v88 int)
  (r4v91 int)
  (r4v94 int)
  (r4v97 int)
  (r4v100 int)
  (r4v103 int)
  (r4v106 int)
  (r4v110 int)
 binds: [B:111:0x01b8, B:108:0x01ab, B:105:0x019e, B:102:0x0191, B:99:0x0184, B:96:0x0177, B:93:0x016a, B:90:0x015d, B:87:0x014f, B:84:0x0141, B:81:0x0133, B:78:0x0125, B:75:0x0117, B:72:0x0109] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:129:0x0263  */
    /* JADX WARN: Code duplicated, block: B:154:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:155:0x02db A[PHI: r4
  0x02db: PHI (r4v137 java.lang.Object) = (r4v17 java.lang.Object), (r4v133 java.lang.Object), (r4v140 java.lang.Object) binds: [B:162:0x030e, B:43:0x0097, B:154:0x02d7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:158:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:164:0x0311 A[PHI: r4
  0x0311: PHI (r4v129 java.lang.Object) = (r4v17 java.lang.Object), (r4v133 java.lang.Object) binds: [B:162:0x030e, B:43:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:167:0x0324  */
    /* JADX WARN: Code duplicated, block: B:176:0x0342  */
    /* JADX WARN: Code duplicated, block: B:185:0x0360  */
    /* JADX WARN: Code duplicated, block: B:189:0x0377  */
    /* JADX WARN: Code duplicated, block: B:192:0x0387  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cc  */
    private final int K(T t) {
        long jK;
        Object objS;
        int i2;
        int i3;
        int i4;
        long jK2;
        int iU;
        int iT;
        int iY;
        int iA;
        Unsafe unsafe = p;
        int iA2 = 0;
        for (int i5 = 0; i5 < this.a.length; i5 += 3) {
            int i6 = i(i5);
            int iK = k(i6);
            int i7 = this.a[i5];
            long j2 = i6 & 1048575;
            if (iK >= r8.T.zza() && iK <= r8.g0.zza()) {
                int i8 = this.a[i5 + 2];
            }
            switch (iK) {
                case 0:
                    if (s(t, i5)) {
                        iU = g8.A(i7 << 3) + 8;
                        iA2 += iU;
                    }
                    break;
                case 1:
                    if (s(t, i5)) {
                        iU = g8.A(i7 << 3) + 4;
                        iA2 += iU;
                    }
                    break;
                case 2:
                    if (s(t, i5)) {
                        jK = nb.k(t, j2);
                        iA2 += g8.A(i7 << 3) + g8.B(jK);
                    }
                    break;
                case 3:
                    if (s(t, i5)) {
                        jK = nb.k(t, j2);
                        iA2 += g8.A(i7 << 3) + g8.B(jK);
                    }
                    break;
                case 4:
                    if (s(t, i5)) {
                        i3 = nb.i(t, j2);
                        iY = g8.A(i7 << 3);
                        iT = g8.z(i3);
                        iA = iY + iT;
                        iA2 += iA;
                    }
                    break;
                case 5:
                    if (s(t, i5)) {
                        iU = g8.A(i7 << 3) + 8;
                        iA2 += iU;
                    }
                    break;
                case 6:
                    if (s(t, i5)) {
                        iU = g8.A(i7 << 3) + 4;
                        iA2 += iU;
                    }
                    break;
                case 7:
                    if (s(t, i5)) {
                        iU = g8.A(i7 << 3) + 1;
                        iA2 += iU;
                    }
                    break;
                case 8:
                    if (s(t, i5)) {
                        objS = nb.s(t, j2);
                        if (objS instanceof z7) {
                            int iA3 = g8.A(i7 << 3);
                            int iD = ((z7) objS).d();
                            iA = iA3 + g8.A(iD) + iD;
                        } else {
                            iY = g8.A(i7 << 3);
                            iT = g8.C((String) objS);
                            iA = iY + iT;
                        }
                        iA2 += iA;
                    }
                    break;
                case 9:
                    if (s(t, i5)) {
                        iU = qa.Y(i7, nb.s(t, j2), O(i5));
                        iA2 += iU;
                    }
                    break;
                case 10:
                    if (s(t, i5)) {
                        objS = nb.s(t, j2);
                        int iA4 = g8.A(i7 << 3);
                        int iD2 = ((z7) objS).d();
                        iA = iA4 + g8.A(iD2) + iD2;
                        iA2 += iA;
                    }
                    break;
                case 11:
                    if (s(t, i5)) {
                        i2 = nb.i(t, j2);
                        iY = g8.A(i7 << 3);
                        iT = g8.A(i2);
                        iA = iY + iT;
                        iA2 += iA;
                    }
                    break;
                case 12:
                    if (s(t, i5)) {
                        i3 = nb.i(t, j2);
                        iY = g8.A(i7 << 3);
                        iT = g8.z(i3);
                        iA = iY + iT;
                        iA2 += iA;
                    }
                    break;
                case 13:
                    if (s(t, i5)) {
                        iU = g8.A(i7 << 3) + 4;
                        iA2 += iU;
                    }
                    break;
                case 14:
                    if (s(t, i5)) {
                        iU = g8.A(i7 << 3) + 8;
                        iA2 += iU;
                    }
                    break;
                case 15:
                    if (s(t, i5)) {
                        i4 = nb.i(t, j2);
                        iY = g8.A(i7 << 3);
                        i2 = (i4 >> 31) ^ (i4 + i4);
                        iT = g8.A(i2);
                        iA = iY + iT;
                        iA2 += iA;
                    }
                    break;
                case 16:
                    if (s(t, i5)) {
                        jK2 = nb.k(t, j2);
                        iY = g8.A(i7 << 3);
                        iT = g8.B((jK2 >> 63) ^ (jK2 + jK2));
                        iA = iY + iT;
                        iA2 += iA;
                    }
                    break;
                case 17:
                    if (s(t, i5)) {
                        iU = g8.e(i7, (da) nb.s(t, j2), O(i5));
                        iA2 += iU;
                    }
                    break;
                case 18:
                case 23:
                case 32:
                    iU = qa.U(i7, (List) nb.s(t, j2), false);
                    iA2 += iU;
                    break;
                case 19:
                case 24:
                case 31:
                    iU = qa.S(i7, (List) nb.s(t, j2), false);
                    iA2 += iU;
                    break;
                case 20:
                    iU = qa.E(i7, (List) nb.s(t, j2), false);
                    iA2 += iU;
                    break;
                case 21:
                    iU = qa.G(i7, (List) nb.s(t, j2), false);
                    iA2 += iU;
                    break;
                case 22:
                    iU = qa.M(i7, (List) nb.s(t, j2), false);
                    iA2 += iU;
                    break;
                case 25:
                    iU = qa.W(i7, (List) nb.s(t, j2), false);
                    iA2 += iU;
                    break;
                case 26:
                    iU = qa.X(i7, (List) nb.s(t, j2));
                    iA2 += iU;
                    break;
                case 27:
                    iU = qa.Z(i7, (List) nb.s(t, j2), O(i5));
                    iA2 += iU;
                    break;
                case 28:
                    iU = qa.a0(i7, (List) nb.s(t, j2));
                    iA2 += iU;
                    break;
                case 29:
                    iU = qa.O(i7, (List) nb.s(t, j2), false);
                    iA2 += iU;
                    break;
                case 30:
                    iU = qa.K(i7, (List) nb.s(t, j2), false);
                    iA2 += iU;
                    break;
                case 33:
                    iU = qa.Q(i7, (List) nb.s(t, j2), false);
                    iA2 += iU;
                    break;
                case 34:
                    iU = qa.I(i7, (List) nb.s(t, j2), false);
                    iA2 += iU;
                    break;
                case 35:
                    iT = qa.T((List) unsafe.getObject(t, j2));
                    if (iT > 0) {
                        iY = g8.y(i7) + g8.A(iT);
                        iA = iY + iT;
                        iA2 += iA;
                    }
                    break;
                case 36:
                    iT = qa.R((List) unsafe.getObject(t, j2));
                    if (iT > 0) {
                        iY = g8.y(i7) + g8.A(iT);
                        iA = iY + iT;
                        iA2 += iA;
                    }
                    break;
                case 37:
                    iT = qa.D((List) unsafe.getObject(t, j2));
                    if (iT > 0) {
                        iY = g8.y(i7) + g8.A(iT);
                        iA = iY + iT;
                        iA2 += iA;
                    }
                    break;
                case 38:
                    iT = qa.F((List) unsafe.getObject(t, j2));
                    if (iT > 0) {
                        iY = g8.y(i7) + g8.A(iT);
                        iA = iY + iT;
                        iA2 += iA;
                    }
                    break;
                case 39:
                    iT = qa.L((List) unsafe.getObject(t, j2));
                    if (iT > 0) {
                        iY = g8.y(i7) + g8.A(iT);
                        iA = iY + iT;
                        iA2 += iA;
                    }
                    break;
                case 40:
                    iT = qa.T((List) unsafe.getObject(t, j2));
                    if (iT > 0) {
                        iY = g8.y(i7) + g8.A(iT);
                        iA = iY + iT;
                        iA2 += iA;
                    }
                    break;
                case 41:
                    iT = qa.R((List) unsafe.getObject(t, j2));
                    if (iT > 0) {
                        iY = g8.y(i7) + g8.A(iT);
                        iA = iY + iT;
                        iA2 += iA;
                    }
                    break;
                case 42:
                    iT = qa.V((List) unsafe.getObject(t, j2));
                    if (iT > 0) {
                        iY = g8.y(i7) + g8.A(iT);
                        iA = iY + iT;
                        iA2 += iA;
                    }
                    break;
                case 43:
                    iT = qa.N((List) unsafe.getObject(t, j2));
                    if (iT > 0) {
                        iY = g8.y(i7) + g8.A(iT);
                        iA = iY + iT;
                        iA2 += iA;
                    }
                    break;
                case 44:
                    iT = qa.J((List) unsafe.getObject(t, j2));
                    if (iT > 0) {
                        iY = g8.y(i7) + g8.A(iT);
                        iA = iY + iT;
                        iA2 += iA;
                    }
                    break;
                case 45:
                    iT = qa.R((List) unsafe.getObject(t, j2));
                    if (iT > 0) {
                        iY = g8.y(i7) + g8.A(iT);
                        iA = iY + iT;
                        iA2 += iA;
                    }
                    break;
                case 46:
                    iT = qa.T((List) unsafe.getObject(t, j2));
                    if (iT > 0) {
                        iY = g8.y(i7) + g8.A(iT);
                        iA = iY + iT;
                        iA2 += iA;
                    }
                    break;
                case 47:
                    iT = qa.P((List) unsafe.getObject(t, j2));
                    if (iT > 0) {
                        iY = g8.y(i7) + g8.A(iT);
                        iA = iY + iT;
                        iA2 += iA;
                    }
                    break;
                case 48:
                    iT = qa.H((List) unsafe.getObject(t, j2));
                    if (iT > 0) {
                        iY = g8.y(i7) + g8.A(iT);
                        iA = iY + iT;
                        iA2 += iA;
                    }
                    break;
                case 49:
                    iU = qa.b0(i7, (List) nb.s(t, j2), O(i5));
                    iA2 += iU;
                    break;
                case 50:
                    y9.a(i7, nb.s(t, j2), P(i5));
                    break;
                case 51:
                    if (u(t, i7, i5)) {
                        iU = g8.A(i7 << 3) + 8;
                        iA2 += iU;
                    }
                    break;
                case 52:
                    if (u(t, i7, i5)) {
                        iU = g8.A(i7 << 3) + 4;
                        iA2 += iU;
                    }
                    break;
                case 53:
                    if (u(t, i7, i5)) {
                        jK = o(t, j2);
                        iA2 += g8.A(i7 << 3) + g8.B(jK);
                    }
                    break;
                case 54:
                    if (u(t, i7, i5)) {
                        jK = o(t, j2);
                        iA2 += g8.A(i7 << 3) + g8.B(jK);
                    }
                    break;
                case 55:
                    if (u(t, i7, i5)) {
                        i3 = n(t, j2);
                        iY = g8.A(i7 << 3);
                        iT = g8.z(i3);
                        iA = iY + iT;
                        iA2 += iA;
                    }
                    break;
                case 56:
                    if (u(t, i7, i5)) {
                        iU = g8.A(i7 << 3) + 8;
                        iA2 += iU;
                    }
                    break;
                case 57:
                    if (u(t, i7, i5)) {
                        iU = g8.A(i7 << 3) + 4;
                        iA2 += iU;
                    }
                    break;
                case 58:
                    if (u(t, i7, i5)) {
                        iU = g8.A(i7 << 3) + 1;
                        iA2 += iU;
                    }
                    break;
                case 59:
                    if (u(t, i7, i5)) {
                        objS = nb.s(t, j2);
                        if (objS instanceof z7) {
                            int iA5 = g8.A(i7 << 3);
                            int iD3 = ((z7) objS).d();
                            iA = iA5 + g8.A(iD3) + iD3;
                        } else {
                            iY = g8.A(i7 << 3);
                            iT = g8.C((String) objS);
                            iA = iY + iT;
                        }
                        iA2 += iA;
                    }
                    break;
                case 60:
                    if (u(t, i7, i5)) {
                        iU = qa.Y(i7, nb.s(t, j2), O(i5));
                        iA2 += iU;
                    }
                    break;
                case 61:
                    if (u(t, i7, i5)) {
                        objS = nb.s(t, j2);
                        int iA6 = g8.A(i7 << 3);
                        int iD4 = ((z7) objS).d();
                        iA = iA6 + g8.A(iD4) + iD4;
                        iA2 += iA;
                    }
                    break;
                case 62:
                    if (u(t, i7, i5)) {
                        i2 = n(t, j2);
                        iY = g8.A(i7 << 3);
                        iT = g8.A(i2);
                        iA = iY + iT;
                        iA2 += iA;
                    }
                    break;
                case 63:
                    if (u(t, i7, i5)) {
                        i3 = n(t, j2);
                        iY = g8.A(i7 << 3);
                        iT = g8.z(i3);
                        iA = iY + iT;
                        iA2 += iA;
                    }
                    break;
                case 64:
                    if (u(t, i7, i5)) {
                        iU = g8.A(i7 << 3) + 4;
                        iA2 += iU;
                    }
                    break;
                case 65:
                    if (u(t, i7, i5)) {
                        iU = g8.A(i7 << 3) + 8;
                        iA2 += iU;
                    }
                    break;
                case 66:
                    if (u(t, i7, i5)) {
                        i4 = n(t, j2);
                        iY = g8.A(i7 << 3);
                        i2 = (i4 >> 31) ^ (i4 + i4);
                        iT = g8.A(i2);
                        iA = iY + iT;
                        iA2 += iA;
                    }
                    break;
                case 67:
                    if (u(t, i7, i5)) {
                        jK2 = o(t, j2);
                        iY = g8.A(i7 << 3);
                        iT = g8.B((jK2 >> 63) ^ (jK2 + jK2));
                        iA = iY + iT;
                        iA2 += iA;
                    }
                    break;
                case 68:
                    if (u(t, i7, i5)) {
                        iU = g8.e(i7, (da) nb.s(t, j2), O(i5));
                        iA2 += iU;
                    }
                    break;
            }
        }
        db<?, ?> dbVar = this.f1057l;
        return iA2 + dbVar.h(dbVar.d(t));
    }

    /* JADX WARN: Code duplicated, block: B:152:0x0258 A[LOOP:9: B:153:0x0259->B:152:0x0258, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:155:0x025e  */
    /* JADX WARN: Code duplicated, block: B:158:0x0267  */
    /* JADX WARN: Code duplicated, block: B:294:0x0272 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:295:0x0256 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x01b4 -> B:94:0x0193). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:122:0x01f8 -> B:112:0x01cf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:159:0x026f -> B:151:0x0256). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0149 -> B:63:0x0124). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private final int L(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.measurement.o7 r29) throws com.google.android.gms.internal.measurement.i9 {
        /*
            Method dump skipped, instruction units count: 1072
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.ga.L(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.o7):int");
    }

    private final <K, V> int M(T t, byte[] bArr, int i2, int i3, int i4, long j2, o7 o7Var) {
        Unsafe unsafe = p;
        Object objP = P(i4);
        Object object = unsafe.getObject(t, j2);
        if (!((x9) object).h()) {
            x9<K, V> x9VarE = x9.a().e();
            y9.b(x9VarE, object);
            unsafe.putObject(t, j2, x9VarE);
        }
        throw null;
    }

    private final int N(T t, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, o7 o7Var) throws i9 {
        int iC;
        long jB;
        int iA;
        Object objValueOf;
        int iA2;
        Object objI;
        Unsafe unsafe = p;
        long j3 = this.a[i9 + 2] & 1048575;
        switch (i8) {
            case 51:
                if (i6 != 1) {
                    return i2;
                }
                unsafe.putObject(t, j2, Double.valueOf(Double.longBitsToDouble(p7.e(bArr, i2))));
                unsafe.putInt(t, j3, i5);
                return i2 + 8;
            case 52:
                if (i6 != 5) {
                    return i2;
                }
                unsafe.putObject(t, j2, Float.valueOf(Float.intBitsToFloat(p7.d(bArr, i2))));
                unsafe.putInt(t, j3, i5);
                return i2 + 4;
            case 53:
            case 54:
                if (i6 != 0) {
                    return i2;
                }
                iC = p7.c(bArr, i2, o7Var);
                jB = o7Var.b;
                objValueOf = Long.valueOf(jB);
                unsafe.putObject(t, j2, objValueOf);
                unsafe.putInt(t, j3, i5);
                return iC;
            case 55:
            case 62:
                if (i6 != 0) {
                    return i2;
                }
                iC = p7.a(bArr, i2, o7Var);
                iA = o7Var.a;
                objValueOf = Integer.valueOf(iA);
                unsafe.putObject(t, j2, objValueOf);
                unsafe.putInt(t, j3, i5);
                return iC;
            case 56:
            case 65:
                if (i6 != 1) {
                    return i2;
                }
                unsafe.putObject(t, j2, Long.valueOf(p7.e(bArr, i2)));
                unsafe.putInt(t, j3, i5);
                return i2 + 8;
            case 57:
            case 64:
                if (i6 != 5) {
                    return i2;
                }
                unsafe.putObject(t, j2, Integer.valueOf(p7.d(bArr, i2)));
                unsafe.putInt(t, j3, i5);
                return i2 + 4;
            case 58:
                if (i6 != 0) {
                    return i2;
                }
                iC = p7.c(bArr, i2, o7Var);
                objValueOf = Boolean.valueOf(o7Var.b != 0);
                unsafe.putObject(t, j2, objValueOf);
                unsafe.putInt(t, j3, i5);
                return iC;
            case 59:
                if (i6 != 2) {
                    return i2;
                }
                iA2 = p7.a(bArr, i2, o7Var);
                int i10 = o7Var.a;
                if (i10 == 0) {
                    objI = "";
                    unsafe.putObject(t, j2, objI);
                } else {
                    if ((i7 & 536870912) != 0 && !sb.b(bArr, iA2, iA2 + i10)) {
                        throw i9.f();
                    }
                    unsafe.putObject(t, j2, new String(bArr, iA2, i10, g9.a));
                    iA2 += i10;
                }
                unsafe.putInt(t, j3, i5);
                return iA2;
            case 60:
                if (i6 != 2) {
                    return i2;
                }
                iA2 = p7.i(O(i9), bArr, i2, i3, o7Var);
                Object object = unsafe.getInt(t, j3) == i5 ? unsafe.getObject(t, j2) : null;
                objI = o7Var.c;
                if (object != null) {
                    objI = g9.i(object, objI);
                }
                unsafe.putObject(t, j2, objI);
                unsafe.putInt(t, j3, i5);
                return iA2;
            case 61:
                if (i6 != 2) {
                    return i2;
                }
                iC = p7.h(bArr, i2, o7Var);
                objValueOf = o7Var.c;
                unsafe.putObject(t, j2, objValueOf);
                unsafe.putInt(t, j3, i5);
                return iC;
            case 63:
                if (i6 != 0) {
                    return i2;
                }
                int iA3 = p7.a(bArr, i2, o7Var);
                int i11 = o7Var.a;
                c9 c9VarQ = Q(i9);
                if (c9VarQ == null || c9VarQ.a(i11)) {
                    unsafe.putObject(t, j2, Integer.valueOf(i11));
                    unsafe.putInt(t, j3, i5);
                } else {
                    C(t).h(i4, Long.valueOf(i11));
                }
                return iA3;
            case 66:
                if (i6 != 0) {
                    return i2;
                }
                iC = p7.a(bArr, i2, o7Var);
                iA = c8.a(o7Var.a);
                objValueOf = Integer.valueOf(iA);
                unsafe.putObject(t, j2, objValueOf);
                unsafe.putInt(t, j3, i5);
                return iC;
            case 67:
                if (i6 != 0) {
                    return i2;
                }
                iC = p7.c(bArr, i2, o7Var);
                jB = c8.b(o7Var.b);
                objValueOf = Long.valueOf(jB);
                unsafe.putObject(t, j2, objValueOf);
                unsafe.putInt(t, j3, i5);
                return iC;
            case 68:
                if (i6 != 3) {
                    return i2;
                }
                iA2 = p7.j(O(i9), bArr, i2, i3, (i4 & (-8)) | 4, o7Var);
                Object object2 = unsafe.getInt(t, j3) == i5 ? unsafe.getObject(t, j2) : null;
                objI = o7Var.c;
                if (object2 != null) {
                    objI = g9.i(object2, objI);
                }
                unsafe.putObject(t, j2, objI);
                unsafe.putInt(t, j3, i5);
                return iA2;
            default:
                return i2;
        }
    }

    private final oa O(int i2) {
        int i3 = i2 / 3;
        int i4 = i3 + i3;
        oa oaVar = (oa) this.b[i4];
        if (oaVar != null) {
            return oaVar;
        }
        oa<T> oaVarB = la.a().b((Class) this.b[i4 + 1]);
        this.b[i4] = oaVarB;
        return oaVarB;
    }

    private final Object P(int i2) {
        int i3 = i2 / 3;
        return this.b[i3 + i3];
    }

    private final c9 Q(int i2) {
        int i3 = i2 / 3;
        return (c9) this.b[i3 + i3 + 1];
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0290 A[PHI: r0 r19 r24 r25 r28
  0x0290: PHI (r0v19 int) = (r0v14 int), (r0v21 int) binds: [B:117:0x02f6, B:105:0x028e] A[DONT_GENERATE, DONT_INLINE]
  0x0290: PHI (r19v6 int) = (r19v4 int), (r19v7 int) binds: [B:117:0x02f6, B:105:0x028e] A[DONT_GENERATE, DONT_INLINE]
  0x0290: PHI (r24v3 int) = (r24v1 int), (r24v4 int) binds: [B:117:0x02f6, B:105:0x028e] A[DONT_GENERATE, DONT_INLINE]
  0x0290: PHI (r25v2 int) = (r25v0 int), (r25v3 int) binds: [B:117:0x02f6, B:105:0x028e] A[DONT_GENERATE, DONT_INLINE]
  0x0290: PHI (r28v6 sun.misc.Unsafe) = (r28v4 sun.misc.Unsafe), (r28v7 sun.misc.Unsafe) binds: [B:117:0x02f6, B:105:0x028e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:107:0x02a4 A[PHI: r0 r19 r24 r25 r28
  0x02a4: PHI (r0v18 int) = (r0v14 int), (r0v21 int) binds: [B:117:0x02f6, B:105:0x028e] A[DONT_GENERATE, DONT_INLINE]
  0x02a4: PHI (r19v5 int) = (r19v4 int), (r19v7 int) binds: [B:117:0x02f6, B:105:0x028e] A[DONT_GENERATE, DONT_INLINE]
  0x02a4: PHI (r24v2 int) = (r24v1 int), (r24v4 int) binds: [B:117:0x02f6, B:105:0x028e] A[DONT_GENERATE, DONT_INLINE]
  0x02a4: PHI (r25v1 int) = (r25v0 int), (r25v3 int) binds: [B:117:0x02f6, B:105:0x028e] A[DONT_GENERATE, DONT_INLINE]
  0x02a4: PHI (r28v5 sun.misc.Unsafe) = (r28v4 sun.misc.Unsafe), (r28v7 sun.misc.Unsafe) binds: [B:117:0x02f6, B:105:0x028e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x0093. Please report as an issue. */
    private final int R(T t, byte[] bArr, int i2, int i3, o7 o7Var) throws i9 {
        int i4;
        int iB;
        int i5;
        int i6;
        Unsafe unsafe;
        int i7;
        int i8;
        Unsafe unsafe2;
        int i9;
        int i10;
        int i11;
        int iC;
        long jB;
        int iA;
        int i12;
        Object objI;
        Unsafe unsafe3;
        this = this;
        t = t;
        bArr = bArr;
        i3 = i3;
        o7Var = o7Var;
        Unsafe unsafe4 = p;
        int i13 = -1;
        int i14 = 1048575;
        int iN = i2;
        int i15 = -1;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1048575;
        while (iN < i3) {
            int i19 = iN + 1;
            byte b = bArr[iN];
            if (b < 0) {
                iB = p7.b(b, bArr, i19, o7Var);
                i4 = o7Var.a;
            } else {
                i4 = b;
                iB = i19;
            }
            int i20 = i4 >>> 3;
            int i21 = i4 & 7;
            int iX = i20 > i15 ? this.x(i20, i16 / 3) : this.w(i20);
            if (iX == i13) {
                i5 = iB;
                i6 = i20;
                unsafe = unsafe4;
                i7 = 0;
            } else {
                int i22 = this.a[iX + 1];
                int iK = k(i22);
                Unsafe unsafe5 = unsafe4;
                long j2 = i22 & i14;
                if (iK <= 17) {
                    int i23 = this.a[iX + 2];
                    int i24 = 1 << (i23 >>> 20);
                    int i25 = i23 & 1048575;
                    if (i25 != i18) {
                        if (i18 != 1048575) {
                            long j3 = i18;
                            unsafe3 = unsafe5;
                            unsafe3.putInt(t, j3, i17);
                        } else {
                            unsafe3 = unsafe5;
                        }
                        if (i25 != 1048575) {
                            i17 = unsafe3.getInt(t, i25);
                        }
                        unsafe2 = unsafe3;
                        i18 = i25;
                    } else {
                        unsafe2 = unsafe5;
                    }
                    switch (iK) {
                        case 0:
                            i8 = iX;
                            i6 = i20;
                            if (i21 != 1) {
                                i5 = iB;
                                unsafe = unsafe2;
                                i7 = i8;
                            } else {
                                nb.r(t, j2, Double.longBitsToDouble(p7.e(bArr, iB)));
                                iN = iB + 8;
                                i17 |= i24;
                                unsafe4 = unsafe2;
                                i16 = i8;
                                i15 = i6;
                                i14 = 1048575;
                                i13 = -1;
                                i3 = i3;
                            }
                            break;
                        case 1:
                            i8 = iX;
                            i6 = i20;
                            if (i21 != 5) {
                                i5 = iB;
                                unsafe = unsafe2;
                                i7 = i8;
                            } else {
                                nb.p(t, j2, Float.intBitsToFloat(p7.d(bArr, iB)));
                                iN = iB + 4;
                                i17 |= i24;
                                unsafe4 = unsafe2;
                                i16 = i8;
                                i15 = i6;
                                i14 = 1048575;
                                i13 = -1;
                                i3 = i3;
                            }
                            break;
                        case 2:
                        case 3:
                            i8 = iX;
                            i6 = i20;
                            if (i21 != 0) {
                                i5 = iB;
                                unsafe = unsafe2;
                                i7 = i8;
                            } else {
                                iC = p7.c(bArr, iB, o7Var);
                                jB = o7Var.b;
                                unsafe2.putLong(t, j2, jB);
                                i17 |= i24;
                                unsafe4 = unsafe2;
                                i16 = i8;
                                iN = iC;
                                i15 = i6;
                                i14 = 1048575;
                                i13 = -1;
                                i3 = i3;
                            }
                            break;
                        case 4:
                        case 11:
                            i8 = iX;
                            i6 = i20;
                            if (i21 != 0) {
                                i5 = iB;
                                unsafe = unsafe2;
                                i7 = i8;
                            } else {
                                iN = p7.a(bArr, iB, o7Var);
                                iA = o7Var.a;
                                unsafe2.putInt(t, j2, iA);
                                i17 |= i24;
                                unsafe4 = unsafe2;
                                i16 = i8;
                                i15 = i6;
                                i14 = 1048575;
                                i13 = -1;
                                i3 = i3;
                            }
                            break;
                        case 5:
                        case 14:
                            i8 = iX;
                            i6 = i20;
                            if (i21 != 1) {
                                i5 = iB;
                                unsafe = unsafe2;
                                i7 = i8;
                            } else {
                                unsafe2.putLong(t, j2, p7.e(bArr, iB));
                                iN = iB + 8;
                                i17 |= i24;
                                unsafe4 = unsafe2;
                                i16 = i8;
                                i15 = i6;
                                i14 = 1048575;
                                i13 = -1;
                                i3 = i3;
                            }
                            break;
                        case 6:
                        case 13:
                            i12 = i3;
                            i8 = iX;
                            i6 = i20;
                            if (i21 != 5) {
                                i5 = iB;
                                unsafe = unsafe2;
                                i7 = i8;
                            } else {
                                unsafe2.putInt(t, j2, p7.d(bArr, iB));
                                iN = iB + 4;
                                i17 |= i24;
                                unsafe4 = unsafe2;
                                i15 = i6;
                                i14 = 1048575;
                                i13 = -1;
                                int i26 = i8;
                                i3 = i12;
                                i16 = i26;
                            }
                            break;
                        case 7:
                            i12 = i3;
                            i8 = iX;
                            i6 = i20;
                            if (i21 != 0) {
                                i5 = iB;
                                unsafe = unsafe2;
                                i7 = i8;
                            } else {
                                iN = p7.c(bArr, iB, o7Var);
                                nb.n(t, j2, o7Var.b != 0);
                                i17 |= i24;
                                unsafe4 = unsafe2;
                                i15 = i6;
                                i14 = 1048575;
                                i13 = -1;
                                int i27 = i8;
                                i3 = i12;
                                i16 = i27;
                            }
                            break;
                        case 8:
                            i12 = i3;
                            i8 = iX;
                            i6 = i20;
                            if (i21 != 2) {
                                i5 = iB;
                                unsafe = unsafe2;
                                i7 = i8;
                            } else {
                                iN = (i22 & 536870912) == 0 ? p7.f(bArr, iB, o7Var) : p7.g(bArr, iB, o7Var);
                                objI = o7Var.c;
                                unsafe2.putObject(t, j2, objI);
                                i17 |= i24;
                                unsafe4 = unsafe2;
                                i15 = i6;
                                i14 = 1048575;
                                i13 = -1;
                                int i28 = i8;
                                i3 = i12;
                                i16 = i28;
                            }
                            break;
                        case 9:
                            i8 = iX;
                            i6 = i20;
                            if (i21 != 2) {
                                i5 = iB;
                                unsafe = unsafe2;
                                i7 = i8;
                            } else {
                                i12 = i3;
                                iN = p7.i(this.O(i8), bArr, iB, i12, o7Var);
                                Object object = unsafe2.getObject(t, j2);
                                objI = object == null ? o7Var.c : g9.i(object, o7Var.c);
                                unsafe2.putObject(t, j2, objI);
                                i17 |= i24;
                                unsafe4 = unsafe2;
                                i15 = i6;
                                i14 = 1048575;
                                i13 = -1;
                                int i29 = i8;
                                i3 = i12;
                                i16 = i29;
                            }
                            break;
                        case 10:
                            i8 = iX;
                            i6 = i20;
                            if (i21 != 2) {
                                i5 = iB;
                                unsafe = unsafe2;
                                i7 = i8;
                            } else {
                                iN = p7.h(bArr, iB, o7Var);
                                unsafe2.putObject(t, j2, o7Var.c);
                                i17 |= i24;
                                unsafe4 = unsafe2;
                                i16 = i8;
                                i15 = i6;
                                i14 = 1048575;
                                i13 = -1;
                                i3 = i3;
                            }
                            break;
                        case 12:
                            i8 = iX;
                            i6 = i20;
                            if (i21 != 0) {
                                i5 = iB;
                                unsafe = unsafe2;
                                i7 = i8;
                            } else {
                                iN = p7.a(bArr, iB, o7Var);
                                iA = o7Var.a;
                                unsafe2.putInt(t, j2, iA);
                                i17 |= i24;
                                unsafe4 = unsafe2;
                                i16 = i8;
                                i15 = i6;
                                i14 = 1048575;
                                i13 = -1;
                                i3 = i3;
                            }
                            break;
                        case 15:
                            i8 = iX;
                            i6 = i20;
                            if (i21 != 0) {
                                i5 = iB;
                                unsafe = unsafe2;
                                i7 = i8;
                            } else {
                                iN = p7.a(bArr, iB, o7Var);
                                iA = c8.a(o7Var.a);
                                unsafe2.putInt(t, j2, iA);
                                i17 |= i24;
                                unsafe4 = unsafe2;
                                i16 = i8;
                                i15 = i6;
                                i14 = 1048575;
                                i13 = -1;
                                i3 = i3;
                            }
                            break;
                        case 16:
                            if (i21 != 0) {
                                i8 = iX;
                                i6 = i20;
                                i5 = iB;
                                unsafe = unsafe2;
                                i7 = i8;
                            } else {
                                iC = p7.c(bArr, iB, o7Var);
                                jB = c8.b(o7Var.b);
                                i8 = iX;
                                i6 = i20;
                                unsafe2.putLong(t, j2, jB);
                                i17 |= i24;
                                unsafe4 = unsafe2;
                                i16 = i8;
                                iN = iC;
                                i15 = i6;
                                i14 = 1048575;
                                i13 = -1;
                                i3 = i3;
                            }
                            break;
                        default:
                            i8 = iX;
                            i6 = i20;
                            i5 = iB;
                            unsafe = unsafe2;
                            i7 = i8;
                            break;
                    }
                } else {
                    i6 = i20;
                    i8 = iX;
                    unsafe2 = unsafe5;
                    if (iK != 27) {
                        if (iK <= 49) {
                            int i30 = iB;
                            i10 = i17;
                            i11 = i18;
                            unsafe = unsafe2;
                            i7 = i8;
                            iN = L(t, bArr, iB, i3, i4, i6, i21, i8, i22, iK, j2, o7Var);
                            if (iN != i30) {
                                i16 = i7;
                                i15 = i6;
                                i17 = i10;
                                i18 = i11;
                            } else {
                                i5 = iN;
                                i17 = i10;
                                i18 = i11;
                            }
                        } else {
                            i9 = iB;
                            i10 = i17;
                            i11 = i18;
                            unsafe = unsafe2;
                            i7 = i8;
                            if (iK != 50) {
                                iN = N(t, bArr, i9, i3, i4, i6, i21, i22, iK, j2, i7, o7Var);
                                if (iN != i9) {
                                    i16 = i7;
                                    i15 = i6;
                                    i17 = i10;
                                    i18 = i11;
                                } else {
                                    i5 = iN;
                                    i17 = i10;
                                    i18 = i11;
                                }
                            } else if (i21 == 2) {
                                M(t, bArr, i9, i3, i7, j2, o7Var);
                                throw null;
                            }
                        }
                        unsafe4 = unsafe;
                        i14 = 1048575;
                        i13 = -1;
                    } else if (i21 == 2) {
                        f9 f9VarK = (f9) unsafe2.getObject(t, j2);
                        if (!f9VarK.zza()) {
                            int size = f9VarK.size();
                            f9VarK = f9VarK.k(size == 0 ? 10 : size + size);
                            unsafe2.putObject(t, j2, f9VarK);
                        }
                        iN = p7.m(this.O(i8), i4, bArr, iB, i3, f9VarK, o7Var);
                        i17 = i17;
                        unsafe4 = unsafe2;
                        i16 = i8;
                        i15 = i6;
                        i14 = 1048575;
                        i13 = -1;
                        i3 = i3;
                    } else {
                        i9 = iB;
                        i10 = i17;
                        i11 = i18;
                        unsafe = unsafe2;
                        i7 = i8;
                    }
                    i5 = i9;
                    i17 = i10;
                    i18 = i11;
                }
            }
            iN = p7.n(i4, bArr, i5, i3, C(t), o7Var);
            i16 = i7;
            i15 = i6;
            unsafe4 = unsafe;
            i14 = 1048575;
            i13 = -1;
        }
        int i31 = i17;
        Unsafe unsafe6 = unsafe4;
        if (i18 != 1048575) {
            unsafe6.putInt(t, i18, i31);
        }
        if (iN == i3) {
            return iN;
        }
        throw i9.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean S(Object obj, int i2, oa oaVar) {
        return oaVar.a(nb.s(obj, i2 & 1048575));
    }

    private final int i(int i2) {
        return this.a[i2 + 1];
    }

    private final int j(int i2) {
        return this.a[i2 + 2];
    }

    private static int k(int i2) {
        return (i2 >>> 20) & Utils.MAX_STRENGTH_VALUE;
    }

    private static <T> double l(T t, long j2) {
        return ((Double) nb.s(t, j2)).doubleValue();
    }

    private static <T> float m(T t, long j2) {
        return ((Float) nb.s(t, j2)).floatValue();
    }

    private static <T> int n(T t, long j2) {
        return ((Integer) nb.s(t, j2)).intValue();
    }

    private static <T> long o(T t, long j2) {
        return ((Long) nb.s(t, j2)).longValue();
    }

    private static <T> boolean p(T t, long j2) {
        return ((Boolean) nb.s(t, j2)).booleanValue();
    }

    private final boolean q(T t, T t2, int i2) {
        return s(t, i2) == s(t2, i2);
    }

    private final boolean r(T t, int i2, int i3, int i4, int i5) {
        if (i3 == 1048575) {
            return s(t, i2);
        }
        return (i4 & i5) != 0;
    }

    private final boolean s(T t, int i2) {
        int iJ = j(i2);
        long j2 = iJ & 1048575;
        if (j2 != 1048575) {
            return (nb.i(t, j2) & (1 << (iJ >>> 20))) != 0;
        }
        int i3 = i(i2);
        long j3 = i3 & 1048575;
        switch (k(i3)) {
            case 0:
                return nb.q(t, j3) != 0.0d;
            case 1:
                return nb.o(t, j3) != 0.0f;
            case 2:
                return nb.k(t, j3) != 0;
            case 3:
                return nb.k(t, j3) != 0;
            case 4:
                return nb.i(t, j3) != 0;
            case 5:
                return nb.k(t, j3) != 0;
            case 6:
                return nb.i(t, j3) != 0;
            case 7:
                return nb.m(t, j3);
            case 8:
                Object objS = nb.s(t, j3);
                if (objS instanceof String) {
                    return !((String) objS).isEmpty();
                }
                if (objS instanceof z7) {
                    return !z7.b.equals(objS);
                }
                throw new IllegalArgumentException();
            case 9:
                return nb.s(t, j3) != null;
            case 10:
                return !z7.b.equals(nb.s(t, j3));
            case 11:
                return nb.i(t, j3) != 0;
            case 12:
                return nb.i(t, j3) != 0;
            case 13:
                return nb.i(t, j3) != 0;
            case 14:
                return nb.k(t, j3) != 0;
            case 15:
                return nb.i(t, j3) != 0;
            case 16:
                return nb.k(t, j3) != 0;
            case 17:
                return nb.s(t, j3) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void t(T t, int i2) {
        int iJ = j(i2);
        long j2 = 1048575 & iJ;
        if (j2 == 1048575) {
            return;
        }
        nb.j(t, j2, (1 << (iJ >>> 20)) | nb.i(t, j2));
    }

    private final boolean u(T t, int i2, int i3) {
        return nb.i(t, (long) (j(i3) & 1048575)) == i2;
    }

    private final void v(T t, int i2, int i3) {
        nb.j(t, j(i3) & 1048575, i2);
    }

    private final int w(int i2) {
        if (i2 < this.c || i2 > this.d) {
            return -1;
        }
        return y(i2, 0);
    }

    private final int x(int i2, int i3) {
        if (i2 < this.c || i2 > this.d) {
            return -1;
        }
        return y(i2, i3);
    }

    private final int y(int i2, int i3) {
        int length = (this.a.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = this.a[i5];
            if (i2 == i6) {
                return i5;
            }
            if (i2 < i6) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    private final void z(T t, h8 h8Var) {
        int i2;
        if (this.f) {
            this.f1058m.b(t);
            throw null;
        }
        int length = this.a.length;
        Unsafe unsafe = p;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i4 < length) {
            int i7 = i(i4);
            int i8 = this.a[i4];
            int iK = k(i7);
            if (iK <= 17) {
                int i9 = this.a[i4 + 2];
                int i10 = i9 & i3;
                if (i10 != i6) {
                    i5 = unsafe.getInt(t, i10);
                    i6 = i10;
                }
                i2 = 1 << (i9 >>> 20);
            } else {
                i2 = 0;
            }
            long j2 = i7 & i3;
            switch (iK) {
                case 0:
                    if ((i5 & i2) != 0) {
                        h8Var.q(i8, nb.q(t, j2));
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 1:
                    if ((i5 & i2) != 0) {
                        h8Var.p(i8, nb.o(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 2:
                    if ((i5 & i2) != 0) {
                        h8Var.n(i8, unsafe.getLong(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 3:
                    if ((i5 & i2) != 0) {
                        h8Var.s(i8, unsafe.getLong(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 4:
                    if ((i5 & i2) != 0) {
                        h8Var.t(i8, unsafe.getInt(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 5:
                    if ((i5 & i2) != 0) {
                        h8Var.u(i8, unsafe.getLong(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 6:
                    if ((i5 & i2) != 0) {
                        h8Var.v(i8, unsafe.getInt(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 7:
                    if ((i5 & i2) != 0) {
                        h8Var.w(i8, nb.m(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 8:
                    if ((i5 & i2) != 0) {
                        B(i8, unsafe.getObject(t, j2), h8Var);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 9:
                    if ((i5 & i2) != 0) {
                        h8Var.C(i8, unsafe.getObject(t, j2), O(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 10:
                    if ((i5 & i2) != 0) {
                        h8Var.y(i8, (z7) unsafe.getObject(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 11:
                    if ((i5 & i2) != 0) {
                        h8Var.z(i8, unsafe.getInt(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 12:
                    if ((i5 & i2) != 0) {
                        h8Var.r(i8, unsafe.getInt(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 13:
                    if ((i5 & i2) != 0) {
                        h8Var.m(i8, unsafe.getInt(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 14:
                    if ((i5 & i2) != 0) {
                        h8Var.o(i8, unsafe.getLong(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 15:
                    if ((i5 & i2) != 0) {
                        h8Var.A(i8, unsafe.getInt(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 16:
                    if ((i5 & i2) != 0) {
                        h8Var.B(i8, unsafe.getLong(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 17:
                    if ((i5 & i2) != 0) {
                        h8Var.D(i8, unsafe.getObject(t, j2), O(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 18:
                    qa.j(this.a[i4], (List) unsafe.getObject(t, j2), h8Var, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 19:
                    qa.k(this.a[i4], (List) unsafe.getObject(t, j2), h8Var, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 20:
                    qa.l(this.a[i4], (List) unsafe.getObject(t, j2), h8Var, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 21:
                    qa.m(this.a[i4], (List) unsafe.getObject(t, j2), h8Var, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 22:
                    qa.q(this.a[i4], (List) unsafe.getObject(t, j2), h8Var, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 23:
                    qa.o(this.a[i4], (List) unsafe.getObject(t, j2), h8Var, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 24:
                    qa.t(this.a[i4], (List) unsafe.getObject(t, j2), h8Var, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 25:
                    qa.w(this.a[i4], (List) unsafe.getObject(t, j2), h8Var, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 26:
                    qa.x(this.a[i4], (List) unsafe.getObject(t, j2), h8Var);
                    break;
                case 27:
                    qa.z(this.a[i4], (List) unsafe.getObject(t, j2), h8Var, O(i4));
                    break;
                case 28:
                    qa.y(this.a[i4], (List) unsafe.getObject(t, j2), h8Var);
                    break;
                case 29:
                    qa.r(this.a[i4], (List) unsafe.getObject(t, j2), h8Var, false);
                    break;
                case 30:
                    qa.v(this.a[i4], (List) unsafe.getObject(t, j2), h8Var, false);
                    break;
                case 31:
                    qa.u(this.a[i4], (List) unsafe.getObject(t, j2), h8Var, false);
                    break;
                case 32:
                    qa.p(this.a[i4], (List) unsafe.getObject(t, j2), h8Var, false);
                    break;
                case 33:
                    qa.s(this.a[i4], (List) unsafe.getObject(t, j2), h8Var, false);
                    break;
                case 34:
                    qa.n(this.a[i4], (List) unsafe.getObject(t, j2), h8Var, false);
                    break;
                case 35:
                    qa.j(this.a[i4], (List) unsafe.getObject(t, j2), h8Var, true);
                    break;
                case 36:
                    qa.k(this.a[i4], (List) unsafe.getObject(t, j2), h8Var, true);
                    break;
                case 37:
                    qa.l(this.a[i4], (List) unsafe.getObject(t, j2), h8Var, true);
                    break;
                case 38:
                    qa.m(this.a[i4], (List) unsafe.getObject(t, j2), h8Var, true);
                    break;
                case 39:
                    qa.q(this.a[i4], (List) unsafe.getObject(t, j2), h8Var, true);
                    break;
                case 40:
                    qa.o(this.a[i4], (List) unsafe.getObject(t, j2), h8Var, true);
                    break;
                case 41:
                    qa.t(this.a[i4], (List) unsafe.getObject(t, j2), h8Var, true);
                    break;
                case 42:
                    qa.w(this.a[i4], (List) unsafe.getObject(t, j2), h8Var, true);
                    break;
                case 43:
                    qa.r(this.a[i4], (List) unsafe.getObject(t, j2), h8Var, true);
                    break;
                case 44:
                    qa.v(this.a[i4], (List) unsafe.getObject(t, j2), h8Var, true);
                    break;
                case 45:
                    qa.u(this.a[i4], (List) unsafe.getObject(t, j2), h8Var, true);
                    break;
                case 46:
                    qa.p(this.a[i4], (List) unsafe.getObject(t, j2), h8Var, true);
                    break;
                case 47:
                    qa.s(this.a[i4], (List) unsafe.getObject(t, j2), h8Var, true);
                    break;
                case 48:
                    qa.n(this.a[i4], (List) unsafe.getObject(t, j2), h8Var, true);
                    break;
                case 49:
                    qa.B(this.a[i4], (List) unsafe.getObject(t, j2), h8Var, O(i4));
                    break;
                case 50:
                    A(h8Var, i8, unsafe.getObject(t, j2), i4);
                    break;
                case 51:
                    if (u(t, i8, i4)) {
                        h8Var.q(i8, l(t, j2));
                    }
                    break;
                case 52:
                    if (u(t, i8, i4)) {
                        h8Var.p(i8, m(t, j2));
                    }
                    break;
                case 53:
                    if (u(t, i8, i4)) {
                        h8Var.n(i8, o(t, j2));
                    }
                    break;
                case 54:
                    if (u(t, i8, i4)) {
                        h8Var.s(i8, o(t, j2));
                    }
                    break;
                case 55:
                    if (u(t, i8, i4)) {
                        h8Var.t(i8, n(t, j2));
                    }
                    break;
                case 56:
                    if (u(t, i8, i4)) {
                        h8Var.u(i8, o(t, j2));
                    }
                    break;
                case 57:
                    if (u(t, i8, i4)) {
                        h8Var.v(i8, n(t, j2));
                    }
                    break;
                case 58:
                    if (u(t, i8, i4)) {
                        h8Var.w(i8, p(t, j2));
                    }
                    break;
                case 59:
                    if (u(t, i8, i4)) {
                        B(i8, unsafe.getObject(t, j2), h8Var);
                    }
                    break;
                case 60:
                    if (u(t, i8, i4)) {
                        h8Var.C(i8, unsafe.getObject(t, j2), O(i4));
                    }
                    break;
                case 61:
                    if (u(t, i8, i4)) {
                        h8Var.y(i8, (z7) unsafe.getObject(t, j2));
                    }
                    break;
                case 62:
                    if (u(t, i8, i4)) {
                        h8Var.z(i8, n(t, j2));
                    }
                    break;
                case 63:
                    if (u(t, i8, i4)) {
                        h8Var.r(i8, n(t, j2));
                    }
                    break;
                case 64:
                    if (u(t, i8, i4)) {
                        h8Var.m(i8, n(t, j2));
                    }
                    break;
                case 65:
                    if (u(t, i8, i4)) {
                        h8Var.o(i8, o(t, j2));
                    }
                    break;
                case 66:
                    if (u(t, i8, i4)) {
                        h8Var.A(i8, n(t, j2));
                    }
                    break;
                case 67:
                    if (u(t, i8, i4)) {
                        h8Var.B(i8, o(t, j2));
                    }
                    break;
                case 68:
                    if (u(t, i8, i4)) {
                        h8Var.D(i8, unsafe.getObject(t, j2), O(i4));
                    }
                    break;
            }
            i4 += 3;
            i3 = 1048575;
        }
        db<?, ?> dbVar = this.f1057l;
        dbVar.i(dbVar.d(t), h8Var);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 11041. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    final int D(T r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.measurement.o7 r34) throws com.google.android.gms.internal.measurement.i9 {
        /*
            Method dump skipped, instruction units count: 1104
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.ga.D(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.o7):int");
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00af  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c5 A[LOOP:1: B:45:0x00b4->B:50:0x00c5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.oa
    public final boolean a(T t) {
        int i2;
        int i3;
        List list;
        oa oaVarO;
        int i4;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i7 < this.f1054i) {
            int i8 = this.f1053h[i7];
            int i9 = this.a[i8];
            int i10 = i(i8);
            int i11 = this.a[i8 + 2];
            int i12 = i11 & 1048575;
            int i13 = 1 << (i11 >>> 20);
            if (i12 != i5) {
                if (i12 != 1048575) {
                    i6 = p.getInt(t, i12);
                }
                i3 = i6;
                i2 = i12;
            } else {
                i2 = i5;
                i3 = i6;
            }
            if ((268435456 & i10) != 0 && !r(t, i8, i2, i3, i13)) {
                return false;
            }
            int iK = k(i10);
            if (iK == 9 || iK == 17) {
                if (r(t, i8, i2, i3, i13) && !S(t, i10, O(i8))) {
                    return false;
                }
            } else if (iK == 27) {
                list = (List) nb.s(t, i10 & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    oaVarO = O(i8);
                    for (i4 = 0; i4 < list.size(); i4++) {
                        if (!oaVarO.a(list.get(i4))) {
                            return false;
                        }
                    }
                }
            } else if (iK == 60 || iK == 68) {
                if (u(t, i9, i8) && !S(t, i10, O(i8))) {
                    return false;
                }
            } else if (iK == 49) {
                list = (List) nb.s(t, i10 & 1048575);
                if (list.isEmpty()) {
                    oaVarO = O(i8);
                    while (i4 < list.size()) {
                        if (!oaVarO.a(list.get(i4))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iK == 50 && !((x9) nb.s(t, i10 & 1048575)).isEmpty()) {
                throw null;
            }
            i7++;
            i5 = i2;
            i6 = i3;
        }
        if (!this.f) {
            return true;
        }
        this.f1058m.b(t);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.oa
    public final int b(T t) {
        return this.f1052g ? K(t) : J(t);
    }

    @Override // com.google.android.gms.internal.measurement.oa
    public final void c(T t) {
        int i2;
        int i3 = this.f1054i;
        while (true) {
            i2 = this.f1055j;
            if (i3 >= i2) {
                break;
            }
            long jI = i(this.f1053h[i3]) & 1048575;
            Object objS = nb.s(t, jI);
            if (objS != null) {
                ((x9) objS).g();
                nb.t(t, jI, objS);
            }
            i3++;
        }
        int length = this.f1053h.length;
        while (i2 < length) {
            this.f1056k.a(t, this.f1053h[i2]);
            i2++;
        }
        this.f1057l.e(t);
        if (this.f) {
            this.f1058m.c(t);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0341  */
    /* JADX WARN: Code duplicated, block: B:127:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:130:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:133:0x03e4  */
    @Override // com.google.android.gms.internal.measurement.oa
    public final void d(T t, h8 h8Var) {
        double dQ;
        float fO;
        long jK;
        long jK2;
        int i2;
        long jK3;
        int i3;
        boolean zM;
        int i4;
        int i5;
        int i6;
        long jK4;
        int i7;
        long jK5;
        if (!this.f1052g) {
            z(t, h8Var);
            return;
        }
        if (this.f) {
            this.f1058m.b(t);
            throw null;
        }
        int length = this.a.length;
        for (int i8 = 0; i8 < length; i8 += 3) {
            int i9 = i(i8);
            int i10 = this.a[i8];
            switch (k(i9)) {
                case 0:
                    if (s(t, i8)) {
                        dQ = nb.q(t, i9 & 1048575);
                        h8Var.q(i10, dQ);
                    }
                    break;
                case 1:
                    if (s(t, i8)) {
                        fO = nb.o(t, i9 & 1048575);
                        h8Var.p(i10, fO);
                    }
                    break;
                case 2:
                    if (s(t, i8)) {
                        jK = nb.k(t, i9 & 1048575);
                        h8Var.n(i10, jK);
                    }
                    break;
                case 3:
                    if (s(t, i8)) {
                        jK2 = nb.k(t, i9 & 1048575);
                        h8Var.s(i10, jK2);
                    }
                    break;
                case 4:
                    if (s(t, i8)) {
                        i2 = nb.i(t, i9 & 1048575);
                        h8Var.t(i10, i2);
                    }
                    break;
                case 5:
                    if (s(t, i8)) {
                        jK3 = nb.k(t, i9 & 1048575);
                        h8Var.u(i10, jK3);
                    }
                    break;
                case 6:
                    if (s(t, i8)) {
                        i3 = nb.i(t, i9 & 1048575);
                        h8Var.v(i10, i3);
                    }
                    break;
                case 7:
                    if (s(t, i8)) {
                        zM = nb.m(t, i9 & 1048575);
                        h8Var.w(i10, zM);
                    }
                    break;
                case 8:
                    if (s(t, i8)) {
                        B(i10, nb.s(t, i9 & 1048575), h8Var);
                    }
                    break;
                case 9:
                    if (s(t, i8)) {
                        h8Var.C(i10, nb.s(t, i9 & 1048575), O(i8));
                    }
                    break;
                case 10:
                    if (s(t, i8)) {
                        h8Var.y(i10, (z7) nb.s(t, i9 & 1048575));
                    }
                    break;
                case 11:
                    if (s(t, i8)) {
                        i4 = nb.i(t, i9 & 1048575);
                        h8Var.z(i10, i4);
                    }
                    break;
                case 12:
                    if (s(t, i8)) {
                        i5 = nb.i(t, i9 & 1048575);
                        h8Var.r(i10, i5);
                    }
                    break;
                case 13:
                    if (s(t, i8)) {
                        i6 = nb.i(t, i9 & 1048575);
                        h8Var.m(i10, i6);
                    }
                    break;
                case 14:
                    if (s(t, i8)) {
                        jK4 = nb.k(t, i9 & 1048575);
                        h8Var.o(i10, jK4);
                    }
                    break;
                case 15:
                    if (s(t, i8)) {
                        i7 = nb.i(t, i9 & 1048575);
                        h8Var.A(i10, i7);
                    }
                    break;
                case 16:
                    if (s(t, i8)) {
                        jK5 = nb.k(t, i9 & 1048575);
                        h8Var.B(i10, jK5);
                    }
                    break;
                case 17:
                    if (s(t, i8)) {
                        h8Var.D(i10, nb.s(t, i9 & 1048575), O(i8));
                    }
                    break;
                case 18:
                    qa.j(this.a[i8], (List) nb.s(t, i9 & 1048575), h8Var, false);
                    break;
                case 19:
                    qa.k(this.a[i8], (List) nb.s(t, i9 & 1048575), h8Var, false);
                    break;
                case 20:
                    qa.l(this.a[i8], (List) nb.s(t, i9 & 1048575), h8Var, false);
                    break;
                case 21:
                    qa.m(this.a[i8], (List) nb.s(t, i9 & 1048575), h8Var, false);
                    break;
                case 22:
                    qa.q(this.a[i8], (List) nb.s(t, i9 & 1048575), h8Var, false);
                    break;
                case 23:
                    qa.o(this.a[i8], (List) nb.s(t, i9 & 1048575), h8Var, false);
                    break;
                case 24:
                    qa.t(this.a[i8], (List) nb.s(t, i9 & 1048575), h8Var, false);
                    break;
                case 25:
                    qa.w(this.a[i8], (List) nb.s(t, i9 & 1048575), h8Var, false);
                    break;
                case 26:
                    qa.x(this.a[i8], (List) nb.s(t, i9 & 1048575), h8Var);
                    break;
                case 27:
                    qa.z(this.a[i8], (List) nb.s(t, i9 & 1048575), h8Var, O(i8));
                    break;
                case 28:
                    qa.y(this.a[i8], (List) nb.s(t, i9 & 1048575), h8Var);
                    break;
                case 29:
                    qa.r(this.a[i8], (List) nb.s(t, i9 & 1048575), h8Var, false);
                    break;
                case 30:
                    qa.v(this.a[i8], (List) nb.s(t, i9 & 1048575), h8Var, false);
                    break;
                case 31:
                    qa.u(this.a[i8], (List) nb.s(t, i9 & 1048575), h8Var, false);
                    break;
                case 32:
                    qa.p(this.a[i8], (List) nb.s(t, i9 & 1048575), h8Var, false);
                    break;
                case 33:
                    qa.s(this.a[i8], (List) nb.s(t, i9 & 1048575), h8Var, false);
                    break;
                case 34:
                    qa.n(this.a[i8], (List) nb.s(t, i9 & 1048575), h8Var, false);
                    break;
                case 35:
                    qa.j(this.a[i8], (List) nb.s(t, i9 & 1048575), h8Var, true);
                    break;
                case 36:
                    qa.k(this.a[i8], (List) nb.s(t, i9 & 1048575), h8Var, true);
                    break;
                case 37:
                    qa.l(this.a[i8], (List) nb.s(t, i9 & 1048575), h8Var, true);
                    break;
                case 38:
                    qa.m(this.a[i8], (List) nb.s(t, i9 & 1048575), h8Var, true);
                    break;
                case 39:
                    qa.q(this.a[i8], (List) nb.s(t, i9 & 1048575), h8Var, true);
                    break;
                case 40:
                    qa.o(this.a[i8], (List) nb.s(t, i9 & 1048575), h8Var, true);
                    break;
                case 41:
                    qa.t(this.a[i8], (List) nb.s(t, i9 & 1048575), h8Var, true);
                    break;
                case 42:
                    qa.w(this.a[i8], (List) nb.s(t, i9 & 1048575), h8Var, true);
                    break;
                case 43:
                    qa.r(this.a[i8], (List) nb.s(t, i9 & 1048575), h8Var, true);
                    break;
                case 44:
                    qa.v(this.a[i8], (List) nb.s(t, i9 & 1048575), h8Var, true);
                    break;
                case 45:
                    qa.u(this.a[i8], (List) nb.s(t, i9 & 1048575), h8Var, true);
                    break;
                case 46:
                    qa.p(this.a[i8], (List) nb.s(t, i9 & 1048575), h8Var, true);
                    break;
                case 47:
                    qa.s(this.a[i8], (List) nb.s(t, i9 & 1048575), h8Var, true);
                    break;
                case 48:
                    qa.n(this.a[i8], (List) nb.s(t, i9 & 1048575), h8Var, true);
                    break;
                case 49:
                    qa.B(this.a[i8], (List) nb.s(t, i9 & 1048575), h8Var, O(i8));
                    break;
                case 50:
                    A(h8Var, i10, nb.s(t, i9 & 1048575), i8);
                    break;
                case 51:
                    if (u(t, i10, i8)) {
                        dQ = l(t, i9 & 1048575);
                        h8Var.q(i10, dQ);
                    }
                    break;
                case 52:
                    if (u(t, i10, i8)) {
                        fO = m(t, i9 & 1048575);
                        h8Var.p(i10, fO);
                    }
                    break;
                case 53:
                    if (u(t, i10, i8)) {
                        jK = o(t, i9 & 1048575);
                        h8Var.n(i10, jK);
                    }
                    break;
                case 54:
                    if (u(t, i10, i8)) {
                        jK2 = o(t, i9 & 1048575);
                        h8Var.s(i10, jK2);
                    }
                    break;
                case 55:
                    if (u(t, i10, i8)) {
                        i2 = n(t, i9 & 1048575);
                        h8Var.t(i10, i2);
                    }
                    break;
                case 56:
                    if (u(t, i10, i8)) {
                        jK3 = o(t, i9 & 1048575);
                        h8Var.u(i10, jK3);
                    }
                    break;
                case 57:
                    if (u(t, i10, i8)) {
                        i3 = n(t, i9 & 1048575);
                        h8Var.v(i10, i3);
                    }
                    break;
                case 58:
                    if (u(t, i10, i8)) {
                        zM = p(t, i9 & 1048575);
                        h8Var.w(i10, zM);
                    }
                    break;
                case 59:
                    if (u(t, i10, i8)) {
                        B(i10, nb.s(t, i9 & 1048575), h8Var);
                    }
                    break;
                case 60:
                    if (u(t, i10, i8)) {
                        h8Var.C(i10, nb.s(t, i9 & 1048575), O(i8));
                    }
                    break;
                case 61:
                    if (u(t, i10, i8)) {
                        h8Var.y(i10, (z7) nb.s(t, i9 & 1048575));
                    }
                    break;
                case 62:
                    if (u(t, i10, i8)) {
                        i4 = n(t, i9 & 1048575);
                        h8Var.z(i10, i4);
                    }
                    break;
                case 63:
                    if (u(t, i10, i8)) {
                        i5 = n(t, i9 & 1048575);
                        h8Var.r(i10, i5);
                    }
                    break;
                case 64:
                    if (u(t, i10, i8)) {
                        i6 = n(t, i9 & 1048575);
                        h8Var.m(i10, i6);
                    }
                    break;
                case 65:
                    if (u(t, i10, i8)) {
                        jK4 = o(t, i9 & 1048575);
                        h8Var.o(i10, jK4);
                    }
                    break;
                case 66:
                    if (u(t, i10, i8)) {
                        i7 = n(t, i9 & 1048575);
                        h8Var.A(i10, i7);
                    }
                    break;
                case 67:
                    if (u(t, i10, i8)) {
                        jK5 = o(t, i9 & 1048575);
                        h8Var.B(i10, jK5);
                    }
                    break;
                case 68:
                    if (u(t, i10, i8)) {
                        h8Var.D(i10, nb.s(t, i9 & 1048575), O(i8));
                    }
                    break;
            }
        }
        db<?, ?> dbVar = this.f1057l;
        dbVar.i(dbVar.d(t), h8Var);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:41:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c8  */
    @Override // com.google.android.gms.internal.measurement.oa
    public final void e(T t, T t2) {
        t2.getClass();
        for (int i2 = 0; i2 < this.a.length; i2 += 3) {
            int i3 = i(i2);
            long j2 = 1048575 & i3;
            int i4 = this.a[i2];
            switch (k(i3)) {
                case 0:
                    if (s(t2, i2)) {
                        nb.r(t, j2, nb.q(t2, j2));
                        t(t, i2);
                    }
                    break;
                case 1:
                    if (s(t2, i2)) {
                        nb.p(t, j2, nb.o(t2, j2));
                        t(t, i2);
                    }
                    break;
                case 2:
                    if (s(t2, i2)) {
                        nb.l(t, j2, nb.k(t2, j2));
                        t(t, i2);
                    }
                    break;
                case 3:
                    if (s(t2, i2)) {
                        nb.l(t, j2, nb.k(t2, j2));
                        t(t, i2);
                    }
                    break;
                case 4:
                    if (s(t2, i2)) {
                        nb.j(t, j2, nb.i(t2, j2));
                        t(t, i2);
                    }
                    break;
                case 5:
                    if (s(t2, i2)) {
                        nb.l(t, j2, nb.k(t2, j2));
                        t(t, i2);
                    }
                    break;
                case 6:
                    if (s(t2, i2)) {
                        nb.j(t, j2, nb.i(t2, j2));
                        t(t, i2);
                    }
                    break;
                case 7:
                    if (s(t2, i2)) {
                        nb.n(t, j2, nb.m(t2, j2));
                        t(t, i2);
                    }
                    break;
                case 8:
                    if (s(t2, i2)) {
                        nb.t(t, j2, nb.s(t2, j2));
                        t(t, i2);
                    }
                    break;
                case 9:
                case 17:
                    H(t, t2, i2);
                    break;
                case 10:
                    if (s(t2, i2)) {
                        nb.t(t, j2, nb.s(t2, j2));
                        t(t, i2);
                    }
                    break;
                case 11:
                    if (s(t2, i2)) {
                        nb.j(t, j2, nb.i(t2, j2));
                        t(t, i2);
                    }
                    break;
                case 12:
                    if (s(t2, i2)) {
                        nb.j(t, j2, nb.i(t2, j2));
                        t(t, i2);
                    }
                    break;
                case 13:
                    if (s(t2, i2)) {
                        nb.j(t, j2, nb.i(t2, j2));
                        t(t, i2);
                    }
                    break;
                case 14:
                    if (s(t2, i2)) {
                        nb.l(t, j2, nb.k(t2, j2));
                        t(t, i2);
                    }
                    break;
                case 15:
                    if (s(t2, i2)) {
                        nb.j(t, j2, nb.i(t2, j2));
                        t(t, i2);
                    }
                    break;
                case 16:
                    if (s(t2, i2)) {
                        nb.l(t, j2, nb.k(t2, j2));
                        t(t, i2);
                    }
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f1056k.b(t, t2, j2);
                    break;
                case 50:
                    qa.i(this.f1059n, t, t2, j2);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (u(t2, i4, i2)) {
                        nb.t(t, j2, nb.s(t2, j2));
                        v(t, i4, i2);
                    }
                    break;
                case 60:
                case 68:
                    I(t, t2, i2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (u(t2, i4, i2)) {
                        nb.t(t, j2, nb.s(t2, j2));
                        v(t, i4, i2);
                    }
                    break;
            }
        }
        qa.f(this.f1057l, t, t2);
        if (this.f) {
            qa.e(this.f1058m, t, t2);
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.oa
    public final void f(T t, byte[] bArr, int i2, int i3, o7 o7Var) throws i9 {
        if (this.f1052g) {
            R(t, bArr, i2, i3, o7Var);
        } else {
            D(t, bArr, i2, i3, 0, o7Var);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00dc A[PHI: r3
  0x00dc: PHI (r3v13 java.lang.Object) = (r3v10 java.lang.Object), (r3v14 java.lang.Object) binds: [B:66:0x00da, B:62:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x00e4  */
    @Override // com.google.android.gms.internal.measurement.oa
    public final int g(T t) {
        int i2;
        double dQ;
        float fO;
        long jK;
        int i3;
        boolean zM;
        Object objS;
        int length = this.a.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5 += 3) {
            int i6 = i(i5);
            int i7 = this.a[i5];
            long j2 = 1048575 & i6;
            int iHashCode = 37;
            switch (k(i6)) {
                case 0:
                    i2 = i4 * 53;
                    dQ = nb.q(t, j2);
                    jK = Double.doubleToLongBits(dQ);
                    i3 = g9.e(jK);
                    i4 = i2 + i3;
                    break;
                case 1:
                    i2 = i4 * 53;
                    fO = nb.o(t, j2);
                    i3 = Float.floatToIntBits(fO);
                    i4 = i2 + i3;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i2 = i4 * 53;
                    jK = nb.k(t, j2);
                    i3 = g9.e(jK);
                    i4 = i2 + i3;
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    i2 = i4 * 53;
                    i3 = nb.i(t, j2);
                    i4 = i2 + i3;
                    break;
                case 7:
                    i2 = i4 * 53;
                    zM = nb.m(t, j2);
                    i3 = g9.f(zM);
                    i4 = i2 + i3;
                    break;
                case 8:
                    i2 = i4 * 53;
                    i3 = ((String) nb.s(t, j2)).hashCode();
                    i4 = i2 + i3;
                    break;
                case 9:
                    objS = nb.s(t, j2);
                    if (objS != null) {
                        iHashCode = objS.hashCode();
                    }
                    i4 = (i4 * 53) + iHashCode;
                    break;
                case 10:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    i2 = i4 * 53;
                    i3 = nb.s(t, j2).hashCode();
                    i4 = i2 + i3;
                    break;
                case 17:
                    objS = nb.s(t, j2);
                    if (objS != null) {
                        iHashCode = objS.hashCode();
                    }
                    i4 = (i4 * 53) + iHashCode;
                    break;
                case 51:
                    if (u(t, i7, i5)) {
                        i2 = i4 * 53;
                        dQ = l(t, j2);
                        jK = Double.doubleToLongBits(dQ);
                        i3 = g9.e(jK);
                        i4 = i2 + i3;
                    }
                    break;
                case 52:
                    if (u(t, i7, i5)) {
                        i2 = i4 * 53;
                        fO = m(t, j2);
                        i3 = Float.floatToIntBits(fO);
                        i4 = i2 + i3;
                    }
                    break;
                case 53:
                    if (u(t, i7, i5)) {
                        i2 = i4 * 53;
                        jK = o(t, j2);
                        i3 = g9.e(jK);
                        i4 = i2 + i3;
                    }
                    break;
                case 54:
                    if (u(t, i7, i5)) {
                        i2 = i4 * 53;
                        jK = o(t, j2);
                        i3 = g9.e(jK);
                        i4 = i2 + i3;
                    }
                    break;
                case 55:
                    if (u(t, i7, i5)) {
                        i2 = i4 * 53;
                        i3 = n(t, j2);
                        i4 = i2 + i3;
                    }
                    break;
                case 56:
                    if (u(t, i7, i5)) {
                        i2 = i4 * 53;
                        jK = o(t, j2);
                        i3 = g9.e(jK);
                        i4 = i2 + i3;
                    }
                    break;
                case 57:
                    if (u(t, i7, i5)) {
                        i2 = i4 * 53;
                        i3 = n(t, j2);
                        i4 = i2 + i3;
                    }
                    break;
                case 58:
                    if (u(t, i7, i5)) {
                        i2 = i4 * 53;
                        zM = p(t, j2);
                        i3 = g9.f(zM);
                        i4 = i2 + i3;
                    }
                    break;
                case 59:
                    if (u(t, i7, i5)) {
                        i2 = i4 * 53;
                        i3 = ((String) nb.s(t, j2)).hashCode();
                        i4 = i2 + i3;
                    }
                    break;
                case 60:
                    if (u(t, i7, i5)) {
                        i2 = i4 * 53;
                        i3 = nb.s(t, j2).hashCode();
                        i4 = i2 + i3;
                    }
                    break;
                case 61:
                    if (u(t, i7, i5)) {
                        i2 = i4 * 53;
                        i3 = nb.s(t, j2).hashCode();
                        i4 = i2 + i3;
                    }
                    break;
                case 62:
                    if (u(t, i7, i5)) {
                        i2 = i4 * 53;
                        i3 = n(t, j2);
                        i4 = i2 + i3;
                    }
                    break;
                case 63:
                    if (u(t, i7, i5)) {
                        i2 = i4 * 53;
                        i3 = n(t, j2);
                        i4 = i2 + i3;
                    }
                    break;
                case 64:
                    if (u(t, i7, i5)) {
                        i2 = i4 * 53;
                        i3 = n(t, j2);
                        i4 = i2 + i3;
                    }
                    break;
                case 65:
                    if (u(t, i7, i5)) {
                        i2 = i4 * 53;
                        jK = o(t, j2);
                        i3 = g9.e(jK);
                        i4 = i2 + i3;
                    }
                    break;
                case 66:
                    if (u(t, i7, i5)) {
                        i2 = i4 * 53;
                        i3 = n(t, j2);
                        i4 = i2 + i3;
                    }
                    break;
                case 67:
                    if (u(t, i7, i5)) {
                        i2 = i4 * 53;
                        jK = o(t, j2);
                        i3 = g9.e(jK);
                        i4 = i2 + i3;
                    }
                    break;
                case 68:
                    if (u(t, i7, i5)) {
                        i2 = i4 * 53;
                        i3 = nb.s(t, j2).hashCode();
                        i4 = i2 + i3;
                    }
                    break;
            }
        }
        int iHashCode2 = (i4 * 53) + this.f1057l.d(t).hashCode();
        if (!this.f) {
            return iHashCode2;
        }
        this.f1058m.b(t);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.oa
    public final boolean h(T t, T t2) {
        int length = this.a.length;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int i3 = i(i2);
            long j2 = i3 & 1048575;
            switch (k(i3)) {
                case 0:
                    if (!q(t, t2, i2) || Double.doubleToLongBits(nb.q(t, j2)) != Double.doubleToLongBits(nb.q(t2, j2))) {
                        return false;
                    }
                    break;
                    break;
                case 1:
                    if (!q(t, t2, i2) || Float.floatToIntBits(nb.o(t, j2)) != Float.floatToIntBits(nb.o(t2, j2))) {
                        return false;
                    }
                    break;
                    break;
                case 2:
                    if (!q(t, t2, i2) || nb.k(t, j2) != nb.k(t2, j2)) {
                        return false;
                    }
                    break;
                    break;
                case 3:
                    if (!q(t, t2, i2) || nb.k(t, j2) != nb.k(t2, j2)) {
                        return false;
                    }
                    break;
                    break;
                case 4:
                    if (!q(t, t2, i2) || nb.i(t, j2) != nb.i(t2, j2)) {
                        return false;
                    }
                    break;
                    break;
                case 5:
                    if (!q(t, t2, i2) || nb.k(t, j2) != nb.k(t2, j2)) {
                        return false;
                    }
                    break;
                    break;
                case 6:
                    if (!q(t, t2, i2) || nb.i(t, j2) != nb.i(t2, j2)) {
                        return false;
                    }
                    break;
                    break;
                case 7:
                    if (!q(t, t2, i2) || nb.m(t, j2) != nb.m(t2, j2)) {
                        return false;
                    }
                    break;
                    break;
                case 8:
                    if (!q(t, t2, i2) || !qa.d(nb.s(t, j2), nb.s(t2, j2))) {
                        return false;
                    }
                    break;
                    break;
                case 9:
                    if (!q(t, t2, i2) || !qa.d(nb.s(t, j2), nb.s(t2, j2))) {
                        return false;
                    }
                    break;
                    break;
                case 10:
                    if (!q(t, t2, i2) || !qa.d(nb.s(t, j2), nb.s(t2, j2))) {
                        return false;
                    }
                    break;
                    break;
                case 11:
                    if (!q(t, t2, i2) || nb.i(t, j2) != nb.i(t2, j2)) {
                        return false;
                    }
                    break;
                    break;
                case 12:
                    if (!q(t, t2, i2) || nb.i(t, j2) != nb.i(t2, j2)) {
                        return false;
                    }
                    break;
                    break;
                case 13:
                    if (!q(t, t2, i2) || nb.i(t, j2) != nb.i(t2, j2)) {
                        return false;
                    }
                    break;
                    break;
                case 14:
                    if (!q(t, t2, i2) || nb.k(t, j2) != nb.k(t2, j2)) {
                        return false;
                    }
                    break;
                    break;
                case 15:
                    if (!q(t, t2, i2) || nb.i(t, j2) != nb.i(t2, j2)) {
                        return false;
                    }
                    break;
                    break;
                case 16:
                    if (!q(t, t2, i2) || nb.k(t, j2) != nb.k(t2, j2)) {
                        return false;
                    }
                    break;
                    break;
                case 17:
                    if (!q(t, t2, i2) || !qa.d(nb.s(t, j2), nb.s(t2, j2))) {
                        return false;
                    }
                    break;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    if (!qa.d(nb.s(t, j2), nb.s(t2, j2))) {
                        return false;
                    }
                    break;
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long j3 = j(i2) & 1048575;
                    if (nb.i(t, j3) != nb.i(t2, j3) || !qa.d(nb.s(t, j2), nb.s(t2, j2))) {
                        return false;
                    }
                    break;
                    break;
            }
        }
        if (!this.f1057l.d(t).equals(this.f1057l.d(t2))) {
            return false;
        }
        if (!this.f) {
            return true;
        }
        this.f1058m.b(t);
        this.f1058m.b(t2);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.oa
    public final T zza() {
        return (T) ((z8) this.e).w(4, null, null);
    }
}
