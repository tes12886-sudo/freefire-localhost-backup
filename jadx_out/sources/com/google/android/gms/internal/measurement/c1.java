package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class c1 {
    final w3 a;
    v4 b;
    final c c;
    private final cg d;

    public c1() {
        w3 w3Var = new w3();
        this.a = w3Var;
        this.b = w3Var.b.c();
        this.c = new c();
        this.d = new cg();
        w3Var.d.a("internal.registerCallback", new Callable(this) { // from class: com.google.android.gms.internal.measurement.a
            private final c1 a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.g();
            }
        });
        w3Var.d.a("internal.eventLogger", new Callable(this) { // from class: com.google.android.gms.internal.measurement.b0
            private final c1 a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new w8(this.a.c);
            }
        });
    }

    public final void a(String str, Callable<? extends j> callable) {
        this.a.d.a(str, callable);
    }

    public final boolean b(b bVar) throws c2 {
        try {
            this.c.b(bVar);
            this.a.c.e("runtime.counter", new i(Double.valueOf(0.0d)));
            this.d.b(this.b.c(), this.c);
            return c() || d();
        } catch (Throwable th) {
            throw new c2(th);
        }
    }

    public final boolean c() {
        return !this.c.c().equals(this.c.a());
    }

    public final boolean d() {
        return !this.c.f().isEmpty();
    }

    public final c e() {
        return this.c;
    }

    public final void f(k5 k5Var) throws c2 {
        j jVar;
        try {
            this.b = this.a.b.c();
            if (this.a.a(this.b, (o5[]) k5Var.x().toArray(new o5[0])) instanceof h) {
                throw new IllegalStateException("Program loading failed");
            }
            for (i5 i5Var : k5Var.y().x()) {
                List<o5> listY = i5Var.y();
                String strX = i5Var.x();
                Iterator<o5> it = listY.iterator();
                while (it.hasNext()) {
                    q qVarA = this.a.a(this.b, it.next());
                    if (!(qVarA instanceof n)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    v4 v4Var = this.b;
                    if (v4Var.d(strX)) {
                        q qVarH = v4Var.h(strX);
                        if (!(qVarH instanceof j)) {
                            String strValueOf = String.valueOf(strX);
                            throw new IllegalStateException(strValueOf.length() != 0 ? "Invalid function name: ".concat(strValueOf) : new String("Invalid function name: "));
                        }
                        jVar = (j) qVarH;
                    } else {
                        jVar = null;
                    }
                    if (jVar == null) {
                        String strValueOf2 = String.valueOf(strX);
                        throw new IllegalStateException(strValueOf2.length() != 0 ? "Rule function is undefined: ".concat(strValueOf2) : new String("Rule function is undefined: "));
                    }
                    jVar.a(this.b, Collections.singletonList(qVarA));
                }
            }
        } catch (Throwable th) {
            throw new c2(th);
        }
    }

    final /* synthetic */ j g() {
        return new xf(this.d);
    }
}
