package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class vf extends j {
    final boolean c;
    final boolean d;
    final /* synthetic */ wf e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf(wf wfVar, boolean z, boolean z2) {
        super("log");
        this.e = wfVar;
        this.c = z;
        this.d = z2;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final q a(v4 v4Var, List<q> list) {
        int i2;
        List<String> arrayList;
        uf ufVar;
        v5.b("log", 1, list);
        if (list.size() == 1) {
            this.e.c.a(3, v4Var.a(list.get(0)).b(), Collections.emptyList(), this.c, this.d);
        } else {
            int iG = v5.g(v4Var.a(list.get(0)).c().doubleValue());
            if (iG == 2) {
                i2 = 4;
            } else if (iG == 3) {
                i2 = 1;
            } else if (iG != 5) {
                i2 = iG != 6 ? 3 : 2;
            } else {
                i2 = 5;
            }
            String strB = v4Var.a(list.get(1)).b();
            if (list.size() == 2) {
                ufVar = this.e.c;
                arrayList = Collections.emptyList();
            } else {
                arrayList = new ArrayList<>();
                for (int i3 = 2; i3 < Math.min(list.size(), 5); i3++) {
                    arrayList.add(v4Var.a(list.get(i3)).b());
                }
                ufVar = this.e.c;
            }
            ufVar.a(i2, strB, arrayList, this.c, this.d);
        }
        return q.x;
    }
}
