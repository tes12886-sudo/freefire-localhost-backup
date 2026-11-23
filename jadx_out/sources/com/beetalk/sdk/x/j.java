package com.beetalk.sdk.x;

import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class j {
    public static String a(List<com.beetalk.sdk.z.d> list) {
        if (list == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<com.beetalk.sdk.z.d> it = list.iterator();
        while (it.hasNext()) {
            com.beetalk.sdk.z.d next = it.next();
            sb.append(URLEncoder.encode(next.a, "UTF-8"));
            sb.append("=");
            sb.append(URLEncoder.encode(next.b, "UTF-8"));
            if (it.hasNext()) {
                sb.append("&");
            }
        }
        return sb.toString();
    }

    public static boolean b(String str) {
        return str == null || str.length() == 0;
    }

    public static <T> String c(List<T> list, String str) {
        StringBuilder sb = new StringBuilder("");
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append(String.valueOf(list.get(i2)));
            if (i2 < size - 1) {
                sb.append(str);
            }
        }
        return sb.toString();
    }
}
