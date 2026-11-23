package com.garena.pay.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.beetalk.sdk.u.j;
import com.garena.pay.android.data.GGPayment;
import i.i;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements Serializable {
    private GGPayment.PaymentChannel a;

    e() {
    }

    List<GGPayment.Denomination> h() {
        GGPayment.PaymentChannel paymentChannel = this.a;
        if (paymentChannel != null) {
            return paymentChannel.getItems();
        }
        return null;
    }

    public String i(Context context) {
        return null;
    }

    public String j() {
        return null;
    }

    public int k() {
        return 0;
    }

    public GGPayment.PaymentChannel l() {
        return this.a;
    }

    boolean m() {
        GGPayment.PaymentChannel paymentChannel = this.a;
        return paymentChannel != null && paymentChannel.isDirectPay();
    }

    abstract void n();

    void o(Intent intent) {
    }

    void p(GGPayment.PaymentChannel paymentChannel) {
        this.a = paymentChannel;
    }

    abstract i<j> q(Activity activity, d dVar, String str, i.g<Boolean, Boolean> gVar);
}
