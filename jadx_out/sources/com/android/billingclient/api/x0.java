package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class x0 extends BroadcastReceiver {
    private final m a;
    private final l0 b;
    private final t0 c;
    private boolean d;
    final /* synthetic */ y0 e;

    /* synthetic */ x0(y0 y0Var, l0 l0Var, w0 w0Var) {
        this.e = y0Var;
        this.a = null;
        this.c = null;
        this.b = null;
    }

    /* synthetic */ x0(y0 y0Var, m mVar, t0 t0Var, w0 w0Var) {
        this.e = y0Var;
        this.a = mVar;
        this.c = t0Var;
        this.b = null;
    }

    static /* bridge */ /* synthetic */ l0 a(x0 x0Var) {
        l0 l0Var = x0Var.b;
        return null;
    }

    public final void c(Context context, IntentFilter intentFilter) {
        if (this.d) {
            return;
        }
        context.registerReceiver(this.e.b, intentFilter);
        this.d = true;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        h hVarH = j.d.a.c.f.h.k.h(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
            this.a.onPurchasesUpdated(hVarH, j.d.a.c.f.h.k.k(intent.getExtras()));
            return;
        }
        if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            Bundle extras = intent.getExtras();
            if (hVarH.b() != 0) {
                this.a.onPurchasesUpdated(hVarH, j.d.a.c.f.h.b0.t());
                return;
            }
            if (this.c == null) {
                j.d.a.c.f.h.k.m("BillingBroadcastManager", "AlternativeBillingListener is null.");
                this.a.onPurchasesUpdated(i0.f469j, j.d.a.c.f.h.b0.t());
                return;
            }
            if (extras == null) {
                j.d.a.c.f.h.k.m("BillingBroadcastManager", "Bundle is null.");
                this.a.onPurchasesUpdated(i0.f469j, j.d.a.c.f.h.b0.t());
                return;
            }
            String string = extras.getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
            if (string == null) {
                j.d.a.c.f.h.k.m("BillingBroadcastManager", "Couldn't find alternative billing user choice data in bundle.");
                this.a.onPurchasesUpdated(i0.f469j, j.d.a.c.f.h.b0.t());
                return;
            }
            try {
                JSONArray jSONArrayOptJSONArray = new JSONObject(string).optJSONArray("products");
                ArrayList arrayList = new ArrayList();
                if (jSONArrayOptJSONArray != null) {
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                        if (jSONObjectOptJSONObject != null) {
                            arrayList.add(new v0(jSONObjectOptJSONObject, null));
                        }
                    }
                }
                this.c.zza();
            } catch (JSONException unused) {
                j.d.a.c.f.h.k.m("BillingBroadcastManager", String.format("Error when parsing invalid alternative choice data: [%s]", string));
                this.a.onPurchasesUpdated(i0.f469j, j.d.a.c.f.h.b0.t());
            }
        }
    }
}
