package com.google.android.datatransport.h.z;

/* JADX INFO: loaded from: classes.dex */
public final class c implements com.google.android.datatransport.h.u.a.b<com.google.android.datatransport.h.z.a> {

    private static final class a {
        private static final c a = new c();
    }

    public static c a() {
        return a.a;
    }

    public static com.google.android.datatransport.h.z.a b() {
        com.google.android.datatransport.h.z.a aVarA = b.a();
        com.google.android.datatransport.h.u.a.d.c(aVarA, "Cannot return null from a non-@Nullable @Provides method");
        return aVarA;
    }

    @Override // k.a.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.google.android.datatransport.h.z.a get() {
        return b();
    }
}
