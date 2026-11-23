package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.apps.common.proguard.UsedByReflection;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("PlatformActivityProxy")
public class ProxyBillingActivity extends Activity {
    private ResultReceiver a;
    private ResultReceiver b;
    private boolean c;

    private Intent a(String str) {
        Intent intent = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
        intent.setPackage(getApplicationContext().getPackageName());
        intent.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", str);
        return intent;
    }

    private Intent b() {
        Intent intent = new Intent("com.android.vending.billing.PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0092 A[PHI: r6 r7
  0x0092: PHI (r6v5 int) = (r6v3 int), (r6v8 int) binds: [B:28:0x008f, B:12:0x003c] A[DONT_GENERATE, DONT_INLINE]
  0x0092: PHI (r7v5 android.os.ResultReceiver) = (r7v3 android.os.ResultReceiver), (r7v9 android.os.ResultReceiver) binds: [B:28:0x008f, B:12:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        int iA;
        ResultReceiver resultReceiver;
        Intent intentB;
        super.onActivityResult(i2, i3, intent);
        Bundle extras = null;
        if (i2 == 100) {
            iA = j.d.a.c.f.h.k.h(intent, "ProxyBillingActivity").b();
            if (i3 != -1) {
                j.d.a.c.f.h.k.m("ProxyBillingActivity", "Activity finished with resultCode " + i3 + " and billing's responseCode: " + iA);
            } else if (iA != 0) {
                i3 = -1;
                j.d.a.c.f.h.k.m("ProxyBillingActivity", "Activity finished with resultCode " + i3 + " and billing's responseCode: " + iA);
            } else {
                iA = 0;
            }
            resultReceiver = this.a;
            if (resultReceiver != null) {
                if (intent != null) {
                    extras = intent.getExtras();
                }
                resultReceiver.send(iA, extras);
            } else {
                if (intent == null) {
                    intentB = b();
                } else if (intent.getExtras() != null) {
                    String string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                    if (string != null) {
                        intentB = a(string);
                    } else {
                        intentB = b();
                        intentB.putExtras(intent.getExtras());
                    }
                } else {
                    intentB = b();
                    j.d.a.c.f.h.k.m("ProxyBillingActivity", "Got null bundle!");
                    intentB.putExtra("RESPONSE_CODE", 6);
                    intentB.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                }
                sendBroadcast(intentB);
            }
        } else if (i2 == 101) {
            iA = j.d.a.c.f.h.k.a(intent, "ProxyBillingActivity");
            resultReceiver = this.b;
            if (resultReceiver != null) {
                if (intent != null) {
                    extras = intent.getExtras();
                }
                resultReceiver.send(iA, extras);
            }
        } else {
            j.d.a.c.f.h.k.m("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i2 + "; skipping...");
        }
        this.c = false;
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        int i2;
        super.onCreate(bundle);
        if (bundle != null) {
            j.d.a.c.f.h.k.l("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.c = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("result_receiver")) {
                this.a = (ResultReceiver) bundle.getParcelable("result_receiver");
                return;
            } else {
                if (bundle.containsKey("in_app_message_result_receiver")) {
                    this.b = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
                    return;
                }
                return;
            }
        }
        j.d.a.c.f.h.k.l("ProxyBillingActivity", "Launching Play Store billing flow");
        try {
            if (getIntent().hasExtra("BUY_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            } else {
                if (!getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
                    if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
                        pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
                        this.b = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
                        i2 = 101;
                    } else {
                        pendingIntent = null;
                    }
                    this.c = true;
                    startIntentSenderForResult(pendingIntent.getIntentSender(), i2, new Intent(), 0, 0, 0);
                    return;
                }
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
                this.a = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            }
            this.c = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), i2, new Intent(), 0, 0, 0);
            return;
        } catch (IntentSender.SendIntentException e) {
            j.d.a.c.f.h.k.n("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e);
            ResultReceiver resultReceiver = this.a;
            if (resultReceiver != null) {
                resultReceiver.send(6, null);
            } else {
                ResultReceiver resultReceiver2 = this.b;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(0, null);
                } else {
                    Intent intentB = b();
                    intentB.putExtra("RESPONSE_CODE", 6);
                    intentB.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    sendBroadcast(intentB);
                }
            }
            this.c = false;
            finish();
            return;
        }
        i2 = 100;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.c) {
            Intent intentB = b();
            intentB.putExtra("RESPONSE_CODE", 1);
            intentB.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            sendBroadcast(intentB);
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        ResultReceiver resultReceiver = this.a;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.b;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.c);
    }
}
