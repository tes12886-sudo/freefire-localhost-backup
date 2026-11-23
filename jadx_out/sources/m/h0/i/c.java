package m.h0.i;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import l.s;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    private static final a a = new a();
    private static final String[] b;
    private static final DateFormat[] c;

    public static final class a extends ThreadLocal<DateFormat> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(m.h0.d.e);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        b = strArr;
        c = new DateFormat[strArr.length];
    }

    public static final Date a(String str) {
        l.y.c.i.e(str, "<this>");
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date date = a.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return date;
        }
        String[] strArr = b;
        synchronized (strArr) {
            int length = strArr.length;
            int i2 = 0;
            while (i2 < length) {
                int i3 = i2 + 1;
                DateFormat[] dateFormatArr = c;
                DateFormat dateFormat = dateFormatArr[i2];
                DateFormat dateFormat2 = dateFormat;
                if (dateFormat == null) {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(b[i2], Locale.US);
                    simpleDateFormat.setTimeZone(m.h0.d.e);
                    dateFormatArr[i2] = simpleDateFormat;
                    dateFormat2 = simpleDateFormat;
                }
                parsePosition.setIndex(0);
                Date date2 = dateFormat2.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return date2;
                }
                i2 = i3;
            }
            s sVar = s.a;
            return null;
        }
    }

    public static final String b(Date date) {
        l.y.c.i.e(date, "<this>");
        String str = a.get().format(date);
        l.y.c.i.d(str, "STANDARD_DATE_FORMAT.get().format(this)");
        return str;
    }
}
