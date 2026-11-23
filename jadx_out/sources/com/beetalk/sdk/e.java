package com.beetalk.sdk;

import android.content.Intent;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements Serializable {
    protected b a;

    protected e(b bVar) {
        this.a = bVar;
    }

    void c() {
    }

    boolean d(int i2, int i3, Intent intent, b.c cVar) {
        return false;
    }

    abstract boolean e(b.c cVar);
}
