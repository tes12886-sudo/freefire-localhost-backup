package com.vk.sdk.k.j;

import com.vk.sdk.k.d;
import com.vk.sdk.k.f;
import com.vk.sdk.k.k.g;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    protected abstract String a();

    protected f b(String str, d dVar) {
        return new f(String.format(Locale.US, "%s.%s", a(), str), dVar, null);
    }

    protected f c(String str, d dVar, Class<? extends g> cls) {
        return new f(String.format(Locale.US, "%s.%s", a(), str), dVar, cls);
    }
}
