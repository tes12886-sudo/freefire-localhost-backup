package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
public final class p3 {
    private final int a;
    private final boolean b;
    private final boolean c;
    final /* synthetic */ r3 d;

    p3(r3 r3Var, int i2, boolean z, boolean z2) {
        this.d = r3Var;
        this.a = i2;
        this.b = z;
        this.c = z2;
    }

    public final void a(String str) {
        this.d.y(this.a, this.b, this.c, str, null, null, null);
    }

    public final void b(String str, Object obj) {
        this.d.y(this.a, this.b, this.c, str, obj, null, null);
    }

    public final void c(String str, Object obj, Object obj2) {
        this.d.y(this.a, this.b, this.c, str, obj, obj2, null);
    }

    public final void d(String str, Object obj, Object obj2, Object obj3) {
        this.d.y(this.a, this.b, this.c, str, obj, obj2, obj3);
    }
}
