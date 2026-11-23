package com.beetalk.sdk;

/* JADX INFO: loaded from: classes.dex */
public class h {
    protected int a = 0;
    protected String b = "";
    protected int c = 0;
    protected byte[] d = null;
    protected String e = "";
    protected String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected String f503g;

    public static class a {
        private h a;

        public a(int i2, String str, int i3) {
            h hVar = new h();
            this.a = hVar;
            hVar.a = i2;
            hVar.f503g = str;
            hVar.c = i3;
        }

        public h a() {
            return this.a;
        }

        public a b(String str) {
            this.a.b = str;
            return this;
        }

        public a c(String str) {
            this.a.e = str;
            return this;
        }

        public a d(String str) {
            this.a.f = str;
            return this;
        }
    }

    public String a() {
        return this.f503g;
    }

    public int b() {
        return this.c;
    }

    public byte[] c() {
        return this.d;
    }

    public String d() {
        return this.b;
    }

    public String e() {
        return this.e;
    }

    public int f() {
        return this.a;
    }
}
