package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class w5 implements a6 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Map<Uri, w5> f1152g = new h.f.a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String[] f1153h = {"key", "value"};
    private final ContentResolver a;
    private final Uri b;
    private final ContentObserver c;
    private final Object d;
    private volatile Map<String, String> e;
    private final List<x5> f;

    private w5(ContentResolver contentResolver, Uri uri) {
        u5 u5Var = new u5(this, null);
        this.c = u5Var;
        this.d = new Object();
        this.f = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.a = contentResolver;
        this.b = uri;
        contentResolver.registerContentObserver(uri, false, u5Var);
    }

    public static w5 b(ContentResolver contentResolver, Uri uri) {
        w5 w5Var;
        synchronized (w5.class) {
            Map<Uri, w5> map = f1152g;
            w5Var = map.get(uri);
            if (w5Var == null) {
                try {
                    w5 w5Var2 = new w5(contentResolver, uri);
                    try {
                        map.put(uri, w5Var2);
                    } catch (SecurityException unused) {
                    }
                    w5Var = w5Var2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return w5Var;
    }

    static synchronized void e() {
        for (w5 w5Var : f1152g.values()) {
            w5Var.a.unregisterContentObserver(w5Var.c);
        }
        f1152g.clear();
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final /* bridge */ /* synthetic */ Object a(String str) {
        return c().get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final Map<String, String> c() {
        ?? r0;
        Map<String, String> map;
        Map<String, String> map2 = this.e;
        ?? r1 = map2;
        if (map2 == null) {
            synchronized (this.d) {
                Map<String, String> map3 = this.e;
                r0 = map3;
                if (map3 == null) {
                    ?? AllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            map = (Map) y5.a(new z5(this) { // from class: com.google.android.gms.internal.measurement.t5
                                private final w5 a;

                                {
                                    this.a = this;
                                }

                                @Override // com.google.android.gms.internal.measurement.z5
                                public final Object zza() {
                                    return this.a.f();
                                }
                            });
                            StrictMode.setThreadPolicy(AllowThreadDiskReads);
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(AllowThreadDiskReads);
                            throw th;
                        }
                    } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                        Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                        StrictMode.setThreadPolicy(AllowThreadDiskReads);
                        map = null;
                    }
                    this.e = map;
                    AllowThreadDiskReads = map;
                    r0 = AllowThreadDiskReads;
                }
            }
            r1 = r0;
        }
        return r1 != 0 ? r1 : Collections.emptyMap();
    }

    public final void d() {
        synchronized (this.d) {
            this.e = null;
            p6.c();
        }
        synchronized (this) {
            Iterator<x5> it = this.f.iterator();
            while (it.hasNext()) {
                it.next().zza();
            }
        }
    }

    final /* synthetic */ Map f() {
        Cursor cursorQuery = this.a.query(this.b, f1153h, null, null, null);
        if (cursorQuery == null) {
            return Collections.emptyMap();
        }
        try {
            int count = cursorQuery.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            Map aVar = count <= 256 ? new h.f.a(count) : new HashMap(count, 1.0f);
            while (cursorQuery.moveToNext()) {
                aVar.put(cursorQuery.getString(0), cursorQuery.getString(1));
            }
            return aVar;
        } finally {
            cursorQuery.close();
        }
    }
}
