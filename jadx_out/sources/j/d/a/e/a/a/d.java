package j.d.a.e.a.a;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public class d {

    private static class a implements g {
        private Messenger a;

        public a(Messenger messenger) {
            this.a = messenger;
        }

        private void a(int i2, Bundle bundle) {
            Message messageObtain = Message.obtain((Handler) null, i2);
            messageObtain.setData(bundle);
            try {
                this.a.send(messageObtain);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        @Override // j.d.a.e.a.a.g
        public void onClientUpdated(Messenger messenger) {
            Bundle bundle = new Bundle(1);
            bundle.putParcelable(j.d.a.e.a.a.i.g.EXTRA_MESSAGE_HANDLER, messenger);
            a(6, bundle);
        }

        @Override // j.d.a.e.a.a.g
        public void requestAbortDownload() {
            a(1, new Bundle());
        }

        @Override // j.d.a.e.a.a.g
        public void requestContinueDownload() {
            a(4, new Bundle());
        }

        @Override // j.d.a.e.a.a.g
        public void requestDownloadStatus() {
            a(5, new Bundle());
        }

        @Override // j.d.a.e.a.a.g
        public void requestPauseDownload() {
            a(2, new Bundle());
        }

        @Override // j.d.a.e.a.a.g
        public void setDownloadFlags(int i2) {
            Bundle bundle = new Bundle();
            bundle.putInt("flags", i2);
            a(3, bundle);
        }
    }

    private static class b implements h {
        private g a;
        final Messenger b = new Messenger(new a());

        class a extends Handler {
            a() {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                switch (message.what) {
                    case 1:
                        b.this.a.requestAbortDownload();
                        break;
                    case 2:
                        b.this.a.requestPauseDownload();
                        break;
                    case 3:
                        b.this.a.setDownloadFlags(message.getData().getInt("flags"));
                        break;
                    case 4:
                        b.this.a.requestContinueDownload();
                        break;
                    case 5:
                        b.this.a.requestDownloadStatus();
                        break;
                    case 6:
                        b.this.a.onClientUpdated((Messenger) message.getData().getParcelable(j.d.a.e.a.a.i.g.EXTRA_MESSAGE_HANDLER));
                        break;
                }
            }
        }

        public b(g gVar) {
            this.a = null;
            this.a = gVar;
        }

        @Override // j.d.a.e.a.a.h
        public void a(Context context) {
        }

        @Override // j.d.a.e.a.a.h
        public Messenger b() {
            return this.b;
        }

        @Override // j.d.a.e.a.a.h
        public void c(Context context) {
        }
    }

    public static g a(Messenger messenger) {
        return new a(messenger);
    }

    public static h b(g gVar) {
        return new b(gVar);
    }
}
