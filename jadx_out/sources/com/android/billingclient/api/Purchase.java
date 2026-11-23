package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Purchase {
    private final String a;
    private final String b;
    private final JSONObject c;

    public Purchase(String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = new JSONObject(str);
    }

    private final ArrayList j() {
        ArrayList arrayList = new ArrayList();
        if (this.c.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = this.c.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i2));
                }
            }
        } else if (this.c.has("productId")) {
            arrayList.add(this.c.optString("productId"));
        }
        return arrayList;
    }

    public a a() {
        String strOptString = this.c.optString("obfuscatedAccountId");
        String strOptString2 = this.c.optString("obfuscatedProfileId");
        if (strOptString == null && strOptString2 == null) {
            return null;
        }
        return new a(strOptString, strOptString2);
    }

    public String b() {
        return this.c.optString("orderId");
    }

    public String c() {
        return this.a;
    }

    public int d() {
        return this.c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public String e() {
        JSONObject jSONObject = this.c;
        return jSONObject.optString(j.c.a.a.EXTRA_TOKEN, jSONObject.optString("purchaseToken"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.a, purchase.c()) && TextUtils.equals(this.b, purchase.g());
    }

    public int f() {
        return this.c.optInt("quantity", 1);
    }

    public String g() {
        return this.b;
    }

    @Deprecated
    public ArrayList<String> h() {
        return j();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean i() {
        return this.c.optBoolean("acknowledged", true);
    }

    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.a));
    }
}
