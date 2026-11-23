package m;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface q {
    public static final q a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        /* JADX INFO: renamed from: m.q$a$a, reason: collision with other inner class name */
        private static final class C0276a implements q {
            @Override // m.q
            public List<InetAddress> a(String str) throws UnknownHostException {
                l.y.c.i.e(str, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    l.y.c.i.d(allByName, "getAllByName(hostname)");
                    return l.t.h.t(allByName);
                } catch (NullPointerException e) {
                    UnknownHostException unknownHostException = new UnknownHostException(l.y.c.i.k("Broken system behaviour for dns lookup of ", str));
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            }
        }

        private a() {
        }
    }

    static {
        a aVar = a.a;
        a = new a.C0276a();
    }

    List<InetAddress> a(String str);
}
