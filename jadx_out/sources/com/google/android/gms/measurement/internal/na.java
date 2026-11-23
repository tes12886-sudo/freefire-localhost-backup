package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.ed;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class na {
    private String a;
    private boolean b;
    private com.google.android.gms.internal.measurement.z4 c;
    private BitSet d;
    private BitSet e;
    private Map<Integer, Long> f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<Integer, List<Long>> f1246g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ sa f1247h;

    /* synthetic */ na(sa saVar, String str, com.google.android.gms.internal.measurement.z4 z4Var, BitSet bitSet, BitSet bitSet2, Map map, Map map2, ma maVar) {
        this.f1247h = saVar;
        this.a = str;
        this.d = bitSet;
        this.e = bitSet2;
        this.f = map;
        this.f1246g = new h.f.a();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f1246g.put(num, arrayList);
        }
        this.b = false;
        this.c = z4Var;
    }

    /* synthetic */ na(sa saVar, String str, ma maVar) {
        this.f1247h = saVar;
        this.a = str;
        this.b = true;
        this.d = new BitSet();
        this.e = new BitSet();
        this.f = new h.f.a();
        this.f1246g = new h.f.a();
    }

    final void a(qa qaVar) {
        int iA = qaVar.a();
        Boolean bool = qaVar.c;
        if (bool != null) {
            this.e.set(iA, bool.booleanValue());
        }
        Boolean bool2 = qaVar.d;
        if (bool2 != null) {
            this.d.set(iA, bool2.booleanValue());
        }
        if (qaVar.e != null) {
            Map<Integer, Long> map = this.f;
            Integer numValueOf = Integer.valueOf(iA);
            Long l2 = map.get(numValueOf);
            long jLongValue = qaVar.e.longValue() / 1000;
            if (l2 == null || jLongValue > l2.longValue()) {
                this.f.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (qaVar.f != null) {
            Map<Integer, List<Long>> map2 = this.f1246g;
            Integer numValueOf2 = Integer.valueOf(iA);
            List<Long> arrayList = map2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f1246g.put(numValueOf2, arrayList);
            }
            if (qaVar.b()) {
                arrayList.clear();
            }
            ed.a();
            f fVarZ = this.f1247h.a.z();
            String str = this.a;
            d3<Boolean> d3Var = f3.a0;
            if (fVarZ.w(str, d3Var) && qaVar.c()) {
                arrayList.clear();
            }
            ed.a();
            boolean zW = this.f1247h.a.z().w(this.a, d3Var);
            Long lValueOf = Long.valueOf(qaVar.f.longValue() / 1000);
            if (!zW) {
                arrayList.add(lValueOf);
            } else {
                if (arrayList.contains(lValueOf)) {
                    return;
                }
                arrayList.add(lValueOf);
            }
        }
    }

    final com.google.android.gms.internal.measurement.g4 b(int i2) {
        ArrayList arrayList;
        List listEmptyList;
        com.google.android.gms.internal.measurement.f4 f4VarE = com.google.android.gms.internal.measurement.g4.E();
        f4VarE.w(i2);
        f4VarE.z(this.b);
        com.google.android.gms.internal.measurement.z4 z4Var = this.c;
        if (z4Var != null) {
            f4VarE.y(z4Var);
        }
        com.google.android.gms.internal.measurement.y4 y4VarI = com.google.android.gms.internal.measurement.z4.I();
        y4VarI.y(x9.E(this.d));
        y4VarI.w(x9.E(this.e));
        Map<Integer, Long> map = this.f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            Iterator<Integer> it = this.f.keySet().iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                Long l2 = this.f.get(Integer.valueOf(iIntValue));
                if (l2 != null) {
                    com.google.android.gms.internal.measurement.h4 h4VarB = com.google.android.gms.internal.measurement.i4.B();
                    h4VarB.w(iIntValue);
                    h4VarB.x(l2.longValue());
                    arrayList2.add(h4VarB.p());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            y4VarI.A(arrayList);
        }
        Map<Integer, List<Long>> map2 = this.f1246g;
        if (map2 == null) {
            listEmptyList = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num : this.f1246g.keySet()) {
                com.google.android.gms.internal.measurement.a5 a5VarC = com.google.android.gms.internal.measurement.b5.C();
                a5VarC.w(num.intValue());
                List<Long> list = this.f1246g.get(num);
                if (list != null) {
                    Collections.sort(list);
                    a5VarC.x(list);
                }
                arrayList3.add((com.google.android.gms.internal.measurement.b5) a5VarC.p());
            }
            listEmptyList = arrayList3;
        }
        y4VarI.C(listEmptyList);
        f4VarE.x(y4VarI);
        return (com.google.android.gms.internal.measurement.g4) f4VarE.p();
    }
}
