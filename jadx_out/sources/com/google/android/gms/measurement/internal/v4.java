package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes.dex */
final class v4<V> extends FutureTask<V> implements Comparable<v4<V>> {
    private final long a;
    final boolean b;
    private final String c;
    final /* synthetic */ x4 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v4(x4 x4Var, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.d = x4Var;
        com.google.android.gms.common.internal.q.k(str);
        long andIncrement = x4.f1297l.getAndIncrement();
        this.a = andIncrement;
        this.c = str;
        this.b = z;
        if (andIncrement == Long.MAX_VALUE) {
            x4Var.a.d().o().a("Tasks index overflow");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v4(x4 x4Var, Callable<V> callable, boolean z, String str) {
        super(callable);
        this.d = x4Var;
        com.google.android.gms.common.internal.q.k("Task exception on worker thread");
        long andIncrement = x4.f1297l.getAndIncrement();
        this.a = andIncrement;
        this.c = "Task exception on worker thread";
        this.b = z;
        if (andIncrement == Long.MAX_VALUE) {
            x4Var.a.d().o().a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        v4 v4Var = (v4) obj;
        boolean z = this.b;
        if (z != v4Var.b) {
            return !z ? 1 : -1;
        }
        long j2 = this.a;
        long j3 = v4Var.a;
        if (j2 < j3) {
            return -1;
        }
        if (j2 > j3) {
            return 1;
        }
        this.d.a.d().p().b("Two tasks share the same index. index", Long.valueOf(this.a));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        this.d.a.d().o().b(this.c, th);
        super.setException(th);
    }
}
