package com.facebook.login;

/* JADX INFO: loaded from: classes.dex */
public enum s {
    FACEBOOK("facebook"),
    INSTAGRAM("instagram");

    public static final a e = new a(null);
    private final String a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }

        public final s a(String str) {
            for (s sVar : s.values()) {
                if (l.y.c.i.a(sVar.toString(), str)) {
                    return sVar;
                }
            }
            return s.FACEBOOK;
        }
    }

    s(String str) {
        this.a = str;
    }

    public static final s a(String str) {
        return e.a(str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.a;
    }
}
