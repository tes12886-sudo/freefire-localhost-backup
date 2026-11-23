package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class v4 {
    public final v4 a;
    final y b;
    final Map<String, q> c = new HashMap();
    final Map<String, Boolean> d = new HashMap();

    public v4(v4 v4Var, y yVar) {
        this.a = v4Var;
        this.b = yVar;
    }

    public final q a(q qVar) {
        return this.b.b(this, qVar);
    }

    public final q b(f fVar) {
        q qVarB = q.x;
        Iterator<Integer> itS = fVar.s();
        while (itS.hasNext()) {
            qVarB = this.b.b(this, fVar.v(itS.next().intValue()));
            if (qVarB instanceof h) {
                break;
            }
        }
        return qVarB;
    }

    public final v4 c() {
        return new v4(this, this.b);
    }

    public final boolean d(String str) {
        if (this.c.containsKey(str)) {
            return true;
        }
        v4 v4Var = this.a;
        if (v4Var != null) {
            return v4Var.d(str);
        }
        return false;
    }

    public final void e(String str, q qVar) {
        v4 v4Var;
        if (!this.c.containsKey(str) && (v4Var = this.a) != null && v4Var.d(str)) {
            this.a.e(str, qVar);
        } else {
            if (this.d.containsKey(str)) {
                return;
            }
            if (qVar == null) {
                this.c.remove(str);
            } else {
                this.c.put(str, qVar);
            }
        }
    }

    public final void f(String str, q qVar) {
        if (this.d.containsKey(str)) {
            return;
        }
        if (qVar == null) {
            this.c.remove(str);
        } else {
            this.c.put(str, qVar);
        }
    }

    public final void g(String str, q qVar) {
        f(str, qVar);
        this.d.put(str, Boolean.TRUE);
    }

    public final q h(String str) {
        if (this.c.containsKey(str)) {
            return this.c.get(str);
        }
        v4 v4Var = this.a;
        if (v4Var != null) {
            return v4Var.h(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", str));
    }
}
