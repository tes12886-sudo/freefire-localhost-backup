package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public class LifecycleCallback {
    protected final LifecycleFragment a;

    protected LifecycleCallback(LifecycleFragment lifecycleFragment) {
        this.a = lifecycleFragment;
    }

    public static LifecycleFragment c(Activity activity) {
        return d(new h(activity));
    }

    protected static LifecycleFragment d(h hVar) {
        if (hVar.d()) {
            return k3.L1(hVar.b());
        }
        if (hVar.c()) {
            return i3.d(hVar.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static LifecycleFragment getChimeraLifecycleFragmentImpl(h hVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity b() {
        Activity activityF = this.a.f();
        com.google.android.gms.common.internal.q.k(activityF);
        return activityF;
    }

    public void e(int i2, int i3, Intent intent) {
    }

    public void f(Bundle bundle) {
    }

    public void g() {
    }

    public void h() {
    }

    public void i(Bundle bundle) {
    }

    public void j() {
    }

    public void k() {
    }
}
