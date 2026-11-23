package j.c.a.e.f;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public class a extends Handler implements b {
    private final b a;

    public a(Looper looper, b bVar) {
        super(looper);
        this.a = bVar;
    }

    @Override // j.c.a.e.f.b
    public void a() {
        obtainMessage(1, null).sendToTarget();
    }

    @Override // j.c.a.e.f.b
    public void c(j.c.a.e.f.l.b bVar) {
        obtainMessage(0, bVar).sendToTarget();
    }

    @Override // j.c.a.e.f.b
    public void d() {
        obtainMessage(2, null).sendToTarget();
    }

    @Override // j.c.a.e.f.b
    public void f() {
        obtainMessage(3, null).sendToTarget();
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            Object obj = message.obj;
            if (obj != null) {
                j.c.a.e.f.l.b bVar = (j.c.a.e.f.l.b) obj;
                j.c.a.e.l.b.d("ON_PACKET_SEND : " + j.c.a.e.l.e.a(bVar.b()));
                this.a.c(bVar);
                return;
            }
            return;
        }
        if (i2 == 1) {
            j.c.a.e.l.b.d("SETUP_CONNECTION");
            this.a.a();
        } else if (i2 == 2) {
            j.c.a.e.l.b.d("AUTH_WITH_SERVER");
            this.a.d();
        } else {
            if (i2 != 3) {
                return;
            }
            j.c.a.e.l.b.d("CONNECT_REGION_SERVER");
            this.a.f();
        }
    }
}
