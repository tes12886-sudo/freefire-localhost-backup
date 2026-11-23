package com.facebook.internal;

import java.util.EnumSet;

/* JADX INFO: loaded from: classes.dex */
public enum g0 {
    /* JADX INFO: Fake field, exist only in values array */
    None(0),
    Enabled(1),
    RequireConfirm(2);

    private static final EnumSet<g0> e;
    public static final a f = new a(null);
    private final long a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }

        public final EnumSet<g0> a(long j2) {
            EnumSet<g0> enumSetNoneOf = EnumSet.noneOf(g0.class);
            for (g0 g0Var : g0.e) {
                if ((g0Var.c() & j2) != 0) {
                    enumSetNoneOf.add(g0Var);
                }
            }
            l.y.c.i.d(enumSetNoneOf, "result");
            return enumSetNoneOf;
        }
    }

    static {
        EnumSet<g0> enumSetAllOf = EnumSet.allOf(g0.class);
        l.y.c.i.d(enumSetAllOf, "EnumSet.allOf(SmartLoginOption::class.java)");
        e = enumSetAllOf;
    }

    g0(long j2) {
        this.a = j2;
    }

    public final long c() {
        return this.a;
    }
}
