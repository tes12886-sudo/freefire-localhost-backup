package m.h0.l.i;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import l.d0.p;
import m.a0;

/* JADX INFO: loaded from: classes.dex */
public class f implements k {
    public static final a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final j.a f2290g;
    private final Class<? super SSLSocket> a;
    private final Method b;
    private final Method c;
    private final Method d;
    private final Method e;

    public static final class a {

        /* JADX INFO: renamed from: m.h0.l.i.f$a$a, reason: collision with other inner class name */
        public static final class C0271a implements j.a {
            final /* synthetic */ String a;

            C0271a(String str) {
                this.a = str;
            }

            @Override // m.h0.l.i.j.a
            public boolean a(SSLSocket sSLSocket) {
                l.y.c.i.e(sSLSocket, "sslSocket");
                String name = sSLSocket.getClass().getName();
                l.y.c.i.d(name, "sslSocket.javaClass.name");
                return p.x(name, l.y.c.i.k(this.a, "."), false, 2, null);
            }

            @Override // m.h0.l.i.j.a
            public k b(SSLSocket sSLSocket) {
                l.y.c.i.e(sSLSocket, "sslSocket");
                return f.f.b(sSLSocket.getClass());
            }
        }

        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final f b(Class<? super SSLSocket> cls) {
            Class<? super SSLSocket> superclass = cls;
            while (superclass != null && !l.y.c.i.a(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    throw new AssertionError(l.y.c.i.k("No OpenSSLSocketImpl superclass of socket of type ", cls));
                }
            }
            l.y.c.i.c(superclass);
            return new f(superclass);
        }

        public final j.a c(String str) {
            l.y.c.i.e(str, "packageName");
            return new C0271a(str);
        }

        public final j.a d() {
            return f.f2290g;
        }
    }

    static {
        a aVar = new a(null);
        f = aVar;
        f2290g = aVar.c("com.google.android.gms.org.conscrypt");
    }

    public f(Class<? super SSLSocket> cls) throws NoSuchMethodException {
        l.y.c.i.e(cls, "sslSocketClass");
        this.a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        l.y.c.i.d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.b = declaredMethod;
        this.c = cls.getMethod("setHostname", String.class);
        this.d = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // m.h0.l.i.k
    public boolean a(SSLSocket sSLSocket) {
        l.y.c.i.e(sSLSocket, "sslSocket");
        return this.a.isInstance(sSLSocket);
    }

    @Override // m.h0.l.i.k
    public String b(SSLSocket sSLSocket) {
        l.y.c.i.e(sSLSocket, "sslSocket");
        if (!a(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.d.invoke(sSLSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            return new String(bArr, l.d0.d.b);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof NullPointerException) && l.y.c.i.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e2);
        }
    }

    @Override // m.h0.l.i.k
    public boolean c() {
        return m.h0.l.b.f.b();
    }

    @Override // m.h0.l.i.k
    public void d(SSLSocket sSLSocket, String str, List<? extends a0> list) {
        l.y.c.i.e(sSLSocket, "sslSocket");
        l.y.c.i.e(list, "protocols");
        if (a(sSLSocket)) {
            try {
                this.b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.c.invoke(sSLSocket, str);
                }
                this.e.invoke(sSLSocket, m.h0.l.h.a.c(list));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }
}
