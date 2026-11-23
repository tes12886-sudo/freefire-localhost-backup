package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p extends j implements m {
    protected final List<String> c;
    protected final List<q> d;
    protected v4 e;

    private p(p pVar) {
        super(pVar.a);
        ArrayList arrayList = new ArrayList(pVar.c.size());
        this.c = arrayList;
        arrayList.addAll(pVar.c);
        ArrayList arrayList2 = new ArrayList(pVar.d.size());
        this.d = arrayList2;
        arrayList2.addAll(pVar.d);
        this.e = pVar.e;
    }

    public p(String str, List<q> list, List<q> list2, v4 v4Var) {
        super(str);
        this.c = new ArrayList();
        this.e = v4Var;
        if (!list.isEmpty()) {
            Iterator<q> it = list.iterator();
            while (it.hasNext()) {
                this.c.add(it.next().b());
            }
        }
        this.d = new ArrayList(list2);
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final q a(v4 v4Var, List<q> list) {
        String str;
        q qVarA;
        v4 v4VarC = this.e.c();
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            if (i2 < list.size()) {
                str = this.c.get(i2);
                qVarA = v4Var.a(list.get(i2));
            } else {
                str = this.c.get(i2);
                qVarA = q.x;
            }
            v4VarC.f(str, qVarA);
        }
        for (q qVar : this.d) {
            q qVarA2 = v4VarC.a(qVar);
            if (qVarA2 instanceof r) {
                qVarA2 = v4VarC.a(qVar);
            }
            if (qVarA2 instanceof h) {
                return ((h) qVarA2).a();
            }
        }
        return q.x;
    }

    @Override // com.google.android.gms.internal.measurement.j, com.google.android.gms.internal.measurement.q
    public final q j() {
        return new p(this);
    }
}
