package com.facebook.j0.r.g;

import android.util.Log;
import java.lang.reflect.Method;
import l.y.c.i;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    private static final String a = "com.facebook.j0.r.g.e";
    private static Class<?> b;
    public static final e c = new e();

    private e() {
    }

    public static final void a() {
        d("UnityFacebookSDKPlugin", "CaptureViewHierarchy", "");
    }

    private final Class<?> b() throws ClassNotFoundException {
        Class<?> cls = Class.forName("com.unity3d.player.UnityPlayer");
        i.d(cls, "Class.forName(UNITY_PLAYER_CLASS)");
        return cls;
    }

    public static final void c(String str) {
        d("UnityFacebookSDKPlugin", "OnReceiveMapping", str);
    }

    public static final void d(String str, String str2, String str3) {
        try {
            if (b == null) {
                b = c.b();
            }
            Class<?> cls = b;
            if (cls == null) {
                i.q("unityPlayer");
                throw null;
            }
            Method method = cls.getMethod("UnitySendMessage", String.class, String.class, String.class);
            i.d(method, "unityPlayer.getMethod(\n …java, String::class.java)");
            Class<?> cls2 = b;
            if (cls2 != null) {
                method.invoke(cls2, str, str2, str3);
            } else {
                i.q("unityPlayer");
                throw null;
            }
        } catch (Exception e) {
            Log.e(a, "Failed to send message to Unity", e);
        }
    }
}
