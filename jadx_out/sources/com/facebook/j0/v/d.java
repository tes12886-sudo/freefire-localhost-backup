package com.facebook.j0.v;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.internal.i0;
import com.facebook.internal.s;
import com.facebook.internal.t;
import com.facebook.internal.u;
import com.facebook.j0.m;
import com.facebook.r;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    private static final String a = "com.facebook.j0.v.d";
    public static final d c = new d();
    private static final m b = new m(r.f());

    private static final class a {
        private BigDecimal a;
        private Currency b;
        private Bundle c;

        public a(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
            l.y.c.i.e(bigDecimal, "purchaseAmount");
            l.y.c.i.e(currency, "currency");
            l.y.c.i.e(bundle, "param");
            this.a = bigDecimal;
            this.b = currency;
            this.c = bundle;
        }

        public final Currency a() {
            return this.b;
        }

        public final Bundle b() {
            return this.c;
        }

        public final BigDecimal c() {
            return this.a;
        }
    }

    private d() {
    }

    private final a a(String str, String str2) {
        return b(str, str2, new HashMap());
    }

    private final a b(String str, String str2, Map<String, String> map) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(str2);
            boolean z = true;
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_iap_product_id", jSONObject.getString("productId"));
            bundle.putCharSequence("fb_iap_purchase_time", jSONObject.getString("purchaseTime"));
            bundle.putCharSequence("fb_iap_purchase_token", jSONObject.getString("purchaseToken"));
            bundle.putCharSequence("fb_iap_package_name", jSONObject.optString("packageName"));
            bundle.putCharSequence("fb_iap_product_title", jSONObject2.optString("title"));
            bundle.putCharSequence("fb_iap_product_description", jSONObject2.optString("description"));
            String strOptString = jSONObject2.optString("type");
            bundle.putCharSequence("fb_iap_product_type", strOptString);
            if (l.y.c.i.a(strOptString, "subs")) {
                bundle.putCharSequence("fb_iap_subs_auto_renewing", Boolean.toString(jSONObject.optBoolean("autoRenewing", false)));
                bundle.putCharSequence("fb_iap_subs_period", jSONObject2.optString("subscriptionPeriod"));
                bundle.putCharSequence("fb_free_trial_period", jSONObject2.optString("freeTrialPeriod"));
                String strOptString2 = jSONObject2.optString("introductoryPriceCycles");
                l.y.c.i.d(strOptString2, "introductoryPriceCycles");
                if (strOptString2.length() != 0) {
                    z = false;
                }
                if (!z) {
                    bundle.putCharSequence("fb_intro_price_amount_micros", jSONObject2.optString("introductoryPriceAmountMicros"));
                    bundle.putCharSequence("fb_intro_price_cycles", strOptString2);
                }
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                bundle.putCharSequence(entry.getKey(), entry.getValue());
            }
            double d = jSONObject2.getLong("price_amount_micros");
            Double.isNaN(d);
            BigDecimal bigDecimal = new BigDecimal(d / 1000000.0d);
            Currency currency = Currency.getInstance(jSONObject2.getString("price_currency_code"));
            l.y.c.i.d(currency, "Currency.getInstance(sku…g(\"price_currency_code\"))");
            return new a(bigDecimal, currency, bundle);
        } catch (JSONException e) {
            Log.e(a, "Error parsing in-app subscription data.", e);
            return null;
        }
    }

    public static final boolean c() {
        t tVarJ = u.j(r.g());
        return tVarJ != null && r.j() && tVarJ.f();
    }

    public static final void d() {
        Context contextF = r.f();
        String strG = r.g();
        boolean zJ = r.j();
        i0.m(contextF, "context");
        if (zJ) {
            if (contextF instanceof Application) {
                com.facebook.j0.g.b.a((Application) contextF, strG);
            } else {
                Log.w(a, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
            }
        }
    }

    public static final void e(String str, long j2) {
        Context contextF = r.f();
        String strG = r.g();
        i0.m(contextF, "context");
        t tVarO = u.o(strG, false);
        if (tVarO == null || !tVarO.a() || j2 <= 0) {
            return;
        }
        m mVar = new m(contextF);
        Bundle bundle = new Bundle(1);
        bundle.putCharSequence("fb_aa_time_spent_view_name", str);
        mVar.c("fb_aa_time_spent_on_view", j2, bundle);
    }

    public static final void f(String str, String str2, boolean z) {
        a aVarA;
        l.y.c.i.e(str, "purchase");
        l.y.c.i.e(str2, "skuDetails");
        if (c() && (aVarA = c.a(str, str2)) != null) {
            boolean z2 = false;
            if (z && s.f("app_events_if_auto_log_subs", r.g(), false)) {
                z2 = true;
            }
            if (z2) {
                b.i(com.facebook.j0.t.d.f.m(str2) ? "StartTrial" : "Subscribe", aVarA.c(), aVarA.a(), aVarA.b());
            } else {
                b.j(aVarA.c(), aVarA.a(), aVarA.b());
            }
        }
    }
}
