package j.c.a.e.f;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class j {
    private final InputStream a;

    public j(InputStream inputStream) {
        this.a = inputStream;
    }

    private static int a(byte[] bArr) {
        return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
    }

    private byte[] b(int i2) throws IOException {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (true) {
            int i4 = this.a.read(bArr, i3, i2);
            if (i4 <= 0) {
                return null;
            }
            if (i4 >= i2) {
                return bArr;
            }
            i3 += i4;
            i2 -= i4;
        }
    }

    public j.c.a.e.f.l.b c() throws j.c.a.e.f.k.c {
        try {
            int iA = a(b(4));
            byte[] bArrB = b(1);
            return new j.c.a.e.f.l.b(bArrB[0], b(iA - 1));
        } catch (Exception e) {
            throw new j.c.a.e.f.k.c(e);
        }
    }
}
