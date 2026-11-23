package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
final class la {
    private static final la c = new la();
    private final ConcurrentMap<Class<?>, oa<?>> b = new ConcurrentHashMap();
    private final pa a = new v9();

    private la() {
    }

    public static la a() {
        return c;
    }

    public final <T> oa<T> b(Class<T> cls) {
        g9.b(cls, "messageType");
        oa<T> oaVarA = (oa) this.b.get(cls);
        if (oaVarA == null) {
            oaVarA = this.a.a(cls);
            g9.b(cls, "messageType");
            g9.b(oaVarA, "schema");
            oa<T> oaVar = (oa) this.b.putIfAbsent(cls, oaVarA);
            if (oaVar != null) {
                return oaVar;
            }
        }
        return oaVarA;
    }
}
