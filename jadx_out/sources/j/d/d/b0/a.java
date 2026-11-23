package j.d.d.b0;

import j.d.d.z.f;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class a implements Closeable {
    private final Reader a;
    private boolean b = false;
    private final char[] c = new char[1024];
    private int d = 0;
    private int e = 0;
    private int f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f2030g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f2031h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f2032i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f2033j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f2034k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int[] f2035l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f2036m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String[] f2037n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int[] f2038o;

    /* JADX INFO: renamed from: j.d.d.b0.a$a, reason: collision with other inner class name */
    class C0237a extends f {
        C0237a() {
        }

        @Override // j.d.d.z.f
        public void a(a aVar) throws IOException {
            int i2;
            if (aVar instanceof j.d.d.z.n.f) {
                ((j.d.d.z.n.f) aVar).D0();
                return;
            }
            int iL = aVar.f2031h;
            if (iL == 0) {
                iL = aVar.l();
            }
            if (iL == 13) {
                i2 = 9;
            } else if (iL == 12) {
                i2 = 8;
            } else {
                if (iL != 14) {
                    throw new IllegalStateException("Expected a name but was " + aVar.n0() + aVar.c0());
                }
                i2 = 10;
            }
            aVar.f2031h = i2;
        }
    }

    static {
        f.a = new C0237a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f2035l = iArr;
        this.f2036m = 0;
        this.f2036m = 0 + 1;
        iArr[0] = 6;
        this.f2037n = new String[32];
        this.f2038o = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.a = reader;
    }

    private boolean O(int i2) throws IOException {
        int i3;
        int i4;
        char[] cArr = this.c;
        int i5 = this.f2030g;
        int i6 = this.d;
        this.f2030g = i5 - i6;
        int i7 = this.e;
        if (i7 != i6) {
            int i8 = i7 - i6;
            this.e = i8;
            System.arraycopy(cArr, i6, cArr, 0, i8);
        } else {
            this.e = 0;
        }
        this.d = 0;
        do {
            Reader reader = this.a;
            int i9 = this.e;
            int i10 = reader.read(cArr, i9, cArr.length - i9);
            if (i10 == -1) {
                return false;
            }
            i3 = this.e + i10;
            this.e = i3;
            if (this.f == 0 && (i4 = this.f2030g) == 0 && i3 > 0 && cArr[0] == 65279) {
                this.d++;
                this.f2030g = i4 + 1;
                i2++;
            }
        } while (i3 < i2);
        return true;
    }

    private String T(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i2 = 0;
        while (true) {
            int i3 = this.f2036m;
            if (i2 >= i3) {
                return sb.toString();
            }
            int i4 = this.f2035l[i2];
            if (i4 == 1 || i4 == 2) {
                int i5 = this.f2038o[i2];
                if (z && i5 > 0 && i2 == i3 - 1) {
                    i5--;
                }
                sb.append('[');
                sb.append(i5);
                sb.append(']');
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                sb.append('.');
                String[] strArr = this.f2037n;
                if (strArr[i2] != null) {
                    sb.append(strArr[i2]);
                }
            }
            i2++;
        }
    }

    private boolean b0(char c) throws d {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        f();
        return false;
    }

    private void f() throws d {
        if (this.b) {
            return;
        }
        y0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    private int i0(boolean z) throws IOException {
        int i2;
        char c;
        char[] cArr = this.c;
        while (true) {
            int i3 = this.d;
            while (true) {
                int i4 = this.e;
                while (true) {
                    if (i3 == i4) {
                        this.d = i3;
                        if (!O(1)) {
                            if (!z) {
                                return -1;
                            }
                            throw new EOFException("End of input" + c0());
                        }
                        i3 = this.d;
                        i4 = this.e;
                    }
                    i2 = i3 + 1;
                    c = cArr[i3];
                    if (c == '\n') {
                        this.f++;
                        this.f2030g = i2;
                    } else if (c == ' ' || c == '\r' || c == '\t') {
                    }
                    i3 = i2;
                }
                if (c != '/') {
                    this.d = i2;
                    if (c != '#') {
                        return c;
                    }
                    f();
                    break;
                }
                this.d = i2;
                if (i2 == i4) {
                    this.d = i2 - 1;
                    boolean zO = O(2);
                    this.d++;
                    if (!zO) {
                        return c;
                    }
                }
                f();
                int i5 = this.d;
                char c2 = cArr[i5];
                if (c2 != '*') {
                    if (c2 == '/') {
                        this.d = i5 + 1;
                        break;
                    }
                    return c;
                }
                this.d = i5 + 1;
                if (!u0("*/")) {
                    y0("Unterminated comment");
                    throw null;
                }
                i3 = this.d + 2;
            }
            v0();
        }
    }

    private void j() throws IOException {
        i0(true);
        int i2 = this.d - 1;
        this.d = i2;
        if (i2 + 5 <= this.e || O(5)) {
            int i3 = this.d;
            char[] cArr = this.c;
            if (cArr[i3] == ')' && cArr[i3 + 1] == ']' && cArr[i3 + 2] == '}' && cArr[i3 + 3] == '\'' && cArr[i3 + 4] == '\n') {
                this.d = i3 + 5;
            }
        }
    }

    private String k0(char c) throws d {
        char[] cArr = this.c;
        StringBuilder sb = null;
        while (true) {
            int i2 = this.d;
            int i3 = this.e;
            while (true) {
                if (i2 >= i3) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i2 - i2) * 2, 16));
                    }
                    sb.append(cArr, i2, i2 - i2);
                    this.d = i2;
                    if (O(1)) {
                        break;
                    }
                    y0("Unterminated string");
                    throw null;
                }
                int i4 = i2 + 1;
                char c2 = cArr[i2];
                if (c2 == c) {
                    this.d = i4;
                    int i5 = (i4 - i2) - 1;
                    if (sb == null) {
                        return new String(cArr, i2, i5);
                    }
                    sb.append(cArr, i2, i5);
                    return sb.toString();
                }
                if (c2 == '\\') {
                    this.d = i4;
                    int i6 = (i4 - i2) - 1;
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i6 + 1) * 2, 16));
                    }
                    sb.append(cArr, i2, i6);
                    sb.append(r0());
                    break;
                }
                if (c2 == '\n') {
                    this.f++;
                    this.f2030g = i4;
                }
                i2 = i4;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    private String m0() throws d {
        String string;
        int i2 = 0;
        StringBuilder sb = null;
        while (true) {
            int i3 = 0;
            while (true) {
                int i4 = this.d;
                if (i4 + i3 < this.e) {
                    char c = this.c[i4 + i3];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i3++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        f();
                    }
                    i2 = i3;
                } else if (i3 >= this.c.length) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i3, 16));
                    }
                    sb.append(this.c, this.d, i3);
                    this.d += i3;
                    if (!O(1)) {
                    }
                } else if (!O(i3 + 1)) {
                    i2 = i3;
                }
                if (sb == null) {
                    string = new String(this.c, this.d, i2);
                } else {
                    sb.append(this.c, this.d, i2);
                    string = sb.toString();
                }
                this.d += i2;
                return string;
            }
        }
    }

    private int o0() {
        int i2;
        String str;
        String str2;
        char c = this.c[this.d];
        if (c == 't' || c == 'T') {
            i2 = 5;
            str = "true";
            str2 = "TRUE";
        } else if (c == 'f' || c == 'F') {
            i2 = 6;
            str = "false";
            str2 = "FALSE";
        } else {
            if (c != 'n' && c != 'N') {
                return 0;
            }
            i2 = 7;
            str = "null";
            str2 = "NULL";
        }
        int length = str.length();
        for (int i3 = 1; i3 < length; i3++) {
            if (this.d + i3 >= this.e && !O(i3 + 1)) {
                return 0;
            }
            char c2 = this.c[this.d + i3];
            if (c2 != str.charAt(i3) && c2 != str2.charAt(i3)) {
                return 0;
            }
        }
        if ((this.d + length < this.e || O(length + 1)) && b0(this.c[this.d + length])) {
            return 0;
        }
        this.d += length;
        this.f2031h = i2;
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:92:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:94:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:99:0x00f0  */
    private int p0() {
        char c;
        int i2;
        char[] cArr = this.c;
        int i3 = this.d;
        int i4 = this.e;
        int i5 = 0;
        int i6 = 0;
        char c2 = 0;
        boolean z = true;
        long j2 = 0;
        boolean z2 = false;
        while (true) {
            if (i3 + i6 != i4) {
                c = cArr[i3 + i6];
                if (c != '+') {
                    if (c != 'E' || c == 'e') {
                        i5 = 0;
                        if (c2 == 2 && c2 != 4) {
                            return 0;
                        }
                        c2 = 5;
                    } else if (c == '-') {
                        i5 = 0;
                        if (c2 == 0) {
                            c2 = 1;
                            z2 = true;
                        } else if (c2 != 5) {
                            return 0;
                        }
                    } else if (c == '.') {
                        i5 = 0;
                        if (c2 != 2) {
                            return 0;
                        }
                        c2 = 3;
                    } else {
                        if (c < '0' || c > '9') {
                            if (!b0(c)) {
                                break;
                            }
                            return 0;
                        }
                        if (c2 == 1 || c2 == 0) {
                            j2 = -(c - '0');
                            i5 = 0;
                            c2 = 2;
                        } else {
                            if (c2 == 2) {
                                if (j2 == 0) {
                                    return 0;
                                }
                                long j3 = (10 * j2) - ((long) (c - '0'));
                                z &= j2 > -922337203685477580L || (j2 == -922337203685477580L && j3 < j2);
                                j2 = j3;
                            } else if (c2 == 3) {
                                i5 = 0;
                                c2 = 4;
                            } else if (c2 == 5 || c2 == 6) {
                                i5 = 0;
                                c2 = 7;
                            }
                            i5 = 0;
                        }
                    }
                    i6++;
                } else {
                    i5 = 0;
                    if (c2 != 5) {
                        return 0;
                    }
                }
                c2 = 6;
                i6++;
            } else {
                if (i6 == cArr.length) {
                    return i5;
                }
                if (!O(i6 + 1)) {
                    break;
                }
                i3 = this.d;
                i4 = this.e;
                c = cArr[i3 + i6];
                if (c != '+') {
                    if (c != 'E') {
                        i5 = 0;
                        if (c2 == 2) {
                        }
                        c2 = 5;
                    } else {
                        i5 = 0;
                        if (c2 == 2) {
                        }
                        c2 = 5;
                    }
                    i6++;
                } else {
                    i5 = 0;
                    if (c2 != 5) {
                        return 0;
                    }
                }
                c2 = 6;
                i6++;
            }
        }
        if (c2 == 2 && z && ((j2 != Long.MIN_VALUE || z2) && (j2 != 0 || !z2))) {
            if (!z2) {
                j2 = -j2;
            }
            this.f2032i = j2;
            this.d += i6;
            i2 = 15;
        } else {
            if (c2 != 2 && c2 != 4 && c2 != 7) {
                return 0;
            }
            this.f2033j = i6;
            i2 = 16;
        }
        this.f2031h = i2;
        return i2;
    }

    private void q0(int i2) {
        int i3 = this.f2036m;
        int[] iArr = this.f2035l;
        if (i3 == iArr.length) {
            int i4 = i3 * 2;
            this.f2035l = Arrays.copyOf(iArr, i4);
            this.f2038o = Arrays.copyOf(this.f2038o, i4);
            this.f2037n = (String[]) Arrays.copyOf(this.f2037n, i4);
        }
        int[] iArr2 = this.f2035l;
        int i5 = this.f2036m;
        this.f2036m = i5 + 1;
        iArr2[i5] = i2;
    }

    private char r0() throws d {
        int i2;
        int i3;
        if (this.d == this.e && !O(1)) {
            y0("Unterminated escape sequence");
            throw null;
        }
        char[] cArr = this.c;
        int i4 = this.d;
        int i5 = i4 + 1;
        this.d = i5;
        char c = cArr[i4];
        if (c == '\n') {
            this.f++;
            this.f2030g = i5;
        } else if (c != '\"' && c != '\'' && c != '/' && c != '\\') {
            if (c == 'b') {
                return '\b';
            }
            if (c == 'f') {
                return '\f';
            }
            if (c == 'n') {
                return '\n';
            }
            if (c == 'r') {
                return '\r';
            }
            if (c == 't') {
                return '\t';
            }
            if (c != 'u') {
                y0("Invalid escape sequence");
                throw null;
            }
            if (i5 + 4 > this.e && !O(4)) {
                y0("Unterminated escape sequence");
                throw null;
            }
            char c2 = 0;
            int i6 = this.d;
            int i7 = i6 + 4;
            while (i6 < i7) {
                char c3 = this.c[i6];
                char c4 = (char) (c2 << 4);
                if (c3 < '0' || c3 > '9') {
                    if (c3 >= 'a' && c3 <= 'f') {
                        i2 = c3 - 'a';
                    } else {
                        if (c3 < 'A' || c3 > 'F') {
                            throw new NumberFormatException("\\u" + new String(this.c, this.d, 4));
                        }
                        i2 = c3 - 'A';
                    }
                    i3 = i2 + 10;
                } else {
                    i3 = c3 - '0';
                }
                c2 = (char) (c4 + i3);
                i6++;
            }
            this.d += 4;
            return c2;
        }
        return c;
    }

    private void t0(char c) throws d {
        char[] cArr = this.c;
        while (true) {
            int i2 = this.d;
            int i3 = this.e;
            while (true) {
                if (i2 >= i3) {
                    this.d = i2;
                    if (O(1)) {
                        break;
                    }
                    y0("Unterminated string");
                    throw null;
                }
                int i4 = i2 + 1;
                char c2 = cArr[i2];
                if (c2 == c) {
                    this.d = i4;
                    return;
                }
                if (c2 == '\\') {
                    this.d = i4;
                    r0();
                    break;
                } else {
                    if (c2 == '\n') {
                        this.f++;
                        this.f2030g = i4;
                    }
                    i2 = i4;
                }
            }
        }
    }

    private boolean u0(String str) {
        int length = str.length();
        while (true) {
            if (this.d + length > this.e && !O(length)) {
                return false;
            }
            char[] cArr = this.c;
            int i2 = this.d;
            if (cArr[i2] != '\n') {
                for (int i3 = 0; i3 < length; i3++) {
                    if (this.c[this.d + i3] == str.charAt(i3)) {
                    }
                }
                return true;
            }
            this.f++;
            this.f2030g = i2 + 1;
            this.d++;
        }
    }

    private void v0() {
        char c;
        do {
            if (this.d >= this.e && !O(1)) {
                return;
            }
            char[] cArr = this.c;
            int i2 = this.d;
            int i3 = i2 + 1;
            this.d = i3;
            c = cArr[i2];
            if (c == '\n') {
                this.f++;
                this.f2030g = i3;
                return;
            }
        } while (c != '\r');
    }

    private void w0() throws d {
        do {
            int i2 = 0;
            while (true) {
                int i3 = this.d;
                if (i3 + i2 < this.e) {
                    char c = this.c[i3 + i2];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i2++;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        f();
                    }
                    this.d += i2;
                    return;
                }
                this.d = i3 + i2;
            }
        } while (O(1));
    }

    private IOException y0(String str) throws d {
        throw new d(str + c0());
    }

    public void F() throws IOException {
        int iL = this.f2031h;
        if (iL == 0) {
            iL = l();
        }
        if (iL != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + n0() + c0());
        }
        int i2 = this.f2036m - 1;
        this.f2036m = i2;
        this.f2037n[i2] = null;
        int[] iArr = this.f2038o;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.f2031h = 0;
    }

    public String Q() {
        return T(false);
    }

    public String Y() {
        return T(true);
    }

    public boolean Z() throws IOException {
        int iL = this.f2031h;
        if (iL == 0) {
            iL = l();
        }
        return (iL == 2 || iL == 4 || iL == 17) ? false : true;
    }

    public final boolean a0() {
        return this.b;
    }

    public void b() {
        int iL = this.f2031h;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 3) {
            q0(1);
            this.f2038o[this.f2036m - 1] = 0;
            this.f2031h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + n0() + c0());
        }
    }

    public void c() throws IOException {
        int iL = this.f2031h;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 1) {
            q0(3);
            this.f2031h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + n0() + c0());
        }
    }

    String c0() {
        return " at line " + (this.f + 1) + " column " + ((this.d - this.f2030g) + 1) + " path " + Q();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f2031h = 0;
        this.f2035l[0] = 8;
        this.f2036m = 1;
        this.a.close();
    }

    public boolean d0() throws IOException {
        int iL = this.f2031h;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 5) {
            this.f2031h = 0;
            int[] iArr = this.f2038o;
            int i2 = this.f2036m - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (iL == 6) {
            this.f2031h = 0;
            int[] iArr2 = this.f2038o;
            int i3 = this.f2036m - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + n0() + c0());
    }

    public double e0() throws IOException {
        String strK0;
        int iL = this.f2031h;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 15) {
            this.f2031h = 0;
            int[] iArr = this.f2038o;
            int i2 = this.f2036m - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f2032i;
        }
        if (iL == 16) {
            this.f2034k = new String(this.c, this.d, this.f2033j);
            this.d += this.f2033j;
        } else {
            if (iL == 8 || iL == 9) {
                strK0 = k0(iL == 8 ? '\'' : '\"');
            } else if (iL == 10) {
                strK0 = m0();
            } else if (iL != 11) {
                throw new IllegalStateException("Expected a double but was " + n0() + c0());
            }
            this.f2034k = strK0;
        }
        this.f2031h = 11;
        double d = Double.parseDouble(this.f2034k);
        if (!this.b && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new d("JSON forbids NaN and infinities: " + d + c0());
        }
        this.f2034k = null;
        this.f2031h = 0;
        int[] iArr2 = this.f2038o;
        int i3 = this.f2036m - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return d;
    }

    public int f0() throws IOException {
        String strK0;
        int iL = this.f2031h;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 15) {
            long j2 = this.f2032i;
            int i2 = (int) j2;
            if (j2 == i2) {
                this.f2031h = 0;
                int[] iArr = this.f2038o;
                int i3 = this.f2036m - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + this.f2032i + c0());
        }
        if (iL == 16) {
            this.f2034k = new String(this.c, this.d, this.f2033j);
            this.d += this.f2033j;
        } else {
            if (iL != 8 && iL != 9 && iL != 10) {
                throw new IllegalStateException("Expected an int but was " + n0() + c0());
            }
            if (iL == 10) {
                strK0 = m0();
            } else {
                strK0 = k0(iL == 8 ? '\'' : '\"');
            }
            this.f2034k = strK0;
            try {
                int i4 = Integer.parseInt(this.f2034k);
                this.f2031h = 0;
                int[] iArr2 = this.f2038o;
                int i5 = this.f2036m - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return i4;
            } catch (NumberFormatException unused) {
            }
        }
        this.f2031h = 11;
        double d = Double.parseDouble(this.f2034k);
        int i6 = (int) d;
        if (i6 != d) {
            throw new NumberFormatException("Expected an int but was " + this.f2034k + c0());
        }
        this.f2034k = null;
        this.f2031h = 0;
        int[] iArr3 = this.f2038o;
        int i7 = this.f2036m - 1;
        iArr3[i7] = iArr3[i7] + 1;
        return i6;
    }

    public long g0() throws IOException {
        String strK0;
        int iL = this.f2031h;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 15) {
            this.f2031h = 0;
            int[] iArr = this.f2038o;
            int i2 = this.f2036m - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f2032i;
        }
        if (iL == 16) {
            this.f2034k = new String(this.c, this.d, this.f2033j);
            this.d += this.f2033j;
        } else {
            if (iL != 8 && iL != 9 && iL != 10) {
                throw new IllegalStateException("Expected a long but was " + n0() + c0());
            }
            if (iL == 10) {
                strK0 = m0();
            } else {
                strK0 = k0(iL == 8 ? '\'' : '\"');
            }
            this.f2034k = strK0;
            try {
                long j2 = Long.parseLong(this.f2034k);
                this.f2031h = 0;
                int[] iArr2 = this.f2038o;
                int i3 = this.f2036m - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return j2;
            } catch (NumberFormatException unused) {
            }
        }
        this.f2031h = 11;
        double d = Double.parseDouble(this.f2034k);
        long j3 = (long) d;
        if (j3 != d) {
            throw new NumberFormatException("Expected a long but was " + this.f2034k + c0());
        }
        this.f2034k = null;
        this.f2031h = 0;
        int[] iArr3 = this.f2038o;
        int i4 = this.f2036m - 1;
        iArr3[i4] = iArr3[i4] + 1;
        return j3;
    }

    public String h0() throws IOException {
        char c;
        String strK0;
        int iL = this.f2031h;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 14) {
            strK0 = m0();
        } else {
            if (iL == 12) {
                c = '\'';
            } else {
                if (iL != 13) {
                    throw new IllegalStateException("Expected a name but was " + n0() + c0());
                }
                c = '\"';
            }
            strK0 = k0(c);
        }
        this.f2031h = 0;
        this.f2037n[this.f2036m - 1] = strK0;
        return strK0;
    }

    public void j0() {
        int iL = this.f2031h;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 7) {
            this.f2031h = 0;
            int[] iArr = this.f2038o;
            int i2 = this.f2036m - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + n0() + c0());
    }

    /* JADX WARN: Code duplicated, block: B:100:0x013a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x013c  */
    /* JADX WARN: Code duplicated, block: B:103:0x0140  */
    /* JADX WARN: Code duplicated, block: B:105:0x014f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0153  */
    /* JADX WARN: Code duplicated, block: B:108:0x0157 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x015a  */
    /* JADX WARN: Code duplicated, block: B:112:0x015e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0165  */
    int l() throws IOException {
        int iI0;
        int i2;
        int iI1;
        int[] iArr = this.f2035l;
        int i3 = this.f2036m;
        int i4 = iArr[i3 - 1];
        if (i4 == 1) {
            iArr[i3 - 1] = 2;
        } else {
            if (i4 != 2) {
                if (i4 == 3 || i4 == 5) {
                    iArr[i3 - 1] = 4;
                    if (i4 != 5 || (iI1 = i0(true)) == 44) {
                        iI0 = i0(true);
                        if (iI0 != 34) {
                            i2 = 13;
                        } else if (iI0 != 39) {
                            f();
                            i2 = 12;
                        } else if (iI0 != 125) {
                            f();
                            this.d--;
                            if (b0((char) iI0)) {
                                y0("Expected name");
                                throw null;
                            }
                            i2 = 14;
                        } else {
                            if (i4 == 5) {
                                y0("Expected name");
                                throw null;
                            }
                            i2 = 2;
                        }
                    } else {
                        if (iI1 == 59) {
                            f();
                            iI0 = i0(true);
                            if (iI0 != 34) {
                                i2 = 13;
                            } else if (iI0 != 39) {
                                f();
                                i2 = 12;
                            } else if (iI0 != 125) {
                                f();
                                this.d--;
                                if (b0((char) iI0)) {
                                    y0("Expected name");
                                    throw null;
                                }
                                i2 = 14;
                            } else if (i4 == 5) {
                                y0("Expected name");
                                throw null;
                            }
                        } else if (iI1 != 125) {
                            y0("Unterminated object");
                            throw null;
                        }
                        i2 = 2;
                    }
                } else if (i4 == 4) {
                    iArr[i3 - 1] = 5;
                    int iI2 = i0(true);
                    if (iI2 != 58) {
                        if (iI2 != 61) {
                            y0("Expected ':'");
                            throw null;
                        }
                        f();
                        if (this.d < this.e || O(1)) {
                            char[] cArr = this.c;
                            int i5 = this.d;
                            if (cArr[i5] == '>') {
                                this.d = i5 + 1;
                            }
                        }
                    }
                } else if (i4 == 6) {
                    if (this.b) {
                        j();
                    }
                    this.f2035l[this.f2036m - 1] = 7;
                } else if (i4 == 7) {
                    if (i0(false) == -1) {
                        i2 = 17;
                    } else {
                        f();
                        this.d--;
                    }
                } else if (i4 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                this.f2031h = i2;
                return i2;
            }
            int iI3 = i0(true);
            if (iI3 != 44) {
                if (iI3 != 59) {
                    if (iI3 == 93) {
                        this.f2031h = 4;
                        return 4;
                    }
                    y0("Unterminated array");
                    throw null;
                }
                f();
            }
        }
        int iI4 = i0(true);
        if (iI4 != 34) {
            if (iI4 == 39) {
                f();
                this.f2031h = 8;
                return 8;
            }
            if (iI4 != 44 && iI4 != 59) {
                if (iI4 == 91) {
                    this.f2031h = 3;
                    return 3;
                }
                if (iI4 != 93) {
                    if (iI4 == 123) {
                        this.f2031h = 1;
                        return 1;
                    }
                    this.d--;
                    int iO0 = o0();
                    if (iO0 != 0) {
                        return iO0;
                    }
                    int iP0 = p0();
                    if (iP0 != 0) {
                        return iP0;
                    }
                    if (!b0(this.c[this.d])) {
                        y0("Expected value");
                        throw null;
                    }
                    f();
                    i2 = 10;
                } else if (i4 == 1) {
                    this.f2031h = 4;
                    return 4;
                }
            }
            if (i4 != 1 && i4 != 2) {
                y0("Unexpected value");
                throw null;
            }
            f();
            this.d--;
            this.f2031h = 7;
            return 7;
        }
        i2 = 9;
        this.f2031h = i2;
        return i2;
    }

    public String l0() throws IOException {
        String str;
        char c;
        int iL = this.f2031h;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 10) {
            str = m0();
        } else {
            if (iL == 8) {
                c = '\'';
            } else if (iL == 9) {
                c = '\"';
            } else if (iL == 11) {
                str = this.f2034k;
                this.f2034k = null;
            } else if (iL == 15) {
                str = Long.toString(this.f2032i);
            } else {
                if (iL != 16) {
                    throw new IllegalStateException("Expected a string but was " + n0() + c0());
                }
                str = new String(this.c, this.d, this.f2033j);
                this.d += this.f2033j;
            }
            str = k0(c);
        }
        this.f2031h = 0;
        int[] iArr = this.f2038o;
        int i2 = this.f2036m - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public b n0() throws IOException {
        int iL = this.f2031h;
        if (iL == 0) {
            iL = l();
        }
        switch (iL) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final void s0(boolean z) {
        this.b = z;
    }

    public String toString() {
        return getClass().getSimpleName() + c0();
    }

    public void u() {
        int iL = this.f2031h;
        if (iL == 0) {
            iL = l();
        }
        if (iL != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + n0() + c0());
        }
        int i2 = this.f2036m - 1;
        this.f2036m = i2;
        int[] iArr = this.f2038o;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.f2031h = 0;
    }

    public void x0() throws IOException {
        char c;
        int i2 = 0;
        do {
            int iL = this.f2031h;
            if (iL == 0) {
                iL = l();
            }
            if (iL == 3) {
                q0(1);
            } else {
                if (iL == 1) {
                    q0(3);
                } else if (iL == 4 || iL == 2) {
                    this.f2036m--;
                    i2--;
                } else if (iL == 14 || iL == 10) {
                    w0();
                } else {
                    if (iL == 8 || iL == 12) {
                        c = '\'';
                    } else if (iL == 9 || iL == 13) {
                        c = '\"';
                    } else if (iL == 16) {
                        this.d += this.f2033j;
                    }
                    t0(c);
                }
                this.f2031h = 0;
            }
            i2++;
            this.f2031h = 0;
        } while (i2 != 0);
        int[] iArr = this.f2038o;
        int i3 = this.f2036m;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.f2037n[i3 - 1] = "null";
    }
}
