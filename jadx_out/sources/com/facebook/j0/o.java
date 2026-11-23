package com.facebook.j0;

import android.content.Context;
import android.os.Bundle;
import com.FF.voiceengine.FFVoiceConst;
import com.facebook.internal.h0;
import com.facebook.u;
import java.util.ArrayList;
import java.util.List;
import l.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class o {
    private static final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f646g;
    private List<c> a;
    private final List<c> b;
    private int c;
    private final com.facebook.internal.b d;
    private final String e;

    static {
        String simpleName = o.class.getSimpleName();
        l.y.c.i.d(simpleName, "SessionEventsState::class.java.simpleName");
        f = simpleName;
        f646g = FFVoiceConst.FFVoiceEvent.FFVoice_EVENT_EOF;
    }

    public o(com.facebook.internal.b bVar, String str) {
        l.y.c.i.e(bVar, "attributionIdentifiers");
        l.y.c.i.e(str, "anonymousAppDeviceGUID");
        this.d = bVar;
        this.e = str;
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    private final void f(u uVar, Context context, int i2, JSONArray jSONArray, boolean z) {
        JSONObject jSONObject;
        try {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                jSONObject = com.facebook.j0.v.c.a(com.facebook.j0.v.c.a.CUSTOM_APP_EVENTS, this.d, this.e, z, context);
                if (this.c > 0) {
                    jSONObject.put("num_skipped_events", i2);
                }
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            uVar.E(jSONObject);
            Bundle bundleS = uVar.s();
            String string = jSONArray.toString();
            l.y.c.i.d(string, "events.toString()");
            bundleS.putString("custom_events", string);
            uVar.I(string);
            uVar.G(bundleS);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    public final synchronized void a(c cVar) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            l.y.c.i.e(cVar, "event");
            if (this.a.size() + this.b.size() >= f646g) {
                this.c++;
            } else {
                this.a.add(cVar);
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    public final synchronized void b(boolean z) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        if (z) {
            try {
                this.a.addAll(this.b);
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
                return;
            }
        }
        this.b.clear();
        this.c = 0;
    }

    public final synchronized int c() {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return 0;
        }
        try {
            return this.a.size();
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return 0;
        }
    }

    public final synchronized List<c> d() {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            List<c> list = this.a;
            this.a = new ArrayList();
            return list;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    public final int e(u uVar, Context context, boolean z, boolean z2) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return 0;
        }
        try {
            l.y.c.i.e(uVar, "request");
            l.y.c.i.e(context, "applicationContext");
            synchronized (this) {
                int i2 = this.c;
                com.facebook.j0.s.a.d(this.a);
                this.b.addAll(this.a);
                this.a.clear();
                JSONArray jSONArray = new JSONArray();
                for (c cVar : this.b) {
                    if (!cVar.g()) {
                        h0.f0(f, "Event with invalid checksum: " + cVar);
                    } else if (z || !cVar.h()) {
                        jSONArray.put(cVar.e());
                    }
                }
                if (jSONArray.length() == 0) {
                    return 0;
                }
                s sVar = s.a;
                f(uVar, context, i2, jSONArray, z2);
                return jSONArray.length();
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return 0;
        }
    }
}
