package com.google.firebase.j;

import android.content.Context;
import com.google.firebase.components.Lazy;
import com.google.firebase.components.n;
import com.google.firebase.components.o;
import com.google.firebase.components.q;
import com.google.firebase.components.t;
import com.google.firebase.inject.Provider;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class d implements f {
    private static final ThreadFactory b = new ThreadFactory() { // from class: com.google.firebase.j.a
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return d.e(runnable);
        }
    };
    private Provider<g> a;

    private d(final Context context, Set<e> set) {
        this(new Lazy(new Provider() { // from class: com.google.firebase.j.b
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return g.a(context);
            }
        }), set, new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), b));
    }

    d(Provider<g> provider, Set<e> set, Executor executor) {
        this.a = provider;
    }

    public static n<f> b() {
        n.b bVarA = n.a(f.class);
        bVarA.b(t.j(Context.class));
        bVarA.b(t.k(e.class));
        bVarA.f(new q() { // from class: com.google.firebase.j.c
            @Override // com.google.firebase.components.q
            public final Object a(o oVar) {
                return d.c(oVar);
            }
        });
        return bVarA.d();
    }

    static /* synthetic */ f c(o oVar) {
        return new d((Context) oVar.a(Context.class), oVar.b(e.class));
    }

    static /* synthetic */ Thread e(Runnable runnable) {
        return new Thread(runnable, "heartbeat-information-executor");
    }

    @Override // com.google.firebase.j.f
    public f.a a(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zD = this.a.get().d(str, jCurrentTimeMillis);
        boolean zC = this.a.get().c(jCurrentTimeMillis);
        if (zD && zC) {
            return f.a.COMBINED;
        }
        if (zC) {
            return f.a.GLOBAL;
        }
        return zD ? f.a.SDK : f.a.NONE;
    }
}
