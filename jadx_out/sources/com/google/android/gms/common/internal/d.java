package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    @Nullable
    private final Account a;
    private final Set b;
    private final Set c;
    private final Map d;
    private final String e;
    private final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j.d.a.c.g.a f1010g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Integer f1011h;

    public static final class a {

        @Nullable
        private Account a;
        private h.f.b b;
        private String c;
        private String d;
        private j.d.a.c.g.a e = j.d.a.c.g.a.f1982j;

        public d a() {
            return new d(this.a, this.b, null, 0, null, this.c, this.d, this.e, false);
        }

        @CanIgnoreReturnValue
        public a b(String str) {
            this.c = str;
            return this;
        }

        @CanIgnoreReturnValue
        public final a c(Collection collection) {
            if (this.b == null) {
                this.b = new h.f.b();
            }
            this.b.addAll(collection);
            return this;
        }

        @CanIgnoreReturnValue
        public final a d(@Nullable Account account) {
            this.a = account;
            return this;
        }

        @CanIgnoreReturnValue
        public final a e(String str) {
            this.d = str;
            return this;
        }
    }

    public d(@Nullable Account account, Set set, Map map, int i2, @Nullable View view, String str, String str2, @Nullable j.d.a.c.g.a aVar, boolean z) {
        this.a = account;
        Set setEmptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.b = setEmptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.d = map;
        this.e = str;
        this.f = str2;
        this.f1010g = aVar == null ? j.d.a.c.g.a.f1982j : aVar;
        HashSet hashSet = new HashSet(setEmptySet);
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(((d0) it.next()).a);
        }
        this.c = Collections.unmodifiableSet(hashSet);
    }

    public Account a() {
        return this.a;
    }

    @Deprecated
    public String b() {
        Account account = this.a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    public Account c() {
        Account account = this.a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public Set<Scope> d() {
        return this.c;
    }

    public Set<Scope> e(com.google.android.gms.common.api.a<?> aVar) {
        d0 d0Var = (d0) this.d.get(aVar);
        if (d0Var == null || d0Var.a.isEmpty()) {
            return this.b;
        }
        HashSet hashSet = new HashSet(this.b);
        hashSet.addAll(d0Var.a);
        return hashSet;
    }

    public String f() {
        return this.e;
    }

    public Set<Scope> g() {
        return this.b;
    }

    public final j.d.a.c.g.a h() {
        return this.f1010g;
    }

    public final Integer i() {
        return this.f1011h;
    }

    public final String j() {
        return this.f;
    }

    public final Map k() {
        return this.d;
    }

    public final void l(Integer num) {
        this.f1011h = num;
    }
}
