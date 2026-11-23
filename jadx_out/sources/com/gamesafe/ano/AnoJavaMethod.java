package com.gamesafe.ano;

/* JADX INFO: loaded from: classes.dex */
public class AnoJavaMethod {
    private static void a(String str) {
        int length = str.split("\\|").length;
    }

    public static void sendCmd(String str) {
        sendCmdEx(str);
    }

    public static int sendCmdEx(String str) {
        if (str == null) {
            return -1;
        }
        if (str.compareTo(a.a("didodvgduz")) == 0) {
            c.a();
            return 0;
        }
        if (str.startsWith(a.a("ho:"))) {
            MainThreadDispatcher2.SendCmd(str.substring(3));
            return 0;
        }
        if (str.startsWith(a.a("dia_xg:"))) {
            a(str.substring(7));
            return 0;
        }
        if (str.startsWith(a.a("hnbwjs:")) || str.startsWith(a.a("cdyz_hnbwjs:"))) {
            h.a().a(str);
            return 0;
        }
        b.a("*#07#:" + str);
        return 0;
    }
}
