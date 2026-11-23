package com.facebook.j0;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import l.t.u;

/* JADX INFO: loaded from: classes.dex */
public final class n implements Serializable {
    private final HashMap<com.facebook.j0.a, List<c>> a;

    public static final class a implements Serializable {
        private final HashMap<com.facebook.j0.a, List<c>> a;

        public a(HashMap<com.facebook.j0.a, List<c>> map) {
            l.y.c.i.e(map, "proxyEvents");
            this.a = map;
        }

        private final Object readResolve() {
            return new n(this.a);
        }
    }

    public n() {
        this.a = new HashMap<>();
    }

    public n(HashMap<com.facebook.j0.a, List<c>> map) {
        l.y.c.i.e(map, "appEventMap");
        HashMap<com.facebook.j0.a, List<c>> map2 = new HashMap<>();
        this.a = map2;
        map2.putAll(map);
    }

    private final Object writeReplace() {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            return new a(this.a);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    public final void a(com.facebook.j0.a aVar, List<c> list) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            l.y.c.i.e(aVar, "accessTokenAppIdPair");
            l.y.c.i.e(list, "appEvents");
            if (!this.a.containsKey(aVar)) {
                this.a.put(aVar, u.R(list));
                return;
            }
            List<c> list2 = this.a.get(aVar);
            if (list2 != null) {
                list2.addAll(list);
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    public final List<c> b(com.facebook.j0.a aVar) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            l.y.c.i.e(aVar, "accessTokenAppIdPair");
            return this.a.get(aVar);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    public final Set<com.facebook.j0.a> c() {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            Set<com.facebook.j0.a> setKeySet = this.a.keySet();
            l.y.c.i.d(setKeySet, "events.keys");
            return setKeySet;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }
}
