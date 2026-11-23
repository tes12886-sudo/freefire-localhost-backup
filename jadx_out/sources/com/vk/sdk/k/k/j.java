package com.vk.sdk.k.k;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class j extends r.b implements Parcelable, a {
    public int a;
    public String b;
    public int c;
    public int d;
    public String e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1585g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f1586h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f1587i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1588j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f1589k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public u f1590l = new u();

    @Override // com.vk.sdk.k.k.g
    public /* bridge */ /* synthetic */ g c(JSONObject jSONObject) {
        h(jSONObject);
        return this;
    }

    @Override // com.vk.sdk.k.k.r.b
    public String d() {
        return "album";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.vk.sdk.k.k.r.b
    public CharSequence f() {
        StringBuilder sb = new StringBuilder("album");
        sb.append(this.f);
        sb.append('_');
        sb.append(this.a);
        return sb;
    }

    public j h(JSONObject jSONObject) {
        this.a = jSONObject.optInt("id");
        this.f1588j = jSONObject.optInt("thumb_id");
        this.f = jSONObject.optInt("owner_id");
        this.b = jSONObject.optString("title");
        this.e = jSONObject.optString("description");
        this.f1587i = jSONObject.optLong("created");
        this.f1586h = jSONObject.optLong("updated");
        this.c = jSONObject.optInt("size");
        this.f1585g = b.b(jSONObject, "can_upload");
        this.f1589k = jSONObject.optString("thumb_src");
        this.d = jSONObject.has("privacy") ? jSONObject.optInt("privacy") : v.a(jSONObject.optJSONObject("privacy_view"));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("sizes");
        if (jSONArrayOptJSONArray != null) {
            this.f1590l.v(jSONArrayOptJSONArray);
        } else {
            this.f1590l.add(k.j("http://vk.com/images/s_noalbum.png", 75, 55));
            this.f1590l.add(k.j("http://vk.com/images/m_noalbum.png", 130, 97));
            this.f1590l.add(k.j("http://vk.com/images/x_noalbum.png", 432, 249));
            this.f1590l.y();
        }
        return this;
    }

    public String toString() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f);
        parcel.writeByte(this.f1585g ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f1586h);
        parcel.writeLong(this.f1587i);
        parcel.writeInt(this.f1588j);
        parcel.writeString(this.f1589k);
        parcel.writeParcelable(this.f1590l, i2);
    }
}
