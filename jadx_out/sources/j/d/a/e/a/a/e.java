package j.d.a.e.a.a;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class e {
    public static Random a = new Random(SystemClock.uptimeMillis());

    static {
        Pattern.compile("attachment;\\s*filename\\s*=\\s*\"([^\"]*)\"");
    }

    public static boolean a(Context context, String str, long j2, boolean z) {
        File file = new File(b(context, str));
        if (!file.exists()) {
            return false;
        }
        if (file.length() == j2) {
            return true;
        }
        if (!z) {
            return false;
        }
        file.delete();
        return false;
    }

    public static String b(Context context, String str) {
        return j(context) + File.separator + str;
    }

    public static long c(File file) {
        StatFs statFs = new StatFs(file.getPath());
        return ((long) statFs.getBlockSize()) * (((long) statFs.getAvailableBlocks()) - 4);
    }

    public static String d(long j2, long j3) {
        if (j3 == 0) {
            return "";
        }
        return Long.toString((j2 * 100) / j3) + "%";
    }

    public static String e(long j2, long j3) {
        if (j3 == 0) {
            return "";
        }
        return String.format("%.2f", Float.valueOf(j2 / 1048576.0f)) + "MB /" + String.format("%.2f", Float.valueOf(j3 / 1048576.0f)) + "MB";
    }

    public static int f(Context context, int i2) {
        String str;
        switch (i2) {
            case 1:
                str = "state_idle";
                break;
            case 2:
                str = "state_fetching_url";
                break;
            case 3:
                str = "state_connecting";
                break;
            case 4:
                str = "state_downloading";
                break;
            case 5:
                str = "state_completed";
                break;
            case 6:
                str = "state_paused_network_unavailable";
                break;
            case 7:
                str = "state_paused_by_request";
                break;
            case 8:
                return l(context, "state_paused_wifi_disabled");
            case 9:
                return l(context, "state_paused_wifi_unavailable");
            case 10:
                return l(context, "state_paused_wifi_disabled");
            case 11:
                return l(context, "state_paused_wifi_unavailable");
            case 12:
                str = "state_paused_roaming";
                break;
            case 13:
                str = "state_paused_network_setup_failure";
                break;
            case 14:
                str = "state_paused_sdcard_unavailable";
                break;
            case 15:
                str = "state_failed_unlicensed";
                break;
            case 16:
                str = "state_failed_fetching_url";
                break;
            case 17:
                str = "state_failed_sdcard_full";
                break;
            case 18:
                str = "state_failed_cancelled";
                break;
            default:
                str = "state_unknown";
                break;
        }
        return l(context, str);
    }

    public static File g(String str) {
        File downloadCacheDirectory = Environment.getDownloadCacheDirectory();
        if (str.startsWith(downloadCacheDirectory.getPath())) {
            return downloadCacheDirectory;
        }
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (str.startsWith(externalStorageDirectory.getPath())) {
            return externalStorageDirectory;
        }
        throw new IllegalArgumentException("Cannot determine filesystem root for " + str);
    }

    public static int h(Context context, String str) {
        return context.getResources().getIdentifier(str, "id", context.getPackageName());
    }

    public static int i(Context context, String str) {
        return context.getResources().getIdentifier(str, "layout", context.getPackageName());
    }

    public static String j(Context context) {
        return Environment.getExternalStorageDirectory().toString() + a.a + context.getPackageName();
    }

    public static String k(float f) {
        return String.format("%.2f", Float.valueOf((f * 1000.0f) / 1024.0f));
    }

    public static int l(Context context, String str) {
        return context.getResources().getIdentifier(str, "string", context.getPackageName());
    }

    public static String m(long j2) {
        Locale locale = Locale.getDefault();
        return (j2 > 3600000 ? new SimpleDateFormat("HH:mm", locale) : new SimpleDateFormat("mm:ss", locale)).format(new Date(j2 - ((long) TimeZone.getDefault().getRawOffset())));
    }

    public static boolean n() {
        return Environment.getExternalStorageState().equals("mounted");
    }

    public static boolean o(String str) {
        String strReplaceFirst = str.replaceFirst("/+", "/");
        return strReplaceFirst.startsWith(Environment.getDownloadCacheDirectory().toString()) || strReplaceFirst.startsWith(Environment.getExternalStorageDirectory().toString());
    }
}
