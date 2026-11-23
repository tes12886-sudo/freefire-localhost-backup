package com.beetalk.sdk.z.i;

import android.content.Context;
import com.android.billingclient.api.Purchase;
import com.beetalk.sdk.networking.model.ChannelsResp;
import com.beetalk.sdk.networking.model.CommitReq;
import com.beetalk.sdk.networking.model.CommitResp;
import com.beetalk.sdk.networking.model.EventCancelResp;
import com.beetalk.sdk.networking.model.EventInitResp;
import com.beetalk.sdk.networking.model.EventPricingResp;
import com.beetalk.sdk.networking.model.LessIsMoreEventsResp;
import com.beetalk.sdk.networking.model.RebatesResp;
import com.garena.pay.android.data.GGPayment;
import com.garena.pay.android.data.GGRebateOptionsRequest;
import com.garena.pay.android.ndk.RebateOptionItem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class c {

    class a implements Callable<com.beetalk.sdk.z.e.m> {
        final /* synthetic */ Map a;

        a(Map map) {
            this.a = map;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.beetalk.sdk.z.e.m call() {
            return new com.beetalk.sdk.z.e(com.beetalk.sdk.z.e.k.POST, this.a).i(com.beetalk.sdk.p.D());
        }
    }

    class b implements i.g<com.beetalk.sdk.z.e.m, EventInitResp> {
        b() {
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public EventInitResp a(i.i<com.beetalk.sdk.z.e.m> iVar) throws TimeoutException, IOException {
            if (iVar.x() || iVar.t() == null) {
                throw new IOException();
            }
            com.beetalk.sdk.z.e.m mVarT = iVar.t();
            if (mVarT.a) {
                throw new TimeoutException();
            }
            return EventInitResp.parse(mVarT.b);
        }
    }

    /* JADX INFO: renamed from: com.beetalk.sdk.z.i.c$c, reason: collision with other inner class name */
    class CallableC0052c implements Callable<com.beetalk.sdk.z.e.m> {
        final /* synthetic */ Map a;

        CallableC0052c(Map map) {
            this.a = map;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.beetalk.sdk.z.e.m call() {
            return new com.beetalk.sdk.z.e(com.beetalk.sdk.z.e.k.POST, this.a).i(com.beetalk.sdk.p.E());
        }
    }

    class d implements i.g<com.beetalk.sdk.z.e.m, EventPricingResp> {
        d() {
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public EventPricingResp a(i.i<com.beetalk.sdk.z.e.m> iVar) throws TimeoutException, IOException {
            if (iVar.x() || iVar.t() == null) {
                throw new IOException();
            }
            com.beetalk.sdk.z.e.m mVarT = iVar.t();
            if (mVarT.a) {
                throw new TimeoutException();
            }
            return EventPricingResp.parse(mVarT.b);
        }
    }

    class e implements Callable<com.beetalk.sdk.z.e.m> {
        final /* synthetic */ Map a;

        e(Map map) {
            this.a = map;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.beetalk.sdk.z.e.m call() {
            return new com.beetalk.sdk.z.e(com.beetalk.sdk.z.e.k.GET, this.a).i(com.beetalk.sdk.p.r());
        }
    }

    class f implements i.g<com.beetalk.sdk.z.e.m, LessIsMoreEventsResp> {
        f() {
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public LessIsMoreEventsResp a(i.i<com.beetalk.sdk.z.e.m> iVar) throws TimeoutException, IOException {
            if (iVar.x() || iVar.t() == null) {
                throw new IOException();
            }
            com.beetalk.sdk.z.e.m mVarT = iVar.t();
            if (mVarT.a) {
                throw new TimeoutException();
            }
            return LessIsMoreEventsResp.parse(mVarT.b);
        }
    }

    class g implements Callable<com.beetalk.sdk.z.e.m> {
        final /* synthetic */ Map a;

        g(Map map) {
            this.a = map;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.beetalk.sdk.z.e.m call() {
            return new com.beetalk.sdk.z.e(com.beetalk.sdk.z.e.k.GET, this.a).i(com.beetalk.sdk.p.q());
        }
    }

    class h implements i.g<com.beetalk.sdk.z.e.m, ChannelsResp> {
        final /* synthetic */ com.garena.pay.android.d a;

        h(com.garena.pay.android.d dVar) {
            this.a = dVar;
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ChannelsResp a(i.i<com.beetalk.sdk.z.e.m> iVar) throws TimeoutException, IOException {
            if (iVar.x() || iVar.t() == null) {
                throw new IOException();
            }
            com.beetalk.sdk.z.e.m mVarT = iVar.t();
            if (mVarT.a) {
                throw new TimeoutException();
            }
            return ChannelsResp.parseV1(mVarT.b, this.a.c().getRebateId());
        }
    }

    class i implements Callable<com.beetalk.sdk.z.e.m> {
        final /* synthetic */ Map a;

        i(Map map) {
            this.a = map;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.beetalk.sdk.z.e.m call() {
            return new com.beetalk.sdk.z.e(com.beetalk.sdk.z.e.k.GET, this.a).i(com.beetalk.sdk.p.n());
        }
    }

    class j implements i.g<com.beetalk.sdk.z.e.m, ChannelsResp> {
        final /* synthetic */ com.garena.pay.android.d a;
        final /* synthetic */ Context b;

        j(com.garena.pay.android.d dVar, Context context) {
            this.a = dVar;
            this.b = context;
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ChannelsResp a(i.i<com.beetalk.sdk.z.e.m> iVar) throws TimeoutException, IOException {
            List<GGPayment.PaymentChannel> listB;
            if (iVar.x() || iVar.t() == null) {
                throw new IOException();
            }
            com.beetalk.sdk.z.e.m mVarT = iVar.t();
            if (mVarT.a) {
                throw new TimeoutException();
            }
            ChannelsResp channelsResp = ChannelsResp.parse(mVarT.b);
            if (channelsResp.getErrorCode() != com.garena.pay.android.b.SUCCESS.c().intValue()) {
                return channelsResp;
            }
            Long lValueOf = Long.valueOf(this.a.c().getRebateId());
            if (lValueOf == null || lValueOf.longValue() == 0) {
                listB = com.garena.pay.android.j.b.b(channelsResp.getChannels());
            } else {
                long jLongValue = lValueOf.longValue();
                List<GGPayment.PaymentChannel> channels = channelsResp.getChannels();
                if (jLongValue == -1) {
                    if (channels == null) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator<GGPayment.PaymentChannel> it = channels.iterator();
                    while (it.hasNext()) {
                        for (GGPayment.Denomination denomination : it.next().getItems()) {
                            if (denomination.getRebateId() != 0) {
                                arrayList.add(Long.valueOf(denomination.getRebateId()));
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        channels = channelsResp.getChannels();
                    } else {
                        GGRebateOptionsRequest.GGRebateOptionsRequestBuilder gGRebateOptionsRequestBuilder = new GGRebateOptionsRequest.GGRebateOptionsRequestBuilder();
                        gGRebateOptionsRequestBuilder.setAppId(com.beetalk.sdk.x.d.e(this.b)).setOpenId(com.beetalk.sdk.g.y().C()).setPlatform(com.beetalk.sdk.g.y().D()).setToken(com.beetalk.sdk.g.y().I().b()).setServerId(this.a.c().getAppServerId()).setRoleId(this.a.c().getRoleId()).setRebateIds(arrayList).setLocale(this.a.c().getLocale());
                        com.beetalk.sdk.z.e.m mVarI = new com.beetalk.sdk.z.e(com.beetalk.sdk.z.e.k.GET, gGRebateOptionsRequestBuilder.Build().getParams(this.b)).i(com.beetalk.sdk.p.F());
                        if (mVarI.a) {
                            throw new TimeoutException();
                        }
                        List<RebateOptionItem> rebates = RebatesResp.parse(mVarI.b).getRebates();
                        if (rebates == null) {
                            return null;
                        }
                        Iterator<GGPayment.PaymentChannel> it2 = channels.iterator();
                        while (it2.hasNext()) {
                            for (GGPayment.Denomination denomination2 : it2.next().getItems()) {
                                for (RebateOptionItem rebateOptionItem : rebates) {
                                    if (rebateOptionItem.rebateId == denomination2.getRebateId()) {
                                        denomination2.setName(rebateOptionItem.name);
                                    }
                                }
                            }
                        }
                    }
                }
                listB = com.garena.pay.android.j.b.a(channels);
            }
            channelsResp.setChannels(listB);
            return channelsResp;
        }
    }

    class k implements i.g<com.beetalk.sdk.z.e.m, CommitResp> {
        k() {
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CommitResp a(i.i<com.beetalk.sdk.z.e.m> iVar) throws TimeoutException, IOException {
            if (iVar.x() || iVar.t() == null) {
                throw new IOException();
            }
            com.beetalk.sdk.z.e.m mVarT = iVar.t();
            if (mVarT.a) {
                throw new TimeoutException();
            }
            return CommitResp.parse(mVarT.b);
        }
    }

    class l implements Callable<com.beetalk.sdk.z.e.m> {
        final /* synthetic */ Map a;

        l(Map map) {
            this.a = map;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.beetalk.sdk.z.e.m call() {
            return new com.beetalk.sdk.z.e(com.beetalk.sdk.z.e.k.GET, this.a).i(com.beetalk.sdk.p.m());
        }
    }

    class m implements Callable<com.beetalk.sdk.z.e.m> {
        final /* synthetic */ Map a;

        m(Map map) {
            this.a = map;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.beetalk.sdk.z.e.m call() {
            return new com.beetalk.sdk.z.e(com.beetalk.sdk.z.e.k.POST, this.a).i(com.beetalk.sdk.p.v());
        }
    }

    class n implements i.g<com.beetalk.sdk.z.e.m, RebatesResp> {
        n() {
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RebatesResp a(i.i<com.beetalk.sdk.z.e.m> iVar) throws TimeoutException, IOException {
            if (iVar.x() || iVar.t() == null) {
                throw new IOException();
            }
            com.beetalk.sdk.z.e.m mVarT = iVar.t();
            if (mVarT.a) {
                throw new TimeoutException();
            }
            return RebatesResp.parse(mVarT.b);
        }
    }

    class o implements Callable<com.beetalk.sdk.z.e.m> {
        final /* synthetic */ Map a;

        o(Map map) {
            this.a = map;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.beetalk.sdk.z.e.m call() {
            return new com.beetalk.sdk.z.e(com.beetalk.sdk.z.e.k.GET, this.a).i(com.beetalk.sdk.p.F());
        }
    }

    class p implements i.g<com.beetalk.sdk.z.e.m, EventCancelResp> {
        p() {
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public EventCancelResp a(i.i<com.beetalk.sdk.z.e.m> iVar) throws TimeoutException, IOException {
            if (iVar.x() || iVar.t() == null) {
                throw new IOException();
            }
            com.beetalk.sdk.z.e.m mVarT = iVar.t();
            if (mVarT.a) {
                throw new TimeoutException();
            }
            return EventCancelResp.parse(mVarT.b);
        }
    }

    public static i.i<CommitResp> a(Context context, Purchase purchase, int i2, int i3) {
        return i.i.e(new m(CommitReq.toParams(purchase, i2, i3))).j(new k(), i.i.f1901i);
    }

    public static i.i<EventPricingResp> b(Map<String, String> map) {
        return i.i.e(new e(map)).j(new d(), i.i.f1901i);
    }

    public static i.i<LessIsMoreEventsResp> c(Map<String, String> map) {
        return i.i.e(new g(map)).j(new f(), i.i.f1901i);
    }

    public static i.i<RebatesResp> d(Map<String, String> map) {
        return i.i.e(new o(map)).j(new n(), i.i.f1901i);
    }

    public static i.i<ChannelsResp> e(Context context, com.garena.pay.android.d dVar, Map<String, String> map) {
        return dVar.c().getApiVersion() == 1 ? f(dVar, map) : i.i.e(new l(map)).j(new j(dVar, context), i.i.f1901i);
    }

    private static i.i<ChannelsResp> f(com.garena.pay.android.d dVar, Map<String, String> map) {
        return i.i.e(new i(map)).j(new h(dVar), i.i.f1901i);
    }

    public static i.i<EventCancelResp> g(Map<String, String> map) {
        return i.i.e(new a(map)).j(new p(), i.i.f1901i);
    }

    public static i.i<EventInitResp> h(Map<String, String> map) {
        return i.i.e(new CallableC0052c(map)).j(new b(), i.i.f1901i);
    }

    public static void i(com.beetalk.sdk.z.e.l lVar, Map<String, String> map) {
        new com.beetalk.sdk.z.e(com.beetalk.sdk.z.e.k.POST, map, lVar).h(com.beetalk.sdk.p.G());
    }
}
