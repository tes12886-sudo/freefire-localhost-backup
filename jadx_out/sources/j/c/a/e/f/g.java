package j.c.a.e.f;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public class g extends Handler implements e {
    private final e a;

    public g(Looper looper, e eVar) {
        super(looper);
        this.a = eVar;
    }

    @Override // j.c.a.e.f.e
    public void e(j.c.a.e.f.l.b bVar) {
        obtainMessage(0, bVar).sendToTarget();
    }

    @Override // j.c.a.e.f.e
    public void g(int i2) {
        obtainMessage(1, Integer.valueOf(i2)).sendToTarget();
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Object obj;
        int i2 = message.what;
        if (i2 != 0) {
            if (i2 == 1 && (obj = message.obj) != null) {
                this.a.g(((Integer) obj).intValue());
                return;
            }
            return;
        }
        Object obj2 = message.obj;
        if (obj2 != null) {
            this.a.e((j.c.a.e.f.l.b) obj2);
        }
    }
}
