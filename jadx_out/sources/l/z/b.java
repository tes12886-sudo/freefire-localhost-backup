package l.z;

import java.util.Random;
import l.y.c.i;

/* JADX INFO: loaded from: classes.dex */
public final class b extends l.z.a {
    private final a c = new a();

    public static final class a extends ThreadLocal<Random> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // l.z.a
    public Random f() {
        Random random = this.c.get();
        i.d(random, "implStorage.get()");
        return random;
    }
}
