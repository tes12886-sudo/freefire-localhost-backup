package com.facebook.j0.v;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.r;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f675g = new a(null);
    private int a;
    private Long b;
    private j c;
    private final Long d;
    private Long e;
    private UUID f;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }

        public final void a() {
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(r.f()).edit();
            editorEdit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
            editorEdit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
            editorEdit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
            editorEdit.remove("com.facebook.appevents.SessionInfo.sessionId");
            editorEdit.apply();
            j.c.a();
        }

        public final h b() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(r.f());
            long j2 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0L);
            long j3 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0L);
            String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
            if (j2 == 0 || j3 == 0 || string == null) {
                return null;
            }
            h hVar = new h(Long.valueOf(j2), Long.valueOf(j3), null, 4, null);
            hVar.a = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
            hVar.l(j.c.b());
            hVar.i(Long.valueOf(System.currentTimeMillis()));
            UUID uuidFromString = UUID.fromString(string);
            l.y.c.i.d(uuidFromString, "UUID.fromString(sessionIDStr)");
            hVar.j(uuidFromString);
            return hVar;
        }
    }

    public h(Long l2, Long l3, UUID uuid) {
        l.y.c.i.e(uuid, "sessionId");
        this.d = l2;
        this.e = l3;
        this.f = uuid;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ h(Long l2, Long l3, UUID uuid, int i2, l.y.c.f fVar) {
        if ((i2 & 4) != 0) {
            uuid = UUID.randomUUID();
            l.y.c.i.d(uuid, "UUID.randomUUID()");
        }
        this(l2, l3, uuid);
    }

    public final Long b() {
        Long l2 = this.b;
        return Long.valueOf(l2 != null ? l2.longValue() : 0L);
    }

    public final int c() {
        return this.a;
    }

    public final UUID d() {
        return this.f;
    }

    public final Long e() {
        return this.e;
    }

    public final long f() {
        Long l2;
        if (this.d == null || (l2 = this.e) == null) {
            return 0L;
        }
        if (l2 != null) {
            return l2.longValue() - this.d.longValue();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final j g() {
        return this.c;
    }

    public final void h() {
        this.a++;
    }

    public final void i(Long l2) {
        this.b = l2;
    }

    public final void j(UUID uuid) {
        l.y.c.i.e(uuid, "<set-?>");
        this.f = uuid;
    }

    public final void k(Long l2) {
        this.e = l2;
    }

    public final void l(j jVar) {
        this.c = jVar;
    }

    public final void m() {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(r.f()).edit();
        Long l2 = this.d;
        editorEdit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", l2 != null ? l2.longValue() : 0L);
        Long l3 = this.e;
        editorEdit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", l3 != null ? l3.longValue() : 0L);
        editorEdit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.a);
        editorEdit.putString("com.facebook.appevents.SessionInfo.sessionId", this.f.toString());
        editorEdit.apply();
        j jVar = this.c;
        if (jVar == null || jVar == null) {
            return;
        }
        jVar.a();
    }
}
