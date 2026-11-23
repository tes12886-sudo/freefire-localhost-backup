package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class CustomTabMainActivity extends Activity {
    public static final String c = CustomTabMainActivity.class.getSimpleName() + ".extra_action";
    public static final String d = CustomTabMainActivity.class.getSimpleName() + ".extra_params";
    public static final String e = CustomTabMainActivity.class.getSimpleName() + ".extra_chromePackage";
    public static final String f = CustomTabMainActivity.class.getSimpleName() + ".extra_url";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f554g = CustomTabMainActivity.class.getSimpleName() + ".extra_targetApp";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f555h = CustomTabMainActivity.class.getSimpleName() + ".action_refresh";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f556i = CustomTabMainActivity.class.getSimpleName() + ".no_activity_exception";
    private boolean a = true;
    private BroadcastReceiver b;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intent intent2 = new Intent(CustomTabMainActivity.this, (Class<?>) CustomTabMainActivity.class);
            intent2.setAction(CustomTabMainActivity.f555h);
            String str = CustomTabMainActivity.f;
            intent2.putExtra(str, intent.getStringExtra(str));
            intent2.addFlags(603979776);
            CustomTabMainActivity.this.startActivity(intent2);
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.facebook.login.s.values().length];
            a = iArr;
            try {
                iArr[com.facebook.login.s.INSTAGRAM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private static Bundle a(String str) {
        Uri uri = Uri.parse(str);
        Bundle bundleL0 = com.facebook.internal.h0.l0(uri.getQuery());
        bundleL0.putAll(com.facebook.internal.h0.l0(uri.getFragment()));
        return bundleL0;
    }

    private void b(int i2, Intent intent) {
        h.q.a.a.b(this).e(this.b);
        if (intent != null) {
            String stringExtra = intent.getStringExtra(f);
            Intent intentP = com.facebook.internal.c0.p(getIntent(), stringExtra != null ? a(stringExtra) : new Bundle(), null);
            if (intentP != null) {
                intent = intentP;
            }
        } else {
            intent = com.facebook.internal.c0.p(getIntent(), null, null);
        }
        setResult(i2, intent);
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String str = CustomTabActivity.b;
        if (str.equals(getIntent().getAction())) {
            setResult(0);
        } else {
            if (bundle != null) {
                return;
            }
            String stringExtra = getIntent().getStringExtra(c);
            Bundle bundleExtra = getIntent().getBundleExtra(d);
            boolean zB = (b.a[com.facebook.login.s.a(getIntent().getStringExtra(f554g)).ordinal()] != 1 ? new com.facebook.internal.f(stringExtra, bundleExtra) : new com.facebook.internal.w(stringExtra, bundleExtra)).b(this, getIntent().getStringExtra(e));
            this.a = false;
            if (zB) {
                this.b = new a();
                h.q.a.a.b(this).c(this.b, new IntentFilter(str));
                return;
            }
            setResult(0, getIntent().putExtra(f556i, true));
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (f555h.equals(intent.getAction())) {
            h.q.a.a.b(this).d(new Intent(CustomTabActivity.c));
        } else if (!CustomTabActivity.b.equals(intent.getAction())) {
            return;
        }
        b(-1, intent);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.a) {
            b(0, null);
        }
        this.a = true;
    }
}
