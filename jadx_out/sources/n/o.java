package n;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class o extends l.t.b<e> implements RandomAccess {
    public static final a d = new a(null);
    private final e[] b;
    private final int[] c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }

        private final void a(long j2, b bVar, int i2, List<? extends e> list, int i3, int i4, List<Integer> list2) {
            int i5;
            int i6;
            int i7;
            int i8;
            int i9 = i2;
            if (!(i3 < i4)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (i3 < i4) {
                int i10 = i3;
                while (true) {
                    int i11 = i10 + 1;
                    if (!(list.get(i10).t() >= i9)) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    if (i11 >= i4) {
                        break;
                    } else {
                        i10 = i11;
                    }
                }
            }
            e eVar = list.get(i3);
            e eVar2 = list.get(i4 - 1);
            if (i9 == eVar.t()) {
                int iIntValue = list2.get(i3).intValue();
                int i12 = i3 + 1;
                e eVar3 = list.get(i12);
                i5 = i12;
                i6 = iIntValue;
                eVar = eVar3;
            } else {
                i5 = i3;
                i6 = -1;
            }
            if (eVar.e(i9) == eVar2.e(i9)) {
                int iMin = Math.min(eVar.t(), eVar2.t());
                if (i9 < iMin) {
                    int i13 = i9;
                    i7 = 0;
                    while (true) {
                        int i14 = i13 + 1;
                        if (eVar.e(i13) != eVar2.e(i13)) {
                            break;
                        }
                        i7++;
                        if (i14 >= iMin) {
                            break;
                        } else {
                            i13 = i14;
                        }
                    }
                } else {
                    i7 = 0;
                }
                long jC = j2 + c(bVar) + ((long) 2) + ((long) i7) + 1;
                bVar.C0(-i7);
                bVar.C0(i6);
                int i15 = i9 + i7;
                if (i9 < i15) {
                    while (true) {
                        int i16 = i9 + 1;
                        bVar.C0(eVar.e(i9) & 255);
                        if (i16 >= i15) {
                            break;
                        } else {
                            i9 = i16;
                        }
                    }
                }
                if (i5 + 1 == i4) {
                    if (!(i15 == list.get(i5).t())) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    bVar.C0(list2.get(i5).intValue());
                    return;
                } else {
                    b bVar2 = new b();
                    bVar.C0(((int) (c(bVar2) + jC)) * (-1));
                    a(jC, bVar2, i15, list, i5, i4, list2);
                    bVar.y0(bVar2);
                    return;
                }
            }
            int i17 = i5 + 1;
            int i18 = 1;
            if (i17 < i4) {
                while (true) {
                    int i19 = i17 + 1;
                    if (list.get(i17 - 1).e(i9) != list.get(i17).e(i9)) {
                        i18++;
                    }
                    if (i19 >= i4) {
                        break;
                    } else {
                        i17 = i19;
                    }
                }
            }
            long jC2 = j2 + c(bVar) + ((long) 2) + ((long) (i18 * 2));
            bVar.C0(i18);
            bVar.C0(i6);
            if (i5 < i4) {
                int i20 = i5;
                while (true) {
                    int i21 = i20 + 1;
                    byte bE = list.get(i20).e(i9);
                    if (i20 == i5 || bE != list.get(i20 - 1).e(i9)) {
                        bVar.C0(bE & 255);
                    }
                    if (i21 >= i4) {
                        break;
                    } else {
                        i20 = i21;
                    }
                }
            }
            b bVar3 = new b();
            while (i5 < i4) {
                byte bE2 = list.get(i5).e(i9);
                int i22 = i5 + 1;
                if (i22 >= i4) {
                    i8 = i4;
                    break;
                }
                int i23 = i22;
                while (true) {
                    int i24 = i23 + 1;
                    if (bE2 != list.get(i23).e(i9)) {
                        i8 = i23;
                        break;
                    } else {
                        if (i24 >= i4) {
                            i8 = i4;
                            break;
                        }
                        i23 = i24;
                    }
                }
                if (i22 == i8 && i9 + 1 == list.get(i5).t()) {
                    bVar.C0(list2.get(i5).intValue());
                } else {
                    bVar.C0(((int) (jC2 + c(bVar3))) * (-1));
                    a(jC2, bVar3, i9 + 1, list, i5, i8, list2);
                }
                bVar3 = bVar3;
                i5 = i8;
            }
            bVar.y0(bVar3);
        }

        static /* synthetic */ void b(a aVar, long j2, b bVar, int i2, List list, int i3, int i4, List list2, int i5, Object obj) {
            aVar.a((i5 & 1) != 0 ? 0L : j2, bVar, (i5 & 4) != 0 ? 0 : i2, list, (i5 & 16) != 0 ? 0 : i3, (i5 & 32) != 0 ? list.size() : i4, list2);
        }

        private final long c(b bVar) {
            return bVar.r0() / ((long) 4);
        }

        public final o d(e... eVarArr) {
            l.y.c.i.e(eVarArr, "byteStrings");
            int i2 = 0;
            l.y.c.f fVar = null;
            if (eVarArr.length == 0) {
                return new o(new e[0], new int[]{0, -1}, fVar);
            }
            List listU = l.t.h.u(eVarArr);
            l.t.q.p(listU);
            ArrayList arrayList = new ArrayList(eVarArr.length);
            for (e eVar : eVarArr) {
                arrayList.add(-1);
            }
            Object[] array = arrayList.toArray(new Integer[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            Integer[] numArr = (Integer[]) array;
            List listK = l.t.m.k(Arrays.copyOf(numArr, numArr.length));
            int length = eVarArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i3 < length) {
                listK.set(l.t.m.f(listU, eVarArr[i3], 0, 0, 6, null), Integer.valueOf(i4));
                i3++;
                i4++;
            }
            if (!(((e) listU.get(0)).t() > 0)) {
                throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
            }
            int i5 = 0;
            while (i5 < listU.size()) {
                e eVar2 = (e) listU.get(i5);
                int i6 = i5 + 1;
                int i7 = i6;
                while (i7 < listU.size()) {
                    e eVar3 = (e) listU.get(i7);
                    if (!eVar3.u(eVar2)) {
                        break;
                    }
                    if (!(eVar3.t() != eVar2.t())) {
                        throw new IllegalArgumentException(l.y.c.i.k("duplicate option: ", eVar3).toString());
                    }
                    if (((Number) listK.get(i7)).intValue() > ((Number) listK.get(i5)).intValue()) {
                        listU.remove(i7);
                        listK.remove(i7);
                    } else {
                        i7++;
                    }
                }
                i5 = i6;
            }
            b bVar = new b();
            b(this, 0L, bVar, 0, listU, 0, 0, listK, 53, null);
            int[] iArr = new int[(int) c(bVar)];
            while (!bVar.z()) {
                iArr[i2] = bVar.readInt();
                i2++;
            }
            Object[] objArrCopyOf = Arrays.copyOf(eVarArr, eVarArr.length);
            l.y.c.i.d(objArrCopyOf, "java.util.Arrays.copyOf(this, size)");
            return new o((e[]) objArrCopyOf, iArr, fVar);
        }
    }

    private o(e[] eVarArr, int[] iArr) {
        this.b = eVarArr;
        this.c = iArr;
    }

    public /* synthetic */ o(e[] eVarArr, int[] iArr, l.y.c.f fVar) {
        this(eVarArr, iArr);
    }

    @Override // l.t.a
    public int b() {
        return this.b.length;
    }

    public /* bridge */ boolean c(e eVar) {
        return super.contains(eVar);
    }

    @Override // l.t.a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof e) {
            return c((e) obj);
        }
        return false;
    }

    @Override // l.t.b, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public e get(int i2) {
        return this.b[i2];
    }

    public final e[] f() {
        return this.b;
    }

    public final int[] h() {
        return this.c;
    }

    @Override // l.t.b, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof e) {
            return j((e) obj);
        }
        return -1;
    }

    public /* bridge */ int j(e eVar) {
        return super.indexOf(eVar);
    }

    public /* bridge */ int l(e eVar) {
        return super.lastIndexOf(eVar);
    }

    @Override // l.t.b, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof e) {
            return l((e) obj);
        }
        return -1;
    }
}
