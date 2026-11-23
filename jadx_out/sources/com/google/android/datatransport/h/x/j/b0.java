package com.google.android.datatransport.h.x.j;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements com.google.android.datatransport.h.u.a.b<String> {

    private static final class a {
        private static final b0 a = new b0();
    }

    public static b0 a() {
        return a.a;
    }

    public static String b() {
        String strA = a0.a();
        com.google.android.datatransport.h.u.a.d.c(strA, "Cannot return null from a non-@Nullable @Provides method");
        return strA;
    }

    @Override // k.a.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get() {
        return b();
    }
}
