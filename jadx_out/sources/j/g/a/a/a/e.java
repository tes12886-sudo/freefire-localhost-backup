package j.g.a.a.a;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class e extends k<j.g.a.a.a.y.j.a> {

    public static class a implements j.g.a.a.a.y.k.d<e> {
        private final j.d.d.e a;

        public a() {
            j.d.d.f fVar = new j.d.d.f();
            fVar.c(j.g.a.a.a.y.j.a.class, new b());
            this.a = fVar.b();
        }

        @Override // j.g.a.a.a.y.k.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public e a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                return (e) this.a.k(str, e.class);
            } catch (Exception e) {
                m.g().d("Twitter", "Failed to deserialize session " + e.getMessage());
                return null;
            }
        }

        @Override // j.g.a.a.a.y.k.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String b(e eVar) {
            if (eVar == null || eVar.a() == null) {
                return "";
            }
            try {
                return this.a.t(eVar);
            } catch (Exception e) {
                m.g().d("Twitter", "Failed to serialize session " + e.getMessage());
                return "";
            }
        }
    }
}
