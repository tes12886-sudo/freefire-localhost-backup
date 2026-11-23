package com.facebook.login;

/* JADX INFO: loaded from: classes.dex */
public enum c {
    /* JADX INFO: Fake field, exist only in values array */
    NONE(null),
    /* JADX INFO: Fake field, exist only in values array */
    ONLY_ME("only_me"),
    FRIENDS("friends"),
    /* JADX INFO: Fake field, exist only in values array */
    EVERYONE("everyone");

    private final String a;

    c(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }
}
