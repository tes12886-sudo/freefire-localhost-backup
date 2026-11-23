package j.d.c;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class a {
    ByteBuffer a;
    int b;
    int c;
    int[] d;
    int e;
    boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f2022g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f2023h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int[] f2024i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f2025j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f2026k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f2027l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    AbstractC0236a f2028m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final c f2029n;

    /* JADX INFO: renamed from: j.d.c.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0236a {
        public abstract ByteBuffer a(int i2);

        public void b(ByteBuffer byteBuffer) {
        }
    }

    public static final class b extends AbstractC0236a {
        public static final b a = new b();

        @Override // j.d.c.a.AbstractC0236a
        public ByteBuffer a(int i2) {
            return ByteBuffer.allocate(i2).order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    public a(int i2) {
        this(i2, b.a, null, c.c());
    }

    public a(int i2, AbstractC0236a abstractC0236a, ByteBuffer byteBuffer, c cVar) {
        this.c = 1;
        this.d = null;
        this.e = 0;
        this.f = false;
        this.f2022g = false;
        this.f2024i = new int[16];
        this.f2025j = 0;
        this.f2026k = 0;
        this.f2027l = false;
        i2 = i2 <= 0 ? 1 : i2;
        this.f2028m = abstractC0236a;
        if (byteBuffer != null) {
            this.a = byteBuffer;
            byteBuffer.clear();
            this.a.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.a = abstractC0236a.a(i2);
        }
        this.f2029n = cVar;
        this.b = this.a.capacity();
    }

    static ByteBuffer s(ByteBuffer byteBuffer, AbstractC0236a abstractC0236a) {
        int iCapacity = byteBuffer.capacity();
        if (((-1073741824) & iCapacity) != 0) {
            throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
        }
        int i2 = iCapacity == 0 ? 1 : iCapacity << 1;
        byteBuffer.position(0);
        ByteBuffer byteBufferA = abstractC0236a.a(i2);
        byteBufferA.position(byteBufferA.clear().capacity() - iCapacity);
        byteBufferA.put(byteBuffer);
        return byteBufferA;
    }

    public void A(long j2) {
        ByteBuffer byteBuffer = this.a;
        int i2 = this.b - 8;
        this.b = i2;
        byteBuffer.putLong(i2, j2);
    }

    public void B(short s) {
        ByteBuffer byteBuffer = this.a;
        int i2 = this.b - 2;
        this.b = i2;
        byteBuffer.putShort(i2, s);
    }

    public byte[] C() {
        return D(this.b, this.a.capacity() - this.b);
    }

    public byte[] D(int i2, int i3) {
        r();
        byte[] bArr = new byte[i3];
        this.a.position(i2);
        this.a.get(bArr);
        return bArr;
    }

    public void E(int i2) {
        this.d[i2] = u();
    }

    public void F(int i2) {
        t();
        int[] iArr = this.d;
        if (iArr == null || iArr.length < i2) {
            this.d = new int[i2];
        }
        this.e = i2;
        Arrays.fill(this.d, 0, i2, 0);
        this.f = true;
        this.f2023h = u();
    }

    public void G(int i2, int i3, int i4) {
        t();
        this.f2026k = i3;
        int i5 = i2 * i3;
        w(4, i5);
        w(i4, i5);
        this.f = true;
    }

    public void a(int i2, boolean z, boolean z2) {
        if (this.f2027l || z != z2) {
            b(z);
            E(i2);
        }
    }

    public void b(boolean z) {
        w(1, 0);
        x(z);
    }

    public void c(byte b2) {
        w(1, 0);
        y(b2);
    }

    public void d(int i2, byte b2, int i3) {
        if (this.f2027l || b2 != i3) {
            c(b2);
            E(i2);
        }
    }

    public void e(int i2) {
        w(4, 0);
        z(i2);
    }

    public void f(int i2, int i3, int i4) {
        if (this.f2027l || i3 != i4) {
            e(i3);
            E(i2);
        }
    }

    public void g(int i2, long j2, long j3) {
        if (this.f2027l || j2 != j3) {
            h(j2);
            E(i2);
        }
    }

    public void h(long j2) {
        w(8, 0);
        A(j2);
    }

    public void i(int i2) {
        w(4, 0);
        z((u() - i2) + 4);
    }

    public void j(int i2, int i3, int i4) {
        if (this.f2027l || i3 != i4) {
            i(i3);
            E(i2);
        }
    }

    public void k(short s) {
        w(2, 0);
        B(s);
    }

    public int l(byte[] bArr) {
        int length = bArr.length;
        G(1, length, 1);
        ByteBuffer byteBuffer = this.a;
        int i2 = this.b - length;
        this.b = i2;
        byteBuffer.position(i2);
        this.a.put(bArr);
        return o();
    }

    public int m(CharSequence charSequence) {
        int iB = this.f2029n.b(charSequence);
        c((byte) 0);
        G(1, iB, 1);
        ByteBuffer byteBuffer = this.a;
        int i2 = this.b - iB;
        this.b = i2;
        byteBuffer.position(i2);
        this.f2029n.a(charSequence, this.a);
        return o();
    }

    public int n() {
        int i2;
        if (this.d == null || !this.f) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        e(0);
        int iU = u();
        int i3 = this.e - 1;
        while (i3 >= 0 && this.d[i3] == 0) {
            i3--;
        }
        int i4 = i3 + 1;
        while (i3 >= 0) {
            int[] iArr = this.d;
            k((short) (iArr[i3] != 0 ? iU - iArr[i3] : 0));
            i3--;
        }
        k((short) (iU - this.f2023h));
        k((short) ((i4 + 2) * 2));
        int i5 = 0;
        loop2: while (true) {
            if (i5 >= this.f2025j) {
                i2 = 0;
                break;
            }
            int iCapacity = this.a.capacity() - this.f2024i[i5];
            int i6 = this.b;
            short s = this.a.getShort(iCapacity);
            if (s == this.a.getShort(i6)) {
                int i7 = 2;
                while (true) {
                    if (i7 >= s) {
                        i2 = this.f2024i[i5];
                        break loop2;
                    }
                    if (this.a.getShort(iCapacity + i7) != this.a.getShort(i6 + i7)) {
                        break;
                    }
                    i7 += 2;
                }
            }
            i5++;
        }
        if (i2 != 0) {
            int iCapacity2 = this.a.capacity() - iU;
            this.b = iCapacity2;
            this.a.putInt(iCapacity2, i2 - iU);
        } else {
            int i8 = this.f2025j;
            int[] iArr2 = this.f2024i;
            if (i8 == iArr2.length) {
                this.f2024i = Arrays.copyOf(iArr2, i8 * 2);
            }
            int[] iArr3 = this.f2024i;
            int i9 = this.f2025j;
            this.f2025j = i9 + 1;
            iArr3[i9] = u();
            ByteBuffer byteBuffer = this.a;
            byteBuffer.putInt(byteBuffer.capacity() - iU, u() - iU);
        }
        this.f = false;
        return iU;
    }

    public int o() {
        if (!this.f) {
            throw new AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.f = false;
        z(this.f2026k);
        return u();
    }

    public void p(int i2) {
        q(i2, false);
    }

    protected void q(int i2, boolean z) {
        w(this.c, (z ? 4 : 0) + 4);
        i(i2);
        if (z) {
            e(this.a.capacity() - this.b);
        }
        this.a.position(this.b);
        this.f2022g = true;
    }

    public void r() {
        if (!this.f2022g) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
    }

    public void t() {
        if (this.f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    public int u() {
        return this.a.capacity() - this.b;
    }

    public void v(int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            ByteBuffer byteBuffer = this.a;
            int i4 = this.b - 1;
            this.b = i4;
            byteBuffer.put(i4, (byte) 0);
        }
    }

    public void w(int i2, int i3) {
        if (i2 > this.c) {
            this.c = i2;
        }
        int iCapacity = ((((this.a.capacity() - this.b) + i3) ^ (-1)) + 1) & (i2 - 1);
        while (this.b < iCapacity + i2 + i3) {
            int iCapacity2 = this.a.capacity();
            ByteBuffer byteBuffer = this.a;
            ByteBuffer byteBufferS = s(byteBuffer, this.f2028m);
            this.a = byteBufferS;
            if (byteBuffer != byteBufferS) {
                this.f2028m.b(byteBuffer);
            }
            this.b += this.a.capacity() - iCapacity2;
        }
        v(iCapacity);
    }

    public void x(boolean z) {
        ByteBuffer byteBuffer = this.a;
        int i2 = this.b - 1;
        this.b = i2;
        byteBuffer.put(i2, z ? (byte) 1 : (byte) 0);
    }

    public void y(byte b2) {
        ByteBuffer byteBuffer = this.a;
        int i2 = this.b - 1;
        this.b = i2;
        byteBuffer.put(i2, b2);
    }

    public void z(int i2) {
        ByteBuffer byteBuffer = this.a;
        int i3 = this.b - 4;
        this.b = i3;
        byteBuffer.putInt(i3, i2);
    }
}
