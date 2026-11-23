package com.google.android.vending.licensing;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class l {
    public int a;
    public int b;
    public String c;
    public String d;
    public String e;
    public long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f1363g;

    public static l a(String str) {
        int iIndexOf = str.indexOf(58);
        String strSubstring = "";
        if (-1 != iIndexOf) {
            String strSubstring2 = str.substring(0, iIndexOf);
            strSubstring = iIndexOf < str.length() ? str.substring(iIndexOf + 1) : "";
            str = strSubstring2;
        }
        String[] strArrSplit = TextUtils.split(str, Pattern.quote("|"));
        if (strArrSplit.length < 6) {
            throw new IllegalArgumentException("Wrong number of fields.");
        }
        l lVar = new l();
        lVar.f1363g = strSubstring;
        lVar.a = Integer.parseInt(strArrSplit[0]);
        lVar.b = Integer.parseInt(strArrSplit[1]);
        lVar.c = strArrSplit[2];
        lVar.d = strArrSplit[3];
        lVar.e = strArrSplit[4];
        lVar.f = Long.parseLong(strArrSplit[5]);
        return lVar;
    }

    public String toString() {
        return TextUtils.join("|", new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d, this.e, Long.valueOf(this.f)});
    }
}
