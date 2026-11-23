package com.garena.sdkunity;

import com.beetalk.sdk.g;
import com.beetalk.sdk.networking.model.LessIsMoreEvent;
import com.beetalk.sdk.networking.model.PricingEvent;
import com.beetalk.sdk.u.j;
import com.garena.pay.android.a;
import com.garena.pay.android.b;
import com.garena.pay.android.data.GGPayment;
import com.garena.pay.android.data.GGRedeemRequest;
import com.garena.pay.android.data.GGRedeemResponse;
import com.garena.pay.android.data.TransactionInfo;
import com.garena.pay.android.data.TransactionStatus;
import com.garena.pay.android.f;
import com.garena.pay.android.h;
import com.garena.pay.android.ndk.RebateOptionItem;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class IAP {
    public static Locale IAPLocale = null;
    public static final int PAYMENT_REQUEST_ID = 4658;
    public static final String RETURN_NO_SESSION = "GGLoginSession.getCurrentSession() == null!";
    private static List<GGPayment.Denomination> _EventPaymentOptions;
    public static f PayResponseCallback = new f() { // from class: com.garena.sdkunity.IAP.1
        @Override // com.garena.pay.android.f
        public void onPaymentProcessed(TransactionStatus transactionStatus, Exception exc, TransactionInfo transactionInfo) {
            SdkUnity.Log("@IAP.PayResponseCallback: quantity: " + transactionInfo.getQuantity());
            UnityMessgae.getInstance().sendToUnity(transactionStatus.getValue().intValue() >= TransactionStatus.CLOSED_WITH_ERROR.getValue().intValue() ? "onPaymentProcessed_Exception" : "onPaymentProcessed", IAP.Convert(transactionInfo, transactionStatus, exc));
        }
    };
    public static EventPayResponseCallbackImpl EventPayResponseCallback = new EventPayResponseCallbackImpl();
    private static List<GGPayment.PaymentChannel> _PaymentChannels = new ArrayList();
    public static a.o PaymentOptionsCallback = new a.o() { // from class: com.garena.sdkunity.IAP.2
        @Override // com.garena.pay.android.a.o
        public void onResultObtained(List<GGPayment.PaymentChannel> list, Exception exc) {
            GetPaymentChannelsResult getPaymentChannelsResult = new GetPaymentChannelsResult();
            if (exc != null) {
                getPaymentChannelsResult.exception = exc.getMessage();
            }
            IAP._UpdatePaymentChannels(list);
            if (list != null) {
                getPaymentChannelsResult.paymentChannels = IAP._PaymentChannels;
            }
            UnityMessgae.getInstance().sendToUnity("onPaymentOptionsLoaded", getPaymentChannelsResult);
        }
    };

    public static void ClearPaymentOptions() {
        List<GGPayment.PaymentChannel> list = _PaymentChannels;
        if (list != null) {
            list.clear();
        }
        List<GGPayment.Denomination> list2 = _EventPaymentOptions;
        if (list2 != null) {
            list2.clear();
        }
    }

    public static ProcessPaymentResult Convert(TransactionInfo transactionInfo, TransactionStatus transactionStatus, Exception exc) {
        ProcessPaymentResult processPaymentResult = new ProcessPaymentResult();
        processPaymentResult.status = transactionStatus.getValue().intValue();
        processPaymentResult.errorMessage = exc != null ? exc.getMessage() : "";
        if (transactionInfo != null) {
            try {
                processPaymentResult.errorCode = transactionInfo.getErrorCode().intValue();
            } catch (Exception unused) {
                processPaymentResult.errorCode = 0;
            }
            try {
                processPaymentResult.transactionStatus = transactionInfo.getTransactionStatus().getValue().intValue();
            } catch (Exception unused2) {
                processPaymentResult.transactionStatus = -1;
            }
            try {
                processPaymentResult.resultCode = transactionInfo.getResultCode().c().intValue();
            } catch (Exception unused3) {
                processPaymentResult.resultCode = -1;
            }
            processPaymentResult.transactionId = transactionInfo.getTransactionId();
            processPaymentResult.quantity = transactionInfo.getQuantity();
            processPaymentResult.name = transactionInfo.getName();
            processPaymentResult.icon = transactionInfo.getIcon();
            try {
                processPaymentResult.appPoints = transactionInfo.getAppPoints().intValue();
            } catch (Exception unused4) {
                processPaymentResult.appPoints = 0;
            }
            try {
                processPaymentResult.rebateId = transactionInfo.getRebateId().longValue();
            } catch (Exception unused5) {
                processPaymentResult.rebateId = 0L;
            }
            processPaymentResult.remainingDays = transactionInfo.getRemainingDays();
            processPaymentResult.transactionError = transactionInfo.getTransactionError();
        } else {
            processPaymentResult.errorCode = b.PAYMENT_GENERAL_ERROR.c().intValue();
            processPaymentResult.transactionStatus = TransactionStatus.CLOSED_WITH_ERROR.getValue().intValue();
            processPaymentResult.resultCode = j.a.ERROR.c().intValue();
        }
        return processPaymentResult;
    }

    public static void GetRebateOptions(int i2, int i3) {
        a.b(SdkUnity.getGameActivity(), i2, i3, new a.l() { // from class: com.garena.sdkunity.IAP.3
            @Override // com.garena.pay.android.a.l
            public void onGetRebateOptions(int i4, List<RebateOptionItem> list) {
                GetRebateOptionsResult getRebateOptionsResult = new GetRebateOptionsResult();
                getRebateOptionsResult.result = i4;
                getRebateOptionsResult.options = null;
                if (list != null) {
                    RebateOptionItem[] rebateOptionItemArr = new RebateOptionItem[list.size()];
                    getRebateOptionsResult.options = rebateOptionItemArr;
                    list.toArray(rebateOptionItemArr);
                }
                UnityMessgae.getInstance().sendToUnity("onGetRebateOptions", getRebateOptionsResult);
            }
        });
    }

    public static void GetRebateOptionsForRebateIds(int i2, int i3, long[] jArr) {
        ArrayList arrayList = new ArrayList();
        for (long j2 : jArr) {
            arrayList.add(Long.valueOf(j2));
        }
        if (SdkUnity.ShouldLog()) {
            for (long j3 : jArr) {
                SdkUnity.Log("@IAP.GetRebateOptionsForRebateIds(): rebate: " + j3);
            }
        }
        a.d(SdkUnity.getGameActivity(), i2, i3, null, arrayList, new a.l() { // from class: com.garena.sdkunity.IAP.4
            @Override // com.garena.pay.android.a.l
            public void onGetRebateOptions(int i4, List<RebateOptionItem> list) {
                GetRebateOptionsResult getRebateOptionsResult = new GetRebateOptionsResult();
                getRebateOptionsResult.result = i4;
                getRebateOptionsResult.options = null;
                if (list != null) {
                    RebateOptionItem[] rebateOptionItemArr = new RebateOptionItem[list.size()];
                    getRebateOptionsResult.options = rebateOptionItemArr;
                    list.toArray(rebateOptionItemArr);
                }
                UnityMessgae.getInstance().sendToUnity("onGetRebateOptions", getRebateOptionsResult);
            }
        });
    }

    public static boolean IsGooglePlayServicesAvailable() {
        try {
            return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(SdkUnity.getGameActivity()) == 0;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String LoadEventConfigs(String str, boolean z) {
        if (g.y() == null) {
            return RETURN_NO_SESSION;
        }
        a.f(SdkUnity.getGameActivity(), str, z, new a.k() { // from class: com.garena.sdkunity.IAP.7
            @Override // com.garena.pay.android.a.k
            public void onEventResultObtained(int i2, List<LessIsMoreEvent> list, Exception exc) {
                LoadEventConfigsResult loadEventConfigsResult = new LoadEventConfigsResult();
                loadEventConfigsResult.result = i2;
                if (exc != null) {
                    loadEventConfigsResult.exception = exc.getMessage();
                }
                loadEventConfigsResult.eventsLessIsMore = list;
                UnityMessgae.getInstance().sendToUnity("onLoadEventConfigsResult", loadEventConfigsResult);
            }
        });
        return "";
    }

    public static String LoadEventPaymentOptions(String str, int i2, int i3, String str2, boolean z) {
        if (g.y() == null) {
            return RETURN_NO_SESSION;
        }
        GGPayment.GGPaymentBuilder gGPaymentBuilder = new GGPayment.GGPaymentBuilder();
        gGPaymentBuilder.setAppId(SdkUnity.appId).setBuyerId(g.y().I().f()).setToken(g.y().I().b()).setServerId(i2).setRoleId(i3).setPlatform(g.y().D().intValue()).setVirtualCurrencyName(str2).setConvertGooglePlayPrices(z).setRebateId(-1L);
        Locale locale = IAPLocale;
        if (locale != null) {
            gGPaymentBuilder.setLocale(locale);
        }
        a.a(SdkUnity.getGameActivity(), gGPaymentBuilder.build(), str, new a.p() { // from class: com.garena.sdkunity.IAP.8
            @Override // com.garena.pay.android.a.p
            public void onResultObtained(int i4, List<GGPayment.Denomination> list, List<PricingEvent> list2, Exception exc) {
                GetEventsPricingResult getEventsPricingResult = new GetEventsPricingResult();
                getEventsPricingResult.result = i4;
                if (exc != null) {
                    getEventsPricingResult.exception = exc.getMessage();
                }
                List unused = IAP._EventPaymentOptions = list;
                getEventsPricingResult.paymentOptions = list;
                getEventsPricingResult.pricingEvents = list2;
                UnityMessgae.getInstance().sendToUnity("onEventPaymentOptionsLoaded", getEventsPricingResult);
            }
        });
        return "";
    }

    public static String LoadPaymentOptions(int i2, int i3, String str, boolean z, long j2, boolean z2) {
        if (g.y() == null) {
            return RETURN_NO_SESSION;
        }
        GGPayment.GGPaymentBuilder gGPaymentBuilder = new GGPayment.GGPaymentBuilder();
        GGPayment.GGPaymentBuilder convertGooglePlayPrices = gGPaymentBuilder.setAppId(SdkUnity.appId).setBuyerId(g.y().I().f()).setToken(g.y().I().b()).setServerId(i2).setRoleId(i3).setPlatform(g.y().D().intValue()).setVirtualCurrencyName(str).setConvertGooglePlayPrices(z2);
        if (z) {
            j2 = -1;
        }
        convertGooglePlayPrices.setRebateId(j2);
        Locale locale = IAPLocale;
        if (locale != null) {
            gGPaymentBuilder.setLocale(locale);
        }
        a.o(SdkUnity.getGameActivity(), gGPaymentBuilder.build(), PaymentOptionsCallback);
        return "";
    }

    public static String LoadPaymentOptions(int i2, int i3, String str, boolean z, int[] iArr, long[] jArr) {
        if (g.y() == null) {
            return RETURN_NO_SESSION;
        }
        ArrayList arrayList = new ArrayList();
        if (iArr != null) {
            for (int i4 : iArr) {
                arrayList.add(Integer.toString(i4));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (jArr != null) {
            for (long j2 : jArr) {
                arrayList2.add(Long.toString(j2));
            }
        }
        if (SdkUnity.ShouldLog()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                SdkUnity.Log("@IAP.LoadPaymentOptions(): item: " + ((String) it.next()));
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                SdkUnity.Log("@IAP.LoadPaymentOptions(): rebate: " + ((String) it2.next()));
            }
        }
        GGPayment.GGPaymentBuilder gGPaymentBuilder = new GGPayment.GGPaymentBuilder();
        gGPaymentBuilder.setAppId(SdkUnity.appId).setBuyerId(g.y().I().f()).setToken(g.y().I().b()).setServerId(i2).setRoleId(i3).setPlatform(g.y().D().intValue()).setVirtualCurrencyName(str).setConvertGooglePlayPrices(z).setItemIds(arrayList).setRebateIds(arrayList2).setRebateId(-1L);
        if (arrayList2.size() <= 0) {
            gGPaymentBuilder.setRebateId(-1L);
        }
        Locale locale = IAPLocale;
        if (locale != null) {
            gGPaymentBuilder.setLocale(locale);
        }
        a.o(SdkUnity.getGameActivity(), gGPaymentBuilder.build(), PaymentOptionsCallback);
        return "";
    }

    public static String ProcessEventPayment(String str, String str2, String str3, int i2, int i3, String str4, boolean z) {
        GGPayment.Denomination denomination;
        if (g.y() == null) {
            return RETURN_NO_SESSION;
        }
        List<GGPayment.Denomination> list = _EventPaymentOptions;
        if (list == null) {
            return "No event denominations!";
        }
        Iterator<GGPayment.Denomination> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                denomination = null;
                break;
            }
            GGPayment.Denomination next = it.next();
            if (next.getItemId().equals(str2)) {
                denomination = next;
                break;
            }
        }
        if (denomination == null) {
            return "Denomination not found!";
        }
        denomination.setEventId(str3);
        GGPayment.GGPaymentBuilder gGPaymentBuilder = new GGPayment.GGPaymentBuilder();
        gGPaymentBuilder.setAppId(SdkUnity.appId).setBuyerId(g.y().I().f()).setToken(g.y().I().b()).setServerId(i2).setRoleId(i3).setPlatform(g.y().D().intValue()).setIsOfferPersonalized(z).setVirtualCurrencyName(str4);
        Locale locale = IAPLocale;
        if (locale != null) {
            gGPaymentBuilder.setLocale(locale);
        }
        a.g(SdkUnity.getGameActivity(), gGPaymentBuilder.build(), str, denomination, PAYMENT_REQUEST_ID, new a.n() { // from class: com.garena.sdkunity.IAP.9
            @Override // com.garena.pay.android.a.n
            public void onResultObtained(int i4, String str5, Exception exc) {
                if (i4 != 0) {
                    IAP.EventPayResponseCallback.onEventPayInitFailure(i4, exc);
                }
            }
        }, EventPayResponseCallback);
        return "";
    }

    public static String ProcessPayment(int i2, int i3, String str, long j2, boolean z) {
        if (g.y() == null) {
            return RETURN_NO_SESSION;
        }
        GGPayment.GGPaymentBuilder gGPaymentBuilder = new GGPayment.GGPaymentBuilder();
        gGPaymentBuilder.setAppId(SdkUnity.appId).setBuyerId(g.y().I().f()).setToken(g.y().I().b()).setServerId(i2).setRoleId(i3).setPlatform(g.y().D().intValue()).setVirtualCurrencyName(str).setIsOfferPersonalized(z).setRebateId(j2);
        Locale locale = IAPLocale;
        if (locale != null) {
            gGPaymentBuilder.setLocale(locale);
        }
        a.t(SdkUnity.getGameActivity(), gGPaymentBuilder.build(), PayResponseCallback, PAYMENT_REQUEST_ID);
        return "";
    }

    public static String ProcessPaymentWithChannelItem(int i2, int i3, String str, String str2, String str3, boolean z) {
        GGPayment.Denomination next;
        GGPayment.PaymentChannel next2;
        if (g.y() == null) {
            return RETURN_NO_SESSION;
        }
        List<GGPayment.PaymentChannel> list = _PaymentChannels;
        GGPayment.PaymentChannel paymentChannel = null;
        if (list != null) {
            Iterator<GGPayment.PaymentChannel> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (!next2.getChannelId().equals(str2));
            if (next2 == null) {
                next = null;
                break;
            }
            Iterator<GGPayment.Denomination> it2 = next2.getItems().iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!next.getItemId().equals(str3));
            paymentChannel = next2;
        } else {
            next = null;
        }
        if (paymentChannel != null && next != null) {
            GGPayment.GGPaymentBuilder gGPaymentBuilder = new GGPayment.GGPaymentBuilder();
            gGPaymentBuilder.setAppId(SdkUnity.appId).setBuyerId(g.y().I().f()).setToken(g.y().I().b()).setServerId(i2).setRoleId(i3).setPlatform(g.y().D().intValue()).setIsOfferPersonalized(z).setVirtualCurrencyName(str);
            Locale locale = IAPLocale;
            if (locale != null) {
                gGPaymentBuilder.setLocale(locale);
            }
            a.v(SdkUnity.getGameActivity(), gGPaymentBuilder.build(), PayResponseCallback, next, paymentChannel.getChannelId(), PAYMENT_REQUEST_ID);
            return "";
        }
        SdkUnity.LogError("@IAP.ProcessPaymentWithChannelItem(): cannot find " + str2 + ":" + str3);
        return "@IAP.ProcessPaymentWithChannelItem(): cannot find " + str2 + ":" + str3;
    }

    public static void Redeem(int i2, int i3, long j2) {
        a.h(SdkUnity.getGameActivity(), new GGRedeemRequest(g.y().I().b(), i2, i3, j2), new a.m() { // from class: com.garena.sdkunity.IAP.5
            @Override // com.garena.pay.android.a.m
            public void onRedeemResultObtained(int i4, GGRedeemResponse gGRedeemResponse) {
                RedeemResult redeemResult = new RedeemResult();
                redeemResult.result = i4;
                redeemResult.response = gGRedeemResponse;
                UnityMessgae.getInstance().sendToUnity("onRedeemResultObtained", redeemResult);
            }
        });
    }

    public static String ScanGoogleInAppPurchaseInventory(final int i2, final int i3) {
        if (g.y() == null || g.y().I() == null) {
            return RETURN_NO_SESSION;
        }
        SdkUnity.getGameActivity().runOnUiThread(new Runnable() { // from class: com.garena.sdkunity.IAP.6
            @Override // java.lang.Runnable
            public void run() {
                a.y(SdkUnity.getGameActivity(), SdkUnity.appId, g.y().I().b(), i2, i3, new h() { // from class: com.garena.sdkunity.IAP.6.1
                    @Override // com.garena.pay.android.h
                    public void onResult(List<h.a> list) {
                        ScanGoogleInAppPurchaseInventoryResult scanGoogleInAppPurchaseInventoryResult = new ScanGoogleInAppPurchaseInventoryResult();
                        if (list != null) {
                            scanGoogleInAppPurchaseInventoryResult.Copy((h.a[]) list.toArray(new h.a[list.size()]));
                        }
                        UnityMessgae.getInstance().sendToUnity("onScanGoogleInAppPurchaseInventoryResult", scanGoogleInAppPurchaseInventoryResult);
                    }
                });
            }
        });
        return "";
    }

    public static void SetLocale(String str, String str2) {
        IAPLocale = new Locale(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void _UpdatePaymentChannels(List<GGPayment.PaymentChannel> list) {
        if (list == null) {
            return;
        }
        for (GGPayment.PaymentChannel paymentChannel : list) {
            GGPayment.PaymentChannel paymentChannel2 = null;
            for (GGPayment.PaymentChannel paymentChannel3 : _PaymentChannels) {
                if (paymentChannel3.getChannelId().equals(paymentChannel.getChannelId())) {
                    paymentChannel2 = paymentChannel3;
                    break;
                }
            }
            if (paymentChannel2 == null) {
                _PaymentChannels.add(paymentChannel);
            } else if (paymentChannel.getItems() != null) {
                List<GGPayment.Denomination> items = paymentChannel2.getItems();
                if (items == null) {
                    items = new ArrayList<>();
                }
                for (GGPayment.Denomination denomination : paymentChannel.getItems()) {
                    boolean z = false;
                    for (int i2 = 0; i2 < items.size(); i2++) {
                        if (denomination.getItemId().equals(items.get(i2).getItemId())) {
                            items.set(i2, denomination);
                            z = true;
                            break;
                        }
                    }
                    if (!z) {
                        items.add(denomination);
                    }
                }
                paymentChannel2.setItems(items);
            }
        }
    }
}
