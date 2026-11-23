package com.gamesafe.ano;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class h {
    private static volatile h d;
    public g.a a = new i(this);
    private g b;
    private String c;

    public static h a() {
        if (d == null) {
            synchronized (h.class) {
                if (d == null) {
                    d = new h();
                }
            }
        }
        return d;
    }

    private void a(Context context, String str, String str2, String str3, g.a aVar) {
        k kVar = new k(context, str, str2, str3, aVar);
        this.b = kVar;
        kVar.a();
    }

    private void a(g gVar, String str) {
        if (gVar != null && this.b == gVar) {
            if (str == null || str.equals(this.c)) {
                this.b = null;
                gVar.c();
            }
        }
    }

    private void b(Context context, String str, String str2, String str3, g.a aVar) {
        String[] strArrSplit = str3.split(";");
        if (strArrSplit == null || strArrSplit.length < 2) {
            b.a(a.a("*#07#:OnnNyfHznnvbzWjs.kvmnzViyNcjr xhy zmm"));
            return;
        }
        String str4 = strArrSplit[0];
        int i2 = Integer.parseInt(strArrSplit[1]);
        int i3 = Integer.parseInt(strArrSplit[2]);
        if (i3 > i2) {
            return;
        }
        d dVar = new d(context, str, str2, str4, i2, i3, aVar);
        this.b = dVar;
        dVar.a();
    }

    private void b(String str) {
        a(this.b, str.substring(12));
    }

    private void c(String str) {
        try {
            d(str);
        } catch (Throwable unused) {
        }
    }

    private void d(String str) {
        String str2;
        if (str.startsWith(a.a("hnbwjs:"))) {
            String[] strArrSplit = str.substring(7).split("\\|");
            if (strArrSplit == null || strArrSplit.length < 8) {
                str2 = "*#07#:OnnNyfHznnvbzWjs.kvmnzViyNcjr xhy zmm";
            } else {
                String str3 = strArrSplit[0];
                String str4 = strArrSplit[1];
                String str5 = strArrSplit[2];
                String str6 = strArrSplit[3];
                String str7 = strArrSplit[4];
                String str8 = strArrSplit[7];
                Activity activityD = c.d();
                if (activityD != null) {
                    if (this.b != null) {
                        if (!str8.equals("1")) {
                            return;
                        } else {
                            a(this.b, (String) null);
                        }
                    }
                    this.c = str3;
                    if (str3.equals("1010")) {
                        a(activityD, str4, str5, str7, this.a);
                        return;
                    } else {
                        if (this.c.equals("1011")) {
                            b(activityD, str4, str5, str6, this.a);
                            return;
                        }
                        return;
                    }
                }
                str2 = "*#07#:bzoXpmmzioVxodqdot avdgzy";
            }
            b.a(a.a(str2));
        }
    }

    public void a(String str) {
        if (str.startsWith(a.a("hnbwjs:"))) {
            c(str);
        } else if (str.startsWith(a.a("cdyz_hnbwjs:"))) {
            b(str);
        }
    }
}
