package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class l {
    private static final Map<String, Integer> e;
    static final String f;
    private final Context a;
    private final IdManager b;
    private final AppData c;
    private final com.google.firebase.crashlytics.internal.i.d d;

    static {
        HashMap map = new HashMap();
        e = map;
        map.put("armeabi", 5);
        map.put("armeabi-v7a", 6);
        map.put("arm64-v8a", 9);
        map.put("x86", 0);
        map.put("x86_64", 1);
        f = String.format(Locale.US, "Crashlytics Android SDK/%s", "18.0.1");
    }

    public l(Context context, IdManager idManager, AppData appData, com.google.firebase.crashlytics.internal.i.d dVar) {
        this.a = context;
        this.b = idManager;
        this.c = appData;
        this.d = dVar;
    }

    private com.google.firebase.crashlytics.internal.e.v.a a() {
        com.google.firebase.crashlytics.internal.e.v.a aVarB = com.google.firebase.crashlytics.internal.e.v.b();
        aVarB.h("18.0.1");
        aVarB.d(this.c.a);
        aVarB.e(this.b.a());
        aVarB.b(this.c.e);
        aVarB.c(this.c.f);
        aVarB.g(4);
        return aVarB;
    }

    private static int d() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = e.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    private com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.AbstractC0139a e() {
        com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.AbstractC0139a.AbstractC0140a abstractC0140aA = com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.AbstractC0139a.a();
        abstractC0140aA.b(0L);
        abstractC0140aA.d(0L);
        abstractC0140aA.c(this.c.d);
        abstractC0140aA.e(this.c.b);
        return abstractC0140aA.a();
    }

    private com.google.firebase.crashlytics.internal.e.w<com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.AbstractC0139a> f() {
        return com.google.firebase.crashlytics.internal.e.w.c(e());
    }

    private com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a g(int i2, com.google.firebase.crashlytics.internal.i.e eVar, Thread thread, int i3, int i4, boolean z) {
        Boolean boolValueOf;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfoJ = k.j(this.c.d, this.a);
        if (runningAppProcessInfoJ != null) {
            boolValueOf = Boolean.valueOf(runningAppProcessInfoJ.importance != 100);
        } else {
            boolValueOf = null;
        }
        com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.AbstractC0138a abstractC0138aA = com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.a();
        abstractC0138aA.b(boolValueOf);
        abstractC0138aA.e(i2);
        abstractC0138aA.d(k(eVar, thread, i3, i4, z));
        return abstractC0138aA.a();
    }

    private com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.c h(int i2) {
        h hVarA = h.a(this.a);
        Float fB = hVarA.b();
        Double dValueOf = fB != null ? Double.valueOf(fB.doubleValue()) : null;
        int iC = hVarA.c();
        boolean zO = k.o(this.a);
        long jS = k.s() - k.a(this.a);
        long jB = k.b(Environment.getDataDirectory().getPath());
        com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.c.a aVarA = com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.c.a();
        aVarA.b(dValueOf);
        aVarA.c(iC);
        aVarA.f(zO);
        aVarA.e(i2);
        aVarA.g(jS);
        aVarA.d(jB);
        return aVarA.a();
    }

    private com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.c i(com.google.firebase.crashlytics.internal.i.e eVar, int i2, int i3) {
        return j(eVar, i2, i3, 0);
    }

    private com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.c j(com.google.firebase.crashlytics.internal.i.e eVar, int i2, int i3, int i4) {
        String str = eVar.b;
        String str2 = eVar.a;
        StackTraceElement[] stackTraceElementArr = eVar.c;
        int i5 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        com.google.firebase.crashlytics.internal.i.e eVar2 = eVar.d;
        if (i4 >= i3) {
            com.google.firebase.crashlytics.internal.i.e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.d;
                i5++;
            }
        }
        com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.c.AbstractC0142a abstractC0142aA = com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.c.a();
        abstractC0142aA.f(str);
        abstractC0142aA.e(str2);
        abstractC0142aA.c(com.google.firebase.crashlytics.internal.e.w.b(m(stackTraceElementArr, i2)));
        abstractC0142aA.d(i5);
        if (eVar2 != null && i5 == 0) {
            abstractC0142aA.b(j(eVar2, i2, i3, i4 + 1));
        }
        return abstractC0142aA.a();
    }

    private com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b k(com.google.firebase.crashlytics.internal.i.e eVar, Thread thread, int i2, int i3, boolean z) {
        com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.AbstractC0141b abstractC0141bA = com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.a();
        abstractC0141bA.e(u(eVar, thread, i2, z));
        abstractC0141bA.c(i(eVar, i2, i3));
        abstractC0141bA.d(r());
        abstractC0141bA.b(f());
        return abstractC0141bA.a();
    }

    private com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.e.AbstractC0146b l(StackTraceElement stackTraceElement, com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.e.AbstractC0146b.AbstractC0147a abstractC0147a) {
        long lineNumber = 0;
        long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            lineNumber = stackTraceElement.getLineNumber();
        }
        abstractC0147a.e(jMax);
        abstractC0147a.f(str);
        abstractC0147a.b(fileName);
        abstractC0147a.d(lineNumber);
        return abstractC0147a.a();
    }

    private com.google.firebase.crashlytics.internal.e.w<com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.e.AbstractC0146b> m(StackTraceElement[] stackTraceElementArr, int i2) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.e.AbstractC0146b.AbstractC0147a abstractC0147aA = com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.e.AbstractC0146b.a();
            abstractC0147aA.c(i2);
            arrayList.add(l(stackTraceElement, abstractC0147aA));
        }
        return com.google.firebase.crashlytics.internal.e.w.b(arrayList);
    }

    private com.google.firebase.crashlytics.internal.e.v.d.a n() {
        com.google.firebase.crashlytics.internal.e.v.d.a.AbstractC0136a abstractC0136aA = com.google.firebase.crashlytics.internal.e.v.d.a.a();
        abstractC0136aA.e(this.b.f());
        abstractC0136aA.g(this.c.e);
        abstractC0136aA.d(this.c.f);
        abstractC0136aA.f(this.b.a());
        String strA = this.c.f1366g.a();
        if (strA != null) {
            abstractC0136aA.b("Unity");
            abstractC0136aA.c(strA);
        }
        return abstractC0136aA.a();
    }

    private com.google.firebase.crashlytics.internal.e.v.d o(String str, long j2) {
        com.google.firebase.crashlytics.internal.e.v.d.b bVarA = com.google.firebase.crashlytics.internal.e.v.d.a();
        bVarA.l(j2);
        bVarA.i(str);
        bVarA.g(f);
        bVarA.b(n());
        bVarA.k(q());
        bVarA.d(p());
        bVarA.h(3);
        return bVarA.a();
    }

    private com.google.firebase.crashlytics.internal.e.v.d.c p() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int iD = d();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jS = k.s();
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean zY = k.y(this.a);
        int iM = k.m(this.a);
        String str = Build.MANUFACTURER;
        String str2 = Build.PRODUCT;
        com.google.firebase.crashlytics.internal.e.v.d.c.a aVarA = com.google.firebase.crashlytics.internal.e.v.d.c.a();
        aVarA.b(iD);
        aVarA.f(Build.MODEL);
        aVarA.c(iAvailableProcessors);
        aVarA.h(jS);
        aVarA.d(blockCount);
        aVarA.i(zY);
        aVarA.j(iM);
        aVarA.e(str);
        aVarA.g(str2);
        return aVarA.a();
    }

    private com.google.firebase.crashlytics.internal.e.v.d.e q() {
        com.google.firebase.crashlytics.internal.e.v.d.e.a aVarA = com.google.firebase.crashlytics.internal.e.v.d.e.a();
        aVarA.d(3);
        aVarA.e(Build.VERSION.RELEASE);
        aVarA.b(Build.VERSION.CODENAME);
        aVarA.c(k.z(this.a));
        return aVarA.a();
    }

    private com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.AbstractC0143d r() {
        com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.AbstractC0143d.AbstractC0144a abstractC0144aA = com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.AbstractC0143d.a();
        abstractC0144aA.d("0");
        abstractC0144aA.c("0");
        abstractC0144aA.b(0L);
        return abstractC0144aA.a();
    }

    private com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.e s(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return t(thread, stackTraceElementArr, 0);
    }

    private com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.e t(Thread thread, StackTraceElement[] stackTraceElementArr, int i2) {
        com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.e.AbstractC0145a abstractC0145aA = com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.e.a();
        abstractC0145aA.d(thread.getName());
        abstractC0145aA.c(i2);
        abstractC0145aA.b(com.google.firebase.crashlytics.internal.e.w.b(m(stackTraceElementArr, i2)));
        return abstractC0145aA.a();
    }

    private com.google.firebase.crashlytics.internal.e.w<com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a.b.e> u(com.google.firebase.crashlytics.internal.i.e eVar, Thread thread, int i2, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(t(thread, eVar.c, i2));
        if (z) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(s(key, this.d.a(entry.getValue())));
                }
            }
        }
        return com.google.firebase.crashlytics.internal.e.w.b(arrayList);
    }

    public com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d b(Throwable th, Thread thread, String str, long j2, int i2, int i3, boolean z) {
        int i4 = this.a.getResources().getConfiguration().orientation;
        com.google.firebase.crashlytics.internal.i.e eVar = new com.google.firebase.crashlytics.internal.i.e(th, this.d);
        com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.b bVarA = com.google.firebase.crashlytics.internal.e.v.d.AbstractC0137d.a();
        bVarA.f(str);
        bVarA.e(j2);
        bVarA.b(g(i4, eVar, thread, i2, i3, z));
        bVarA.c(h(i4));
        return bVarA.a();
    }

    public com.google.firebase.crashlytics.internal.e.v c(String str, long j2) {
        com.google.firebase.crashlytics.internal.e.v.a aVarA = a();
        aVarA.i(o(str, j2));
        return aVarA.a();
    }
}
