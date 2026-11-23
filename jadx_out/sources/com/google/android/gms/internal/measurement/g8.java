package com.google.android.gms.internal.measurement;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class g8 extends r7 {
    private static final Logger b = Logger.getLogger(g8.class.getName());
    private static final boolean c = nb.f();
    h8 a;

    private g8() {
    }

    /* synthetic */ g8(d8 d8Var) {
    }

    public static int A(int i2) {
        if ((i2 & (-128)) == 0) {
            return 1;
        }
        if ((i2 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i2) == 0) {
            return 3;
        }
        return (i2 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int B(long j2) {
        int i2;
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (j2 < 0) {
            return 10;
        }
        if (((-34359738368L) & j2) != 0) {
            j2 >>>= 28;
            i2 = 6;
        } else {
            i2 = 2;
        }
        if (((-2097152) & j2) != 0) {
            i2 += 2;
            j2 >>>= 14;
        }
        return (j2 & (-16384)) != 0 ? i2 + 1 : i2;
    }

    public static int C(String str) {
        int length;
        try {
            length = sb.c(str);
        } catch (rb unused) {
            length = str.getBytes(g9.a).length;
        }
        return A(length) + length;
    }

    public static int D(k9 k9Var) {
        int iA = k9Var.a();
        return A(iA) + iA;
    }

    public static int a(z7 z7Var) {
        int iD = z7Var.d();
        return A(iD) + iD;
    }

    static int b(da daVar, oa oaVar) {
        l7 l7Var = (l7) daVar;
        int iC = l7Var.c();
        if (iC == -1) {
            iC = oaVar.b(l7Var);
            l7Var.f(iC);
        }
        return A(iC) + iC;
    }

    @Deprecated
    static int e(int i2, da daVar, oa oaVar) {
        int iA = A(i2 << 3);
        int i3 = iA + iA;
        l7 l7Var = (l7) daVar;
        int iC = l7Var.c();
        if (iC == -1) {
            iC = oaVar.b(l7Var);
            l7Var.f(iC);
        }
        return i3 + iC;
    }

    public static g8 x(byte[] bArr) {
        return new e8(bArr, 0, bArr.length);
    }

    public static int y(int i2) {
        return A(i2 << 3);
    }

    public static int z(int i2) {
        if (i2 >= 0) {
            return A(i2);
        }
        return 10;
    }

    public final void c() {
        if (w() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void d(String str, rb rbVar) throws f8 {
        b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) rbVar);
        byte[] bytes = str.getBytes(g9.a);
        try {
            int length = bytes.length;
            r(length);
            v(bytes, 0, length);
        } catch (f8 e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new f8(e2);
        }
    }

    public abstract void g(int i2, int i3);

    public abstract void h(int i2, int i3);

    public abstract void i(int i2, int i3);

    public abstract void j(int i2, int i3);

    public abstract void k(int i2, long j2);

    public abstract void l(int i2, long j2);

    public abstract void m(int i2, boolean z);

    public abstract void n(int i2, String str);

    public abstract void o(int i2, z7 z7Var);

    public abstract void p(byte b2);

    public abstract void q(int i2);

    public abstract void r(int i2);

    public abstract void s(int i2);

    public abstract void t(long j2);

    public abstract void u(long j2);

    public abstract void v(byte[] bArr, int i2, int i3);

    public abstract int w();
}
