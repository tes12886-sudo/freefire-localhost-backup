package com.facebook.j0.w;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import l.p;
import l.t.d0;
import l.t.h0;
import l.y.c.i;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    private final com.facebook.j0.w.a a;
    private final com.facebook.j0.w.a b;
    private final com.facebook.j0.w.a c;
    private final com.facebook.j0.w.a d;
    private final com.facebook.j0.w.a e;
    private final com.facebook.j0.w.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.facebook.j0.w.a f678g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.facebook.j0.w.a f679h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.facebook.j0.w.a f680i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.facebook.j0.w.a f681j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.facebook.j0.w.a f682k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map<String, com.facebook.j0.w.a> f683l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f677n = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Map<String, String> f676m = d0.e(p.a("embedding.weight", "embed.weight"), p.a("dense1.weight", "fc1.weight"), p.a("dense2.weight", "fc2.weight"), p.a("dense3.weight", "fc3.weight"), p.a("dense1.bias", "fc1.bias"), p.a("dense2.bias", "fc2.bias"), p.a("dense3.bias", "fc3.bias"));

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }

        private final Map<String, com.facebook.j0.w.a> b(File file) {
            Map<String, com.facebook.j0.w.a> mapC = g.c(file);
            if (mapC == null) {
                return null;
            }
            HashMap map = new HashMap();
            Map mapA = b.a();
            for (Map.Entry<String, com.facebook.j0.w.a> entry : mapC.entrySet()) {
                String key = entry.getKey();
                if (mapA.containsKey(entry.getKey()) && (key = (String) mapA.get(entry.getKey())) == null) {
                    return null;
                }
                map.put(key, entry.getValue());
            }
            return map;
        }

        public final b a(File file) {
            i.e(file, "file");
            Map<String, com.facebook.j0.w.a> mapB = b(file);
            l.y.c.f fVar = null;
            if (mapB != null) {
                try {
                    return new b(mapB, fVar);
                } catch (Exception unused) {
                }
            }
            return null;
        }
    }

    private b(Map<String, com.facebook.j0.w.a> map) {
        com.facebook.j0.w.a aVar = map.get("embed.weight");
        if (aVar == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.a = aVar;
        com.facebook.j0.w.a aVar2 = map.get("convs.0.weight");
        if (aVar2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.b = f.l(aVar2);
        com.facebook.j0.w.a aVar3 = map.get("convs.1.weight");
        if (aVar3 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.c = f.l(aVar3);
        com.facebook.j0.w.a aVar4 = map.get("convs.2.weight");
        if (aVar4 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.d = f.l(aVar4);
        com.facebook.j0.w.a aVar5 = map.get("convs.0.bias");
        if (aVar5 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.e = aVar5;
        com.facebook.j0.w.a aVar6 = map.get("convs.1.bias");
        if (aVar6 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f = aVar6;
        com.facebook.j0.w.a aVar7 = map.get("convs.2.bias");
        if (aVar7 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f678g = aVar7;
        com.facebook.j0.w.a aVar8 = map.get("fc1.weight");
        if (aVar8 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f679h = f.k(aVar8);
        com.facebook.j0.w.a aVar9 = map.get("fc2.weight");
        if (aVar9 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f680i = f.k(aVar9);
        com.facebook.j0.w.a aVar10 = map.get("fc1.bias");
        if (aVar10 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f681j = aVar10;
        com.facebook.j0.w.a aVar11 = map.get("fc2.bias");
        if (aVar11 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f682k = aVar11;
        this.f683l = new HashMap();
        for (String str : h0.f(d.a.MTML_INTEGRITY_DETECT.a(), d.a.MTML_APP_EVENT_PREDICTION.a())) {
            String str2 = str + ".weight";
            String str3 = str + ".bias";
            com.facebook.j0.w.a aVar12 = map.get(str2);
            com.facebook.j0.w.a aVar13 = map.get(str3);
            if (aVar12 != null) {
                this.f683l.put(str2, f.k(aVar12));
            }
            if (aVar13 != null) {
                this.f683l.put(str3, aVar13);
            }
        }
    }

    public /* synthetic */ b(Map map, l.y.c.f fVar) {
        this(map);
    }

    public static final /* synthetic */ Map a() {
        if (com.facebook.internal.m0.i.a.d(b.class)) {
            return null;
        }
        try {
            return f676m;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, b.class);
            return null;
        }
    }

    public final com.facebook.j0.w.a b(com.facebook.j0.w.a aVar, String[] strArr, String str) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            i.e(aVar, "dense");
            i.e(strArr, "texts");
            i.e(str, "task");
            com.facebook.j0.w.a aVarC = f.c(f.e(strArr, 128, this.a), this.b);
            f.a(aVarC, this.e);
            f.i(aVarC);
            com.facebook.j0.w.a aVarC2 = f.c(aVarC, this.c);
            f.a(aVarC2, this.f);
            f.i(aVarC2);
            com.facebook.j0.w.a aVarG = f.g(aVarC2, 2);
            com.facebook.j0.w.a aVarC3 = f.c(aVarG, this.d);
            f.a(aVarC3, this.f678g);
            f.i(aVarC3);
            com.facebook.j0.w.a aVarG2 = f.g(aVarC, aVarC.b(1));
            com.facebook.j0.w.a aVarG3 = f.g(aVarG, aVarG.b(1));
            com.facebook.j0.w.a aVarG4 = f.g(aVarC3, aVarC3.b(1));
            f.f(aVarG2, 1);
            f.f(aVarG3, 1);
            f.f(aVarG4, 1);
            com.facebook.j0.w.a aVarD = f.d(f.b(new com.facebook.j0.w.a[]{aVarG2, aVarG3, aVarG4, aVar}), this.f679h, this.f681j);
            f.i(aVarD);
            com.facebook.j0.w.a aVarD2 = f.d(aVarD, this.f680i, this.f682k);
            f.i(aVarD2);
            com.facebook.j0.w.a aVar2 = this.f683l.get(str + ".weight");
            com.facebook.j0.w.a aVar3 = this.f683l.get(str + ".bias");
            if (aVar2 != null && aVar3 != null) {
                com.facebook.j0.w.a aVarD3 = f.d(aVarD2, aVar2, aVar3);
                f.j(aVarD3);
                return aVarD3;
            }
            return null;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }
}
