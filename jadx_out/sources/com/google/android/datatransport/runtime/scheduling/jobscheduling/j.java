package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import com.google.android.datatransport.h.x.j.y;

/* JADX INFO: loaded from: classes.dex */
public class j implements s {
    private final Context a;
    private final y b;
    private AlarmManager c;
    private final n d;
    private final com.google.android.datatransport.h.z.a e;

    j(Context context, y yVar, AlarmManager alarmManager, com.google.android.datatransport.h.z.a aVar, n nVar) {
        this.a = context;
        this.b = yVar;
        this.c = alarmManager;
        this.e = aVar;
        this.d = nVar;
    }

    public j(Context context, y yVar, com.google.android.datatransport.h.z.a aVar, n nVar) {
        this(context, yVar, (AlarmManager) context.getSystemService("alarm"), aVar, nVar);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.s
    public void a(com.google.android.datatransport.h.n nVar, int i2) {
        b(nVar, i2, false);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.s
    public void b(com.google.android.datatransport.h.n nVar, int i2, boolean z) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", nVar.b());
        builder.appendQueryParameter("priority", String.valueOf(com.google.android.datatransport.h.a0.a.a(nVar.d())));
        if (nVar.c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(nVar.c(), 0));
        }
        Intent intent = new Intent(this.a, (Class<?>) AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i2);
        if (!z && c(intent)) {
            com.google.android.datatransport.h.v.a.a("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", nVar);
            return;
        }
        long jH = this.b.H(nVar);
        long jG = this.d.g(nVar.d(), jH, i2);
        com.google.android.datatransport.h.v.a.b("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", nVar, Long.valueOf(jG), Long.valueOf(jH), Integer.valueOf(i2));
        this.c.set(3, this.e.a() + jG, PendingIntent.getBroadcast(this.a, 0, intent, 0));
    }

    boolean c(Intent intent) {
        return PendingIntent.getBroadcast(this.a, 0, intent, 536870912) != null;
    }
}
