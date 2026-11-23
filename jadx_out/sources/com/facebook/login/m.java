package com.facebook.login;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class m {
    private final Set<String> a;
    private final String b;

    /* JADX WARN: Multi-variable type inference failed */
    public m(Collection<String> collection) {
        this(collection, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(Collection<String> collection, String str) {
        this(collection, str, v.a());
        l.y.c.i.e(str, "nonce");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ m(Collection collection, String str, int i2, l.y.c.f fVar) {
        if ((i2 & 2) != 0) {
            str = UUID.randomUUID().toString();
            l.y.c.i.d(str, "UUID.randomUUID().toString()");
        }
        this(collection, str);
    }

    public m(Collection<String> collection, String str, String str2) {
        l.y.c.i.e(str, "nonce");
        l.y.c.i.e(str2, "codeVerifier");
        if (!(u.a(str) && v.b(str2))) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        HashSet hashSet = collection != null ? new HashSet(collection) : new HashSet();
        hashSet.add("openid");
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        l.y.c.i.d(setUnmodifiableSet, "Collections.unmodifiableSet(permissions)");
        this.a = setUnmodifiableSet;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final Set<String> b() {
        return this.a;
    }
}
