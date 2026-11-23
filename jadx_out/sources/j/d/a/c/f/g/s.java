package j.d.a.c.f.g;

import com.garena.unity.webview.UnityWebViewActivityProxy;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes.dex */
public final class s {
    static final Logger a = Logger.getLogger(s.class.getName());

    private s() {
    }

    public static void a(@CheckForNull InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        } catch (IOException e) {
            try {
                a.logp(Level.WARNING, "com.google.common.io.Closeables", UnityWebViewActivityProxy.IntentActions.CLOSE, "IOException thrown while closing Closeable.", (Throwable) e);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }
    }
}
