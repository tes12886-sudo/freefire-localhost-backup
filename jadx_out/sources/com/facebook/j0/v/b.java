package com.facebook.j0.v;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.facebook.internal.h0;
import com.facebook.r;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l.d0.p;
import l.d0.q;
import l.y.c.o;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    private b() {
    }

    public static final void a() {
    }

    public static final void b() {
    }

    public static final String c(byte[] bArr) {
        l.y.c.i.e(bArr, "bytes");
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            o oVar = o.a;
            String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
            l.y.c.i.d(str, "java.lang.String.format(format, *args)");
            stringBuffer.append(str);
        }
        String string = stringBuffer.toString();
        l.y.c.i.d(string, "sb.toString()");
        return string;
    }

    public static final String d() {
        Context contextF = r.f();
        try {
            String str = contextF.getPackageManager().getPackageInfo(contextF.getPackageName(), 0).versionName;
            l.y.c.i.d(str, "packageInfo.versionName");
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public static final View e(Activity activity) {
        if (com.facebook.internal.m0.i.a.d(b.class) || activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            View decorView = window.getDecorView();
            l.y.c.i.d(decorView, "window.decorView");
            return decorView.getRootView();
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, b.class);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006b  */
    /* JADX WARN: Code duplicated, block: B:22:? A[RETURN, SYNTHETIC] */
    public static final boolean f() {
        String str = Build.FINGERPRINT;
        l.y.c.i.d(str, "Build.FINGERPRINT");
        if (!p.x(str, "generic", false, 2, null)) {
            l.y.c.i.d(str, "Build.FINGERPRINT");
            if (!p.x(str, "unknown", false, 2, null)) {
                String str2 = Build.MODEL;
                l.y.c.i.d(str2, "Build.MODEL");
                if (!q.C(str2, "google_sdk", false, 2, null)) {
                    l.y.c.i.d(str2, "Build.MODEL");
                    if (!q.C(str2, "Emulator", false, 2, null)) {
                        l.y.c.i.d(str2, "Build.MODEL");
                        if (!q.C(str2, "Android SDK built for x86", false, 2, null)) {
                            String str3 = Build.MANUFACTURER;
                            l.y.c.i.d(str3, "Build.MANUFACTURER");
                            if (!q.C(str3, "Genymotion", false, 2, null)) {
                                String str4 = Build.BRAND;
                                l.y.c.i.d(str4, "Build.BRAND");
                                if (p.x(str4, "generic", false, 2, null)) {
                                    String str5 = Build.DEVICE;
                                    l.y.c.i.d(str5, "Build.DEVICE");
                                    if (!p.x(str5, "generic", false, 2, null)) {
                                        if (l.y.c.i.a("google_sdk", Build.PRODUCT)) {
                                            return false;
                                        }
                                    }
                                } else if (l.y.c.i.a("google_sdk", Build.PRODUCT)) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public static final double g(String str) {
        try {
            Matcher matcher = Pattern.compile("[-+]*\\d+([.,]\\d+)*([.,]\\d+)?", 8).matcher(str);
            if (!matcher.find()) {
                return 0.0d;
            }
            return NumberFormat.getNumberInstance(h0.y()).parse(matcher.group(0)).doubleValue();
        } catch (ParseException unused) {
            return 0.0d;
        }
    }
}
