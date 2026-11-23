package com.vk.sdk.k.j;

import com.vk.sdk.k.d;
import com.vk.sdk.k.f;
import com.vk.sdk.k.k.t;

/* JADX INFO: loaded from: classes.dex */
public class b extends a {
    @Override // com.vk.sdk.k.j.a
    protected String a() {
        return "photos";
    }

    public f d() {
        return b("getWallUploadServer", null);
    }

    public f e(long j2) {
        return b("getWallUploadServer", com.vk.sdk.m.c.i("group_id", Long.valueOf(j2)));
    }

    public f f(d dVar) {
        return c("saveWallPhoto", dVar, t.class);
    }
}
