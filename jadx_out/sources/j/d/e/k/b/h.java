package j.d.e.k.b;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
final class h {
    private final String a;
    private l b;
    private j.d.e.b c;
    private j.d.e.b d;
    private final StringBuilder e;
    int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f2122g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private k f2123h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f2124i;

    h(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i2 = 0; i2 < length; i2++) {
            char c = (char) (bytes[i2] & 255);
            if (c == '?' && str.charAt(i2) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb.append(c);
        }
        this.a = sb.toString();
        this.b = l.FORCE_NONE;
        this.e = new StringBuilder(str.length());
        this.f2122g = -1;
    }

    private int h() {
        return this.a.length() - this.f2124i;
    }

    public int a() {
        return this.e.length();
    }

    public StringBuilder b() {
        return this.e;
    }

    public char c() {
        return this.a.charAt(this.f);
    }

    public String d() {
        return this.a;
    }

    public int e() {
        return this.f2122g;
    }

    public int f() {
        return h() - this.f;
    }

    public k g() {
        return this.f2123h;
    }

    public boolean i() {
        return this.f < h();
    }

    public void j() {
        this.f2122g = -1;
    }

    public void k() {
        this.f2123h = null;
    }

    public void l(j.d.e.b bVar, j.d.e.b bVar2) {
        this.c = bVar;
        this.d = bVar2;
    }

    public void m(int i2) {
        this.f2124i = i2;
    }

    public void n(l lVar) {
        this.b = lVar;
    }

    public void o(int i2) {
        this.f2122g = i2;
    }

    public void p() {
        q(a());
    }

    public void q(int i2) {
        k kVar = this.f2123h;
        if (kVar == null || i2 > kVar.a()) {
            this.f2123h = k.l(i2, this.b, this.c, this.d, true);
        }
    }

    public void r(char c) {
        this.e.append(c);
    }

    public void s(String str) {
        this.e.append(str);
    }
}
