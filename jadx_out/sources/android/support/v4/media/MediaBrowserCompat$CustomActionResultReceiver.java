package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
class MediaBrowserCompat$CustomActionResultReceiver extends g.b.b.a.b {
    private final String c;
    private final Bundle d;
    private final a e;

    @Override // g.b.b.a.b
    protected void a(int i2, Bundle bundle) {
        if (this.e == null) {
            return;
        }
        MediaSessionCompat.a(bundle);
        if (i2 == -1) {
            this.e.a(this.c, this.d, bundle);
            return;
        }
        if (i2 == 0) {
            this.e.c(this.c, this.d, bundle);
            return;
        }
        if (i2 == 1) {
            this.e.b(this.c, this.d, bundle);
            return;
        }
        Log.w("MediaBrowserCompat", "Unknown result code: " + i2 + " (extras=" + this.d + ", resultData=" + bundle + ")");
    }
}
