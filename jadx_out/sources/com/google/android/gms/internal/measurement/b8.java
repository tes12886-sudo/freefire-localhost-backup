package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class b8 extends c8 {
    private int a;
    private int b;
    private int c;

    /* synthetic */ b8(byte[] bArr, int i2, int i3, boolean z, a8 a8Var) {
        super(null);
        this.c = Integer.MAX_VALUE;
        this.a = 0;
    }

    public final int c(int i2) {
        int i3 = this.c;
        this.c = 0;
        int i4 = this.a + this.b;
        this.a = i4;
        if (i4 > 0) {
            this.b = i4;
            this.a = 0;
        } else {
            this.b = 0;
        }
        return i3;
    }
}
