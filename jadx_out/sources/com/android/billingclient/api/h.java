package com.android.billingclient.api;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    private int a;
    private String b;

    public static class a {
        private int a;
        private String b = "";

        /* synthetic */ a(h0 h0Var) {
        }

        public h a() {
            h hVar = new h();
            hVar.a = this.a;
            hVar.b = this.b;
            return hVar;
        }

        public a b(String str) {
            this.b = str;
            return this;
        }

        public a c(int i2) {
            this.a = i2;
            return this;
        }
    }

    public static a c() {
        return new a(null);
    }

    public String a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public String toString() {
        return "Response Code: " + j.d.a.c.f.h.k.j(this.a) + ", Debug Message: " + this.b;
    }
}
