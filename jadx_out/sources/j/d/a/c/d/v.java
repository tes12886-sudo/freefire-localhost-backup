package j.d.a.c.d;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.appff.haptic.base.Utils;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
public final class v {
    private final Context a;

    @GuardedBy("this")
    private int b;

    @GuardedBy("this")
    private int c = 0;

    public v(Context context) {
        this.a = context;
    }

    private final PackageInfo b(String str) {
        try {
            return com.google.android.gms.common.o.c.a(this.a).e(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            String strValueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 23);
            sb.append("Failed to find package ");
            sb.append(strValueOf);
            Log.w(Utils.HE_META_DATA_KEY, sb.toString());
            return null;
        }
    }

    public final synchronized int a() {
        int i2 = this.c;
        if (i2 != 0) {
            return i2;
        }
        PackageManager packageManager = this.a.getPackageManager();
        if (com.google.android.gms.common.o.c.a(this.a).b("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e(Utils.HE_META_DATA_KEY, "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!com.google.android.gms.common.util.l.h()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.c = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.c = 2;
            return 2;
        }
        Log.w(Utils.HE_META_DATA_KEY, "Failed to resolve IID implementation package, falling back");
        if (com.google.android.gms.common.util.l.h()) {
            this.c = 2;
        } else {
            this.c = 1;
        }
        return this.c;
    }

    public final synchronized int c() {
        PackageInfo packageInfoB;
        if (this.b == 0 && (packageInfoB = b("com.google.android.gms")) != null) {
            this.b = packageInfoB.versionCode;
        }
        return this.b;
    }
}
