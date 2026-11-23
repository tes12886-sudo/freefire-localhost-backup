package h.h.h;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
final class h implements g {
    private final LocaleList a;

    h(LocaleList localeList) {
        this.a = localeList;
    }

    @Override // h.h.h.g
    public Object a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return this.a.equals(((g) obj).a());
    }

    @Override // h.h.h.g
    public Locale get(int i2) {
        return this.a.get(i2);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }
}
