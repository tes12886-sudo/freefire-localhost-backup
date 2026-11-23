package com.vk.sdk.k.k;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class u extends s<k> implements Parcelable {
    private String e;
    private int f;
    private int c = 1;
    private int d = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final s.a<k> f1622g = new a();

    class a implements s.a<k> {
        a() {
        }

        @Override // com.vk.sdk.k.k.s.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public k a(JSONObject jSONObject) {
            return k.s(jSONObject, u.this.c, u.this.d);
        }
    }

    @Override // com.vk.sdk.k.k.s, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void v(JSONArray jSONArray) {
        h(jSONArray, this.f1622g);
        y();
    }

    public String w(char c) {
        for (k kVar : this) {
            if (kVar.d == c) {
                return kVar.a;
            }
        }
        return null;
    }

    @Override // com.vk.sdk.k.k.s, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f);
    }

    public void x(int i2, int i3) {
        if (i2 != 0) {
            this.c = i2;
        }
        if (i3 != 0) {
            this.d = i3;
        }
    }

    public void y() {
        Collections.sort(this);
    }
}
