package l.d0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
final class e implements l.c0.c<l.a0.f> {
    private final CharSequence a;
    private final int b;
    private final int c;
    private final l.y.b.p<CharSequence, Integer, l.l<Integer, Integer>> d;

    public static final class a implements Iterator<l.a0.f>, l.y.c.q.a {
        private int a = -1;
        private int b;
        private int c;
        private l.a0.f d;
        private int e;

        a() {
            int iE = l.a0.i.e(e.this.b, 0, e.this.a.length());
            this.b = iE;
            this.c = iE;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0031 A[ADDED_TO_REGION, REMOVE] */
        /* JADX WARN: Code duplicated, block: B:19:0x0094  */
        /* JADX WARN: Code duplicated, block: B:9:0x0023  */
        private final void a() {
            l.l lVar;
            l.a0.f fVar;
            if (this.c < 0) {
                this.a = 0;
                this.d = null;
                return;
            }
            int i2 = -1;
            if (e.this.c > 0) {
                int i3 = this.e + 1;
                this.e = i3;
                if (i3 >= e.this.c) {
                    fVar = new l.a0.f(this.b, q.H(e.this.a));
                    this.d = fVar;
                } else if (this.c > e.this.a.length() && (lVar = (l.l) e.this.d.b(e.this.a, Integer.valueOf(this.c))) != null) {
                    int iIntValue = ((Number) lVar.a()).intValue();
                    int iIntValue2 = ((Number) lVar.b()).intValue();
                    this.d = l.a0.i.i(this.b, iIntValue);
                    int i4 = iIntValue + iIntValue2;
                    this.b = i4;
                    i2 = i4 + (iIntValue2 == 0 ? 1 : 0);
                } else {
                    fVar = new l.a0.f(this.b, q.H(e.this.a));
                    this.d = fVar;
                }
            } else {
                if (this.c > e.this.a.length()) {
                    fVar = new l.a0.f(this.b, q.H(e.this.a));
                } else {
                    int iIntValue3 = ((Number) lVar.a()).intValue();
                    int iIntValue4 = ((Number) lVar.b()).intValue();
                    this.d = l.a0.i.i(this.b, iIntValue3);
                    int i5 = iIntValue3 + iIntValue4;
                    this.b = i5;
                    i2 = i5 + (iIntValue4 == 0 ? 1 : 0);
                }
                this.d = fVar;
            }
            this.c = i2;
            this.a = 1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l.a0.f next() {
            if (this.a == -1) {
                a();
            }
            if (this.a == 0) {
                throw new NoSuchElementException();
            }
            l.a0.f fVar = this.d;
            if (fVar == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.ranges.IntRange");
            }
            this.d = null;
            this.a = -1;
            return fVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.a == -1) {
                a();
            }
            return this.a == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(CharSequence charSequence, int i2, int i3, l.y.b.p<? super CharSequence, ? super Integer, l.l<Integer, Integer>> pVar) {
        l.y.c.i.e(charSequence, "input");
        l.y.c.i.e(pVar, "getNextMatch");
        this.a = charSequence;
        this.b = i2;
        this.c = i3;
        this.d = pVar;
    }

    @Override // l.c0.c
    public Iterator<l.a0.f> iterator() {
        return new a();
    }
}
