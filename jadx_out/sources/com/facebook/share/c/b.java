package com.facebook.share.c;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();
    private final Bundle a;

    static class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i2) {
            return new b[i2];
        }
    }

    /* JADX WARN: Unexpected interfaces in signature: [java.lang.Object<com.facebook.share.c.b, com.facebook.share.c.b$b>] */
    /* JADX INFO: renamed from: com.facebook.share.c.b$b, reason: collision with other inner class name */
    public static class C0103b {
        private Bundle a = new Bundle();

        public b b() {
            return new b(this, null);
        }

        public C0103b c(Parcel parcel) {
            d((b) parcel.readParcelable(b.class.getClassLoader()));
            return this;
        }

        public C0103b d(b bVar) {
            if (bVar != null) {
                this.a.putAll(bVar.a);
            }
            return this;
        }
    }

    b(Parcel parcel) {
        this.a = parcel.readBundle(b.class.getClassLoader());
    }

    private b(C0103b c0103b) {
        this.a = c0103b.a;
    }

    /* synthetic */ b(C0103b c0103b, a aVar) {
        this(c0103b);
    }

    public Bitmap b(String str) {
        Object obj = this.a.get(str);
        if (obj instanceof Bitmap) {
            return (Bitmap) obj;
        }
        return null;
    }

    public Uri c(String str) {
        Object obj = this.a.get(str);
        if (obj instanceof Uri) {
            return (Uri) obj;
        }
        return null;
    }

    public Set<String> d() {
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
