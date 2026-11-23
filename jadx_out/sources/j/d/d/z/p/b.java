package j.d.d.z.p;

import j.d.d.e;
import j.d.d.s;
import j.d.d.w;
import j.d.d.x;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
final class b extends w<Time> {
    static final x b = new a();
    private final DateFormat a;

    class a implements x {
        a() {
        }

        @Override // j.d.d.x
        public <T> w<T> a(e eVar, j.d.d.a0.a<T> aVar) {
            a aVar2 = null;
            if (aVar.getRawType() == Time.class) {
                return new b(aVar2);
            }
            return null;
        }
    }

    private b() {
        this.a = new SimpleDateFormat("hh:mm:ss a");
    }

    /* synthetic */ b(a aVar) {
        this();
    }

    @Override // j.d.d.w
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Time b(j.d.d.b0.a aVar) throws IOException {
        Time time;
        if (aVar.n0() == j.d.d.b0.b.NULL) {
            aVar.j0();
            return null;
        }
        String strL0 = aVar.l0();
        try {
            synchronized (this) {
                time = new Time(this.a.parse(strL0).getTime());
            }
            return time;
        } catch (ParseException e) {
            throw new s("Failed parsing '" + strL0 + "' as SQL Time; at path " + aVar.Y(), e);
        }
    }

    @Override // j.d.d.w
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(j.d.d.b0.c cVar, Time time) throws IOException {
        String str;
        if (time == null) {
            cVar.b0();
            return;
        }
        synchronized (this) {
            str = this.a.format((Date) time);
        }
        cVar.o0(str);
    }
}
