package j.d.d.z.p;

import j.d.d.e;
import j.d.d.w;
import j.d.d.x;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
class c extends w<Timestamp> {
    static final x b = new a();
    private final w<Date> a;

    class a implements x {
        a() {
        }

        @Override // j.d.d.x
        public <T> w<T> a(e eVar, j.d.d.a0.a<T> aVar) {
            a aVar2 = null;
            if (aVar.getRawType() == Timestamp.class) {
                return new c(eVar.n(Date.class), aVar2);
            }
            return null;
        }
    }

    private c(w<Date> wVar) {
        this.a = wVar;
    }

    /* synthetic */ c(w wVar, a aVar) {
        this(wVar);
    }

    @Override // j.d.d.w
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Timestamp b(j.d.d.b0.a aVar) {
        Date dateB = this.a.b(aVar);
        if (dateB != null) {
            return new Timestamp(dateB.getTime());
        }
        return null;
    }

    @Override // j.d.d.w
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(j.d.d.b0.c cVar, Timestamp timestamp) {
        this.a.d(cVar, timestamp);
    }
}
