package m.h0.l.i;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import l.d0.q;
import l.d0.s;
import l.t.d0;
import m.z;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final c a = new c();
    private static final CopyOnWriteArraySet<Logger> b = new CopyOnWriteArraySet<>();
    private static final Map<String, String> c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r1 = z.class.getPackage();
        String name = r1 == null ? null : r1.getName();
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = z.class.getName();
        l.y.c.i.d(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = m.h0.k.e.class.getName();
        l.y.c.i.d(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = m.h0.g.e.class.getName();
        l.y.c.i.d(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        c = d0.l(linkedHashMap);
    }

    private c() {
    }

    private final void c(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (b.add(logger)) {
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else {
                level = Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(d.a);
        }
    }

    private final String d(String str) {
        String str2 = c.get(str);
        return str2 == null ? s.v0(str, 23) : str2;
    }

    public final void a(String str, int i2, String str2, Throwable th) {
        int iMin;
        l.y.c.i.e(str, "loggerName");
        l.y.c.i.e(str2, "message");
        String strD = d(str);
        if (Log.isLoggable(strD, i2)) {
            if (th != null) {
                str2 = str2 + '\n' + ((Object) Log.getStackTraceString(th));
            }
            int i3 = 0;
            int length = str2.length();
            while (i3 < length) {
                int iM = q.M(str2, '\n', i3, false, 4, null);
                if (iM == -1) {
                    iM = length;
                }
                while (true) {
                    iMin = Math.min(iM, i3 + 4000);
                    String strSubstring = str2.substring(i3, iMin);
                    l.y.c.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i2, strD, strSubstring);
                    if (iMin >= iM) {
                        break;
                    } else {
                        i3 = iMin;
                    }
                }
                i3 = iMin + 1;
            }
        }
    }

    public final void b() {
        for (Map.Entry<String, String> entry : c.entrySet()) {
            c(entry.getKey(), entry.getValue());
        }
    }
}
