package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class u9 extends n {
    private final c b;

    public u9(c cVar) {
        this.b = cVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0051  */
    @Override // com.google.android.gms.internal.measurement.n, com.google.android.gms.internal.measurement.q
    public final q q(String str, v4 v4Var, List<q> list) {
        byte b;
        switch (str) {
            case "getEventName":
                b = 0;
                break;
            case "getTimestamp":
                b = 3;
                break;
            case "getParamValue":
                b = 1;
                break;
            case "getParams":
                b = 2;
                break;
            case "setParamValue":
                b = 5;
                break;
            case "setEventName":
                b = 4;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            v5.a("getEventName", 0, list);
            return new u(this.b.c().b());
        }
        if (b == 1) {
            v5.a("getParamValue", 1, list);
            return w6.a(this.b.c().e(v4Var.a(list.get(0)).b()));
        }
        if (b == 2) {
            v5.a("getParams", 0, list);
            Map<String, Object> mapF = this.b.c().f();
            n nVar = new n();
            for (String str2 : mapF.keySet()) {
                nVar.l(str2, w6.a(mapF.get(str2)));
            }
            return nVar;
        }
        if (b == 3) {
            v5.a("getTimestamp", 0, list);
            return new i(Double.valueOf(this.b.c().a()));
        }
        if (b != 4) {
            if (b != 5) {
                return super.q(str, v4Var, list);
            }
            v5.a("setParamValue", 2, list);
            String strB = v4Var.a(list.get(0)).b();
            q qVarA = v4Var.a(list.get(1));
            this.b.c().d(strB, v5.j(qVarA));
            return qVarA;
        }
        v5.a("setEventName", 1, list);
        q qVarA2 = v4Var.a(list.get(0));
        if (q.x.equals(qVarA2) || q.y.equals(qVarA2)) {
            throw new IllegalArgumentException("Illegal event name");
        }
        this.b.c().c(qVarA2.b());
        return new u(qVarA2.b());
    }
}
