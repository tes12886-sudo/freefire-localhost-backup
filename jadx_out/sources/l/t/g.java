package l.t;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class g extends f {
    public static <T> List<T> b(T[] tArr) {
        l.y.c.i.e(tArr, "<this>");
        List<T> listA = i.a(tArr);
        l.y.c.i.d(listA, "asList(this)");
        return listA;
    }

    public static byte[] c(byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        l.y.c.i.e(bArr, "<this>");
        l.y.c.i.e(bArr2, "destination");
        System.arraycopy(bArr, i3, bArr2, i2, i4 - i3);
        return bArr2;
    }

    public static /* synthetic */ byte[] d(byte[] bArr, byte[] bArr2, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = bArr.length;
        }
        d.c(bArr, bArr2, i2, i3, i4);
        return bArr2;
    }

    public static byte[] e(byte[] bArr, int i2, int i3) {
        l.y.c.i.e(bArr, "<this>");
        e.a(i3, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i2, i3);
        l.y.c.i.d(bArrCopyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return bArrCopyOfRange;
    }

    public static <T> void f(T[] tArr, T t, int i2, int i3) {
        l.y.c.i.e(tArr, "<this>");
        Arrays.fill(tArr, i2, i3, t);
    }

    public static /* synthetic */ void g(Object[] objArr, Object obj, int i2, int i3, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = objArr.length;
        }
        f(objArr, obj, i2, i3);
    }

    public static <T> void h(T[] tArr) {
        l.y.c.i.e(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    public static final <T> void i(T[] tArr, Comparator<? super T> comparator) {
        l.y.c.i.e(tArr, "<this>");
        l.y.c.i.e(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }
}
