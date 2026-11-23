package j.g.a.a.a.y.j;

/* JADX INFO: loaded from: classes.dex */
public class a extends f {

    @j.d.d.y.c("guest_token")
    private final String c;

    @Override // j.g.a.a.a.y.j.f
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        String str = this.c;
        String str2 = ((a) obj).c;
        return str == null ? str2 == null : str.equals(str2);
    }

    @Override // j.g.a.a.a.y.j.f
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.c;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
