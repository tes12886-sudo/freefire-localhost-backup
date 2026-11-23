package com.facebook.share.c;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0102a();
    private final Bundle a;

    /* JADX INFO: renamed from: com.facebook.share.c.a$a, reason: collision with other inner class name */
    static class C0102a implements Parcelable.Creator<a> {
        C0102a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i2) {
            return new a[i2];
        }
    }

    /* JADX WARN: Unexpected interfaces in signature: [java.lang.Object<com.facebook.share.c.a, com.facebook.share.c.a$b>] */
    public static class b {
        private Bundle a = new Bundle();

        public a b() {
            return new a(this, null);
        }

        public b c(Parcel parcel) {
            d((a) parcel.readParcelable(a.class.getClassLoader()));
            return this;
        }

        public b d(a aVar) {
            if (aVar != null) {
                this.a.putAll(aVar.a);
            }
            return this;
        }
    }

    a(Parcel parcel) {
        this.a = parcel.readBundle(a.class.getClassLoader());
    }

    private a(b bVar) {
        this.a = bVar.a;
    }

    /* synthetic */ a(b bVar, C0102a c0102a) {
        this(bVar);
    }

    public Object b(String str) {
        return this.a.get(str);
    }

    public Set<String> c() {
        return this.a.keySet();
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
