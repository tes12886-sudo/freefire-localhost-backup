package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes.dex */
public enum p {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);

    private final int a;

    p(int i2) {
        this.a = i2;
    }

    public static p a(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int c() {
        return this.a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.a);
    }
}
