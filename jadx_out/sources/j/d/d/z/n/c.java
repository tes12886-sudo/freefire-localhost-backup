package j.d.d.z.n;

import j.d.d.s;
import j.d.d.w;
import j.d.d.x;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class c extends w<Date> {
    public static final x b = new a();
    private final List<DateFormat> a;

    class a implements x {
        a() {
        }

        @Override // j.d.d.x
        public <T> w<T> a(j.d.d.e eVar, j.d.d.a0.a<T> aVar) {
            if (aVar.getRawType() == Date.class) {
                return new c();
            }
            return null;
        }
    }

    public c() {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (j.d.d.z.e.d()) {
            arrayList.add(j.d.d.z.j.c(2, 2));
        }
    }

    private Date e(j.d.d.b0.a aVar) throws IOException {
        String strL0 = aVar.l0();
        synchronized (this.a) {
            Iterator<DateFormat> it = this.a.iterator();
            while (it.hasNext()) {
                try {
                    return it.next().parse(strL0);
                } catch (ParseException unused) {
                }
            }
            try {
                return j.d.d.z.n.o.a.c(strL0, new ParsePosition(0));
            } catch (ParseException e) {
                throw new s("Failed parsing '" + strL0 + "' as Date; at path " + aVar.Y(), e);
            }
        }
    }

    @Override // j.d.d.w
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Date b(j.d.d.b0.a aVar) {
        if (aVar.n0() != j.d.d.b0.b.NULL) {
            return e(aVar);
        }
        aVar.j0();
        return null;
    }

    @Override // j.d.d.w
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void d(j.d.d.b0.c cVar, Date date) throws IOException {
        String str;
        if (date == null) {
            cVar.b0();
            return;
        }
        DateFormat dateFormat = this.a.get(0);
        synchronized (this.a) {
            str = dateFormat.format(date);
        }
        cVar.o0(str);
    }
}
