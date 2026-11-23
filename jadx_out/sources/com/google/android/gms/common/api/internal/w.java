package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class w {
    private final Map a = Collections.synchronizedMap(new WeakHashMap());
    private final Map b = Collections.synchronizedMap(new WeakHashMap());

    private final void h(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (this.a) {
            map = new HashMap(this.a);
        }
        synchronized (this.b) {
            map2 = new HashMap(this.b);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).g(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).d(new com.google.android.gms.common.api.b(status));
            }
        }
    }

    final void c(BasePendingResult basePendingResult, boolean z) {
        this.a.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.b(new u(this, basePendingResult));
    }

    final void d(TaskCompletionSource taskCompletionSource, boolean z) {
        this.b.put(taskCompletionSource, Boolean.valueOf(z));
        taskCompletionSource.a().addOnCompleteListener(new v(this, taskCompletionSource));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018  */
    final void e(int i2, String str) {
        String str2;
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i2 != 1) {
            str2 = i2 == 3 ? " due to dead object exception." : " due to service disconnection.";
            if (str != null) {
                sb.append(" Last reason for disconnect: ");
                sb.append(str);
            }
            h(true, new Status(20, sb.toString()));
        }
        sb.append(str2);
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        h(true, new Status(20, sb.toString()));
    }

    public final void f() {
        h(false, g.r);
    }

    final boolean g() {
        return (this.a.isEmpty() && this.b.isEmpty()) ? false : true;
    }
}
