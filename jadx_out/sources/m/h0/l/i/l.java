package m.h0.l.i;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes.dex */
public final class l extends f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f2291h = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }

        public static /* synthetic */ k b(a aVar, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return aVar.a(str);
        }

        public final k a(String str) {
            l.y.c.i.e(str, "packageName");
            try {
                Class<?> cls = Class.forName(l.y.c.i.k(str, ".OpenSSLSocketImpl"));
                if (cls == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>");
                }
                Class<?> cls2 = Class.forName(l.y.c.i.k(str, ".OpenSSLSocketFactoryImpl"));
                if (cls2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>");
                }
                Class<?> cls3 = Class.forName(l.y.c.i.k(str, ".SSLParametersImpl"));
                l.y.c.i.d(cls3, "paramsClass");
                return new l(cls, cls2, cls3);
            } catch (Exception e) {
                m.h0.l.h.a.g().j("unable to load android socket classes", 5, e);
                return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Class<? super SSLSocket> cls, Class<? super SSLSocketFactory> cls2, Class<?> cls3) {
        super(cls);
        l.y.c.i.e(cls, "sslSocketClass");
        l.y.c.i.e(cls2, "sslSocketFactoryClass");
        l.y.c.i.e(cls3, "paramClass");
    }
}
