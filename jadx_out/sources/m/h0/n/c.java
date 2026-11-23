package m.h0.n;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import l.y.c.f;
import l.y.c.i;
import m.h0.l.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final a a = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final c a(X509TrustManager x509TrustManager) {
            i.e(x509TrustManager, "trustManager");
            return h.a.g().c(x509TrustManager);
        }
    }

    public abstract List<Certificate> a(List<? extends Certificate> list, String str);
}
