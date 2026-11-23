package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class t9 implements ba {
    private final ba[] a;

    t9(ba... baVarArr) {
        this.a = baVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.ba
    public final boolean a(Class<?> cls) {
        ba[] baVarArr = this.a;
        for (int i2 = 0; i2 < 2; i2++) {
            if (baVarArr[i2].a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.ba
    public final aa b(Class<?> cls) {
        ba[] baVarArr = this.a;
        for (int i2 = 0; i2 < 2; i2++) {
            ba baVar = baVarArr[i2];
            if (baVar.a(cls)) {
                return baVar.b(cls);
            }
        }
        String strValueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(strValueOf.length() != 0 ? "No factory is available for message type: ".concat(strValueOf) : new String("No factory is available for message type: "));
    }
}
