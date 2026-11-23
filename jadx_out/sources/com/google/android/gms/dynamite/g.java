package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class g implements DynamiteModule.b {
    g() {
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0125b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0125b c0125b = new DynamiteModule.b.C0125b();
        c0125b.a = aVar.a(context, str);
        int iB = aVar.b(context, str, true);
        c0125b.b = iB;
        int i2 = c0125b.a;
        if (i2 != 0) {
            if (iB >= i2) {
                c0125b.c = 1;
            } else {
                c0125b.c = -1;
            }
        } else if (iB == 0) {
            c0125b.c = 0;
        } else {
            i2 = 0;
            if (iB >= i2) {
                c0125b.c = 1;
            } else {
                c0125b.c = -1;
            }
        }
        return c0125b;
    }
}
