package com.facebook.internal.l0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import l.y.c.i;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    private final ConcurrentHashMap<String, ConcurrentHashMap<String, a>> a = new ConcurrentHashMap<>();

    public final List<a> a(String str) {
        i.e(str, "appId");
        ConcurrentHashMap<String, a> concurrentHashMap = this.a.get(str);
        if (concurrentHashMap == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(concurrentHashMap.size());
        Iterator<Map.Entry<String, a>> it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        return arrayList;
    }

    public final void b(String str, List<a> list) {
        i.e(str, "appId");
        i.e(list, "gateKeeperList");
        ConcurrentHashMap<String, a> concurrentHashMap = new ConcurrentHashMap<>();
        for (a aVar : list) {
            concurrentHashMap.put(aVar.a(), aVar);
        }
        this.a.put(str, concurrentHashMap);
    }
}
