package com.beetalk.sdk.plugin.e.b.j;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public static class b {
        private long a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;

        public a g() {
            return new a(this);
        }

        public b h(String str) {
            this.d = str;
            return this;
        }

        public b i(String str) {
            this.f = str;
            return this;
        }

        public b j(String str) {
            this.c = str;
            return this;
        }

        public b k(String str) {
            this.e = str;
            return this;
        }

        public b l(String str) {
            this.b = str;
            return this;
        }

        public b m(long j2) {
            this.a = j2;
            return this;
        }
    }

    private a(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
    }
}
