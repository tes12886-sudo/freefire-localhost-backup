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
public class b extends com.beetalk.sdk.plugin.a<k, PluginResult> {

    class a implements g<PluginResult, Void> {
        final /* synthetic */ Activity a;

        a(Activity activity) {
            this.a = activity;
        }

        @Override // i.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(i<PluginResult> iVar) {
            PluginResult pluginResultT = iVar.t();
            if (pluginResultT == null) {
                pluginResultT = new PluginResult();
                pluginResultT.source = b.this.d();
                pluginResultT.flag = com.garena.pay.android.b.ERROR.c().intValue();
            }
            c.k().n(pluginResultT, this.a, b.this.d());
            return null;
        }
    }

    /* JADX INFO: renamed from: com.beetalk.sdk.plugin.e.g.b$b, reason: collision with other inner class name */
    class CallableC0043b implements Callable<PluginResult> {
        final /* synthetic */ Activity a;
        final /* synthetic */ k b;

        CallableC0043b(Activity activity, k kVar) {
            this.a = activity;
            this.b = kVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PluginResult call() {
            String message;
            PluginResult pluginResult = new PluginResult();
            pluginResult.source = b.this.d();
            try {
                Context applicationContext = this.a.getApplicationContext();
                k kVar = this.b;
                pluginResult.flag = j.c.a.c.a.a.f(applicationContext, kVar.a, kVar.b, String.valueOf(j.c.a.e.l.c.a(this.a)), this.b.c) ? 0 : com.garena.pay.android.b.NETWORK_EXCEPTION.c().intValue();
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
        return "beepost.set.tags";
    }

    @Override // com.beetalk.sdk.plugin.a
    public Integer e() {
        return p.d.f518i;
    }

    @Override // com.beetalk.sdk.plugin.a
    public boolean f(Activity activity, int i2, Intent intent) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.beetalk.sdk.plugin.a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void b(Activity activity, k kVar) {
        i.e(new CallableC0043b(activity, kVar)).j(new a(activity), i.f1903k);
    }
}
