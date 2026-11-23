package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class f implements DynamiteModule.b {
    f() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0125b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0125b c0125b = new DynamiteModule.b.C0125b();
        int iA = aVar.a(context, str);
        c0125b.a = iA;
        int i2 = 0;
        int iB = iA != 0 ? aVar.b(context, str, false) : aVar.b(context, str, true);
        c0125b.b = iB;
        int i3 = c0125b.a;
        if (i3 == 0) {
            if (iB == 0) {
                c0125b.c = 0;
            }
            return c0125b;
        }
        i2 = i3;
        if (i2 >= iB) {
            c0125b.c = -1;
        } else {
            c0125b.c = 1;
        }
        return c0125b;
    }
}
