package com.google.android.gms.common.internal;

/* JADX INFO: loaded from: classes.dex */
public final class r {
    private static r b;
    private static final s c = new s(0, false, false, 0, 0);
    private s a;

    private r() {
    }

    public static synchronized r b() {
        if (b == null) {
            b = new r();
        }
        return b;
    }

    public s a() {
        return this.a;
    }

    public final synchronized void c(s sVar) {
        try {
            if (sVar == null) {
                this.a = c;
                return;
            }
            s sVar2 = this.a;
            if (sVar2 == null || sVar2.n() < sVar.n()) {
                this.a = sVar;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
