package com.appff.haptic.base;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c extends Thread {
    final Context c;
    private final String f = "NonFFThread";
    final Object a = new Object();
    final Object b = new Object();
    volatile boolean d = false;
    List<b> e = new ArrayList();

    public c(Context context) {
        this.c = context;
    }

    long a() {
        return SystemClock.elapsedRealtime();
    }

    public void a(int i2) {
        b bVar;
        long jA;
        synchronized (this.a) {
            synchronized (this.b) {
                int size = this.e.size();
                if (size <= 1) {
                    if (size > 0) {
                        Log.d("NonFFThread", "vibrating ,so interrupt it,size == 1,just set next time play");
                        bVar = this.e.get(0);
                        jA = a();
                    }
                    throw th;
                }
                Log.d("NonFFThread", "vibrating ,so interrupt it,size > 1,remove one");
                this.e.get(1).f480g = false;
                bVar = this.e.get(0);
                jA = a();
                bVar.f = jA + ((long) i2) + 5;
            }
            try {
                this.a.notify();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void a(b bVar) {
        synchronized (this.a) {
            bVar.a(bVar.d() + d.a(this.c).a(bVar.b()));
            bVar.f = 0L;
            synchronized (this.b) {
                if (this.e.size() > 0) {
                    Log.d("NonFFThread", "vibrating ,interrupt it");
                    this.e.get(0).f480g = false;
                }
                this.e.add(0, bVar);
            }
            try {
                this.a.notify();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void b() {
        synchronized (this.a) {
            try {
                synchronized (this.b) {
                    if (this.e.isEmpty()) {
                        return;
                    }
                    b bVar = this.e.get(0);
                    if (bVar.f480g) {
                        bVar.f480g = false;
                    }
                    this.a.notify();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void b(b bVar) {
        synchronized (this.a) {
            synchronized (this.b) {
                if (this.e.isEmpty()) {
                    Log.d("NonFFThread", "vib list is empty,do nothing!!");
                    return;
                }
                int iE = bVar.e();
                b bVar2 = this.e.get(0);
                if (bVar2.f480g) {
                    if (iE != -1) {
                        bVar2.c(iE);
                    }
                    int iD = bVar.d();
                    if (iD != -1) {
                        int iD2 = iD - bVar2.d();
                        int iA = bVar2.a() + iD2;
                        Log.d("NonFFThread", "updateParam interval:" + iD + " pre interval:" + bVar2.d() + " delta:" + iD2 + " duration:" + iA);
                        bVar2.b(iD);
                        bVar2.a(iA);
                    }
                    int iF = bVar.f();
                    if (iF != -1) {
                        bVar2.d(iF);
                    }
                    try {
                        this.a.notify();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public void c() {
        this.d = true;
        synchronized (this.a) {
            try {
                synchronized (this.b) {
                    this.e.clear();
                    this.e = null;
                }
                this.a.notify();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    boolean d() {
        synchronized (this.b) {
            Iterator<b> it = this.e.iterator();
            while (it.hasNext()) {
                if (it.next().f480g) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        b bVar;
        String str;
        String str2;
        String str3 = "NonFFThread";
        String str4 = "non FF thread start!!";
        while (true) {
            Log.d(str3, str4);
            while (true) {
                if (this.d) {
                    Log.d("NonFFThread", "non FF thread quit!");
                    return;
                }
                List<b> list = this.e;
                if (list != null) {
                    if (list.isEmpty() || !d()) {
                        synchronized (this.a) {
                            try {
                                synchronized (this.b) {
                                    try {
                                        this.e.clear();
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                Log.d("NonFFThread", "nothing is in list,just wait!!");
                                this.a.wait();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    } else {
                        long jA = a();
                        bVar = this.e.get(0);
                        if (bVar.f480g) {
                            long j2 = bVar.f;
                            if (j2 > jA) {
                                long j3 = j2 - jA;
                                synchronized (this.a) {
                                    try {
                                        Log.d("NonFFThread", "go to sleep :" + j3);
                                        this.a.wait(j3);
                                    } catch (Exception e2) {
                                        e2.printStackTrace();
                                    }
                                }
                                if (bVar.f482i > bVar.c()) {
                                    str = "NonFFThread";
                                    str2 = " looper finished,remove it!!";
                                }
                            } else {
                                d.a(this.c).b(bVar.b(), bVar.c(), bVar.d(), bVar.e(), bVar.f());
                                bVar.f482i++;
                                Log.d("NonFFThread", " vib mHasVibNum:" + bVar.f482i);
                                if (bVar.f482i >= bVar.c()) {
                                    str = "NonFFThread";
                                    str2 = " wake up vib looper is end ,remove it!!";
                                }
                            }
                            Log.d(str, str2);
                            bVar.f480g = false;
                        } else {
                            continue;
                        }
                    }
                }
            }
            bVar.f = a() + ((long) bVar.a());
            str3 = "NonFFThread";
            str4 = " vib now:" + a() + " mWhen:" + bVar.f + " lastTime:" + bVar.a();
        }
    }
}
