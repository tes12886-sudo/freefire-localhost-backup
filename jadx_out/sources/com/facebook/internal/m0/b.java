package com.facebook.internal.m0;

import android.os.Build;
import com.FF.voiceengine.FFVoiceConst;
import com.facebook.internal.h0;
import java.io.File;
import l.d0.p;
import l.y.c.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0059b f618h = new C0059b(null);
    private String a;
    private c b;
    private JSONArray c;
    private String d;
    private String e;
    private String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Long f619g;

    public static final class a {
        public static final b a(String str, String str2) {
            return new b(str, str2, (l.y.c.f) null);
        }

        public static final b b(Throwable th, c cVar) {
            i.e(cVar, "t");
            return new b(th, cVar, (l.y.c.f) null);
        }

        public static final b c(JSONArray jSONArray) {
            i.e(jSONArray, "features");
            return new b(jSONArray, (l.y.c.f) null);
        }

        public static final b d(File file) {
            i.e(file, "file");
            return new b(file, (l.y.c.f) null);
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.m0.b$b, reason: collision with other inner class name */
    public static final class C0059b {
        private C0059b() {
        }

        public /* synthetic */ C0059b(l.y.c.f fVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final c b(String str) {
            if (p.x(str, "crash_log_", false, 2, null)) {
                return c.CrashReport;
            }
            if (p.x(str, "shield_log_", false, 2, null)) {
                return c.CrashShield;
            }
            if (p.x(str, "thread_check_log_", false, 2, null)) {
                return c.ThreadCheck;
            }
            if (p.x(str, "analysis_log_", false, 2, null)) {
                return c.Analysis;
            }
            return p.x(str, "anr_log_", false, 2, null) ? c.AnrReport : c.Unknown;
        }
    }

    public enum c {
        Unknown,
        Analysis,
        AnrReport,
        CrashReport,
        CrashShield,
        ThreadCheck;

        public final String a() {
            int i2 = com.facebook.internal.m0.c.b[ordinal()];
            if (i2 == 1) {
                return "analysis_log_";
            }
            if (i2 == 2) {
                return "anr_log_";
            }
            if (i2 == 3) {
                return "crash_log_";
            }
            if (i2 != 4) {
                return i2 != 5 ? "Unknown" : "thread_check_log_";
            }
            return "shield_log_";
        }

        @Override // java.lang.Enum
        public String toString() {
            int i2 = com.facebook.internal.m0.c.a[ordinal()];
            if (i2 == 1) {
                return "Analysis";
            }
            if (i2 == 2) {
                return "AnrReport";
            }
            if (i2 == 3) {
                return "CrashReport";
            }
            if (i2 != 4) {
                return i2 != 5 ? "Unknown" : "ThreadCheck";
            }
            return "CrashShield";
        }
    }

    private b(File file) {
        String name = file.getName();
        i.d(name, "file.name");
        this.a = name;
        this.b = f618h.b(name);
        JSONObject jSONObjectK = f.k(this.a, true);
        if (jSONObjectK != null) {
            this.f619g = Long.valueOf(jSONObjectK.optLong("timestamp", 0L));
            this.d = jSONObjectK.optString("app_version", null);
            this.e = jSONObjectK.optString("reason", null);
            this.f = jSONObjectK.optString("callstack", null);
            this.c = jSONObjectK.optJSONArray("feature_names");
        }
    }

    public /* synthetic */ b(File file, l.y.c.f fVar) {
        this(file);
    }

    private b(String str, String str2) {
        this.b = c.AnrReport;
        this.d = h0.v();
        this.e = str;
        this.f = str2;
        this.f619g = Long.valueOf(System.currentTimeMillis() / ((long) FFVoiceConst.FFVoiceEvent.FFVoice_EVENT_EOF));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("anr_log_");
        stringBuffer.append(String.valueOf(this.f619g));
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        i.d(string, "StringBuffer()\n         …)\n            .toString()");
        this.a = string;
    }

    public /* synthetic */ b(String str, String str2, l.y.c.f fVar) {
        this(str, str2);
    }

    private b(Throwable th, c cVar) {
        this.b = cVar;
        this.d = h0.v();
        this.e = f.b(th);
        this.f = f.e(th);
        this.f619g = Long.valueOf(System.currentTimeMillis() / ((long) FFVoiceConst.FFVoiceEvent.FFVoice_EVENT_EOF));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(cVar.a());
        stringBuffer.append(String.valueOf(this.f619g));
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        i.d(string, "StringBuffer().append(t.…ppend(\".json\").toString()");
        this.a = string;
    }

    public /* synthetic */ b(Throwable th, c cVar, l.y.c.f fVar) {
        this(th, cVar);
    }

    private b(JSONArray jSONArray) {
        this.b = c.Analysis;
        this.f619g = Long.valueOf(System.currentTimeMillis() / ((long) FFVoiceConst.FFVoiceEvent.FFVoice_EVENT_EOF));
        this.c = jSONArray;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("analysis_log_");
        stringBuffer.append(String.valueOf(this.f619g));
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        i.d(string, "StringBuffer()\n         …)\n            .toString()");
        this.a = string;
    }

    public /* synthetic */ b(JSONArray jSONArray, l.y.c.f fVar) {
        this(jSONArray);
    }

    private final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = this.c;
            if (jSONArray != null) {
                jSONObject.put("feature_names", jSONArray);
            }
            Long l2 = this.f619g;
            if (l2 != null) {
                jSONObject.put("timestamp", l2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private final JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_os_version", Build.VERSION.RELEASE);
            jSONObject.put("device_model", Build.MODEL);
            String str = this.d;
            if (str != null) {
                jSONObject.put("app_version", str);
            }
            Long l2 = this.f619g;
            if (l2 != null) {
                jSONObject.put("timestamp", l2);
            }
            String str2 = this.e;
            if (str2 != null) {
                jSONObject.put("reason", str2);
            }
            String str3 = this.f;
            if (str3 != null) {
                jSONObject.put("callstack", str3);
            }
            c cVar = this.b;
            if (cVar != null) {
                jSONObject.put("type", cVar);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private final JSONObject e() {
        c cVar = this.b;
        if (cVar != null) {
            int i2 = d.b[cVar.ordinal()];
            if (i2 == 1) {
                return c();
            }
            if (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) {
                return d();
            }
        }
        return null;
    }

    public final void a() {
        f.a(this.a);
    }

    public final int b(b bVar) {
        i.e(bVar, "data");
        Long l2 = this.f619g;
        if (l2 == null) {
            return -1;
        }
        long jLongValue = l2.longValue();
        Long l3 = bVar.f619g;
        if (l3 != null) {
            return (l3.longValue() > jLongValue ? 1 : (l3.longValue() == jLongValue ? 0 : -1));
        }
        return 1;
    }

    public final boolean f() {
        c cVar = this.b;
        if (cVar == null) {
            return false;
        }
        int i2 = d.a[cVar.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if ((i2 != 3 && i2 != 4 && i2 != 5) || this.f == null || this.f619g == null) {
                    return false;
                }
            } else if (this.f == null || this.e == null || this.f619g == null) {
                return false;
            }
        } else if (this.c == null || this.f619g == null) {
            return false;
        }
        return true;
    }

    public final void g() {
        if (f()) {
            f.m(this.a, toString());
        }
    }

    public String toString() {
        String string;
        String str;
        JSONObject jSONObjectE = e();
        if (jSONObjectE != null) {
            string = jSONObjectE.toString();
            str = "params.toString()";
        } else {
            string = new JSONObject().toString();
            str = "JSONObject().toString()";
        }
        i.d(string, str);
        return string;
    }
}
