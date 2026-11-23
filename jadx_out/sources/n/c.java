package n;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes.dex */
public interface c extends v, WritableByteChannel {
    c A(int i2);

    c E(byte[] bArr);

    c G(e eVar);

    c R(String str);

    c S(long j2);

    b a();

    c e(byte[] bArr, int i2, int i3);

    @Override // n.v, java.io.Flushable
    void flush();

    c m(long j2);

    c p(int i2);

    c r(int i2);

    c t(long j2);

    c y(int i2);
}
