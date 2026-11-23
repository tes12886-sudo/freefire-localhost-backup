package j.d.a.c.f.h;

import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes.dex */
final class g extends e0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final e0 f1981g = new g(null, new Object[0], 0);

    @CheckForNull
    private final transient Object d;
    final transient Object[] e;
    private final transient int f;

    private g(@CheckForNull Object obj, Object[] objArr, int i2) {
        this.d = obj;
        this.e = objArr;
        this.f = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v4 */
    static g f(int i2, Object[] objArr, d0 d0Var) {
        short[] sArr;
        ?? r6;
        ?? r2;
        int i3 = i2;
        Object[] objArrCopyOf = objArr;
        if (i3 == 0) {
            return (g) f1981g;
        }
        c0 c0Var = null;
        ?? r3 = 0;
        c0 c0Var2 = null;
        c0 c0Var3 = null;
        if (i3 == 1) {
            Object obj = objArrCopyOf[0];
            obj.getClass();
            Object obj2 = objArrCopyOf[1];
            obj2.getClass();
            w.a(obj, obj2);
            return new g(null, objArrCopyOf, 1);
        }
        t.b(i3, objArrCopyOf.length >> 1, "index");
        char c = 2;
        int iMax = Math.max(i3, 2);
        int i4 = 1073741824;
        if (iMax < 751619276) {
            int iHighestOneBit = Integer.highestOneBit(iMax - 1);
            i4 = iHighestOneBit + iHighestOneBit;
            while (true) {
                double d = i4;
                Double.isNaN(d);
                if (d * 0.7d >= iMax) {
                    break;
                }
                i4 += i4;
            }
        } else if (iMax >= 1073741824) {
            throw new IllegalArgumentException("collection too large");
        }
        if (i3 == 1) {
            Object obj3 = objArrCopyOf[0];
            obj3.getClass();
            Object obj4 = objArrCopyOf[1];
            obj4.getClass();
            w.a(obj3, obj4);
        } else {
            int i5 = i4 - 1;
            byte b = -1;
            if (i4 <= 128) {
                byte[] bArr = new byte[i4];
                Arrays.fill(bArr, (byte) -1);
                int i6 = 0;
                for (int i7 = 0; i7 < i3; i7++) {
                    int i8 = i7 + i7;
                    int i9 = i6 + i6;
                    Object obj5 = objArrCopyOf[i8];
                    obj5.getClass();
                    Object obj6 = objArrCopyOf[i8 ^ 1];
                    obj6.getClass();
                    w.a(obj5, obj6);
                    int iA = x.a(obj5.hashCode());
                    while (true) {
                        int i10 = iA & i5;
                        int i11 = bArr[i10] & 255;
                        if (i11 == 255) {
                            bArr[i10] = (byte) i9;
                            if (i6 < i7) {
                                objArrCopyOf[i9] = obj5;
                                objArrCopyOf[i9 ^ 1] = obj6;
                            }
                            i6++;
                            break;
                        }
                        if (obj5.equals(objArrCopyOf[i11 == true ? 1 : 0])) {
                            int i12 = ~i11;
                            Object obj7 = objArrCopyOf[i12 == true ? 1 : 0];
                            obj7.getClass();
                            c0 c0Var4 = new c0(obj5, obj6, obj7);
                            objArrCopyOf[i12 == true ? 1 : 0] = obj6;
                            c0Var2 = c0Var4;
                            break;
                        }
                        iA = i10 + 1;
                    }
                }
                if (i6 == i3) {
                    r2 = bArr;
                } else {
                    sArr = new Object[]{bArr, Integer.valueOf(i6), c0Var2};
                }
                c = 2;
                r3 = r2;
            } else if (i4 <= 32768) {
                sArr = new short[i4];
                Arrays.fill(sArr, (short) -1);
                int i13 = 0;
                for (int i14 = 0; i14 < i3; i14++) {
                    int i15 = i14 + i14;
                    int i16 = i13 + i13;
                    Object obj8 = objArrCopyOf[i15];
                    obj8.getClass();
                    Object obj9 = objArrCopyOf[i15 ^ 1];
                    obj9.getClass();
                    w.a(obj8, obj9);
                    int iA2 = x.a(obj8.hashCode());
                    while (true) {
                        int i17 = iA2 & i5;
                        char c2 = (char) sArr[i17];
                        if (c2 == 65535) {
                            sArr[i17] = (short) i16;
                            if (i13 < i14) {
                                objArrCopyOf[i16] = obj8;
                                objArrCopyOf[i16 ^ 1] = obj9;
                            }
                            i13++;
                            break;
                        }
                        if (obj8.equals(objArrCopyOf[c2])) {
                            int i18 = c2 ^ 1;
                            Object obj10 = objArrCopyOf[i18 == true ? 1 : 0];
                            obj10.getClass();
                            c0 c0Var5 = new c0(obj8, obj9, obj10);
                            objArrCopyOf[i18 == true ? 1 : 0] = obj9;
                            c0Var3 = c0Var5;
                            break;
                        }
                        iA2 = i17 + 1;
                    }
                }
                if (i13 != i3) {
                    c = 2;
                    r6 = new Object[]{sArr, Integer.valueOf(i13), c0Var3};
                    r3 = r6;
                }
            } else {
                sArr = new int[i4];
                Arrays.fill((int[]) sArr, -1);
                int i19 = 0;
                int i20 = 0;
                while (i19 < i3) {
                    int i21 = i19 + i19;
                    int i22 = i20 + i20;
                    Object obj11 = objArrCopyOf[i21];
                    obj11.getClass();
                    Object obj12 = objArrCopyOf[i21 ^ 1];
                    obj12.getClass();
                    w.a(obj11, obj12);
                    int iA3 = x.a(obj11.hashCode());
                    while (true) {
                        int i23 = iA3 & i5;
                        ?? r15 = sArr[i23];
                        if (r15 == b) {
                            sArr[i23] = i22;
                            if (i20 < i19) {
                                objArrCopyOf[i22] = obj11;
                                objArrCopyOf[i22 ^ 1] = obj12;
                            }
                            i20++;
                            break;
                        }
                        if (obj11.equals(objArrCopyOf[r15])) {
                            int i24 = r15 ^ 1;
                            Object obj13 = objArrCopyOf[i24 == true ? 1 : 0];
                            obj13.getClass();
                            c0 c0Var6 = new c0(obj11, obj12, obj13);
                            objArrCopyOf[i24 == true ? 1 : 0] = obj12;
                            c0Var = c0Var6;
                            break;
                        }
                        iA3 = i23 + 1;
                        b = -1;
                    }
                    i19++;
                    b = -1;
                }
                if (i20 != i3) {
                    c = 2;
                    r6 = new Object[]{sArr, Integer.valueOf(i20), c0Var};
                    r3 = r6;
                }
            }
            r2 = sArr;
            c = 2;
            r3 = r2;
        }
        boolean z = r3 instanceof Object[];
        ?? r4 = r3;
        if (z) {
            Object[] objArr2 = (Object[]) r3;
            d0Var.c = (c0) objArr2[c];
            Object obj14 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
            r4 = obj14;
            i3 = iIntValue;
        }
        return new g(r4, objArrCopyOf, i3);
    }

    @Override // j.d.a.c.f.h.e0
    final y a() {
        return new f(this.e, 1, this.f);
    }

    @Override // j.d.a.c.f.h.e0
    final f0 c() {
        return new d(this, this.e, 0, this.f);
    }

    @Override // j.d.a.c.f.h.e0
    final f0 d() {
        return new e(this, new f(this.e, 0, this.f));
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0009 A[EDGE_INSN: B:43:0x0009->B:4:0x0009 BREAK  A[LOOP:0: B:15:0x0038->B:21:0x004e], EDGE_INSN: B:45:0x0009->B:4:0x0009 BREAK  A[LOOP:1: B:25:0x0063->B:31:0x007a], EDGE_INSN: B:47:0x0009->B:4:0x0009 BREAK  A[LOOP:2: B:33:0x0089->B:42:0x00a0]] */
    @Override // j.d.a.c.f.h.e0, java.util.Map
    @CheckForNull
    public final Object get(@CheckForNull Object obj) {
        Object obj2;
        Object obj3 = this.d;
        Object[] objArr = this.e;
        int i2 = this.f;
        if (obj == null) {
            obj2 = null;
        } else if (i2 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            if (obj4.equals(obj)) {
                obj2 = objArr[1];
                obj2.getClass();
            } else {
                obj2 = null;
            }
        } else if (obj3 == null) {
            obj2 = null;
        } else if (obj3 instanceof byte[]) {
            byte[] bArr = (byte[]) obj3;
            int length = bArr.length - 1;
            int iA = x.a(obj.hashCode());
            while (true) {
                int i3 = iA & length;
                int i4 = bArr[i3] & 255;
                if (i4 == 255) {
                    break;
                }
                if (obj.equals(objArr[i4])) {
                    obj2 = objArr[i4 ^ 1];
                } else {
                    iA = i3 + 1;
                }
            }
            obj2 = null;
        } else if (obj3 instanceof short[]) {
            short[] sArr = (short[]) obj3;
            int length2 = sArr.length - 1;
            int iA2 = x.a(obj.hashCode());
            while (true) {
                int i5 = iA2 & length2;
                char c = (char) sArr[i5];
                if (c == 65535) {
                    break;
                }
                if (obj.equals(objArr[c])) {
                    obj2 = objArr[c ^ 1];
                } else {
                    iA2 = i5 + 1;
                }
            }
            obj2 = null;
        } else {
            int[] iArr = (int[]) obj3;
            int length3 = iArr.length - 1;
            int iA3 = x.a(obj.hashCode());
            while (true) {
                int i6 = iA3 & length3;
                int i7 = iArr[i6];
                if (i7 == -1) {
                    break;
                }
                if (obj.equals(objArr[i7])) {
                    obj2 = objArr[i7 ^ 1];
                } else {
                    iA3 = i6 + 1;
                }
            }
            obj2 = null;
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f;
    }
}
