package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
public final class i<L> {

    public static final class a<L> {
        private final Object a;
        private final String b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b.equals(aVar.b);
        }

        public int hashCode() {
            return (System.identityHashCode(this.a) * 31) + this.b.hashCode();
        }
    }

    public void a() {
    }
}
