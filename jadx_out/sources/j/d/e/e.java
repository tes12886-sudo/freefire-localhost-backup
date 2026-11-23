package j.d.e;

import j.d.e.l.j;
import j.d.e.l.k;
import j.d.e.l.l;
import j.d.e.l.o;
import j.d.e.l.s;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e implements g {

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[j.d.e.a.values().length];
            a = iArr;
            try {
                iArr[j.d.e.a.EAN_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[j.d.e.a.UPC_E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[j.d.e.a.EAN_13.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[j.d.e.a.UPC_A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[j.d.e.a.QR_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[j.d.e.a.CODE_39.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[j.d.e.a.CODE_93.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[j.d.e.a.CODE_128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[j.d.e.a.ITF.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[j.d.e.a.PDF_417.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[j.d.e.a.CODABAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[j.d.e.a.DATA_MATRIX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[j.d.e.a.AZTEC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    @Override // j.d.e.g
    public j.d.e.j.b a(String str, j.d.e.a aVar, int i2, int i3, Map<c, ?> map) {
        g kVar;
        switch (a.a[aVar.ordinal()]) {
            case 1:
                kVar = new k();
                break;
            case 2:
                kVar = new s();
                break;
            case 3:
                kVar = new j();
                break;
            case 4:
                kVar = new o();
                break;
            case 5:
                kVar = new j.d.e.n.a();
                break;
            case 6:
                kVar = new j.d.e.l.f();
                break;
            case 7:
                kVar = new j.d.e.l.h();
                break;
            case 8:
                kVar = new j.d.e.l.d();
                break;
            case 9:
                kVar = new l();
                break;
            case 10:
                kVar = new j.d.e.m.a();
                break;
            case 11:
                kVar = new j.d.e.l.b();
                break;
            case 12:
                kVar = new j.d.e.k.a();
                break;
            case 13:
                kVar = new j.d.e.i.a();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(aVar)));
        }
        return kVar.a(str, aVar, i2, i3, map);
    }
}
