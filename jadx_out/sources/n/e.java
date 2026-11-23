package n;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class e implements Serializable, Comparable<e> {
    public static final a d = new a(null);
    public static final e e = new e(new byte[0]);
    private final byte[] a;
    private transient int b;
    private transient String c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }

        public static /* synthetic */ e f(a aVar, byte[] bArr, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i2 = 0;
            }
            if ((i4 & 2) != 0) {
                i3 = bArr.length;
            }
            return aVar.e(bArr, i2, i3);
        }

        public final e a(String str) {
            l.y.c.i.e(str, "<this>");
            byte[] bArrA = a0.a(str);
            if (bArrA != null) {
                return new e(bArrA);
            }
            return null;
        }

        public final e b(String str) {
            l.y.c.i.e(str, "<this>");
            int i2 = 0;
            if (!(str.length() % 2 == 0)) {
                throw new IllegalArgumentException(l.y.c.i.k("Unexpected hex string: ", str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            int i3 = length - 1;
            if (i3 >= 0) {
                while (true) {
                    int i4 = i2 + 1;
                    int i5 = i2 * 2;
                    bArr[i2] = (byte) ((n.d0.b.e(str.charAt(i5)) << 4) + n.d0.b.e(str.charAt(i5 + 1)));
                    if (i4 > i3) {
                        break;
                    }
                    i2 = i4;
                }
            }
            return new e(bArr);
        }

        public final e c(String str, Charset charset) {
            l.y.c.i.e(str, "<this>");
            l.y.c.i.e(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            l.y.c.i.d(bytes, "(this as java.lang.String).getBytes(charset)");
            return new e(bytes);
        }

        public final e d(String str) {
            l.y.c.i.e(str, "<this>");
            e eVar = new e(b0.a(str));
            eVar.q(str);
            return eVar;
        }

        public final e e(byte[] bArr, int i2, int i3) {
            l.y.c.i.e(bArr, "<this>");
            c0.b(bArr.length, i2, i3);
            return new e(l.t.g.e(bArr, i2, i3 + i2));
        }

        public final e g(InputStream inputStream, int i2) throws IOException {
            l.y.c.i.e(inputStream, "<this>");
            int i3 = 0;
            if (!(i2 >= 0)) {
                throw new IllegalArgumentException(l.y.c.i.k("byteCount < 0: ", Integer.valueOf(i2)).toString());
            }
            byte[] bArr = new byte[i2];
            while (i3 < i2) {
                int i4 = inputStream.read(bArr, i3, i2 - i3);
                if (i4 == -1) {
                    throw new EOFException();
                }
                i3 += i4;
            }
            return new e(bArr);
        }
    }

    public e(byte[] bArr) {
        l.y.c.i.e(bArr, "data");
        this.a = bArr;
    }

    public static final e m(byte[] bArr, int i2, int i3) {
        return d.e(bArr, i2, i3);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException {
        e eVarG = d.g(objectInputStream, objectInputStream.readInt());
        Field declaredField = e.class.getDeclaredField("a");
        declaredField.setAccessible(true);
        declaredField.set(this, eVarG.a);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.a.length);
        objectOutputStream.write(this.a);
    }

    public String a() {
        return a0.c(f(), null, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0030 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0032 A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(e eVar) {
        l.y.c.i.e(eVar, "other");
        int iT = t();
        int iT2 = eVar.t();
        int iMin = Math.min(iT, iT2);
        for (int i2 = 0; i2 < iMin; i2++) {
            int iE = e(i2) & 255;
            int iE2 = eVar.e(i2) & 255;
            if (iE != iE2) {
                if (iE < iE2) {
                    return -1;
                }
                return 1;
            }
        }
        if (iT == iT2) {
            return 0;
        }
        if (iT < iT2) {
            return -1;
        }
        return 1;
    }

    public e d(String str) throws NoSuchAlgorithmException {
        l.y.c.i.e(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(f(), 0, t());
        byte[] bArrDigest = messageDigest.digest();
        l.y.c.i.d(bArrDigest, "digestBytes");
        return new e(bArrDigest);
    }

    public final byte e(int i2) {
        return l(i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (eVar.t() == f().length && eVar.o(0, f(), 0, f().length)) {
                return true;
            }
        }
        return false;
    }

    public final byte[] f() {
        return this.a;
    }

    public final int g() {
        return this.b;
    }

    public int h() {
        return f().length;
    }

    public int hashCode() {
        int iG = g();
        if (iG != 0) {
            return iG;
        }
        int iHashCode = Arrays.hashCode(f());
        p(iHashCode);
        return iHashCode;
    }

    public final String i() {
        return this.c;
    }

    public String j() {
        char[] cArr = new char[f().length * 2];
        byte[] bArrF = f();
        int length = bArrF.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            byte b = bArrF[i2];
            i2++;
            int i4 = i3 + 1;
            cArr[i3] = n.d0.b.f()[(b >> 4) & 15];
            i3 = i4 + 1;
            cArr[i4] = n.d0.b.f()[b & 15];
        }
        return l.d0.p.h(cArr);
    }

    public byte[] k() {
        return f();
    }

    public byte l(int i2) {
        return f()[i2];
    }

    public boolean n(int i2, e eVar, int i3, int i4) {
        l.y.c.i.e(eVar, "other");
        return eVar.o(i3, f(), i2, i4);
    }

    public boolean o(int i2, byte[] bArr, int i3, int i4) {
        l.y.c.i.e(bArr, "other");
        return i2 >= 0 && i2 <= f().length - i4 && i3 >= 0 && i3 <= bArr.length - i4 && c0.a(f(), i2, bArr, i3, i4);
    }

    public final void p(int i2) {
        this.b = i2;
    }

    public final void q(String str) {
        this.c = str;
    }

    public final e r() {
        return d("SHA-1");
    }

    public final e s() {
        return d("SHA-256");
    }

    public final int t() {
        return h();
    }

    public String toString() {
        StringBuilder sb;
        String str;
        if (!(f().length == 0)) {
            int iC = n.d0.b.c(f(), 64);
            if (iC != -1) {
                String strX = x();
                if (strX == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String strSubstring = strX.substring(0, iC);
                l.y.c.i.d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String strT = l.d0.p.t(l.d0.p.t(l.d0.p.t(strSubstring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
                if (iC < strX.length()) {
                    sb = new StringBuilder();
                    sb.append("[size=");
                    sb.append(f().length);
                    sb.append(" text=");
                    sb.append(strT);
                } else {
                    sb = new StringBuilder();
                    sb.append("[text=");
                    sb.append(strT);
                    sb.append(']');
                }
                return sb.toString();
            }
            if (f().length <= 64) {
                str = "[hex=" + j() + ']';
            } else {
                sb = new StringBuilder();
                sb.append("[size=");
                sb.append(f().length);
                sb.append(" hex=");
                int iC2 = c0.c(this, 64);
                if (!(iC2 <= f().length)) {
                    throw new IllegalArgumentException(("endIndex > length(" + f().length + ')').toString());
                }
                if (!(iC2 + 0 >= 0)) {
                    throw new IllegalArgumentException("endIndex < beginIndex".toString());
                }
                sb.append((iC2 == f().length ? this : new e(l.t.g.e(f(), 0, iC2))).j());
            }
            sb.append("…]");
            return sb.toString();
        }
        str = "[size=0]";
        return str;
    }

    public final boolean u(e eVar) {
        l.y.c.i.e(eVar, "prefix");
        return n(0, eVar, 0, eVar.t());
    }

    public e v() {
        byte b;
        for (int i2 = 0; i2 < f().length; i2++) {
            byte b2 = f()[i2];
            byte b3 = (byte) 65;
            if (b2 >= b3 && b2 <= (b = (byte) 90)) {
                byte[] bArrF = f();
                byte[] bArrCopyOf = Arrays.copyOf(bArrF, bArrF.length);
                l.y.c.i.d(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
                bArrCopyOf[i2] = (byte) (b2 + 32);
                for (int i3 = i2 + 1; i3 < bArrCopyOf.length; i3++) {
                    byte b4 = bArrCopyOf[i3];
                    if (b4 >= b3 && b4 <= b) {
                        bArrCopyOf[i3] = (byte) (b4 + 32);
                    }
                }
                return new e(bArrCopyOf);
            }
        }
        return this;
    }

    public byte[] w() {
        byte[] bArrF = f();
        byte[] bArrCopyOf = Arrays.copyOf(bArrF, bArrF.length);
        l.y.c.i.d(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
        return bArrCopyOf;
    }

    public String x() {
        String strI = i();
        if (strI != null) {
            return strI;
        }
        String strB = b0.b(k());
        q(strB);
        return strB;
    }

    public void y(b bVar, int i2, int i3) {
        l.y.c.i.e(bVar, "buffer");
        n.d0.b.d(this, bVar, i2, i3);
    }
}
