package com.beetalk.sdk.z;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class e {
    private final f a;
    private final k b;
    private final g c;
    private final List<com.beetalk.sdk.z.d> d;
    private Map<String, String> e;
    private JSONObject f;

    class a implements i.g<Void, Object> {
        a() {
        }

        @Override // i.g
        public Object a(i.i<Void> iVar) {
            if (iVar.x()) {
                com.beetalk.sdk.x.a.b(iVar.s());
                if (e.this.a instanceof l) {
                    ((l) e.this.a).a("");
                } else if (e.this.a instanceof i) {
                    ((i) e.this.a).b(null);
                }
            }
            return null;
        }
    }

    class b implements i.g<j, Void> {
        b() {
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(i.i<j> iVar) {
            if (iVar.x() || iVar.t() == null) {
                if (e.this.a instanceof l) {
                    ((l) e.this.a).a("");
                } else if (e.this.a instanceof i) {
                    ((i) e.this.a).b(null);
                }
                return null;
            }
            j jVarT = iVar.t();
            if (jVarT.a) {
                e.this.a.c();
                return null;
            }
            if (e.this.a instanceof l) {
                l lVar = (l) e.this.a;
                JSONObject jSONObject = jVarT.b;
                lVar.a(jSONObject != null ? jSONObject.toString() : "");
            } else if (e.this.a instanceof i) {
                ((i) e.this.a).b(jVarT.b);
            }
            return null;
        }
    }

    class c implements Callable<j> {
        final /* synthetic */ String a;

        c(String str) {
            this.a = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j call() {
            return e.this.j(this.a);
        }
    }

    class d implements Callable<JSONObject> {
        final /* synthetic */ String a;

        d(String str) {
            this.a = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public JSONObject call() {
            int i2 = C0049e.a[e.this.b.ordinal()];
            if (i2 == 1) {
                return com.beetalk.sdk.z.h.c().g(this.a, e.this.e);
            }
            if (i2 != 2) {
                return null;
            }
            return e.this.c == g.JSON ? com.beetalk.sdk.z.h.c().l(this.a, e.this.d, e.this.f) : com.beetalk.sdk.z.h.c().j(this.a, e.this.d, e.this.e);
        }
    }

    /* JADX INFO: renamed from: com.beetalk.sdk.z.e$e, reason: collision with other inner class name */
    static /* synthetic */ class C0049e {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[k.values().length];
            a = iArr;
            try {
                iArr[k.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[k.POST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public interface f {
        void c();
    }

    private enum g {
        MAP,
        JSON
    }

    public interface h {
        void onCompleted(JSONObject jSONObject);
    }

    public interface i extends f {
        void b(JSONObject jSONObject);
    }

    public static class j {
        public final boolean a;
        public final JSONObject b;

        public j(JSONObject jSONObject, boolean z) {
            this.b = jSONObject;
            this.a = z;
        }
    }

    public enum k {
        GET,
        POST
    }

    public interface l extends f {
        void a(String str);
    }

    public static class m {
        public final boolean a;
        public final String b;

        private m(String str, boolean z) {
            this.b = str;
            this.a = z;
        }

        /* synthetic */ m(String str, boolean z, a aVar) {
            this(str, z);
        }
    }

    public e(k kVar, List<com.beetalk.sdk.z.d> list, Map<String, String> map) {
        this(kVar, list, map, null);
    }

    public e(k kVar, List<com.beetalk.sdk.z.d> list, Map<String, String> map, f fVar) {
        this.b = kVar;
        this.d = list;
        this.e = map;
        this.c = g.MAP;
        this.a = fVar;
    }

    public e(k kVar, Map<String, String> map) {
        this(kVar, (List<com.beetalk.sdk.z.d>) null, map);
    }

    public e(k kVar, Map<String, String> map, f fVar) {
        this(kVar, null, map, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public j j(String str) {
        boolean z = false;
        JSONObject jSONObject = null;
        try {
            jSONObject = (JSONObject) i.i.f1901i.submit(new d(str)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e = e;
            com.beetalk.sdk.x.a.b(e);
        } catch (ExecutionException e2) {
            e = e2;
            com.beetalk.sdk.x.a.b(e);
        } catch (TimeoutException e3) {
            com.beetalk.sdk.x.a.b(e3);
            z = true;
        }
        return new j(jSONObject, z);
    }

    public void h(String str) {
        i.i.e(new c(str)).j(new b(), i.i.f1903k).i(new a());
    }

    public m i(String str) {
        j jVarJ = j(str);
        JSONObject jSONObject = jVarJ.b;
        return new m(jSONObject != null ? jSONObject.toString() : "", jVarJ.a, null);
    }
}
