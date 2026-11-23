package com.ano.gshell;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class AnoApplication extends Application {
    /* JADX WARN: Invalid debug info offset */
    static {
        System.loadLibrary("anort");
    }

    /* JADX WARN: Invalid debug info offset */
    public static String dec(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        char[] charArray = str.toCharArray();
        for (int i2 = 0; i2 < charArray.length; i2++) {
            charArray[i2] = (char) (charArray[i2] ^ '\n');
        }
        return String.valueOf(charArray);
    }

    private final native int initialize(String str, String str2, String str3, String str4, String[] strArr, String str5);

    /* JADX WARN: Invalid debug info offset */
    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        String[] strArr = null;
        super.attachBaseContext(context);
        try {
            ApplicationInfo applicationInfo = getApplicationInfo();
            String str = applicationInfo.packageName;
            String str2 = applicationInfo.nativeLibraryDir;
            String str3 = applicationInfo.sourceDir;
            File filesDir = getFilesDir();
            String str4 = getPackageManager().getPackageInfo(str, 0).versionName;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    Field declaredField = applicationInfo.getClass().getDeclaredField("splitSourceDirs");
                    declaredField.setAccessible(true);
                    strArr = (String[]) declaredField.get(applicationInfo);
                } catch (Exception e) {
                }
            }
            if (initialize(str, filesDir.getAbsolutePath(), str2, str3, strArr, str4) != 0) {
                throw new Exception("initialize failed.");
            }
        } catch (Exception e2) {
        }
    }
}
