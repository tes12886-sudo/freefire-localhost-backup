package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class l6 extends p6<Double> {
    l6(n6 n6Var, String str, Double d, boolean z) {
        super(n6Var, "measurement.test.double_flag", d, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.p6
    final /* bridge */ /* synthetic */ Double a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            String strD = super.d();
            String str = (String) obj;
            StringBuilder sb = new StringBuilder(String.valueOf(strD).length() + 27 + str.length());
            sb.append("Invalid double value for ");
            sb.append(strD);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}
