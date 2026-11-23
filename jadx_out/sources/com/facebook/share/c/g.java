package com.facebook.share.c;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class g extends e<g, b> {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    private final String f757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    private final String f758h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Deprecated
    private final Uri f759i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f760j;

    static class a implements Parcelable.Creator<g> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g[] newArray(int i2) {
            return new g[i2];
        }
    }

    public static final class b extends e.a<g, b> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        static final String f761k = "g$b";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Deprecated
        private String f762g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Deprecated
        private String f763h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Deprecated
        private Uri f764i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f765j;

        public g r() {
            return new g(this, null);
        }

        @Deprecated
        public b s(String str) {
            Log.w(f761k, "This method does nothing. ContentDescription is deprecated in Graph API 2.9.");
            return this;
        }

        @Deprecated
        public b t(String str) {
            Log.w(f761k, "This method does nothing. ContentTitle is deprecated in Graph API 2.9.");
            return this;
        }

        @Deprecated
        public b u(Uri uri) {
            Log.w(f761k, "This method does nothing. ImageUrl is deprecated in Graph API 2.9.");
            return this;
        }
    }

    g(Parcel parcel) {
        super(parcel);
        this.f757g = parcel.readString();
        this.f758h = parcel.readString();
        this.f759i = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f760j = parcel.readString();
    }

    private g(b bVar) {
        super(bVar);
        this.f757g = bVar.f762g;
        this.f758h = bVar.f763h;
        this.f759i = bVar.f764i;
        this.f760j = bVar.f765j;
    }

    /* synthetic */ g(b bVar, a aVar) {
        this(bVar);
    }

    @Override // com.facebook.share.c.e
    public int describeContents() {
        return 0;
    }

    @Deprecated
    public String h() {
        return this.f757g;
    }

    @Deprecated
    public String i() {
        return this.f758h;
    }

    @Deprecated
    public Uri j() {
        return this.f759i;
    }

    public String k() {
        return this.f760j;
    }

    @Override // com.facebook.share.c.e
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.f757g);
        parcel.writeString(this.f758h);
        parcel.writeParcelable(this.f759i, 0);
        parcel.writeString(this.f760j);
    }
}
