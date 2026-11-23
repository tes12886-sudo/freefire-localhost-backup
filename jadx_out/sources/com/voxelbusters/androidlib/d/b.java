package com.voxelbusters.androidlib.d;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Size;
import android.view.Display;
import android.view.WindowManager;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b {

    static class a implements Runnable {
        final /* synthetic */ Activity a;
        final /* synthetic */ Intent b;

        a(Activity activity, Intent intent) {
            this.a = activity;
            this.b = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.startActivity(Intent.createChooser(this.b, "Share via"));
        }
    }

    public static Size a(Context context) {
        Point pointJ = j(context);
        return new Size(300, (pointJ.y * 300) / pointJ.x);
    }

    public static void b(File file, File file2) {
        try {
            file2.createNewFile();
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            byte[] bArr = new byte[1024];
            while (true) {
                int i2 = fileInputStream.read(bArr);
                if (i2 <= 0) {
                    fileInputStream.close();
                    fileOutputStream.close();
                    return;
                }
                fileOutputStream.write(bArr, 0, i2);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void c(Context context, File file) {
        String absolutePath;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            absolutePath = file.getCanonicalPath();
        } catch (IOException unused) {
            absolutePath = file.getAbsolutePath();
        }
        Uri contentUri = MediaStore.Files.getContentUri("external");
        if (contentResolver.delete(contentUri, "_data=?", new String[]{absolutePath}) == 0) {
            String absolutePath2 = file.getAbsolutePath();
            if (absolutePath2.equals(absolutePath)) {
                return;
            }
            contentResolver.delete(contentUri, "_data=?", new String[]{absolutePath2});
        }
    }

    public static ApplicationInfo d(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(i(context), 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            Log.e("Helper", "Package name not found!");
            return null;
        }
    }

    public static String e(Context context) {
        return context.getPackageManager().getApplicationLabel(d(context)).toString();
    }

    public static int f(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics.densityDpi;
    }

    public static String g(Context context) {
        return i(context) + ".fileprovider";
    }

    public static int h(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point.x > point.y ? 2 : 1;
    }

    public static String i(Context context) {
        return context.getPackageName();
    }

    public static Point j(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return point;
    }

    public static String k(Context context, boolean z) {
        StringBuilder sb;
        String strE;
        if (z) {
            sb = new StringBuilder();
            sb.append(Environment.getExternalStorageDirectory());
            sb.append("/");
            strE = e(context);
        } else {
            sb = new StringBuilder();
            sb.append(context.getFilesDir());
            strE = "/ReplayKit";
        }
        sb.append(strE);
        return sb.toString();
    }

    public static boolean l(Context context, String... strArr) {
        if (Build.VERSION.SDK_INT < 23 || context == null || strArr == null) {
            return true;
        }
        for (String str : strArr) {
            if (context.checkSelfPermission(str) != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean m(String str) {
        return str == null || str.equals("");
    }

    public static boolean n(Context context) {
        return h(context) == 2;
    }

    public static void o(String str) {
        new File(str).getParentFile().mkdirs();
    }

    public static void p(Context context, String str, String str2, com.voxelbusters.androidlib.c.c cVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        q(context, arrayList, str2, cVar);
    }

    public static void q(Context context, ArrayList<String> arrayList, String str, com.voxelbusters.androidlib.c.c cVar) {
        com.voxelbusters.androidlib.internal.b.b(context, arrayList, cVar);
    }

    public static void r(Context context, String str) {
        context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(new File(str))));
    }

    public static void s(Context context, String str, String str2, String str3) {
        File file = new File(str);
        if (file.exists()) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("video/mp4");
            if (str2 != null) {
                intent.putExtra("android.intent.extra.TEXT", str2);
            }
            if (str3 != null) {
                intent.putExtra("android.intent.extra.SUBJECT", str3);
            }
            Uri uriE = FileProvider.e(context, g(context), file);
            intent.addFlags(3);
            intent.putExtra("android.intent.extra.STREAM", uriE);
            Activity activity = (Activity) context;
            activity.runOnUiThread(new a(activity, intent));
        }
    }
}
