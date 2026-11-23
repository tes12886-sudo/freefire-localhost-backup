package com.google.android.gms.common.l;

import android.util.Log;
import com.google.android.gms.common.internal.i;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private final String a;
    private final String b;
    private final int c;

    public a(String str, String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str2 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str2);
            }
            sb.append("] ");
            string = sb.toString();
        }
        this.b = string;
        this.a = str;
        new i(str);
        int i2 = 2;
        while (i2 <= 7 && !Log.isLoggable(this.a, i2)) {
            i2++;
        }
        this.c = i2;
    }

    public void a(String str, Object... objArr) {
        if (d(3)) {
            Log.d(this.a, c(str, objArr));
        }
    }

    public void b(String str, Object... objArr) {
        Log.e(this.a, c(str, objArr));
    }

    protected String c(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.b.concat(str);
    }

    public boolean d(int i2) {
        return this.c <= i2;
    }
}
