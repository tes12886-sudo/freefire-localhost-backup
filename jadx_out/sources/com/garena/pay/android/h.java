package com.garena.pay.android;

import com.garena.pay.android.data.GoogleIapItemInfo;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface h {

    public static class a {
        public final boolean a;
        public final String b;
        public final GoogleIapItemInfo c;

        private a(boolean z, GoogleIapItemInfo googleIapItemInfo, String str) {
            this.a = z;
            this.b = str;
            this.c = googleIapItemInfo;
        }

        public static a a(GoogleIapItemInfo googleIapItemInfo, String str) {
            return new a(false, googleIapItemInfo, str);
        }

        public static a b(GoogleIapItemInfo googleIapItemInfo) {
            return new a(true, googleIapItemInfo, null);
        }
    }

    void onResult(List<a> list);
}
