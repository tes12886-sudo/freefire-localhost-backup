package com.google.android.gms.internal.measurement;

import com.FF.voiceengine.FFVoiceConst;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xf extends j {
    private final cg c;

    public xf(cg cgVar) {
        super("internal.registerCallback");
        this.c = cgVar;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final q a(v4 v4Var, List<q> list) {
        v5.a(this.a, 3, list);
        String strB = v4Var.a(list.get(0)).b();
        q qVarA = v4Var.a(list.get(1));
        if (!(qVarA instanceof p)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        q qVarA2 = v4Var.a(list.get(2));
        if (!(qVarA2 instanceof n)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        n nVar = (n) qVarA2;
        if (!nVar.n("type")) {
            throw new IllegalArgumentException("Undefined rule type");
        }
        this.c.a(strB, nVar.n("priority") ? v5.g(nVar.f("priority").c().doubleValue()) : FFVoiceConst.FFVoiceEvent.FFVoice_EVENT_EOF, (p) qVarA, nVar.f("type").b());
        return q.x;
    }
}
