package com.facebook.j0.v;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.FF.voiceengine.FFVoiceConst;
import com.facebook.internal.a0;
import com.facebook.j0.m;
import java.util.Arrays;
import java.util.Locale;
import l.y.c.o;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    private static final String a = "com.facebook.j0.v.i";
    public static final i c = new i();
    private static final long[] b = {300000, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    private i() {
    }

    public static final int b(long j2) {
        if (com.facebook.internal.m0.i.a.d(i.class)) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            try {
                long[] jArr = b;
                if (i2 >= jArr.length || jArr[i2] >= j2) {
                    break;
                }
                i2++;
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, i.class);
                return 0;
            }
        }
        return i2;
    }

    public static final void c(String str, j jVar, String str2, Context context) {
        String string;
        if (com.facebook.internal.m0.i.a.d(i.class)) {
            return;
        }
        try {
            l.y.c.i.e(str, "activityName");
            l.y.c.i.e(context, "context");
            if (jVar == null || (string = jVar.toString()) == null) {
                string = "Unclassified";
            }
            Bundle bundle = new Bundle();
            bundle.putString("fb_mobile_launch_source", string);
            bundle.putString("fb_mobile_pckg_fp", c.a(context));
            bundle.putString("fb_mobile_app_cert_hash", com.facebook.internal.o0.a.a(context));
            m mVar = new m(str, str2, null);
            mVar.d("fb_mobile_activate_app", bundle);
            if (m.b.b() != com.facebook.j0.g.b.EXPLICIT_ONLY) {
                mVar.a();
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, i.class);
        }
    }

    private final void d() {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            a0.a aVar = a0.f;
            com.facebook.a0 a0Var = com.facebook.a0.APP_EVENTS;
            String str = a;
            l.y.c.i.c(str);
            aVar.c(a0Var, str, "Clock skew detected");
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    public static final void e(String str, h hVar, String str2) {
        long jLongValue;
        String string;
        if (com.facebook.internal.m0.i.a.d(i.class)) {
            return;
        }
        try {
            l.y.c.i.e(str, "activityName");
            if (hVar == null) {
                return;
            }
            Long lB = hVar.b();
            if (lB != null) {
                jLongValue = lB.longValue();
            } else {
                Long lE = hVar.e();
                jLongValue = 0 - (lE != null ? lE.longValue() : 0L);
            }
            if (jLongValue < 0) {
                c.d();
                jLongValue = 0;
            }
            long jF = hVar.f();
            if (jF < 0) {
                c.d();
                jF = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("fb_mobile_app_interruptions", hVar.c());
            o oVar = o.a;
            String str3 = String.format(Locale.ROOT, "session_quanta_%d", Arrays.copyOf(new Object[]{Integer.valueOf(b(jLongValue))}, 1));
            l.y.c.i.d(str3, "java.lang.String.format(locale, format, *args)");
            bundle.putString("fb_mobile_time_between_sessions", str3);
            j jVarG = hVar.g();
            if (jVarG == null || (string = jVarG.toString()) == null) {
                string = "Unclassified";
            }
            bundle.putString("fb_mobile_launch_source", string);
            Long lE2 = hVar.e();
            bundle.putLong("_logTime", (lE2 != null ? lE2.longValue() : 0L) / ((long) FFVoiceConst.FFVoiceEvent.FFVoice_EVENT_EOF));
            m mVar = new m(str, str2, null);
            double d = jF;
            double d2 = 1000L;
            Double.isNaN(d);
            Double.isNaN(d2);
            mVar.c("fb_mobile_deactivate_app", d / d2, bundle);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, i.class);
        }
    }

    public final String a(Context context) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            l.y.c.i.e(context, "context");
            try {
                PackageManager packageManager = context.getPackageManager();
                String str = "PCKGCHKSUM;" + packageManager.getPackageInfo(context.getPackageName(), 0).versionName;
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                String string = sharedPreferences.getString(str, null);
                if (string != null && string.length() == 32) {
                    return string;
                }
                String strC = g.c(context, null);
                if (strC == null) {
                    strC = g.b(packageManager.getApplicationInfo(context.getPackageName(), 0).sourceDir);
                }
                sharedPreferences.edit().putString(str, strC).apply();
                return strC;
            } catch (Exception unused) {
                return null;
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }
}
