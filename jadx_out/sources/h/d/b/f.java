package h.d.b;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    private final g.b.a.b a;
    private final g.b.a.a b;
    private final ComponentName c;
    private final PendingIntent d;

    f(g.b.a.b bVar, g.b.a.a aVar, ComponentName componentName, PendingIntent pendingIntent) {
        this.a = bVar;
        this.b = aVar;
        this.c = componentName;
        this.d = pendingIntent;
    }

    private void a(Bundle bundle) {
        PendingIntent pendingIntent = this.d;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    private Bundle b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        a(bundle2);
        return bundle2;
    }

    IBinder c() {
        return this.b.asBinder();
    }

    ComponentName d() {
        return this.c;
    }

    PendingIntent e() {
        return this.d;
    }

    public boolean f(Uri uri, Bundle bundle, List<Bundle> list) {
        try {
            return this.a.K(this.b, uri, b(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
