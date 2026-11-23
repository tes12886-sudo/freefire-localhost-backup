package com.facebook.internal.m0.j;

import com.FF.voiceengine.FFVoiceConst;
import com.facebook.internal.m0.f;
import java.io.File;
import l.y.c.i;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private String a;
    private String b;
    private Long c;

    public a(File file) {
        i.e(file, "file");
        String name = file.getName();
        i.d(name, "file.name");
        this.a = name;
        JSONObject jSONObjectK = f.k(name, true);
        if (jSONObjectK != null) {
            this.c = Long.valueOf(jSONObjectK.optLong("timestamp", 0L));
            this.b = jSONObjectK.optString("error_message", null);
        }
    }

    public a(String str) {
        this.c = Long.valueOf(System.currentTimeMillis() / ((long) FFVoiceConst.FFVoiceEvent.FFVoice_EVENT_EOF));
        this.b = str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("error_log_");
        Long l2 = this.c;
        if (l2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
        }
        stringBuffer.append(l2.longValue());
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        i.d(string, "StringBuffer()\n         …)\n            .toString()");
        this.a = string;
    }

    public final void a() {
        f.a(this.a);
    }

    public final int b(a aVar) {
        i.e(aVar, "data");
        Long l2 = this.c;
        if (l2 == null) {
            return -1;
        }
        long jLongValue = l2.longValue();
        Long l3 = aVar.c;
        if (l3 != null) {
            return (l3.longValue() > jLongValue ? 1 : (l3.longValue() == jLongValue ? 0 : -1));
        }
        return 1;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l2 = this.c;
            if (l2 != null) {
                jSONObject.put("timestamp", l2.longValue());
            }
            jSONObject.put("error_message", this.b);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean d() {
        return (this.b == null || this.c == null) ? false : true;
    }

    public final void e() {
        if (d()) {
            f.m(this.a, toString());
        }
    }

    public String toString() {
        JSONObject jSONObjectC = c();
        if (jSONObjectC == null) {
            return super.toString();
        }
        String string = jSONObjectC.toString();
        i.d(string, "params.toString()");
        return string;
    }
}
