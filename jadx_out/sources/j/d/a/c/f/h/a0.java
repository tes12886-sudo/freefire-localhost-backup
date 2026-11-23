package j.d.a.c.f.h;

import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes.dex */
final class a0 extends b0 {
    final transient int c;
    final transient int d;
    final /* synthetic */ b0 e;

    a0(b0 b0Var, int i2, int i3) {
        this.e = b0Var;
        this.c = i2;
        this.d = i3;
    }

    @Override // j.d.a.c.f.h.y
    final int c() {
        return this.e.d() + this.c + this.d;
    }

    @Override // j.d.a.c.f.h.y
    final int d() {
        return this.e.d() + this.c;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        t.a(i2, this.d, "index");
        return this.e.get(i2 + this.c);
    }

    @Override // j.d.a.c.f.h.y
    final boolean j() {
        return true;
    }

    @Override // j.d.a.c.f.h.y
    @CheckForNull
    final Object[] l() {
        return this.e.l();
    }

    @Override // j.d.a.c.f.h.b0
    /* JADX INFO: renamed from: n */
    public final b0 subList(int i2, int i3) {
        t.c(i2, i3, this.d);
        b0 b0Var = this.e;
        int i4 = this.c;
        return b0Var.subList(i2 + i4, i3 + i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // j.d.a.c.f.h.b0, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i2, int i3) {
        return subList(i2, i3);
    }
}
