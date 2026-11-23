package com.vk.sdk.k.k;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c extends r.b implements Parcelable {
    public int a;
    public String b;
    public String c;
    public String d;
    public u e = new u();

    @Override // com.vk.sdk.k.k.g
    public /* bridge */ /* synthetic */ g c(JSONObject jSONObject) {
        h(jSONObject);
        return this;
    }

    @Override // com.vk.sdk.k.k.r.b
    public String d() {
        return "app";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.vk.sdk.k.k.r.b
    public CharSequence f() {
        throw new UnsupportedOperationException("Attaching app info is not supported by VK.com API");
    }

    public c h(JSONObject jSONObject) {
        this.a = jSONObject.optInt("id");
        this.b = jSONObject.optString("name");
        String strOptString = jSONObject.optString("photo_130");
        this.c = strOptString;
        if (!TextUtils.isEmpty(strOptString)) {
            this.e.add(k.h(this.c, 130));
        }
        String strOptString2 = jSONObject.optString("photo_604");
        this.d = strOptString2;
        if (!TextUtils.isEmpty(strOptString2)) {
            this.e.add(k.h(this.d, 604));
        }
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeParcelable(this.e, i2);
    }
}
