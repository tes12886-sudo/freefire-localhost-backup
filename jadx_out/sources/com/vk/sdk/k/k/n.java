package com.vk.sdk.k.k;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class n extends r.b implements a, Parcelable {
    public int a;
    public int b;
    public int c;
    public long d;
    public String e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1597h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1598i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1599j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1600k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1601l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f1602m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1603n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1604o;
    public boolean p;
    public String q;
    public r r = new r();
    public l s;
    public int t;

    @Override // com.vk.sdk.k.k.g
    public /* bridge */ /* synthetic */ g c(JSONObject jSONObject) {
        h(jSONObject);
        return this;
    }

    @Override // com.vk.sdk.k.k.r.b
    public String d() {
        return "wall";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.vk.sdk.k.k.r.b
    public CharSequence f() {
        StringBuilder sb = new StringBuilder("wall");
        sb.append(this.b);
        sb.append('_');
        sb.append(this.a);
        return sb;
    }

    public n h(JSONObject jSONObject) {
        this.a = jSONObject.optInt("id");
        this.b = jSONObject.optInt("to_id");
        this.c = jSONObject.optInt("from_id");
        this.d = jSONObject.optLong("date");
        this.e = jSONObject.optString("text");
        this.f = jSONObject.optInt("reply_owner_id");
        this.f1596g = jSONObject.optInt("reply_post_id");
        this.f1597h = b.b(jSONObject, "friends_only");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("comments");
        if (jSONObjectOptJSONObject != null) {
            this.f1598i = jSONObjectOptJSONObject.optInt("count");
            this.f1599j = b.b(jSONObjectOptJSONObject, "can_post");
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("likes");
        if (jSONObjectOptJSONObject2 != null) {
            this.f1600k = jSONObjectOptJSONObject2.optInt("count");
            this.f1601l = b.b(jSONObjectOptJSONObject2, "user_likes");
            this.f1602m = b.b(jSONObjectOptJSONObject2, "can_like");
            this.f1603n = b.b(jSONObjectOptJSONObject2, "can_publish");
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("reposts");
        if (jSONObjectOptJSONObject3 != null) {
            this.f1604o = jSONObjectOptJSONObject3.optInt("count");
            this.p = b.b(jSONObjectOptJSONObject3, "user_reposted");
        }
        this.q = jSONObject.optString("post_type");
        this.r.t(jSONObject.optJSONArray("attachments"));
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("geo");
        if (jSONObjectOptJSONObject4 != null) {
            l lVar = new l();
            lVar.d(jSONObjectOptJSONObject4);
            this.s = lVar;
        }
        this.t = jSONObject.optInt("signer_id");
        new s(jSONObject.optJSONArray("copy_history"), n.class);
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeLong(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.f1596g);
        parcel.writeByte(this.f1597h ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f1598i);
        parcel.writeByte(this.f1599j ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f1600k);
        parcel.writeByte(this.f1601l ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f1602m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f1603n ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f1604o);
        parcel.writeByte(this.p ? (byte) 1 : (byte) 0);
        parcel.writeString(this.q);
        parcel.writeParcelable(this.r, i2);
        parcel.writeParcelable(this.s, i2);
        parcel.writeInt(this.t);
    }
}
