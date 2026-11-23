package h.a.a;

/* JADX INFO: loaded from: classes.dex */
final class e extends a.e {
    private final h.a.a.g.a a;
    private final long b;

    e(h.a.a.g.a aVar, long j2) {
        if (aVar == null) {
            throw new NullPointerException("Null connectionClient");
        }
        this.a = aVar;
        this.b = j2;
    }

    @Override // h.a.a.a.e
    h.a.a.g.a a() {
        return this.a;
    }

    @Override // h.a.a.a.e
    long b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a.e)) {
            return false;
        }
        a.e eVar = (a.e) obj;
        return this.a.equals(eVar.a()) && this.b == eVar.b();
    }

    public int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j2 = this.b;
        return iHashCode ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "ConnectionPair{connectionClient=" + this.a + ", connectionId=" + this.b + "}";
    }
}
