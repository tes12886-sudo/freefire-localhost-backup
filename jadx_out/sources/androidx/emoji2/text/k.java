package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public class k extends g.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final a f360j = new a();

    public static class a {
        public Typeface a(Context context, h.h.i.f.b bVar) {
            return h.h.i.f.a(context, null, new h.h.i.f.b[]{bVar});
        }

        public h.h.i.f.a b(Context context, h.h.i.d dVar) {
            return h.h.i.f.b(context, null, dVar);
        }

        public void c(Context context, Uri uri, ContentObserver contentObserver) {
            context.getContentResolver().registerContentObserver(uri, false, contentObserver);
        }

        public void d(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements g.InterfaceC0020g {
        private final Context a;
        private final h.h.i.d b;
        private final a c;
        private final Object d = new Object();
        private Handler e;
        private Executor f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ThreadPoolExecutor f361g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private c f362h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        g.h f363i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private ContentObserver f364j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Runnable f365k;

        class a extends ContentObserver {
            a(Handler handler) {
                super(handler);
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z, Uri uri) {
                b.this.d();
            }
        }

        b(Context context, h.h.i.d dVar, a aVar) {
            h.h.k.e.g(context, "Context cannot be null");
            h.h.k.e.g(dVar, "FontRequest cannot be null");
            this.a = context.getApplicationContext();
            this.b = dVar;
            this.c = aVar;
        }

        private void b() {
            synchronized (this.d) {
                this.f363i = null;
                ContentObserver contentObserver = this.f364j;
                if (contentObserver != null) {
                    this.c.d(this.a, contentObserver);
                    this.f364j = null;
                }
                Handler handler = this.e;
                if (handler != null) {
                    handler.removeCallbacks(this.f365k);
                }
                this.e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f361g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f = null;
                this.f361g = null;
            }
        }

        private h.h.i.f.b e() {
            try {
                h.h.i.f.a aVarB = this.c.b(this.a, this.b);
                if (aVarB.c() == 0) {
                    h.h.i.f.b[] bVarArrB = aVarB.b();
                    if (bVarArrB == null || bVarArrB.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return bVarArrB[0];
                }
                throw new RuntimeException("fetchFonts failed (" + aVarB.c() + ")");
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }

        private void f(Uri uri, long j2) {
            synchronized (this.d) {
                Handler handlerC = this.e;
                if (handlerC == null) {
                    handlerC = e.c();
                    this.e = handlerC;
                }
                if (this.f364j == null) {
                    a aVar = new a(handlerC);
                    this.f364j = aVar;
                    this.c.c(this.a, uri, aVar);
                }
                if (this.f365k == null) {
                    this.f365k = new Runnable() { // from class: androidx.emoji2.text.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.d();
                        }
                    };
                }
                handlerC.postDelayed(this.f365k, j2);
            }
        }

        @Override // androidx.emoji2.text.g.InterfaceC0020g
        public void a(g.h hVar) {
            h.h.k.e.g(hVar, "LoaderCallback cannot be null");
            synchronized (this.d) {
                this.f363i = hVar;
            }
            d();
        }

        void c() {
            synchronized (this.d) {
                if (this.f363i == null) {
                    return;
                }
                try {
                    h.h.i.f.b bVarE = e();
                    int iB = bVarE.b();
                    if (iB == 2) {
                        synchronized (this.d) {
                            c cVar = this.f362h;
                            if (cVar != null) {
                                long jA = cVar.a();
                                if (jA >= 0) {
                                    f(bVarE.d(), jA);
                                    return;
                                }
                            }
                        }
                    }
                    if (iB != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + iB + ")");
                    }
                    try {
                        h.h.h.j.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        Typeface typefaceA = this.c.a(this.a, bVarE);
                        ByteBuffer byteBufferF = h.h.e.l.f(this.a, null, bVarE.d());
                        if (byteBufferF == null || typefaceA == null) {
                            throw new RuntimeException("Unable to open file.");
                        }
                        m mVarB = m.b(typefaceA, byteBufferF);
                        h.h.h.j.b();
                        synchronized (this.d) {
                            g.h hVar = this.f363i;
                            if (hVar != null) {
                                hVar.b(mVarB);
                            }
                        }
                        b();
                    } catch (Throwable th) {
                        h.h.h.j.b();
                        throw th;
                    }
                } catch (Throwable th2) {
                    synchronized (this.d) {
                        g.h hVar2 = this.f363i;
                        if (hVar2 != null) {
                            hVar2.a(th2);
                        }
                        b();
                    }
                }
            }
        }

        void d() {
            synchronized (this.d) {
                if (this.f363i == null) {
                    return;
                }
                if (this.f == null) {
                    ThreadPoolExecutor threadPoolExecutorA = e.a("emojiCompat");
                    this.f361g = threadPoolExecutorA;
                    this.f = threadPoolExecutorA;
                }
                this.f.execute(new Runnable() { // from class: androidx.emoji2.text.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.c();
                    }
                });
            }
        }

        public void g(Executor executor) {
            synchronized (this.d) {
                this.f = executor;
            }
        }
    }

    public static abstract class c {
        public abstract long a();
    }

    public k(Context context, h.h.i.d dVar) {
        super(new b(context, dVar, f360j));
    }

    public k c(Executor executor) {
        ((b) a()).g(executor);
        return this;
    }
}
