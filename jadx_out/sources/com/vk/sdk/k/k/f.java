package com.vk.sdk.k.k;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class f extends r.b implements Parcelable {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;

    public f() {
    }

    public f(String str) {
        this.a = str;
    }

    @Override // com.vk.sdk.k.k.g
    public /* bridge */ /* synthetic */ g c(JSONObject jSONObject) {
        h(jSONObject);
        return this;
    }

    @Override // com.vk.sdk.k.k.r.b
    public String d() {
        return "link";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.vk.sdk.k.k.r.b
    public CharSequence f() {
        return this.a;
    }

    public f h(JSONObject jSONObject) {
        this.a = jSONObject.optString("url");
        this.b = jSONObject.optString("title");
        this.c = jSONObject.optString("description");
        this.d = jSONObject.optString("image_src");
        this.e = jSONObject.optString("preview_page");
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
