package n;

import com.appff.haptic.base.Utils;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class b implements d, c, Cloneable, ByteChannel {
    public s a;
    private long b;

    public static final class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(b.this.r0(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            if (b.this.r0() > 0) {
                return b.this.readByte() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) {
            l.y.c.i.e(bArr, "sink");
            return b.this.read(bArr, i2, i3);
        }

        public String toString() {
            return b.this + ".inputStream()";
        }
    }

    /* JADX INFO: renamed from: n.b$b, reason: collision with other inner class name */
    public static final class C0280b extends OutputStream {
        C0280b() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return b.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i2) {
            b.this.z0(i2);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i2, int i3) {
            l.y.c.i.e(bArr, "data");
            b.this.x0(bArr, i2, i3);
        }
    }

    @Override // n.c
    public /* bridge */ /* synthetic */ c A(int i2) {
        z0(i2);
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code duplicated, block: B:15:0x002f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    /* JADX WARN: Code duplicated, block: B:34:0x006a  */
    /* JADX WARN: Code duplicated, block: B:35:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0077  */
    /* JADX WARN: Code duplicated, block: B:39:0x0080  */
    /* JADX WARN: Code duplicated, block: B:41:0x0087  */
    /* JADX WARN: Code duplicated, block: B:42:0x008a  */
    /* JADX WARN: Code duplicated, block: B:43:0x008d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0096  */
    /* JADX WARN: Code duplicated, block: B:46:0x0099  */
    /* JADX WARN: Code duplicated, block: B:47:0x009c  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:55:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f7 A[LOOP:0: B:69:0x00f3->B:71:0x00f7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x0109  */
    public b A0(long j2) {
        byte[] bArr;
        int i2;
        if (j2 == 0) {
            z0(48);
        } else {
            boolean z = false;
            int i3 = 1;
            if (j2 < 0) {
                j2 = -j2;
                if (j2 < 0) {
                    I0("-9223372036854775808");
                } else {
                    z = true;
                    if (j2 < 100000000) {
                        if (j2 < 10000) {
                            if (j2 < 100) {
                                if (j2 >= 10) {
                                    i3 = 2;
                                }
                            } else if (j2 < 1000) {
                                i3 = 3;
                            } else {
                                i3 = 4;
                            }
                        } else if (j2 < 1000000) {
                            if (j2 < 100000) {
                                i3 = 5;
                            } else {
                                i3 = 6;
                            }
                        } else if (j2 < 10000000) {
                            i3 = 7;
                        } else {
                            i3 = 8;
                        }
                    } else if (j2 < 1000000000000L) {
                        if (j2 < 10000000000L) {
                            if (j2 < 1000000000) {
                                i3 = 9;
                            } else {
                                i3 = 10;
                            }
                        } else if (j2 < 100000000000L) {
                            i3 = 11;
                        } else {
                            i3 = 12;
                        }
                    } else if (j2 < 1000000000000000L) {
                        if (j2 < 10000000000000L) {
                            i3 = 13;
                        } else if (j2 < 100000000000000L) {
                            i3 = 14;
                        } else {
                            i3 = 15;
                        }
                    } else if (j2 < 100000000000000000L) {
                        if (j2 < 10000000000000000L) {
                            i3 = 16;
                        } else {
                            i3 = 17;
                        }
                    } else if (j2 < 1000000000000000000L) {
                        i3 = 18;
                    } else {
                        i3 = 19;
                    }
                    if (z) {
                        i3++;
                    }
                    s sVarU0 = u0(i3);
                    bArr = sVarU0.a;
                    i2 = sVarU0.c + i3;
                    while (j2 != 0) {
                        long j3 = 10;
                        i2--;
                        bArr[i2] = n.d0.a.a()[(int) (j2 % j3)];
                        j2 /= j3;
                    }
                    if (z) {
                        bArr[i2 - 1] = (byte) 45;
                    }
                    sVarU0.c += i3;
                    q0(r0() + ((long) i3));
                }
            } else {
                if (j2 < 100000000) {
                    if (j2 < 10000) {
                        if (j2 < 100) {
                            if (j2 >= 10) {
                                i3 = 2;
                            }
                        } else if (j2 < 1000) {
                            i3 = 3;
                        } else {
                            i3 = 4;
                        }
                    } else if (j2 < 1000000) {
                        if (j2 < 100000) {
                            i3 = 5;
                        } else {
                            i3 = 6;
                        }
                    } else if (j2 < 10000000) {
                        i3 = 7;
                    } else {
                        i3 = 8;
                    }
                } else if (j2 < 1000000000000L) {
                    if (j2 < 10000000000L) {
                        if (j2 < 1000000000) {
                            i3 = 9;
                        } else {
                            i3 = 10;
                        }
                    } else if (j2 < 100000000000L) {
                        i3 = 11;
                    } else {
                        i3 = 12;
                    }
                } else if (j2 < 1000000000000000L) {
                    if (j2 < 10000000000000L) {
                        i3 = 13;
                    } else if (j2 < 100000000000000L) {
                        i3 = 14;
                    } else {
                        i3 = 15;
                    }
                } else if (j2 < 100000000000000000L) {
                    if (j2 < 10000000000000000L) {
                        i3 = 16;
                    } else {
                        i3 = 17;
                    }
                } else if (j2 < 1000000000000000000L) {
                    i3 = 18;
                } else {
                    i3 = 19;
                }
                if (z) {
                    i3++;
                }
                s sVarU1 = u0(i3);
                bArr = sVarU1.a;
                i2 = sVarU1.c + i3;
                while (j2 != 0) {
                    long j4 = 10;
                    i2--;
                    bArr[i2] = n.d0.a.a()[(int) (j2 % j4)];
                    j2 /= j4;
                }
                if (z) {
                    bArr[i2 - 1] = (byte) 45;
                }
                sVarU1.c += i3;
                q0(r0() + ((long) i3));
            }
        }
        return this;
    }

    @Override // n.d
    public byte[] B(long j2) throws EOFException {
        if (!(j2 >= 0 && j2 <= 2147483647L)) {
            throw new IllegalArgumentException(l.y.c.i.k("byteCount: ", Long.valueOf(j2)).toString());
        }
        if (r0() < j2) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j2];
        k0(bArr);
        return bArr;
    }

    public b B0(long j2) {
        if (j2 == 0) {
            z0(48);
        } else {
            long j3 = (j2 >>> 1) | j2;
            long j4 = j3 | (j3 >>> 2);
            long j5 = j4 | (j4 >>> 4);
            long j6 = j5 | (j5 >>> 8);
            long j7 = j6 | (j6 >>> 16);
            long j8 = j7 | (j7 >>> 32);
            long j9 = j8 - ((j8 >>> 1) & 6148914691236517205L);
            long j10 = ((j9 >>> 2) & 3689348814741910323L) + (j9 & 3689348814741910323L);
            long j11 = ((j10 >>> 4) + j10) & 1085102592571150095L;
            long j12 = j11 + (j11 >>> 8);
            long j13 = j12 + (j12 >>> 16);
            int i2 = (int) ((((j13 & 63) + ((j13 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
            s sVarU0 = u0(i2);
            byte[] bArr = sVarU0.a;
            int i3 = sVarU0.c;
            for (int i4 = (i3 + i2) - 1; i4 >= i3; i4--) {
                bArr[i4] = n.d0.a.a()[(int) (15 & j2)];
                j2 >>>= 4;
            }
            sVarU0.c += i2;
            q0(r0() + ((long) i2));
        }
        return this;
    }

    public b C0(int i2) {
        s sVarU0 = u0(4);
        byte[] bArr = sVarU0.a;
        int i3 = sVarU0.c;
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >>> 24) & Utils.MAX_STRENGTH_VALUE);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i2 >>> 16) & Utils.MAX_STRENGTH_VALUE);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((i2 >>> 8) & Utils.MAX_STRENGTH_VALUE);
        bArr[i6] = (byte) (i2 & Utils.MAX_STRENGTH_VALUE);
        sVarU0.c = i6 + 1;
        q0(r0() + 4);
        return this;
    }

    public b D0(int i2) {
        C0(c0.d(i2));
        return this;
    }

    @Override // n.c
    public /* bridge */ /* synthetic */ c E(byte[] bArr) {
        w0(bArr);
        return this;
    }

    public b E0(long j2) {
        s sVarU0 = u0(8);
        byte[] bArr = sVarU0.a;
        int i2 = sVarU0.c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((j2 >>> 56) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((j2 >>> 48) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((j2 >>> 40) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((j2 >>> 32) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((j2 >>> 24) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((j2 >>> 16) & 255);
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((j2 >>> 8) & 255);
        bArr[i9] = (byte) (j2 & 255);
        sVarU0.c = i9 + 1;
        q0(r0() + 8);
        return this;
    }

    public b F0(long j2) {
        E0(c0.e(j2));
        return this;
    }

    @Override // n.c
    public /* bridge */ /* synthetic */ c G(e eVar) {
        v0(eVar);
        return this;
    }

    public b G0(int i2) {
        s sVarU0 = u0(2);
        byte[] bArr = sVarU0.a;
        int i3 = sVarU0.c;
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >>> 8) & Utils.MAX_STRENGTH_VALUE);
        bArr[i4] = (byte) (i2 & Utils.MAX_STRENGTH_VALUE);
        sVarU0.c = i4 + 1;
        q0(r0() + 2);
        return this;
    }

    public b H0(String str, int i2, int i3, Charset charset) {
        l.y.c.i.e(str, "string");
        l.y.c.i.e(charset, "charset");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(l.y.c.i.k("beginIndex < 0: ", Integer.valueOf(i2)).toString());
        }
        if (!(i3 >= i2)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i3 + " < " + i2).toString());
        }
        if (!(i3 <= str.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i3 + " > " + str.length()).toString());
        }
        if (l.y.c.i.a(charset, l.d0.d.b)) {
            J0(str, i2, i3);
            return this;
        }
        String strSubstring = str.substring(i2, i3);
        l.y.c.i.d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        if (strSubstring == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = strSubstring.getBytes(charset);
        l.y.c.i.d(bytes, "(this as java.lang.String).getBytes(charset)");
        x0(bytes, 0, bytes.length);
        return this;
    }

    @Override // n.x
    public long I(b bVar, long j2) {
        l.y.c.i.e(bVar, "sink");
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(l.y.c.i.k("byteCount < 0: ", Long.valueOf(j2)).toString());
        }
        if (r0() == 0) {
            return -1L;
        }
        if (j2 > r0()) {
            j2 = r0();
        }
        bVar.h(this, j2);
        return j2;
    }

    public b I0(String str) {
        l.y.c.i.e(str, "string");
        J0(str, 0, str.length());
        return this;
    }

    @Override // n.d
    public long J() {
        return c0.e(l0());
    }

    public b J0(String str, int i2, int i3) {
        char cCharAt;
        long jR0;
        long j2;
        l.y.c.i.e(str, "string");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(l.y.c.i.k("beginIndex < 0: ", Integer.valueOf(i2)).toString());
        }
        if (!(i3 >= i2)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i3 + " < " + i2).toString());
        }
        if (!(i3 <= str.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i3 + " > " + str.length()).toString());
        }
        while (i2 < i3) {
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < 128) {
                s sVarU0 = u0(1);
                byte[] bArr = sVarU0.a;
                int i4 = sVarU0.c - i2;
                int iMin = Math.min(i3, 8192 - i4);
                int i5 = i2 + 1;
                bArr[i2 + i4] = (byte) cCharAt2;
                while (true) {
                    i2 = i5;
                    if (i2 >= iMin || (cCharAt = str.charAt(i2)) >= 128) {
                        break;
                    }
                    i5 = i2 + 1;
                    bArr[i2 + i4] = (byte) cCharAt;
                }
                int i6 = sVarU0.c;
                int i7 = (i4 + i2) - i6;
                sVarU0.c = i6 + i7;
                q0(r0() + ((long) i7));
            } else {
                if (cCharAt2 < 2048) {
                    s sVarU1 = u0(2);
                    byte[] bArr2 = sVarU1.a;
                    int i8 = sVarU1.c;
                    bArr2[i8] = (byte) ((cCharAt2 >> 6) | j.d.a.e.a.a.i.g.STATUS_RUNNING);
                    bArr2[i8 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    sVarU1.c = i8 + 2;
                    jR0 = r0();
                    j2 = 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    s sVarU2 = u0(3);
                    byte[] bArr3 = sVarU2.a;
                    int i9 = sVarU2.c;
                    bArr3[i9] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i9 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i9 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    sVarU2.c = i9 + 3;
                    jR0 = r0();
                    j2 = 3;
                } else {
                    int i10 = i2 + 1;
                    char cCharAt3 = i10 < i3 ? str.charAt(i10) : (char) 0;
                    if (cCharAt2 <= 56319) {
                        if (56320 <= cCharAt3 && cCharAt3 <= 57343) {
                            int i11 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                            s sVarU3 = u0(4);
                            byte[] bArr4 = sVarU3.a;
                            int i12 = sVarU3.c;
                            bArr4[i12] = (byte) ((i11 >> 18) | 240);
                            bArr4[i12 + 1] = (byte) (((i11 >> 12) & 63) | 128);
                            bArr4[i12 + 2] = (byte) (((i11 >> 6) & 63) | 128);
                            bArr4[i12 + 3] = (byte) ((i11 & 63) | 128);
                            sVarU3.c = i12 + 4;
                            q0(r0() + 4);
                            i2 += 2;
                        }
                    }
                    z0(63);
                    i2 = i10;
                }
                q0(jR0 + j2);
                i2++;
            }
        }
        return this;
    }

    @Override // n.d
    public String K(long j2) throws EOFException {
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(l.y.c.i.k("limit < 0: ", Long.valueOf(j2)).toString());
        }
        long j3 = j2 != Long.MAX_VALUE ? j2 + 1 : Long.MAX_VALUE;
        byte b = (byte) 10;
        long jE0 = e0(b, 0L, j3);
        if (jE0 != -1) {
            return n.d0.a.b(this, jE0);
        }
        if (j3 < r0() && d0(j3 - 1) == ((byte) 13) && d0(j3) == b) {
            return n.d0.a.b(this, j3);
        }
        b bVar = new b();
        c0(bVar, 0L, Math.min(32, r0()));
        throw new EOFException("\\n not found: limit=" + Math.min(r0(), j2) + " content=" + bVar.j0().j() + (char) 8230);
    }

    public b K0(int i2) {
        long jR0;
        long j2;
        if (i2 < 128) {
            z0(i2);
        } else {
            if (i2 < 2048) {
                s sVarU0 = u0(2);
                byte[] bArr = sVarU0.a;
                int i3 = sVarU0.c;
                bArr[i3] = (byte) ((i2 >> 6) | j.d.a.e.a.a.i.g.STATUS_RUNNING);
                bArr[i3 + 1] = (byte) ((i2 & 63) | 128);
                sVarU0.c = i3 + 2;
                jR0 = r0();
                j2 = 2;
            } else {
                boolean z = false;
                if (55296 <= i2 && i2 <= 57343) {
                    z = true;
                }
                if (z) {
                    z0(63);
                } else if (i2 < 65536) {
                    s sVarU1 = u0(3);
                    byte[] bArr2 = sVarU1.a;
                    int i4 = sVarU1.c;
                    bArr2[i4] = (byte) ((i2 >> 12) | 224);
                    bArr2[i4 + 1] = (byte) (((i2 >> 6) & 63) | 128);
                    bArr2[i4 + 2] = (byte) ((i2 & 63) | 128);
                    sVarU1.c = i4 + 3;
                    jR0 = r0();
                    j2 = 3;
                } else {
                    if (i2 > 1114111) {
                        throw new IllegalArgumentException(l.y.c.i.k("Unexpected code point: 0x", c0.h(i2)));
                    }
                    s sVarU2 = u0(4);
                    byte[] bArr3 = sVarU2.a;
                    int i5 = sVarU2.c;
                    bArr3[i5] = (byte) ((i2 >> 18) | 240);
                    bArr3[i5 + 1] = (byte) (((i2 >> 12) & 63) | 128);
                    bArr3[i5 + 2] = (byte) (((i2 >> 6) & 63) | 128);
                    bArr3[i5 + 3] = (byte) ((i2 & 63) | 128);
                    sVarU2.c = i5 + 4;
                    jR0 = r0();
                    j2 = 4;
                }
            }
            q0(jR0 + j2);
        }
        return this;
    }

    @Override // n.d
    public long L(v vVar) {
        l.y.c.i.e(vVar, "sink");
        long jR0 = r0();
        if (jR0 > 0) {
            vVar.h(this, jR0);
        }
        return jR0;
    }

    @Override // n.d
    public void P(long j2) throws EOFException {
        if (this.b < j2) {
            throw new EOFException();
        }
    }

    @Override // n.c
    public /* bridge */ /* synthetic */ c R(String str) {
        I0(str);
        return this;
    }

    @Override // n.c
    public /* bridge */ /* synthetic */ c S(long j2) {
        A0(j2);
        return this;
    }

    @Override // n.d
    public long U() throws EOFException {
        int i2;
        if (r0() == 0) {
            throw new EOFException();
        }
        int i3 = 0;
        long j2 = 0;
        boolean z = false;
        do {
            s sVar = this.a;
            l.y.c.i.c(sVar);
            byte[] bArr = sVar.a;
            int i4 = sVar.b;
            int i5 = sVar.c;
            while (i4 < i5) {
                byte b = bArr[i4];
                byte b2 = (byte) 48;
                if (b < b2 || b > ((byte) 57)) {
                    byte b3 = (byte) 97;
                    if ((b < b3 || b > ((byte) 102)) && (b < (b3 = (byte) 65) || b > ((byte) 70))) {
                        if (i3 == 0) {
                            throw new NumberFormatException(l.y.c.i.k("Expected leading [0-9a-fA-F] character but was 0x", c0.g(b)));
                        }
                        z = true;
                        break;
                    }
                    i2 = (b - b3) + 10;
                } else {
                    i2 = b - b2;
                }
                if (((-1152921504606846976L) & j2) != 0) {
                    b bVar = new b();
                    bVar.B0(j2);
                    bVar.z0(b);
                    throw new NumberFormatException(l.y.c.i.k("Number too large: ", bVar.o0()));
                }
                j2 = (j2 << 4) | ((long) i2);
                i4++;
                i3++;
            }
            if (i4 == i5) {
                this.a = sVar.b();
                t.b(sVar);
            } else {
                sVar.b = i4;
            }
            if (z) {
                break;
            }
        } while (this.a != null);
        q0(r0() - ((long) i3));
        return j2;
    }

    @Override // n.d
    public String V(Charset charset) {
        l.y.c.i.e(charset, "charset");
        return n0(this.b, charset);
    }

    @Override // n.d
    public InputStream W() {
        return new a();
    }

    @Override // n.d
    public int X(o oVar) throws EOFException {
        l.y.c.i.e(oVar, "options");
        int iD = n.d0.a.d(this, oVar, false, 2, null);
        if (iD == -1) {
            return -1;
        }
        skip(oVar.f()[iD].t());
        return iD;
    }

    public final void Y() throws EOFException {
        skip(r0());
    }

    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public b clone() {
        return b0();
    }

    @Override // n.d, n.c
    public b a() {
        return this;
    }

    public final long a0() {
        long jR0 = r0();
        if (jR0 == 0) {
            return 0L;
        }
        s sVar = this.a;
        l.y.c.i.c(sVar);
        s sVar2 = sVar.f2349g;
        l.y.c.i.c(sVar2);
        int i2 = sVar2.c;
        if (i2 < 8192 && sVar2.e) {
            jR0 -= (long) (i2 - sVar2.b);
        }
        return jR0;
    }

    public final b b0() {
        b bVar = new b();
        if (r0() != 0) {
            s sVar = this.a;
            l.y.c.i.c(sVar);
            s sVarD = sVar.d();
            bVar.a = sVarD;
            sVarD.f2349g = sVarD;
            sVarD.f = sVarD;
            for (s sVar2 = sVar.f; sVar2 != sVar; sVar2 = sVar2.f) {
                s sVar3 = sVarD.f2349g;
                l.y.c.i.c(sVar3);
                l.y.c.i.c(sVar2);
                sVar3.c(sVar2.d());
            }
            bVar.q0(r0());
        }
        return bVar;
    }

    public final b c0(b bVar, long j2, long j3) {
        l.y.c.i.e(bVar, "out");
        c0.b(r0(), j2, j3);
        if (j3 != 0) {
            bVar.q0(bVar.r0() + j3);
            s sVar = this.a;
            while (true) {
                l.y.c.i.c(sVar);
                int i2 = sVar.c;
                int i3 = sVar.b;
                if (j2 < i2 - i3) {
                    break;
                }
                j2 -= (long) (i2 - i3);
                sVar = sVar.f;
            }
            while (j3 > 0) {
                l.y.c.i.c(sVar);
                s sVarD = sVar.d();
                int i4 = sVarD.b + ((int) j2);
                sVarD.b = i4;
                sVarD.c = Math.min(i4 + ((int) j3), sVarD.c);
                s sVar2 = bVar.a;
                if (sVar2 == null) {
                    sVarD.f2349g = sVarD;
                    sVarD.f = sVarD;
                    bVar.a = sVarD;
                } else {
                    l.y.c.i.c(sVar2);
                    s sVar3 = sVar2.f2349g;
                    l.y.c.i.c(sVar3);
                    sVar3.c(sVarD);
                }
                j3 -= (long) (sVarD.c - sVarD.b);
                sVar = sVar.f;
                j2 = 0;
            }
        }
        return this;
    }

    @Override // n.x, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // n.x
    public y d() {
        return y.d;
    }

    public final byte d0(long j2) {
        c0.b(r0(), j2, 1L);
        s sVar = this.a;
        if (sVar == null) {
            s sVar2 = null;
            l.y.c.i.c(null);
            return sVar2.a[(int) ((((long) sVar2.b) + j2) - (-1))];
        }
        if (r0() - j2 < j2) {
            long jR0 = r0();
            while (jR0 > j2) {
                sVar = sVar.f2349g;
                l.y.c.i.c(sVar);
                jR0 -= (long) (sVar.c - sVar.b);
            }
            l.y.c.i.c(sVar);
            return sVar.a[(int) ((((long) sVar.b) + j2) - jR0)];
        }
        long j3 = 0;
        while (true) {
            long j4 = ((long) (sVar.c - sVar.b)) + j3;
            if (j4 > j2) {
                l.y.c.i.c(sVar);
                return sVar.a[(int) ((((long) sVar.b) + j2) - j3)];
            }
            sVar = sVar.f;
            l.y.c.i.c(sVar);
            j3 = j4;
        }
    }

    @Override // n.c
    public /* bridge */ /* synthetic */ c e(byte[] bArr, int i2, int i3) {
        x0(bArr, i2, i3);
        return this;
    }

    public long e0(byte b, long j2, long j3) {
        s sVar;
        int i2;
        long j4 = j2;
        long jR0 = j3;
        boolean z = false;
        long jR1 = 0;
        if (0 <= j4 && j4 <= jR0) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(("size=" + r0() + " fromIndex=" + j4 + " toIndex=" + jR0).toString());
        }
        if (jR0 > r0()) {
            jR0 = r0();
        }
        long j5 = jR0;
        if (j4 == j5 || (sVar = this.a) == null) {
            return -1L;
        }
        if (r0() - j4 < j4) {
            jR1 = r0();
            while (jR1 > j4) {
                sVar = sVar.f2349g;
                l.y.c.i.c(sVar);
                jR1 -= (long) (sVar.c - sVar.b);
            }
            if (sVar == null) {
                return -1L;
            }
            while (jR1 < j5) {
                byte[] bArr = sVar.a;
                int iMin = (int) Math.min(sVar.c, (((long) sVar.b) + j5) - jR1);
                i2 = (int) ((((long) sVar.b) + j4) - jR1);
                while (i2 < iMin) {
                    if (bArr[i2] != b) {
                        i2++;
                    }
                }
                jR1 += (long) (sVar.c - sVar.b);
                sVar = sVar.f;
                l.y.c.i.c(sVar);
                j4 = jR1;
            }
            return -1L;
        }
        while (true) {
            long j6 = ((long) (sVar.c - sVar.b)) + jR1;
            if (j6 > j4) {
                break;
            }
            sVar = sVar.f;
            l.y.c.i.c(sVar);
            jR1 = j6;
        }
        if (sVar == null) {
            return -1L;
        }
        while (jR1 < j5) {
            byte[] bArr2 = sVar.a;
            int iMin2 = (int) Math.min(sVar.c, (((long) sVar.b) + j5) - jR1);
            i2 = (int) ((((long) sVar.b) + j4) - jR1);
            while (i2 < iMin2) {
                if (bArr2[i2] != b) {
                    i2++;
                }
            }
            jR1 += (long) (sVar.c - sVar.b);
            sVar = sVar.f;
            l.y.c.i.c(sVar);
            j4 = jR1;
        }
        return -1L;
        return ((long) (i2 - sVar.b)) + jR1;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (r0() != bVar.r0()) {
                return false;
            }
            if (r0() != 0) {
                s sVar = this.a;
                l.y.c.i.c(sVar);
                s sVar2 = bVar.a;
                l.y.c.i.c(sVar2);
                int i2 = sVar.b;
                int i3 = sVar2.b;
                long j2 = 0;
                while (j2 < r0()) {
                    long jMin = Math.min(sVar.c - i2, sVar2.c - i3);
                    if (0 < jMin) {
                        long j3 = 0;
                        while (true) {
                            j3++;
                            int i4 = i2 + 1;
                            int i5 = i3 + 1;
                            if (sVar.a[i2] != sVar2.a[i3]) {
                                return false;
                            }
                            if (j3 >= jMin) {
                                i2 = i4;
                                i3 = i5;
                                break;
                            }
                            i2 = i4;
                            i3 = i5;
                        }
                    }
                    if (i2 == sVar.c) {
                        sVar = sVar.f;
                        l.y.c.i.c(sVar);
                        i2 = sVar.b;
                    }
                    if (i3 == sVar2.c) {
                        sVar2 = sVar2.f;
                        l.y.c.i.c(sVar2);
                        i3 = sVar2.b;
                    }
                    j2 += jMin;
                }
            }
        }
        return true;
    }

    public long f0(e eVar) {
        l.y.c.i.e(eVar, "targetBytes");
        return g0(eVar, 0L);
    }

    @Override // n.c, n.v, java.io.Flushable
    public void flush() {
    }

    public long g0(e eVar, long j2) {
        int i2;
        l.y.c.i.e(eVar, "targetBytes");
        long jR0 = 0;
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(l.y.c.i.k("fromIndex < 0: ", Long.valueOf(j2)).toString());
        }
        s sVar = this.a;
        if (sVar == null) {
            return -1L;
        }
        if (r0() - j2 < j2) {
            jR0 = r0();
            while (jR0 > j2) {
                sVar = sVar.f2349g;
                l.y.c.i.c(sVar);
                jR0 -= (long) (sVar.c - sVar.b);
            }
            if (sVar == null) {
                return -1L;
            }
            if (eVar.t() == 2) {
                byte bE = eVar.e(0);
                byte bE2 = eVar.e(1);
                while (jR0 < r0()) {
                    byte[] bArr = sVar.a;
                    i2 = (int) ((((long) sVar.b) + j2) - jR0);
                    int i3 = sVar.c;
                    while (i2 < i3) {
                        byte b = bArr[i2];
                        if (b != bE && b != bE2) {
                            i2++;
                        }
                    }
                    jR0 += (long) (sVar.c - sVar.b);
                    sVar = sVar.f;
                    l.y.c.i.c(sVar);
                    j2 = jR0;
                }
                return -1L;
            }
            byte[] bArrK = eVar.k();
            while (jR0 < r0()) {
                byte[] bArr2 = sVar.a;
                i2 = (int) ((((long) sVar.b) + j2) - jR0);
                int i4 = sVar.c;
                while (i2 < i4) {
                    byte b2 = bArr2[i2];
                    int length = bArrK.length;
                    int i5 = 0;
                    while (i5 < length) {
                        byte b3 = bArrK[i5];
                        i5++;
                        if (b2 == b3) {
                        }
                    }
                    i2++;
                }
                jR0 += (long) (sVar.c - sVar.b);
                sVar = sVar.f;
                l.y.c.i.c(sVar);
                j2 = jR0;
            }
            return -1L;
        }
        while (true) {
            long j3 = ((long) (sVar.c - sVar.b)) + jR0;
            if (j3 > j2) {
                break;
            }
            sVar = sVar.f;
            l.y.c.i.c(sVar);
            jR0 = j3;
        }
        if (sVar == null) {
            return -1L;
        }
        if (eVar.t() == 2) {
            byte bE3 = eVar.e(0);
            byte bE4 = eVar.e(1);
            while (jR0 < r0()) {
                byte[] bArr3 = sVar.a;
                i2 = (int) ((((long) sVar.b) + j2) - jR0);
                int i6 = sVar.c;
                while (i2 < i6) {
                    byte b4 = bArr3[i2];
                    if (b4 != bE3 && b4 != bE4) {
                        i2++;
                    }
                }
                jR0 += (long) (sVar.c - sVar.b);
                sVar = sVar.f;
                l.y.c.i.c(sVar);
                j2 = jR0;
            }
            return -1L;
        }
        byte[] bArrK2 = eVar.k();
        while (jR0 < r0()) {
            byte[] bArr4 = sVar.a;
            i2 = (int) ((((long) sVar.b) + j2) - jR0);
            int i7 = sVar.c;
            while (i2 < i7) {
                byte b5 = bArr4[i2];
                int length2 = bArrK2.length;
                int i8 = 0;
                while (i8 < length2) {
                    byte b6 = bArrK2[i8];
                    i8++;
                    if (b5 == b6) {
                    }
                }
                i2++;
            }
            jR0 += (long) (sVar.c - sVar.b);
            sVar = sVar.f;
            l.y.c.i.c(sVar);
            j2 = jR0;
        }
        return -1L;
        return ((long) (i2 - sVar.b)) + jR0;
    }

    @Override // n.v
    public void h(b bVar, long j2) {
        s sVar;
        l.y.c.i.e(bVar, "source");
        if (!(bVar != this)) {
            throw new IllegalArgumentException("source == this".toString());
        }
        c0.b(bVar.r0(), 0L, j2);
        while (j2 > 0) {
            s sVar2 = bVar.a;
            l.y.c.i.c(sVar2);
            int i2 = sVar2.c;
            s sVar3 = bVar.a;
            l.y.c.i.c(sVar3);
            if (j2 < i2 - sVar3.b) {
                s sVar4 = this.a;
                if (sVar4 != null) {
                    l.y.c.i.c(sVar4);
                    sVar = sVar4.f2349g;
                } else {
                    sVar = null;
                }
                if (sVar != null && sVar.e) {
                    if ((((long) sVar.c) + j2) - ((long) (sVar.d ? 0 : sVar.b)) <= 8192) {
                        s sVar5 = bVar.a;
                        l.y.c.i.c(sVar5);
                        sVar5.f(sVar, (int) j2);
                        bVar.q0(bVar.r0() - j2);
                        q0(r0() + j2);
                        return;
                    }
                }
                s sVar6 = bVar.a;
                l.y.c.i.c(sVar6);
                bVar.a = sVar6.e((int) j2);
            }
            s sVar7 = bVar.a;
            l.y.c.i.c(sVar7);
            long j3 = sVar7.c - sVar7.b;
            bVar.a = sVar7.b();
            s sVar8 = this.a;
            if (sVar8 == null) {
                this.a = sVar7;
                sVar7.f2349g = sVar7;
                sVar7.f = sVar7;
            } else {
                l.y.c.i.c(sVar8);
                s sVar9 = sVar8.f2349g;
                l.y.c.i.c(sVar9);
                sVar9.c(sVar7);
                sVar7.a();
            }
            bVar.q0(bVar.r0() - j3);
            q0(r0() + j3);
            j2 -= j3;
        }
    }

    public OutputStream h0() {
        return new C0280b();
    }

    public int hashCode() {
        s sVar = this.a;
        if (sVar == null) {
            return 0;
        }
        int i2 = 1;
        do {
            int i3 = sVar.c;
            for (int i4 = sVar.b; i4 < i3; i4++) {
                i2 = (i2 * 31) + sVar.a[i4];
            }
            sVar = sVar.f;
            l.y.c.i.c(sVar);
        } while (sVar != this.a);
        return i2;
    }

    @Override // n.d
    public String i(long j2) throws EOFException {
        return n0(j2, l.d0.d.b);
    }

    public byte[] i0() {
        return B(r0());
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public e j0() {
        return o(r0());
    }

    public void k0(byte[] bArr) throws EOFException {
        l.y.c.i.e(bArr, "sink");
        int i2 = 0;
        while (i2 < bArr.length) {
            int i3 = read(bArr, i2, bArr.length - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
    }

    public long l0() throws EOFException {
        if (r0() < 8) {
            throw new EOFException();
        }
        s sVar = this.a;
        l.y.c.i.c(sVar);
        int i2 = sVar.b;
        int i3 = sVar.c;
        if (i3 - i2 < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = sVar.a;
        int i4 = i2 + 1;
        long j2 = (((long) bArr[i2]) & 255) << 56;
        int i5 = i4 + 1;
        long j3 = j2 | ((((long) bArr[i4]) & 255) << 48);
        int i6 = i5 + 1;
        long j4 = j3 | ((((long) bArr[i5]) & 255) << 40);
        int i7 = i6 + 1;
        long j5 = ((((long) bArr[i6]) & 255) << 32) | j4;
        int i8 = i7 + 1;
        long j6 = j5 | ((((long) bArr[i7]) & 255) << 24);
        int i9 = i8 + 1;
        long j7 = j6 | ((((long) bArr[i8]) & 255) << 16);
        int i10 = i9 + 1;
        long j8 = j7 | ((((long) bArr[i9]) & 255) << 8);
        int i11 = i10 + 1;
        long j9 = j8 | (((long) bArr[i10]) & 255);
        q0(r0() - 8);
        if (i11 == i3) {
            this.a = sVar.b();
            t.b(sVar);
        } else {
            sVar.b = i11;
        }
        return j9;
    }

    @Override // n.c
    public /* bridge */ /* synthetic */ c m(long j2) {
        B0(j2);
        return this;
    }

    public short m0() {
        return c0.f(readShort());
    }

    @Override // n.d
    public b n() {
        return this;
    }

    public String n0(long j2, Charset charset) throws EOFException {
        l.y.c.i.e(charset, "charset");
        if (!(j2 >= 0 && j2 <= 2147483647L)) {
            throw new IllegalArgumentException(l.y.c.i.k("byteCount: ", Long.valueOf(j2)).toString());
        }
        if (this.b < j2) {
            throw new EOFException();
        }
        if (j2 == 0) {
            return "";
        }
        s sVar = this.a;
        l.y.c.i.c(sVar);
        int i2 = sVar.b;
        if (((long) i2) + j2 > sVar.c) {
            return new String(B(j2), charset);
        }
        int i3 = (int) j2;
        String str = new String(sVar.a, i2, i3, charset);
        int i4 = sVar.b + i3;
        sVar.b = i4;
        this.b -= j2;
        if (i4 == sVar.c) {
            this.a = sVar.b();
            t.b(sVar);
        }
        return str;
    }

    @Override // n.d
    public e o(long j2) throws EOFException {
        if (!(j2 >= 0 && j2 <= 2147483647L)) {
            throw new IllegalArgumentException(l.y.c.i.k("byteCount: ", Long.valueOf(j2)).toString());
        }
        if (r0() < j2) {
            throw new EOFException();
        }
        if (j2 < 4096) {
            return new e(B(j2));
        }
        e eVarT0 = t0((int) j2);
        skip(j2);
        return eVarT0;
    }

    public String o0() {
        return n0(this.b, l.d0.d.b);
    }

    @Override // n.c
    public /* bridge */ /* synthetic */ c p(int i2) {
        G0(i2);
        return this;
    }

    public int p0() throws EOFException {
        int i2;
        int i3;
        int i4;
        if (r0() == 0) {
            throw new EOFException();
        }
        byte bD0 = d0(0L);
        boolean z = false;
        if ((bD0 & 128) == 0) {
            i2 = bD0 & 127;
            i3 = 1;
            i4 = 0;
        } else if ((bD0 & 224) == 192) {
            i2 = bD0 & 31;
            i3 = 2;
            i4 = 128;
        } else if ((bD0 & 240) == 224) {
            i2 = bD0 & 15;
            i3 = 3;
            i4 = 2048;
        } else {
            if ((bD0 & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i2 = bD0 & 7;
            i3 = 4;
            i4 = 65536;
        }
        long j2 = i3;
        if (r0() < j2) {
            throw new EOFException("size < " + i3 + ": " + r0() + " (to read code point prefixed 0x" + c0.g(bD0) + ')');
        }
        if (1 < i3) {
            int i5 = 1;
            while (true) {
                int i6 = i5 + 1;
                long j3 = i5;
                byte bD1 = d0(j3);
                if ((bD1 & 192) != 128) {
                    skip(j3);
                    return 65533;
                }
                i2 = (i2 << 6) | (bD1 & 63);
                if (i6 >= i3) {
                    break;
                }
                i5 = i6;
            }
        }
        skip(j2);
        if (i2 > 1114111) {
            return 65533;
        }
        if (55296 <= i2 && i2 <= 57343) {
            z = true;
        }
        if (!z && i2 >= i4) {
            return i2;
        }
        return 65533;
    }

    @Override // n.d
    public boolean q(long j2) {
        return this.b >= j2;
    }

    public final void q0(long j2) {
        this.b = j2;
    }

    @Override // n.c
    public /* bridge */ /* synthetic */ c r(int i2) {
        C0(i2);
        return this;
    }

    public final long r0() {
        return this.b;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        l.y.c.i.e(byteBuffer, "sink");
        s sVar = this.a;
        if (sVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), sVar.c - sVar.b);
        byteBuffer.put(sVar.a, sVar.b, iMin);
        int i2 = sVar.b + iMin;
        sVar.b = i2;
        this.b -= (long) iMin;
        if (i2 == sVar.c) {
            this.a = sVar.b();
            t.b(sVar);
        }
        return iMin;
    }

    public int read(byte[] bArr, int i2, int i3) {
        l.y.c.i.e(bArr, "sink");
        c0.b(bArr.length, i2, i3);
        s sVar = this.a;
        if (sVar == null) {
            return -1;
        }
        int iMin = Math.min(i3, sVar.c - sVar.b);
        byte[] bArr2 = sVar.a;
        int i4 = sVar.b;
        l.t.d.c(bArr2, bArr, i2, i4, i4 + iMin);
        sVar.b += iMin;
        q0(r0() - ((long) iMin));
        if (sVar.b == sVar.c) {
            this.a = sVar.b();
            t.b(sVar);
        }
        return iMin;
    }

    @Override // n.d
    public byte readByte() throws EOFException {
        if (r0() == 0) {
            throw new EOFException();
        }
        s sVar = this.a;
        l.y.c.i.c(sVar);
        int i2 = sVar.b;
        int i3 = sVar.c;
        int i4 = i2 + 1;
        byte b = sVar.a[i2];
        q0(r0() - 1);
        if (i4 == i3) {
            this.a = sVar.b();
            t.b(sVar);
        } else {
            sVar.b = i4;
        }
        return b;
    }

    @Override // n.d
    public int readInt() throws EOFException {
        if (r0() < 4) {
            throw new EOFException();
        }
        s sVar = this.a;
        l.y.c.i.c(sVar);
        int i2 = sVar.b;
        int i3 = sVar.c;
        if (i3 - i2 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = sVar.a;
        int i4 = i2 + 1;
        int i5 = i4 + 1;
        int i6 = ((bArr[i2] & 255) << 24) | ((bArr[i4] & 255) << 16);
        int i7 = i5 + 1;
        int i8 = i6 | ((bArr[i5] & 255) << 8);
        int i9 = i7 + 1;
        int i10 = i8 | (bArr[i7] & 255);
        q0(r0() - 4);
        if (i9 == i3) {
            this.a = sVar.b();
            t.b(sVar);
        } else {
            sVar.b = i9;
        }
        return i10;
    }

    @Override // n.d
    public short readShort() throws EOFException {
        if (r0() < 2) {
            throw new EOFException();
        }
        s sVar = this.a;
        l.y.c.i.c(sVar);
        int i2 = sVar.b;
        int i3 = sVar.c;
        if (i3 - i2 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = sVar.a;
        int i4 = i2 + 1;
        int i5 = i4 + 1;
        int i6 = ((bArr[i2] & 255) << 8) | (bArr[i4] & 255);
        q0(r0() - 2);
        if (i5 == i3) {
            this.a = sVar.b();
            t.b(sVar);
        } else {
            sVar.b = i5;
        }
        return (short) i6;
    }

    public final e s0() {
        if (r0() <= 2147483647L) {
            return t0((int) r0());
        }
        throw new IllegalStateException(l.y.c.i.k("size > Int.MAX_VALUE: ", Long.valueOf(r0())).toString());
    }

    @Override // n.d
    public void skip(long j2) throws EOFException {
        while (j2 > 0) {
            s sVar = this.a;
            if (sVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j2, sVar.c - sVar.b);
            long j3 = iMin;
            q0(r0() - j3);
            j2 -= j3;
            int i2 = sVar.b + iMin;
            sVar.b = i2;
            if (i2 == sVar.c) {
                this.a = sVar.b();
                t.b(sVar);
            }
        }
    }

    @Override // n.c
    public /* bridge */ /* synthetic */ c t(long j2) {
        F0(j2);
        return this;
    }

    public final e t0(int i2) {
        if (i2 == 0) {
            return e.e;
        }
        c0.b(r0(), 0L, i2);
        s sVar = this.a;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            l.y.c.i.c(sVar);
            int i6 = sVar.c;
            int i7 = sVar.b;
            if (i6 == i7) {
                throw new AssertionError("s.limit == s.pos");
            }
            i4 += i6 - i7;
            i5++;
            sVar = sVar.f;
        }
        byte[][] bArr = new byte[i5][];
        int[] iArr = new int[i5 * 2];
        s sVar2 = this.a;
        int i8 = 0;
        while (i3 < i2) {
            l.y.c.i.c(sVar2);
            bArr[i8] = sVar2.a;
            i3 += sVar2.c - sVar2.b;
            iArr[i8] = Math.min(i3, i2);
            iArr[i8 + i5] = sVar2.b;
            sVar2.d = true;
            i8++;
            sVar2 = sVar2.f;
        }
        return new u(bArr, iArr);
    }

    public String toString() {
        return s0().toString();
    }

    public final s u0(int i2) {
        if (!(i2 >= 1 && i2 <= 8192)) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        s sVar = this.a;
        if (sVar == null) {
            s sVarC = t.c();
            this.a = sVarC;
            sVarC.f2349g = sVarC;
            sVarC.f = sVarC;
            return sVarC;
        }
        l.y.c.i.c(sVar);
        s sVar2 = sVar.f2349g;
        l.y.c.i.c(sVar2);
        if (sVar2.c + i2 <= 8192 && sVar2.e) {
            return sVar2;
        }
        s sVarC2 = t.c();
        sVar2.c(sVarC2);
        return sVarC2;
    }

    @Override // n.d
    public String v() {
        return K(Long.MAX_VALUE);
    }

    public b v0(e eVar) {
        l.y.c.i.e(eVar, "byteString");
        eVar.y(this, 0, eVar.t());
        return this;
    }

    @Override // n.d
    public int w() {
        return c0.d(readInt());
    }

    public b w0(byte[] bArr) {
        l.y.c.i.e(bArr, "source");
        x0(bArr, 0, bArr.length);
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        l.y.c.i.e(byteBuffer, "source");
        int iRemaining = byteBuffer.remaining();
        int i2 = iRemaining;
        while (i2 > 0) {
            s sVarU0 = u0(1);
            int iMin = Math.min(i2, 8192 - sVarU0.c);
            byteBuffer.get(sVarU0.a, sVarU0.c, iMin);
            i2 -= iMin;
            sVarU0.c += iMin;
        }
        this.b += (long) iRemaining;
        return iRemaining;
    }

    public b x0(byte[] bArr, int i2, int i3) {
        l.y.c.i.e(bArr, "source");
        long j2 = i3;
        c0.b(bArr.length, i2, j2);
        int i4 = i3 + i2;
        while (i2 < i4) {
            s sVarU0 = u0(1);
            int iMin = Math.min(i4 - i2, 8192 - sVarU0.c);
            int i5 = i2 + iMin;
            l.t.d.c(bArr, sVarU0.a, sVarU0.c, i2, i5);
            sVarU0.c += iMin;
            i2 = i5;
        }
        q0(r0() + j2);
        return this;
    }

    @Override // n.c
    public /* bridge */ /* synthetic */ c y(int i2) {
        D0(i2);
        return this;
    }

    public long y0(x xVar) {
        l.y.c.i.e(xVar, "source");
        long j2 = 0;
        while (true) {
            long jI = xVar.I(this, 8192L);
            if (jI == -1) {
                return j2;
            }
            j2 += jI;
        }
    }

    @Override // n.d
    public boolean z() {
        return this.b == 0;
    }

    public b z0(int i2) {
        s sVarU0 = u0(1);
        byte[] bArr = sVarU0.a;
        int i3 = sVarU0.c;
        sVarU0.c = i3 + 1;
        bArr[i3] = (byte) i2;
        q0(r0() + 1);
        return this;
    }
}
