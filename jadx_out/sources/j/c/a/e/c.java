package j.c.a.e;

import android.os.Handler;
import android.os.Message;
import j.c.a.e.l.e;

/* JADX INFO: loaded from: classes.dex */
public class c extends Handler implements j.c.a.e.f.c {
    private final j.c.a.e.f.c a;

    public c(j.c.a.e.f.c cVar) {
        this.a = cVar;
    }

    private String f(int i2) {
        return i2 == 0 ? "AUTH_SERVER" : "NOTIFICATION_SERVER";
    }

    @Override // j.c.a.e.f.c
    public void a(int i2) {
        obtainMessage(2, Integer.valueOf(i2)).sendToTarget();
    }

    @Override // j.c.a.e.f.c
    public void b(int i2) {
        obtainMessage(1, Integer.valueOf(i2)).sendToTarget();
    }

    @Override // j.c.a.e.f.c
    public void c(int i2) {
        obtainMessage(4, Integer.valueOf(i2)).sendToTarget();
    }

    @Override // j.c.a.e.f.c
    public void d(j.c.a.e.f.l.b bVar) {
        obtainMessage(3, bVar).sendToTarget();
    }

    @Override // j.c.a.e.f.c
    public void e(j.c.a.e.f.l.b bVar) {
        obtainMessage(0, bVar).sendToTarget();
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Object obj;
        try {
            int i2 = message.what;
            if (i2 == 0) {
                Object obj2 = message.obj;
                if (obj2 != null && (obj2 instanceof j.c.a.e.f.l.b)) {
                    j.c.a.e.f.l.b bVar = (j.c.a.e.f.l.b) obj2;
                    j.c.a.e.l.b.d("ON_PACKET_ARRIVED : " + e.a(bVar.b()));
                    j.c.a.e.l.b.c("ON_PACKET_ARRIVED : " + e.a(bVar.b()));
                    this.a.e(bVar);
                }
            } else if (i2 == 1) {
                Object obj3 = message.obj;
                if (obj3 != null && (obj3 instanceof Integer)) {
                    int iIntValue = ((Integer) obj3).intValue();
                    j.c.a.e.l.b.d("UNABLE_TO_CONNECT : " + f(iIntValue));
                    j.c.a.e.l.b.c("UNABLE_TO_CONNECT : " + f(iIntValue));
                    this.a.b(iIntValue);
                }
            } else if (i2 == 2) {
                Object obj4 = message.obj;
                if (obj4 != null && (obj4 instanceof Integer)) {
                    int iIntValue2 = ((Integer) obj4).intValue();
                    j.c.a.e.l.b.d("CONNECTION_DROPPED : " + f(iIntValue2));
                    j.c.a.e.l.b.c("CONNECTION_DROPPED : " + f(iIntValue2));
                    this.a.a(iIntValue2);
                }
            } else if (i2 == 3) {
                Object obj5 = message.obj;
                if (obj5 != null && (obj5 instanceof j.c.a.e.f.l.b)) {
                    j.c.a.e.f.l.b bVar2 = (j.c.a.e.f.l.b) obj5;
                    j.c.a.e.l.b.d("PACKET_FAILED : " + e.a(bVar2.b()));
                    j.c.a.e.l.b.c("PACKET_FAILED : " + e.a(bVar2.b()));
                    this.a.d(bVar2);
                }
            } else if (i2 == 4 && (obj = message.obj) != null && (obj instanceof Integer)) {
                int iIntValue3 = ((Integer) obj).intValue();
                j.c.a.e.l.b.d("CONNECTION_OK : " + f(iIntValue3));
                j.c.a.e.l.b.c("CONNECTION_OK : " + f(iIntValue3));
                this.a.c(iIntValue3);
            }
        } catch (Exception e) {
            j.c.a.e.l.b.b(e);
        }
    }
}
