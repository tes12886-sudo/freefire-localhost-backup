package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public interface LifecycleFragment {
    void b(String str, LifecycleCallback lifecycleCallback);

    <T extends LifecycleCallback> T e(String str, Class<T> cls);

    Activity f();

    void startActivityForResult(Intent intent, int i2);
}
