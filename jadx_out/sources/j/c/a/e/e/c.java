package j.c.a.e.e;

import android.content.Context;
import com.FF.voiceengine.FFVoiceConst;
import com.appff.haptic.base.Utils;

/* JADX INFO: loaded from: classes.dex */
public class c implements j.c.a.e.f.c {
    private final Context a;
    private j.c.a.e.f.d b;
    private j.c.a.e.f.b c;
    private int e = Utils.MAX_DURATION;
    private final j.c.a.e.g.b f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private j.c.a.e.g.b f1916g = new b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private j.c.a.e.g.b f1917h = new C0225c();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private j.c.a.e.g.b f1918i = new d();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final j.c.a.e.g.b f1919j = new e();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final j.c.a.e.g.b f1920k = new f();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final j.c.a.e.g.b f1921l = new g();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private j.c.a.e.g.b f1922m = new h();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private j.c.a.e.l.b.a f1923n = new i();
    private j.c.a.e.c d = new j.c.a.e.c(this);

    class a implements j.c.a.e.g.b {
        a() {
        }

        @Override // j.c.a.e.g.b
        public void a(j.c.a.e.g.c.a aVar) {
            j.c.a.e.l.b.a("received gip == 0, reconnect to auth server");
            if (c.this.a != null) {
                j.c.a.e.l.a.g(c.this.a, 600000);
            }
        }
    }

    class b implements j.c.a.e.g.b {
        b() {
        }

        @Override // j.c.a.e.g.b
        public void a(j.c.a.e.g.c.a aVar) {
            if (System.currentTimeMillis() - j.c.a.e.i.a.g() >= 86400000) {
                c.this.s();
            } else {
                c.this.q();
            }
        }
    }

    /* JADX INFO: renamed from: j.c.a.e.e.c$c, reason: collision with other inner class name */
    class C0225c implements j.c.a.e.g.b {
        C0225c() {
        }

        @Override // j.c.a.e.g.b
        public void a(j.c.a.e.g.c.a aVar) {
            if (c.this.v()) {
                if (!j.c.a.e.l.c.d(c.this.a)) {
                    c.this.w();
                } else if (c.this.b.l()) {
                    c.this.B(Utils.MAX_DURATION);
                }
            }
        }
    }

    class d implements j.c.a.e.g.b {
        d() {
        }

        @Override // j.c.a.e.g.b
        public void a(j.c.a.e.g.c.a aVar) {
            if (c.this.v()) {
                c.this.c.c(j.c.a.e.l.e.d());
            }
        }
    }

    class e implements j.c.a.e.g.b {
        e() {
        }

        @Override // j.c.a.e.g.b
        public void a(j.c.a.e.g.c.a aVar) {
            c.this.q();
        }
    }

    class f implements j.c.a.e.g.b {
        f() {
        }

        @Override // j.c.a.e.g.b
        public void a(j.c.a.e.g.c.a aVar) {
            c.this.r();
        }
    }

    class g implements j.c.a.e.g.b {
        g() {
        }

        @Override // j.c.a.e.g.b
        public void a(j.c.a.e.g.c.a aVar) {
            if (aVar.a instanceof j.c.a.e.f.l.b) {
                c.this.c.c((j.c.a.e.f.l.b) aVar.a);
            }
        }
    }

    class h implements j.c.a.e.g.b {
        h() {
        }

        @Override // j.c.a.e.g.b
        public void a(j.c.a.e.g.c.a aVar) {
            if (aVar.a instanceof j.c.a.e.f.l.b) {
                c.this.c.c((j.c.a.e.f.l.b) aVar.a);
            }
        }
    }

    class i extends j.c.a.e.l.b.a {
        i() {
        }

