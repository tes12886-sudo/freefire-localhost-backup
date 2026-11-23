package com.beetalk.sdk.x;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class c {
    public static Uri a(Context context, File file) {
        String strT = com.beetalk.sdk.g.y().t();
        String str = "com.garena.android.fileprovider" + context.getPackageName() + strT;
        if (!b(context, str)) {
            str = "com.garena.android.fileprovider" + strT;
        }
        return FileProvider.e(context, str, file);
    }

    private static boolean b(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        return (packageManager == null || packageManager.resolveContentProvider(str, 0) == null) ? false : true;
    }
}
