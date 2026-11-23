package j.d.d.z.p;

import j.d.d.e;
import j.d.d.s;
import j.d.d.w;
import j.d.d.x;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes.dex */
final class a extends w<Date> {
    static final x b = new C0245a();
    private final DateFormat a;

    /* JADX INFO: renamed from: j.d.d.z.p.a$a, reason: collision with other inner class name */
    class C0245a implements x {
        C0245a() {
        }

        @Override // j.d.d.x
        public <T> w<T> a(e eVar, j.d.d.a0.a<T> aVar) {
            C0245a c0245a = null;
            if (aVar.getRawType() == Date.class) {
                return new a(c0245a);
            }
            return null;
        }
    }

    private a() {
        this.a = new SimpleDateFormat("MMM d, yyyy");
    }

    /* synthetic */ a(C0245a c0245a) {
        this();
    }

    @Override // j.d.d.w
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Date b(j.d.d.b0.a aVar) throws IOException {
        java.util.Date date;
        if (aVar.n0() == j.d.d.b0.b.NULL) {
            aVar.j0();
            return null;
        }
        String strL0 = aVar.l0();
        try {
            synchronized (this) {
                date = this.a.parse(strL0);
            }
            return new Date(date.getTime());
        } catch (ParseException e) {
            throw new s("Failed parsing '" + strL0 + "' as SQL Date; at path " + aVar.Y(), e);
        }
    }

    @Override // j.d.d.w
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(j.d.d.b0.c cVar, Date date) throws IOException {
        String str;
        if (date == null) {
            cVar.b0();
            return;
        }
        synchronized (this) {
            str = this.a.format((java.util.Date) date);
        }
        cVar.o0(str);
    }
}
