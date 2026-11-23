package com.facebook.internal.m0;

import com.facebook.internal.h0;
import com.facebook.r;
import com.facebook.u;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Iterator;
import l.d0.p;
import l.y.c.i;
import l.y.c.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    static final class a implements FilenameFilter {
        public static final a a = new a();

        a() {
        }

        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            i.d(str, "name");
            o oVar = o.a;
            String str2 = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"anr_log_"}, 1));
            i.d(str2, "java.lang.String.format(format, *args)");
            return new l.d0.f(str2).a(str);
        }
    }

    static final class b implements FilenameFilter {
        public static final b a = new b();

        b() {
        }

        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            i.d(str, "name");
            o oVar = o.a;
            String str2 = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"analysis_log_"}, 1));
            i.d(str2, "java.lang.String.format(format, *args)");
            return new l.d0.f(str2).a(str);
        }
    }

    static final class c implements FilenameFilter {
        public static final c a = new c();

        c() {
        }

        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            i.d(str, "name");
            o oVar = o.a;
            String str2 = String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, 3));
            i.d(str2, "java.lang.String.format(format, *args)");
            return new l.d0.f(str2).a(str);
        }
    }

    public static final boolean a(String str) {
        File fileC = c();
        if (fileC == null || str == null) {
            return false;
        }
        return new File(fileC, str).delete();
    }

    public static final String b(Throwable th) {
        if (th == null) {
            return null;
        }
        return th.getCause() == null ? th.toString() : String.valueOf(th.getCause());
    }

    public static final File c() {
        File file = new File(r.f().getCacheDir(), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public static final String d(Thread thread) {
        i.e(thread, "thread");
        StackTraceElement[] stackTrace = thread.getStackTrace();
        JSONArray jSONArray = new JSONArray();
        for (StackTraceElement stackTraceElement : stackTrace) {
            jSONArray.put(stackTraceElement.toString());
        }
        return jSONArray.toString();
    }

    public static final String e(Throwable th) {
        Throwable th2 = null;
        if (th == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        while (th != null && th != th2) {
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                jSONArray.put(stackTraceElement.toString());
            }
            th2 = th;
            th = th.getCause();
        }
        return jSONArray.toString();
    }

    public static final boolean f(Throwable th) {
        if (th == null) {
            return false;
        }
        Throwable th2 = null;
        while (th != null && th != th2) {
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                i.d(stackTraceElement, "element");
                String className = stackTraceElement.getClassName();
                i.d(className, "element.className");
                if (p.x(className, "com.facebook", false, 2, null)) {
                    return true;
                }
            }
            th2 = th;
            th = th.getCause();
        }
        return false;
    }

    public static final boolean g(Thread thread) {
        StackTraceElement[] stackTrace;
        if (thread != null && (stackTrace = thread.getStackTrace()) != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                i.d(stackTraceElement, "element");
                String className = stackTraceElement.getClassName();
                i.d(className, "element.className");
                if (p.x(className, "com.facebook", false, 2, null)) {
                    String className2 = stackTraceElement.getClassName();
                    i.d(className2, "element.className");
                    if (!p.x(className2, "com.facebook.appevents.codeless", false, 2, null)) {
                        String className3 = stackTraceElement.getClassName();
                        i.d(className3, "element.className");
                        if (!p.x(className3, "com.facebook.appevents.suggestedevents", false, 2, null)) {
                            return true;
                        }
                    }
                    String methodName = stackTraceElement.getMethodName();
                    i.d(methodName, "element.methodName");
                    if (p.x(methodName, "onClick", false, 2, null)) {
                        continue;
                    } else {
                        String methodName2 = stackTraceElement.getMethodName();
                        i.d(methodName2, "element.methodName");
                        if (p.x(methodName2, "onItemClick", false, 2, null)) {
                            continue;
                        } else {
                            String methodName3 = stackTraceElement.getMethodName();
                            i.d(methodName3, "element.methodName");
                            if (!p.x(methodName3, "onTouch", false, 2, null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final File[] h() {
        File fileC = c();
        if (fileC == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileC.listFiles(a.a);
        return fileArrListFiles != null ? fileArrListFiles : new File[0];
    }

    public static final File[] i() {
        File fileC = c();
        if (fileC == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileC.listFiles(b.a);
        return fileArrListFiles != null ? fileArrListFiles : new File[0];
    }

    public static final File[] j() {
        File fileC = c();
        if (fileC == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileC.listFiles(c.a);
        return fileArrListFiles != null ? fileArrListFiles : new File[0];
    }

    public static final JSONObject k(String str, boolean z) {
        File fileC = c();
        if (fileC != null && str != null) {
            try {
                return new JSONObject(h0.q0(new FileInputStream(new File(fileC, str))));
            } catch (Exception unused) {
                if (z) {
                    a(str);
                }
            }
        }
        return null;
    }

    public static final void l(String str, JSONArray jSONArray, u.b bVar) {
        i.e(jSONArray, "reports");
        if (jSONArray.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, jSONArray.toString());
            JSONObject jSONObjectA = h0.A();
            if (jSONObjectA != null) {
                Iterator<String> itKeys = jSONObjectA.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectA.get(next));
                }
            }
            u.c cVar = u.t;
            o oVar = o.a;
            String str2 = String.format("%s/instruments", Arrays.copyOf(new Object[]{r.g()}, 1));
            i.d(str2, "java.lang.String.format(format, *args)");
            cVar.x(null, str2, jSONObject, bVar).j();
        } catch (JSONException unused) {
        }
    }

    public static final void m(String str, String str2) {
        File fileC = c();
        if (fileC == null || str == null || str2 == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(fileC, str));
            byte[] bytes = str2.getBytes(l.d0.d.b);
            i.d(bytes, "(this as java.lang.String).getBytes(charset)");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }
}
