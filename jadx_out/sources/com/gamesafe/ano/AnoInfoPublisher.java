package com.gamesafe.ano;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class AnoInfoPublisher implements Runnable {
    public static final int ANO_INFO_TYPE_DETECT_RESULT = 1;
    public static final int ANO_INFO_TYPE_HEARTBEAT = 2;
    private static volatile AnoInfoPublisher a;
    private static Thread b;
    private static volatile boolean c;
    private ArrayList d = new ArrayList();

    public interface AnoInfoReceiver {
        void onReceive(int i2, String str);
    }

    private AnoInfoPublisher() {
    }

    private static int a() {
        try {
            return Integer.parseInt(b.c(a.a("dgx_jkzi_kdkz")));
        } catch (Exception unused) {
            return -1;
        }
    }

    private void a(int i2, String str) {
        if (str == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        synchronized (AnoInfoPublisher.class) {
            arrayList.addAll(this.d);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AnoInfoReceiver) it.next()).onReceive(i2, str);
        }
    }

    private static void b() {
        try {
            b.c(a.a("dgx_xgjnz_kdkz"));
        } catch (Exception unused) {
        }
    }

    private static String c() {
        try {
            return b.c(a.a("dgx_mzxq_kdkz"));
        } catch (Exception unused) {
            return "-1";
        }
    }

    public static AnoInfoPublisher getInstance() {
        if (a == null) {
            synchronized (AnoInfoPublisher.class) {
                if (a == null) {
                    a = new AnoInfoPublisher();
                }
            }
        }
        return a;
    }

    public void registAnoInfoReceiver(AnoInfoReceiver anoInfoReceiver) {
        if (anoInfoReceiver == null) {
            return;
        }
        synchronized (AnoInfoPublisher.class) {
            this.d.add(anoInfoReceiver);
        }
        if (c) {
            return;
        }
        synchronized (AnoSdk.class) {
            if (!c) {
                c = true;
                Thread thread = new Thread(getInstance());
                b = thread;
                thread.start();
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int iIndexOf;
        if (a() == -1) {
            c = false;
            return;
        }
        while (true) {
            try {
                try {
                    String strC = c();
                    if (strC == null || strC.equals("-1") || (iIndexOf = strC.indexOf(124)) == -1) {
                        break;
                        break;
                        break;
                    } else {
                        int i2 = Integer.parseInt(strC.substring(0, iIndexOf));
                        if (i2 > 0) {
                            a(i2, strC.substring(iIndexOf + 1));
                        } else {
                            try {
                                Thread.sleep(1000L);
                            } catch (Exception unused) {
                            }
                        }
                    }
                } catch (Exception unused2) {
                }
            } catch (Throwable th) {
                b();
                c = false;
                throw th;
            }
        }
        b();
        c = false;
    }
}
