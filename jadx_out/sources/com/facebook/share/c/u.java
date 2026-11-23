package com.facebook.share.c;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u extends e<u, b> {
    public static final Parcelable.Creator<u> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<t> f778g;

    static class a implements Parcelable.Creator<u> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public u createFromParcel(Parcel parcel) {
            return new u(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public u[] newArray(int i2) {
            return new u[i2];
        }
    }

    public static class b extends e.a<u, b> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final List<t> f779g = new ArrayList();

        public b o(t tVar) {
            if (tVar != null) {
                this.f779g.add(new t.b().m(tVar).i());
            }
            return this;
        }

        public b p(List<t> list) {
            if (list != null) {
                Iterator<t> it = list.iterator();
                while (it.hasNext()) {
                    o(it.next());
                }
            }
            return this;
        }

        public u q() {
            return new u(this, null);
        }

        public b r(u uVar) {
            if (uVar == null) {
                return this;
            }
            super.g(uVar);
            b bVar = this;
            bVar.p(uVar.h());
            return bVar;
        }

        public b s(List<t> list) {
            this.f779g.clear();
            p(list);
            return this;
        }
    }

    u(Parcel parcel) {
        super(parcel);
        this.f778g = Collections.unmodifiableList(t.b.n(parcel));
    }

    private u(b bVar) {
        super(bVar);
        this.f778g = Collections.unmodifiableList(bVar.f779g);
    }

    /* synthetic */ u(b bVar, a aVar) {
        this(bVar);
    }

    @Override // com.facebook.share.c.e
    public int describeContents() {
        return 0;
    }

    public List<t> h() {
        return this.f778g;
    }

    @Override // com.facebook.share.c.e
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        t.b.s(parcel, i2, this.f778g);
    }
}
