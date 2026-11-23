package com.beetalk.sdk;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.beetalk.sdk.networking.model.ExchangeTwitterTokenResp;
import j.g.a.a.a.u;
import j.g.a.a.a.v;
import j.g.a.a.a.x;

/* JADX INFO: loaded from: classes.dex */
class r extends e {
    public static final String e = r.class.getSimpleName();
    private final Activity b;
    private volatile com.twitter.sdk.android.core.identity.h c;
    private j.g.a.a.a.c<x> d;

    class a extends j.g.a.a.a.c<x> {
        a() {
        }

        @Override // j.g.a.a.a.c
        public void c(v vVar) {
            r rVar;
            com.garena.pay.android.b bVar;
            Log.d(r.e, vVar.toString());
            if (vVar.toString().contains("Authorize canceled.")) {
                rVar = r.this;
                bVar = com.garena.pay.android.b.USER_CANCELLED;
            } else {
                rVar = r.this;
                bVar = com.garena.pay.android.b.ERROR;
            }
            rVar.k(bVar);
        }

        @Override // j.g.a.a.a.c
        public void d(j.g.a.a.a.j<x> jVar) {
            j.g.a.a.a.r rVarA = ((x) u.f().g().c()).a();
            String str = rVarA.a;
            String str2 = rVarA.b;
            Log.d(r.e, "Token: " + str + ", secret: " + str2);
            r.this.m(str, str2);
        }
    }

    class b implements i.g<ExchangeTwitterTokenResp, Void> {
        final /* synthetic */ com.beetalk.sdk.b.c a;

        b(com.beetalk.sdk.b.c cVar) {
            this.a = cVar;
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(i.i<ExchangeTwitterTokenResp> iVar) {
            com.beetalk.sdk.b.e eVarA;
            if (iVar.x() || iVar.v() || !iVar.w() || iVar.t() == null) {
                eVarA = com.beetalk.sdk.b.e.a(this.a, com.garena.pay.android.b.UNKNOWN_ERROR.c().intValue());
            } else {
                ExchangeTwitterTokenResp exchangeTwitterTokenRespT = iVar.t();
                if (exchangeTwitterTokenRespT.getErrorCode() != com.garena.pay.android.b.SUCCESS.c().intValue()) {
                    eVarA = com.beetalk.sdk.b.e.a(this.a, exchangeTwitterTokenRespT.getErrorCode());
                } else {
                    com.beetalk.sdk.u.a aVar = new com.beetalk.sdk.u.a(exchangeTwitterTokenRespT.getAccessToken(), com.beetalk.sdk.u.l.TWITTER, exchangeTwitterTokenRespT.getPlatform());
                    aVar.k(exchangeTwitterTokenRespT.getExpireTime());
                    eVarA = com.beetalk.sdk.b.e.c(this.a, aVar, exchangeTwitterTokenRespT.getOpenId(), exchangeTwitterTokenRespT.getPlatform());
                }
            }
            r.this.l(eVarA);
            return null;
        }
    }

    r(com.beetalk.sdk.b bVar) {
        super(bVar);
        this.d = new a();
        Activity activityA = bVar.e().a();
        this.b = activityA;
        j.g.a.a.a.s.b bVar2 = new j.g.a.a.a.s.b(activityA);
        bVar2.c(new j.g.a.a.a.d(3));
        bVar2.d(new j.g.a.a.a.p(com.beetalk.sdk.x.d.l(activityA), com.beetalk.sdk.x.d.m(activityA)));
        bVar2.b(true);
        j.g.a.a.a.m.i(bVar2.a());
        try {
            u.f();
        } catch (IllegalStateException e2) {
            j.g.a.a.a.m.g().b(e, e2.getMessage());
        }
    }

    private void i(String str, String str2, com.beetalk.sdk.b.c cVar) {
        com.beetalk.sdk.z.i.b.i(str, str2, cVar.a(), cVar.e()).i(new b(cVar));
    }

    private com.twitter.sdk.android.core.identity.h j() {
        if (this.c == null) {
            synchronized (r.class) {
                if (this.c == null) {
                    this.c = new com.twitter.sdk.android.core.identity.h();
                }
            }
        }
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(com.garena.pay.android.b bVar) {
        this.a.k(com.beetalk.sdk.b.e.a(this.a.i(), bVar.c().intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(com.beetalk.sdk.b.e eVar) {
        if (eVar != null && eVar.b != null) {
            g gVarY = g.y();
            if (this.a.i().e() == p.f509i.intValue()) {
                gVarY = g.w();
            } else if (this.a.i().e() == p.f508h.intValue()) {
                gVarY = g.x();
            }
            if (gVarY != null) {
                gVarY.v().l(eVar.b);
            }
        }
        this.a.k(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            i(str, str2, this.a.i());
        } else {
            this.a.k(com.beetalk.sdk.b.e.a(this.a.i(), com.garena.pay.android.b.SESSION_NOT_INITIALIZED.c().intValue()));
        }
    }

    @Override // com.beetalk.sdk.e
    boolean d(int i2, int i3, Intent intent, com.beetalk.sdk.b.c cVar) {
        if (i2 != j().d()) {
            return false;
        }
        j().f(i2, i3, intent);
        return true;
    }

    @Override // com.beetalk.sdk.e
    boolean e(com.beetalk.sdk.b.c cVar) {
        com.beetalk.sdk.x.a.a("Start Twitter auth", new Object[0]);
        if (cVar == null) {
            return false;
        }
        j().a(this.b, this.d);
        return true;
    }
}
