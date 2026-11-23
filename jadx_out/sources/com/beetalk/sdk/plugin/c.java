package com.beetalk.sdk.plugin;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.beetalk.sdk.plugin.e.b.f;
import com.beetalk.sdk.plugin.e.b.g;
import com.beetalk.sdk.plugin.e.b.h;
import com.beetalk.sdk.plugin.e.b.i;
import com.beetalk.sdk.plugin.e.c.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile c f525h;
    private final Handler a;
    private Thread b;
    private HashMap<String, com.beetalk.sdk.plugin.a> c = new HashMap<>();
    private HashMap<String, com.beetalk.sdk.plugin.b> d = new HashMap<>();
    private final HashMap<String, List<com.beetalk.sdk.plugin.b>> e = new HashMap<>();
    private HashMap<String, Object> f = new HashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private HashMap<String, Object> f526g = new HashMap<>();

    class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ com.beetalk.sdk.plugin.b b;
        final /* synthetic */ Object c;
        final /* synthetic */ Activity d;

        a(String str, com.beetalk.sdk.plugin.b bVar, Object obj, Activity activity) {
            this.a = str;
            this.b = bVar;
            this.c = obj;
            this.d = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.beetalk.sdk.x.a.i("invokePlugin: %s", this.a);
            c.this.d.put(this.a, this.b);
            c.this.f526g.put(this.a, this.c);
            com.beetalk.sdk.plugin.a aVarL = c.this.l(this.a);
            if (aVarL.a()) {
                GGPluginActivity.b(this.d, this.a, aVarL.e().intValue());
            } else {
                c.this.o(aVarL, this.d);
            }
        }
    }

    class b implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ Activity b;
        final /* synthetic */ Object c;

        b(String str, Activity activity, Object obj) {
            this.a = str;
            this.b = activity;
            this.c = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((com.beetalk.sdk.plugin.a) c.this.c.get(this.a)).a()) {
                this.b.finish();
            }
            boolean zJ = c.this.j(this.a, this.c);
            boolean zI = c.this.i(this.a, this.c);
            if (zJ || zI) {
                c.this.f.remove(this.a);
            } else {
                c.this.f.put(this.a, this.c);
            }
        }
    }

    /* JADX INFO: renamed from: com.beetalk.sdk.plugin.c$c, reason: collision with other inner class name */
    class RunnableC0033c implements Runnable {
        final /* synthetic */ com.beetalk.sdk.plugin.a a;
        final /* synthetic */ Activity b;

        RunnableC0033c(com.beetalk.sdk.plugin.a aVar, Activity activity) {
            this.a = aVar;
            this.b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.b(this.b, c.this.f526g.remove(this.a.d()));
        }
    }

    private c() {
        a();
        this.a = new Handler(Looper.getMainLooper());
        this.b = Looper.getMainLooper().getThread();
    }

    private void a() {
        h(new com.beetalk.sdk.plugin.e.h.a());
        h(new com.beetalk.sdk.plugin.e.c.b());
        h(new com.beetalk.sdk.plugin.e.g.b());
        h(new com.beetalk.sdk.plugin.e.g.a());
        h(new com.beetalk.sdk.plugin.e.c.c());
        h(new e());
        h(new com.beetalk.sdk.plugin.e.c.d());
        h(new com.beetalk.sdk.plugin.e.d.b());
        h(new com.beetalk.sdk.plugin.e.d.a());
        h(new com.beetalk.sdk.plugin.e.d.c());
        h(new h());
        h(new i());
        h(new com.beetalk.sdk.plugin.e.b.e());
        h(new f());
        h(new com.beetalk.sdk.plugin.e.f.a());
        h(new com.beetalk.sdk.plugin.e.b.d());
        h(new com.beetalk.sdk.plugin.e.b.b());
        h(new com.beetalk.sdk.plugin.e.b.c());
        h(new g());
        h(new com.beetalk.sdk.plugin.e.i.e());
        h(new com.beetalk.sdk.plugin.e.e.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> boolean i(String str, T t) {
        List<com.beetalk.sdk.plugin.b> list = this.e.get(str);
        if (list == null || list.size() <= 0) {
            return false;
        }
        Iterator<com.beetalk.sdk.plugin.b> it = list.iterator();
        while (it.hasNext()) {
            it.next().onPluginResult(t);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> boolean j(String str, T t) {
        com.beetalk.sdk.plugin.b bVarRemove = this.d.remove(str);
        if (bVarRemove == null) {
            return false;
        }
        bVarRemove.onPluginResult(t);
        return true;
    }

    public static c k() {
        if (f525h == null) {
            synchronized (c.class) {
                if (f525h == null) {
                    f525h = new c();
                }
            }
        }
        return f525h;
    }

    private void p(Runnable runnable) {
        if (Thread.currentThread() == this.b) {
            runnable.run();
        } else {
            this.a.post(runnable);
        }
    }

    public void h(com.beetalk.sdk.plugin.a aVar) {
        if (!this.c.containsKey(aVar.d())) {
            this.c.put(aVar.d(), aVar);
            return;
        }
        throw new ExceptionInInitializerError("Plugin Already exists for Key: " + aVar.d());
    }

    public com.beetalk.sdk.plugin.a l(String str) {
        return this.c.get(str);
    }

    public <T> void m(Activity activity, String str, Object obj, com.beetalk.sdk.plugin.b<T> bVar) {
        p(new a(str, bVar, obj, activity));
    }

    public <T> void n(T t, Activity activity, String str) {
        p(new b(str, activity, t));
    }

    void o(com.beetalk.sdk.plugin.a aVar, Activity activity) {
        p(new RunnableC0033c(aVar, activity));
    }
}
