package com.google.firebase.installations.q;

import com.google.firebase.installations.n;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
class e {
    private static final long d = TimeUnit.HOURS.toMillis(24);
    private static final long e = TimeUnit.MINUTES.toMillis(30);
    private final n a = n.c();
    private long b;
    private int c;

    e() {
    }

    private synchronized long a(int i2) {
        if (!c(i2)) {
            return d;
        }
        double dPow = Math.pow(2.0d, this.c);
        double dE = this.a.e();
        Double.isNaN(dE);
        return (long) Math.min(dPow + dE, e);
    }

    private static boolean c(int i2) {
        return i2 == 429 || (i2 >= 500 && i2 < 600);
    }

    private static boolean d(int i2) {
        return (i2 >= 200 && i2 < 300) || i2 == 401 || i2 == 404;
    }

    private synchronized void e() {
        this.c = 0;
    }

    public synchronized boolean b() {
        return this.c == 0 || this.a.a() > this.b;
    }

    public synchronized void f(int i2) {
        if (d(i2)) {
            e();
            return;
        }
        this.c++;
        this.b = this.a.a() + a(i2);
    }
}
