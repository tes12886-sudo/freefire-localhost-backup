package j.d.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {
    public static final t a;
    public static final t b;
    private static final /* synthetic */ t[] c;

    final enum a extends t {
        a(String str, int i2) {
            super(str, i2, null);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        a = aVar;
        t tVar = new t("STRING", 1) { // from class: j.d.d.t.b
            {
                a aVar2 = null;
            }
        };
        b = tVar;
        c = new t[]{aVar, tVar};
    }

    private t(String str, int i2) {
        super(str, i2);
    }

    /* synthetic */ t(String str, int i2, a aVar) {
        this(str, i2);
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) c.clone();
    }
}
