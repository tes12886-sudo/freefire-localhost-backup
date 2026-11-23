package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a.d;

/* JADX INFO: loaded from: classes.dex */
public final class b<O extends com.google.android.gms.common.api.a.d> {
    private final int a;
    private final com.google.android.gms.common.api.a b;
    private final com.google.android.gms.common.api.a.d c;
    private final String d;

    private b(com.google.android.gms.common.api.a aVar, com.google.android.gms.common.api.a.d dVar, String str) {
        this.b = aVar;
        this.c = dVar;
        this.d = str;
        this.a = com.google.android.gms.common.internal.o.b(aVar, dVar, str);
    }

    public static <O extends com.google.android.gms.common.api.a.d> b<O> a(com.google.android.gms.common.api.a<O> aVar, O o2, String str) {
        return new b<>(aVar, o2, str);
    }

    public final String b() {
        return this.b.d();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return com.google.android.gms.common.internal.o.a(this.b, bVar.b) && com.google.android.gms.common.internal.o.a(this.c, bVar.c) && com.google.android.gms.common.internal.o.a(this.d, bVar.d);
    }

    public final int hashCode() {
        return this.a;
    }
}
