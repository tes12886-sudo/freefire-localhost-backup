package com.google.android.datatransport.h.x.j;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements com.google.android.datatransport.h.u.a.b<z> {

    private static final class a {
        private static final d0 a = new d0();
    }

    public static d0 a() {
        return a.a;
    }

    public static z c() {
        z zVarC = a0.c();
        com.google.android.datatransport.h.u.a.d.c(zVarC, "Cannot return null from a non-@Nullable @Provides method");
        return zVarC;
    }

    @Override // k.a.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public z get() {
        return c();
    }
}
