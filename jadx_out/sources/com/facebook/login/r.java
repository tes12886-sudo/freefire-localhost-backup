package com.facebook.login;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class r {
    private final com.facebook.a a;
    private final com.facebook.f b;
    private final Set<String> c;
    private final Set<String> d;

    public r(com.facebook.a aVar, com.facebook.f fVar, Set<String> set, Set<String> set2) {
        l.y.c.i.e(aVar, "accessToken");
        l.y.c.i.e(set, "recentlyGrantedPermissions");
        l.y.c.i.e(set2, "recentlyDeniedPermissions");
        this.a = aVar;
        this.b = fVar;
        this.c = set;
        this.d = set2;
    }

    public final com.facebook.a a() {
        return this.a;
    }

    public final Set<String> b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return l.y.c.i.a(this.a, rVar.a) && l.y.c.i.a(this.b, rVar.b) && l.y.c.i.a(this.c, rVar.c) && l.y.c.i.a(this.d, rVar.d);
    }

    public int hashCode() {
        com.facebook.a aVar = this.a;
        int iHashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        com.facebook.f fVar = this.b;
        int iHashCode2 = (iHashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
        Set<String> set = this.c;
        int iHashCode3 = (iHashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Set<String> set2 = this.d;
        return iHashCode3 + (set2 != null ? set2.hashCode() : 0);
    }

    public String toString() {
        return "LoginResult(accessToken=" + this.a + ", authenticationToken=" + this.b + ", recentlyGrantedPermissions=" + this.c + ", recentlyDeniedPermissions=" + this.d + ")";
    }
}
