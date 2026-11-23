package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class m {
    private final androidx.emoji2.text.p.b a;
    private final char[] b;
    private final a c = new a(1024);
    private final Typeface d;

    static class a {
        private final SparseArray<a> a;
        private h b;

        private a() {
            this(1);
        }

        a(int i2) {
            this.a = new SparseArray<>(i2);
        }

        a a(int i2) {
            SparseArray<a> sparseArray = this.a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i2);
        }

        final h b() {
            return this.b;
        }

        void c(h hVar, int i2, int i3) {
            a aVarA = a(hVar.b(i2));
            if (aVarA == null) {
                aVarA = new a();
                this.a.put(hVar.b(i2), aVarA);
            }
            if (i3 > i2) {
                aVarA.c(hVar, i2 + 1, i3);
            } else {
                aVarA.b = hVar;
            }
        }
    }

    private m(Typeface typeface, androidx.emoji2.text.p.b bVar) {
        this.d = typeface;
        this.a = bVar;
        this.b = new char[bVar.k() * 2];
        a(bVar);
    }

    private void a(androidx.emoji2.text.p.b bVar) {
        int iK = bVar.k();
        for (int i2 = 0; i2 < iK; i2++) {
            h hVar = new h(this, i2);
            Character.toChars(hVar.f(), this.b, i2 * 2);
            h(hVar);
        }
    }

    public static m b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            h.h.h.j.a("EmojiCompat.MetadataRepo.create");
            return new m(typeface, l.b(byteBuffer));
        } finally {
            h.h.h.j.b();
        }
    }

    public char[] c() {
        return this.b;
    }

    public androidx.emoji2.text.p.b d() {
        return this.a;
    }

    int e() {
        return this.a.l();
    }

    a f() {
        return this.c;
    }

    Typeface g() {
        return this.d;
    }

    void h(h hVar) {
        h.h.k.e.g(hVar, "emoji metadata cannot be null");
        h.h.k.e.a(hVar.c() > 0, "invalid metadata codepoint length");
        this.c.c(hVar, 0, hVar.c() - 1);
    }
}
