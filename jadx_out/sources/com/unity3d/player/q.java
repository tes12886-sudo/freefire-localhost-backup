package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
final class q {
    private UnityPlayer a;
    private a c;
    private Context b = null;
    private final Semaphore d = new Semaphore(0);
    private final Lock e = new ReentrantLock();
    private p f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f1532g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1533h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f1534i = false;

    /* JADX INFO: renamed from: com.unity3d.player.q$1, reason: invalid class name */
    final class AnonymousClass1 implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ int b;
        final /* synthetic */ int c;
        final /* synthetic */ int d;
        final /* synthetic */ boolean e;
        final /* synthetic */ long f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f1535g;

        AnonymousClass1(String str, int i2, int i3, int i4, boolean z, long j2, long j3) {
            this.a = str;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = z;
            this.f = j2;
            this.f1535g = j3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (q.this.f != null) {
                g.Log(5, "Video already playing");
                q.this.f1532g = 2;
                q.this.d.release();
            } else {
                q.this.f = new p(q.this.b, this.a, this.b, this.c, this.d, this.e, this.f, this.f1535g, new p.a() { // from class: com.unity3d.player.q.1.1
                    @Override // com.unity3d.player.p.a
                    public final void a(int i2) {
                        q.this.e.lock();
                        q.this.f1532g = i2;
                        if (i2 == 3 && q.this.f1534i) {
                            q.this.runOnUiThread(new Runnable() { // from class: com.unity3d.player.q.1.1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    q.this.d();
                                    q.this.a.resume();
                                }
                            });
                        }
                        if (i2 != 0) {
                            q.this.d.release();
                        }
                        q.this.e.unlock();
                    }
                });
                if (q.this.f != null) {
                    q.this.a.addView(q.this.f);
                }
            }
        }
    }

    public interface a {
        void a();
    }

    q(UnityPlayer unityPlayer) {
        this.a = null;
        this.a = unityPlayer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        p pVar = this.f;
        if (pVar != null) {
            this.a.removeViewFromPlayer(pVar);
            this.f1534i = false;
            this.f.destroyPlayer();
            this.f = null;
            a aVar = this.c;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    static /* synthetic */ boolean h(q qVar) {
        qVar.f1534i = true;
        return true;
    }

    public final void a() {
        this.e.lock();
        p pVar = this.f;
        if (pVar != null) {
            if (this.f1532g == 0) {
                pVar.CancelOnPrepare();
            } else if (this.f1534i) {
                boolean zA = pVar.a();
                this.f1533h = zA;
                if (!zA) {
                    this.f.pause();
                }
            }
        }
        this.e.unlock();
    }

    public final boolean a(Context context, String str, int i2, int i3, int i4, boolean z, long j2, long j3, a aVar) {
        this.e.lock();
        this.c = aVar;
        this.b = context;
        this.d.drainPermits();
        this.f1532g = 2;
        runOnUiThread(new AnonymousClass1(str, i2, i3, i4, z, j2, j3));
        boolean z2 = false;
        try {
            this.e.unlock();
            this.d.acquire();
            this.e.lock();
            if (this.f1532g != 2) {
                z2 = true;
            }
        } catch (InterruptedException unused) {
        }
        runOnUiThread(new Runnable() { // from class: com.unity3d.player.q.2
            @Override // java.lang.Runnable
            public final void run() {
                q.this.a.pause();
            }
        });
        runOnUiThread((!z2 || this.f1532g == 3) ? new Runnable() { // from class: com.unity3d.player.q.4
            @Override // java.lang.Runnable
            public final void run() {
                q.this.d();
                q.this.a.resume();
            }
        } : new Runnable() { // from class: com.unity3d.player.q.3
            @Override // java.lang.Runnable
            public final void run() {
                if (q.this.f != null) {
                    q.this.a.addViewToPlayer(q.this.f, true);
                    q.h(q.this);
                    q.this.f.requestFocus();
                }
            }
        });
        this.e.unlock();
        return z2;
    }

    public final void b() {
        this.e.lock();
        p pVar = this.f;
        if (pVar != null && this.f1534i && !this.f1533h) {
            pVar.start();
        }
        this.e.unlock();
    }

    public final void c() {
        this.e.lock();
        p pVar = this.f;
        if (pVar != null) {
            pVar.updateVideoLayout();
        }
        this.e.unlock();
    }

    protected final void runOnUiThread(Runnable runnable) {
        Context context = this.b;
        if (context instanceof Activity) {
            ((Activity) context).runOnUiThread(runnable);
        } else {
            g.Log(5, "Not running from an Activity; Ignoring execution request...");
        }
    }
}
