package j.c.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.beetalk.sdk.t.j;
import com.beetalk.sdk.x.d;
import i.i;
import j.c.a.e.l.c;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends BroadcastReceiver {
    public static final String ACTION_TOKEN_UPDATE = "com.garena.android.msdk.TOKEN_UPDATE";
    public static final String EXTRA_TOKEN = "token";
    public static final String EXTRA_TOKEN_TYPE = "token_type";
    public static final String PERMISSION_SUFFIX = ".permission.PUSH_NOTIFICATION_TOKEN_UPDATE";
    public static final int TOKEN_TYPE_FCM = 4;
    public static final int TOKEN_TYPE_GCM = 3;
    public static final int TOKEN_TYPE_GPNS = 2;
    private static final ExecutorService UPDATE_EXECUTOR = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: j.c.a.a$a, reason: collision with other inner class name */
    class CallableC0220a implements Callable<Void> {
        final /* synthetic */ Context a;
        final /* synthetic */ Intent b;

        CallableC0220a(Context context, Intent intent) {
            this.a = context;
            this.b = intent;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            a.this.serialExecBg(this.a, this.b);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void serialExecBg(Context context, Intent intent) {
        if (intent != null && intent.hasExtra(EXTRA_TOKEN_TYPE)) {
            int intExtra = intent.getIntExtra(EXTRA_TOKEN_TYPE, 0);
            if (intExtra != 3 && intExtra != 4 && intExtra != 2) {
                com.beetalk.sdk.x.a.a("err: unknown service type", new Object[0]);
                return;
            }
            String stringExtra = intent.getStringExtra(EXTRA_TOKEN);
            if (TextUtils.isEmpty(stringExtra)) {
                com.beetalk.sdk.x.a.a("err: token is empty", new Object[0]);
                return;
            }
            String strE = d.e(context);
            if (TextUtils.isEmpty(strE)) {
                com.beetalk.sdk.x.a.a("err: app id is empty", new Object[0]);
                return;
            }
            com.beetalk.sdk.u.a aVarH = new j(context).h();
            String strF = aVarH == null ? "" : aVarH.f();
            if (TextUtils.isEmpty(strF)) {
                com.beetalk.sdk.x.a.a("user not logged in, ignored", new Object[0]);
                return;
            }
            String pushAppKey = getPushAppKey();
            if (TextUtils.isEmpty(pushAppKey)) {
                com.beetalk.sdk.x.a.a("err: app push key is empty", new Object[0]);
                return;
            }
            String strValueOf = String.valueOf(c.a(context));
            if (TextUtils.isEmpty(strValueOf)) {
                com.beetalk.sdk.x.a.a("err: device id is empty", new Object[0]);
                return;
            }
            com.beetalk.sdk.x.a.a("submitting new token to beepost", new Object[0]);
            try {
                j.c.a.c.a.a.g(context, strE, pushAppKey, strF, stringExtra, intExtra, strValueOf);
            } catch (IOException | JSONException e) {
                com.beetalk.sdk.x.a.b(e);
            }
        }
    }

    protected abstract String getPushAppKey();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        i.c(new CallableC0220a(context, intent), UPDATE_EXECUTOR);
    }
}
