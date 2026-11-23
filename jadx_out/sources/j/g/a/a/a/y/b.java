package j.g.a.a.a.y;

import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public class b {
    static String a(Context context) {
        int i2 = context.getApplicationContext().getApplicationInfo().icon;
        return i2 > 0 ? context.getResources().getResourcePackageName(i2) : context.getPackageName();
    }

    static int b(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, a(context));
    }

    public static String c(Context context, String str, String str2) {
        Resources resources;
        int iB;
        return (context == null || (resources = context.getResources()) == null || (iB = b(context, str, "string")) <= 0) ? str2 : resources.getString(iB);
    }
}
