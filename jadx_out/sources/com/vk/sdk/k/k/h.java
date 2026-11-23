package com.vk.sdk.k.k;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class h extends r.b implements a, Parcelable {
    public int a;
    public int b;
    public String c;
    public String d;
    public long e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1574g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f1575h;

    @Override // com.vk.sdk.k.k.g
    public /* bridge */ /* synthetic */ g c(JSONObject jSONObject) {
        h(jSONObject);
        return this;
    }

    @Override // com.vk.sdk.k.k.r.b
    public String d() {
        return "note";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.vk.sdk.k.k.r.b
    public CharSequence f() {
        StringBuilder sb = new StringBuilder("note");
        sb.append(this.b);
        sb.append('_');
        sb.append(this.a);
        return sb;
    }

    public h h(JSONObject jSONObject) {
        this.a = jSONObject.optInt("id");
        this.b = jSONObject.optInt("user_id");
        this.c = jSONObject.optString("title");
        this.d = jSONObject.optString("text");
        this.e = jSONObject.optLong("date");
        this.f = jSONObject.optInt("comments");
        this.f1574g = jSONObject.optInt("read_comments");
        this.f1575h = jSONObject.optString("view_url");
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeLong(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.f1574g);
        parcel.writeString(this.f1575h);
    }
}
