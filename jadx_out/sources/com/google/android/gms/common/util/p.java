package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.common.internal.q;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class p {
    private static final Method a;
    private static final Method b;
    private static final Method c;
    private static final Method d;

    static {
        Method method;
        Method method2;
        Method method3;
        Process.myUid();
        Method method4 = null;
        try {
            method = WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception unused) {
            method = null;
        }
        a = method;
        if (l.c()) {
            try {
                method2 = WorkSource.class.getMethod("add", Integer.TYPE, String.class);
            } catch (Exception unused2) {
                method2 = null;
            }
        } else {
            method2 = null;
        }
        b = method2;
        try {
            method3 = WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception unused3) {
            method3 = null;
        }
        c = method3;
        try {
            WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception unused4) {
        }
        if (l.c()) {
            try {
                method4 = WorkSource.class.getMethod("getName", Integer.TYPE);
            } catch (Exception unused5) {
            }
        }
        d = method4;
        if (l.i()) {
            try {
                WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception e) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e);
            }
        }
        if (l.i()) {
            try {
                Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
            } catch (Exception e2) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e2);
            }
        }
        if (l.i()) {
            try {
                WorkSource.class.getMethod("isEmpty", new Class[0]).setAccessible(true);
            } catch (Exception unused6) {
            }
        }
    }

    public static void a(WorkSource workSource, int i2, String str) {
        Method method = b;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i2), str);
                return;
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                return;
            }
        }
        Method method2 = a;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i2));
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
        }
    }

    public static WorkSource b(Context context, String str) {
        String str2;
        if (context == null || context.getPackageManager() == null || str == null) {
            return null;
        }
        try {
            ApplicationInfo applicationInfoC = com.google.android.gms.common.o.c.a(context).c(str, 0);
            if (applicationInfoC == null) {
                str2 = "Could not get applicationInfo from package: ";
                Log.e("WorkSourceUtil", str2.concat(str));
                return null;
            }
            int i2 = applicationInfoC.uid;
            WorkSource workSource = new WorkSource();
            a(workSource, i2, str);
            return workSource;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "Could not find package: ";
        }
    }

    public static String c(WorkSource workSource, int i2) {
        Method method = d;
        if (method == null) {
            return null;
        }
        try {
            return (String) method.invoke(workSource, Integer.valueOf(i2));
        } catch (Exception e) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            return null;
        }
    }

    public static List<String> d(WorkSource workSource) {
        ArrayList arrayList = new ArrayList();
        int iF = workSource == null ? 0 : f(workSource);
        if (iF != 0) {
            for (int i2 = 0; i2 < iF; i2++) {
                String strC = c(workSource, i2);
                if (!n.a(strC)) {
                    q.k(strC);
                    arrayList.add(strC);
                }
            }
        }
        return arrayList;
    }

    public static boolean e(Context context) {
        return (context == null || context.getPackageManager() == null || com.google.android.gms.common.o.c.a(context).b("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) ? false : true;
    }

    public static int f(WorkSource workSource) {
        Method method = c;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(workSource, new Object[0]);
                q.k(objInvoke);
                return ((Integer) objInvoke).intValue();
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return 0;
    }
}
