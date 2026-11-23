package h.f;

/* JADX INFO: loaded from: classes.dex */
public class h<E> implements Cloneable {
    private static final Object e = new Object();
    private boolean a;
    private int[] b;
    private Object[] c;
    private int d;

    public h() {
        this(10);
    }

    public h(int i2) {
        this.a = false;
        if (i2 == 0) {
            this.b = c.a;
            this.c = c.c;
        } else {
            int iE = c.e(i2);
            this.b = new int[iE];
            this.c = new Object[iE];
        }
    }

    private void g() {
        int i2 = this.d;
        int[] iArr = this.b;
        Object[] objArr = this.c;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != e) {
                if (i4 != i3) {
                    iArr[i3] = iArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.a = false;
        this.d = i3;
    }

    public void a(int i2, E e2) {
        int i3 = this.d;
        if (i3 != 0 && i2 <= this.b[i3 - 1]) {
            m(i2, e2);
            return;
        }
        if (this.a && i3 >= this.b.length) {
            g();
        }
        int i4 = this.d;
        if (i4 >= this.b.length) {
            int iE = c.e(i4 + 1);
            int[] iArr = new int[iE];
            Object[] objArr = new Object[iE];
            int[] iArr2 = this.b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.b = iArr;
            this.c = objArr;
        }
        this.b[i4] = i2;
        this.c[i4] = e2;
        this.d = i4 + 1;
    }

    public void d() {
        int i2 = this.d;
        Object[] objArr = this.c;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.d = 0;
        this.a = false;
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public h<E> clone() {
        try {
            h<E> hVar = (h) super.clone();
            hVar.b = (int[]) this.b.clone();
            hVar.c = (Object[]) this.c.clone();
            return hVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public E h(int i2) {
        return i(i2, null);
    }

    public E i(int i2, E e2) {
        int iA = c.a(this.b, this.d, i2);
        if (iA >= 0) {
            Object[] objArr = this.c;
            if (objArr[iA] != e) {
                return (E) objArr[iA];
            }
        }
        return e2;
    }

    public int k(int i2) {
        if (this.a) {
            g();
        }
        return this.b[i2];
    }

    public void m(int i2, E e2) {
        int iA = c.a(this.b, this.d, i2);
        if (iA >= 0) {
            this.c[iA] = e2;
            return;
        }
        int iA2 = iA ^ (-1);
        int i3 = this.d;
        if (iA2 < i3) {
            Object[] objArr = this.c;
            if (objArr[iA2] == e) {
                this.b[iA2] = i2;
                objArr[iA2] = e2;
                return;
            }
        }
        if (this.a && i3 >= this.b.length) {
            g();
            iA2 = c.a(this.b, this.d, i2) ^ (-1);
        }
        int i4 = this.d;
        if (i4 >= this.b.length) {
            int iE = c.e(i4 + 1);
            int[] iArr = new int[iE];
            Object[] objArr2 = new Object[iE];
            int[] iArr2 = this.b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.b = iArr;
            this.c = objArr2;
        }
        int i5 = this.d;
        if (i5 - iA2 != 0) {
            int[] iArr3 = this.b;
            int i6 = iA2 + 1;
            System.arraycopy(iArr3, iA2, iArr3, i6, i5 - iA2);
            Object[] objArr4 = this.c;
            System.arraycopy(objArr4, iA2, objArr4, i6, this.d - iA2);
        }
        this.b[iA2] = i2;
        this.c[iA2] = e2;
        this.d++;
    }

    public int n() {
        if (this.a) {
            g();
        }
        return this.d;
    }

    public E o(int i2) {
        if (this.a) {
            g();
        }
        return (E) this.c[i2];
    }

    public String toString() {
        if (n() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.d; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(k(i2));
            sb.append('=');
            E eO = o(i2);
            if (eO != this) {
                sb.append(eO);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
