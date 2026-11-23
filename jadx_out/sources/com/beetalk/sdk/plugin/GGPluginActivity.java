package com.beetalk.sdk.plugin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.beetalk.sdk.g;
import com.beetalk.sdk.i;

/* JADX INFO: loaded from: classes.dex */
public class GGPluginActivity extends Activity {
    private String a;
    private com.beetalk.sdk.plugin.a b;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.k().o(GGPluginActivity.this.b, GGPluginActivity.this);
        }
    }

    public static void b(Activity activity, String str, int i2) {
        Intent intent = new Intent();
        intent.setClass(activity, GGPluginActivity.class);
        intent.putExtra("plugin_id", str);
        activity.startActivityForResult(intent, i2);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        if (!TextUtils.isEmpty(this.a) && this.a.startsWith("facebook")) {
            try {
                if (((com.beetalk.sdk.plugin.e.b.a) this.b).j(i2, i3, intent)) {
                    return;
                }
            } catch (Exception e) {
                com.beetalk.sdk.x.a.b(e);
            }
        }
        if (this.b.e() != null && i2 == this.b.e().intValue() && this.b.f(this, i3, intent)) {
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (g.y() == null) {
            i.y(this);
        }
        this.a = getIntent().getStringExtra("plugin_id");
        this.b = c.k().l(this.a);
        if (bundle == null) {
            new Handler(Looper.getMainLooper()).postDelayed(new a(), 140L);
        }
    }
}
