package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class w3 {
    final y a;
    final v4 b;
    final v4 c;
    final w7 d;

    public w3() {
        y yVar = new y();
        this.a = yVar;
        v4 v4Var = new v4(null, yVar);
        this.c = v4Var;
        this.b = v4Var.c();
        w7 w7Var = new w7();
        this.d = w7Var;
        v4Var.e("require", new yf(w7Var));
        w7Var.a("internal.platform", y2.a);
        v4Var.e("runtime.counter", new i(Double.valueOf(0.0d)));
    }

    public final q a(v4 v4Var, o5... o5VarArr) {
        q qVarB = q.x;
        for (o5 o5Var : o5VarArr) {
            qVarB = w6.b(o5Var);
            v5.k(this.c);
            if ((qVarB instanceof r) || (qVarB instanceof p)) {
                qVarB = this.a.b(v4Var, qVarB);
            }
        }
        return qVarB;
    }
}
