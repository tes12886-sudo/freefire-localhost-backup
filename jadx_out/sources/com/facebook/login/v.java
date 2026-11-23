package com.facebook.login;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v {
    public static final String a() {
        int iG = l.a0.i.g(new l.a0.f(43, 128), l.z.c.a);
        List listI = l.t.u.I(l.t.u.I(l.t.u.I(l.t.u.I(l.t.u.H(l.t.u.G(new l.a0.c('a', 'z'), new l.a0.c('A', 'Z')), new l.a0.c('0', '9')), '-'), '.'), '_'), '~');
        ArrayList arrayList = new ArrayList(iG);
        for (int i2 = 0; i2 < iG; i2++) {
            arrayList.add(Character.valueOf(((Character) l.t.k.J(listI, l.z.c.a)).charValue()));
        }
        return l.t.u.E(arrayList, "", null, null, 0, null, null, 62, null);
    }

    public static final boolean b(String str) {
        if ((str == null || str.length() == 0) || str.length() < 43 || str.length() > 128) {
            return false;
        }
        return new l.d0.f("^[-._~A-Za-z0-9]+$").a(str);
    }
}
