package com.google.android.gms.common.api;

import com.google.android.gms.common.api.j;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class f<R extends j> {

    public interface a {
        void a(Status status);
    }

    public abstract void b(a aVar);

    public abstract R c(long j2, TimeUnit timeUnit);

    public abstract void d(k<? super R> kVar);
}
