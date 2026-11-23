package j.c.a.e.l;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class d {
    public static String a(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            return bundle != null ? Integer.valueOf(bundle.getInt("com.garena.sdk.push.applicationId")).toString() : "";
        } catch (Exception unused) {
            return "";
        }
    }
}