        @Override // j.c.a.e.l.b.a, java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            super.uncaughtException(thread, th);
            c cVar = c.this;
            cVar.B(cVar.u());
        }
    }

    public c(Context context) {
        this.a = context;
        x();
    }

    private void A() {
        j.c.a.e.l.b.d("SCHEDULE_PING_ALARM");
        j.c.a.e.l.a.f(this.a);
        j.c.a.e.l.a.e(this.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(int i2) {
        j.c.a.e.l.b.d("SCHEDULE_WAKE_CONNECT : " + i2);
        j.c.a.e.l.b.c("SCHEDULE_WAKE_CONNECT : " + i2);
        j.c.a.e.l.a.b(this.a);
        j.c.a.e.l.a.a(this.a);
        j.c.a.e.l.a.g(this.a, i2);
    }

    private void C() {
        this.c.c(j.c.a.e.l.e.b());
    }

    private void D() {
        this.c.c(j.c.a.e.l.e.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        j.c.a.e.f.d dVar = this.b;
        if (dVar == null || !dVar.isAlive()) {
            j.c.a.e.f.d dVar2 = new j.c.a.e.f.d(this.d);
            this.b = dVar2;
            dVar2.start();
            this.b.setUncaughtExceptionHandler(this.f1923n);
            this.c = this.b.j();
        }
        this.c.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        j.c.a.e.f.d dVar = this.b;
        if (dVar == null || !dVar.isAlive()) {
            j.c.a.e.f.d dVar2 = new j.c.a.e.f.d(this.d);
            this.b = dVar2;
            dVar2.start();
            this.b.setUncaughtExceptionHandler(this.f1923n);
            this.c = this.b.j();
        }
        this.c.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        j.c.a.e.f.d dVar = this.b;
        if (dVar == null || !dVar.isAlive()) {
            j.c.a.e.f.d dVar2 = new j.c.a.e.f.d(this.d);
            this.b = dVar2;
            dVar2.start();
            this.b.setUncaughtExceptionHandler(this.f1923n);
            this.c = this.b.j();
        }
        this.c.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int u() {
        int i2 = this.e;
        int i3 = i2 <= 600000 ? i2 : 600000;
        this.e = i2 * 2;
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean v() {
        return (this.b == null || this.c == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        j.c.a.e.l.b.d("NOTIFY_INTERNET_DISCONNECTED");
        j.c.a.e.l.b.c("NOTIFY_INTERNET_DISCONNECTED");
        j.c.a.e.l.a.b(this.a);
        j.c.a.e.l.a.a(this.a);
        j.c.a.e.a.a().b();
    }

    private void x() {
        j.c.a.e.a.b().c("WAKE_CONNECT", this.f1916g);
        j.c.a.e.a.b().c("SHORT_PING", this.f1917h);
        j.c.a.e.a.b().c("LONG_PING", this.f1918i);
        j.c.a.e.a.b().c("CONNECT_NOTIFICATION_SERVER", this.f1920k);
        j.c.a.e.a.b().c("ACK_PUSH_MSG", this.f1921l);
        j.c.a.e.a.b().c("PERFORM_PING", this.f1922m);
        j.c.a.e.a.b().c("CONNECT_AUTHENTICATION_SERVER", this.f1919j);
        j.c.a.e.a.b().c("RECONNECT_WHEN_INVALID_GIP_RECEIVED", this.f);
    }

    private void y() {
        this.c.c(j.c.a.e.l.e.c(j.c.a.e.i.a.d()));
    }

    private void z() {
        this.e = Utils.MAX_DURATION;
    }

    public void E() {
        B(FFVoiceConst.FFVoice_RTC_SERVER_REGION.RTC_EXT_SERVER);
    }

    @Override // j.c.a.e.f.c
    public void a(int i2) {
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            if (j.c.a.e.l.c.d(this.a)) {
                B(u());
            } else {
                w();
            }
        }
    }

    @Override // j.c.a.e.f.c
    public void b(int i2) {
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            if (j.c.a.e.l.c.d(this.a)) {
                B(u());
            } else {
                w();
            }
        }
    }

    @Override // j.c.a.e.f.c
    public void c(int i2) {
        if (i2 == 0) {
            j.c.a.e.l.b.a("onConnectionOK, sendAuthPacket()");
            C();
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    return;
                }
                j.c.a.e.l.b.a("onConnectionOK, sendRegionPacket()");
                D();
                return;
            }
            j.c.a.e.l.b.a("onConnectionOK, requestNotification()");
            y();
            A();
            z();
        }
    }

    @Override // j.c.a.e.f.c
    public void d(j.c.a.e.f.l.b bVar) {
        if (j.c.a.e.l.c.d(this.a)) {
            B(u());
        } else {
            w();
        }
    }

    @Override // j.c.a.e.f.c
    public void e(j.c.a.e.f.l.b bVar) {
        j.c.a.e.f.f.c(bVar);
    }

    public void p() {
        j.c.a.e.l.a.a(this.a);
        j.c.a.e.l.a.b(this.a);
        j.c.a.e.l.a.c(this.a);
    }

    public void t() {
        j.c.a.e.a.b().a();
        this.d = null;
        j.c.a.e.f.d dVar = this.b;
        if (dVar != null) {
            dVar.quit();
        }
    }
}
