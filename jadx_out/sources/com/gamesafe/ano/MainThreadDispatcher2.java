package com.gamesafe.ano;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class MainThreadDispatcher2 {

    static class a implements Runnable {
        private String a;

        public a(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MainThreadDispatcher2.c(this.a);
        }
    }

    public static void SendCmd(String str) {
        if (str.startsWith(com.gamesafe.ano.a.a("npw:"))) {
            c(str.substring(4));
        } else {
            new Handler(Looper.getMainLooper()).post(b(str));
        }
    }

    private static Runnable b(String str) {
        return new a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str) {
        AnoJavaMethod.sendCmd(str);
    }
}
