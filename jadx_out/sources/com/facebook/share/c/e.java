package com.facebook.share.c;

import android.net.Uri;
import android.os.Parcel;
import com.facebook.share.c.e;
import com.facebook.share.c.e.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class e<P extends e<P, E>, E extends a<P, E>> implements Object {
    private final Uri a;
    private final List<String> b;
    private final String c;
    private final String d;
    private final String e;
    private final f f;

    /* JADX WARN: Unexpected interfaces in signature: [java.lang.Object<P, E>] */
    public static abstract class a<P extends e<P, E>, E extends a<P, E>> {
        private Uri a;
        private List<String> b;
        private String c;
        private String d;
        private String e;
        private f f;

        public final Uri a() {
            return this.a;
        }

        public final f b() {
            return this.f;
        }

        public final String c() {
            return this.d;
        }

        public final List<String> d() {
            return this.b;
        }

        public final String e() {
            return this.c;
        }

        public final String f() {
            return this.e;
        }

        public E g(P p) {
            l.y.c.i.e(p, "content");
            h(p.a());
            j(p.c());
            k(p.d());
            i(p.b());
            l(p.e());
            m(p.f());
            return this;
        }

        public final E h(Uri uri) {
            this.a = uri;
            return this;
        }

        public final E i(String str) {
            this.d = str;
            return this;
        }

        public final E j(List<String> list) {
            this.b = list == null ? null : Collections.unmodifiableList(list);
            return this;
        }

        public final E k(String str) {
            this.c = str;
            return this;
        }

        public final E l(String str) {
            this.e = str;
            return this;
        }

        public final E m(f fVar) {
            this.f = fVar;
            return this;
        }
    }

    protected e(Parcel parcel) {
        l.y.c.i.e(parcel, "parcel");
        this.a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.b = g(parcel);
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        f.b bVar = new f.b();
        bVar.c(parcel);
        this.f = bVar.b();
    }

    protected e(a<P, E> aVar) {
        l.y.c.i.e(aVar, "builder");
        this.a = aVar.a();
        this.b = aVar.d();
        this.c = aVar.e();
        this.d = aVar.c();
        this.e = aVar.f();
        this.f = aVar.b();
    }

    private final List<String> g(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final Uri a() {
        return this.a;
    }

    public final String b() {
        return this.d;
    }

    public final List<String> c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.e;
    }

    public final f f() {
        return this.f;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        l.y.c.i.e(parcel, "out");
        parcel.writeParcelable(this.a, 0);
        parcel.writeStringList(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeParcelable(this.f, 0);
    }
}
