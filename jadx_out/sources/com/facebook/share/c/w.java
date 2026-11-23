package com.facebook.share.c;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class w extends h {
    public static final Parcelable.Creator<w> CREATOR = new a();
    private final Uri b;

    static class a implements Parcelable.Creator<w> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public w createFromParcel(Parcel parcel) {
            return new w(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public w[] newArray(int i2) {
            return new w[i2];
        }
    }

    public static final class b extends h.a<w, b> {
        private Uri b;

        public w f() {
            return new w(this, null);
        }

        b g(Parcel parcel) {
            return h((w) parcel.readParcelable(w.class.getClassLoader()));
        }

        public b h(w wVar) {
            if (wVar == null) {
                return this;
            }
            super.b(wVar);
            b bVar = this;
            bVar.i(wVar.c());
            return bVar;
        }

        public b i(Uri uri) {
            this.b = uri;
            return this;
        }
    }

    w(Parcel parcel) {
        super(parcel);
        this.b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }

    private w(b bVar) {
        super(bVar);
        this.b = bVar.b;
    }

    /* synthetic */ w(b bVar, a aVar) {
        this(bVar);
    }

    @Override // com.facebook.share.c.h
    public h.b a() {
        return h.b.VIDEO;
    }

    public Uri c() {
        return this.b;
    }

    @Override // com.facebook.share.c.h, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.share.c.h, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeParcelable(this.b, 0);
    }
}
