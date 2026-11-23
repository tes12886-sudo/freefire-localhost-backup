package j.f.a;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    private final n.d a;
    private int d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a f2146h;
    private long b = 0;
    private long c = Long.MAX_VALUE;
    private int e = 2;
    private int f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f2145g = -1;

    public f(n.d dVar) {
        this.a = dVar;
    }

    private void a(int i2) throws IOException {
        if (this.e != i2) {
            long j2 = this.b;
            long j3 = this.c;
            if (j2 > j3) {
                throw new IOException("Expected to end at " + this.c + " but was " + this.b);
            }
            if (j2 != j3) {
                this.e = 7;
                return;
            } else {
                this.c = this.f2145g;
                this.f2145g = -1L;
            }
        }
        this.e = 6;
    }

    private long b() throws ProtocolException {
        if (this.e != 2) {
            throw new ProtocolException("Expected LENGTH_DELIMITED but was " + this.e);
        }
        long j2 = this.c - this.b;
        this.a.P(j2);
        this.e = 6;
        this.b = this.c;
        this.c = this.f2145g;
        this.f2145g = -1L;
        return j2;
    }

    private int e() throws ProtocolException {
        int i2;
        this.b++;
        byte b = this.a.readByte();
        if (b >= 0) {
            return b;
        }
        int i3 = b & 127;
        this.b++;
        byte b2 = this.a.readByte();
        if (b2 >= 0) {
            i2 = b2 << 7;
        } else {
            i3 |= (b2 & 127) << 7;
            this.b++;
            byte b3 = this.a.readByte();
            if (b3 >= 0) {
                i2 = b3 << 14;
            } else {
                i3 |= (b3 & 127) << 14;
                this.b++;
                byte b4 = this.a.readByte();
                if (b4 < 0) {
                    int i4 = i3 | ((b4 & 127) << 21);
                    this.b++;
                    byte b5 = this.a.readByte();
                    int i5 = i4 | (b5 << 28);
                    if (b5 >= 0) {
                        return i5;
                    }
                    for (int i6 = 0; i6 < 5; i6++) {
                        this.b++;
                        if (this.a.readByte() >= 0) {
                            return i5;
                        }
                    }
                    throw new ProtocolException("Malformed VARINT");
                }
                i2 = b4 << 21;
            }
        }
        return i3 | i2;
    }

    private void n(int i2) throws IOException {
        while (this.b < this.c && !this.a.z()) {
            int iE = e();
            if (iE == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i3 = iE >> 3;
            int i4 = iE & 7;
            if (i4 == 0) {
                this.e = 0;
                m();
            } else if (i4 == 1) {
                this.e = 1;
                j();
            } else if (i4 == 2) {
                long jE = e();
                this.b += jE;
                this.a.skip(jE);
            } else if (i4 == 3) {
                n(i3);
            } else if (i4 == 4) {
                if (i3 != i2) {
                    throw new ProtocolException("Unexpected end group");
                }
                return;
            } else {
                if (i4 != 5) {
                    throw new ProtocolException("Unexpected field encoding: " + i4);
                }
                this.e = 5;
                i();
            }
        }
        throw new EOFException();
    }

    public long c() {
        if (this.e != 2) {
            throw new IllegalStateException("Unexpected call to beginMessage()");
        }
        int i2 = this.d + 1;
        this.d = i2;
        if (i2 > 65) {
            throw new IOException("Wire recursion limit exceeded");
        }
        long j2 = this.f2145g;
        this.f2145g = -1L;
        this.e = 6;
        return j2;
    }

    public void d(long j2) {
        if (this.e != 6) {
            throw new IllegalStateException("Unexpected call to endMessage()");
        }
        int i2 = this.d - 1;
        this.d = i2;
        if (i2 < 0 || this.f2145g != -1) {
            throw new IllegalStateException("No corresponding call to beginMessage()");
        }
        if (this.b == this.c || i2 == 0) {
            this.c = j2;
            return;
        }
        throw new IOException("Expected to end at " + this.c + " but was " + this.b);
    }

    public int f() {
        int i2 = this.e;
        if (i2 == 7) {
            this.e = 2;
            return this.f;
        }
        if (i2 != 6) {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
        while (this.b < this.c && !this.a.z()) {
            int iE = e();
            if (iE == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i3 = iE >> 3;
            this.f = i3;
            int i4 = iE & 7;
            if (i4 == 0) {
                this.f2146h = a.VARINT;
                this.e = 0;
                return i3;
            }
            if (i4 == 1) {
                this.f2146h = a.FIXED64;
                this.e = 1;
                return i3;
            }
            if (i4 == 2) {
                this.f2146h = a.LENGTH_DELIMITED;
                this.e = 2;
                int iE2 = e();
                if (iE2 < 0) {
                    throw new ProtocolException("Negative length: " + iE2);
                }
                if (this.f2145g != -1) {
                    throw new IllegalStateException();
                }
                long j2 = this.c;
                this.f2145g = j2;
                long j3 = this.b + ((long) iE2);
                this.c = j3;
                if (j3 <= j2) {
                    return this.f;
                }
                throw new EOFException();
            }
            if (i4 != 3) {
                if (i4 == 4) {
                    throw new ProtocolException("Unexpected end group");
                }
                if (i4 == 5) {
                    this.f2146h = a.FIXED32;
                    this.e = 5;
                    return i3;
                }
                throw new ProtocolException("Unexpected field encoding: " + i4);
            }
            n(i3);
        }
        return -1;
    }

    public a g() {
        return this.f2146h;
    }

    public n.e h() throws ProtocolException {
        return this.a.o(b());
    }

    public int i() throws IOException {
        int i2 = this.e;
        if (i2 != 5 && i2 != 2) {
            throw new ProtocolException("Expected FIXED32 or LENGTH_DELIMITED but was " + this.e);
        }
        this.a.P(4L);
        this.b += 4;
        int iW = this.a.w();
        a(5);
        return iW;
    }

    public long j() throws IOException {
        int i2 = this.e;
        if (i2 != 1 && i2 != 2) {
            throw new ProtocolException("Expected FIXED64 or LENGTH_DELIMITED but was " + this.e);
        }
        this.a.P(8L);
        this.b += 8;
        long J = this.a.J();
        a(1);
        return J;
    }

    public String k() throws ProtocolException {
        return this.a.i(b());
    }

    public int l() throws IOException {
        int i2 = this.e;
        if (i2 == 0 || i2 == 2) {
            int iE = e();
            a(0);
            return iE;
        }
        throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.e);
    }

    public long m() throws IOException {
        int i2 = this.e;
        if (i2 != 0 && i2 != 2) {
            throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.e);
        }
        long j2 = 0;
        for (int i3 = 0; i3 < 64; i3 += 7) {
            this.b++;
            byte b = this.a.readByte();
            j2 |= ((long) (b & 127)) << i3;
            if ((b & 128) == 0) {
                a(0);
                return j2;
            }
        }
        throw new ProtocolException("WireInput encountered a malformed varint");
    }
}
