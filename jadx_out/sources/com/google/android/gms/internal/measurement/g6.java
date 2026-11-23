package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class g6 {
    private static final h.f.a<String, Uri> a = new h.f.a<>();

    public static synchronized Uri a(String str) {
        Uri uri;
        h.f.a<String, Uri> aVar = a;
        uri = aVar.get("com.google.android.gms.measurement");
        if (uri == null) {
            String strValueOf = String.valueOf(Uri.encode("com.google.android.gms.measurement"));
            uri = Uri.parse(strValueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(strValueOf) : new String("content://com.google.android.gms.phenotype/"));
            aVar.put("com.google.android.gms.measurement", uri);
        }
        return uri;
    }
}
