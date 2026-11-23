package androidx.core.app;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class a extends androidx.core.content.a {
    private static d d;

    /* JADX INFO: renamed from: androidx.core.app.a$a, reason: collision with other inner class name */
    class RunnableC0013a implements Runnable {
        final /* synthetic */ String[] a;
        final /* synthetic */ Activity b;
        final /* synthetic */ int c;

        RunnableC0013a(String[] strArr, Activity activity, int i2) {
            this.a = strArr;
            this.b = activity;
            this.c = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.a.length];
            PackageManager packageManager = this.b.getPackageManager();
            String packageName = this.b.getPackageName();
            int length = this.a.length;
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = packageManager.checkPermission(this.a[i2], packageName);
            }
            ((c) this.b).onRequestPermissionsResult(this.c, this.a, iArr);
        }
    }

    class b implements Runnable {
        final /* synthetic */ Activity a;

        b(Activity activity) {
            this.a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a.isFinishing() || androidx.core.app.c.i(this.a)) {
                return;
            }
            this.a.recreate();
        }
    }

    public interface c {
        void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr);
    }

    public interface d {
        boolean a(Activity activity, String[] strArr, int i2);
    }

    public interface e {
        void b(int i2);
    }

    public static void m(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    public static void n(Activity activity) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 28) {
            if (i2 <= 23) {
                new Handler(activity.getMainLooper()).post(new b(activity));
                return;
            } else if (androidx.core.app.c.i(activity)) {
                return;
            }
        }
        activity.recreate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void o(Activity activity, String[] strArr, int i2) {
        d dVar = d;
        if (dVar == null || !dVar.a(activity, strArr, i2)) {
            for (String str : strArr) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof e) {
                    ((e) activity).b(i2);
                }
                activity.requestPermissions(strArr, i2);
            } else if (activity instanceof c) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0013a(strArr, activity, i2));
            }
        }
    }

    public static boolean p(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    public static void q(Activity activity, Intent intent, int i2, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i2, bundle);
        } else {
            activity.startActivityForResult(intent, i2);
        }
    }

    public static void r(Activity activity, IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
        } else {
            activity.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
        }
    }
}
