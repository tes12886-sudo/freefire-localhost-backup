package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    public static class a {
        private com.google.android.datatransport.h.z.a a;
        private Map<com.google.android.datatransport.d, b> b = new HashMap();

        public a a(com.google.android.datatransport.d dVar, b bVar) {
            this.b.put(dVar, bVar);
            return this;
        }

        public n b() {
            if (this.a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.b.keySet().size() < com.google.android.datatransport.d.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map<com.google.android.datatransport.d, b> map = this.b;
            this.b = new HashMap();
            return n.d(this.a, map);
        }

        public a c(com.google.android.datatransport.h.z.a aVar) {
            this.a = aVar;
            return this;
        }
    }

    public static abstract class b {

        public static abstract class a {
            public abstract b a();

            public abstract a b(long j2);

            public abstract a c(Set<c> set);

            public abstract a d(long j2);
        }

        public static a a() {
            l.b bVar = new l.b();
            bVar.c(Collections.emptySet());
            return bVar;
        }

        abstract long b();

        abstract Set<c> c();

        abstract long d();
    }

    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i2, long j2) {
        int i3 = i2 - 1;
        double dMax = Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * ((long) i3)));
        double dPow = Math.pow(3.0d, i3);
        double d = j2;
        Double.isNaN(d);
        return (long) (dPow * d * dMax);
    }

    public static a b() {
        return new a();
    }

    static n d(com.google.android.datatransport.h.z.a aVar, Map<com.google.android.datatransport.d, b> map) {
        return new k(aVar, map);
    }

    public static n f(com.google.android.datatransport.h.z.a aVar) {
        a aVarB = b();
        com.google.android.datatransport.d dVar = com.google.android.datatransport.d.DEFAULT;
        b.a aVarA = b.a();
        aVarA.b(30000L);
        aVarA.d(86400000L);
        aVarB.a(dVar, aVarA.a());
        com.google.android.datatransport.d dVar2 = com.google.android.datatransport.d.HIGHEST;
        b.a aVarA2 = b.a();
        aVarA2.b(1000L);
        aVarA2.d(86400000L);
        aVarB.a(dVar2, aVarA2.a());
        com.google.android.datatransport.d dVar3 = com.google.android.datatransport.d.VERY_LOW;
        b.a aVarA3 = b.a();
        aVarA3.b(86400000L);
        aVarA3.d(86400000L);
        aVarA3.c(i(c.NETWORK_UNMETERED, c.DEVICE_IDLE));
        aVarB.a(dVar3, aVarA3.a());
        aVarB.c(aVar);
        return aVarB.b();
    }

    private static <T> Set<T> i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    private void j(JobInfo.Builder builder, Set<c> set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public JobInfo.Builder c(JobInfo.Builder builder, com.google.android.datatransport.d dVar, long j2, int i2) {
        builder.setMinimumLatency(g(dVar, j2, i2));
        j(builder, h().get(dVar).c());
        return builder;
    }

    abstract com.google.android.datatransport.h.z.a e();

    public long g(com.google.android.datatransport.d dVar, long j2, int i2) {
        long jA = j2 - e().a();
        b bVar = h().get(dVar);
        return Math.min(Math.max(a(i2, bVar.b()), jA), bVar.d());
    }

    abstract Map<com.google.android.datatransport.d, b> h();
}
