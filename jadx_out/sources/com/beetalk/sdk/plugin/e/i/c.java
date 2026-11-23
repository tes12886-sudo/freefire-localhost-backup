package com.beetalk.sdk.plugin.e.i;

import android.app.FragmentManager;
import com.vk.sdk.k.k.t;

/* JADX INFO: loaded from: classes.dex */
public class c {
    String a;
    String b;
    com.vk.sdk.k.l.b[] c;
    t d;
    CharSequence e;
    a f;

    public interface a {
        void a(com.vk.sdk.k.c cVar);

        void b(int i2);

        void c();
    }

    public c a(com.vk.sdk.k.l.b[] bVarArr) {
        this.c = bVarArr;
        return this;
    }

    public c b(String str, String str2) {
        this.a = str;
        this.b = str2;
        return this;
    }

    public c c(a aVar) {
        this.f = aVar;
        return this;
    }

    public c d(CharSequence charSequence) {
        this.e = charSequence;
        return this;
    }

    public void e(FragmentManager fragmentManager, String str) {
        new b(this).show(fragmentManager, str);
    }
}
