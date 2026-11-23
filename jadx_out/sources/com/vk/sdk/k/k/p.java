package com.vk.sdk.k.k;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class p extends r.b implements Parcelable, a {
    public int F;
    public String G;
    public String H;
    public String I;
    public String J;
    public String K;
    public String L;
    public int a;
    public int b;
    public int c;
    public String d;
    public String e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f1605g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f1606h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1607i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f1608j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f1609k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f1610l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f1611m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public u f1612n = new u();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f1613o;
    public int p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;

    @Override // com.vk.sdk.k.k.g
    public /* bridge */ /* synthetic */ g c(JSONObject jSONObject) {
        h(jSONObject);
        return this;
    }

    @Override // com.vk.sdk.k.k.r.b
    public String d() {
        return "video";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.vk.sdk.k.k.r.b
    public CharSequence f() {
        StringBuilder sb = new StringBuilder("video");
        sb.append(this.b);
        sb.append('_');
        sb.append(this.a);
        if (!TextUtils.isEmpty(this.f1613o)) {
            sb.append('_');
            sb.append(this.f1613o);
        }
        return sb;
    }

    public p h(JSONObject jSONObject) {
        this.a = jSONObject.optInt("id");
        this.b = jSONObject.optInt("owner_id");
        this.d = jSONObject.optString("title");
        this.e = jSONObject.optString("description");
        this.f = jSONObject.optInt("duration");
        this.f1605g = jSONObject.optString("link");
        this.f1606h = jSONObject.optLong("date");
        this.f1607i = jSONObject.optInt("views");
        this.p = jSONObject.optInt("comments");
        this.f1608j = jSONObject.optString("player");
        this.f1613o = jSONObject.optString("access_key");
        this.c = jSONObject.optInt("album_id");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("likes");
        if (jSONObjectOptJSONObject != null) {
            this.u = jSONObjectOptJSONObject.optInt("count");
            this.s = b.b(jSONObjectOptJSONObject, "user_likes");
        }
        this.q = b.b(jSONObject, "can_comment");
        this.r = b.b(jSONObject, "can_repost");
        this.t = b.b(jSONObject, "repeat");
        this.v = v.a(jSONObject.optJSONObject("privacy_view"));
        this.F = v.a(jSONObject.optJSONObject("privacy_comment"));
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("files");
        if (jSONObjectOptJSONObject2 != null) {
            this.G = jSONObjectOptJSONObject2.optString("mp4_240");
            this.H = jSONObjectOptJSONObject2.optString("mp4_360");
            this.I = jSONObjectOptJSONObject2.optString("mp4_480");
            this.J = jSONObjectOptJSONObject2.optString("mp4_720");
            this.K = jSONObjectOptJSONObject2.optString("mp4_1080");
            this.L = jSONObjectOptJSONObject2.optString("external");
        }
        String strOptString = jSONObject.optString("photo_130");
        this.f1609k = strOptString;
        if (!TextUtils.isEmpty(strOptString)) {
            this.f1612n.add(k.h(this.f1609k, 130));
        }
        String strOptString2 = jSONObject.optString("photo_320");
        this.f1610l = strOptString2;
        if (!TextUtils.isEmpty(strOptString2)) {
            this.f1612n.add(k.h(this.f1610l, 320));
        }
        String strOptString3 = jSONObject.optString("photo_640");
        this.f1611m = strOptString3;
        if (!TextUtils.isEmpty(strOptString3)) {
            this.f1612n.add(k.h(this.f1611m, 640));
        }
        return this;
    }

    public String toString() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f);
        parcel.writeString(this.f1605g);
        parcel.writeLong(this.f1606h);
        parcel.writeInt(this.f1607i);
        parcel.writeString(this.f1608j);
        parcel.writeString(this.f1609k);
        parcel.writeString(this.f1610l);
        parcel.writeString(this.f1611m);
        parcel.writeParcelable(this.f1612n, i2);
        parcel.writeString(this.f1613o);
        parcel.writeInt(this.p);
        parcel.writeByte(this.q ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.r ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.s ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.t ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.u);
        parcel.writeInt(this.v);
        parcel.writeInt(this.F);
        parcel.writeString(this.G);
        parcel.writeString(this.H);
        parcel.writeString(this.I);
        parcel.writeString(this.J);
        parcel.writeString(this.K);
        parcel.writeString(this.L);
    }
}
