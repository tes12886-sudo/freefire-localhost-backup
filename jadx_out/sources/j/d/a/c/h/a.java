package j.d.a.c.h;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.n.c;
import com.google.android.gms.common.util.n;
import com.google.android.gms.common.util.p;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.ThreadSafe;

/* JADX INFO: loaded from: classes.dex */
@ThreadSafe
public class a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static ScheduledExecutorService f1986l;
    private final Object a;
    private final PowerManager.WakeLock b;
    private WorkSource c;
    private final int d;
    private final String e;
    private final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f1987g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1988h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, Integer[]> f1989i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f1990j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private AtomicInteger f1991k;

    public a(Context context, int i2, String str) {
        this(context, i2, str, null, context == null ? null : context.getPackageName());
    }

    private a(Context context, int i2, String str, String str2, String str3) {
        this(context, i2, str, null, str3, null);
    }

    @SuppressLint({"UnwrappedWakeLock"})
    private a(Context context, int i2, String str, String str2, String str3, String str4) {
        this.a = this;
        this.f1988h = true;
        this.f1989i = new HashMap();
        Collections.synchronizedSet(new HashSet());
        this.f1991k = new AtomicInteger(0);
        q.l(context, "WakeLock: context must not be null");
        q.h(str, "WakeLock: wakeLockName must not be empty");
        this.d = i2;
        this.f = null;
        Context applicationContext = context.getApplicationContext();
        this.f1987g = applicationContext;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.e = str;
        } else {
            String strValueOf = String.valueOf(str);
            this.e = strValueOf.length() != 0 ? "*gcore*:".concat(strValueOf) : new String("*gcore*:");
        }
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(i2, str);
        this.b = wakeLockNewWakeLock;
        if (p.e(context)) {
            WorkSource workSourceB = p.b(context, n.a(str3) ? context.getPackageName() : str3);
            this.c = workSourceB;
            if (workSourceB != null && p.e(applicationContext)) {
                WorkSource workSource = this.c;
                if (workSource != null) {
                    workSource.add(workSourceB);
                } else {
                    this.c = workSourceB;
                }
                try {
                    wakeLockNewWakeLock.setWorkSource(this.c);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                    Log.wtf("WakeLock", e.toString());
                }
            }
        }
        if (f1986l == null) {
            f1986l = com.google.android.gms.common.m.a.a().a();
        }
    }

    private final String d(String str) {
        return (!this.f1988h || TextUtils.isEmpty(str)) ? this.f : str;
    }

    private final List<String> e() {
        return p.d(this.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(int i2) {
        if (this.b.isHeld()) {
            try {
                this.b.release();
            } catch (RuntimeException e) {
                if (!e.getClass().equals(RuntimeException.class)) {
                    throw e;
                }
                Log.e("WakeLock", String.valueOf(this.e).concat(" was already released!"), e);
            }
            this.b.isHeld();
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0056 A[Catch: all -> 0x0096, TryCatch #0 {, blocks: (B:4:0x000d, B:6:0x0016, B:11:0x0029, B:13:0x002e, B:15:0x0038, B:22:0x005e, B:23:0x007d, B:16:0x0047, B:18:0x0056, B:20:0x005a, B:8:0x001a, B:10:0x0022), top: B:31:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:22:0x005e A[Catch: all -> 0x0096, TryCatch #0 {, blocks: (B:4:0x000d, B:6:0x0016, B:11:0x0029, B:13:0x002e, B:15:0x0038, B:22:0x005e, B:23:0x007d, B:16:0x0047, B:18:0x0056, B:20:0x005a, B:8:0x001a, B:10:0x0022), top: B:31:0x000d }] */
    public void a(long j2) {
        this.f1991k.incrementAndGet();
        String strD = d(null);
        synchronized (this.a) {
            boolean z = false;
            if ((!this.f1989i.isEmpty() || this.f1990j > 0) && !this.b.isHeld()) {
                this.f1989i.clear();
                this.f1990j = 0;
            }
            if (this.f1988h) {
                Integer[] numArr = this.f1989i.get(strD);
                if (numArr == null) {
                    this.f1989i.put(strD, new Integer[]{1});
                    z = true;
                } else {
                    numArr[0] = Integer.valueOf(numArr[0].intValue() + 1);
                }
                if (z) {
                    c.a().c(this.f1987g, com.google.android.gms.common.n.b.a(this.b, strD), 7, this.e, strD, null, this.d, e(), j2);
                    this.f1990j++;
                } else if (!this.f1988h) {
                    c.a().c(this.f1987g, com.google.android.gms.common.n.b.a(this.b, strD), 7, this.e, strD, null, this.d, e(), j2);
                    this.f1990j++;
                }
            } else if (!this.f1988h && this.f1990j == 0) {
                c.a().c(this.f1987g, com.google.android.gms.common.n.b.a(this.b, strD), 7, this.e, strD, null, this.d, e(), j2);
                this.f1990j++;
            }
        }
        this.b.acquire();
        if (j2 > 0) {
            f1986l.schedule(new b(this), j2, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0052 A[Catch: all -> 0x007e, TryCatch #0 {, blocks: (B:7:0x0021, B:9:0x0027, B:21:0x005a, B:22:0x0079, B:12:0x0033, B:14:0x003b, B:15:0x0042, B:17:0x0052, B:19:0x0056), top: B:30:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x005a A[Catch: all -> 0x007e, TryCatch #0 {, blocks: (B:7:0x0021, B:9:0x0027, B:21:0x005a, B:22:0x0079, B:12:0x0033, B:14:0x003b, B:15:0x0042, B:17:0x0052, B:19:0x0056), top: B:30:0x0021 }] */
    public void b() {
        boolean z;
        if (this.f1991k.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.e).concat(" release without a matched acquire!"));
        }
        String strD = d(null);
        synchronized (this.a) {
            if (this.f1988h) {
                Integer[] numArr = this.f1989i.get(strD);
                if (numArr == null) {
                    z = false;
                } else if (numArr[0].intValue() == 1) {
                    this.f1989i.remove(strD);
                    z = true;
                } else {
                    numArr[0] = Integer.valueOf(numArr[0].intValue() - 1);
                    z = false;
                }
                if (z) {
                    c.a().b(this.f1987g, com.google.android.gms.common.n.b.a(this.b, strD), 8, this.e, strD, null, this.d, e());
                    this.f1990j--;
                } else if (!this.f1988h) {
                    c.a().b(this.f1987g, com.google.android.gms.common.n.b.a(this.b, strD), 8, this.e, strD, null, this.d, e());
                    this.f1990j--;
                }
            } else if (!this.f1988h && this.f1990j == 1) {
                c.a().b(this.f1987g, com.google.android.gms.common.n.b.a(this.b, strD), 8, this.e, strD, null, this.d, e());
                this.f1990j--;
            }
        }
        f(0);
    }

    public void c(boolean z) {
        this.b.setReferenceCounted(z);
        this.f1988h = z;
    }
}
