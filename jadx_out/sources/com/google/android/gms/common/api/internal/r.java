package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a.b;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes.dex */
public abstract class r<A extends com.google.android.gms.common.api.a.b, ResultT> {
    private final com.google.android.gms.common.c[] a;
    private final boolean b;
    private final int c;

    public static class a<A extends com.google.android.gms.common.api.a.b, ResultT> {
        private n a;
        private com.google.android.gms.common.c[] c;
        private boolean b = true;
        private int d = 0;

        /* synthetic */ a(f2 f2Var) {
        }

        public r<A, ResultT> a() {
            com.google.android.gms.common.internal.q.b(this.a != null, "execute parameter required");
            return new e2(this, this.c, this.b, this.d);
        }

        @CanIgnoreReturnValue
        public a<A, ResultT> b(n<A, TaskCompletionSource<ResultT>> nVar) {
            this.a = nVar;
            return this;
        }

        @CanIgnoreReturnValue
        public a<A, ResultT> c(boolean z) {
            this.b = z;
            return this;
        }

        @CanIgnoreReturnValue
        public a<A, ResultT> d(com.google.android.gms.common.c... cVarArr) {
            this.c = cVarArr;
            return this;
        }
    }

    protected r(com.google.android.gms.common.c[] cVarArr, boolean z, int i2) {
        this.a = cVarArr;
        boolean z2 = false;
        if (cVarArr != null && z) {
            z2 = true;
        }
        this.b = z2;
        this.c = i2;
    }

    public static <A extends com.google.android.gms.common.api.a.b, ResultT> a<A, ResultT> a() {
        return new a<>(null);
    }

    protected abstract void b(A a2, TaskCompletionSource<ResultT> taskCompletionSource);

    public boolean c() {
        return this.b;
    }

    public final int d() {
        return this.c;
    }

    public final com.google.android.gms.common.c[] e() {
        return this.a;
    }
}
