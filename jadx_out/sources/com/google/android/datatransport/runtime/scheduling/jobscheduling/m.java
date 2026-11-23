package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.h.x.j.y;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: classes.dex */
public class m implements s {
    private final Context a;
    private final y b;
    private final n c;

    public m(Context context, y yVar, n nVar) {
        this.a = context;
        this.b = yVar;
        this.c = nVar;
    }

    private boolean d(JobScheduler jobScheduler, int i2, int i3) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i4 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i2) {
                return i4 >= i3;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.s
    public void a(com.google.android.datatransport.h.n nVar, int i2) {
        b(nVar, i2, false);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.s
    public void b(com.google.android.datatransport.h.n nVar, int i2, boolean z) {
        ComponentName componentName = new ComponentName(this.a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.a.getSystemService("jobscheduler");
        int iC = c(nVar);
        if (!z && d(jobScheduler, iC, i2)) {
            com.google.android.datatransport.h.v.a.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", nVar);
            return;
        }
        long jH = this.b.H(nVar);
        n nVar2 = this.c;
        JobInfo.Builder builder = new JobInfo.Builder(iC, componentName);
        nVar2.c(builder, nVar.d(), jH, i2);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i2);
        persistableBundle.putString("backendName", nVar.b());
        persistableBundle.putInt("priority", com.google.android.datatransport.h.a0.a.a(nVar.d()));
        if (nVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(nVar.c(), 0));
        }
        builder.setExtras(persistableBundle);
        com.google.android.datatransport.h.v.a.b("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", nVar, Integer.valueOf(iC), Long.valueOf(this.c.g(nVar.d(), jH, i2)), Long.valueOf(jH), Integer.valueOf(i2));
        jobScheduler.schedule(builder.build());
    }

    int c(com.google.android.datatransport.h.n nVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(nVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(com.google.android.datatransport.h.a0.a.a(nVar.d())).array());
        if (nVar.c() != null) {
            adler32.update(nVar.c());
        }
        return (int) adler32.getValue();
    }
}
