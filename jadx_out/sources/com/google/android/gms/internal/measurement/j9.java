package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class j9 {
    public static final j9 c;
    public static final j9 d;
    public static final j9 e;
    public static final j9 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j9 f1064g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j9 f1065h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final j9 f1066i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final j9 f1067j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final j9 f1068k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final j9 f1069l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ j9[] f1070m;
    private final Class<?> a;
    private final Object b;

    static {
        j9 j9Var = new j9("VOID", 0, Void.class, Void.class, null);
        c = j9Var;
        Class cls = Integer.TYPE;
        j9 j9Var2 = new j9("INT", 1, cls, Integer.class, 0);
        d = j9Var2;
        j9 j9Var3 = new j9("LONG", 2, Long.TYPE, Long.class, 0L);
        e = j9Var3;
        j9 j9Var4 = new j9("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f = j9Var4;
        j9 j9Var5 = new j9("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f1064g = j9Var5;
        j9 j9Var6 = new j9("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f1065h = j9Var6;
        j9 j9Var7 = new j9("STRING", 6, String.class, String.class, "");
        f1066i = j9Var7;
        j9 j9Var8 = new j9("BYTE_STRING", 7, z7.class, z7.class, z7.b);
        f1067j = j9Var8;
        j9 j9Var9 = new j9("ENUM", 8, cls, Integer.class, null);
        f1068k = j9Var9;
        j9 j9Var10 = new j9("MESSAGE", 9, Object.class, Object.class, null);
        f1069l = j9Var10;
        f1070m = new j9[]{j9Var, j9Var2, j9Var3, j9Var4, j9Var5, j9Var6, j9Var7, j9Var8, j9Var9, j9Var10};
    }

    private j9(String str, int i2, Class cls, Class cls2, Object obj) {
        super(str, i2);
        this.a = cls2;
        this.b = obj;
    }

    public static j9[] values() {
        return (j9[]) f1070m.clone();
    }

    public final Class<?> a() {
        return this.a;
    }
}
