package com.garena.pay.android;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.LinearLayout;
import com.beetalk.sdk.i;
import com.beetalk.sdk.networking.model.EventCancelReq;
import com.beetalk.sdk.u.j;

/* JADX INFO: loaded from: classes.dex */
public class GGPayActivity extends Activity {
    private static final String c = GGPayActivity.class.getSimpleName();
    private d a;
    private c b;

    class a implements c.g {
        a() {
        }

        @Override // com.garena.pay.android.c.g
        public void a(j jVar) {
            com.beetalk.sdk.x.a.a("Recd result after payment completion: %s", jVar.e());
            if (GGPayActivity.this.a != null && GGPayActivity.this.a.b() != null) {
                String itemId = GGPayActivity.this.a.b().getItemId();
                String eventId = GGPayActivity.this.a.b().getEventId();
                String strB = com.beetalk.sdk.t.h.a(GGPayActivity.this).b("KEY_EVENT_TXN_ID", "");
                com.beetalk.sdk.x.a.a("For event: itemId = " + itemId + ", eventId = " + eventId + ", txnId = " + strB, new Object[0]);
                if (j.g(jVar.f()) && !b.PAYMENT_GENERAL_ERROR.c().equals(jVar.d()) && !b.PAYMENT_ERROR_PENDING_TRANSACTION.c().equals(jVar.d()) && !b.NETWORK_REQUEST_TIME_OUT.c().equals(jVar.d()) && !TextUtils.isEmpty(itemId) && !TextUtils.isEmpty(eventId) && !TextUtils.isEmpty(strB)) {
                    com.beetalk.sdk.z.i.c.g(EventCancelReq.toParams(GGPayActivity.this.a, itemId, eventId, strB));
                }
            }
            GGPayActivity.this.d(jVar);
        }
    }

    private void c() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setId(j.c.b.e.f1936j);
        Point point = new Point();
        getWindowManager().getDefaultDisplay().getSize(point);
        linearLayout.setMinimumHeight(point.y);
        linearLayout.setBackgroundColor(0);
        setContentView(linearLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(j jVar) {
        this.a = null;
        int i2 = j.g(jVar.f()) ? 0 : -1;
        Intent intent = new Intent();
        intent.putExtra("com.garena.pay.android.extras.result", jVar);
        setResult(i2, intent);
        finish();
        overridePendingTransition(0, R.anim.fade_out);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.b.q();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        com.beetalk.sdk.x.a.a("GGPayActivity onCreate() start...", new Object[0]);
        super.onCreate(bundle);
        c();
        i.A(this);
        this.a = (d) (bundle != null ? bundle.getSerializable("com.garena.pay.android.extras.pay_request") : getIntent().getSerializableExtra("com.garena.pay.android.extras.pay_request"));
        if (this.a == null) {
            com.beetalk.sdk.x.a.a("GGPayActivity no request to process, finish...", new Object[0]);
            finish();
            return;
        }
        c cVar = new c();
        this.b = cVar;
        cVar.w(this);
        this.b.x(new a());
        com.beetalk.sdk.x.a.a("GGPayActivity onCreate() end...", new Object[0]);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        Log.d(c, "onDestroy");
        c cVar = this.b;
        if (cVar != null) {
            cVar.r();
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        com.beetalk.sdk.x.a.a("GGPayActivity onNewIntent", new Object[0]);
        this.b.s(intent);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        com.beetalk.sdk.x.a.a("GGPayActivity onPause()", new Object[0]);
        com.beetalk.sdk.t.e.d().c();
    }

    @Override // android.app.Activity
    protected void onResume() {
        d dVar;
        super.onResume();
        Log.d(c, "onResume");
        c cVar = this.b;
        if (cVar == null || (dVar = this.a) == null) {
            return;
        }
        cVar.u(dVar);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("com.garena.pay.android.extras.pay_request", this.a);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        Log.d(c, "onStart");
        new com.beetalk.sdk.t.i().b();
    }
}
