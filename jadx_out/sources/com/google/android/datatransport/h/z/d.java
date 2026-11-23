package com.google.android.datatransport.h.z;

/* JADX INFO: loaded from: classes.dex */
public final class d implements com.google.android.datatransport.h.u.a.b<com.google.android.datatransport.h.z.a> {

    private static final class a {
        private static final d a = new d();
    }

    public static d a() {
        return a.a;
    }

    public static com.google.android.datatransport.h.z.a c() {
        com.google.android.datatransport.h.z.a aVarB = b.b();
        com.google.android.datatransport.h.u.a.d.c(aVarB, "Cannot return null from a non-@Nullable @Provides method");
        return aVarB;
    }

    @Override // k.a.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.google.android.datatransport.h.z.a get() {
        return c();
    }
}
