package com.dts.freefireth;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class FFBroadcastReceiver extends BroadcastReceiver {
    public static final String ACTION_LOCAL_NOTIFICATION = "com.dts.freefireth.action.LOCAL_NOTIFICATION";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle bundleExtra;
        _FFLocalNotification _fflocalnotification;
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            FFLocalNotification._rescheduleAllLocalNotifications(context);
        }
        if (!ACTION_LOCAL_NOTIFICATION.equals(intent.getAction()) || (bundleExtra = intent.getBundleExtra(FFLocalNotification.INTENT_EXTRA_LOCAL_NOTIFICATION_NAME)) == null || (_fflocalnotification = (_FFLocalNotification) bundleExtra.getParcelable(FFLocalNotification.INTENT_EXTRA_LOCAL_NOTIFICATION_NAME)) == null) {
            return;
        }
        FFLocalNotification._showLocalNotification(context, _fflocalnotification);
    }
}
