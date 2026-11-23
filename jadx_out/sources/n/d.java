package n;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public interface d extends x, ReadableByteChannel {
    byte[] B(long j2);

    long J();

    String K(long j2);

    long L(v vVar);

    void P(long j2);

    long U();

    String V(Charset charset);

    InputStream W();

    int X(o oVar);

    b a();

    String i(long j2);

    b n();

    e o(long j2);

    boolean q(long j2);

    byte readByte();

    int readInt();

    short readShort();

    void skip(long j2);

    String v();

    int w();

    boolean z();
}
