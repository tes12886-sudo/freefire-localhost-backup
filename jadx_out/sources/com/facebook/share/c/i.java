package com.facebook.share.c;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i extends e<i, Object> {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<h> f766g;

    static class a implements Parcelable.Creator<i> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public i createFromParcel(Parcel parcel) {
            return new i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i[] newArray(int i2) {
            return new i[i2];
        }
    }

    i(Parcel parcel) {
        super(parcel);
        this.f766g = Arrays.asList((h[]) parcel.readParcelableArray(h.class.getClassLoader()));
    }

    @Override // com.facebook.share.c.e
    public int describeContents() {
        return 0;
    }

    public List<h> h() {
        return this.f766g;
    }

    @Override // com.facebook.share.c.e
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeParcelableArray((h[]) this.f766g.toArray(), i2);
    }
}
