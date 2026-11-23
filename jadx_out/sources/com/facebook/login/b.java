package com.facebook.login;

import android.content.ComponentName;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public class b extends h.d.b.e {
    private static h.d.b.c b;
    private static h.d.b.f c;

    public static h.d.b.f c() {
        h.d.b.f fVar = c;
        c = null;
        return fVar;
    }

    public static void d(Uri uri) {
        if (c == null) {
            e();
        }
        h.d.b.f fVar = c;
        if (fVar != null) {
            fVar.f(uri, null, null);
        }
    }

    private static void e() {
        h.d.b.c cVar;
        if (c != null || (cVar = b) == null) {
            return;
        }
        c = cVar.d(null);
    }

    @Override // h.d.b.e
    public void a(ComponentName componentName, h.d.b.c cVar) {
        b = cVar;
        cVar.f(0L);
        e();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }
}
