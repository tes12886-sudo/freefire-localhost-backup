package com.vk.sdk.k.k;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class i extends r.b implements Parcelable, a {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f1576g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f1577h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f1578i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f1579j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f1580k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f1581l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f1582m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public u f1583n = new u();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1584o;
    public boolean p;
    public int q;
    public int r;
    public int s;
    public String t;

    @Override // com.vk.sdk.k.k.r.b
    public String d() {
        return "photo";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.vk.sdk.k.k.r.b
    public CharSequence f() {
        StringBuilder sb = new StringBuilder("photo");
        sb.append(this.c);
        sb.append('_');
        sb.append(this.a);
        if (!TextUtils.isEmpty(this.t)) {
            sb.append('_');
            sb.append(this.t);
        }
        return sb;
    }

    @Override // com.vk.sdk.k.k.g
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public i c(JSONObject jSONObject) {
        this.b = jSONObject.optInt("album_id");
        this.f1576g = jSONObject.optLong("date");
        this.e = jSONObject.optInt("height");
        this.d = jSONObject.optInt("width");
        this.c = jSONObject.optInt("owner_id");
        this.a = jSONObject.optInt("id");
        this.f = jSONObject.optString("text");
        this.t = jSONObject.optString("access_key");
        this.f1577h = jSONObject.optString("photo_75");
        this.f1578i = jSONObject.optString("photo_130");
        this.f1579j = jSONObject.optString("photo_604");
        this.f1580k = jSONObject.optString("photo_807");
        this.f1581l = jSONObject.optString("photo_1280");
        this.f1582m = jSONObject.optString("photo_2560");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("likes");
        this.q = b.c(jSONObjectOptJSONObject, "count");
        this.f1584o = b.b(jSONObjectOptJSONObject, "user_likes");
        this.r = b.c(jSONObject.optJSONObject("comments"), "count");
        this.s = b.c(jSONObject.optJSONObject("tags"), "count");
        this.p = b.b(jSONObject, "can_comment");
        this.f1583n.x(this.d, this.e);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("sizes");
        if (jSONArrayOptJSONArray != null) {
            this.f1583n.v(jSONArrayOptJSONArray);
        } else {
            if (!TextUtils.isEmpty(this.f1577h)) {
                this.f1583n.add(k.f(this.f1577h, 's', this.d, this.e));
            }
            if (!TextUtils.isEmpty(this.f1578i)) {
                this.f1583n.add(k.f(this.f1578i, 'm', this.d, this.e));
            }
            if (!TextUtils.isEmpty(this.f1579j)) {
                this.f1583n.add(k.f(this.f1579j, 'x', this.d, this.e));
            }
            if (!TextUtils.isEmpty(this.f1580k)) {
                this.f1583n.add(k.f(this.f1580k, 'y', this.d, this.e));
            }
            if (!TextUtils.isEmpty(this.f1581l)) {
                this.f1583n.add(k.f(this.f1581l, 'z', this.d, this.e));
            }
            if (!TextUtils.isEmpty(this.f1582m)) {
                this.f1583n.add(k.f(this.f1582m, 'w', this.d, this.e));
            }
            this.f1583n.y();
        }
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeLong(this.f1576g);
        parcel.writeParcelable(this.f1583n, i2);
        parcel.writeString(this.f1577h);
        parcel.writeString(this.f1578i);
        parcel.writeString(this.f1579j);
        parcel.writeString(this.f1580k);
        parcel.writeString(this.f1581l);
        parcel.writeString(this.f1582m);
        parcel.writeByte(this.f1584o ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.p ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r);
        parcel.writeInt(this.s);
        parcel.writeString(this.t);
    }
}
