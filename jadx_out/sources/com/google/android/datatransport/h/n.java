package com.google.android.datatransport.h;

import android.util.Base64;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    public static abstract class a {
        public abstract n a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(com.google.android.datatransport.d dVar);
    }

    public static a a() {
        d.b bVar = new d.b();
        bVar.d(com.google.android.datatransport.d.DEFAULT);
        return bVar;
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract com.google.android.datatransport.d d();

    public n e(com.google.android.datatransport.d dVar) {
        a aVarA = a();
        aVarA.b(b());
        aVarA.d(dVar);
        aVarA.c(c());
        return aVarA.a();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = b();
        objArr[1] = d();
        objArr[2] = c() == null ? "" : Base64.encodeToString(c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
