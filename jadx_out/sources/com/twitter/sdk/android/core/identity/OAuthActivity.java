package com.twitter.sdk.android.core.identity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ProgressBar;
import j.g.a.a.a.p;
import j.g.a.a.a.q;
import j.g.a.a.a.u;

/* JADX INFO: loaded from: classes.dex */
public class OAuthActivity extends Activity implements c.InterfaceC0156c {
    c a;
    private ProgressBar b;
    private WebView c;

    @Override // com.twitter.sdk.android.core.identity.c.InterfaceC0156c
    public void a(int i2, Intent intent) {
        setResult(i2, intent);
        finish();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.a.i(0, new q("Authorization failed, request was canceled."));
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(j.c.b.f.f);
        this.b = (ProgressBar) findViewById(j.c.b.e.s);
        this.c = (WebView) findViewById(j.c.b.e.t);
        this.b.setVisibility(bundle != null ? bundle.getBoolean("progress", false) : true ? 0 : 8);
        c cVar = new c(this.b, this.c, (p) getIntent().getParcelableExtra("auth_config"), new j.g.a.a.a.y.j.d(u.f(), new j.g.a.a.a.y.g()), this);
        this.a = cVar;
        cVar.o();
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (this.b.getVisibility() == 0) {
            bundle.putBoolean("progress", true);
        }
        super.onSaveInstanceState(bundle);
    }
}
