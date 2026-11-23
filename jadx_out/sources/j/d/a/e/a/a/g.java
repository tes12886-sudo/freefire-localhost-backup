package j.d.a.e.a.a;

import android.os.Messenger;

/* JADX INFO: loaded from: classes.dex */
public interface g {
    void onClientUpdated(Messenger messenger);

    void requestAbortDownload();

    void requestContinueDownload();

    void requestDownloadStatus();

    void requestPauseDownload();

    void setDownloadFlags(int i2);
}
