package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.JobIntentService;

/* JADX INFO: loaded from: classes.dex */
public class MessageForwardingService extends JobIntentService {
    static void a(Context context, Intent intent, com.google.firebase.messaging.cpp.c cVar) {
        String action;
        if (intent == null) {
            action = "null intent";
        } else {
            action = intent.getAction() == null ? "(null)" : intent.getAction();
        }
        String strValueOf = String.valueOf(action);
        com.google.firebase.messaging.cpp.b.a("FIREBASE_MSG_FWDR", strValueOf.length() != 0 ? "onHandleIntent ".concat(strValueOf) : new String("onHandleIntent "));
        if (intent == null || intent.getAction() == null || !intent.getAction().equals("com.google.android.c2dm.intent.RECEIVE")) {
            return;
        }
        Bundle extras = intent.getExtras();
        String strValueOf2 = String.valueOf(extras != null ? extras.toString() : "(null)");
        com.google.firebase.messaging.cpp.b.a("FIREBASE_MSG_FWDR", strValueOf2.length() != 0 ? "extras: ".concat(strValueOf2) : new String("extras: "));
        if (extras != null) {
            RemoteMessage remoteMessage = new RemoteMessage(extras);
            String strValueOf3 = String.valueOf(remoteMessage.toString());
            com.google.firebase.messaging.cpp.b.a("FIREBASE_MSG_FWDR", strValueOf3.length() != 0 ? "message: ".concat(strValueOf3) : new String("message: "));
            if (remoteMessage.j() == null || remoteMessage.l() == null) {
                return;
            }
            cVar.e(context, remoteMessage, true, intent.getData());
        }
    }

    @Override // androidx.core.app.JobIntentService
    protected void onHandleWork(Intent intent) {
        a(this, intent, com.google.firebase.messaging.cpp.c.a());
    }
}
