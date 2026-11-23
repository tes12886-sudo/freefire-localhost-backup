package com.beetalk.sdk.x;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.beetalk.sdk.p;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static String a = "com.garena.msdk[" + com.beetalk.sdk.i.b() + "]";
    private static final boolean b;

    static {
        b = p.p() == p.c.PRODUCTION;
    }

    public static void a(String str, Object... objArr) {
        if (!p.b) {
            String strG = g(str, objArr);
            Log.d(a, strG);
            k("D", a, strG);
        }
        if (d(str, objArr).contains("UnknownFormatConversionException")) {
            i("OK", new Object[0]);
        }
    }

    public static void b(Exception exc) {
        if (p.b || exc == null) {
            return;
        }
        StackTraceElement[] stackTrace = exc.getStackTrace();
        int i2 = -1;
        for (int i3 = 0; i3 < stackTrace.length; i3++) {
            if (stackTrace[i3].getMethodName().compareTo("e") == 0) {
                i2 = i3 + 1;
                break;
            }
        }
        if (i2 < 0) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            Log.e(a, stringWriter.toString());
            k("E", a, stringWriter.toString());
            return;
        }
        String className = stackTrace[i2].getClassName();
        String strSubstring = className.substring(className.lastIndexOf(".") + 1);
        String str = "at " + className + "." + stackTrace[i2].getMethodName() + "(" + strSubstring + ".java:" + String.valueOf(stackTrace[i2].getLineNumber()) + ")";
        Log.e(a + " position", str);
        k("E", a + " position", str);
    }

    public static void c(String str, Object... objArr) {
        if (!p.b) {
            String strG = g(str, objArr);
            Log.e(a, strG);
            k("E", a, strG);
        }
        if (d(str, objArr).contains("UnknownFormatConversionException")) {
            i("OK", new Object[0]);
        }
    }

    private static String d(String str, Object... objArr) {
        return (objArr == null || objArr.length == 0) ? str : String.format(Locale.ENGLISH, str, objArr);
    }

    private static void e() {
        int i2;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int i3 = 0;
        while (true) {
            if (i3 >= stackTrace.length) {
                i2 = -1;
                break;
            } else {
                if (stackTrace[i3].getMethodName().compareTo("i") == 0) {
                    i2 = i3 + 1;
                    break;
                }
                i3++;
            }
        }
        if (i2 == -1) {
            Log.i(a, "CANNOT GENERATE DEBUG");
            return;
        }
        String className = stackTrace[i2].getClassName();
        String strSubstring = className.substring(className.lastIndexOf(".") + 1);
        String methodName = stackTrace[i2].getMethodName();
        String strValueOf = String.valueOf(stackTrace[i2].getLineNumber());
        Log.i(a + " position", "at " + className + "." + methodName + "(" + strSubstring + ".java:" + strValueOf + ")");
    }

    private static String f() {
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
                if (methodName.equals("e") || methodName.equals("w") || methodName.equals("i") || methodName.equals("d")) {
                    i2 = i3 + 1;
                    break;
                }
            }
            i3++;
        }
        if (i2 == -1) {
            Log.i(a, "CANNOT GENERATE DEBUG");
            return "";
        }
        StackTraceElement stackTraceElement = stackTrace[i2];
        String className = stackTraceElement.getClassName();
        return stackTraceElement.getMethodName() + "(" + className.substring(className.lastIndexOf(".") + 1) + ".java:" + stackTraceElement.getLineNumber() + "): ";
    }

    private static String g(String str, Object... objArr) {
        StringBuilder sb;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (objArr == null || objArr.length <= 0) {
            sb = new StringBuilder();
        } else {
            try {
                return f() + h() + l(d(str, objArr));
            } catch (Exception e) {
                b(e);
                sb = new StringBuilder();
            }
        }
        sb.append(f());
        sb.append(h());
        sb.append(str);
        return sb.toString();
    }

    private static String h() {
        return String.format(Locale.ENGLISH, "[thread_id:%d name=%s] ", Long.valueOf(Thread.currentThread().getId()), Thread.currentThread().getName());
    }

    public static void i(String str, Object... objArr) {
        if (p.b) {
            return;
        }
        if (!p.a) {
            e();
        }
        String strG = g(str, objArr);
        Log.i(a, strG);
        k("I", a, strG);
    }

    public static void j(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return;
        }
        context.getApplicationContext().getPackageName();
    }

    private static void k(String str, String str2, String str3) {
    }

    private static String l(String str) {
        return b ? str.replaceAll("token=\\S*", "token=ACCESS_TOKEN_REMOVED ").replaceAll("client_secret=\\S*", "client_secret=CLIENT_SECRET_REMOVED ").replaceAll("app_key=\\S*", "appKey=APP_SECRET_REMOVED ").replaceAll("access_token=\\S*", "access_token=ACCESS_TOKEN_REMOVED ").replaceAll("code=\\S*", "code=SOME_CODE_REMOVED ") : str;
    }

    public static void m(String str, Object... objArr) {
        if (!p.b) {
            String strG = g(str, objArr);
            Log.w(a, strG);
            k("W", a, strG);
        }
        if (d(str, objArr).contains("UnknownFormatConversionException")) {
            i("OK", new Object[0]);
        }
    }
}
