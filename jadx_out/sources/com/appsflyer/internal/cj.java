package com.appsflyer.internal;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.appsflyer.AFLogger;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class cj extends cl {
    public final Map<String, Object> AFInAppEventParameterName;

    public cj(Runnable runnable) {
        super("google", runnable);
        this.AFInAppEventParameterName = new HashMap();
    }

    private static boolean values(Context context) {
        ai.valueOf();
        if (ai.AFInAppEventParameterName(ai.values(context), "appsFlyerCount", false) > 0) {
            AFLogger.AFInAppEventParameterName("Install referrer will not load, the counter > 1, ");
            return false;
        }
        try {
            Class.forName("com.android.installreferrer.api.InstallReferrerClient");
            if (ac.AFKeystoreWrapper(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                AFLogger.AFInAppEventType("Install referrer is allowed");
                return true;
            }
            AFLogger.AFInAppEventType("Install referrer is not allowed");
            return false;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb = new StringBuilder("Class ");
            sb.append("com.android.installreferrer.api.InstallReferrerClient");
            sb.append(" not found");
            AFLogger.AFInAppEventParameterName(sb.toString());
            return false;
        } catch (Throwable th) {
            AFLogger.valueOf("An error occurred while trying to verify manifest : ".concat("com.android.installreferrer.api.InstallReferrerClient"), th);
            return false;
        }
    }

    @Override // com.appsflyer.internal.cl
    public final void AFKeystoreWrapper(final Context context) {
        if (values(context)) {
            AFInAppEventType();
            try {
                final InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(context).build();
                AFLogger.AFInAppEventType("Connecting to Install Referrer Library...");
                installReferrerClientBuild.startConnection(new InstallReferrerStateListener() { // from class: com.appsflyer.internal.cj.2
                    @Override // com.android.installreferrer.api.InstallReferrerStateListener
                    public final void onInstallReferrerServiceDisconnected() {
                        AFLogger.AFInAppEventType("Install Referrer service disconnected");
                    }

                    @Override // com.android.installreferrer.api.InstallReferrerStateListener
                    public final void onInstallReferrerSetupFinished(int i2) {
                        Map<String, Object> map;
                        String str;
                        String str2;
                        cj.this.AFInAppEventParameterName.put("code", String.valueOf(i2));
                        cj.this.values.put("api_ver", Long.valueOf(ac.valueOf(context, GoogleApiAvailabilityLight.GOOGLE_PLAY_STORE_PACKAGE)));
                        cj.this.values.put("api_ver_name", ac.values(context, GoogleApiAvailabilityLight.GOOGLE_PLAY_STORE_PACKAGE));
                        if (i2 != -1) {
                            if (i2 != 0) {
                                if (i2 == 1) {
                                    cj.this.values.put("response", "SERVICE_UNAVAILABLE");
                                    str2 = "InstallReferrer not supported";
                                } else if (i2 == 2) {
                                    AFLogger.values("InstallReferrer FEATURE_NOT_SUPPORTED");
                                    map = cj.this.values;
                                    str = "FEATURE_NOT_SUPPORTED";
                                } else if (i2 != 3) {
                                    str2 = "responseCode not found.";
                                } else {
                                    AFLogger.values("InstallReferrer DEVELOPER_ERROR");
                                    map = cj.this.values;
                                    str = "DEVELOPER_ERROR";
                                }
                                AFLogger.values(str2);
                            } else {
                                cj.this.values.put("response", "OK");
                                try {
                                    AFLogger.AFInAppEventType("InstallReferrer connected");
                                    if (installReferrerClientBuild.isReady()) {
                                        ReferrerDetails installReferrer = installReferrerClientBuild.getInstallReferrer();
                                        String installReferrer2 = installReferrer.getInstallReferrer();
                                        if (installReferrer2 != null) {
                                            cj.this.AFInAppEventParameterName.put("val", installReferrer2);
                                            cj.this.values.put("referrer", installReferrer2);
                                        }
                                        long referrerClickTimestampSeconds = installReferrer.getReferrerClickTimestampSeconds();
                                        cj.this.AFInAppEventParameterName.put("clk", Long.toString(referrerClickTimestampSeconds));
                                        cj.this.values.put("click_ts", Long.valueOf(referrerClickTimestampSeconds));
                                        long installBeginTimestampSeconds = installReferrer.getInstallBeginTimestampSeconds();
                                        cj.this.AFInAppEventParameterName.put("install", Long.toString(installBeginTimestampSeconds));
                                        cj.this.values.put("install_begin_ts", Long.valueOf(installBeginTimestampSeconds));
                                        HashMap map2 = new HashMap();
                                        try {
                                            boolean googlePlayInstantParam = installReferrer.getGooglePlayInstantParam();
                                            cj.this.AFInAppEventParameterName.put("instant", Boolean.valueOf(googlePlayInstantParam));
                                            map2.put("instant", Boolean.valueOf(googlePlayInstantParam));
                                        } catch (NoSuchMethodError unused) {
                                        }
                                        try {
                                            map2.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                                            map2.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                                            map2.put("install_version", installReferrer.getInstallVersion());
                                        } catch (NoSuchMethodError unused2) {
                                        }
                                        if (!map2.isEmpty()) {
                                            cj.this.values.put("google_custom", map2);
                                        }
                                    } else {
                                        AFLogger.values("ReferrerClient: InstallReferrer is not ready");
                                        cj.this.AFInAppEventParameterName.put("err", "ReferrerClient: InstallReferrer is not ready");
                                    }
                                } catch (Throwable th) {
                                    AFLogger.values("Failed to get install referrer: " + th.getMessage());
                                    cj.this.AFInAppEventParameterName.put("err", th.getMessage());
                                }
                            }
                            AFLogger.AFInAppEventType("Install Referrer collected locally");
                            cj.this.AFKeystoreWrapper();
                            installReferrerClientBuild.endConnection();
                        }
                        AFLogger.values("InstallReferrer SERVICE_DISCONNECTED");
                        map = cj.this.values;
                        str = "SERVICE_DISCONNECTED";
                        map.put("response", str);
                        AFLogger.AFInAppEventType("Install Referrer collected locally");
                        cj.this.AFKeystoreWrapper();
                        installReferrerClientBuild.endConnection();
                    }
                });
            } catch (Throwable th) {
                AFLogger.valueOf("referrerClient -> startConnection", th);
            }
        }
    }
}
