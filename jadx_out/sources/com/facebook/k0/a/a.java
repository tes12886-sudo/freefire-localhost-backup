package com.facebook.k0.a;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import com.facebook.internal.g0;
import com.facebook.internal.h0;
import com.facebook.internal.t;
import com.facebook.internal.u;
import com.facebook.r;
import j.d.a.e.a.a.i.g;
import j.d.e.c;
import j.d.e.e;
import j.d.e.h;
import j.d.e.j.b;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private static final String a = "com.facebook.k0.a.a";
    private static HashMap<String, NsdManager.RegistrationListener> b = new HashMap<>();

    /* JADX INFO: renamed from: com.facebook.k0.a.a$a, reason: collision with other inner class name */
    static class C0095a implements NsdManager.RegistrationListener {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        C0095a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i2) {
            a.a(this.b);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
            if (this.a.equals(nsdServiceInfo.getServiceName())) {
                return;
            }
            a.a(this.b);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i2) {
        }
    }

    public static void a(String str) {
        if (com.facebook.internal.m0.i.a.d(a.class)) {
            return;
        }
        try {
            b(str);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, a.class);
        }
    }

    @TargetApi(16)
    private static void b(String str) {
        if (com.facebook.internal.m0.i.a.d(a.class)) {
            return;
        }
        try {
            NsdManager.RegistrationListener registrationListener = b.get(str);
            if (registrationListener != null) {
                try {
                    ((NsdManager) r.f().getSystemService("servicediscovery")).unregisterService(registrationListener);
                } catch (IllegalArgumentException e) {
                    h0.e0(a, e);
                }
                b.remove(str);
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, a.class);
        }
    }

    public static Bitmap c(String str) {
        Bitmap bitmap = null;
        if (com.facebook.internal.m0.i.a.d(a.class)) {
            return null;
        }
        try {
            EnumMap enumMap = new EnumMap(c.class);
            enumMap.put(c.MARGIN, 2);
            try {
                b bVarA = new e().a(str, j.d.e.a.QR_CODE, g.STATUS_SUCCESS, g.STATUS_SUCCESS, enumMap);
                int iH = bVarA.h();
                int i2 = bVarA.i();
                int[] iArr = new int[iH * i2];
                for (int i3 = 0; i3 < iH; i3++) {
                    int i4 = i3 * i2;
                    for (int i5 = 0; i5 < i2; i5++) {
                        iArr[i4 + i5] = bVarA.g(i5, i3) ? -16777216 : -1;
                    }
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, iH, Bitmap.Config.ARGB_8888);
                try {
                    bitmapCreateBitmap.setPixels(iArr, 0, i2, 0, 0, i2, iH);
                    return bitmapCreateBitmap;
                } catch (h unused) {
                    bitmap = bitmapCreateBitmap;
                    return bitmap;
                }
            } catch (h unused2) {
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, a.class);
            return null;
        }
    }

    public static String d() {
        if (com.facebook.internal.m0.i.a.d(a.class)) {
            return null;
        }
        try {
            return e(null);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, a.class);
            return null;
        }
    }

    public static String e(Map<String, String> map) {
        if (com.facebook.internal.m0.i.a.d(a.class)) {
            return null;
        }
        if (map == null) {
            try {
                map = new HashMap<>();
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, a.class);
                return null;
            }
        }
        map.put("device", Build.DEVICE);
        map.put("model", Build.MODEL);
        return new JSONObject(map).toString();
    }

    public static boolean f() {
        if (com.facebook.internal.m0.i.a.d(a.class)) {
            return false;
        }
        try {
            t tVarJ = u.j(r.g());
            return Build.VERSION.SDK_INT >= 16 && tVarJ != null && tVarJ.k().contains(g0.Enabled);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, a.class);
            return false;
        }
    }

    public static boolean g(String str) {
        if (com.facebook.internal.m0.i.a.d(a.class)) {
            return false;
        }
        try {
            if (f()) {
                return h(str);
            }
            return false;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, a.class);
            return false;
        }
    }

    @TargetApi(16)
    private static boolean h(String str) {
        if (com.facebook.internal.m0.i.a.d(a.class)) {
            return false;
        }
        try {
            if (b.containsKey(str)) {
                return true;
            }
            String str2 = String.format("%s_%s_%s", "fbsdk", String.format("%s-%s", "android", r.u().replace('.', '|')), str);
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType("_fb._tcp.");
            nsdServiceInfo.setServiceName(str2);
            nsdServiceInfo.setPort(80);
            NsdManager nsdManager = (NsdManager) r.f().getSystemService("servicediscovery");
            C0095a c0095a = new C0095a(str2, str);
            b.put(str, c0095a);
            nsdManager.registerService(nsdServiceInfo, 1, c0095a);
            return true;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, a.class);
            return false;
        }
    }
}
