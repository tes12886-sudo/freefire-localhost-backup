package com.beetalk.sdk.plugin;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<S, T> {

    /* JADX INFO: renamed from: com.beetalk.sdk.plugin.a$a, reason: collision with other inner class name */
    class C0032a extends PluginResult {
        final /* synthetic */ int a;
        final /* synthetic */ String b;

        C0032a(int i2, String str) {
            this.a = i2;
            this.b = str;
            this.status = i2;
            this.flag = i2;
            this.source = a.this.d();
            this.message = str;
        }
    }

    public boolean a() {
        return true;
    }

    protected abstract void b(Activity activity, S s);

    protected PluginResult c(int i2, String str) {
        return new C0032a(i2, str);
    }

    public abstract String d();

    public abstract Integer e();

    public abstract boolean f(Activity activity, int i2, Intent intent);

    protected void g(Activity activity, int i2) {
        c.k().n(c(i2, ""), activity, d());
    }

    protected void h(Activity activity, int i2, String str) {
        c.k().n(c(i2, str), activity, d());
    }
}
