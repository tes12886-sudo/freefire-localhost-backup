package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wf extends j {
    private final uf c;

    public wf(uf ufVar) {
        super("internal.logger");
        this.c = ufVar;
        this.b.put("log", new vf(this, false, true));
        this.b.put("silent", new yd(this, "silent"));
        ((j) this.b.get("silent")).l("log", new vf(this, true, true));
        this.b.put("unmonitored", new ze(this, "unmonitored"));
        ((j) this.b.get("unmonitored")).l("log", new vf(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final q a(v4 v4Var, List<q> list) {
        return q.x;
    }
}
