package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class j6 extends p6<Long> {
    j6(n6 n6Var, String str, Long l2, boolean z) {
        super(n6Var, str, l2, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.p6
    final /* bridge */ /* synthetic */ Long a(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            String strD = super.d();
            String str = (String) obj;
            StringBuilder sb = new StringBuilder(String.valueOf(strD).length() + 25 + str.length());
            sb.append("Invalid long value for ");
            sb.append(strD);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}
