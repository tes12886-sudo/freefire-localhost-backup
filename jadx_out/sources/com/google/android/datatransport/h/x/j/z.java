package com.google.android.datatransport.h.x.j;

import com.FF.voiceengine.FFVoiceConst;

/* JADX INFO: loaded from: classes.dex */
abstract class z {
    static final z a;

    static abstract class a {
        a() {
        }

        abstract z a();

        abstract a b(int i2);

        abstract a c(long j2);

        abstract a d(int i2);

        abstract a e(int i2);

        abstract a f(long j2);
    }

    static {
        a aVarA = a();
        aVarA.f(10485760L);
        aVarA.d(j.d.a.e.a.a.i.g.STATUS_SUCCESS);
        aVarA.b(FFVoiceConst.FFVoice_RTC_SERVER_REGION.RTC_EXT_SERVER);
        aVarA.c(604800000L);
        aVarA.e(81920);
        a = aVarA.a();
    }

    z() {
    }

    static a a() {
        return new w.b();
    }

    abstract int b();

    abstract long c();

    abstract int d();

    abstract int e();

    abstract long f();
}
