package com.facebook.share.b;

import com.facebook.internal.i0;

/* JADX INFO: loaded from: classes.dex */
public class d {
    public static void a(com.facebook.share.c.c cVar) {
        i0.m(cVar.d(), "message");
        if ((cVar.e() != null) ^ (cVar.a() == com.facebook.share.c.c.b.ASKFOR || cVar.a() == com.facebook.share.c.c.b.SEND)) {
            throw new IllegalArgumentException("Object id should be provided if and only if action type is send or askfor");
        }
        int i2 = cVar.f() != null ? 1 : 0;
        if (cVar.g() != null) {
            i2++;
        }
        if (cVar.c() != null) {
            i2++;
        }
        if (i2 > 1) {
            throw new IllegalArgumentException("Parameters to, filters and suggestions are mutually exclusive");
        }
    }
}
