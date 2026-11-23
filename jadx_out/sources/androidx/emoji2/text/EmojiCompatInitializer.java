package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements androidx.startup.b<Boolean> {

    static class a extends g.c {
        protected a(Context context) {
            super(new b(context));
            b(1);
        }
    }

    static class b implements g.InterfaceC0020g {
        private final Context a;

        class a extends g.h {
            final /* synthetic */ g.h a;
            final /* synthetic */ ThreadPoolExecutor b;

            a(b bVar, g.h hVar, ThreadPoolExecutor threadPoolExecutor) {
                this.a = hVar;
                this.b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.g.h
            public void a(Throwable th) {
                try {
                    this.a.a(th);
                } finally {
                    this.b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.g.h
            public void b(m mVar) {
                try {
                    this.a.b(mVar);
                } finally {
                    this.b.shutdown();
                }
            }
        }

        b(Context context) {
            this.a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.g.InterfaceC0020g
        public void a(final g.h hVar) {
            final ThreadPoolExecutor threadPoolExecutorA = e.a("EmojiCompatInitializer");
            threadPoolExecutorA.execute(new Runnable() { // from class: androidx.emoji2.text.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.d(hVar, threadPoolExecutorA);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void d(g.h hVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                k kVarA = f.a(this.a);
                if (kVarA == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                kVarA.c(threadPoolExecutor);
                kVarA.a().a(new a(this, hVar, threadPoolExecutor));
            } catch (Throwable th) {
                hVar.a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    static class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                h.h.h.j.a("EmojiCompat.EmojiCompatInitializer.run");
                if (g.h()) {
                    g.b().k();
                }
            } finally {
                h.h.h.j.b();
            }
        }
    }

    @Override // androidx.startup.b
    public List<Class<? extends androidx.startup.b<?>>> a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // androidx.startup.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean b(Context context) {
        if (Build.VERSION.SDK_INT < 19) {
            return Boolean.FALSE;
        }
        g.g(new a(context));
        d(context);
        return Boolean.TRUE;
    }

    void d(Context context) {
        final androidx.lifecycle.g gVarA = ((androidx.lifecycle.k) androidx.startup.a.c(context).d(ProcessLifecycleInitializer.class)).a();
        gVarA.a(new androidx.lifecycle.c() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.e
            public void a(androidx.lifecycle.k kVar) {
                EmojiCompatInitializer.this.e();
                gVarA.c(this);
            }

            @Override // androidx.lifecycle.e
            public /* synthetic */ void b(androidx.lifecycle.k kVar) {
                androidx.lifecycle.b.b(this, kVar);
            }

            @Override // androidx.lifecycle.e
            public /* synthetic */ void c(androidx.lifecycle.k kVar) {
                androidx.lifecycle.b.a(this, kVar);
            }

            @Override // androidx.lifecycle.e
            public /* synthetic */ void e(androidx.lifecycle.k kVar) {
                androidx.lifecycle.b.c(this, kVar);
            }

            @Override // androidx.lifecycle.e
            public /* synthetic */ void f(androidx.lifecycle.k kVar) {
                androidx.lifecycle.b.e(this, kVar);
            }

            @Override // androidx.lifecycle.e
            public /* synthetic */ void g(androidx.lifecycle.k kVar) {
                androidx.lifecycle.b.f(this, kVar);
            }
        });
    }

    void e() {
        e.c().postDelayed(new c(), 500L);
    }
}
