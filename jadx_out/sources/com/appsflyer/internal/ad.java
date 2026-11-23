package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.android.billingclient.api.Purchase;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.compat.function.Consumer;
import com.appsflyer.compat.function.Function;
import com.appsflyer.oaid.OaidClient;
import com.google.android.gms.common.GoogleApiAvailability;
import j.d.a.c.a.a.a;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ad {
    static String AFInAppEventParameterName;
    static Boolean AFKeystoreWrapper;
    public final Consumer<String> AFInAppEventType;
    public final boolean init;
    public final Consumer<String> valueOf;
    public final Function<List<Purchase>, Map<String, String>> values;

    public ad() {
    }

    public ad(Function<List<Purchase>, Map<String, String>> function, Consumer<String> consumer, Consumer<String> consumer2, boolean z) {
        this.values = function;
        this.AFInAppEventType = consumer;
        this.valueOf = consumer2;
        this.init = z;
    }

    public static c.d.b AFInAppEventParameterName(ContentResolver contentResolver) {
        String string;
        if (!values() || contentResolver == null || AppsFlyerProperties.getInstance().getString("amazon_aid") != null || !"Amazon".equals(Build.MANUFACTURER)) {
            return null;
        }
        int i2 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 2);
        if (i2 == 0) {
            return new c.d.b(Settings.Secure.getString(contentResolver, "advertising_id"), Boolean.FALSE);
        }
        if (i2 == 2) {
            return null;
        }
        try {
            string = Settings.Secure.getString(contentResolver, "advertising_id");
        } catch (Throwable th) {
            AFLogger.valueOf("Couldn't fetch Amazon Advertising ID (Ad-Tracking is limited!)", th);
            string = "";
        }
        return new c.d.b(string, Boolean.TRUE);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0040 A[Catch: all -> 0x0048, TRY_LEAVE, TryCatch #2 {all -> 0x0048, blocks: (B:13:0x003a, B:15:0x0040), top: B:57:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a0 A[Catch: all -> 0x00a6, TRY_LEAVE, TryCatch #1 {all -> 0x00a6, blocks: (B:28:0x008a, B:30:0x009a, B:32:0x00a0), top: B:55:0x008a }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:46:0x0121  */
    /* JADX WARN: Code duplicated, block: B:55:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static c.d.b AFInAppEventType(Context context, Map<String, Object> map) {
        String string;
        Throwable th;
        Boolean boolValueOf;
        boolean z;
        Boolean boolValueOf2;
        boolean z2;
        if (!values()) {
            return null;
        }
        AFLogger.valueOf("Trying to fetch GAID..");
        StringBuilder sb = new StringBuilder();
        int iIsGooglePlayServicesAvailable = -1;
        try {
            iIsGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
        } catch (Throwable unused) {
        }
        try {
            Class.forName("j.d.a.c.a.a.a");
            a.C0230a c0230aB = a.b(context);
            if (c0230aB == null) {
                sb.append("gpsAdInfo-null |");
                throw new IllegalStateException("GpsAdIndo is null");
            }
            string = c0230aB.a();
            try {
                boolValueOf2 = Boolean.valueOf(c0230aB.b());
                if (string != null) {
                    try {
                        if (string.length() == 0) {
                            sb.append("emptyOrNull |");
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        boolValueOf = boolValueOf2;
                        z = true;
                        AFLogger.valueOf(th.getMessage(), th);
                        sb.append(th.getClass().getSimpleName());
                        sb.append(" |");
                        AFLogger.valueOf("WARNING: Google Play Services is missing.");
                        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.ENABLE_GPS_FALLBACK, true)) {
                            try {
                                aa.d dVarValues = aa.values(context);
                                string = dVarValues.valueOf;
                                boolValueOf = Boolean.valueOf(dVarValues.valueOf());
                                if (string != null || string.length() == 0) {
                                    sb.append("emptyOrNull (bypass) |");
                                }
                            } catch (Throwable th3) {
                                AFLogger.valueOf(th3.getMessage(), th3);
                                sb.append(th3.getClass().getSimpleName());
                                sb.append(" |");
                                string = AppsFlyerProperties.getInstance().getString("advertiserId");
                                Boolean boolValueOf3 = Boolean.valueOf(!Boolean.parseBoolean(AppsFlyerProperties.getInstance().getString("advertiserIdEnabled")));
                                AFLogger.valueOf(th3.getLocalizedMessage() != null ? th3.getLocalizedMessage() : th3.toString());
                                boolean z3 = z;
                                boolValueOf2 = boolValueOf3;
                                z2 = z3;
                            }
                        }
                        z2 = z;
                        boolValueOf2 = boolValueOf;
                    }
                } else {
                    sb.append("emptyOrNull |");
                }
                z2 = true;
            } catch (Throwable th4) {
                th = th4;
                boolValueOf = null;
                z = false;
                AFLogger.valueOf(th.getMessage(), th);
                sb.append(th.getClass().getSimpleName());
                sb.append(" |");
                AFLogger.valueOf("WARNING: Google Play Services is missing.");
                if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.ENABLE_GPS_FALLBACK, true)) {
                    aa.d dVarValues2 = aa.values(context);
                    string = dVarValues2.valueOf;
                    boolValueOf = Boolean.valueOf(dVarValues2.valueOf());
                    if (string != null) {
                        sb.append("emptyOrNull (bypass) |");
                    } else {
                        sb.append("emptyOrNull (bypass) |");
                    }
                }
                z2 = z;
                boolValueOf2 = boolValueOf;
                if (context.getClass().getName().equals("android.app.ReceiverRestrictedContext")) {
                    string = AppsFlyerProperties.getInstance().getString("advertiserId");
                    boolValueOf2 = Boolean.valueOf(!Boolean.parseBoolean(AppsFlyerProperties.getInstance().getString("advertiserIdEnabled")));
                    sb.append("context = android.app.ReceiverRestrictedContext |");
                }
                if (sb.length() > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iIsGooglePlayServicesAvailable);
                    sb2.append(": ");
                    sb2.append((Object) sb);
                    map.put("gaidError", sb2.toString());
                }
                if (string != null) {
                    map.put("advertiserId", string);
                    map.put("advertiserIdEnabled", String.valueOf(!boolValueOf2.booleanValue()));
                    AppsFlyerProperties.getInstance().set("advertiserId", string);
                    AppsFlyerProperties.getInstance().set("advertiserIdEnabled", String.valueOf(!boolValueOf2.booleanValue()));
                    map.put("isGaidWithGps", String.valueOf(z2));
                }
                return new c.d.b(string, boolValueOf2);
            }
            if (context.getClass().getName().equals("android.app.ReceiverRestrictedContext")) {
                string = AppsFlyerProperties.getInstance().getString("advertiserId");
                boolValueOf2 = Boolean.valueOf(!Boolean.parseBoolean(AppsFlyerProperties.getInstance().getString("advertiserIdEnabled")));
                sb.append("context = android.app.ReceiverRestrictedContext |");
            }
            if (sb.length() > 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(iIsGooglePlayServicesAvailable);
                sb3.append(": ");
                sb3.append((Object) sb);
                map.put("gaidError", sb3.toString());
            }
            if (string != null && boolValueOf2 != null) {
                map.put("advertiserId", string);
                map.put("advertiserIdEnabled", String.valueOf(!boolValueOf2.booleanValue()));
                AppsFlyerProperties.getInstance().set("advertiserId", string);
                AppsFlyerProperties.getInstance().set("advertiserIdEnabled", String.valueOf(!boolValueOf2.booleanValue()));
                map.put("isGaidWithGps", String.valueOf(z2));
            }
            return new c.d.b(string, boolValueOf2);
        } catch (Throwable th5) {
            string = null;
            th = th5;
            boolValueOf = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    public static c.d.b values(Context context) {
        Boolean lat;
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        String str = AFInAppEventParameterName;
        boolean z = str != null;
        if (z) {
            lat = null;
        } else {
            Boolean bool = AFKeystoreWrapper;
            if ((bool == null || !bool.booleanValue()) && !(AFKeystoreWrapper == null && appsFlyerProperties.getBoolean(AppsFlyerProperties.COLLECT_OAID, true))) {
                lat = null;
                str = null;
            } else {
                try {
                    OaidClient oaidClient = new OaidClient(context);
                    oaidClient.setLogging(appsFlyerProperties.isEnableLog());
                    OaidClient.Info infoFetch = oaidClient.fetch();
                    if (infoFetch != null) {
                        String id = infoFetch.getId();
                        try {
                            lat = infoFetch.getLat();
                            str = id;
                        } catch (Throwable unused) {
                            str = id;
                            AFLogger.AFInAppEventType("No OAID library");
                            lat = null;
                        }
                    } else {
                        lat = null;
                        str = null;
                    }
                } catch (Throwable unused2) {
                    str = null;
                }
            }
        }
        if (str == null) {
            return null;
        }
        c.d.b bVar = new c.d.b(str, lat);
        bVar.valueOf = Boolean.valueOf(z);
        return bVar;
    }

    private static boolean values() {
        Boolean bool = AFKeystoreWrapper;
        return bool == null || bool.booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ad.class == obj.getClass()) {
            ad adVar = (ad) obj;
            if (this.init != adVar.init) {
                return false;
            }
            Function<List<Purchase>, Map<String, String>> function = this.values;
            if (function == null ? adVar.values != null : !function.equals(adVar.values)) {
                return false;
            }
            Consumer<String> consumer = this.AFInAppEventType;
            if (consumer == null ? adVar.AFInAppEventType != null : !consumer.equals(adVar.AFInAppEventType)) {
                return false;
            }
            Consumer<String> consumer2 = this.valueOf;
            Consumer<String> consumer3 = adVar.valueOf;
            if (consumer2 != null) {
                return consumer2.equals(consumer3);
            }
            if (consumer3 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Function<List<Purchase>, Map<String, String>> function = this.values;
        int iHashCode = (function != null ? function.hashCode() : 0) * 31;
        Consumer<String> consumer = this.AFInAppEventType;
        int iHashCode2 = (iHashCode + (consumer != null ? consumer.hashCode() : 0)) * 31;
        Consumer<String> consumer2 = this.valueOf;
        return ((iHashCode2 + (consumer2 != null ? consumer2.hashCode() : 0)) * 31) + (this.init ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArsFeatureParams{additionalParameters=");
        sb.append(this.values);
        sb.append(", success=");
        sb.append(this.AFInAppEventType);
        sb.append(", failure=");
        sb.append(this.valueOf);
        sb.append(", sandbox=");
        sb.append(this.init);
        sb.append('}');
        return sb.toString();
    }
}
