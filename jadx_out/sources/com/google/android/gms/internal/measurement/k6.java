package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class k6 extends p6<Boolean> {
    k6(n6 n6Var, String str, Boolean bool, boolean z) {
        super(n6Var, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.p6
    final /* bridge */ /* synthetic */ Boolean a(Object obj) {
        if (q5.c.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (q5.d.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        String strD = super.d();
        String str = (String) obj;
        StringBuilder sb = new StringBuilder(String.valueOf(strD).length() + 28 + str.length());
        sb.append("Invalid boolean value for ");
        sb.append(strD);
        sb.append(": ");
        sb.append(str);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
