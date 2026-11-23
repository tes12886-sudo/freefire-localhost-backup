package com.facebook;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends OutputStream implements g0 {
    private final Map<u, h0> a = new HashMap();
    private u b;
    private h0 c;
    private int d;
    private final Handler e;

    public e0(Handler handler) {
        this.e = handler;
    }

    @Override // com.facebook.g0
    public void b(u uVar) {
        this.b = uVar;
        this.c = uVar != null ? this.a.get(uVar) : null;
    }

    public final void c(long j2) {
        u uVar = this.b;
        if (uVar != null) {
            if (this.c == null) {
                h0 h0Var = new h0(this.e, uVar);
                this.c = h0Var;
                this.a.put(uVar, h0Var);
            }
            h0 h0Var2 = this.c;
            if (h0Var2 != null) {
                h0Var2.b(j2);
            }
            this.d += (int) j2;
        }
    }

    public final int f() {
        return this.d;
    }

    public final Map<u, h0> j() {
        return this.a;
    }

    @Override // java.io.OutputStream
    public void write(int i2) {
        c(1L);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        l.y.c.i.e(bArr, "buffer");
        c(bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i2, int i3) {
        l.y.c.i.e(bArr, "buffer");
        c(i3);
    }
}
