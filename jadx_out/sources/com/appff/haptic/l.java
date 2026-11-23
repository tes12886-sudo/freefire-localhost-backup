package com.appff.haptic;

import android.text.TextUtils;
import android.util.Log;
import com.appff.haptic.base.Utils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes.dex */
public class l {
    static g.a.b a = null;
    private static final String b = "HapticsPlayerUtils";

    public static String a(File file) {
        if (!Utils.validatePath(file.getPath(), Utils.SUFFIX_HE)) {
            Log.d(b, "Wrong parameter {patternFile: " + file.getPath() + "} doesn't exist or has wrong file format!");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public static void a(int i2) {
        String str;
        try {
            if (g.a.b.a()) {
                g.a.b bVar = a;
                if (bVar == null) {
                    Log.e(b, "HapticsPlayer is null");
                    return;
                } else {
                    try {
                        bVar.h(i2);
                        return;
                    } catch (NoSuchMethodError unused) {
                        str = "[interval,amplitude,freq],haven't integrate Haptic player 1.1";
                    }
                }
            } else {
                str = "The system does not support HapticsPlayer";
            }
            Log.e(b, str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(int i2, int i3, int i4) {
        String str;
        try {
            if (g.a.b.a()) {
                g.a.b bVar = a;
                if (bVar == null) {
                    Log.e(b, "HapticsPlayer is null");
                    return;
                } else {
                    try {
                        bVar.i(i2, i3, i4);
                        return;
                    } catch (NoSuchMethodError unused) {
                        str = "[interval,amplitude,freq],haven't integrate Haptic player 1.1";
                    }
                }
            } else {
                str = "The system does not support HapticsPlayer";
            }
            Log.e(b, str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(File file, int i2) {
        try {
            if (!g.a.b.a()) {
                Log.e(b, "The system does not support HapticsPlayer");
                return;
            }
            String strA = a(file);
            if (TextUtils.isEmpty(strA)) {
                Log.e(b, "empty pattern,do nothing");
                return;
            }
            g.a.b bVar = new g.a.b(g.a.a.a(strA));
            a = bVar;
            bVar.b(i2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(File file, int i2, int i3, int i4) {
        try {
            if (!g.a.b.a()) {
                Log.e(b, "[looper, interval, amplitude],The system does not support HapticsPlayer");
                return;
            }
            String strA = a(file);
            if (TextUtils.isEmpty(strA)) {
                Log.e(b, "empty pattern,do nothing");
                return;
            }
            g.a.b bVar = new g.a.b(g.a.a.a(strA));
            a = bVar;
            try {
                bVar.c(i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                Log.w(b, "haven't integrate Haptic player 1.1 !!!!!!! now we use Haptic player 1.0 to start vibrate");
                a.b(i2);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(File file, int i2, int i3, int i4, int i5) {
        try {
            if (!g.a.b.a()) {
                Log.e(b, "The system does not support HapticsPlayer");
                return;
            }
            String strA = a(file);
            if (TextUtils.isEmpty(strA)) {
                Log.e(b, "empty pattern,do nothing");
                return;
            }
            g.a.b bVar = new g.a.b(g.a.a.a(strA));
            a = bVar;
            try {
                bVar.d(i2, i3, i4, i5);
            } catch (NoSuchMethodError unused) {
                Log.w(b, "[file, looper,interval,amplitude,freq],haven't integrate Haptic player 1.1 !!!!!!!now we use Haptic player 1.0 to start vibrate");
                a.b(i2);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(String str, int i2) {
        try {
            if (g.a.b.a()) {
                g.a.b bVar = new g.a.b(g.a.a.a(str));
                a = bVar;
                bVar.b(i2);
            } else {
                Log.e(b, "The system does not support HapticsPlayer");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(String str, int i2, int i3, int i4, int i5) {
        try {
            if (g.a.b.a()) {
                g.a.b bVar = new g.a.b(g.a.a.a(str));
                a = bVar;
                try {
                    bVar.d(i2, i3, i4, i5);
                } catch (NoSuchMethodError unused) {
                    Log.w(b, "[patternString, looper,interval,amplitude,freq],haven't integrate Haptic player 1.1 !!!!!!!now we use Haptic player 1.0 to start vibrate");
                    a.b(i2);
                }
            } else {
                Log.e(b, "The system does not support HapticsPlayer");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static boolean a() {
        try {
            return g.a.b.a();
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static void b() {
        try {
            g.a.b bVar = a;
            if (bVar == null) {
                Log.e(b, "HapticsPlayer is null");
            } else {
                bVar.e();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void b(int i2) {
        String str;
        try {
            if (g.a.b.a()) {
                g.a.b bVar = a;
                if (bVar == null) {
                    Log.e(b, "HapticsPlayer is null");
                    return;
                } else {
                    try {
                        bVar.f(i2);
                        return;
                    } catch (NoSuchMethodError unused) {
                        str = "[interval,amplitude,freq],haven't integrate Haptic player 1.1";
                    }
                }
            } else {
                str = "The system does not support HapticsPlayer";
            }
            Log.e(b, str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void c(int i2) {
        String str;
        try {
            if (g.a.b.a()) {
                g.a.b bVar = a;
                if (bVar == null) {
                    Log.e(b, "HapticsPlayer is null");
                    return;
                } else {
                    try {
                        bVar.g(i2);
                        return;
                    } catch (NoSuchMethodError unused) {
                        str = "[interval,amplitude,freq],haven't integrate Haptic player 1.1";
                    }
                }
            } else {
                str = "The system does not support HapticsPlayer";
            }
            Log.e(b, str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
