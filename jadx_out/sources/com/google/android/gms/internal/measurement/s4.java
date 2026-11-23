package com.google.android.gms.internal.measurement;

import com.appff.haptic.base.Utils;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s4 extends z8<s4, r4> implements ea {
    public static final /* synthetic */ int zza = 0;
    private static final s4 zzaa;
    private long zzB;
    private int zzC;
    private boolean zzF;
    private int zzI;
    private int zzJ;
    private int zzK;
    private long zzM;
    private long zzN;
    private int zzQ;
    private x4 zzS;
    private long zzU;
    private long zzV;
    private int zzY;
    private boolean zzZ;
    private int zze;
    private int zzf;
    private int zzg;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private int zzs;
    private long zzw;
    private long zzx;
    private boolean zzz;
    private f9<k4> zzh = z8.p();
    private f9<d5> zzi = z8.p();
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";
    private String zzt = "";
    private String zzu = "";
    private String zzv = "";
    private String zzy = "";
    private String zzA = "";
    private String zzD = "";
    private String zzE = "";
    private f9<g4> zzG = z8.p();
    private String zzH = "";
    private String zzL = "";
    private String zzO = "";
    private String zzP = "";
    private String zzR = "";
    private d9 zzT = z8.m();
    private String zzW = "";
    private String zzX = "";

    static {
        s4 s4Var = new s4();
        zzaa = s4Var;
        z8.u(s4.class, s4Var);
    }

    private s4() {
    }

    public static r4 K0() {
        return zzaa.r();
    }

    static /* synthetic */ void M0(s4 s4Var, int i2) {
        s4Var.zze |= 1;
        s4Var.zzg = 1;
    }

    static /* synthetic */ void N0(s4 s4Var, int i2, k4 k4Var) {
        k4Var.getClass();
        s4Var.b1();
        s4Var.zzh.set(i2, k4Var);
    }

    static /* synthetic */ void O0(s4 s4Var, k4 k4Var) {
        k4Var.getClass();
        s4Var.b1();
        s4Var.zzh.add(k4Var);
    }

    static /* synthetic */ void P0(s4 s4Var, Iterable iterable) {
        s4Var.b1();
        l7.j(iterable, s4Var.zzh);
    }

    static /* synthetic */ void R0(s4 s4Var, int i2) {
        s4Var.b1();
        s4Var.zzh.remove(i2);
    }

    static /* synthetic */ void S0(s4 s4Var, int i2, d5 d5Var) {
        d5Var.getClass();
        s4Var.c1();
        s4Var.zzi.set(i2, d5Var);
    }

    static /* synthetic */ void T0(s4 s4Var, d5 d5Var) {
        d5Var.getClass();
        s4Var.c1();
        s4Var.zzi.add(d5Var);
    }

    static /* synthetic */ void U0(s4 s4Var, int i2) {
        s4Var.c1();
        s4Var.zzi.remove(i2);
    }

    static /* synthetic */ void V0(s4 s4Var, long j2) {
        s4Var.zze |= 2;
        s4Var.zzj = j2;
    }

    static /* synthetic */ void W0(s4 s4Var, long j2) {
        s4Var.zze |= 4;
        s4Var.zzk = j2;
    }

    static /* synthetic */ void X0(s4 s4Var, long j2) {
        s4Var.zze |= 8;
        s4Var.zzl = j2;
    }

    static /* synthetic */ void Y0(s4 s4Var, long j2) {
        s4Var.zze |= 16;
        s4Var.zzm = j2;
    }

    static /* synthetic */ void Z0(s4 s4Var) {
        s4Var.zze &= -17;
        s4Var.zzm = 0L;
    }

    static /* synthetic */ void b0(s4 s4Var, long j2) {
        s4Var.zze |= 32;
        s4Var.zzn = j2;
    }

    private final void b1() {
        f9<k4> f9Var = this.zzh;
        if (f9Var.zza()) {
            return;
        }
        this.zzh = z8.q(f9Var);
    }

    static /* synthetic */ void c0(s4 s4Var) {
        s4Var.zze &= -33;
        s4Var.zzn = 0L;
    }

    private final void c1() {
        f9<d5> f9Var = this.zzi;
        if (f9Var.zza()) {
            return;
        }
        this.zzi = z8.q(f9Var);
    }

    static /* synthetic */ void d0(s4 s4Var, String str) {
        s4Var.zze |= 64;
        s4Var.zzo = "android";
    }

    static /* synthetic */ void d1(s4 s4Var, String str) {
        str.getClass();
        s4Var.zze |= 16777216;
        s4Var.zzH = str;
    }

    static /* synthetic */ void e0(s4 s4Var, String str) {
        str.getClass();
        s4Var.zze |= 128;
        s4Var.zzp = str;
    }

    static /* synthetic */ void e1(s4 s4Var, int i2) {
        s4Var.zze |= 33554432;
        s4Var.zzI = i2;
    }

    static /* synthetic */ void f0(s4 s4Var, String str) {
        str.getClass();
        s4Var.zze |= 256;
        s4Var.zzq = str;
    }

    static /* synthetic */ void f1(s4 s4Var) {
        s4Var.zze &= -268435457;
        s4Var.zzL = zzaa.zzL;
    }

    static /* synthetic */ void g0(s4 s4Var, String str) {
        str.getClass();
        s4Var.zze |= 512;
        s4Var.zzr = str;
    }

    static /* synthetic */ void g1(s4 s4Var, long j2) {
        s4Var.zze |= 536870912;
        s4Var.zzM = j2;
    }

    static /* synthetic */ void h0(s4 s4Var, int i2) {
        s4Var.zze |= 1024;
        s4Var.zzs = i2;
    }

    static /* synthetic */ void h1(s4 s4Var, long j2) {
        s4Var.zze |= 1073741824;
        s4Var.zzN = j2;
    }

    static /* synthetic */ void i0(s4 s4Var, String str) {
        str.getClass();
        s4Var.zze |= 2048;
        s4Var.zzt = str;
    }

    static /* synthetic */ void i1(s4 s4Var) {
        s4Var.zze &= Integer.MAX_VALUE;
        s4Var.zzO = zzaa.zzO;
    }

    static /* synthetic */ void j0(s4 s4Var, String str) {
        str.getClass();
        s4Var.zze |= Utils.CONTINUOUS_EVENT;
        s4Var.zzu = str;
    }

    static /* synthetic */ void j1(s4 s4Var, int i2) {
        s4Var.zzf |= 2;
        s4Var.zzQ = i2;
    }

    static /* synthetic */ void k0(s4 s4Var, String str) {
        str.getClass();
        s4Var.zze |= 8192;
        s4Var.zzv = str;
    }

    static /* synthetic */ void k1(s4 s4Var, String str) {
        str.getClass();
        s4Var.zzf |= 4;
        s4Var.zzR = str;
    }

    static /* synthetic */ void l0(s4 s4Var, long j2) {
        s4Var.zze |= 16384;
        s4Var.zzw = j2;
    }

    static /* synthetic */ void l1(s4 s4Var, Iterable iterable) {
        d9 d9Var = s4Var.zzT;
        if (!d9Var.zza()) {
            int size = d9Var.size();
            s4Var.zzT = d9Var.k(size == 0 ? 10 : size + size);
        }
        l7.j(iterable, s4Var.zzT);
    }

    static /* synthetic */ void m0(s4 s4Var, long j2) {
        s4Var.zze |= 32768;
        s4Var.zzx = 42004L;
    }

    static /* synthetic */ void m1(s4 s4Var, long j2) {
        s4Var.zzf |= 16;
        s4Var.zzU = j2;
    }

    static /* synthetic */ void n0(s4 s4Var, String str) {
        str.getClass();
        s4Var.zze |= 65536;
        s4Var.zzy = str;
    }

    static /* synthetic */ void n1(s4 s4Var, long j2) {
        s4Var.zzf |= 32;
        s4Var.zzV = j2;
    }

    static /* synthetic */ void o0(s4 s4Var) {
        s4Var.zze &= -65537;
        s4Var.zzy = zzaa.zzy;
    }

    static /* synthetic */ void o1(s4 s4Var, String str) {
        str.getClass();
        s4Var.zzf |= 64;
        s4Var.zzW = str;
    }

    static /* synthetic */ void p0(s4 s4Var, boolean z) {
        s4Var.zze |= 131072;
        s4Var.zzz = z;
    }

    static /* synthetic */ void p1(s4 s4Var, String str) {
        str.getClass();
        s4Var.zzf |= 128;
        s4Var.zzX = str;
    }

    static /* synthetic */ void q0(s4 s4Var) {
        s4Var.zze &= -131073;
        s4Var.zzz = false;
    }

    static /* synthetic */ void r0(s4 s4Var, String str) {
        str.getClass();
        s4Var.zze |= 262144;
        s4Var.zzA = str;
    }

    static /* synthetic */ void s0(s4 s4Var) {
        s4Var.zze &= -262145;
        s4Var.zzA = zzaa.zzA;
    }

    static /* synthetic */ void t0(s4 s4Var, long j2) {
        s4Var.zze |= 524288;
        s4Var.zzB = j2;
    }

    static /* synthetic */ void u0(s4 s4Var, int i2) {
        s4Var.zze |= 1048576;
        s4Var.zzC = i2;
    }

    static /* synthetic */ void v0(s4 s4Var, String str) {
        s4Var.zze |= 2097152;
        s4Var.zzD = str;
    }

    static /* synthetic */ void w0(s4 s4Var) {
        s4Var.zze &= -2097153;
        s4Var.zzD = zzaa.zzD;
    }

    static /* synthetic */ void x0(s4 s4Var, String str) {
        str.getClass();
        s4Var.zze |= 4194304;
        s4Var.zzE = str;
    }

    static /* synthetic */ void y0(s4 s4Var, boolean z) {
        s4Var.zze |= 8388608;
        s4Var.zzF = z;
    }

    static /* synthetic */ void z0(s4 s4Var, Iterable iterable) {
        f9<g4> f9Var = s4Var.zzG;
        if (!f9Var.zza()) {
            s4Var.zzG = z8.q(f9Var);
        }
        l7.j(iterable, s4Var.zzG);
    }

    public final long A() {
        return this.zzw;
    }

    public final boolean A1() {
        return (this.zze & 8) != 0;
    }

    public final boolean B() {
        return (this.zze & 32768) != 0;
    }

    public final String B0() {
        return this.zzO;
    }

    public final long B1() {
        return this.zzl;
    }

    public final long C() {
        return this.zzx;
    }

    public final boolean C0() {
        return (this.zzf & 2) != 0;
    }

    public final boolean C1() {
        return (this.zze & 16) != 0;
    }

    public final String D() {
        return this.zzy;
    }

    public final int D0() {
        return this.zzQ;
    }

    public final long D1() {
        return this.zzm;
    }

    public final boolean E() {
        return (this.zze & 131072) != 0;
    }

    public final String E0() {
        return this.zzR;
    }

    public final boolean E1() {
        return (this.zze & 32) != 0;
    }

    public final boolean F0() {
        return (this.zzf & 16) != 0;
    }

    public final long F1() {
        return this.zzn;
    }

    public final boolean G() {
        return this.zzz;
    }

    public final long G0() {
        return this.zzU;
    }

    public final String G1() {
        return this.zzo;
    }

    public final String H() {
        return this.zzA;
    }

    public final String H0() {
        return this.zzW;
    }

    public final String H1() {
        return this.zzp;
    }

    public final boolean I() {
        return (this.zze & 524288) != 0;
    }

    public final boolean I0() {
        return (this.zzf & 128) != 0;
    }

    public final String I1() {
        return this.zzq;
    }

    public final long J() {
        return this.zzB;
    }

    public final String J0() {
        return this.zzX;
    }

    public final String J1() {
        return this.zzr;
    }

    public final boolean K() {
        return (this.zze & 1048576) != 0;
    }

    public final boolean K1() {
        return (this.zze & 1024) != 0;
    }

    public final int L() {
        return this.zzC;
    }

    public final int L1() {
        return this.zzs;
    }

    public final String M() {
        return this.zzD;
    }

    public final String M1() {
        return this.zzt;
    }

    public final String N() {
        return this.zzE;
    }

    public final boolean P() {
        return (this.zze & 8388608) != 0;
    }

    public final boolean Q() {
        return this.zzF;
    }

    public final List<g4> R() {
        return this.zzG;
    }

    public final String S() {
        return this.zzH;
    }

    public final boolean U() {
        return (this.zze & 33554432) != 0;
    }

    public final int V() {
        return this.zzI;
    }

    public final boolean W() {
        return (this.zze & 536870912) != 0;
    }

    public final long X() {
        return this.zzM;
    }

    public final boolean Y() {
        return (this.zze & 1073741824) != 0;
    }

    public final long Z() {
        return this.zzN;
    }

    public final boolean a0() {
        return (this.zze & 1) != 0;
    }

    public final int a1() {
        return this.zzg;
    }

    public final List<k4> q1() {
        return this.zzh;
    }

    public final int r1() {
        return this.zzh.size();
    }

    public final k4 s1(int i2) {
        return this.zzh.get(i2);
    }

    public final List<d5> t1() {
        return this.zzi;
    }

    public final int u1() {
        return this.zzi.size();
    }

    public final d5 v1(int i2) {
        return this.zzi.get(i2);
    }

    @Override // com.google.android.gms.internal.measurement.z8
    protected final Object w(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return z8.v(zzaa, "\u0001.\u0000\u0002\u00017.\u0000\u0004\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(7ဇ)", new Object[]{"zze", "zzf", "zzg", "zzh", k4.class, "zzi", d5.class, "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzm", "zzF", "zzG", g4.class, "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", e4.c(), "zzZ"});
        }
        if (i3 == 3) {
            return new s4();
        }
        c4 c4Var = null;
        if (i3 == 4) {
            return new r4(c4Var);
        }
        if (i3 != 5) {
            return null;
        }
        return zzaa;
    }

    public final boolean w1() {
        return (this.zze & 2) != 0;
    }

    public final String x() {
        return this.zzu;
    }

    public final long x1() {
        return this.zzj;
    }

    public final String y() {
        return this.zzv;
    }

    public final boolean y1() {
        return (this.zze & 4) != 0;
    }

    public final boolean z() {
        return (this.zze & 16384) != 0;
    }

    public final long z1() {
        return this.zzk;
    }
}
