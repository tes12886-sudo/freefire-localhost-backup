package n;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class t {
    private static final int b = 65536;
    private static final int d;
    private static final AtomicReference<s>[] e;
    public static final t a = new t();
    private static final s c = new s(new byte[0], 0, 0, false, false);

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        d = iHighestOneBit;
        AtomicReference<s>[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i2 = 0; i2 < iHighestOneBit; i2++) {
            atomicReferenceArr[i2] = new AtomicReference<>();
        }
        e = atomicReferenceArr;
    }

    private t() {
    }

    private final AtomicReference<s> a() {
        return e[(int) (Thread.currentThread().getId() & (((long) d) - 1))];
    }

    public static final void b(s sVar) {
        AtomicReference<s> atomicReferenceA;
        s sVar2;
        l.y.c.i.e(sVar, "segment");
        if (!(sVar.f == null && sVar.f2349g == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (sVar.d || (sVar2 = (atomicReferenceA = a.a()).get()) == c) {
            return;
        }
        int i2 = sVar2 == null ? 0 : sVar2.c;
        if (i2 >= b) {
            return;
        }
        sVar.f = sVar2;
        sVar.b = 0;
        sVar.c = i2 + 8192;
        if (atomicReferenceA.compareAndSet(sVar2, sVar)) {
            return;
        }
        sVar.f = null;
    }

    public static final s c() {
        AtomicReference<s> atomicReferenceA = a.a();
        s sVar = c;
        s andSet = atomicReferenceA.getAndSet(sVar);
        if (andSet == sVar) {
            return new s();
        }
        if (andSet == null) {
            atomicReferenceA.set(null);
            return new s();
        }
        atomicReferenceA.set(andSet.f);
        andSet.f = null;
        andSet.c = 0;
        return andSet;
    }
}
