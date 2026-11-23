package j.g.a.a.a;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class s {
    final Context a;
    final h b;
    final p c;
    final ExecutorService d;
    final Boolean e;

    public static class b {
        private final Context a;
        private h b;
        private p c;
        private ExecutorService d;
        private Boolean e;

        public b(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null.");
            }
            this.a = context.getApplicationContext();
        }

        public s a() {
            return new s(this.a, this.b, this.c, this.d, this.e);
        }

        public b b(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public b c(h hVar) {
            if (hVar == null) {
                throw new IllegalArgumentException("Logger must not be null.");
            }
            this.b = hVar;
            return this;
        }

        public b d(p pVar) {
            if (pVar == null) {
                throw new IllegalArgumentException("TwitterAuthConfig must not be null.");
            }
            this.c = pVar;
            return this;
        }
    }

    private s(Context context, h hVar, p pVar, ExecutorService executorService, Boolean bool) {
        this.a = context;
        this.b = hVar;
        this.c = pVar;
        this.d = executorService;
        this.e = bool;
    }
}
