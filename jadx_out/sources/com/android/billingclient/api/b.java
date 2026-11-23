package com.android.billingclient.api;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    private String a;

    public static final class a {
        private String a;

        /* synthetic */ a(p pVar) {
        }

        public b a() {
            String str = this.a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            b bVar = new b(null);
            bVar.a = str;
            return bVar;
        }

        public a b(String str) {
            this.a = str;
            return this;
        }
    }

    /* synthetic */ b(g0 g0Var) {
    }

    public static a b() {
        return new a(null);
    }

    public String a() {
        return this.a;
    }
}
