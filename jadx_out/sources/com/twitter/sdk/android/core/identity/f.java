package com.twitter.sdk.android.core.identity;

import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.net.URI;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
class f extends WebViewClient {
    private final String a;
    private final a b;

    interface a {
        void a(WebView webView, String str);

        void b(Bundle bundle);

        void c(i iVar);
    }

    f(String str, a aVar) {
        this.a = str;
        this.b = aVar;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.b.a(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i2, String str, String str2) {
        super.onReceivedError(webView, i2, str, str2);
        this.b.c(new i(i2, str, str2));
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        this.b.c(new i(sslError.getPrimaryError(), null, null));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!str.startsWith(this.a)) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        TreeMap<String, String> treeMapB = j.g.a.a.a.y.i.c.b(URI.create(str), false);
        Bundle bundle = new Bundle(treeMapB.size());
        for (Map.Entry<String, String> entry : treeMapB.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        this.b.b(bundle);
        return true;
    }
}
