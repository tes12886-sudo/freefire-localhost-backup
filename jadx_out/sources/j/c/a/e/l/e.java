package j.c.a.e.l;

import com.appff.haptic.base.Utils;
import j.c.a.d.a.g;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static String a(int i2) {
        if (i2 == 1) {
            return "AUTH_REQUEST";
        }
        if (i2 == 2) {
            return "CONNECTION_REQUEST";
        }
        if (i2 == 3) {
            return "PUSH_ACK";
        }
        if (i2 == 4) {
            return "PING_REQUEST";
        }
        if (i2 == 5) {
            return "REGION_REQUEST";
        }
        switch (i2) {
            case 17:
                return "AUTH_RESPONSE";
            case 18:
                return "PUSH_NOTIFICATION";
            case 19:
                return "PING_ACK";
            case 20:
                return "REGION_RESPONSE";
            default:
                return "UNKNOWN";
        }
    }

    public static j.c.a.e.f.l.b b() {
        j.c.a.d.a.b.a aVar = new j.c.a.d.a.b.a();
        aVar.d(Long.valueOf(c.b(j.c.a.e.a.c())));
        aVar.c(Long.valueOf(j.c.a.e.i.a.d()));
        j.c.a.d.a.b bVarE = aVar.e();
        j.c.a.e.f.l.b bVar = new j.c.a.e.f.l.b(1, f.a(bVarE));
        bVar.f(true);
        bVar.g(Utils.MAX_DURATION);
        b.d("auth packet: Command: " + bVar.b() + " sign: " + bVarE.d + " oldid: " + bVarE.e);
        return bVar;
    }

    public static j.c.a.e.f.l.b c(long j2) {
        j.c.a.d.a.a.C0221a c0221a = new j.c.a.d.a.a.C0221a();
        c0221a.c(Long.valueOf(j2));
        return new j.c.a.e.f.l.b(2, f.a(c0221a.d()));
    }

    public static j.c.a.e.f.l.b d() {
        j.c.a.e.f.l.b bVar = new j.c.a.e.f.l.b(4, new byte[0]);
        bVar.f(true);
        bVar.g(60000);
        return bVar;
    }

    public static j.c.a.e.f.l.b e(int i2) {
        g.a aVar = new g.a();
        aVar.c(Integer.valueOf(i2));
        return new j.c.a.e.f.l.b(3, f.a(aVar.d()));
    }

    public static j.c.a.e.f.l.b f() {
        j.c.a.e.f.l.b bVar = new j.c.a.e.f.l.b(5, new byte[0]);
        bVar.f(true);
        bVar.g(Utils.MAX_DURATION);
        return bVar;
    }
}
