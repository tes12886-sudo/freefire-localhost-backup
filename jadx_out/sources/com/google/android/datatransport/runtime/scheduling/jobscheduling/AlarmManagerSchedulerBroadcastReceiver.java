package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;

/* JADX INFO: loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    static /* synthetic */ void a() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i2 = intent.getExtras().getInt("attemptNumber");
        com.google.android.datatransport.h.r.f(context);
        com.google.android.datatransport.h.n.a aVarA = com.google.android.datatransport.h.n.a();
        aVarA.b(queryParameter);
        aVarA.d(com.google.android.datatransport.h.a0.a.b(iIntValue));
        if (queryParameter2 != null) {
            aVarA.c(Base64.decode(queryParameter2, 0));
        }
        com.google.android.datatransport.h.r.c().e().k(aVarA.a(), i2, new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.a
            @Override // java.lang.Runnable
            public final void run() {
                AlarmManagerSchedulerBroadcastReceiver.a();
            }
        });
    }
}
