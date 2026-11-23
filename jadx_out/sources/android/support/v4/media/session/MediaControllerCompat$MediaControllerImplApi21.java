package android.support.v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class MediaControllerCompat$MediaControllerImplApi21 {
    final Object a;
    private final List<c> b;
    private HashMap<c, a> c;
    final MediaSessionCompat.Token d;

    private static class ExtraBinderRequestResultReceiver extends ResultReceiver {
        private WeakReference<MediaControllerCompat$MediaControllerImplApi21> a;

        @Override // android.os.ResultReceiver
        protected void onReceiveResult(int i2, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = this.a.get();
            if (mediaControllerCompat$MediaControllerImplApi21 == null || bundle == null) {
                return;
            }
            synchronized (mediaControllerCompat$MediaControllerImplApi21.a) {
                mediaControllerCompat$MediaControllerImplApi21.d.b(b.a.j(androidx.core.app.e.a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                mediaControllerCompat$MediaControllerImplApi21.d.c(bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
                mediaControllerCompat$MediaControllerImplApi21.a();
            }
        }
    }

    private static class a extends c.BinderC0004c {
        a(c cVar) {
            super(cVar);
        }

        @Override // android.support.v4.media.session.c.BinderC0004c, android.support.v4.media.session.a
        public void h(CharSequence charSequence) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.c.BinderC0004c, android.support.v4.media.session.a
        public void i() {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.c.BinderC0004c, android.support.v4.media.session.a
        public void k(Bundle bundle) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.c.BinderC0004c, android.support.v4.media.session.a
        public void l(List<MediaSessionCompat.QueueItem> list) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.c.BinderC0004c, android.support.v4.media.session.a
        public void o1(ParcelableVolumeInfo parcelableVolumeInfo) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.c.BinderC0004c, android.support.v4.media.session.a
        public void x(MediaMetadataCompat mediaMetadataCompat) {
            throw new AssertionError();
        }
    }

    void a() {
        if (this.d.a() == null) {
            return;
        }
        for (c cVar : this.b) {
            a aVar = new a(cVar);
            this.c.put(cVar, aVar);
            cVar.c = aVar;
            try {
                this.d.a().u(aVar);
                cVar.i(13, null, null);
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
            }
        }
        this.b.clear();
    }
}
