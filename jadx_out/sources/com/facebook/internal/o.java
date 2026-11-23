package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class o extends j0 {
    private static final String r;
    public static final a s = new a(null);
    private boolean q;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }

        public final o a(Context context, String str, String str2) {
            l.y.c.i.e(context, "context");
            l.y.c.i.e(str, "url");
            l.y.c.i.e(str2, "expectedRedirectUrl");
            j0.p.b(context);
            return new o(context, str, str2, null);
        }
    }

    static final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                o.super.cancel();
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    static {
        String name = o.class.getName();
        l.y.c.i.d(name, "FacebookWebFallbackDialog::class.java.name");
        r = name;
    }

    private o(Context context, String str, String str2) {
        super(context, str);
        v(str2);
    }

    public /* synthetic */ o(Context context, String str, String str2, l.y.c.f fVar) {
        this(context, str, str2);
    }

    @Override // com.facebook.internal.j0, android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        WebView webViewN = n();
        if (!p() || o() || webViewN == null || !webViewN.isShown()) {
            super.cancel();
            return;
        }
        if (this.q) {
            return;
        }
        this.q = true;
        webViewN.loadUrl("javascript:(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
        new Handler(Looper.getMainLooper()).postDelayed(new b(), (long) 1500);
    }

    @Override // com.facebook.internal.j0
    public Bundle r(String str) {
        Uri uri = Uri.parse(str);
        l.y.c.i.d(uri, "responseUri");
        Bundle bundleL0 = h0.l0(uri.getQuery());
        String string = bundleL0.getString("bridge_args");
        bundleL0.remove("bridge_args");
        if (!h0.Y(string)) {
            try {
                bundleL0.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", d.a(new JSONObject(string)));
            } catch (JSONException e) {
                h0.g0(r, "Unable to parse bridge_args JSON", e);
            }
        }
        String string2 = bundleL0.getString("method_results");
        bundleL0.remove("method_results");
        if (!h0.Y(string2)) {
            try {
                bundleL0.putBundle("com.facebook.platform.protocol.RESULT_ARGS", d.a(new JSONObject(string2)));
            } catch (JSONException e2) {
                h0.g0(r, "Unable to parse bridge_args JSON", e2);
            }
        }
        bundleL0.remove("version");
        bundleL0.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", c0.z());
        return bundleL0;
    }
}
