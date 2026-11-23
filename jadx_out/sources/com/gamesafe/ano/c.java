package com.gamesafe.ano;

import android.app.Activity;
import android.content.Context;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public class c {
    private static Context a;

    public static Boolean a(Object obj) {
        try {
            return (Boolean) j.a("android.app.ActivityThread$ActivityClientRecord", obj, "paused");
        } catch (Exception unused) {
            return Boolean.TRUE;
        }
    }

    public static void a() {
        b.a("jar_ver:5.9.37(2020/11/10)-jar-version");
    }

    public static Context b() {
        if (a == null) {
            try {
                a = (Context) j.a("android.app.ActivityThread", j.a("android.app.ActivityThread", "currentActivityThread", new Class[0], new Object[0]), "mInitialApplication");
            } catch (Exception unused) {
                a = null;
            }
        }
        return a;
    }

    public static Activity c() {
        try {
            return (Activity) j.a("com.unity3d.player.UnityPlayer", "currentActivity");
        } catch (Exception unused) {
            return null;
        }
    }

    public static Activity d() {
        Activity activityC = c();
        return activityC == null ? e() : activityC;
    }

    private static Activity e() {
        try {
            Activity activity = null;
            for (Object obj : ((Collection) j.a("java.util.Map", "values", j.a("android.app.ActivityThread", j.a("android.app.ActivityThread", "currentActivityThread", new Class[0], new Object[0]), "mActivities"), new Class[0], new Object[0])).toArray()) {
                if (obj != null) {
                    Object objA = j.a("android.app.ActivityThread$ActivityClientRecord", obj, "activity");
                    Boolean boolA = a(obj);
                    if (objA != null && (activity == null || !boolA.booleanValue())) {
                        activity = (Activity) objA;
                    }
                }
            }
            return activity;
        } catch (Exception unused) {
            return null;
        }
    }
}
