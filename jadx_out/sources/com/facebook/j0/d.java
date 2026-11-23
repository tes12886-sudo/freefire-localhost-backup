package com.facebook.j0;

import android.content.Context;
import com.facebook.r;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    private final HashMap<a, o> a = new HashMap<>();

    private final synchronized o e(a aVar) {
        o oVar = this.a.get(aVar);
        if (oVar == null) {
            Context contextF = r.f();
            com.facebook.internal.b bVarE = com.facebook.internal.b.f597h.e(contextF);
            oVar = bVarE != null ? new o(bVarE, g.b.b(contextF)) : null;
        }
        if (oVar == null) {
            return null;
        }
        this.a.put(aVar, oVar);
        return oVar;
    }

    public final synchronized void a(a aVar, c cVar) {
        l.y.c.i.e(aVar, "accessTokenAppIdPair");
        l.y.c.i.e(cVar, "appEvent");
        o oVarE = e(aVar);
        if (oVarE != null) {
            oVarE.a(cVar);
        }
    }

    public final synchronized void b(n nVar) {
        if (nVar == null) {
            return;
        }
        for (a aVar : nVar.c()) {
            o oVarE = e(aVar);
            if (oVarE != null) {
                List<c> listB = nVar.b(aVar);
                if (listB == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                Iterator<c> it = listB.iterator();
                while (it.hasNext()) {
                    oVarE.a(it.next());
                }
            }
        }
    }

    public final synchronized o c(a aVar) {
        l.y.c.i.e(aVar, "accessTokenAppIdPair");
        return this.a.get(aVar);
    }

    public final synchronized int d() {
        int iC;
        iC = 0;
        Iterator<o> it = this.a.values().iterator();
        while (it.hasNext()) {
            iC += it.next().c();
        }
        return iC;
    }

    public final synchronized Set<a> f() {
        Set<a> setKeySet;
        setKeySet = this.a.keySet();
        l.y.c.i.d(setKeySet, "stateMap.keys");
        return setKeySet;
    }
}
