package com.vk.sdk;

import java.util.HashMap;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public class h {
    private static final HashMap<Long, h> b = new HashMap<>();
    private long a = 0;

    public static h a(long j2) {
        return b.get(Long.valueOf(j2));
    }

    public long b() {
        if (b.containsKey(Long.valueOf(this.a))) {
            return this.a;
        }
        Random random = new Random();
        while (true) {
            long jNextLong = random.nextLong();
            HashMap<Long, h> map = b;
            if (!map.containsKey(Long.valueOf(jNextLong)) && jNextLong != 0) {
                map.put(Long.valueOf(jNextLong), this);
                this.a = jNextLong;
                return jNextLong;
            }
        }
    }

    public void c() {
        b.remove(Long.valueOf(this.a));
        this.a = 0L;
    }
}
