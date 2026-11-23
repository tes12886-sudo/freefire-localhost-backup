package com.google.firebase.messaging.d1;

import j.d.a.c.f.g.d0;
import j.d.a.c.f.g.f0;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private final long a;
    private final String b;
    private final String c;
    private final c d;
    private final d e;
    private final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f1459g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f1460h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f1461i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f1462j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f1463k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final b f1464l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f1465m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f1466n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f1467o;

    /* JADX INFO: renamed from: com.google.firebase.messaging.d1.a$a, reason: collision with other inner class name */
    public static final class C0153a {
        private long a = 0;
        private String b = "";
        private String c = "";
        private c d = c.UNKNOWN;
        private d e = d.UNKNOWN_OS;
        private String f = "";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f1468g = "";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f1469h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f1470i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f1471j = "";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f1472k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private b f1473l = b.UNKNOWN_EVENT;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private String f1474m = "";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f1475n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private String f1476o = "";

        C0153a() {
        }

        public a a() {
            return new a(this.a, this.b, this.c, this.d, this.e, this.f, this.f1468g, this.f1469h, this.f1470i, this.f1471j, this.f1472k, this.f1473l, this.f1474m, this.f1475n, this.f1476o);
        }

        public C0153a b(String str) {
            this.f1474m = str;
            return this;
        }

        public C0153a c(String str) {
            this.f1468g = str;
            return this;
        }

        public C0153a d(String str) {
            this.f1476o = str;
            return this;
        }

        public C0153a e(b bVar) {
            this.f1473l = bVar;
            return this;
        }

        public C0153a f(String str) {
            this.c = str;
            return this;
        }

        public C0153a g(String str) {
            this.b = str;
            return this;
        }

        public C0153a h(c cVar) {
            this.d = cVar;
            return this;
        }

        public C0153a i(String str) {
            this.f = str;
            return this;
        }

        public C0153a j(long j2) {
            this.a = j2;
            return this;
        }

        public C0153a k(d dVar) {
            this.e = dVar;
            return this;
        }

        public C0153a l(String str) {
            this.f1471j = str;
            return this;
        }

        public C0153a m(int i2) {
            this.f1470i = i2;
            return this;
        }
    }

    public enum b implements d0 {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);

        private final int a;

        b(int i2) {
            this.a = i2;
        }

        @Override // j.d.a.c.f.g.d0
        public int a() {
            return this.a;
        }
    }

    public enum c implements d0 {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);

        private final int a;

        c(int i2) {
            this.a = i2;
        }

        @Override // j.d.a.c.f.g.d0
        public int a() {
            return this.a;
        }
    }

    public enum d implements d0 {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);

        private final int a;

        d(int i2) {
            this.a = i2;
        }

        @Override // j.d.a.c.f.g.d0
        public int a() {
            return this.a;
        }
    }

    static {
        new C0153a().a();
    }

    a(long j2, String str, String str2, c cVar, d dVar, String str3, String str4, int i2, int i3, String str5, long j3, b bVar, String str6, long j4, String str7) {
        this.a = j2;
        this.b = str;
        this.c = str2;
        this.d = cVar;
        this.e = dVar;
        this.f = str3;
        this.f1459g = str4;
        this.f1460h = i2;
        this.f1461i = i3;
        this.f1462j = str5;
        this.f1463k = j3;
        this.f1464l = bVar;
        this.f1465m = str6;
        this.f1466n = j4;
        this.f1467o = str7;
    }

    public static C0153a p() {
        return new C0153a();
    }

    @f0(zza = 13)
    public String a() {
        return this.f1465m;
    }

    @f0(zza = 11)
    public long b() {
        return this.f1463k;
    }

    @f0(zza = 14)
    public long c() {
        return this.f1466n;
    }

    @f0(zza = 7)
    public String d() {
        return this.f1459g;
    }

    @f0(zza = 15)
    public String e() {
        return this.f1467o;
    }

    @f0(zza = 12)
    public b f() {
        return this.f1464l;
    }

    @f0(zza = 3)
    public String g() {
        return this.c;
    }

    @f0(zza = 2)
    public String h() {
        return this.b;
    }

    @f0(zza = 4)
    public c i() {
        return this.d;
    }

    @f0(zza = 6)
    public String j() {
        return this.f;
    }

    @f0(zza = 8)
    public int k() {
        return this.f1460h;
    }

    @f0(zza = 1)
    public long l() {
        return this.a;
    }

    @f0(zza = 5)
    public d m() {
        return this.e;
    }

    @f0(zza = 10)
    public String n() {
        return this.f1462j;
    }

    @f0(zza = 9)
    public int o() {
        return this.f1461i;
    }
}
