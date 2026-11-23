package com.facebook.share.c;

import android.os.Bundle;
import android.os.Parcel;
import com.facebook.share.c.s;
import com.facebook.share.c.s.a;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class s<P extends s, E extends a> implements Object {
    private final Bundle a;

    /* JADX WARN: Unexpected interfaces in signature: [java.lang.Object<P, E>] */
    public static abstract class a<P extends s, E extends a> {
        private Bundle a = new Bundle();

        public E b(String str, String str2) {
            this.a.putString(str, str2);
            return this;
        }

        public E c(P p) {
            if (p != null) {
                this.a.putAll(p.b());
            }
            return this;
        }
    }

    s(Parcel parcel) {
        this.a = parcel.readBundle(a.class.getClassLoader());
    }

    protected s(a<P, E> aVar) {
        this.a = (Bundle) ((a) aVar).a.clone();
    }

    public Object a(String str) {
        return this.a.get(str);
    }

    public Bundle b() {
        return (Bundle) this.a.clone();
    }

    public String c(String str) {
        return this.a.getString(str);
    }

    public Set<String> d() {
        return this.a.keySet();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeBundle(this.a);
    }
}
