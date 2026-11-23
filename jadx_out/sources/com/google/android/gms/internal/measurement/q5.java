package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class q5 {
    static HashMap<String, String> f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Object f1113k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static boolean f1114l;
    public static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Uri b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    private static final AtomicBoolean e = new AtomicBoolean();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final HashMap<String, Boolean> f1109g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final HashMap<String, Integer> f1110h = new HashMap<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final HashMap<String, Long> f1111i = new HashMap<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final HashMap<String, Float> f1112j = new HashMap<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final String[] f1115m = new String[0];

    public static String a(ContentResolver contentResolver, String str, String str2) {
        synchronized (q5.class) {
            String str3 = null;
            if (f == null) {
                e.set(false);
                f = new HashMap<>();
                f1113k = new Object();
                f1114l = false;
                contentResolver.registerContentObserver(a, true, new p5(null));
            } else if (e.getAndSet(false)) {
                f.clear();
                f1109g.clear();
                f1110h.clear();
                f1111i.clear();
                f1112j.clear();
                f1113k = new Object();
                f1114l = false;
            }
            Object obj = f1113k;
            if (f.containsKey(str)) {
                String str4 = f.get(str);
                if (str4 != null) {
                    str3 = str4;
                }
                return str3;
            }
            int length = f1115m.length;
            Cursor cursorQuery = contentResolver.query(a, null, null, new String[]{str}, null);
            if (cursorQuery == null) {
                return null;
            }
            try {
                if (!cursorQuery.moveToFirst()) {
                    c(obj, str, null);
                    return null;
                }
                String string = cursorQuery.getString(1);
                if (string != null && string.equals(null)) {
                    string = null;
                }
                c(obj, str, string);
                return string != null ? string : null;
            } finally {
                cursorQuery.close();
            }
        }
    }

    private static void c(Object obj, String str, String str2) {
        synchronized (q5.class) {
            if (obj == f1113k) {
                f.put(str, str2);
            }
        }
    }
}
