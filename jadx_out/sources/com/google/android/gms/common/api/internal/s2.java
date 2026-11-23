package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class s2 {
    private int d;
    private final h.f.a b = new h.f.a();
    private final TaskCompletionSource c = new TaskCompletionSource();
    private boolean e = false;
    private final h.f.a a = new h.f.a();

    public s2(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.a.put(((HasApiKey) it.next()).b(), null);
        }
        this.d = this.a.keySet().size();
    }

    public final Task a() {
        return this.c.a();
    }

    public final Set b() {
        return this.a.keySet();
    }

    public final void c(b bVar, ConnectionResult connectionResult, String str) {
        this.a.put(bVar, connectionResult);
        this.b.put(bVar, str);
        this.d--;
        if (!connectionResult.n()) {
            this.e = true;
        }
        if (this.d == 0) {
            if (!this.e) {
                this.c.c(this.b);
            } else {
                this.c.b(new com.google.android.gms.common.api.c(this.a));
            }
        }
    }
}
