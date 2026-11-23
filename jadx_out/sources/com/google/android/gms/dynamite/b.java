package com.google.android.gms.dynamite;

import android.os.Looper;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    private static volatile ClassLoader a;
    private static volatile Thread b;

    public static synchronized ClassLoader a() {
        if (a == null) {
            a = b();
        }
        return a;
    }

    private static synchronized ClassLoader b() {
        ClassLoader contextClassLoader = null;
        if (b == null) {
            b = c();
            if (b == null) {
                return null;
            }
        }
        synchronized (b) {
            try {
                contextClassLoader = b.getContextClassLoader();
            } catch (SecurityException e) {
                Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + e.getMessage());
            }
        }
        return contextClassLoader;
    }

    private static synchronized Thread c() {
        SecurityException e;
        Thread aVar;
        Thread thread;
        ThreadGroup threadGroup;
        ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
        if (threadGroup2 == null) {
            return null;
        }
        synchronized (Void.class) {
            try {
                int iActiveGroupCount = threadGroup2.activeGroupCount();
                ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                threadGroup2.enumerate(threadGroupArr);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i3 >= iActiveGroupCount) {
                        threadGroup = null;
                        break;
                    }
                    threadGroup = threadGroupArr[i3];
                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                        break;
                    }
                    i3++;
                }
                if (threadGroup == null) {
                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                }
                int iActiveCount = threadGroup.activeCount();
                Thread[] threadArr = new Thread[iActiveCount];
                threadGroup.enumerate(threadArr);
                while (true) {
                    if (i2 >= iActiveCount) {
                        thread = null;
                        break;
                    }
                    thread = threadArr[i2];
                    if ("GmsDynamite".equals(thread.getName())) {
                        break;
                    }
                    i2++;
                }
                if (thread == null) {
                    try {
                        aVar = new a(threadGroup, "GmsDynamite");
                        try {
                            aVar.setContextClassLoader(null);
                            aVar.start();
                        } catch (SecurityException e2) {
                            e = e2;
                            Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e.getMessage());
                        }
                    } catch (SecurityException e3) {
                        e = e3;
                        aVar = thread;
                    }
                    thread = aVar;
                }
            } catch (SecurityException e4) {
                e = e4;
                aVar = null;
            }
        }
        return thread;
    }
}
