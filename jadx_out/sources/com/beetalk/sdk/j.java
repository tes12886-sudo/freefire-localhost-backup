package com.beetalk.sdk;

/* JADX INFO: loaded from: classes.dex */
public class j {
    protected int a = 0;
    protected String b = "";
    protected int c = 0;
    protected byte[] d = null;
    protected int e = 0;
    protected String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected String f504g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected String f505h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected String f506i;

    public static class a {
        private j a;

        public a(int i2) {
            j jVar = new j();
            this.a = jVar;
            jVar.a = 0;
            jVar.c = i2;
        }

        public a(byte[] bArr, int i2) {
            j jVar = new j();
            this.a = jVar;
            jVar.a = 0;
            jVar.d = bArr;
            jVar.c = i2;
            jVar.e = bArr.length;
        }

        public j a() {
            return this.a;
        }

        public a b(String str) {
            this.a.f504g = str;
            return this;
        }

        public a c(String str) {
            this.a.f505h = str;
            return this;
        }

        public a d(String str) {
            this.a.b = str;
            return this;
        }

        public a e(Integer num) {
            this.a.a = num.intValue();
            return this;
        }

        public a f(String str) {
            this.a.f506i = str;
            return this;
        }

        public a g(String str) {
            this.a.f = str;
            return this;
        }
    }

    public String a() {
        return this.f505h;
    }

    public int b() {
        return this.c;
    }

    public String c() {
        return this.b;
    }

    public int d() {
        return this.a;
    }

    public int e() {
        return this.e;
    }

    public byte[] f() {
        return this.d;
    }

    public String g() {
        return this.f506i;
    }

    public String h() {
        return this.f;
    }
}
