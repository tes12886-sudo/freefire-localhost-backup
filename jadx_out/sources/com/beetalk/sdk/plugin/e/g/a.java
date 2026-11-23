package com.beetalk.sdk.plugin.e.g;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.beetalk.sdk.p;
import com.beetalk.sdk.plugin.PluginResult;
import com.beetalk.sdk.plugin.c;
import com.beetalk.sdk.u.k;
import i.g;
import i.i;
import java.io.IOException;
import java.util.concurrent.Callable;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.beetalk.sdk.plugin.a<k, PluginResult> {

    /* JADX INFO: renamed from: com.beetalk.sdk.plugin.e.g.a$a, reason: collision with other inner class name */
    class C0042a implements g<PluginResult, Void> {
        final /* synthetic */ Activity a;

        C0042a(Activity activity) {
            this.a = activity;
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(i<PluginResult> iVar) {
            PluginResult pluginResultT = iVar.t();
            if (pluginResultT == null) {
                pluginResultT = new PluginResult();
                pluginResultT.source = a.this.d();
                pluginResultT.flag = com.garena.pay.android.b.ERROR.c().intValue();
            }
            c.k().n(pluginResultT, this.a, a.this.d());
            return null;
        }
    }

    class b implements Callable<PluginResult> {
        final /* synthetic */ Activity a;
        final /* synthetic */ k b;

        b(Activity activity, k kVar) {
            this.a = activity;
            this.b = kVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PluginResult call() {
            String message;
            PluginResult pluginResult = new PluginResult();
            pluginResult.source = a.this.d();
            try {
                Context applicationContext = this.a.getApplicationContext();
                k kVar = this.b;
                pluginResult.flag = j.c.a.c.a.a.b(applicationContext, kVar.a, kVar.b, String.valueOf(j.c.a.e.l.c.a(this.a)), this.b.c) ? 0 : com.garena.pay.android.b.NETWORK_EXCEPTION.c().intValue();
            } catch (IOException e) {
                pluginResult.flag = com.garena.pay.android.b.NETWORK_EXCEPTION.c().intValue();
                message = e.getMessage();
                pluginResult.message = message;
            } catch (JSONException e2) {
                pluginResult.flag = com.garena.pay.android.b.ERROR.c().intValue();
                message = e2.getMessage();
                pluginResult.message = message;
            }
            return pluginResult;
        }
    }

    @Override // com.beetalk.sdk.plugin.a
    public boolean a() {
        return false;
    }

    @Override // com.beetalk.sdk.plugin.a
    public String d() {
        return "beepost.delete.tags";
    }

    @Override // com.beetalk.sdk.plugin.a
    public Integer e() {
        return p.d.f519j;
    }

    @Override // com.beetalk.sdk.plugin.a
    public boolean f(Activity activity, int i2, Intent intent) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.beetalk.sdk.plugin.a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void b(Activity activity, k kVar) {
        i.e(new b(activity, kVar)).j(new C0042a(activity), i.f1903k);
    }
}
