package com.facebook.share.c;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class h implements Parcelable {
    private final Bundle a;

    /* JADX WARN: Unexpected interfaces in signature: [java.lang.Object<M, B>] */
    public static abstract class a<M extends h, B extends a> {
        private Bundle a = new Bundle();

        static List<h> c(Parcel parcel) {
            Parcelable[] parcelableArray = parcel.readParcelableArray(h.class.getClassLoader());
            ArrayList arrayList = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((h) parcelable);
            }
            return arrayList;
        }

        public B b(M m2) {
            if (m2 == null) {
                return this;
            }
            d(m2.b());
            return this;
        }

        @Deprecated
        public B d(Bundle bundle) {
            this.a.putAll(bundle);
            return this;
        }
    }

    public enum b {
        PHOTO,
        VIDEO
    }

    h(Parcel parcel) {
        this.a = parcel.readBundle();
    }

    protected h(a aVar) {
        this.a = new Bundle(aVar.a);
    }

    public abstract b a();

    @Deprecated
    public Bundle b() {
        return new Bundle(this.a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeBundle(this.a);
    }
}
