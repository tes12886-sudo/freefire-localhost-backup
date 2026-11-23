package com.vk.sdk.k.i;

/* JADX INFO: loaded from: classes.dex */
public class f extends e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final com.vk.sdk.k.e f1561j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f1562k;

    public f(b.d dVar, com.vk.sdk.k.e eVar) {
        super(dVar);
        this.f1561j = eVar;
    }

    public f(b.d dVar, Class<? extends com.vk.sdk.k.k.g> cls) {
        super(dVar);
        this.f1561j = new com.vk.sdk.k.b(cls);
    }

    @Override // com.vk.sdk.k.i.e, com.vk.sdk.k.i.c
    protected boolean n() {
        if (super.n() && this.f1561j != null) {
            try {
                this.f1562k = this.f1561j.a(p());
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
