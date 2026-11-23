package com.facebook.login;

/* JADX INFO: loaded from: classes.dex */
public enum k {
    NATIVE_WITH_FALLBACK(true, true, true, false, true, true, true),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_ONLY(true, true, false, false, false, true, true),
    /* JADX INFO: Fake field, exist only in values array */
    KATANA_ONLY(false, true, false, false, false, false, false),
    /* JADX INFO: Fake field, exist only in values array */
    WEB_ONLY(false, false, true, false, true, false, false),
    /* JADX INFO: Fake field, exist only in values array */
    WEB_VIEW_ONLY(false, false, true, false, false, false, false),
    /* JADX INFO: Fake field, exist only in values array */
    DIALOG_ONLY(false, true, true, false, true, true, true),
    /* JADX INFO: Fake field, exist only in values array */
    DEVICE_AUTH(false, false, false, true, false, false, false);

    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f691g;

    k(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.f691g = z7;
    }

    public final boolean a() {
        return this.e;
    }

    public final boolean c() {
        return this.d;
    }

    public final boolean d() {
        return this.f;
    }

    public final boolean e() {
        return this.a;
    }

    public final boolean f() {
        return this.f691g;
    }

    public final boolean g() {
        return this.b;
    }

    public final boolean h() {
        return this.c;
    }
}
