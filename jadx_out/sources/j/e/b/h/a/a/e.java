package j.e.b.h.a.a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
final class e {
    private final PackageInfo a;
    private final String b;
    private String c;

    e(Context context, String str) {
        this.a = a(context);
        this.b = str;
    }

    private static PackageInfo a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException unused) {
            throw null;
        }
    }

    public final String b() {
        String str = this.c;
        if (str != null) {
            return str;
        }
        PackageInfo packageInfo = this.a;
        String str2 = packageInfo == null ? "UNK" : packageInfo.packageName;
        String str3 = packageInfo != null ? packageInfo.versionName : "UNK";
        Locale locale = Locale.getDefault();
        String str4 = str2 + "/" + str3 + " ChannelSDK/" + this.b + " (Linux; U; Android " + Build.VERSION.RELEASE + "; " + locale.getLanguage() + "-" + locale.getCountry() + "; " + Build.MODEL + " Build/" + Build.ID + ")";
        this.c = str4;
        return str4;
    }
}
