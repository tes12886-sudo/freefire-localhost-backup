package com.google.android.gms.tasks;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class a0 extends LifecycleCallback {
    private final List b;

    private a0(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.b = new ArrayList();
        this.a.b("TaskOnStopCallback", this);
    }

    public static a0 l(Activity activity) {
        LifecycleFragment lifecycleFragmentC = LifecycleCallback.c(activity);
        a0 a0Var = (a0) lifecycleFragmentC.e("TaskOnStopCallback", a0.class);
        return a0Var == null ? new a0(lifecycleFragmentC) : a0Var;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void k() {
        synchronized (this.b) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                w wVar = (w) ((WeakReference) it.next()).get();
                if (wVar != null) {
                    wVar.b();
                }
            }
            this.b.clear();
        }
    }

    public final void m(w wVar) {
        synchronized (this.b) {
            this.b.add(new WeakReference(wVar));
        }
    }
}
