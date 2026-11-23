package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
public final class d3<V> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f1177h = new Object();
    private final String a;
    private final b3<V> b;
    private final V c;
    private final V d;
    private final Object e = new Object();
    private volatile V f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile V f1178g = null;

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ d3(String str, Object obj, Object obj2, b3 b3Var, a3 a3Var) {
        this.a = str;
        this.c = obj;
        this.d = obj2;
        this.b = b3Var;
    }

    public final String a() {
        return this.a;
    }

    public final V b(V v) {
        synchronized (this.e) {
        }
        if (v != null) {
            return v;
        }
        if (c3.a == null) {
            return this.c;
        }
        synchronized (f1177h) {
            if (ta.a()) {
                return this.f1178g == null ? this.c : this.f1178g;
            }
            try {
                for (d3 d3Var : f3.a) {
                    if (ta.a()) {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                    V vZza = null;
                    try {
                        b3<V> b3Var = d3Var.b;
                        if (b3Var != null) {
                            vZza = b3Var.zza();
                        }
                    } catch (IllegalStateException unused) {
                    }
                    synchronized (f1177h) {
                        d3Var.f1178g = vZza;
                    }
                }
            } catch (SecurityException unused2) {
            }
            b3<V> b3Var2 = this.b;
            if (b3Var2 == null) {
                return this.c;
            }
            try {
                return b3Var2.zza();
            } catch (IllegalStateException unused3) {
                return this.c;
            } catch (SecurityException unused4) {
                return this.c;
            }
        }
    }
}
