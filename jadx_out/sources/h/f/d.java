package h.f;

/* JADX INFO: loaded from: classes.dex */
public class d<E> implements Cloneable {
    private static final Object e = new Object();
    private boolean a;
    private long[] b;
    private Object[] c;
    private int d;

    public d() {
        this(10);
    }

    public d(int i2) {
        this.a = false;
        if (i2 == 0) {
            this.b = c.b;
            this.c = c.c;
        } else {
            int iF = c.f(i2);
            this.b = new long[iF];
            this.c = new Object[iF];
        }
    }

    private void g() {
        int i2 = this.d;
        long[] jArr = this.b;
        Object[] objArr = this.c;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != e) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.a = false;
        this.d = i3;
    }

    public void a(long j2, E e2) {
        int i2 = this.d;
        if (i2 != 0 && j2 <= this.b[i2 - 1]) {
            m(j2, e2);
            return;
        }
        if (this.a && i2 >= this.b.length) {
            g();
        }
        int i3 = this.d;
        if (i3 >= this.b.length) {
            int iF = c.f(i3 + 1);
            long[] jArr = new long[iF];
            Object[] objArr = new Object[iF];
            long[] jArr2 = this.b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.b = jArr;
            this.c = objArr;
        }
        this.b[i3] = j2;
        this.c[i3] = e2;
        this.d = i3 + 1;
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
    public d<E> clone() {
        try {
            d<E> dVar = (d) super.clone();
            dVar.b = (long[]) this.b.clone();
            dVar.c = (Object[]) this.c.clone();
            return dVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public E h(long j2) {
        return i(j2, null);
    }

    public E i(long j2, E e2) {
        int iB = c.b(this.b, this.d, j2);
        if (iB >= 0) {
            Object[] objArr = this.c;
            if (objArr[iB] != e) {
                return (E) objArr[iB];
            }
        }
        return e2;
    }

    public long k(int i2) {
        if (this.a) {
            g();
        }
        return this.b[i2];
    }

    public void m(long j2, E e2) {
        int iB = c.b(this.b, this.d, j2);
        if (iB >= 0) {
            this.c[iB] = e2;
            return;
        }
        int iB2 = iB ^ (-1);
        int i2 = this.d;
        if (iB2 < i2) {
            Object[] objArr = this.c;
            if (objArr[iB2] == e) {
                this.b[iB2] = j2;
                objArr[iB2] = e2;
                return;
            }
        }
        if (this.a && i2 >= this.b.length) {
            g();
            iB2 = c.b(this.b, this.d, j2) ^ (-1);
        }
        int i3 = this.d;
        if (i3 >= this.b.length) {
            int iF = c.f(i3 + 1);
            long[] jArr = new long[iF];
            Object[] objArr2 = new Object[iF];
            long[] jArr2 = this.b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.b = jArr;
            this.c = objArr2;
        }
        int i4 = this.d;
        if (i4 - iB2 != 0) {
            long[] jArr3 = this.b;
            int i5 = iB2 + 1;
            System.arraycopy(jArr3, iB2, jArr3, i5, i4 - iB2);
            Object[] objArr4 = this.c;
            System.arraycopy(objArr4, iB2, objArr4, i5, this.d - iB2);
        }
        this.b[iB2] = j2;
        this.c[iB2] = e2;
        this.d++;
    }

    public void n(long j2) {
        int iB = c.b(this.b, this.d, j2);
        if (iB >= 0) {
            Object[] objArr = this.c;
            Object obj = objArr[iB];
            Object obj2 = e;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.a = true;
            }
        }
    }

    public int o() {
        if (this.a) {
            g();
        }
        return this.d;
    }

    public E p(int i2) {
        if (this.a) {
            g();
        }
        return (E) this.c[i2];
    }

    public String toString() {
        if (o() <= 0) {
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
            E eP = p(i2);
            if (eP != this) {
                sb.append(eP);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
