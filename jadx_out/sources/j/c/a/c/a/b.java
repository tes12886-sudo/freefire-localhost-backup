package j.c.a.c.a;

import android.app.AlarmManager;
import android.app.IntentService;
import android.app.PendingIntent;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public class b extends IntentService {
    public b() {
        super("BeePostIntentService");
        setIntentRedelivery(true);
    }

    private void a(String str, Intent intent) {
        String stringExtra = intent.getStringExtra("app_id");
        String stringExtra2 = intent.getStringExtra("app_key");
        String stringExtra3 = intent.getStringExtra("account");
        String stringExtra4 = intent.getStringExtra("device_id");
        int intExtra = intent.getIntExtra("service", 1);
        if (c.c) {
            String str2 = c.a;
            StringBuilder sb = new StringBuilder();
            sb.append("new token:");
            sb.append(TextUtils.isEmpty(str) ? "n.a" : str);
            Log.i(str2, sb.toString());
        }
        try {
            if (!TextUtils.isEmpty(str) && a.g(getApplicationContext(), stringExtra, stringExtra2, stringExtra3, str, intExtra, stringExtra4)) {
                return;
            }
            int intExtra2 = intent.getIntExtra("failed_count", 0);
            if (c.c) {
                Log.e(c.a, "BeePost acquires token RETRY " + intExtra2);
            }
            if (intExtra2 > 6) {
                return;
            }
            intent.putExtra("failed_count", intExtra2 + 1);
            ((AlarmManager) getSystemService("alarm")).set(1, System.currentTimeMillis() + (((long) intExtra2) * 10000), PendingIntent.getService(getApplicationContext(), 100, intent, 1073741824));
        } catch (IOException | JSONException e) {
            if (c.c) {
                Log.wtf(c.a, e);
            }
        }
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        String strN;
        int intExtra = intent.getIntExtra("service", 1);
        j.c.a.e.d.b bVar = new j.c.a.e.d.b(getApplicationContext());
        if (intExtra == 1) {
            if (d.b(getApplicationContext())) {
                intExtra = 4;
                if (c.c) {
                    Log.i(c.a, "BeePost uses FCM");
                }
            } else {
                if (c.c) {
                    Log.i(c.a, "BeePost uses GPNS");
                }
                intExtra = 2;
            }
        }
        if (intent.hasExtra(j.c.a.a.EXTRA_TOKEN)) {
            strN = intent.getStringExtra(j.c.a.a.EXTRA_TOKEN);
        } else if (intExtra != 2) {
            return;
        } else {
            strN = bVar.n();
        }
        a(strN, intent);
    }
}
