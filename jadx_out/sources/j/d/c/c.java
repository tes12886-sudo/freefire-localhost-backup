package j.d.c;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    private static c a;

    public static c c() {
        if (a == null) {
            a = new d();
        }
        return a;
    }

    public abstract void a(CharSequence charSequence, ByteBuffer byteBuffer);

    public abstract int b(CharSequence charSequence);
}
