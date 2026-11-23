package com.appsflyer;

import android.app.Application;
import android.content.SharedPreferences;
import android.util.Log;
import com.appsflyer.internal.ai;
import com.appsflyer.internal.aj;
import com.appsflyer.internal.ay;

/* JADX INFO: loaded from: classes.dex */
public final class AFLogger {
    private static final long AFKeystoreWrapper = System.currentTimeMillis();

    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);

        private int values;

        LogLevel(int i2) {
            this.values = i2;
        }

        public final int getLevel() {
            return this.values;
        }
    }

    private static String AFInAppEventParameterName(String str, boolean z) {
        if (str == null) {
            str = "null";
        }
        if (!z && LogLevel.VERBOSE.getLevel() > AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            return str;
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(System.currentTimeMillis() - AFKeystoreWrapper);
        sb.append(") [");
        sb.append(Thread.currentThread().getName());
        sb.append("] ");
        sb.append(str);
        return sb.toString();
    }

    public static void AFInAppEventParameterName(String str) {
        if (AFInAppEventParameterName(LogLevel.VERBOSE)) {
            Log.v("AppsFlyer_6.4.0", AFInAppEventParameterName(str, false));
        }
        aj.AFInAppEventParameterName().AFInAppEventType(null, "V", AFInAppEventParameterName(str, true));
    }

    private static boolean AFInAppEventParameterName(LogLevel logLevel) {
        return logLevel.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel());
    }

    public static void AFInAppEventType(String str) {
        if (AFInAppEventParameterName(LogLevel.DEBUG)) {
            Log.d("AppsFlyer_6.4.0", AFInAppEventParameterName(str, false));
        }
        aj.AFInAppEventParameterName().AFInAppEventType(null, "D", AFInAppEventParameterName(str, true));
    }

    public static void AFKeystoreWrapper(String str) {
        if (!valueOf()) {
            Log.d("AppsFlyer_6.4.0", AFInAppEventParameterName(str, false));
        }
        aj.AFInAppEventParameterName().AFInAppEventType(null, "F", str);
    }

    public static void valueOf(String str) {
        values(str, true);
    }

    public static void valueOf(String str, Throwable th) {
        valueOf(str, th, true, false);
    }

    private static void valueOf(String str, Throwable th, boolean z, boolean z2) {
        if (AFInAppEventParameterName(LogLevel.ERROR)) {
            if (str == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(th.getClass().getSimpleName());
                sb.append(" at ");
                sb.append(th.getStackTrace()[0].toString());
                str = sb.toString();
            }
            String strAFInAppEventParameterName = AFInAppEventParameterName(str, false);
            if (z2) {
                Log.e("AppsFlyer_6.4.0", strAFInAppEventParameterName, th);
            } else if (z) {
                Log.d("AppsFlyer_6.4.0", strAFInAppEventParameterName);
            }
        }
        aj ajVarAFInAppEventParameterName = aj.AFInAppEventParameterName();
        Throwable cause = th.getCause();
        ajVarAFInAppEventParameterName.AFInAppEventType("exception", th.getClass().getSimpleName(), aj.AFInAppEventType(cause == null ? th.getMessage() : cause.getMessage(), cause == null ? th.getStackTrace() : cause.getStackTrace()));
        Application application = ay.AFKeystoreWrapper;
        if (application != null) {
            SharedPreferences.Editor editorEdit = ai.values(application).edit();
            Application application2 = ay.AFKeystoreWrapper;
            editorEdit.putLong("exception_number", (application2 == null ? -1L : ai.values(application2).getLong("exception_number", 0L)) + 1).apply();
        }
    }

    public static void valueOf(Throwable th) {
        valueOf(null, th, false, false);
    }

    private static boolean valueOf() {
        return AppsFlyerProperties.getInstance().isLogsDisabledCompletely();
    }

    public static void values(String str) {
        if (AFInAppEventParameterName(LogLevel.WARNING)) {
            Log.w("AppsFlyer_6.4.0", AFInAppEventParameterName(str, false));
        }
        aj.AFInAppEventParameterName().AFInAppEventType(null, "W", AFInAppEventParameterName(str, true));
    }

    public static void values(String str, Throwable th) {
        valueOf(str, th, true, true);
    }

    public static void values(String str, boolean z) {
        if (AFInAppEventParameterName(LogLevel.INFO)) {
            Log.i("AppsFlyer_6.4.0", AFInAppEventParameterName(str, false));
        }
        if (z) {
            aj.AFInAppEventParameterName().AFInAppEventType(null, "I", AFInAppEventParameterName(str, true));
        }
    }
}
