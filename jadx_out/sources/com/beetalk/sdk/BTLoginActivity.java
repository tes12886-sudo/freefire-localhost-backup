package com.beetalk.sdk;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.CookieSyncManager;

/* JADX INFO: loaded from: classes.dex */
public class BTLoginActivity extends Activity {
    private String a;
    protected b b;
    private b.c c;

    class a implements b.d {
        a() {
        }

        @Override // com.beetalk.sdk.b.d
        public void a(b.e eVar) {
            com.beetalk.sdk.x.a.a("Auth complete", new Object[0]);
            BTLoginActivity.this.b(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(b.e eVar) {
        this.c = null;
        int i2 = (eVar == null || b.e.d(eVar.a)) ? 0 : -1;
        Bundle bundle = new Bundle();
        bundle.putSerializable("auth_result", eVar);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        setResult(i2, intent);
        finish();
        overridePendingTransition(0, R.anim.fade_out);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        com.beetalk.sdk.x.a.a("onActivityResult", new Object[0]);
        b bVar = this.b;
        if (bVar != null) {
            bVar.l(i2, i3, intent);
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        com.beetalk.sdk.x.a.a("BTLoginActivity onCreate", new Object[0]);
        super.onCreate(bundle);
        CookieSyncManager.createInstance(this);
        i.A(this);
        if (g.y() == null) {
            com.beetalk.sdk.x.a.a("recreate session", new Object[0]);
            g.h0(new g.l(this).a());
        }
        if (bundle != null) {
            this.b = (b) bundle.getSerializable("saved_auth_client");
            com.beetalk.sdk.x.a.a("BTLoginActivity onCreate, get authClient from savedInstanceState", new Object[0]);
        } else {
            this.b = new b();
            this.c = (b.c) getIntent().getSerializableExtra("request_extra");
            com.beetalk.sdk.x.a.a("BTLoginActivity onCreate, savedInstanceState is null, create authClient", new Object[0]);
        }
        this.a = getCallingPackage();
        this.b.m(this);
        this.b.n(new a());
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        com.beetalk.sdk.x.a.a("destroy", new Object[0]);
        this.b.b();
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        CookieSyncManager.getInstance().stopSync();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        CookieSyncManager.getInstance().startSync();
        if (this.a != null) {
            this.b.o(this.c);
        } else {
            com.beetalk.sdk.x.a.c("Error Calling Package must be set", new Object[0]);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        com.beetalk.sdk.x.a.a("save bundle", new Object[0]);
        bundle.putSerializable("saved_auth_client", this.b);
    }
}
