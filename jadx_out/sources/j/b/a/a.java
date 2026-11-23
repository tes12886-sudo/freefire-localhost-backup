package j.b.a;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static boolean a = true;
    public static boolean b = true;
    public static String c = "garena";
    public static String d = null;
    public static String e = "seagroup.android.logger";
    public static int f = 999999;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Application f1912g;

    private static String a() {
        int i2;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int i3 = 0;
        while (true) {
            if (i3 >= stackTrace.length) {
                i2 = -1;
                break;
            }
            if (stackTrace[i3].getClassName().equals(a.class.getName())) {
                String methodName = stackTrace[i3].getMethodName();
                if (methodName.equals("e") || methodName.equals("w") || methodName.equals("i") || methodName.equals("d") || methodName.equals("v")) {
                    i2 = i3 + 1;
                    break;
                }
            }
            i3++;
        }
        if (i2 == -1) {
            Log.v(c, "CANNOT GENERATE LINE INFO");
            return "";
        }
        StackTraceElement stackTraceElement = stackTrace[i2];
        String className = stackTraceElement.getClassName();
        return stackTraceElement.getMethodName() + "(" + className.substring(className.lastIndexOf(".") + 1) + ".java:" + stackTraceElement.getLineNumber() + "): ";
    }

    public static void b(String str, Object... objArr) {
        if (a) {
            return;
        }
        String strD = d(str, objArr);
        Log.d(c, strD);
        f(strD, false);
        if (strD.contains("UnknownFormatConversionException")) {
            b("OK", new Object[0]);
        }
    }

    public static void c(Throwable th) {
        String string;
        if (a) {
            return;
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        int i2 = -1;
        for (int i3 = 0; i3 < stackTrace.length; i3++) {
            if (stackTrace[i3].getMethodName().compareTo("e") == 0) {
                i2 = i3 + 1;
                break;
            }
        }
        if (i2 >= 0) {
            String className = stackTrace[i2].getClassName();
            String strSubstring = className.substring(className.lastIndexOf(".") + 1);
            string = String.format(Locale.US, "position at %s.%s(%s.java:%s)", className, stackTrace[i2].getMethodName(), strSubstring, String.valueOf(stackTrace[i2].getLineNumber()));
            Log.e(c, string);
        } else {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            Log.e(c, stringWriter.toString());
            string = stringWriter.toString();
        }
        f(string, true);
    }

    private static String d(String str, Object... objArr) {
        StringBuilder sb;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (objArr == null || objArr.length <= 0) {
            sb = new StringBuilder();
        } else {
            try {
                return a() + e() + String.format(Locale.ENGLISH, str, objArr);
            } catch (Exception e2) {
                c(e2);
                sb = new StringBuilder();
            }
        }
        sb.append(a());
        sb.append(e());
        sb.append(str);
        return sb.toString();
    }

    private static String e() {
        return String.format(Locale.US, "[thread_id:%d name=%s] ", Long.valueOf(Thread.currentThread().getId()), Thread.currentThread().getName());
    }

    private static void f(String str, boolean z) {
        if (a || b) {
            return;
        }
        j.a.a.j(f1912g, str, z, d);
    }
}
