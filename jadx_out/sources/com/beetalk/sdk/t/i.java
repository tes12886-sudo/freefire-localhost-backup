package com.beetalk.sdk.t;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class i {
    private final b a = new b();

    private class b extends com.beetalk.sdk.t.b {
        private b(i iVar) {
        }

        @Override // com.beetalk.sdk.t.b
        protected Context a() {
            return com.beetalk.sdk.g.s();
        }
    }

    private int c() {
        return (((int) (System.currentTimeMillis() / 1000)) % 86400) / 3600;
    }

    private long e() {
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        return (((jCurrentTimeMillis - (jCurrentTimeMillis % 86400)) - 86400) * 1000) + 68400000;
    }

    private long f() {
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        return ((jCurrentTimeMillis - (jCurrentTimeMillis % 86400)) * 1000) + 68400000;
    }

    private boolean h(long j2) {
        return j2 <= (c() >= 19 ? f() : e()) || j2 >= System.currentTimeMillis();
    }

    public void a() {
        this.a.f("KEY_MSDK_TOKEN_SESSION", null);
    }

    public void b() {
        this.a.e("KEY_LAST_REDEEM_TIME", -1L);
    }

    public String d() {
        return this.a.c("KEY_MSDK_TOKEN_SESSION", null);
    }

    public boolean g() {
        long jB = this.a.b("KEY_LAST_REDEEM_TIME", 0L);
        return h(jB) || jB == 0 || System.currentTimeMillis() - jB > 28800000;
    }

    public void i(String str) {
        this.a.f("KEY_MSDK_TOKEN_SESSION", str);
    }

    public void j() {
        this.a.e("KEY_LAST_REDEEM_TIME", System.currentTimeMillis());
    }
}
