package m.h0.l;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import l.y.c.i;
import m.a0;

/* JADX INFO: loaded from: classes.dex */
public final class e extends h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f2287i = new b(null);
    private final Method d;
    private final Method e;
    private final Method f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Class<?> f2288g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Class<?> f2289h;

    private static final class a implements InvocationHandler {
        private final List<String> a;
        private boolean b;
        private String c;

        public a(List<String> list) {
            i.e(list, "protocols");
            this.a = list;
        }

        public final String a() {
            return this.c;
        }

        public final boolean b() {
            return this.b;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            i.e(obj, "proxy");
            i.e(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (i.a(name, "supports") && i.a(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (i.a(name, "unsupported") && i.a(Void.TYPE, returnType)) {
                this.b = true;
                return null;
            }
            if (i.a(name, "protocols")) {
                if (objArr.length == 0) {
                    return this.a;
                }
            }
            if ((!i.a(name, "selectProtocol") && !i.a(name, "select")) || !i.a(String.class, returnType) || objArr.length != 1 || !(objArr[0] instanceof List)) {
                if ((!i.a(name, "protocolSelected") && !i.a(name, "selected")) || objArr.length != 1) {
                    return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
                }
                Object obj2 = objArr[0];
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                this.c = (String) obj2;
                return null;
            }
            Object obj3 = objArr[0];
            if (obj3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
            }
            List list = (List) obj3;
            int size = list.size();
            if (size >= 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    Object obj4 = list.get(i2);
                    if (obj4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    String str = (String) obj4;
                    if (this.a.contains(str)) {
                        this.c = str;
                        return str;
                    }
                    if (i2 != size) {
                        i2 = i3;
                    }
                }
            }
            String str2 = this.a.get(0);
            this.c = str2;
            return str2;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(l.y.c.f fVar) {
            this();
        }

        public final h a() {
            String property = System.getProperty("java.specification.version", "unknown");
            try {
                i.d(property, "jvmVersion");
                if (Integer.parseInt(property) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName(i.k("org.eclipse.jetty.alpn.ALPN", "$Provider"), true, null);
                Class<?> cls3 = Class.forName(i.k("org.eclipse.jetty.alpn.ALPN", "$ClientProvider"), true, null);
                Class<?> cls4 = Class.forName(i.k("org.eclipse.jetty.alpn.ALPN", "$ServerProvider"), true, null);
                Method method = cls.getMethod("put", SSLSocket.class, cls2);
                Method method2 = cls.getMethod("get", SSLSocket.class);
                Method method3 = cls.getMethod("remove", SSLSocket.class);
                i.d(method, "putMethod");
                i.d(method2, "getMethod");
                i.d(method3, "removeMethod");
                i.d(cls3, "clientProviderClass");
                i.d(cls4, "serverProviderClass");
                return new e(method, method2, method3, cls3, cls4);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }
    }

    public e(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        i.e(method, "putMethod");
        i.e(method2, "getMethod");
        i.e(method3, "removeMethod");
        i.e(cls, "clientProviderClass");
        i.e(cls2, "serverProviderClass");
        this.d = method;
        this.e = method2;
        this.f = method3;
        this.f2288g = cls;
        this.f2289h = cls2;
    }

    @Override // m.h0.l.h
    public void b(SSLSocket sSLSocket) {
        i.e(sSLSocket, "sslSocket");
        try {
            this.f.invoke(null, sSLSocket);
        } catch (IllegalAccessException e) {
            AssertionError assertionError = new AssertionError("failed to remove ALPN");
            assertionError.initCause(e);
            throw assertionError;
        } catch (InvocationTargetException e2) {
            AssertionError assertionError2 = new AssertionError("failed to remove ALPN");
            assertionError2.initCause(e2);
            throw assertionError2;
        }
    }

    @Override // m.h0.l.h
    public void e(SSLSocket sSLSocket, String str, List<? extends a0> list) {
        i.e(sSLSocket, "sslSocket");
        i.e(list, "protocols");
        try {
            this.d.invoke(null, sSLSocket, Proxy.newProxyInstance(h.class.getClassLoader(), new Class[]{this.f2288g, this.f2289h}, new a(h.a.b(list))));
        } catch (IllegalAccessException e) {
            AssertionError assertionError = new AssertionError("failed to set ALPN");
            assertionError.initCause(e);
            throw assertionError;
        } catch (InvocationTargetException e2) {
            AssertionError assertionError2 = new AssertionError("failed to set ALPN");
            assertionError2.initCause(e2);
            throw assertionError2;
        }
    }

    @Override // m.h0.l.h
    public String g(SSLSocket sSLSocket) {
        i.e(sSLSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.e.invoke(null, sSLSocket));
            if (invocationHandler == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
            a aVar = (a) invocationHandler;
            if (!aVar.b() && aVar.a() == null) {
                h.k(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            }
            if (aVar.b()) {
                return null;
            }
            return aVar.a();
        } catch (IllegalAccessException e) {
            AssertionError assertionError = new AssertionError("failed to get ALPN selected protocol");
            assertionError.initCause(e);
            throw assertionError;
        } catch (InvocationTargetException e2) {
            AssertionError assertionError2 = new AssertionError("failed to get ALPN selected protocol");
            assertionError2.initCause(e2);
            throw assertionError2;
        }
    }
}
