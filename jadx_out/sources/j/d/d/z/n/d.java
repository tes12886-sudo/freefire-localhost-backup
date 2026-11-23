package j.d.d.z.n;

import j.d.d.s;
import j.d.d.w;
import j.d.d.x;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class d<T extends Date> extends w<T> {
    private final b<T> a;
    private final List<DateFormat> b;

    public static abstract class b<T extends Date> {
        public static final b<Date> b = new a(Date.class);
        private final Class<T> a;

        class a extends b<Date> {
            a(Class cls) {
                super(cls);
            }

            @Override // j.d.d.z.n.d.b
            protected Date d(Date date) {
                return date;
            }
        }

        protected b(Class<T> cls) {
            this.a = cls;
        }

        private final x c(d<T> dVar) {
            return n.b(this.a, dVar);
        }

        public final x a(int i2, int i3) {
            return c(new d<>(this, i2, i3));
        }

        public final x b(String str) {
            return c(new d<>(this, str));
        }

        protected abstract T d(Date date);
    }

    private d(b<T> bVar, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        j.d.d.z.a.b(bVar);
        this.a = bVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i2, i3, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i2, i3));
        }
        if (j.d.d.z.e.d()) {
            arrayList.add(j.d.d.z.j.c(i2, i3));
        }
    }

    private d(b<T> bVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        j.d.d.z.a.b(bVar);
        this.a = bVar;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    private Date e(j.d.d.b0.a aVar) throws IOException {
        String strL0 = aVar.l0();
        synchronized (this.b) {
            Iterator<DateFormat> it = this.b.iterator();
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
    public T b(j.d.d.b0.a aVar) throws IOException {
        if (aVar.n0() == j.d.d.b0.b.NULL) {
            aVar.j0();
            return null;
        }
        return (T) this.a.d(e(aVar));
    }

    @Override // j.d.d.w
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void d(j.d.d.b0.c cVar, Date date) throws IOException {
        String str;
        if (date == null) {
            cVar.b0();
            return;
        }
        DateFormat dateFormat = this.b.get(0);
        synchronized (this.b) {
            str = dateFormat.format(date);
        }
        cVar.o0(str);
    }

    public String toString() {
        StringBuilder sb;
        String simpleName;
        DateFormat dateFormat = this.b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            sb = new StringBuilder();
            sb.append("DefaultDateTypeAdapter(");
            simpleName = ((SimpleDateFormat) dateFormat).toPattern();
        } else {
            sb = new StringBuilder();
            sb.append("DefaultDateTypeAdapter(");
            simpleName = dateFormat.getClass().getSimpleName();
        }
        sb.append(simpleName);
        sb.append(')');
        return sb.toString();
    }
}
