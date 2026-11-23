package com.facebook.share.c;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();
    private final String a;

    static class a implements Parcelable.Creator<f> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f[] newArray(int i2) {
            return new f[i2];
        }
    }

    /* JADX WARN: Unexpected interfaces in signature: [java.lang.Object<com.facebook.share.c.f, com.facebook.share.c.f$b>] */
    public static class b {
        private String a;

        public f b() {
            return new f(this, null);
        }

        b c(Parcel parcel) {
            d((f) parcel.readParcelable(f.class.getClassLoader()));
            return this;
        }

        public b d(f fVar) {
            if (fVar == null) {
                return this;
            }
            e(fVar.a());
            return this;
        }

        public b e(String str) {
            this.a = str;
            return this;
        }
    }

    f(Parcel parcel) {
        this.a = parcel.readString();
    }

    private f(b bVar) {
        this.a = bVar.a;
    }

    /* synthetic */ f(b bVar, a aVar) {
        this(bVar);
    }

    public String a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.a);
    }
}
