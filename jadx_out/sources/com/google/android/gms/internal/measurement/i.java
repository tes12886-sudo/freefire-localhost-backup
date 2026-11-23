package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i implements q {
    private final Double a;

    public i(Double d) {
        if (d == null) {
            this.a = Double.valueOf(Double.NaN);
        } else {
            this.a = d;
        }
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final String b() {
        if (Double.isNaN(this.a.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.a.doubleValue())) {
            return this.a.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalStripTrailingZeros = BigDecimal.valueOf(this.a.doubleValue()).stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimalStripTrailingZeros.scale() > 0 ? bigDecimalStripTrailingZeros.precision() : bigDecimalStripTrailingZeros.scale()) - 1);
        String str = decimalFormat.format(bigDecimalStripTrailingZeros);
        int iIndexOf = str.indexOf("E");
        if (iIndexOf <= 0) {
            return str;
        }
        int i2 = Integer.parseInt(str.substring(iIndexOf + 1));
        return ((i2 >= 0 || i2 <= -7) && (i2 < 0 || i2 >= 21)) ? str.replace("E-", "e-").replace("E", "e+") : bigDecimalStripTrailingZeros.toPlainString();
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Double c() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Boolean d() {
        boolean z = false;
        if (!Double.isNaN(this.a.doubleValue()) && this.a.doubleValue() != 0.0d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            return this.a.equals(((i) obj).a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Iterator<q> h() {
        return null;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q j() {
        return new i(this.a);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q q(String str, v4 v4Var, List<q> list) {
        if ("toString".equals(str)) {
            return new u(b());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", b(), str));
    }

    public final String toString() {
        return b();
    }
}
