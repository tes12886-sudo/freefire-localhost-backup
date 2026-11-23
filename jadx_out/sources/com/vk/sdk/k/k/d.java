package com.vk.sdk.k.k;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class d extends r.b implements a, Parcelable {
    public int a;
    public int b;
    public String c;
    public String d;
    public int e;
    public String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1563g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1564h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1565i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f1566j;

    @Override // com.vk.sdk.k.k.g
    public /* bridge */ /* synthetic */ g c(JSONObject jSONObject) {
        h(jSONObject);
        return this;
    }

    @Override // com.vk.sdk.k.k.r.b
    public String d() {
        return "audio";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.vk.sdk.k.k.r.b
    public CharSequence f() {
        StringBuilder sb = new StringBuilder("audio");
        sb.append(this.b);
        sb.append('_');
        sb.append(this.a);
        if (!TextUtils.isEmpty(this.f1566j)) {
            sb.append('_');
            sb.append(this.f1566j);
        }
        return sb;
    }

    public d h(JSONObject jSONObject) {
        this.a = jSONObject.optInt("id");
        this.b = jSONObject.optInt("owner_id");
        this.c = jSONObject.optString("artist");
        this.d = jSONObject.optString("title");
        this.e = jSONObject.optInt("duration");
        this.f = jSONObject.optString("url");
        this.f1563g = jSONObject.optInt("lyrics_id");
        this.f1564h = jSONObject.optInt("album_id");
        this.f1565i = jSONObject.optInt("genre_id");
        this.f1566j = jSONObject.optString("access_key");
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.f1563g);
        parcel.writeInt(this.f1564h);
        parcel.writeInt(this.f1565i);
        parcel.writeString(this.f1566j);
    }
}
