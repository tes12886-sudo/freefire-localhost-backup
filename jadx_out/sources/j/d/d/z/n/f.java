package j.d.d.z.n;

import j.d.d.p;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f extends j.d.d.b0.a {
    private static final Reader t = new a();
    private static final Object u = new Object();
    private Object[] p;
    private int q;
    private String[] r;
    private int[] s;

    class a extends Reader {
        a() {
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i2, int i3) {
            throw new AssertionError();
        }
    }

    public f(j.d.d.k kVar) {
        super(t);
        this.p = new Object[32];
        this.q = 0;
        this.r = new String[32];
        this.s = new int[32];
        E0(kVar);
    }

    private Object B0() {
        return this.p[this.q - 1];
    }

    private Object C0() {
        Object[] objArr = this.p;
        int i2 = this.q - 1;
        this.q = i2;
        Object obj = objArr[i2];
        objArr[i2] = null;
        return obj;
    }

    private void E0(Object obj) {
        int i2 = this.q;
        Object[] objArr = this.p;
        if (i2 == objArr.length) {
            int i3 = i2 * 2;
            this.p = Arrays.copyOf(objArr, i3);
            this.s = Arrays.copyOf(this.s, i3);
            this.r = (String[]) Arrays.copyOf(this.r, i3);
        }
        Object[] objArr2 = this.p;
        int i4 = this.q;
        this.q = i4 + 1;
        objArr2[i4] = obj;
    }

    private String T(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i2 = 0;
        while (true) {
            int i3 = this.q;
            if (i2 >= i3) {
                return sb.toString();
            }
            Object[] objArr = this.p;
            if (objArr[i2] instanceof j.d.d.h) {
                i2++;
                if (i2 < i3 && (objArr[i2] instanceof Iterator)) {
                    int i4 = this.s[i2];
                    if (z && i4 > 0 && (i2 == i3 - 1 || i2 == i3 - 2)) {
                        i4--;
                    }
                    sb.append('[');
                    sb.append(i4);
                    sb.append(']');
                }
            } else if ((objArr[i2] instanceof j.d.d.n) && (i2 = i2 + 1) < i3 && (objArr[i2] instanceof Iterator)) {
                sb.append('.');
                String[] strArr = this.r;
                if (strArr[i2] != null) {
                    sb.append(strArr[i2]);
                }
            }
            i2++;
        }
    }

    private String c0() {
        return " at path " + Q();
    }

    private void z0(j.d.d.b0.b bVar) {
        if (n0() == bVar) {
            return;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + n0() + c0());
    }

    j.d.d.k A0() {
        j.d.d.b0.b bVarN0 = n0();
        if (bVarN0 != j.d.d.b0.b.NAME && bVarN0 != j.d.d.b0.b.END_ARRAY && bVarN0 != j.d.d.b0.b.END_OBJECT && bVarN0 != j.d.d.b0.b.END_DOCUMENT) {
            j.d.d.k kVar = (j.d.d.k) B0();
            x0();
            return kVar;
        }
        throw new IllegalStateException("Unexpected " + bVarN0 + " when reading a JsonElement.");
    }

    public void D0() {
        z0(j.d.d.b0.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) B0()).next();
        E0(entry.getValue());
        E0(new p((String) entry.getKey()));
    }

    @Override // j.d.d.b0.a
    public void F() {
        z0(j.d.d.b0.b.END_OBJECT);
        C0();
        C0();
        int i2 = this.q;
        if (i2 > 0) {
            int[] iArr = this.s;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // j.d.d.b0.a
    public String Q() {
        return T(false);
    }

    @Override // j.d.d.b0.a
    public String Y() {
        return T(true);
    }

    @Override // j.d.d.b0.a
    public boolean Z() {
        j.d.d.b0.b bVarN0 = n0();
        return (bVarN0 == j.d.d.b0.b.END_OBJECT || bVarN0 == j.d.d.b0.b.END_ARRAY || bVarN0 == j.d.d.b0.b.END_DOCUMENT) ? false : true;
    }

    @Override // j.d.d.b0.a
    public void b() {
        z0(j.d.d.b0.b.BEGIN_ARRAY);
        E0(((j.d.d.h) B0()).iterator());
        this.s[this.q - 1] = 0;
    }

    @Override // j.d.d.b0.a
    public void c() {
        z0(j.d.d.b0.b.BEGIN_OBJECT);
        E0(((j.d.d.n) B0()).s().iterator());
    }

    @Override // j.d.d.b0.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.p = new Object[]{u};
        this.q = 1;
    }

    @Override // j.d.d.b0.a
    public boolean d0() {
        z0(j.d.d.b0.b.BOOLEAN);
        boolean zQ = ((p) C0()).q();
        int i2 = this.q;
        if (i2 > 0) {
            int[] iArr = this.s;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return zQ;
    }

    @Override // j.d.d.b0.a
    public double e0() {
        j.d.d.b0.b bVarN0 = n0();
        j.d.d.b0.b bVar = j.d.d.b0.b.NUMBER;
        if (bVarN0 != bVar && bVarN0 != j.d.d.b0.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + bVarN0 + c0());
        }
        double dR = ((p) B0()).r();
        if (!a0() && (Double.isNaN(dR) || Double.isInfinite(dR))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + dR);
        }
        C0();
        int i2 = this.q;
        if (i2 > 0) {
            int[] iArr = this.s;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return dR;
    }

    @Override // j.d.d.b0.a
    public int f0() {
        j.d.d.b0.b bVarN0 = n0();
        j.d.d.b0.b bVar = j.d.d.b0.b.NUMBER;
        if (bVarN0 != bVar && bVarN0 != j.d.d.b0.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + bVarN0 + c0());
        }
        int iS = ((p) B0()).s();
        C0();
        int i2 = this.q;
        if (i2 > 0) {
            int[] iArr = this.s;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return iS;
    }

    @Override // j.d.d.b0.a
    public long g0() {
        j.d.d.b0.b bVarN0 = n0();
        j.d.d.b0.b bVar = j.d.d.b0.b.NUMBER;
        if (bVarN0 != bVar && bVarN0 != j.d.d.b0.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + bVarN0 + c0());
        }
        long jT = ((p) B0()).t();
        C0();
        int i2 = this.q;
        if (i2 > 0) {
            int[] iArr = this.s;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return jT;
    }

    @Override // j.d.d.b0.a
    public String h0() {
        z0(j.d.d.b0.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) B0()).next();
        String str = (String) entry.getKey();
        this.r[this.q - 1] = str;
        E0(entry.getValue());
        return str;
    }

    @Override // j.d.d.b0.a
    public void j0() {
        z0(j.d.d.b0.b.NULL);
        C0();
        int i2 = this.q;
        if (i2 > 0) {
            int[] iArr = this.s;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // j.d.d.b0.a
    public String l0() {
        j.d.d.b0.b bVarN0 = n0();
        j.d.d.b0.b bVar = j.d.d.b0.b.STRING;
        if (bVarN0 == bVar || bVarN0 == j.d.d.b0.b.NUMBER) {
            String strF = ((p) C0()).f();
            int i2 = this.q;
            if (i2 > 0) {
                int[] iArr = this.s;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return strF;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + bVarN0 + c0());
    }

    @Override // j.d.d.b0.a
    public j.d.d.b0.b n0() {
        if (this.q == 0) {
            return j.d.d.b0.b.END_DOCUMENT;
        }
        Object objB0 = B0();
        if (objB0 instanceof Iterator) {
            boolean z = this.p[this.q - 2] instanceof j.d.d.n;
            Iterator it = (Iterator) objB0;
            if (!it.hasNext()) {
                return z ? j.d.d.b0.b.END_OBJECT : j.d.d.b0.b.END_ARRAY;
            }
            if (z) {
                return j.d.d.b0.b.NAME;
            }
            E0(it.next());
            return n0();
        }
        if (objB0 instanceof j.d.d.n) {
            return j.d.d.b0.b.BEGIN_OBJECT;
        }
        if (objB0 instanceof j.d.d.h) {
            return j.d.d.b0.b.BEGIN_ARRAY;
        }
        if (!(objB0 instanceof p)) {
            if (objB0 instanceof j.d.d.m) {
                return j.d.d.b0.b.NULL;
            }
            if (objB0 == u) {
                throw new IllegalStateException("JsonReader is closed");
            }
            throw new AssertionError();
        }
        p pVar = (p) objB0;
        if (pVar.y()) {
            return j.d.d.b0.b.STRING;
        }
        if (pVar.v()) {
            return j.d.d.b0.b.BOOLEAN;
        }
        if (pVar.x()) {
            return j.d.d.b0.b.NUMBER;
        }
        throw new AssertionError();
    }

    @Override // j.d.d.b0.a
    public String toString() {
        return f.class.getSimpleName() + c0();
    }

    @Override // j.d.d.b0.a
    public void u() {
        z0(j.d.d.b0.b.END_ARRAY);
        C0();
        C0();
        int i2 = this.q;
        if (i2 > 0) {
            int[] iArr = this.s;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // j.d.d.b0.a
    public void x0() {
        if (n0() == j.d.d.b0.b.NAME) {
            h0();
            this.r[this.q - 2] = "null";
        } else {
            C0();
            int i2 = this.q;
            if (i2 > 0) {
                this.r[i2 - 1] = "null";
            }
        }
        int i3 = this.q;
        if (i3 > 0) {
            int[] iArr = this.s;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
        }
    }
}
