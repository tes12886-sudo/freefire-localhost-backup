package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    public static final class a {
        private volatile boolean a;
        private final Context b;
        private volatile m c;

        /* synthetic */ a(Context context, z0 z0Var) {
            this.b = context;
        }

        public d a() {
            if (this.b == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
            if (this.c == null) {
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
            m mVar = this.c;
            if (!this.a) {
                throw new IllegalArgumentException("Support for pending purchases must be enabled. Enable this by calling 'enablePendingPurchases()' on BillingClientBuilder.");
            }
            m mVar2 = this.c;
            return this.c != null ? new e(null, this.a, this.b, this.c, null) : new e(null, this.a, this.b, null);
        }

        public a b() {
            this.a = true;
            return this;
        }

        public a c(m mVar) {
            this.c = mVar;
            return this;
        }
    }

    public static a e(Context context) {
        return new a(context, null);
    }

    public abstract void a(b bVar, c cVar);

    public abstract void b(i iVar, j jVar);

    public abstract h c(String str);

    public abstract h d(Activity activity, g gVar);

    @Deprecated
    public abstract void f(String str, l lVar);

    @Deprecated
    public abstract void g(n nVar, o oVar);

    public abstract void h(f fVar);
}
