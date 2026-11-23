package n;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public final class u extends e {
    private final transient byte[][] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient int[] f2350g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(byte[][] bArr, int[] iArr) {
        super(e.e.f());
        l.y.c.i.e(bArr, "segments");
        l.y.c.i.e(iArr, "directory");
        this.f = bArr;
        this.f2350g = iArr;
    }

    private final e B() {
        return new e(w());
    }

    private final Object writeReplace() {
        return B();
    }

    public final byte[][] A() {
        return this.f;
    }

    @Override // n.e
    public String a() {
        return B().a();
    }

    @Override // n.e
    public e d(String str) throws NoSuchAlgorithmException {
        l.y.c.i.e(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        int length = A().length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = z()[length + i2];
            int i5 = z()[i2];
            messageDigest.update(A()[i2], i4, i5 - i3);
            i2++;
            i3 = i5;
        }
        byte[] bArrDigest = messageDigest.digest();
        l.y.c.i.d(bArrDigest, "digestBytes");
        return new e(bArrDigest);
    }

    @Override // n.e
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (eVar.t() == t() && n(0, eVar, 0, t())) {
                return true;
            }
        }
        return false;
    }

    @Override // n.e
    public int h() {
        return z()[A().length - 1];
    }

    @Override // n.e
    public int hashCode() {
        int iG = g();
        if (iG != 0) {
            return iG;
        }
        int length = A().length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int i5 = z()[length + i2];
            int i6 = z()[i2];
            byte[] bArr = A()[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        p(i3);
        return i3;
    }

    @Override // n.e
    public String j() {
        return B().j();
    }

    @Override // n.e
    public byte[] k() {
        return w();
    }

    @Override // n.e
    public byte l(int i2) {
        c0.b(z()[A().length - 1], i2, 1L);
        int iB = n.d0.c.b(this, i2);
        return A()[iB][(i2 - (iB == 0 ? 0 : z()[iB - 1])) + z()[A().length + iB]];
    }

    @Override // n.e
    public boolean n(int i2, e eVar, int i3, int i4) {
        l.y.c.i.e(eVar, "other");
        if (i2 < 0 || i2 > t() - i4) {
            return false;
        }
        int i5 = i4 + i2;
        int iB = n.d0.c.b(this, i2);
        while (i2 < i5) {
            int i6 = iB == 0 ? 0 : z()[iB - 1];
            int i7 = z()[iB] - i6;
            int i8 = z()[A().length + iB];
            int iMin = Math.min(i5, i7 + i6) - i2;
            if (!eVar.o(i3, A()[iB], i8 + (i2 - i6), iMin)) {
                return false;
            }
            i3 += iMin;
            i2 += iMin;
            iB++;
        }
        return true;
    }

    @Override // n.e
    public boolean o(int i2, byte[] bArr, int i3, int i4) {
        l.y.c.i.e(bArr, "other");
        if (i2 < 0 || i2 > t() - i4 || i3 < 0 || i3 > bArr.length - i4) {
            return false;
        }
        int i5 = i4 + i2;
        int iB = n.d0.c.b(this, i2);
        while (i2 < i5) {
            int i6 = iB == 0 ? 0 : z()[iB - 1];
            int i7 = z()[iB] - i6;
            int i8 = z()[A().length + iB];
            int iMin = Math.min(i5, i7 + i6) - i2;
            if (!c0.a(A()[iB], i8 + (i2 - i6), bArr, i3, iMin)) {
                return false;
            }
            i3 += iMin;
            i2 += iMin;
            iB++;
        }
        return true;
    }

    @Override // n.e
    public String toString() {
        return B().toString();
    }

    @Override // n.e
    public e v() {
        return B().v();
    }

    @Override // n.e
    public byte[] w() {
        byte[] bArr = new byte[t()];
        int length = A().length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int i5 = z()[length + i2];
            int i6 = z()[i2];
            int i7 = i6 - i3;
            l.t.d.c(A()[i2], bArr, i4, i5, i5 + i7);
            i4 += i7;
            i2++;
            i3 = i6;
        }
        return bArr;
    }

    @Override // n.e
    public void y(b bVar, int i2, int i3) {
        l.y.c.i.e(bVar, "buffer");
        int i4 = i2 + i3;
        int iB = n.d0.c.b(this, i2);
        while (i2 < i4) {
            int i5 = iB == 0 ? 0 : z()[iB - 1];
            int i6 = z()[iB] - i5;
            int i7 = z()[A().length + iB];
            int iMin = Math.min(i4, i6 + i5) - i2;
            int i8 = i7 + (i2 - i5);
            s sVar = new s(A()[iB], i8, i8 + iMin, true, false);
            s sVar2 = bVar.a;
            if (sVar2 == null) {
                sVar.f2349g = sVar;
                sVar.f = sVar;
                bVar.a = sVar;
            } else {
                l.y.c.i.c(sVar2);
                s sVar3 = sVar2.f2349g;
                l.y.c.i.c(sVar3);
                sVar3.c(sVar);
            }
            i2 += iMin;
            iB++;
        }
        bVar.q0(bVar.r0() + ((long) i3));
    }

    public final int[] z() {
        return this.f2350g;
    }
}
