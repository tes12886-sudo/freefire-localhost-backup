package com.google.firebase.crashlytics.internal.settings.h;

/* JADX INFO: loaded from: classes.dex */
public class e implements d {
    public final a a;
    public final c b;
    public final b c;
    public final long d;

    public e(long j2, a aVar, c cVar, b bVar, int i2, int i3) {
        this.d = j2;
        this.a = aVar;
        this.b = cVar;
        this.c = bVar;
    }

    @Override // com.google.firebase.crashlytics.internal.settings.h.d
    public c a() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.settings.h.d
    public b b() {
        return this.c;
    }

    public a c() {
        return this.a;
    }

    public long d() {
        return this.d;
    }

    public boolean e(long j2) {
        return this.d < j2;
    }
}
