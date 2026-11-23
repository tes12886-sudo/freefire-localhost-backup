package com.google.firebase.messaging.d1;

import j.d.a.c.f.g.f0;
import j.d.a.c.f.g.k;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    private final com.google.firebase.messaging.d1.a a;

    public static final class a {
        private com.google.firebase.messaging.d1.a a = null;

        a() {
        }

        public b a() {
            return new b(this.a);
        }

        public a b(com.google.firebase.messaging.d1.a aVar) {
            this.a = aVar;
            return this;
        }
    }

    static {
        new a().a();
    }

    b(com.google.firebase.messaging.d1.a aVar) {
        this.a = aVar;
    }

    public static a b() {
        return new a();
    }

    @f0(zza = 1)
    public com.google.firebase.messaging.d1.a a() {
        return this.a;
    }

    public byte[] c() {
        return k.a(this);
    }
}
