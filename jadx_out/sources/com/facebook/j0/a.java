package com.facebook.j0;

import com.facebook.internal.h0;
import com.facebook.r;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Serializable {
    private final String a;
    private final String b;

    /* JADX INFO: renamed from: com.facebook.j0.a$a, reason: collision with other inner class name */
    public static final class C0068a implements Serializable {
        private final String a;
        private final String b;

        public C0068a(String str, String str2) {
            l.y.c.i.e(str2, "appId");
            this.a = str;
            this.b = str2;
        }

        private final Object readResolve() {
            return new a(this.a, this.b);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(com.facebook.a aVar) {
        this(aVar.m(), r.g());
        l.y.c.i.e(aVar, "accessToken");
    }

    public a(String str, String str2) {
        l.y.c.i.e(str2, "applicationId");
        this.b = str2;
        this.a = h0.Y(str) ? null : str;
    }

    private final Object writeReplace() {
        return new C0068a(this.a, this.b);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return h0.c(aVar.a, this.a) && h0.c(aVar.b, this.b);
    }

    public int hashCode() {
        String str = this.a;
        return (str != null ? str.hashCode() : 0) ^ this.b.hashCode();
    }
}
