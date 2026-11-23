package j.d.d;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements j.d.d.d {
    public static final c a;
    public static final c b;
    public static final c c;
    public static final c d;
    public static final c e;
    public static final c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f2050g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ c[] f2051h;

    final enum a extends c {
        a(String str, int i2) {
            super(str, i2, null);
        }

        @Override // j.d.d.d
        public String a(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        a = aVar;
        c cVar = new c("UPPER_CAMEL_CASE", 1) { // from class: j.d.d.c.b
            {
                a aVar2 = null;
            }

            @Override // j.d.d.d
            public String a(Field field) {
                return c.d(field.getName());
            }
        };
        b = cVar;
        c cVar2 = new c("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: j.d.d.c.c
            {
                a aVar2 = null;
            }

            @Override // j.d.d.d
            public String a(Field field) {
                return c.d(c.c(field.getName(), ' '));
            }
        };
        c = cVar2;
        c cVar3 = new c("UPPER_CASE_WITH_UNDERSCORES", 3) { // from class: j.d.d.c.d
            {
                a aVar2 = null;
            }

            @Override // j.d.d.d
            public String a(Field field) {
                return c.c(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        };
        d = cVar3;
        c cVar4 = new c("LOWER_CASE_WITH_UNDERSCORES", 4) { // from class: j.d.d.c.e
            {
                a aVar2 = null;
            }

            @Override // j.d.d.d
            public String a(Field field) {
                return c.c(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        };
        e = cVar4;
        c cVar5 = new c("LOWER_CASE_WITH_DASHES", 5) { // from class: j.d.d.c.f
            {
                a aVar2 = null;
            }

            @Override // j.d.d.d
            public String a(Field field) {
                return c.c(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        };
        f = cVar5;
        c cVar6 = new c("LOWER_CASE_WITH_DOTS", 6) { // from class: j.d.d.c.g
            {
                a aVar2 = null;
            }

            @Override // j.d.d.d
            public String a(Field field) {
                return c.c(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        };
        f2050g = cVar6;
        f2051h = new c[]{aVar, cVar, cVar2, cVar3, cVar4, cVar5, cVar6};
    }

    private c(String str, int i2) {
        super(str, i2);
    }

    /* synthetic */ c(String str, int i2, a aVar) {
        this(str, i2);
    }

    static String c(String str, char c2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(c2);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    static String d(String str) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (Character.isLetter(cCharAt)) {
                if (Character.isUpperCase(cCharAt)) {
                    return str;
                }
                char upperCase = Character.toUpperCase(cCharAt);
                if (i2 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i2) + upperCase + str.substring(i2 + 1);
            }
        }
        return str;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f2051h.clone();
    }
}
