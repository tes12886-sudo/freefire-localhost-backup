package j.d.d.b0;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class c implements Closeable, Flushable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f2044j = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String[] f2045k = new String[128];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String[] f2046l;
    private final Writer a;
    private int[] b = new int[32];
    private int c = 0;
    private String d;
    private String e;
    private boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f2047g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f2048h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f2049i;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            f2045k[i2] = String.format("\\u%04x", Integer.valueOf(i2));
        }
        String[] strArr = f2045k;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f2046l = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        e0(6);
        this.e = ":";
        this.f2049i = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.a = writer;
    }

    private static boolean Y(Class<? extends Number> cls) {
        return cls == Integer.class || cls == Long.class || cls == Double.class || cls == Float.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class;
    }

    private void a0() throws IOException {
        if (this.d == null) {
            return;
        }
        this.a.write(10);
        int i2 = this.c;
        for (int i3 = 1; i3 < i2; i3++) {
            this.a.write(this.d);
        }
    }

    private void b() throws IOException {
        int iD0 = d0();
        if (iD0 == 5) {
            this.a.write(44);
        } else if (iD0 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        a0();
        f0(4);
    }

    private void c() throws IOException {
        int iD0 = d0();
        if (iD0 == 1) {
            f0(2);
        } else {
            if (iD0 != 2) {
                if (iD0 == 4) {
                    this.a.append((CharSequence) this.e);
                    f0(5);
                    return;
                }
                if (iD0 != 6) {
                    if (iD0 != 7) {
                        throw new IllegalStateException("Nesting problem.");
                    }
                    if (!this.f) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                }
                f0(7);
                return;
            }
            this.a.append(',');
        }
        a0();
    }

    private c c0(int i2, char c) throws IOException {
        c();
        e0(i2);
        this.a.write(c);
        return this;
    }

    private int d0() {
        int i2 = this.c;
        if (i2 != 0) {
            return this.b[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void e0(int i2) {
        int i3 = this.c;
        int[] iArr = this.b;
        if (i3 == iArr.length) {
            this.b = Arrays.copyOf(iArr, i3 * 2);
        }
        int[] iArr2 = this.b;
        int i4 = this.c;
        this.c = i4 + 1;
        iArr2[i4] = i2;
    }

    private void f0(int i2) {
        this.b[this.c - 1] = i2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    private void k0(String str) throws IOException {
        String str2;
        String[] strArr = this.f2047g ? f2046l : f2045k;
        this.a.write(34);
        int length = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i2 < i3) {
                        this.a.write(str, i2, i3 - i2);
                    }
                    this.a.write(str2);
                    i2 = i3 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i2 < i3) {
                    this.a.write(str, i2, i3 - i2);
                }
                this.a.write(str2);
                i2 = i3 + 1;
            }
        }
        if (i2 < length) {
            this.a.write(str, i2, length - i2);
        }
        this.a.write(34);
    }

    private c l(int i2, int i3, char c) throws IOException {
        int iD0 = d0();
        if (iD0 != i3 && iD0 != i2) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f2048h != null) {
            throw new IllegalStateException("Dangling name: " + this.f2048h);
        }
        this.c--;
        if (iD0 == i3) {
            a0();
        }
        this.a.write(c);
        return this;
    }

    private void q0() throws IOException {
        if (this.f2048h != null) {
            b();
            k0(this.f2048h);
            this.f2048h = null;
        }
    }

    public c F() throws IOException {
        l(3, 5, '}');
        return this;
    }

    public final boolean O() {
        return this.f2049i;
    }

    public final boolean Q() {
        return this.f2047g;
    }

    public boolean T() {
        return this.f;
    }

    public c Z(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f2048h != null) {
            throw new IllegalStateException();
        }
        if (this.c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f2048h = str;
        return this;
    }

    public c b0() throws IOException {
        if (this.f2048h != null) {
            if (!this.f2049i) {
                this.f2048h = null;
                return this;
            }
            q0();
        }
        c();
        this.a.write("null");
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
        int i2 = this.c;
        if (i2 > 1 || (i2 == 1 && this.b[i2 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.c = 0;
    }

    public c f() throws IOException {
        q0();
        c0(1, '[');
        return this;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.a.flush();
    }

    public final void g0(boolean z) {
        this.f2047g = z;
    }

    public final void h0(String str) {
        String str2;
        if (str.length() == 0) {
            this.d = null;
            str2 = ":";
        } else {
            this.d = str;
            str2 = ": ";
        }
        this.e = str2;
    }

    public final void i0(boolean z) {
        this.f = z;
    }

    public c j() throws IOException {
        q0();
        c0(3, '{');
        return this;
    }

    public final void j0(boolean z) {
        this.f2049i = z;
    }

    public c l0(long j2) throws IOException {
        q0();
        c();
        this.a.write(Long.toString(j2));
        return this;
    }

    public c m0(Boolean bool) throws IOException {
        if (bool == null) {
            return b0();
        }
        q0();
        c();
        this.a.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c n0(Number number) throws IOException {
        if (number == null) {
            return b0();
        }
        q0();
        String string = number.toString();
        if (!string.equals("-Infinity") && !string.equals("Infinity") && !string.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (!Y(cls) && !f2044j.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        } else if (!this.f) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + string);
        }
        c();
        this.a.append((CharSequence) string);
        return this;
    }

    public c o0(String str) throws IOException {
        if (str == null) {
            return b0();
        }
        q0();
        c();
        k0(str);
        return this;
    }

    public c p0(boolean z) throws IOException {
        q0();
        c();
        this.a.write(z ? "true" : "false");
        return this;
    }

    public c u() throws IOException {
        l(1, 2, ']');
        return this;
    }
}
