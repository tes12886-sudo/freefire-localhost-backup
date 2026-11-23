package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

/* JADX INFO: loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends g.b.b.a.b {
    private final String c;
    private final b d;

    @Override // g.b.b.a.b
    protected void a(int i2, Bundle bundle) {
        MediaSessionCompat.a(bundle);
        if (i2 != 0 || bundle == null || !bundle.containsKey("media_item")) {
            this.d.a(this.c);
            return;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable == null || (parcelable instanceof MediaBrowserCompat$MediaItem)) {
            this.d.b((MediaBrowserCompat$MediaItem) parcelable);
        } else {
            this.d.a(this.c);
        }
    }
}
