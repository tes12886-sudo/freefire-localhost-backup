package j.d.c;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class b {

    class a extends ThreadLocal<Charset> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Charset initialValue() {
            return Charset.forName("UTF-8");
        }
    }

    static {
        new a();
    }
}
