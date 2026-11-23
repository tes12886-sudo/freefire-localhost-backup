package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    private b a;
    private b b;
    private final List<b> c;

    public c() {
        this.a = new b("", 0L, null);
        this.b = new b("", 0L, null);
        this.c = new ArrayList();
    }

    public c(b bVar) {
        this.a = bVar;
        this.b = bVar.clone();
        this.c = new ArrayList();
    }

    public final b a() {
        return this.a;
    }

    public final void b(b bVar) {
        this.a = bVar;
        this.b = bVar.clone();
        this.c.clear();
    }

    public final b c() {
        return this.b;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        c cVar = new c(this.a.clone());
        Iterator<b> it = this.c.iterator();
        while (it.hasNext()) {
            cVar.c.add(it.next().clone());
        }
        return cVar;
    }

    public final void d(b bVar) {
        this.b = bVar;
    }

    public final void e(String str, long j2, Map<String, Object> map) {
        this.c.add(new b(str, j2, map));
    }

    public final List<b> f() {
        return this.c;
    }
}
