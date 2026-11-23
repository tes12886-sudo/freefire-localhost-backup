package com.vk.sdk.k.k;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class l extends g implements Parcelable, a {
    public int a;
    public String b;
    public double c;
    public double d;
    public long e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f1591g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1592h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1593i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f1594j;

    @Override // com.vk.sdk.k.k.g
    public /* bridge */ /* synthetic */ g c(JSONObject jSONObject) {
        d(jSONObject);
        return this;
    }

    public l d(JSONObject jSONObject) {
        this.a = jSONObject.optInt("id");
        this.b = jSONObject.optString("title");
        this.c = jSONObject.optDouble("latitude");
        this.d = jSONObject.optDouble("longitude");
        this.e = jSONObject.optLong("created");
        this.f = jSONObject.optInt("checkins");
        this.f1591g = jSONObject.optLong("updated");
        this.f1592h = jSONObject.optInt("country");
        this.f1593i = jSONObject.optInt("city");
        this.f1594j = jSONObject.optString("address");
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f1594j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeDouble(this.c);
        parcel.writeDouble(this.d);
        parcel.writeLong(this.e);
        parcel.writeInt(this.f);
        parcel.writeLong(this.f1591g);
        parcel.writeInt(this.f1592h);
        parcel.writeInt(this.f1593i);
        parcel.writeString(this.f1594j);
    }
}
