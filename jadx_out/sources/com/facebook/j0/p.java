package com.facebook.j0;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Patterns;
import com.facebook.internal.h0;
import com.facebook.r;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class p {
    private static final String a;
    private static SharedPreferences b;
    private static final AtomicBoolean c;
    private static final ConcurrentHashMap<String, String> d;
    private static final ConcurrentHashMap<String, String> e;
    public static final p f = new p();

    static final class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                p pVar = p.f;
                if (!p.a(pVar).get()) {
                    p.c(pVar);
                }
                p.b(pVar).edit().putString(this.a, this.b).apply();
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    static {
        String simpleName = p.class.getSimpleName();
        l.y.c.i.d(simpleName, "UserDataStore::class.java.simpleName");
        a = simpleName;
        c = new AtomicBoolean(false);
        d = new ConcurrentHashMap<>();
        e = new ConcurrentHashMap<>();
    }

    private p() {
    }

    public static final /* synthetic */ AtomicBoolean a(p pVar) {
        if (com.facebook.internal.m0.i.a.d(p.class)) {
            return null;
        }
        try {
            return c;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, p.class);
            return null;
        }
    }

    public static final /* synthetic */ SharedPreferences b(p pVar) {
        if (com.facebook.internal.m0.i.a.d(p.class)) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = b;
            if (sharedPreferences != null) {
                return sharedPreferences;
            }
            l.y.c.i.q("sharedPreferences");
            throw null;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, p.class);
            return null;
        }
    }

    public static final /* synthetic */ void c(p pVar) {
        if (com.facebook.internal.m0.i.a.d(p.class)) {
            return;
        }
        try {
            pVar.f();
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, p.class);
        }
    }

    public static final String d() {
        if (com.facebook.internal.m0.i.a.d(p.class)) {
            return null;
        }
        try {
            if (!c.get()) {
                f.f();
            }
            HashMap map = new HashMap();
            map.putAll(d);
            map.putAll(f.e());
            return h0.i0(map);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, p.class);
            return null;
        }
    }

    private final Map<String, String> e() {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            Set<String> setB = com.facebook.j0.q.c.e.b();
            for (String str : e.keySet()) {
                if (setB.contains(str)) {
                    map.put(str, e.get(str));
                }
            }
            return map;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    private final synchronized void f() {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = c;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(r.f());
            l.y.c.i.d(defaultSharedPreferences, "PreferenceManager.getDef….getApplicationContext())");
            b = defaultSharedPreferences;
            if (defaultSharedPreferences == null) {
                l.y.c.i.q("sharedPreferences");
                throw null;
            }
            String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "");
            if (string == null) {
                string = "";
            }
            l.y.c.i.d(string, "sharedPreferences.getStr…(USER_DATA_KEY, \"\") ?: \"\"");
            SharedPreferences sharedPreferences = b;
            if (sharedPreferences == null) {
                l.y.c.i.q("sharedPreferences");
                throw null;
            }
            String string2 = sharedPreferences.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
            if (string2 == null) {
                string2 = "";
            }
            l.y.c.i.d(string2, "sharedPreferences.getStr…_USER_DATA_KEY, \"\") ?: \"\"");
            d.putAll(h0.d0(string));
            e.putAll(h0.d0(string2));
            atomicBoolean.set(true);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    public static final void g() {
        if (com.facebook.internal.m0.i.a.d(p.class)) {
            return;
        }
        try {
            if (c.get()) {
                return;
            }
            f.f();
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, p.class);
        }
    }

    private final String h(String str, String str2) {
        String strSubstring;
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            int length = str2.length() - 1;
            int i2 = 0;
            boolean z = false;
            while (i2 <= length) {
                boolean z2 = l.y.c.i.g(str2.charAt(!z ? i2 : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i2++;
                } else {
                    z = true;
                }
            }
            String string = str2.subSequence(i2, length + 1).toString();
            if (string == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = string.toLowerCase();
            l.y.c.i.d(lowerCase, "(this as java.lang.String).toLowerCase()");
            if (l.y.c.i.a("em", str)) {
                if (Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                    return lowerCase;
                }
                Log.e(a, "Setting email failure: this is not a valid email address");
                return "";
            }
            if (l.y.c.i.a("ph", str)) {
                return new l.d0.f("[^0-9]").b(lowerCase, "");
            }
            if (!l.y.c.i.a("ge", str)) {
                return lowerCase;
            }
            if (!(lowerCase.length() > 0)) {
                strSubstring = "";
            } else {
                if (lowerCase == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                strSubstring = lowerCase.substring(0, 1);
                l.y.c.i.d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            if (!l.y.c.i.a("f", strSubstring) && !l.y.c.i.a("m", strSubstring)) {
                Log.e(a, "Setting gender failure: the supported value for gender is f or m");
                return "";
            }
            return strSubstring;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00af A[Catch: all -> 0x011c, TryCatch #0 {all -> 0x011c, blocks: (B:5:0x0009, B:7:0x0016, B:8:0x001b, B:9:0x0023, B:11:0x0029, B:16:0x004d, B:23:0x0062, B:26:0x0068, B:27:0x006b, B:29:0x0085, B:32:0x008f, B:34:0x009a, B:36:0x00a2, B:42:0x00b1, B:45:0x00c3, B:50:0x00d0, B:51:0x00d5, B:58:0x00fe, B:52:0x00d9, B:54:0x00dd, B:56:0x00eb, B:57:0x00f6, B:39:0x00a7, B:40:0x00ae, B:41:0x00af, B:59:0x0109, B:60:0x010e), top: B:65:0x0009 }] */
    public static final void i(Map<String, String> map) {
        String[] strArr;
        String str;
        List<String> listC;
        if (com.facebook.internal.m0.i.a.d(p.class)) {
            return;
        }
        try {
            l.y.c.i.e(map, "ud");
            if (!c.get()) {
                f.f();
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                p pVar = f;
                int length = value.length() - 1;
                int i2 = 0;
                boolean z = false;
                while (i2 <= length) {
                    boolean z2 = l.y.c.i.g(value.charAt(!z ? i2 : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z2) {
                        i2++;
                    } else {
                        z = true;
                    }
                }
                String strC0 = h0.C0(pVar.h(key, value.subSequence(i2, length + 1).toString()));
                ConcurrentHashMap<String, String> concurrentHashMap = e;
                if (concurrentHashMap.containsKey(key)) {
                    String str2 = concurrentHashMap.get(key);
                    if (str2 == null || (listC = new l.d0.f(",").c(str2, 0)) == null) {
                        strArr = new String[0];
                    } else {
                        Object[] array = listC.toArray(new String[0]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                        strArr = (String[]) array;
                        if (strArr == null) {
                            strArr = new String[0];
                        }
                    }
                    Set setD = l.t.h0.d((String[]) Arrays.copyOf(strArr, strArr.length));
                    if (setD.contains(strC0)) {
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    if (strArr.length == 0) {
                        sb.append(strC0);
                        str = "sb.append(value)";
                    } else {
                        if (strArr.length < 5) {
                            sb.append(str2);
                            sb.append(",");
                            sb.append(strC0);
                            str = "sb.append(originalVal).a…_SEPARATOR).append(value)";
                        } else {
                            for (int i3 = 1; i3 < 5; i3++) {
                                sb.append(strArr[i3]);
                                sb.append(",");
                            }
                            sb.append(strC0);
                            setD.remove(strArr[0]);
                        }
                        e.put(key, sb.toString());
                    }
                    l.y.c.i.d(sb, str);
                    e.put(key, sb.toString());
                } else {
                    concurrentHashMap.put(key, strC0);
                }
            }
            f.j("com.facebook.appevents.UserDataStore.internalUserData", h0.i0(e));
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, p.class);
        }
    }

    private final void j(String str, String str2) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            r.n().execute(new a(str, str2));
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }
}
