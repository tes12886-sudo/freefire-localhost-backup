package j.g.a.a.a.y.i;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static TreeMap<String, String> a(String str, boolean z) {
        String strD;
        String strD2;
        TreeMap<String, String> treeMap = new TreeMap<>();
        if (str == null) {
            return treeMap;
        }
        for (String str2 : str.split("&")) {
            String[] strArrSplit = str2.split("=");
            if (strArrSplit.length == 2) {
                if (z) {
                    strD = d(strArrSplit[0]);
                    strD2 = d(strArrSplit[1]);
                } else {
                    strD = strArrSplit[0];
                    strD2 = strArrSplit[1];
                }
                treeMap.put(strD, strD2);
            } else if (!TextUtils.isEmpty(strArrSplit[0])) {
                treeMap.put(z ? d(strArrSplit[0]) : strArrSplit[0], "");
            }
        }
        return treeMap;
    }

    public static TreeMap<String, String> b(URI uri, boolean z) {
        return a(uri.getRawQuery(), z);
    }

    public static String c(String str) {
        int i2;
        String str2;
        if (str == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String strE = e(str);
        int length = strE.length();
        int i3 = 0;
        while (i3 < length) {
            char cCharAt = strE.charAt(i3);
            if (cCharAt == '*') {
                str2 = "%2A";
            } else {
                if (cCharAt == '+') {
                    str2 = "%20";
                } else if (cCharAt == '%' && (i2 = i3 + 2) < length && strE.charAt(i3 + 1) == '7' && strE.charAt(i2) == 'E') {
                    sb.append('~');
                    i3 = i2;
                } else {
                    sb.append(cCharAt);
                }
                i3++;
            }
            sb.append(str2);
            i3++;
        }
        return sb.toString();
    }

    public static String d(String str) {
        if (str == null) {
            return "";
        }
        try {
            return URLDecoder.decode(str, "UTF8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public static String e(String str) {
        if (str == null) {
            return "";
        }
        try {
            return URLEncoder.encode(str, "UTF8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }
}
