package com.facebook.share.c;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class t extends h {
    public static final Parcelable.Creator<t> CREATOR = new a();
    private final Bitmap b;
    private final Uri c;
    private final boolean d;
    private final String e;

    static class a implements Parcelable.Creator<t> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public t createFromParcel(Parcel parcel) {
            return new t(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public t[] newArray(int i2) {
            return new t[i2];
        }
    }

    public static final class b extends h.a<t, b> {
        private Bitmap b;
        private Uri c;
        private boolean d;
        private String e;

        static List<t> n(Parcel parcel) {
            List<h> listC = h.a.c(parcel);
            ArrayList arrayList = new ArrayList();
            for (h hVar : listC) {
                if (hVar instanceof t) {
                    arrayList.add((t) hVar);
                }
            }
            return arrayList;
        }

        static void s(Parcel parcel, int i2, List<t> list) {
            h[] hVarArr = new h[list.size()];
            for (int i3 = 0; i3 < list.size(); i3++) {
                hVarArr[i3] = list.get(i3);
            }
            parcel.writeParcelableArray(hVarArr, i2);
        }

        public t i() {
            return new t(this, null);
        }

        Bitmap j() {
            return this.b;
        }

        Uri k() {
            return this.c;
        }

        b l(Parcel parcel) {
            return m((t) parcel.readParcelable(t.class.getClassLoader()));
        }

        public b m(t tVar) {
            if (tVar == null) {
                return this;
            }
            super.b(tVar);
            b bVar = this;
            bVar.o(tVar.c());
            bVar.q(tVar.e());
            bVar.r(tVar.f());
            bVar.p(tVar.d());
            return bVar;
        }

        public b o(Bitmap bitmap) {
            this.b = bitmap;
            return this;
        }

        public b p(String str) {
            this.e = str;
            return this;
        }

        public b q(Uri uri) {
            this.c = uri;
            return this;
        }

        public b r(boolean z) {
            this.d = z;
            return this;
        }
    }

    t(Parcel parcel) {
        super(parcel);
        this.b = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.d = parcel.readByte() != 0;
        this.e = parcel.readString();
    }

    private t(b bVar) {
        super(bVar);
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
    }

    /* synthetic */ t(b bVar, a aVar) {
        this(bVar);
    }

    @Override // com.facebook.share.c.h
    public h.b a() {
        return h.b.PHOTO;
    }

    public Bitmap c() {
        return this.b;
    }

    public String d() {
        return this.e;
    }

    @Override // com.facebook.share.c.h, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Uri e() {
        return this.c;
    }

    public boolean f() {
        return this.d;
    }

    @Override // com.facebook.share.c.h, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.c, 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeString(this.e);
    }
}
