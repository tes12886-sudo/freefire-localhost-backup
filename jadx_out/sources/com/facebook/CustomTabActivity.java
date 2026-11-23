package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class CustomTabActivity extends Activity {
    public static final String b = CustomTabActivity.class.getSimpleName() + ".action_customTabRedirect";
    public static final String c = CustomTabActivity.class.getSimpleName() + ".action_destroy";
    private BroadcastReceiver a;

    public static final class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            l.y.c.i.e(context, "context");
            l.y.c.i.e(intent, "intent");
            CustomTabActivity.this.finish();
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i3 == 0) {
            Intent intent2 = new Intent(b);
            String str = CustomTabMainActivity.f;
            Intent intent3 = getIntent();
            l.y.c.i.d(intent3, "intent");
            intent2.putExtra(str, intent3.getDataString());
            h.q.a.a.b(this).d(intent2);
            a aVar = new a();
            h.q.a.a.b(this).c(aVar, new IntentFilter(c));
            this.a = aVar;
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, (Class<?>) CustomTabMainActivity.class);
        intent.setAction(b);
        String str = CustomTabMainActivity.f;
        Intent intent2 = getIntent();
        l.y.c.i.d(intent2, "getIntent()");
        intent.putExtra(str, intent2.getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        BroadcastReceiver broadcastReceiver = this.a;
        if (broadcastReceiver != null) {
            h.q.a.a.b(this).e(broadcastReceiver);
        }
        super.onDestroy();
    }
}
