package androidx.lifecycle;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements androidx.startup.b<k> {
    @Override // androidx.startup.b
    public List<Class<? extends androidx.startup.b<?>>> a() {
        return Collections.emptyList();
    }

    @Override // androidx.startup.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public k b(Context context) {
        h.a(context);
        s.l(context);
        return s.k();
    }
}
