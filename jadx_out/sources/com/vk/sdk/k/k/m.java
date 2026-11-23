package com.vk.sdk.k.k;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class m extends r.b implements Parcelable {
    public int a;
    public int b;
    public long c;
    public String d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s<a> f1595g;

    public static final class a extends g implements com.vk.sdk.k.k.a, Parcelable {
        public int a;
        public String b;
        public int c;
        public double d;

        @Override // com.vk.sdk.k.k.g
        public /* bridge */ /* synthetic */ g c(JSONObject jSONObject) {
            d(jSONObject);
            return this;
        }

        public a d(JSONObject jSONObject) {
            this.a = jSONObject.optInt("id");
            this.b = jSONObject.optString("text");
            this.c = jSONObject.optInt("votes");
            this.d = jSONObject.optDouble("rate");
            return this;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.a);
            parcel.writeString(this.b);
            parcel.writeInt(this.c);
            parcel.writeDouble(this.d);
        }
    }

    @Override // com.vk.sdk.k.k.g
    public /* bridge */ /* synthetic */ g c(JSONObject jSONObject) {
        h(jSONObject);
        return this;
    }

    @Override // com.vk.sdk.k.k.r.b
    public String d() {
        return "poll";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.vk.sdk.k.k.r.b
    public CharSequence f() {
        return null;
    }

    public m h(JSONObject jSONObject) {
        this.a = jSONObject.optInt("id");
        this.b = jSONObject.optInt("owner_id");
        this.c = jSONObject.optLong("created");
        this.d = jSONObject.optString("question");
        this.e = jSONObject.optInt("votes");
        this.f = jSONObject.optInt("answer_id");
        this.f1595g = new s<>(jSONObject.optJSONArray("answers"), a.class);
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeLong(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeParcelable(this.f1595g, i2);
    }
}
