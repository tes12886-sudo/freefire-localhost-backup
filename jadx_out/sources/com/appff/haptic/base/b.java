package com.appff.haptic.base;

/* JADX INFO: loaded from: classes.dex */
public class b {
    String a;
    int b;
    int c;
    int d;
    int e;
    public long f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f481h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f480g = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f482i = 0;

    public b(String str, int i2, int i3, int i4, int i5) {
        this.a = str;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public int a() {
        return this.f481h;
    }

    public void a(int i2) {
        this.f481h = i2;
    }

    public String b() {
        return this.a;
    }

    public void b(int i2) {
        this.c = i2;
    }

    public int c() {
        return this.b;
    }

    public void c(int i2) {
        this.d = i2;
    }

    public int d() {
        return this.c;
    }

    public void d(int i2) {
        this.e = i2;
    }

    public int e() {
        return this.d;
    }

    public int f() {
        return this.e;
    }

    public String toString() {
        return "NonFFLooperInfo{mPattern='" + this.a + "', mLooper=" + this.b + ", mInterval=" + this.c + ", mAmplitude=" + this.d + ", mFreq=" + this.e + ", mWhen=" + this.f + ", mValid=" + this.f480g + ", mPatternLastTime=" + this.f481h + ", mHasVibNum=" + this.f482i + '}';
    }
}
