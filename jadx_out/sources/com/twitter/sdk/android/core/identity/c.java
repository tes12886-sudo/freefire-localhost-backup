package com.twitter.sdk.android.core.identity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import j.g.a.a.a.j;
import j.g.a.a.a.m;
import j.g.a.a.a.p;
import j.g.a.a.a.q;
import j.g.a.a.a.r;
import j.g.a.a.a.v;

/* JADX INFO: loaded from: classes.dex */
class c implements f.a {
    final InterfaceC0156c a;
    r b;
    private final ProgressBar c;
    private final WebView d;
    private final p e;
    private final j.g.a.a.a.y.j.d f;

    class a extends j.g.a.a.a.c<j.g.a.a.a.y.j.g> {
        a() {
        }

        @Override // j.g.a.a.a.c
        public void c(v vVar) {
            m.g().c("Twitter", "Failed to get request token", vVar);
            c.this.i(1, new q("Failed to get request token"));
        }

        @Override // j.g.a.a.a.c
        public void d(j<j.g.a.a.a.y.j.g> jVar) {
            c cVar = c.this;
            cVar.b = jVar.a.a;
            String strG = cVar.f.g(c.this.b);
            m.g().d("Twitter", "Redirecting user to web view to complete authorization flow");
            c cVar2 = c.this;
            cVar2.n(cVar2.d, new f(c.this.f.e(c.this.e), c.this), strG, new e());
        }
    }

    class b extends j.g.a.a.a.c<j.g.a.a.a.y.j.g> {
        b() {
        }

        @Override // j.g.a.a.a.c
        public void c(v vVar) {
            m.g().c("Twitter", "Failed to get access token", vVar);
            c.this.i(1, new q("Failed to get access token"));
        }

        @Override // j.g.a.a.a.c
        public void d(j<j.g.a.a.a.y.j.g> jVar) {
            Intent intent = new Intent();
            j.g.a.a.a.y.j.g gVar = jVar.a;
            intent.putExtra("screen_name", gVar.b);
            intent.putExtra("user_id", gVar.c);
            intent.putExtra("tk", gVar.a.a);
            intent.putExtra("ts", gVar.a.b);
            c.this.a.a(-1, intent);
        }
    }

    /* JADX INFO: renamed from: com.twitter.sdk.android.core.identity.c$c, reason: collision with other inner class name */
    interface InterfaceC0156c {
        void a(int i2, Intent intent);
    }

    c(ProgressBar progressBar, WebView webView, p pVar, j.g.a.a.a.y.j.d dVar, InterfaceC0156c interfaceC0156c) {
        this.c = progressBar;
        this.d = webView;
        this.e = pVar;
        this.f = dVar;
        this.a = interfaceC0156c;
    }

    private void g() {
        this.c.setVisibility(8);
    }

    private void h() {
        this.d.stopLoading();
        g();
    }

    private void j(i iVar) {
        m.g().c("Twitter", "OAuth web view completed with an error", iVar);
        i(1, new q("OAuth web view completed with an error"));
    }

    private void k(Bundle bundle) {
        String string;
        m.g().d("Twitter", "OAuth web view completed successfully");
        if (bundle != null && (string = bundle.getString("oauth_verifier")) != null) {
            m.g().d("Twitter", "Converting the request token to an access token.");
            this.f.k(l(), this.b, string);
            return;
        }
        m.g().c("Twitter", "Failed to get authorization, bundle incomplete " + bundle, null);
        i(1, new q("Failed to get authorization, bundle incomplete"));
    }

    @Override // com.twitter.sdk.android.core.identity.f.a
    public void a(WebView webView, String str) {
        g();
        webView.setVisibility(0);
    }

    @Override // com.twitter.sdk.android.core.identity.f.a
    public void b(Bundle bundle) {
        k(bundle);
        h();
    }

    @Override // com.twitter.sdk.android.core.identity.f.a
    public void c(i iVar) {
        j(iVar);
        h();
    }

    protected void i(int i2, q qVar) {
        Intent intent = new Intent();
        intent.putExtra("auth_error", qVar);
        this.a.a(i2, intent);
    }

    j.g.a.a.a.c<j.g.a.a.a.y.j.g> l() {
        return new b();
    }

    j.g.a.a.a.c<j.g.a.a.a.y.j.g> m() {
        return new a();
    }

    void n(WebView webView, WebViewClient webViewClient, String str, WebChromeClient webChromeClient) {
        WebSettings settings = webView.getSettings();
        settings.setAllowFileAccess(false);
        settings.setJavaScriptEnabled(true);
        settings.setSaveFormData(false);
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        webView.setWebViewClient(webViewClient);
        webView.loadUrl(str);
        webView.setVisibility(4);
        webView.setWebChromeClient(webChromeClient);
    }

    void o() {
        m.g().d("Twitter", "Obtaining request token to start the sign in flow");
        this.f.l(m());
    }
}
