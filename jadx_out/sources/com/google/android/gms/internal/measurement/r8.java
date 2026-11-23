package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'b' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class r8 {
    public static final r8 F;
    public static final r8 G;
    public static final r8 H;
    public static final r8 I;
    public static final r8 J;
    public static final r8 K;
    public static final r8 L;
    public static final r8 M;
    public static final r8 N;
    public static final r8 O;
    public static final r8 P;
    public static final r8 Q;
    public static final r8 R;
    public static final r8 S;
    public static final r8 T;
    public static final r8 U;
    public static final r8 V;
    public static final r8 W;
    public static final r8 X;
    public static final r8 Y;
    public static final r8 Z;
    public static final r8 a0;
    public static final r8 b;
    public static final r8 b0;
    public static final r8 c;
    public static final r8 c0;
    public static final r8 d;
    public static final r8 d0;
    public static final r8 e;
    public static final r8 e0;
    public static final r8 f;
    public static final r8 f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final r8 f1121g;
    public static final r8 g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final r8 f1122h;
    public static final r8 h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final r8 f1123i;
    public static final r8 i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final r8 f1124j;
    private static final r8[] j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final r8 f1125k;
    private static final /* synthetic */ r8[] k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final r8 f1126l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final r8 f1127m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final r8 f1128n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final r8 f1129o;
    public static final r8 p;
    public static final r8 q;
    public static final r8 r;
    public static final r8 s;
    public static final r8 t;
    public static final r8 u;
    public static final r8 v;
    private final int a;

    static {
        j9 j9Var = j9.f1064g;
        b = new r8("DOUBLE", 0, 0, 1, j9Var);
        j9 j9Var2 = j9.f;
        c = new r8("FLOAT", 1, 1, 1, j9Var2);
        j9 j9Var3 = j9.e;
        d = new r8("INT64", 2, 2, 1, j9Var3);
        e = new r8("UINT64", 3, 3, 1, j9Var3);
        j9 j9Var4 = j9.d;
        f = new r8("INT32", 4, 4, 1, j9Var4);
        f1121g = new r8("FIXED64", 5, 5, 1, j9Var3);
        f1122h = new r8("FIXED32", 6, 6, 1, j9Var4);
        j9 j9Var5 = j9.f1065h;
        f1123i = new r8("BOOL", 7, 7, 1, j9Var5);
        j9 j9Var6 = j9.f1066i;
        f1124j = new r8("STRING", 8, 8, 1, j9Var6);
        j9 j9Var7 = j9.f1069l;
        f1125k = new r8("MESSAGE", 9, 9, 1, j9Var7);
        j9 j9Var8 = j9.f1067j;
        f1126l = new r8("BYTES", 10, 10, 1, j9Var8);
        f1127m = new r8("UINT32", 11, 11, 1, j9Var4);
        j9 j9Var9 = j9.f1068k;
        f1128n = new r8("ENUM", 12, 12, 1, j9Var9);
        f1129o = new r8("SFIXED32", 13, 13, 1, j9Var4);
        p = new r8("SFIXED64", 14, 14, 1, j9Var3);
        q = new r8("SINT32", 15, 15, 1, j9Var4);
        r = new r8("SINT64", 16, 16, 1, j9Var3);
        s = new r8("GROUP", 17, 17, 1, j9Var7);
        t = new r8("DOUBLE_LIST", 18, 18, 2, j9Var);
        u = new r8("FLOAT_LIST", 19, 19, 2, j9Var2);
        v = new r8("INT64_LIST", 20, 20, 2, j9Var3);
        F = new r8("UINT64_LIST", 21, 21, 2, j9Var3);
        G = new r8("INT32_LIST", 22, 22, 2, j9Var4);
        H = new r8("FIXED64_LIST", 23, 23, 2, j9Var3);
        I = new r8("FIXED32_LIST", 24, 24, 2, j9Var4);
        J = new r8("BOOL_LIST", 25, 25, 2, j9Var5);
        K = new r8("STRING_LIST", 26, 26, 2, j9Var6);
        L = new r8("MESSAGE_LIST", 27, 27, 2, j9Var7);
        M = new r8("BYTES_LIST", 28, 28, 2, j9Var8);
        N = new r8("UINT32_LIST", 29, 29, 2, j9Var4);
        O = new r8("ENUM_LIST", 30, 30, 2, j9Var9);
        P = new r8("SFIXED32_LIST", 31, 31, 2, j9Var4);
        Q = new r8("SFIXED64_LIST", 32, 32, 2, j9Var3);
        R = new r8("SINT32_LIST", 33, 33, 2, j9Var4);
        S = new r8("SINT64_LIST", 34, 34, 2, j9Var3);
        T = new r8("DOUBLE_LIST_PACKED", 35, 35, 3, j9Var);
        U = new r8("FLOAT_LIST_PACKED", 36, 36, 3, j9Var2);
        V = new r8("INT64_LIST_PACKED", 37, 37, 3, j9Var3);
        W = new r8("UINT64_LIST_PACKED", 38, 38, 3, j9Var3);
        X = new r8("INT32_LIST_PACKED", 39, 39, 3, j9Var4);
        Y = new r8("FIXED64_LIST_PACKED", 40, 40, 3, j9Var3);
        Z = new r8("FIXED32_LIST_PACKED", 41, 41, 3, j9Var4);
        a0 = new r8("BOOL_LIST_PACKED", 42, 42, 3, j9Var5);
        b0 = new r8("UINT32_LIST_PACKED", 43, 43, 3, j9Var4);
        c0 = new r8("ENUM_LIST_PACKED", 44, 44, 3, j9Var9);
        d0 = new r8("SFIXED32_LIST_PACKED", 45, 45, 3, j9Var4);
        j9 j9Var10 = j9.e;
        e0 = new r8("SFIXED64_LIST_PACKED", 46, 46, 3, j9Var10);
        f0 = new r8("SINT32_LIST_PACKED", 47, 47, 3, j9Var4);
        g0 = new r8("SINT64_LIST_PACKED", 48, 48, 3, j9Var10);
        h0 = new r8("GROUP_LIST", 49, 49, 2, j9Var7);
        i0 = new r8("MAP", 50, 50, 4, j9.c);
        k0 = new r8[]{b, c, d, e, f, f1121g, f1122h, f1123i, f1124j, f1125k, f1126l, f1127m, f1128n, f1129o, p, q, r, s, t, u, v, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z, a0, b0, c0, d0, e0, f0, g0, h0, i0};
        r8[] r8VarArrValues = values();
        j0 = new r8[r8VarArrValues.length];
        for (r8 r8Var : r8VarArrValues) {
            j0[r8Var.a] = r8Var;
        }
    }

    private r8(String str, int i2, int i3, int i4, j9 j9Var) {
        super(str, i2);
        this.a = i3;
        j9 j9Var2 = j9.c;
        int i5 = i4 - 1;
        if (i5 == 1 || i5 == 3) {
            j9Var.a();
        }
        if (i4 == 1) {
            j9Var.ordinal();
        }
    }

    public static r8[] values() {
        return (r8[]) k0.clone();
    }

    public final int zza() {
        return this.a;
    }
}
