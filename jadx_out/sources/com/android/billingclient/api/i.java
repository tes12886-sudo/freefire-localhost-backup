package com.android.billingclient.api;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    private String a;

    public static final class a {
        private String a;

        /* synthetic */ a(j0 j0Var) {
        }

        public i a() {
            String str = this.a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            i iVar = new i(null);
            iVar.a = str;
            return iVar;
        }

        public a b(String str) {
            this.a = str;
            return this;
        }
    }

    /* synthetic */ i(k0 k0Var) {
    }

    public static a b() {
        return new a(null);
    }

    public String a() {
        return this.a;
    }
}
