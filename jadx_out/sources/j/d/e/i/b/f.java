package j.d.e.i.b;

import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
final class f {
    static final f e = new f(g.b, 0, 0, 0);
    private final int a;
    private final g b;
    private final int c;
    private final int d;

    private f(g gVar, int i2, int i3, int i4) {
        this.b = gVar;
        this.a = i2;
        this.c = i3;
        this.d = i4;
    }

    f a(int i2) {
        int i3;
        g gVarA = this.b;
        int i4 = this.a;
        int i5 = this.d;
        if (i4 == 4 || i4 == 2) {
            int i6 = d.c[i4][0];
            int i7 = 65535 & i6;
            int i8 = i6 >> 16;
            gVarA = gVarA.a(i7, i8);
            i5 += i8;
            i4 = 0;
        }
        int i9 = this.c;
        if (i9 == 0 || i9 == 31) {
            i3 = 18;
        } else {
            i3 = i9 == 62 ? 9 : 8;
        }
        f fVar = new f(gVarA, i4, i9 + 1, i5 + i3);
        return fVar.c == 2078 ? fVar.b(i2 + 1) : fVar;
    }

    f b(int i2) {
        int i3 = this.c;
        return i3 == 0 ? this : new f(this.b.b(i2 - i3, i3), this.a, 0, this.d);
    }

    int c() {
        return this.c;
    }

    int d() {
        return this.d;
    }

    int e() {
        return this.a;
    }

    boolean f(f fVar) {
        int i2;
        int i3 = this.d + (d.c[this.a][fVar.a] >> 16);
        int i4 = fVar.c;
        if (i4 > 0 && ((i2 = this.c) == 0 || i2 > i4)) {
            i3 += 10;
        }
        return i3 <= fVar.d;
    }

    f g(int i2, int i3) {
        int i4 = this.d;
        g gVarA = this.b;
        int i5 = this.a;
        if (i2 != i5) {
            int i6 = d.c[i5][i2];
            int i7 = 65535 & i6;
            int i8 = i6 >> 16;
            gVarA = gVarA.a(i7, i8);
            i4 += i8;
        }
        int i9 = i2 == 2 ? 4 : 5;
        return new f(gVarA.a(i3, i9), i2, 0, i4 + i9);
    }

    f h(int i2, int i3) {
        g gVar = this.b;
        int i4 = this.a;
        int i5 = i4 == 2 ? 4 : 5;
        return new f(gVar.a(d.e[i4][i2], i5).a(i3, 5), this.a, 0, this.d + i5 + 5);
    }

    j.d.e.j.a i(byte[] bArr) {
        LinkedList linkedList = new LinkedList();
        for (g gVarD = b(bArr.length).b; gVarD != null; gVarD = gVarD.d()) {
            linkedList.addFirst(gVarD);
        }
        j.d.e.j.a aVar = new j.d.e.j.a();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((g) it.next()).c(aVar, bArr);
        }
        return aVar;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", d.b[this.a], Integer.valueOf(this.d), Integer.valueOf(this.c));
    }
}
