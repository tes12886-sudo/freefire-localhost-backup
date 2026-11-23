package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
final class c0 implements Comparator<q> {
    final /* synthetic */ j a;
    final /* synthetic */ v4 b;

    c0(j jVar, v4 v4Var) {
        this.a = jVar;
        this.b = v4Var;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(q qVar, q qVar2) {
        q qVar3 = qVar;
        q qVar4 = qVar2;
        j jVar = this.a;
        v4 v4Var = this.b;
        if (qVar3 instanceof v) {
            return !(qVar4 instanceof v) ? 1 : 0;
        }
        if (qVar4 instanceof v) {
            return -1;
        }
        return jVar == null ? qVar3.b().compareTo(qVar4.b()) : (int) v5.i(jVar.a(v4Var, Arrays.asList(qVar3, qVar4)).c().doubleValue());
    }
}
