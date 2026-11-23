package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import com.appsflyer.AFLogger;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public abstract class ax<T> {
    public final Context AFInAppEventType;
    private final String[] AFKeystoreWrapper;
    public final FutureTask<T> valueOf = new FutureTask<>(new Callable<T>() { // from class: com.appsflyer.internal.ax.4
        @Override // java.util.concurrent.Callable
        public final T call() {
            if (ax.this.AFInAppEventParameterName()) {
                return (T) ax.this.values();
            }
            return null;
        }
    });
    public final String values;

    public ax(Context context, String str, String... strArr) {
        this.AFInAppEventType = context;
        this.values = str;
        this.AFKeystoreWrapper = strArr;
    }

    public final boolean AFInAppEventParameterName() {
        try {
            ProviderInfo providerInfoResolveContentProvider = this.AFInAppEventType.getPackageManager().resolveContentProvider(this.values, 128);
            return providerInfoResolveContentProvider != null && Arrays.asList(this.AFKeystoreWrapper).contains(ac.values(this.AFInAppEventType.getPackageManager(), ((PackageItemInfo) providerInfoResolveContentProvider).packageName));
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | CertificateException e) {
            AFLogger.valueOf(e.getMessage(), e);
            return false;
        }
    }

    public T valueOf() {
        try {
            return this.valueOf.get(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            AFLogger.valueOf(e.getMessage(), e);
            return null;
        }
    }

    protected abstract T values();
}
