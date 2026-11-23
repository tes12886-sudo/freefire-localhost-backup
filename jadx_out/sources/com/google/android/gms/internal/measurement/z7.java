package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class z7 implements Iterable<Byte>, Serializable {
    public static final z7 b = new y7(g9.b);
    private int a = 0;

    static {
        int i2 = n7.a;
    }

    z7() {
    }

    public static z7 q(byte[] bArr, int i2, int i3) {
        u(i2, i2 + i3, bArr.length);
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return new y7(bArr2);
    }

    public static z7 r(String str) {
        return new y7(str.getBytes(g9.a));
    }

    static int u(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i2);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i3 < i2) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(i3);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("End index: ");
        sb3.append(i3);
        sb3.append(" >= ");
        sb3.append(i4);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    public abstract byte b(int i2);

    abstract byte c(int i2);

    public abstract int d();

    public abstract boolean equals(Object obj);

    public abstract z7 f(int i2, int i3);

    abstract void h(r7 r7Var);

    public final int hashCode() {
        int iN = this.a;
        if (iN == 0) {
            int iD = d();
            iN = n(iD, 0, iD);
            if (iN == 0) {
                iN = 1;
            }
            this.a = iN;
        }
        return iN;
    }

    @Override // java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
        return new s7(this);
    }

    protected abstract String j(Charset charset);

    public abstract boolean l();

    protected abstract int n(int i2, int i3, int i4);

    public final String s(Charset charset) {
        return d() == 0 ? "" : j(charset);
    }

    protected final int t() {
        return this.a;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(d());
        objArr[2] = d() <= 50 ? bb.a(this) : String.valueOf(bb.a(f(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
