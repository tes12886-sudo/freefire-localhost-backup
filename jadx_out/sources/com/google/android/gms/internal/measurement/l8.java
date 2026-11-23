package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l8 {
    private static volatile l8 b;
    private static volatile l8 c;
    static final l8 d = new l8(true);
    private final Map<k8, y8<?, ?>> a;

    l8() {
        this.a = new HashMap();
    }

    l8(boolean z) {
        this.a = Collections.emptyMap();
    }

    public static l8 a() {
        l8 l8Var = b;
        if (l8Var == null) {
            synchronized (l8.class) {
                l8Var = b;
                if (l8Var == null) {
                    l8Var = d;
                    b = l8Var;
                }
            }
        }
        return l8Var;
    }

    public static l8 b() {
        l8 l8Var = c;
        if (l8Var != null) {
            return l8Var;
        }
        synchronized (l8.class) {
            l8 l8Var2 = c;
            if (l8Var2 != null) {
                return l8Var2;
            }
            l8 l8VarB = t8.b(l8.class);
            c = l8VarB;
            return l8VarB;
        }
    }

    public final <ContainingType extends da> y8<ContainingType, ?> c(ContainingType containingtype, int i2) {
        return (y8) this.a.get(new k8(containingtype, i2));
    }
}
