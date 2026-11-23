package com.garena.pay.android;

import android.R;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.billingclient.api.SkuDetails;
import com.beetalk.sdk.networking.model.ChannelsReq;
import com.beetalk.sdk.networking.model.ChannelsResp;
import com.beetalk.sdk.networking.model.EventInitReq;
import com.beetalk.sdk.networking.model.EventInitResp;
import com.beetalk.sdk.networking.model.EventPriceReq;
import com.beetalk.sdk.networking.model.EventPricingResp;
import com.beetalk.sdk.networking.model.LessIsMoreEvent;
import com.beetalk.sdk.networking.model.LessIsMoreEventsResp;
import com.beetalk.sdk.networking.model.PricingEvent;
import com.beetalk.sdk.networking.model.RebatesResp;
import com.garena.pay.android.data.GGPayment;
import com.garena.pay.android.data.GGRebateOptionsRequest;
import com.garena.pay.android.data.GGRedeemRequest;
import com.garena.pay.android.data.GGRedeemResponse;
import com.garena.pay.android.data.TransactionInfo;
import com.garena.pay.android.data.TransactionStatus;
import com.garena.pay.android.data.ValidationResult;
import com.garena.pay.android.ndk.RebateOptionItem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private static volatile a d;
    private final Handler a = new Handler(Looper.getMainLooper());
    private final List<com.garena.pay.android.f> b = new CopyOnWriteArrayList();
    private GGPayment c;

    /* JADX INFO: renamed from: com.garena.pay.android.a$a, reason: collision with other inner class name */
    class C0108a implements com.beetalk.sdk.z.e.l {
        final /* synthetic */ m a;
        final /* synthetic */ long b;
        final /* synthetic */ com.beetalk.sdk.t.i c;

        C0108a(m mVar, long j2, com.beetalk.sdk.t.i iVar) {
            this.a = mVar;
            this.b = j2;
            this.c = iVar;
        }

        @Override // com.beetalk.sdk.z.e.l
        public void a(String str) {
            m mVar;
            com.garena.pay.android.b bVar;
            com.beetalk.sdk.x.a.i("redeem response: %s", str);
            com.garena.pay.android.b bVarA = com.beetalk.sdk.x.d.a(str);
            if (bVarA != null && bVarA != com.garena.pay.android.b.UNKNOWN_ERROR) {
                this.a.onRedeemResultObtained(bVarA.c().intValue(), null);
                return;
            }
            if (str.contains("error_not_available")) {
                if (this.b <= 0) {
                    this.c.j();
                }
                mVar = this.a;
                bVar = com.garena.pay.android.b.REDEEM_NOT_AVAILABLE;
            } else {
                if (!str.contains("error_already_redeemed")) {
                    GGRedeemResponse gGRedeemResponseF = com.garena.pay.android.j.b.f(str);
                    if (gGRedeemResponseF != null) {
                        int i2 = gGRedeemResponseF.result;
                        com.garena.pay.android.b bVar2 = com.garena.pay.android.b.SUCCESS;
                        if (i2 == bVar2.c().intValue()) {
                            if (this.b <= 0) {
                                this.c.j();
                            }
                            this.a.onRedeemResultObtained(bVar2.c().intValue(), gGRedeemResponseF);
                            return;
                        }
                    }
                    this.a.onRedeemResultObtained(com.garena.pay.android.b.NETWORK_RESPONSE_PARSE_FAIL.c().intValue(), null);
                    this.c.b();
                    return;
                }
                if (this.b <= 0) {
                    this.c.j();
                }
                mVar = this.a;
                bVar = com.garena.pay.android.b.ALREADY_REDEEMED;
            }
            mVar.onRedeemResultObtained(bVar.c().intValue(), null);
        }

        @Override // com.beetalk.sdk.z.e.f
        public void c() {
            this.a.onRedeemResultObtained(com.garena.pay.android.b.NETWORK_REQUEST_TIME_OUT.c().intValue(), null);
            this.c.b();
        }
    }

    class b implements Runnable {
        final /* synthetic */ TransactionStatus a;
        final /* synthetic */ Exception b;
        final /* synthetic */ TransactionInfo c;

        b(TransactionStatus transactionStatus, Exception exc, TransactionInfo transactionInfo) {
            this.a = transactionStatus;
            this.b = exc;
            this.c = transactionInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = a.this.b.iterator();
            while (it.hasNext()) {
                ((com.garena.pay.android.f) it.next()).onPaymentProcessed(this.a, this.b, this.c);
            }
            a.this.b.clear();
        }
    }

    static /* synthetic */ class c {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.beetalk.sdk.u.j.a.values().length];
            a = iArr;
            try {
                iArr[com.beetalk.sdk.u.j.a.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[com.beetalk.sdk.u.j.a.CANCEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[com.beetalk.sdk.u.j.a.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    class d implements i.g<ChannelsResp, Void> {
        final /* synthetic */ o a;
        final /* synthetic */ GGPayment b;
        final /* synthetic */ Activity c;

        d(o oVar, GGPayment gGPayment, Activity activity) {
            this.a = oVar;
            this.b = gGPayment;
            this.c = activity;
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(i.i<ChannelsResp> iVar) {
            o oVar;
            Exception eVar;
            if (iVar.x()) {
                if (iVar.s() instanceof IOException) {
                    oVar = this.a;
                    eVar = new TimeoutException("Connection Timed Out");
                } else {
                    oVar = this.a;
                    eVar = new com.garena.pay.android.i.e("Response was null or not correct");
                }
                oVar.onResultObtained(null, eVar);
                return null;
            }
            ChannelsResp channelsRespT = iVar.t();
            if (channelsRespT == null || channelsRespT.getChannels() == null || channelsRespT.getChannels().isEmpty()) {
                this.a.onResultObtained(null, new Exception("parse response error"));
                return null;
            }
            if (this.b.isConvertGooglePlayPrices()) {
                a.q(this.c, channelsRespT.getChannels(), this.a);
            } else {
                this.a.onResultObtained(channelsRespT.getChannels(), null);
            }
            return null;
        }
    }

    class e implements i.g<List<SkuDetails>, Void> {
        final /* synthetic */ o a;
        final /* synthetic */ List b;
        final /* synthetic */ GGPayment.PaymentChannel c;

        e(o oVar, List list, GGPayment.PaymentChannel paymentChannel) {
            this.a = oVar;
            this.b = list;
            this.c = paymentChannel;
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(i.i<List<SkuDetails>> iVar) {
            SkuDetails skuDetails;
            if (!iVar.x() && !iVar.v() && iVar.t() != null) {
                List<SkuDetails> listT = iVar.t();
                HashMap map = new HashMap();
                for (SkuDetails skuDetails2 : listT) {
                    map.put(skuDetails2.c(), skuDetails2);
                }
                ArrayList arrayList = new ArrayList();
                for (GGPayment.Denomination denomination : this.c.getItems()) {
                    String itemId = denomination.getItemId();
                    if (map.containsKey(itemId) && (skuDetails = (SkuDetails) map.get(itemId)) != null) {
                        denomination.setPrice(skuDetails.a());
                        denomination.setPriceCode(skuDetails.b());
                        arrayList.add(denomination);
                    }
                }
                this.c.setItems(arrayList);
            }
            this.a.onResultObtained(this.b, null);
            return null;
        }
    }

    class f implements i.g<LessIsMoreEventsResp, Void> {
        final /* synthetic */ k a;
        final /* synthetic */ String b;
        final /* synthetic */ Context c;
        final /* synthetic */ boolean d;

        f(k kVar, String str, Context context, boolean z) {
            this.a = kVar;
            this.b = str;
            this.c = context;
            this.d = z;
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(i.i<LessIsMoreEventsResp> iVar) {
            if (iVar.x()) {
                if (this.a != null) {
                    if (iVar.s() instanceof TimeoutException) {
                        com.beetalk.sdk.x.a.c("getRebateIdList request timeout", new Object[0]);
                        this.a.onEventResultObtained(com.garena.pay.android.b.NETWORK_REQUEST_TIME_OUT.c().intValue(), null, new TimeoutException("Connection Timed Out"));
                    } else {
                        this.a.onEventResultObtained(com.garena.pay.android.b.UNKNOWN_ERROR.c().intValue(), null, iVar.s());
                    }
                }
                return null;
            }
            LessIsMoreEventsResp lessIsMoreEventsRespT = iVar.t();
            if (lessIsMoreEventsRespT != null && lessIsMoreEventsRespT.getErrorCode() != com.garena.pay.android.b.SUCCESS.c().intValue()) {
                k kVar = this.a;
                if (kVar != null) {
                    kVar.onEventResultObtained(lessIsMoreEventsRespT.getResultCode(), null, new Exception(com.garena.pay.android.b.d(lessIsMoreEventsRespT.getErrorCode()).e()));
                }
                return null;
            }
            if (lessIsMoreEventsRespT == null) {
                k kVar2 = this.a;
                if (kVar2 != null) {
                    com.garena.pay.android.b bVar = com.garena.pay.android.b.NETWORK_RESPONSE_PARSE_FAIL;
                    kVar2.onEventResultObtained(bVar.c().intValue(), null, new Exception(bVar.e()));
                }
                return null;
            }
            List<LessIsMoreEvent> list = lessIsMoreEventsRespT.events;
            String strB = lessIsMoreEventsRespT.response;
            if (this.b.equals(lessIsMoreEventsRespT.version)) {
                strB = com.beetalk.sdk.t.h.a(this.c).b(lessIsMoreEventsRespT.version, "");
                list = LessIsMoreEventsResp.parse(strB).events;
            } else {
                com.beetalk.sdk.t.h.a(this.c).c("KEY_EVENT_CONFIG_VERSION", lessIsMoreEventsRespT.version);
                com.beetalk.sdk.t.h.a(this.c).c(lessIsMoreEventsRespT.version, strB);
            }
            com.beetalk.sdk.x.a.a("response = " + strB, new Object[0]);
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                for (LessIsMoreEvent lessIsMoreEvent : list) {
                    if (!this.d || (jCurrentTimeMillis <= lessIsMoreEvent.end_time && jCurrentTimeMillis >= lessIsMoreEvent.start_time)) {
                        if (lessIsMoreEvent.configs != null) {
                            arrayList.add(lessIsMoreEvent);
                        }
                    }
                }
            }
            k kVar3 = this.a;
            if (kVar3 != null) {
                com.garena.pay.android.b bVar2 = com.garena.pay.android.b.SUCCESS;
                kVar3.onEventResultObtained(bVar2.c().intValue(), arrayList, new Exception(bVar2.e()));
            }
            return null;
        }
    }

    class g implements i.g<EventPricingResp, Void> {
        final /* synthetic */ p a;
        final /* synthetic */ GGPayment b;
        final /* synthetic */ Context c;

        g(p pVar, GGPayment gGPayment, Context context) {
            this.a = pVar;
            this.b = gGPayment;
            this.c = context;
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(i.i<EventPricingResp> iVar) {
            if (iVar.x()) {
                if (this.a != null) {
                    if (iVar.s() instanceof TimeoutException) {
                        com.beetalk.sdk.x.a.c("getEventsPricing request timeout", new Object[0]);
                        this.a.onResultObtained(com.garena.pay.android.b.NETWORK_REQUEST_TIME_OUT.c().intValue(), null, null, new TimeoutException("Connection Timed Out"));
                    } else {
                        this.a.onResultObtained(com.garena.pay.android.b.UNKNOWN_ERROR.c().intValue(), null, null, iVar.s());
                    }
                }
                return null;
            }
            EventPricingResp eventPricingRespT = iVar.t();
            if (eventPricingRespT != null && eventPricingRespT.getErrorCode() != com.garena.pay.android.b.SUCCESS.c().intValue()) {
                p pVar = this.a;
                if (pVar != null) {
                    pVar.onResultObtained(eventPricingRespT.getResultCode(), null, null, new Exception(com.garena.pay.android.b.d(eventPricingRespT.getErrorCode()).e()));
                }
                return null;
            }
            if (eventPricingRespT == null) {
                p pVar2 = this.a;
                if (pVar2 != null) {
                    com.garena.pay.android.b bVar = com.garena.pay.android.b.NETWORK_RESPONSE_PARSE_FAIL;
                    pVar2.onResultObtained(bVar.c().intValue(), null, null, new Exception(bVar.e()));
                }
                return null;
            }
            if (this.a != null) {
                if (this.b.isConvertGooglePlayPrices()) {
                    a.r(this.c, eventPricingRespT.getChannels(), eventPricingRespT.getEvents(), this.a);
                } else {
                    p pVar3 = this.a;
                    com.garena.pay.android.b bVar2 = com.garena.pay.android.b.SUCCESS;
                    pVar3.onResultObtained(bVar2.c().intValue(), eventPricingRespT.getChannels().get(0).getItems(), eventPricingRespT.getEvents(), new Exception(bVar2.e()));
                }
            }
            return null;
        }
    }

    class h implements i.g<List<SkuDetails>, Void> {
        final /* synthetic */ p a;
        final /* synthetic */ GGPayment.PaymentChannel b;
        final /* synthetic */ List c;

        h(p pVar, GGPayment.PaymentChannel paymentChannel, List list) {
            this.a = pVar;
            this.b = paymentChannel;
            this.c = list;
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(i.i<List<SkuDetails>> iVar) {
            p pVar;
            int iIntValue;
            List<GGPayment.Denomination> items;
            List<PricingEvent> list;
            Exception exc;
            SkuDetails skuDetails;
            if (iVar.x() || iVar.v() || iVar.t() == null) {
                pVar = this.a;
                com.garena.pay.android.b bVar = com.garena.pay.android.b.SUCCESS;
                iIntValue = bVar.c().intValue();
                items = this.b.getItems();
                list = this.c;
                exc = new Exception(bVar.e());
            } else {
                List<SkuDetails> listT = iVar.t();
                HashMap map = new HashMap();
                for (SkuDetails skuDetails2 : listT) {
                    map.put(skuDetails2.c(), skuDetails2);
                }
                ArrayList arrayList = new ArrayList();
                for (GGPayment.Denomination denomination : this.b.getItems()) {
                    String itemId = denomination.getItemId();
                    if (map.containsKey(itemId) && (skuDetails = (SkuDetails) map.get(itemId)) != null) {
                        denomination.setPrice(skuDetails.a());
                        denomination.setPriceCode(skuDetails.b());
                        arrayList.add(denomination);
                    }
                }
                this.b.setItems(arrayList);
                pVar = this.a;
                com.garena.pay.android.b bVar2 = com.garena.pay.android.b.SUCCESS;
                iIntValue = bVar2.c().intValue();
                items = this.b.getItems();
                list = this.c;
                exc = new Exception(bVar2.e());
            }
            pVar.onResultObtained(iIntValue, items, list, exc);
            return null;
        }
    }

    class i implements i.g<EventInitResp, Void> {
        final /* synthetic */ n a;
        final /* synthetic */ Activity b;
        final /* synthetic */ GGPayment c;
        final /* synthetic */ com.garena.pay.android.f d;
        final /* synthetic */ GGPayment.Denomination e;
        final /* synthetic */ int f;

        i(n nVar, Activity activity, GGPayment gGPayment, com.garena.pay.android.f fVar, GGPayment.Denomination denomination, int i2) {
            this.a = nVar;
            this.b = activity;
            this.c = gGPayment;
            this.d = fVar;
            this.e = denomination;
            this.f = i2;
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(i.i<EventInitResp> iVar) {
            if (iVar.x()) {
                if (iVar.s() instanceof TimeoutException) {
                    com.beetalk.sdk.x.a.c("payEventInit request timeout", new Object[0]);
                    n nVar = this.a;
                    if (nVar != null) {
                        nVar.onResultObtained(-1, null, new TimeoutException("Connection Timed Out"));
                    }
                } else {
                    com.beetalk.sdk.x.a.c("payEventInit is faulted", new Object[0]);
                    n nVar2 = this.a;
                    if (nVar2 != null) {
                        nVar2.onResultObtained(-1, null, iVar.s());
                    }
                }
                return null;
            }
            EventInitResp eventInitRespT = iVar.t();
            if (eventInitRespT != null && eventInitRespT.getErrorCode() != com.garena.pay.android.b.SUCCESS.c().intValue()) {
                n nVar3 = this.a;
                if (nVar3 != null) {
                    nVar3.onResultObtained(eventInitRespT.getResultCode(), null, new Exception(com.garena.pay.android.b.d(eventInitRespT.getErrorCode()).e()));
                }
                com.beetalk.sdk.x.a.c("payEventInit errorCode = " + com.garena.pay.android.b.d(eventInitRespT.getErrorCode()).e(), new Object[0]);
                return null;
            }
            if (eventInitRespT == null) {
                n nVar4 = this.a;
                if (nVar4 != null) {
                    com.garena.pay.android.b bVar = com.garena.pay.android.b.NETWORK_RESPONSE_PARSE_FAIL;
                    nVar4.onResultObtained(bVar.c().intValue(), null, new Exception(bVar.e()));
                }
                com.beetalk.sdk.x.a.c("payEventInit Network response parse failed", new Object[0]);
                return null;
            }
            com.beetalk.sdk.t.h.a(this.b).c("KEY_EVENT_TXN_ID", eventInitRespT.event_txn_id);
            n nVar5 = this.a;
            if (nVar5 != null) {
                nVar5.onResultObtained(eventInitRespT.getResultCode(), eventInitRespT.event_txn_id, new Exception(com.garena.pay.android.b.SUCCESS.e()));
            }
            if (!TextUtils.isEmpty(eventInitRespT.event_txn_id)) {
                a.w(this.b, this.c, this.d, this.e, this.f);
            }
            return null;
        }
    }

    class j implements i.g<RebatesResp, Void> {
        final /* synthetic */ l a;

        j(l lVar) {
            this.a = lVar;
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(i.i<RebatesResp> iVar) {
            l lVar;
            com.garena.pay.android.b bVar;
            if (iVar.x()) {
                if (iVar.s() instanceof TimeoutException) {
                    com.beetalk.sdk.x.a.c("getRebateOptions request timeout", new Object[0]);
                    lVar = this.a;
                    bVar = com.garena.pay.android.b.NETWORK_REQUEST_TIME_OUT;
                } else {
                    lVar = this.a;
                    bVar = com.garena.pay.android.b.UNKNOWN_ERROR;
                }
                lVar.onGetRebateOptions(bVar.c().intValue(), null);
                return null;
            }
            RebatesResp rebatesRespT = iVar.t();
            if (rebatesRespT != null && rebatesRespT.getErrorCode() != com.garena.pay.android.b.SUCCESS.c().intValue()) {
                this.a.onGetRebateOptions(rebatesRespT.getErrorCode(), null);
                return null;
            }
            if (rebatesRespT == null || rebatesRespT.getRebates() == null) {
                this.a.onGetRebateOptions(com.garena.pay.android.b.NETWORK_RESPONSE_PARSE_FAIL.c().intValue(), null);
                return null;
            }
            this.a.onGetRebateOptions(com.garena.pay.android.b.SUCCESS.c().intValue(), rebatesRespT.getRebates());
            return null;
        }
    }

    public interface k {
        void onEventResultObtained(int i2, List<LessIsMoreEvent> list, Exception exc);
    }

    public interface l {
        void onGetRebateOptions(int i2, List<RebateOptionItem> list);
    }

    public interface m {
        void onRedeemResultObtained(int i2, GGRedeemResponse gGRedeemResponse);
    }

    public interface n {
        void onResultObtained(int i2, String str, Exception exc);
    }

    public interface o {
        void onResultObtained(List<GGPayment.PaymentChannel> list, Exception exc);
    }

    public interface p {
        void onResultObtained(int i2, List<GGPayment.Denomination> list, List<PricingEvent> list2, Exception exc);
    }

    private a() {
    }

    private static ValidationResult A(GGPayment gGPayment) {
        String str;
        ValidationResult validationResult = new ValidationResult();
        validationResult.errorMessage = "";
        validationResult.resultCode = ValidationResult.ResultCode.SUCCESS;
        if (com.garena.pay.android.j.d.d(gGPayment.getBuyerId())) {
            str = "Buyer Id cannot be null or empty.";
        } else {
            if (!com.garena.pay.android.j.d.d(gGPayment.getAppId())) {
                return validationResult;
            }
            str = "Client Id cannot be null or empty.";
        }
        return ValidationResult.createError(str);
    }

    public static void a(Context context, GGPayment gGPayment, String str, p pVar) {
        com.garena.pay.android.d dVar = new com.garena.pay.android.d();
        dVar.i(gGPayment);
        com.beetalk.sdk.z.i.c.b(EventPriceReq.toParams(context, dVar, str)).j(new g(pVar, gGPayment, context), i.i.f1903k);
    }

    public static void b(Context context, int i2, int i3, l lVar) {
        c(context, i2, i3, null, lVar);
    }

    public static void c(Context context, int i2, int i3, Locale locale, l lVar) {
        d(context, i2, i3, locale, null, lVar);
    }

    public static void d(Context context, int i2, int i3, Locale locale, List<Long> list, l lVar) {
        if (!com.beetalk.sdk.g.m()) {
            lVar.onGetRebateOptions(com.garena.pay.android.b.GOP_ERROR_TOKEN.c().intValue(), null);
            return;
        }
        GGRebateOptionsRequest.GGRebateOptionsRequestBuilder gGRebateOptionsRequestBuilder = new GGRebateOptionsRequest.GGRebateOptionsRequestBuilder();
        gGRebateOptionsRequestBuilder.setAppId(com.beetalk.sdk.x.d.e(context)).setOpenId(com.beetalk.sdk.g.y().C()).setPlatform(com.beetalk.sdk.g.y().D()).setToken(com.beetalk.sdk.g.y().I().b()).setServerId(i2).setRoleId(i3).setRebateIds(list).setLocale(locale);
        e(context, gGRebateOptionsRequestBuilder.Build(), lVar);
    }

    private static void e(Context context, GGRebateOptionsRequest gGRebateOptionsRequest, l lVar) {
        com.beetalk.sdk.z.i.c.d(gGRebateOptionsRequest.getParams(context)).j(new j(lVar), i.i.f1903k);
    }

    public static void f(Context context, String str, boolean z, k kVar) {
        HashMap map = new HashMap();
        map.put("app_id", com.beetalk.sdk.x.d.e(context));
        map.put("region", str);
        String strB = com.beetalk.sdk.t.h.a(context).b("KEY_EVENT_CONFIG_VERSION", "");
        map.put("version", strB);
        com.beetalk.sdk.z.i.c.c(map).i(new f(kVar, strB, context, z));
    }

    public static void g(Activity activity, GGPayment gGPayment, String str, GGPayment.Denomination denomination, int i2, n nVar, com.garena.pay.android.f fVar) {
        com.garena.pay.android.d dVar = new com.garena.pay.android.d();
        dVar.i(gGPayment);
        com.beetalk.sdk.z.i.c.h(EventInitReq.toParams(dVar, denomination.getItemId(), denomination.getEventId(), str)).i(new i(nVar, activity, gGPayment, fVar, denomination, i2));
    }

    public static void h(Context context, GGRedeemRequest gGRedeemRequest, m mVar) {
        if (!com.beetalk.sdk.g.m()) {
            mVar.onRedeemResultObtained(com.garena.pay.android.b.GOP_ERROR_TOKEN.c().intValue(), null);
            return;
        }
        com.beetalk.sdk.t.i iVar = new com.beetalk.sdk.t.i();
        long rebateCardId = gGRedeemRequest.getRebateCardId();
        if (rebateCardId > 0 || iVar.g()) {
            com.beetalk.sdk.z.i.c.i(new C0108a(mVar, rebateCardId, iVar), gGRedeemRequest.getParams());
        } else {
            mVar.onRedeemResultObtained(com.garena.pay.android.b.REDEEM_LIMIT_REACHED.c().intValue(), null);
        }
    }

    private void l(com.garena.pay.android.f fVar) {
        this.b.add(fVar);
    }

    private static void m(Activity activity, com.garena.pay.android.d dVar) {
        if (z(activity, dVar)) {
            return;
        }
        a aVarP = p();
        com.beetalk.sdk.u.j jVarA = com.beetalk.sdk.u.j.a(dVar, com.garena.pay.android.b.PAYMENT_CANNOT_START_ACTIVITY, "Failed to validate presence of the payment Activity");
        TransactionStatus transactionStatus = TransactionStatus.CLOSED_WITH_ERROR;
        p().x(transactionStatus, new com.garena.pay.android.i.b("Failed to validate presence of the payment Activity. Did you forget to include it in the Manifest?"), aVarP.n(jVarA, transactionStatus));
    }

    private TransactionInfo n(com.beetalk.sdk.u.j jVar, TransactionStatus transactionStatus) {
        if (jVar == null) {
            return new TransactionInfo("Cannot Get Result", transactionStatus, com.garena.pay.android.b.PAYMENT_BUNDLE_RESULT_INVALID.c(), com.beetalk.sdk.u.j.a.ERROR, this.c);
        }
        int i2 = c.a[jVar.f().ordinal()];
        if (i2 != 1) {
            if (i2 == 2 || i2 == 3) {
                return new TransactionInfo("Cancelled", transactionStatus, jVar.d(), jVar.f(), this.c);
            }
            return null;
        }
        TransactionInfo transactionInfo = new TransactionInfo("", transactionStatus, com.garena.pay.android.b.PAYMENT_NO_ERROR.c(), jVar.f(), this.c);
        Map<String, String> mapC = jVar.c();
        if (mapC != null) {
            transactionInfo.setTransactionId(mapC.get("txn_id"));
            transactionInfo.setIcon(mapC.get("item_icon"));
            transactionInfo.setName(mapC.get("item_name"));
            String str = mapC.get("app_point_amount");
            if (str != null && !TextUtils.isEmpty(str)) {
                transactionInfo.setAppPoints(Integer.valueOf(Integer.parseInt(str)));
            }
            String str2 = mapC.get("rebate_card_id");
            if (str2 != null && !TextUtils.isEmpty(str2)) {
                transactionInfo.setRebateId(Long.valueOf(Long.parseLong(str2)));
            }
            String str3 = mapC.get("remaining_days");
            if (str3 != null && !TextUtils.isEmpty(str3)) {
                transactionInfo.setRemainingDays(Integer.parseInt(str3));
            }
            String str4 = mapC.get("quantity");
            if (str4 != null && !TextUtils.isEmpty(str4)) {
                transactionInfo.setQuantity(Integer.parseInt(str4));
            }
        }
        return transactionInfo;
    }

    public static void o(Activity activity, GGPayment gGPayment, o oVar) {
        com.garena.pay.android.d dVar = new com.garena.pay.android.d();
        dVar.i(gGPayment);
        com.beetalk.sdk.z.i.c.e(activity, dVar, ChannelsReq.toParams(activity, dVar)).j(new d(oVar, gGPayment, activity), i.i.f1903k);
    }

    private static a p() {
        if (d == null) {
            synchronized (a.class) {
                if (d == null) {
                    d = new a();
                }
            }
        }
        return d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(Activity activity, List<GGPayment.PaymentChannel> list, o oVar) {
        for (GGPayment.PaymentChannel paymentChannel : list) {
            if (String.valueOf(201069).equalsIgnoreCase(paymentChannel.getChannelId())) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (GGPayment.Denomination denomination : paymentChannel.getItems()) {
                    boolean zIsSubscription = denomination.isSubscription();
                    String itemId = denomination.getItemId();
                    if (zIsSubscription) {
                        arrayList2.add(itemId);
                    } else {
                        arrayList.add(itemId);
                    }
                }
                new NewGoogleIabPayRequestHandler(activity).K(arrayList, arrayList2).i(new e(oVar, list, paymentChannel));
                return;
            }
        }
        oVar.onResultObtained(list, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r(Context context, List<GGPayment.PaymentChannel> list, List<PricingEvent> list2, p pVar) {
        for (GGPayment.PaymentChannel paymentChannel : list) {
            if (String.valueOf(201069).equalsIgnoreCase(paymentChannel.getChannelId())) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (GGPayment.Denomination denomination : paymentChannel.getItems()) {
                    boolean zIsSubscription = denomination.isSubscription();
                    String itemId = denomination.getItemId();
                    if (zIsSubscription) {
                        arrayList2.add(itemId);
                    } else {
                        arrayList.add(itemId);
                    }
                }
                new NewGoogleIabPayRequestHandler(context).K(arrayList, arrayList2).i(new h(pVar, paymentChannel, list2));
                return;
            }
        }
        com.garena.pay.android.b bVar = com.garena.pay.android.b.SUCCESS;
        pVar.onResultObtained(bVar.c().intValue(), list.get(0).getItems(), list2, new Exception(bVar.e()));
    }

    public static void s(Intent intent) {
        com.beetalk.sdk.u.j jVar = intent == null ? null : (com.beetalk.sdk.u.j) intent.getSerializableExtra("com.garena.pay.android.extras.result");
        if (jVar == null) {
            a aVarP = p();
            TransactionStatus transactionStatus = TransactionStatus.CLOSED_WITH_ERROR;
            com.garena.pay.android.b bVar = com.garena.pay.android.b.UNKNOWN_ERROR;
            aVarP.x(transactionStatus, new com.garena.pay.android.i.a(bVar.e(), bVar.c()), p().n(null, transactionStatus));
            return;
        }
        if (com.beetalk.sdk.u.j.g(jVar.f())) {
            a aVarP2 = p();
            TransactionStatus transactionStatus2 = TransactionStatus.CLOSED_WITH_ERROR;
            aVarP2.x(transactionStatus2, new com.garena.pay.android.i.a(jVar.e(), jVar.d()), p().n(jVar, transactionStatus2));
        } else {
            a aVarP3 = p();
            TransactionStatus transactionStatus3 = TransactionStatus.PROCESSED;
            aVarP3.x(transactionStatus3, null, p().n(jVar, transactionStatus3));
        }
    }

    public static void t(Activity activity, GGPayment gGPayment, com.garena.pay.android.f fVar, int i2) {
        com.beetalk.sdk.x.a.i("processPayment", "start");
        u(activity, gGPayment, fVar, i2, null);
    }

    private static void u(Activity activity, GGPayment gGPayment, com.garena.pay.android.f fVar, int i2, com.garena.pay.android.d dVar) {
        p().l(fVar);
        if (TextUtils.isEmpty(gGPayment.getToken())) {
            a aVarP = p();
            TransactionStatus transactionStatus = TransactionStatus.CLOSED_WITH_ERROR;
            com.garena.pay.android.b bVar = com.garena.pay.android.b.GOP_ERROR_TOKEN;
            aVarP.x(transactionStatus, new com.garena.pay.android.i.a(bVar.e(), bVar.c()), p().n(null, transactionStatus));
            return;
        }
        ValidationResult validationResultA = A(gGPayment);
        if (validationResultA.resultCode != ValidationResult.ResultCode.SUCCESS) {
            a aVarP2 = p();
            TransactionStatus transactionStatus2 = TransactionStatus.CLOSED_WITH_ERROR;
            aVarP2.x(transactionStatus2, new com.garena.pay.android.i.e("Error in handling request, validation of payment request failed. " + validationResultA.errorMessage), p().n(null, transactionStatus2));
            return;
        }
        p().c = gGPayment;
        if (dVar == null) {
            dVar = new com.garena.pay.android.d();
        }
        dVar.k(i2);
        dVar.i(gGPayment);
        dVar.j(gGPayment.getDenominations());
        m(activity, dVar);
    }

    public static void v(Activity activity, GGPayment gGPayment, com.garena.pay.android.f fVar, GGPayment.Denomination denomination, String str, int i2) {
        com.garena.pay.android.d dVar = new com.garena.pay.android.d();
        dVar.g(str);
        dVar.h(denomination);
        u(activity, gGPayment, fVar, i2, dVar);
    }

    public static void w(Activity activity, GGPayment gGPayment, com.garena.pay.android.f fVar, GGPayment.Denomination denomination, int i2) {
        com.garena.pay.android.d dVar = new com.garena.pay.android.d();
        dVar.h(denomination);
        u(activity, gGPayment, fVar, i2, dVar);
    }

    private void x(TransactionStatus transactionStatus, Exception exc, TransactionInfo transactionInfo) {
        try {
            this.a.post(new b(transactionStatus, exc, transactionInfo));
        } catch (Exception e2) {
            com.beetalk.sdk.x.a.b(e2);
        }
    }

    public static void y(Context context, String str, String str2, int i2, int i3, com.garena.pay.android.h hVar) {
        com.garena.pay.android.g.a(context, str, str2, i2, i3, hVar);
    }

    private static boolean z(Activity activity, com.garena.pay.android.d dVar) {
        Intent intent = new Intent(activity, (Class<?>) GGPayActivity.class);
        intent.putExtra("com.garena.pay.android.extras.pay_request", dVar);
        if (!(intent.resolveActivity(activity.getPackageManager()) != null)) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, dVar.e(), ActivityOptions.makeCustomAnimation(activity, R.anim.fade_in, R.anim.fade_out).toBundle());
        } else {
            activity.startActivityForResult(intent, dVar.e());
        }
        return true;
    }
}
