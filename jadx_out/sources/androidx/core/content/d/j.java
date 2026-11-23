package androidx.core.content.d;

/* JADX INFO: loaded from: classes.dex */
final class j {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final j f311k;
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float[] f312g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f313h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f314i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f315j;

    static {
        float[] fArr = b.c;
        double dH = b.h(50.0f);
        Double.isNaN(dH);
        f311k = k(fArr, (float) ((dH * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);
    }

    private j(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f = f;
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = f5;
        this.e = f6;
        this.f312g = fArr;
        this.f313h = f7;
        this.f314i = f8;
        this.f315j = f9;
    }

    static j k(float[] fArr, float f, float f2, float f3, boolean z) {
        float[][] fArr2 = b.a;
        float f4 = (fArr[0] * fArr2[0][0]) + (fArr[1] * fArr2[0][1]) + (fArr[2] * fArr2[0][2]);
        float f5 = (fArr[0] * fArr2[1][0]) + (fArr[1] * fArr2[1][1]) + (fArr[2] * fArr2[1][2]);
        float f6 = (fArr[0] * fArr2[2][0]) + (fArr[1] * fArr2[2][1]) + (fArr[2] * fArr2[2][2]);
        float f7 = (f3 / 10.0f) + 0.8f;
        float fD = ((double) f7) >= 0.9d ? b.d(0.59f, 0.69f, (f7 - 0.9f) * 10.0f) : b.d(0.525f, 0.59f, (f7 - 0.8f) * 10.0f);
        float fExp = z ? 1.0f : (1.0f - (((float) Math.exp(((-f) - 42.0f) / 92.0f)) * 0.2777778f)) * f7;
        double d = fExp;
        if (d > 1.0d) {
            fExp = 1.0f;
        } else if (d < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr3 = {(((100.0f / f4) * fExp) + 1.0f) - fExp, (((100.0f / f5) * fExp) + 1.0f) - fExp, (((100.0f / f6) * fExp) + 1.0f) - fExp};
        float f8 = 1.0f / ((5.0f * f) + 1.0f);
        float f9 = f8 * f8 * f8 * f8;
        float f10 = 1.0f - f9;
        double d2 = f;
        Double.isNaN(d2);
        float fCbrt = (f9 * f) + (0.1f * f10 * f10 * ((float) Math.cbrt(d2 * 5.0d)));
        float fH = b.h(f2) / fArr[1];
        double d3 = fH;
        float fSqrt = ((float) Math.sqrt(d3)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d3, 0.2d));
        double d4 = fArr3[0] * fCbrt * f4;
        Double.isNaN(d4);
        double d5 = fArr3[1] * fCbrt * f5;
        Double.isNaN(d5);
        double d6 = fArr3[2] * fCbrt * f6;
        Double.isNaN(d6);
        float[] fArr4 = {(float) Math.pow(d4 / 100.0d, 0.42d), (float) Math.pow(d5 / 100.0d, 0.42d), (float) Math.pow(d6 / 100.0d, 0.42d)};
        float[] fArr5 = {(fArr4[0] * 400.0f) / (fArr4[0] + 27.13f), (fArr4[1] * 400.0f) / (fArr4[1] + 27.13f), (fArr4[2] * 400.0f) / (fArr4[2] + 27.13f)};
        return new j(fH, ((fArr5[0] * 2.0f) + fArr5[1] + (fArr5[2] * 0.05f)) * fPow, fPow, fPow, fD, f7, fArr3, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    float a() {
        return this.a;
    }

    float b() {
        return this.d;
    }

    float c() {
        return this.f313h;
    }

    float d() {
        return this.f314i;
    }

    float e() {
        return this.f;
    }

    float f() {
        return this.b;
    }

    float g() {
        return this.e;
    }

    float h() {
        return this.c;
    }

    float[] i() {
        return this.f312g;
    }

    float j() {
        return this.f315j;
    }
}
