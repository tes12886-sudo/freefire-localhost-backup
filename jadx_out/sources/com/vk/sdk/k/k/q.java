package com.vk.sdk.k.k;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class q extends r.b implements Parcelable {
    public int a;
    public int b;
    public int c;
    public String d;
    public String e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1614g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1615h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1616i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1617j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f1618k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f1619l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f1620m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f1621n;

    @Override // com.vk.sdk.k.k.g
    public /* bridge */ /* synthetic */ g c(JSONObject jSONObject) {
        h(jSONObject);
        return this;
    }

    @Override // com.vk.sdk.k.k.r.b
    public String d() {
        return "page";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.vk.sdk.k.k.r.b
    public CharSequence f() {
        StringBuilder sb = new StringBuilder("page");
        sb.append(this.b);
        sb.append('_');
        sb.append(this.a);
        return sb;
    }

    public q h(JSONObject jSONObject) {
        this.a = jSONObject.optInt("id");
        this.b = jSONObject.optInt("group_id");
        this.c = jSONObject.optInt("creator_id");
        this.d = jSONObject.optString("title");
        this.e = jSONObject.optString("source");
        this.f = b.b(jSONObject, "current_user_can_edit");
        this.f1614g = b.b(jSONObject, "current_user_can_edit_access");
        this.f1615h = jSONObject.optInt("who_can_view");
        this.f1616i = jSONObject.optInt("who_can_edit");
        this.f1617j = jSONObject.optInt("editor_id");
        this.f1618k = jSONObject.optLong("edited");
        this.f1619l = jSONObject.optLong("created");
        this.f1620m = jSONObject.optString("parent");
        this.f1621n = jSONObject.optString("parent2");
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f1614g ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f1615h);
        parcel.writeInt(this.f1616i);
        parcel.writeInt(this.f1617j);
        parcel.writeLong(this.f1618k);
        parcel.writeLong(this.f1619l);
        parcel.writeString(this.f1620m);
        parcel.writeString(this.f1621n);
    }
}
