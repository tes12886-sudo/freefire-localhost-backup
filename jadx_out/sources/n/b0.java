package n;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {
    public static final byte[] a(String str) {
        l.y.c.i.e(str, "<this>");
        byte[] bytes = str.getBytes(l.d0.d.b);
        l.y.c.i.d(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final String b(byte[] bArr) {
        l.y.c.i.e(bArr, "<this>");
        return new String(bArr, l.d0.d.b);
    }
}
