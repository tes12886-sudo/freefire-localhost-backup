package com.vk.sdk.m;

import android.net.Uri;
import android.text.TextUtils;
import com.vk.sdk.k.k.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public static String a(Collection<?> collection, String str) {
        return TextUtils.join(str, collection);
    }

    public static String b(Map<String, ?> map) {
        return c(map, false);
    }

    public static String c(Map<String, ?> map, boolean z) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof r) {
                value = ((r) value).u();
            }
            Object[] objArr = new Object[2];
            objArr[0] = entry.getKey();
            String strValueOf = String.valueOf(value);
            if (z) {
                strValueOf = Uri.encode(strValueOf);
            }
            objArr[1] = strValueOf;
            arrayList.add(String.format("%s=%s", objArr));
        }
        return a(arrayList, "&");
    }
}
