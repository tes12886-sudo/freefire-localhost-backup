package com.facebook.j0.t;

import android.content.Context;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import l.d0.p;
import l.y.c.i;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    private static c t;
    private final Set<String> a;
    private final Context b;
    private final Object c;
    private final Class<?> d;
    private final Class<?> e;
    private final Class<?> f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Class<?> f657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Class<?> f658h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Class<?> f659i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Class<?> f660j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Method f661k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Method f662l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Method f663m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Method f664n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Method f665o;
    private final Method p;
    private final Method q;
    private final g r;
    public static final b x = new b(null);
    private static final AtomicBoolean s = new AtomicBoolean(false);
    private static final AtomicBoolean u = new AtomicBoolean(false);
    private static final Map<String, JSONObject> v = new ConcurrentHashMap();
    private static final Map<String, JSONObject> w = new ConcurrentHashMap();

    public static final class a implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return null;
            }
            try {
                i.e(obj, "proxy");
                i.e(method, "m");
                if (i.a(method.getName(), "onBillingSetupFinished")) {
                    c.x.f().set(true);
                } else {
                    String name = method.getName();
                    i.d(name, "m.name");
                    if (p.k(name, "onBillingServiceDisconnected", false, 2, null)) {
                        c.x.f().set(false);
                    }
                }
                return null;
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
                return null;
            }
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(l.y.c.f fVar) {
            this();
        }

        private final Object a(Context context, Class<?> cls) {
            Object objC;
            Object objC2;
            Class<?> clsA = h.a("com.android.billingclient.api.BillingClient$Builder");
            Class<?> clsA2 = h.a("com.android.billingclient.api.PurchasesUpdatedListener");
            if (clsA == null || clsA2 == null) {
                return null;
            }
            Method methodB = h.b(cls, "newBuilder", Context.class);
            Method methodB2 = h.b(clsA, "enablePendingPurchases", new Class[0]);
            Method methodB3 = h.b(clsA, "setListener", clsA2);
            Method methodB4 = h.b(clsA, "build", new Class[0]);
            if (methodB == null || methodB2 == null || methodB3 == null || methodB4 == null || (objC = h.c(cls, methodB, null, context)) == null) {
                return null;
            }
            Object objNewProxyInstance = Proxy.newProxyInstance(clsA2.getClassLoader(), new Class[]{clsA2}, new d());
            i.d(objNewProxyInstance, "Proxy.newProxyInstance(\n…UpdatedListenerWrapper())");
            Object objC3 = h.c(clsA, methodB3, objC, objNewProxyInstance);
            if (objC3 == null || (objC2 = h.c(clsA, methodB2, objC3, new Object[0])) == null) {
                return null;
            }
            return h.c(clsA, methodB4, objC2, new Object[0]);
        }

        private final void b(Context context) {
            g gVarB = g.f668i.b();
            if (gVarB != null) {
                Class<?> clsA = h.a("com.android.billingclient.api.BillingClient");
                Class<?> clsA2 = h.a("com.android.billingclient.api.Purchase");
                Class<?> clsA3 = h.a("com.android.billingclient.api.Purchase$PurchasesResult");
                Class<?> clsA4 = h.a("com.android.billingclient.api.SkuDetails");
                Class<?> clsA5 = h.a("com.android.billingclient.api.PurchaseHistoryRecord");
                Class<?> clsA6 = h.a("com.android.billingclient.api.SkuDetailsResponseListener");
                Class<?> clsA7 = h.a("com.android.billingclient.api.PurchaseHistoryResponseListener");
                if (clsA == null || clsA3 == null || clsA2 == null || clsA4 == null || clsA6 == null || clsA5 == null || clsA7 == null) {
                    return;
                }
                Method methodB = h.b(clsA, "queryPurchases", String.class);
                Method methodB2 = h.b(clsA3, "getPurchasesList", new Class[0]);
                Method methodB3 = h.b(clsA2, "getOriginalJson", new Class[0]);
                Method methodB4 = h.b(clsA4, "getOriginalJson", new Class[0]);
                Method methodB5 = h.b(clsA5, "getOriginalJson", new Class[0]);
                Method methodB6 = h.b(clsA, "querySkuDetailsAsync", gVarB.e(), clsA6);
                Method methodB7 = h.b(clsA, "queryPurchaseHistoryAsync", String.class, clsA7);
                if (methodB == null || methodB2 == null || methodB3 == null || methodB4 == null || methodB5 == null || methodB6 == null || methodB7 == null) {
                    return;
                }
                Object objA = a(context, clsA);
                if (objA != null) {
                    c.m(new c(context, objA, clsA, clsA3, clsA2, clsA4, clsA5, clsA6, clsA7, methodB, methodB2, methodB3, methodB4, methodB5, methodB6, methodB7, gVarB, null));
                    c cVarF = c.f();
                    if (cVarF == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper");
                    }
                    c.n(cVarF);
                }
            }
        }

        public final synchronized c c(Context context) {
            i.e(context, "context");
            if (c.e().get()) {
                return c.f();
            }
            b(context);
            c.e().set(true);
            return c.f();
        }

        public final Map<String, JSONObject> d() {
            return c.g();
        }

        public final Map<String, JSONObject> e() {
            return c.j();
        }

        public final AtomicBoolean f() {
            return c.k();
        }
    }

    /* JADX INFO: renamed from: com.facebook.j0.t.c$c, reason: collision with other inner class name */
    public final class C0084c implements InvocationHandler {
        private Runnable a;
        final /* synthetic */ c b;

        public C0084c(c cVar, Runnable runnable) {
            i.e(runnable, "runnable");
            this.b = cVar;
            this.a = runnable;
        }

        private final void a(List<?> list) {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                Iterator<?> it = list.iterator();
                while (it.hasNext()) {
                    try {
                        Object objC = h.c(c.h(this.b), c.b(this.b), it.next(), new Object[0]);
                        if (!(objC instanceof String)) {
                            objC = null;
                        }
                        String str = (String) objC;
                        if (str != null) {
                            JSONObject jSONObject = new JSONObject(str);
                            jSONObject.put("packageName", c.a(this.b).getPackageName());
                            if (jSONObject.has("productId")) {
                                String string = jSONObject.getString("productId");
                                c.d(this.b).add(string);
                                Map<String, JSONObject> mapD = c.x.d();
                                i.d(string, "skuID");
                                mapD.put(string, jSONObject);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                this.a.run();
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return null;
            }
            try {
                i.e(obj, "proxy");
                i.e(method, "method");
                if (i.a(method.getName(), "onPurchaseHistoryResponse")) {
                    Object obj2 = objArr != null ? objArr[1] : null;
                    if (obj2 != null && (obj2 instanceof List)) {
                        a((List) obj2);
                    }
                }
                return null;
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
                return null;
            }
        }
    }

    public static final class d implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return null;
            }
            try {
                i.e(obj, "proxy");
                i.e(method, "m");
                return null;
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
                return null;
            }
        }
    }

    public final class e implements InvocationHandler {
        private Runnable a;
        final /* synthetic */ c b;

        public e(c cVar, Runnable runnable) {
            i.e(runnable, "runnable");
            this.b = cVar;
            this.a = runnable;
        }

        public final void a(List<?> list) {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                i.e(list, "skuDetailsObjectList");
                Iterator<?> it = list.iterator();
                while (it.hasNext()) {
                    try {
                        Object objC = h.c(c.i(this.b), c.c(this.b), it.next(), new Object[0]);
                        if (!(objC instanceof String)) {
                            objC = null;
                        }
                        String str = (String) objC;
                        if (str != null) {
                            JSONObject jSONObject = new JSONObject(str);
                            if (jSONObject.has("productId")) {
                                String string = jSONObject.getString("productId");
                                Map<String, JSONObject> mapE = c.x.e();
                                i.d(string, "skuID");
                                mapE.put(string, jSONObject);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                this.a.run();
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return null;
            }
            try {
                i.e(obj, "proxy");
                i.e(method, "m");
                if (i.a(method.getName(), "onSkuDetailsResponse")) {
                    Object obj2 = objArr != null ? objArr[1] : null;
                    if (obj2 != null && (obj2 instanceof List)) {
                        a((List) obj2);
                    }
                }
                return null;
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
                return null;
            }
        }
    }

    static final class f implements Runnable {
        final /* synthetic */ Runnable b;

        f(Runnable runnable) {
            this.b = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                c.l(c.this, "inapp", new ArrayList(c.d(c.this)), this.b);
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    private c(Context context, Object obj, Class<?> cls, Class<?> cls2, Class<?> cls3, Class<?> cls4, Class<?> cls5, Class<?> cls6, Class<?> cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, g gVar) {
        this.b = context;
        this.c = obj;
        this.d = cls;
        this.e = cls2;
        this.f = cls3;
        this.f657g = cls4;
        this.f658h = cls5;
        this.f659i = cls6;
        this.f660j = cls7;
        this.f661k = method;
        this.f662l = method2;
        this.f663m = method3;
        this.f664n = method4;
        this.f665o = method5;
        this.p = method6;
        this.q = method7;
        this.r = gVar;
        this.a = new CopyOnWriteArraySet();
    }

    public /* synthetic */ c(Context context, Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, g gVar, l.y.c.f fVar) {
        this(context, obj, cls, cls2, cls3, cls4, cls5, cls6, cls7, method, method2, method3, method4, method5, method6, method7, gVar);
    }

    public static final /* synthetic */ Context a(c cVar) {
        if (com.facebook.internal.m0.i.a.d(c.class)) {
            return null;
        }
        try {
            return cVar.b;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c.class);
            return null;
        }
    }

    public static final /* synthetic */ Method b(c cVar) {
        if (com.facebook.internal.m0.i.a.d(c.class)) {
            return null;
        }
        try {
            return cVar.f665o;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c.class);
            return null;
        }
    }

    public static final /* synthetic */ Method c(c cVar) {
        if (com.facebook.internal.m0.i.a.d(c.class)) {
            return null;
        }
        try {
            return cVar.f664n;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c.class);
            return null;
        }
    }

    public static final /* synthetic */ Set d(c cVar) {
        if (com.facebook.internal.m0.i.a.d(c.class)) {
            return null;
        }
        try {
            return cVar.a;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c.class);
            return null;
        }
    }

    public static final /* synthetic */ AtomicBoolean e() {
        if (com.facebook.internal.m0.i.a.d(c.class)) {
            return null;
        }
        try {
            return s;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c.class);
            return null;
        }
    }

    public static final /* synthetic */ c f() {
        if (com.facebook.internal.m0.i.a.d(c.class)) {
            return null;
        }
        try {
            return t;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c.class);
            return null;
        }
    }

    public static final /* synthetic */ Map g() {
        if (com.facebook.internal.m0.i.a.d(c.class)) {
            return null;
        }
        try {
            return v;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c.class);
            return null;
        }
    }

    public static final /* synthetic */ Class h(c cVar) {
        if (com.facebook.internal.m0.i.a.d(c.class)) {
            return null;
        }
        try {
            return cVar.f658h;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c.class);
            return null;
        }
    }

    public static final /* synthetic */ Class i(c cVar) {
        if (com.facebook.internal.m0.i.a.d(c.class)) {
            return null;
        }
        try {
            return cVar.f657g;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c.class);
            return null;
        }
    }

    public static final /* synthetic */ Map j() {
        if (com.facebook.internal.m0.i.a.d(c.class)) {
            return null;
        }
        try {
            return w;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c.class);
            return null;
        }
    }

    public static final /* synthetic */ AtomicBoolean k() {
        if (com.facebook.internal.m0.i.a.d(c.class)) {
            return null;
        }
        try {
            return u;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c.class);
            return null;
        }
    }

    public static final /* synthetic */ void l(c cVar, String str, List list, Runnable runnable) {
        if (com.facebook.internal.m0.i.a.d(c.class)) {
            return;
        }
        try {
            cVar.r(str, list, runnable);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c.class);
        }
    }

    public static final /* synthetic */ void m(c cVar) {
        if (com.facebook.internal.m0.i.a.d(c.class)) {
            return;
        }
        try {
            t = cVar;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c.class);
        }
    }

    public static final /* synthetic */ void n(c cVar) {
        if (com.facebook.internal.m0.i.a.d(c.class)) {
            return;
        }
        try {
            cVar.s();
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c.class);
        }
    }

    private final void q(String str, Runnable runnable) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            Object objNewProxyInstance = Proxy.newProxyInstance(this.f660j.getClassLoader(), new Class[]{this.f660j}, new C0084c(this, runnable));
            i.d(objNewProxyInstance, "Proxy.newProxyInstance(\n…istenerWrapper(runnable))");
            h.c(this.d, this.q, this.c, str, objNewProxyInstance);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    private final void r(String str, List<String> list, Runnable runnable) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            Object objNewProxyInstance = Proxy.newProxyInstance(this.f659i.getClassLoader(), new Class[]{this.f659i}, new e(this, runnable));
            i.d(objNewProxyInstance, "Proxy.newProxyInstance(\n…istenerWrapper(runnable))");
            h.c(this.d, this.p, this.c, this.r.d(str, list), objNewProxyInstance);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    private final void s() {
        Method methodB;
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            Class<?> clsA = h.a("com.android.billingclient.api.BillingClientStateListener");
            if (clsA == null || (methodB = h.b(this.d, "startConnection", clsA)) == null) {
                return;
            }
            Object objNewProxyInstance = Proxy.newProxyInstance(clsA.getClassLoader(), new Class[]{clsA}, new a());
            i.d(objNewProxyInstance, "Proxy.newProxyInstance(\n…ntStateListenerWrapper())");
            h.c(this.d, methodB, this.c, objNewProxyInstance);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    public final void o(String str, Runnable runnable) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            i.e(str, "skuType");
            i.e(runnable, "querySkuRunnable");
            Object objC = h.c(this.e, this.f662l, h.c(this.d, this.f661k, this.c, "inapp"), new Object[0]);
            if (!(objC instanceof List)) {
                objC = null;
            }
            List list = (List) objC;
            if (list != null) {
                try {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Object objC2 = h.c(this.f, this.f663m, it.next(), new Object[0]);
                        if (!(objC2 instanceof String)) {
                            objC2 = null;
                        }
                        String str2 = (String) objC2;
                        if (str2 != null) {
                            JSONObject jSONObject = new JSONObject(str2);
                            if (jSONObject.has("productId")) {
                                String string = jSONObject.getString("productId");
                                arrayList.add(string);
                                Map<String, JSONObject> map = v;
                                i.d(string, "skuID");
                                map.put(string, jSONObject);
                            }
                        }
                    }
                    r(str, arrayList, runnable);
                } catch (JSONException unused) {
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    public final void p(String str, Runnable runnable) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            i.e(str, "skuType");
            i.e(runnable, "queryPurchaseHistoryRunnable");
            q(str, new f(runnable));
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }
}
