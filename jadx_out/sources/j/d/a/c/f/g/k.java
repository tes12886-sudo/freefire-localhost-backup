package j.d.a.c.f.g;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    private static final f a;

    static {
        e eVar = new e();
        j.a.a(eVar);
        a = eVar.b();
    }

    private k() {
    }

    public static byte[] a(Object obj) {
        f fVar = a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            fVar.a(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    public abstract com.google.firebase.messaging.d1.b b();
}
