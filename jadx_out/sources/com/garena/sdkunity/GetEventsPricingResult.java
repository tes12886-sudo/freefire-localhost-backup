package com.garena.sdkunity;

import com.beetalk.sdk.networking.model.PricingEvent;
import com.garena.pay.android.data.GGPayment;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class GetEventsPricingResult {
    public String exception;
    public List<GGPayment.Denomination> paymentOptions;
    public List<PricingEvent> pricingEvents;
    public int result;
}
