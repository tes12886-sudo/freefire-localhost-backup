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
public final class tb {
    public static final tb b;
    public static final tb c;
    public static final tb d;
    public static final tb e;
    public static final tb f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final tb f1135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final tb f1136h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final tb f1137i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final tb f1138j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final tb f1139k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final tb f1140l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final tb f1141m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final tb f1142n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final tb f1143o;
    public static final tb p;
    public static final tb q;
    public static final tb r;
    public static final tb s;
    private static final /* synthetic */ tb[] t;
    private final ub a;

    static {
        tb tbVar = new tb("DOUBLE", 0, ub.DOUBLE, 1);
        b = tbVar;
        tb tbVar2 = new tb("FLOAT", 1, ub.FLOAT, 5);
        c = tbVar2;
        ub ubVar = ub.LONG;
        tb tbVar3 = new tb("INT64", 2, ubVar, 0);
        d = tbVar3;
        tb tbVar4 = new tb("UINT64", 3, ubVar, 0);
        e = tbVar4;
        ub ubVar2 = ub.INT;
        tb tbVar5 = new tb("INT32", 4, ubVar2, 0);
        f = tbVar5;
        tb tbVar6 = new tb("FIXED64", 5, ubVar, 1);
        f1135g = tbVar6;
        tb tbVar7 = new tb("FIXED32", 6, ubVar2, 5);
        f1136h = tbVar7;
        tb tbVar8 = new tb("BOOL", 7, ub.BOOLEAN, 0);
        f1137i = tbVar8;
        tb tbVar9 = new tb("STRING", 8, ub.STRING, 2);
        f1138j = tbVar9;
        ub ubVar3 = ub.MESSAGE;
        tb tbVar10 = new tb("GROUP", 9, ubVar3, 3);
        f1139k = tbVar10;
        tb tbVar11 = new tb("MESSAGE", 10, ubVar3, 2);
        f1140l = tbVar11;
        tb tbVar12 = new tb("BYTES", 11, ub.BYTE_STRING, 2);
        f1141m = tbVar12;
        tb tbVar13 = new tb("UINT32", 12, ubVar2, 0);
        f1142n = tbVar13;
        tb tbVar14 = new tb("ENUM", 13, ub.ENUM, 0);
        f1143o = tbVar14;
        tb tbVar15 = new tb("SFIXED32", 14, ubVar2, 5);
        p = tbVar15;
        tb tbVar16 = new tb("SFIXED64", 15, ubVar, 1);
        q = tbVar16;
        tb tbVar17 = new tb("SINT32", 16, ubVar2, 0);
        r = tbVar17;
        tb tbVar18 = new tb("SINT64", 17, ubVar, 0);
        s = tbVar18;
        t = new tb[]{tbVar, tbVar2, tbVar3, tbVar4, tbVar5, tbVar6, tbVar7, tbVar8, tbVar9, tbVar10, tbVar11, tbVar12, tbVar13, tbVar14, tbVar15, tbVar16, tbVar17, tbVar18};
    }

    private tb(String str, int i2, ub ubVar, int i3) {
        super(str, i2);
        this.a = ubVar;
    }

    public static tb[] values() {
        return (tb[]) t.clone();
    }

    public final ub a() {
        return this.a;
    }
}
