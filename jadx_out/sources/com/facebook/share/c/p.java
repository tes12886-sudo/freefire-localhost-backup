package com.facebook.share.c;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class p extends s<p, b> {
    public static final Parcelable.Creator<p> CREATOR = new a();

    static class a implements Parcelable.Creator<p> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p createFromParcel(Parcel parcel) {
            return new p(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p[] newArray(int i2) {
            return new p[i2];
        }
    }

    public static final class b extends s.a<p, b> {
        public p d() {
            return new p(this, null);
        }

        b e(Parcel parcel) {
            return f((p) parcel.readParcelable(p.class.getClassLoader()));
        }

        public b f(p pVar) {
            if (pVar == null) {
                return this;
            }
            super.c(pVar);
            b bVar = this;
            bVar.g(pVar.e());
            return bVar;
        }

        public b g(String str) {
            b("og:type", str);
            return this;
        }
    }

    p(Parcel parcel) {
        super(parcel);
    }

    private p(b bVar) {
        super(bVar);
    }

    /* synthetic */ p(b bVar, a aVar) {
        this(bVar);
    }

    public String e() {
        return c("og:type");
    }
}
