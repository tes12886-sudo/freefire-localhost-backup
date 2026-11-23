package j.d.a.c.f.g;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes.dex */
final class a0 implements f0 {
    private final int a;
    private final e0 b;

    a0(int i2, e0 e0Var) {
        this.a = i2;
        this.b = e0Var;
    }

    @Override // java.lang.annotation.Annotation
    public final Class<? extends Annotation> annotationType() {
        return f0.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.a == f0Var.zza() && this.b.equals(f0Var.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (this.b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + this.b + ')';
    }

    @Override // j.d.a.c.f.g.f0
    public final int zza() {
        return this.a;
    }

    @Override // j.d.a.c.f.g.f0
    public final e0 zzb() {
        return this.b;
    }
}
