package j.d.d.z;

import j.d.d.s;
import j.d.d.z.n.n;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    private static final class a extends Writer {
        private final Appendable a;
        private final C0242a b = new C0242a();

        /* JADX INFO: renamed from: j.d.d.z.l$a$a, reason: collision with other inner class name */
        static class C0242a implements CharSequence {
            char[] a;

            C0242a() {
            }

            @Override // java.lang.CharSequence
            public char charAt(int i2) {
                return this.a[i2];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.a.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i2, int i3) {
                return new String(this.a, i2, i3 - i2);
            }
        }

        a(Appendable appendable) {
            this.a = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(int i2) throws IOException {
            this.a.append((char) i2);
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i2, int i3) throws IOException {
            C0242a c0242a = this.b;
            c0242a.a = cArr;
            this.a.append(c0242a, i2, i3 + i2);
        }
    }

    public static j.d.d.k a(j.d.d.b0.a aVar) {
        boolean z;
        try {
            try {
                aVar.n0();
                z = false;
                try {
                    return n.V.b(aVar);
                } catch (EOFException e) {
                    e = e;
                    if (z) {
                        return j.d.d.m.a;
                    }
                    throw new s(e);
                }
            } catch (EOFException e2) {
                e = e2;
                z = true;
            }
        } catch (j.d.d.b0.d e3) {
            throw new s(e3);
        } catch (IOException e4) {
            throw new j.d.d.l(e4);
        } catch (NumberFormatException e5) {
            throw new s(e5);
        }
    }

    public static void b(j.d.d.k kVar, j.d.d.b0.c cVar) {
        n.V.d(cVar, kVar);
    }

    public static Writer c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }
}
