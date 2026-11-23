package n;

/* JADX INFO: loaded from: classes.dex */
public final class s {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public s f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s f2349g;

    public s() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public s(byte[] bArr, int i2, int i3, boolean z, boolean z2) {
        l.y.c.i.e(bArr, "data");
        this.a = bArr;
        this.b = i2;
        this.c = i3;
        this.d = z;
        this.e = z2;
    }

    public final void a() {
        s sVar = this.f2349g;
        int i2 = 0;
        if (!(sVar != this)) {
            throw new IllegalStateException("cannot compact".toString());
        }
        l.y.c.i.c(sVar);
        if (sVar.e) {
            int i3 = this.c - this.b;
            s sVar2 = this.f2349g;
            l.y.c.i.c(sVar2);
            int i4 = 8192 - sVar2.c;
            s sVar3 = this.f2349g;
            l.y.c.i.c(sVar3);
            if (!sVar3.d) {
                s sVar4 = this.f2349g;
                l.y.c.i.c(sVar4);
                i2 = sVar4.b;
            }
            if (i3 > i4 + i2) {
                return;
            }
            s sVar5 = this.f2349g;
            l.y.c.i.c(sVar5);
            f(sVar5, i3);
            b();
            t.b(this);
        }
    }

    public final s b() {
        s sVar = this.f;
        if (sVar == this) {
            sVar = null;
        }
        s sVar2 = this.f2349g;
        l.y.c.i.c(sVar2);
        sVar2.f = this.f;
        s sVar3 = this.f;
        l.y.c.i.c(sVar3);
        sVar3.f2349g = this.f2349g;
        this.f = null;
        this.f2349g = null;
        return sVar;
    }

    public final s c(s sVar) {
        l.y.c.i.e(sVar, "segment");
        sVar.f2349g = this;
        sVar.f = this.f;
        s sVar2 = this.f;
        l.y.c.i.c(sVar2);
        sVar2.f2349g = sVar;
        this.f = sVar;
        return sVar;
    }

    public final s d() {
        this.d = true;
        return new s(this.a, this.b, this.c, true, false);
    }

    public final s e(int i2) {
        s sVarC;
        if (!(i2 > 0 && i2 <= this.c - this.b)) {
            throw new IllegalArgumentException("byteCount out of range".toString());
        }
        if (i2 >= 1024) {
            sVarC = d();
        } else {
            sVarC = t.c();
            byte[] bArr = this.a;
            byte[] bArr2 = sVarC.a;
            int i3 = this.b;
            l.t.d.d(bArr, bArr2, 0, i3, i3 + i2, 2, null);
        }
        sVarC.c = sVarC.b + i2;
        this.b += i2;
        s sVar = this.f2349g;
        l.y.c.i.c(sVar);
        sVar.c(sVarC);
        return sVarC;
    }

    public final void f(s sVar, int i2) {
        l.y.c.i.e(sVar, "sink");
        if (!sVar.e) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i3 = sVar.c;
        if (i3 + i2 > 8192) {
            if (sVar.d) {
                throw new IllegalArgumentException();
            }
            int i4 = sVar.b;
            if ((i3 + i2) - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sVar.a;
            l.t.d.d(bArr, bArr, 0, i4, i3, 2, null);
            sVar.c -= sVar.b;
            sVar.b = 0;
        }
        byte[] bArr2 = this.a;
        byte[] bArr3 = sVar.a;
        int i5 = sVar.c;
        int i6 = this.b;
        l.t.d.c(bArr2, bArr3, i5, i6, i6 + i2);
        sVar.c += i2;
        this.b += i2;
    }
}
