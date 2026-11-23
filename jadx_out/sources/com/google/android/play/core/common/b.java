package com.google.android.play.core.common;

import android.os.Bundle;
import j.d.a.d.a.b.f;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class b {
    private static final Map<String, Map<String, Integer>> a;

    static {
        new HashSet(Arrays.asList("app_update", "review"));
        new HashSet(Arrays.asList("native", "unity"));
        a = new HashMap();
        new f("PlayCoreVersion");
    }

    public static synchronized Map<String, Integer> a(String str) {
        Map<String, Map<String, Integer>> map;
        map = a;
        if (!map.containsKey(str)) {
            HashMap map2 = new HashMap();
            map2.put("java", 10901);
            map.put(str, map2);
        }
        return map.get(str);
    }

    public static Bundle b(String str) {
        Bundle bundle = new Bundle();
        Map<String, Integer> mapA = a(str);
        bundle.putInt("playcore_version_code", mapA.get("java").intValue());
        if (mapA.containsKey("native")) {
            bundle.putInt("playcore_native_version", mapA.get("native").intValue());
        }
        if (mapA.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", mapA.get("unity").intValue());
        }
        return bundle;
    }
}
