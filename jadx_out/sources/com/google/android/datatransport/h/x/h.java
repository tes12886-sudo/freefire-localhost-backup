package com.google.android.datatransport.h.x;

import android.content.Context;
import android.os.Build;
import com.google.android.datatransport.h.x.j.y;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.j;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.n;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    static s a(Context context, y yVar, n nVar, com.google.android.datatransport.h.z.a aVar) {
        return Build.VERSION.SDK_INT >= 21 ? new m(context, yVar, nVar) : new j(context, yVar, aVar, nVar);
    }
}
