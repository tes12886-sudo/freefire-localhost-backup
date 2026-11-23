package com.vk.sdk.k.k;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class e extends r.b implements Parcelable, a {
    public int a;
    public int b;
    public String c;
    public long d;
    public String e;
    public String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f1567g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f1568h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f1570j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f1572l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f1573m;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public u f1569i = new u();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f1571k = 0;

    @Override // com.vk.sdk.k.k.g
    public /* bridge */ /* synthetic */ g c(JSONObject jSONObject) {
        h(jSONObject);
        return this;
    }

    @Override // com.vk.sdk.k.k.r.b
    public String d() {
        return "doc";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.vk.sdk.k.k.r.b
    public CharSequence f() {
        StringBuilder sb = new StringBuilder("doc");
        sb.append(this.b);
        sb.append('_');
        sb.append(this.a);
        if (!TextUtils.isEmpty(this.f1570j)) {
            sb.append('_');
            sb.append(this.f1570j);
        }
        return sb;
    }

    public e h(JSONObject jSONObject) {
        this.a = jSONObject.optInt("id");
        this.b = jSONObject.optInt("owner_id");
        this.c = jSONObject.optString("title");
        this.d = jSONObject.optLong("size");
        this.e = jSONObject.optString("ext");
        this.f = jSONObject.optString("url");
        this.f1570j = jSONObject.optString("access_key");
        this.f1571k = jSONObject.optLong("date", 0L) * 1000;
        String strOptString = jSONObject.optString("photo_100");
        this.f1567g = strOptString;
        if (!TextUtils.isEmpty(strOptString)) {
            this.f1569i.add(k.j(this.f1567g, 100, 75));
        }
        String strOptString2 = jSONObject.optString("photo_130");
        this.f1568h = strOptString2;
        if (!TextUtils.isEmpty(strOptString2)) {
            this.f1569i.add(k.j(this.f1568h, 130, 100));
        }
        this.f1569i.y();
        return this;
    }

    public String toString() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeLong(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeLong(this.f1571k);
        parcel.writeString(this.f1567g);
        parcel.writeString(this.f1568h);
        parcel.writeParcelable(this.f1569i, i2);
        parcel.writeString(this.f1570j);
        parcel.writeByte(this.f1573m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f1572l ? (byte) 1 : (byte) 0);
    }
}
