package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class g9 {
    static final Charset a = Charset.forName("UTF-8");
    public static final byte[] b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new b8(bArr, 0, 0, false, null).c(0);
        } catch (i9 e) {
            throw new IllegalArgumentException(e);
        }
    }

    static <T> T a(T t) {
        t.getClass();
        return t;
    }

    static <T> T b(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static boolean c(byte[] bArr) {
        return sb.a(bArr);
    }

    public static String d(byte[] bArr) {
        return new String(bArr, a);
    }

    public static int e(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static int f(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int g(byte[] bArr) {
        int length = bArr.length;
        int iH = h(length, bArr, 0, length);
        if (iH == 0) {
            return 1;
        }
        return iH;
    }

    static int h(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }

    static Object i(Object obj, Object obj2) {
        ca caVarI = ((da) obj).i();
        caVarI.l((da) obj2);
        return caVarI.T();
    }
}
