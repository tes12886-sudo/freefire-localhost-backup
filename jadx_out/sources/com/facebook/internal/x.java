package com.facebook.internal;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;

/* JADX INFO: loaded from: classes.dex */
public final class x {
    public static final x a = new x();

    public interface a {
        void a(String str);
    }

    public static final class b implements InstallReferrerStateListener {
        final /* synthetic */ InstallReferrerClient a;
        final /* synthetic */ a b;

        b(InstallReferrerClient installReferrerClient, a aVar) {
            this.a = installReferrerClient;
            this.b = aVar;
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerServiceDisconnected() {
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerSetupFinished(int i2) {
            x xVar;
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                if (i2 == 0) {
                    try {
                        InstallReferrerClient installReferrerClient = this.a;
                        l.y.c.i.d(installReferrerClient, "referrerClient");
                        ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
                        l.y.c.i.d(installReferrer, "referrerClient.installReferrer");
                        String installReferrer2 = installReferrer.getInstallReferrer();
                        if (installReferrer2 != null && (l.d0.q.C(installReferrer2, "fb", false, 2, null) || l.d0.q.C(installReferrer2, "facebook", false, 2, null))) {
                            this.b.a(installReferrer2);
                        }
                        xVar = x.a;
                    } catch (RemoteException unused) {
                        return;
                    }
                } else if (i2 != 2) {
                    return;
                } else {
                    xVar = x.a;
                }
                xVar.e();
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    private x() {
    }

    private final boolean b() {
        return com.facebook.r.f().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false);
    }

    private final void c(a aVar) {
        InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(com.facebook.r.f()).build();
        try {
            installReferrerClientBuild.startConnection(new b(installReferrerClientBuild, aVar));
        } catch (Exception unused) {
        }
    }

    public static final void d(a aVar) {
        l.y.c.i.e(aVar, "callback");
        x xVar = a;
        if (xVar.b()) {
            return;
        }
        xVar.c(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        com.facebook.r.f().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
    }
}
