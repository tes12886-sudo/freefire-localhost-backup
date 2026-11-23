package androidx.core.content.d;

/* JADX INFO: loaded from: classes.dex */
class a {
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;

    a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f7;
        this.e = f8;
        this.f = f9;
    }

    private static a b(float f, float f2, float f3) {
        float f4 = 1000.0f;
        a aVar = null;
        float f5 = 1000.0f;
        float f6 = 100.0f;
        float f7 = 0.0f;
        while (Math.abs(f7 - f6) > 0.01f) {
            float f8 = ((f6 - f7) / 2.0f) + f7;
            int iP = e(f8, f2, f).p();
            float fB = b.b(iP);
            float fAbs = Math.abs(f3 - fB);
            if (fAbs < 0.2f) {
                a aVarC = c(iP);
                float fA = aVarC.a(e(aVarC.k(), aVarC.i(), f));
                if (fA <= 1.0f) {
                    aVar = aVarC;
                    f4 = fAbs;
                    f5 = fA;
                }
            }
            if (f4 == 0.0f && f5 == 0.0f) {
                break;
            }
            if (fB < f3) {
                f7 = f8;
            } else {
                f6 = f8;
            }
        }
        return aVar;
    }

    static a c(int i2) {
        return d(i2, j.f311k);
    }

    static a d(int i2, j jVar) {
        float[] fArrF = b.f(i2);
        float[][] fArr = b.a;
        float f = (fArrF[0] * fArr[0][0]) + (fArrF[1] * fArr[0][1]) + (fArrF[2] * fArr[0][2]);
        float f2 = (fArrF[0] * fArr[1][0]) + (fArrF[1] * fArr[1][1]) + (fArrF[2] * fArr[1][2]);
        float f3 = (fArrF[0] * fArr[2][0]) + (fArrF[1] * fArr[2][1]) + (fArrF[2] * fArr[2][2]);
        float f4 = jVar.i()[0] * f;
        float f5 = jVar.i()[1] * f2;
        float f6 = jVar.i()[2] * f3;
        double dC = jVar.c() * Math.abs(f4);
        Double.isNaN(dC);
        float fPow = (float) Math.pow(dC / 100.0d, 0.42d);
        double dC2 = jVar.c() * Math.abs(f5);
        Double.isNaN(dC2);
        float fPow2 = (float) Math.pow(dC2 / 100.0d, 0.42d);
        double dC3 = jVar.c() * Math.abs(f6);
        Double.isNaN(dC3);
        float fPow3 = (float) Math.pow(dC3 / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f4) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f5) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f6) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d = fSignum;
        Double.isNaN(d);
        double d2 = fSignum2;
        Double.isNaN(d2);
        double d3 = (d * 11.0d) + (d2 * (-12.0d));
        double d4 = fSignum3;
        Double.isNaN(d4);
        float f7 = ((float) (d3 + d4)) / 11.0f;
        double d5 = fSignum + fSignum2;
        Double.isNaN(d4);
        Double.isNaN(d5);
        float f8 = ((float) (d5 - (d4 * 2.0d))) / 9.0f;
        float f9 = fSignum2 * 20.0f;
        float f10 = (((fSignum * 20.0f) + f9) + (21.0f * fSignum3)) / 20.0f;
        float f11 = (((fSignum * 40.0f) + f9) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f8, f7)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f12 = fAtan2;
        float f13 = (3.1415927f * f12) / 180.0f;
        float fPow4 = ((float) Math.pow((f11 * jVar.f()) / jVar.a(), jVar.b() * jVar.j())) * 100.0f;
        float fD = jVar.d() * (4.0f / jVar.b()) * ((float) Math.sqrt(fPow4 / 100.0f)) * (jVar.a() + 4.0f);
        double d6 = ((double) f12) < 20.14d ? 360.0f + f12 : f12;
        Double.isNaN(d6);
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, jVar.e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((d6 * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * jVar.g()) * jVar.h()) * ((float) Math.sqrt((f7 * f7) + (f8 * f8)))) / (f10 + 0.305f), 0.9d));
        double d7 = fPow4;
        Double.isNaN(d7);
        float fSqrt = fPow5 * ((float) Math.sqrt(d7 / 100.0d));
        float fD2 = fSqrt * jVar.d();
        float fSqrt2 = ((float) Math.sqrt((fPow5 * jVar.b()) / (jVar.a() + 4.0f))) * 50.0f;
        float f14 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((0.0228f * fD2) + 1.0f)) * 43.85965f;
        double d8 = f13;
        return new a(f12, fSqrt, fPow4, fD, fD2, fSqrt2, f14, fLog * ((float) Math.cos(d8)), fLog * ((float) Math.sin(d8)));
    }

    private static a e(float f, float f2, float f3) {
        return f(f, f2, f3, j.f311k);
    }

    private static a f(float f, float f2, float f3, j jVar) {
        float fB = 4.0f / jVar.b();
        double d = f;
        Double.isNaN(d);
        double d2 = d / 100.0d;
        float fSqrt = fB * ((float) Math.sqrt(d2)) * (jVar.a() + 4.0f) * jVar.d();
        float fD = f2 * jVar.d();
        float fSqrt2 = ((float) Math.sqrt(((f2 / ((float) Math.sqrt(d2))) * jVar.b()) / (jVar.a() + 4.0f))) * 50.0f;
        float f4 = (1.7f * f) / ((0.007f * f) + 1.0f);
        double d3 = fD;
        Double.isNaN(d3);
        float fLog = ((float) Math.log((d3 * 0.0228d) + 1.0d)) * 43.85965f;
        double d4 = (3.1415927f * f3) / 180.0f;
        return new a(f3, f2, f, fSqrt, fD, fSqrt2, f4, fLog * ((float) Math.cos(d4)), fLog * ((float) Math.sin(d4)));
    }

    static int m(float f, float f2, float f3) {
        return n(f, f2, f3, j.f311k);
    }

    static int n(float f, float f2, float f3, j jVar) {
        if (f2 < 1.0d || Math.round(f3) <= 0.0d || Math.round(f3) >= 100.0d) {
            return b.a(f3);
        }
        float fMin = f < 0.0f ? 0.0f : Math.min(360.0f, f);
        float f4 = f2;
        a aVar = null;
        float f5 = 0.0f;
        boolean z = true;
        while (Math.abs(f5 - f2) >= 0.4f) {
            a aVarB = b(fMin, f4, f3);
            if (z) {
                if (aVarB != null) {
                    return aVarB.o(jVar);
                }
                z = false;
            } else if (aVarB == null) {
                f2 = f4;
            } else {
                f5 = f4;
                aVar = aVarB;
            }
            f4 = ((f2 - f5) / 2.0f) + f5;
        }
        return aVar == null ? b.a(f3) : aVar.o(jVar);
    }

    float a(a aVar) {
        float fL = l() - aVar.l();
        float fG = g() - aVar.g();
        float fH = h() - aVar.h();
        return (float) (Math.pow(Math.sqrt((fL * fL) + (fG * fG) + (fH * fH)), 0.63d) * 1.41d);
    }

    float g() {
        return this.e;
    }

    float h() {
        return this.f;
    }

    float i() {
        return this.b;
    }

    float j() {
        return this.a;
    }

    float k() {
        return this.c;
    }

    float l() {
        return this.d;
    }

    int o(j jVar) {
        float fSqrt;
        if (i() == 0.0d || k() == 0.0d) {
            fSqrt = 0.0f;
        } else {
            float fI = i();
            double dK = k();
            Double.isNaN(dK);
            fSqrt = fI / ((float) Math.sqrt(dK / 100.0d));
        }
        double d = fSqrt;
        double dPow = Math.pow(1.64d - Math.pow(0.29d, jVar.e()), 0.73d);
        Double.isNaN(d);
        float fPow = (float) Math.pow(d / dPow, 1.1111111111111112d);
        double dJ = (j() * 3.1415927f) / 180.0f;
        Double.isNaN(dJ);
        float fCos = ((float) (Math.cos(2.0d + dJ) + 3.8d)) * 0.25f;
        float fA = jVar.a();
        double dK2 = k();
        Double.isNaN(dK2);
        double dB = jVar.b();
        Double.isNaN(dB);
        double d2 = 1.0d / dB;
        double dJ2 = jVar.j();
        Double.isNaN(dJ2);
        float fPow2 = fA * ((float) Math.pow(dK2 / 100.0d, d2 / dJ2));
        float fG = fCos * 3846.1538f * jVar.g() * jVar.h();
        float f = fPow2 / jVar.f();
        float fSin = (float) Math.sin(dJ);
        float fCos2 = (float) Math.cos(dJ);
        float f2 = (((0.305f + f) * 23.0f) * fPow) / (((fG * 23.0f) + ((11.0f * fPow) * fCos2)) + ((fPow * 108.0f) * fSin));
        float f3 = fCos2 * f2;
        float f4 = f2 * fSin;
        float f5 = f * 460.0f;
        float f6 = (((451.0f * f3) + f5) + (288.0f * f4)) / 1403.0f;
        float f7 = ((f5 - (891.0f * f3)) - (261.0f * f4)) / 1403.0f;
        float f8 = ((f5 - (f3 * 220.0f)) - (f4 * 6300.0f)) / 1403.0f;
        double dAbs = Math.abs(f6);
        Double.isNaN(dAbs);
        double dAbs2 = Math.abs(f6);
        Double.isNaN(dAbs2);
        float fSignum = Math.signum(f6) * (100.0f / jVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (dAbs * 27.13d) / (400.0d - dAbs2)), 2.380952380952381d));
        double dAbs3 = Math.abs(f7);
        Double.isNaN(dAbs3);
        double dAbs4 = Math.abs(f7);
        Double.isNaN(dAbs4);
        float fSignum2 = Math.signum(f7) * (100.0f / jVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (dAbs3 * 27.13d) / (400.0d - dAbs4)), 2.380952380952381d));
        double dAbs5 = Math.abs(f8);
        Double.isNaN(dAbs5);
        double dAbs6 = Math.abs(f8);
        Double.isNaN(dAbs6);
        float fSignum3 = Math.signum(f8) * (100.0f / jVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (dAbs5 * 27.13d) / (400.0d - dAbs6)), 2.380952380952381d));
        float f9 = fSignum / jVar.i()[0];
        float f10 = fSignum2 / jVar.i()[1];
        float f11 = fSignum3 / jVar.i()[2];
        float[][] fArr = b.b;
        return h.h.e.a.a((fArr[0][0] * f9) + (fArr[0][1] * f10) + (fArr[0][2] * f11), (fArr[1][0] * f9) + (fArr[1][1] * f10) + (fArr[1][2] * f11), (f9 * fArr[2][0]) + (f10 * fArr[2][1]) + (f11 * fArr[2][2]));
    }

    int p() {
        return o(j.f311k);
    }
}
