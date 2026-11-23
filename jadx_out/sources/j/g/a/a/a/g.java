package j.g.a.a.a;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public class g {
    public static boolean a(Context context, Intent intent) {
        return !context.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }
}
