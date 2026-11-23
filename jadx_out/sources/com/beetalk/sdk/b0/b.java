package com.beetalk.sdk.b0;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public final String a;
    public final String b;
    public final byte[] c;

    /* JADX INFO: renamed from: com.beetalk.sdk.b0.b$b, reason: collision with other inner class name */
    public static class C0030b {
        private String a;
        private String b;
        private byte[] c;

        public b d() {
            return new b(this);
        }

        public C0030b e(byte[] bArr) {
            this.c = bArr;
            return this;
        }

        public C0030b f(String str) {
            this.b = str;
            return this;
        }

        public C0030b g(String str) {
            this.a = str;
            return this;
        }
    }

    private b(C0030b c0030b) {
        this.a = c0030b.a;
        this.b = c0030b.b;
        this.c = c0030b.c;
    }
}
