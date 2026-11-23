package com.unity3d.plugin.downloader;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import j.d.a.e.a.a.c;

/* JADX INFO: loaded from: classes.dex */
public class UnityAlarmReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            c.d(context, intent, UnityDownloaderService.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
