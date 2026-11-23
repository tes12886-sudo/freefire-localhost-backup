package j.g.a.a.a;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class x extends k<r> {

    @j.d.d.y.c("user_name")
    private final String c;

    static class a implements j.g.a.a.a.y.k.d<x> {
        private final j.d.d.e a = new j.d.d.e();

        a() {
        }

        @Override // j.g.a.a.a.y.k.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public x a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                return (x) this.a.k(str, x.class);
            } catch (Exception e) {
                m.g().d("Twitter", e.getMessage());
                return null;
            }
        }

        @Override // j.g.a.a.a.y.k.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String b(x xVar) {
            if (xVar == null || xVar.a() == null) {
                return "";
            }
            try {
                return this.a.t(xVar);
            } catch (Exception e) {
                m.g().d("Twitter", e.getMessage());
                return "";
            }
        }
    }

    public x(r rVar, long j2, String str) {
        super(rVar, j2);
        this.c = str;
    }

    @Override // j.g.a.a.a.k
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        String str = this.c;
        String str2 = ((x) obj).c;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    @Override // j.g.a.a.a.k
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.c;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
