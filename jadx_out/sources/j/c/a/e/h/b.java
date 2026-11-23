package j.c.a.e.h;

import android.content.Context;
import android.content.Intent;
import j.c.a.e.l.f;

/* JADX INFO: loaded from: classes.dex */
public class b extends a {
    private void c(long j2) {
        Context contextC = j.c.a.e.a.c();
        if (contextC != null) {
            Intent intent = new Intent("com.garena.android.gpns.GPID_UPDATE");
            intent.putExtra("gpid_update_intent_extra_gpid", j2);
            contextC.sendBroadcast(intent);
        }
    }

    @Override // j.c.a.e.h.a
    public int a() {
        return 17;
    }

    @Override // j.c.a.e.h.a
    public void b(byte[] bArr, int i2, int i3) {
        j.c.a.e.g.a aVarB;
        String str;
        j.c.a.d.a.c cVarB = f.b(bArr, i2, i3);
        long jLongValue = cVarB.d.longValue();
        j.c.a.e.l.b.d("GetGPidResponse gPid: " + jLongValue);
        if (jLongValue != 0) {
            if (jLongValue != -1) {
                c(jLongValue);
            }
            j.c.a.e.i.a.j(jLongValue);
            j.c.a.e.i.a.i(cVarB.e);
            aVarB = j.c.a.e.a.b();
            str = "CONNECT_NOTIFICATION_SERVER";
        } else {
            aVarB = j.c.a.e.a.b();
            str = "RECONNECT_WHEN_INVALID_GIP_RECEIVED";
        }
        aVarB.b(str, null);
    }
}
