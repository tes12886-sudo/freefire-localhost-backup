package com.facebook.share.c;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v extends e<v, Object> {
    public static final Parcelable.Creator<v> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final h f780g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final t f781h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<String> f782i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f783j;

    static class a implements Parcelable.Creator<v> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public v createFromParcel(Parcel parcel) {
            return new v(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public v[] newArray(int i2) {
            return new v[i2];
        }
    }

    v(Parcel parcel) {
        super(parcel);
        this.f780g = (h) parcel.readParcelable(h.class.getClassLoader());
        this.f781h = (t) parcel.readParcelable(t.class.getClassLoader());
        this.f782i = g(parcel);
        this.f783j = parcel.readString();
    }

    private List<String> g(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // com.facebook.share.c.e
    public int describeContents() {
        return 0;
    }

    public String h() {
        return this.f783j;
    }

    public h i() {
        return this.f780g;
    }

    public List<String> j() {
        List<String> list = this.f782i;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public t k() {
        return this.f781h;
    }

    @Override // com.facebook.share.c.e
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeParcelable(this.f780g, 0);
        parcel.writeParcelable(this.f781h, 0);
        parcel.writeStringList(this.f782i);
        parcel.writeString(this.f783j);
    }
}
