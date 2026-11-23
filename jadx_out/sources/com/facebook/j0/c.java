package com.facebook.j0;

import android.os.Build;
import android.os.Bundle;
import com.FF.voiceengine.FFVoiceConst;
import com.facebook.internal.a0;
import com.facebook.internal.h0;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import l.s;
import l.t.q;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Serializable {
    private final JSONObject a;
    private final boolean b;
    private final boolean c;
    private final String d;
    private final String e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f640g = new a(null);
    private static final HashSet<String> f = new HashSet<>();

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String c(String str) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                Charset charsetForName = Charset.forName("UTF-8");
                l.y.c.i.d(charsetForName, "Charset.forName(charsetName)");
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes = str.getBytes(charsetForName);
                l.y.c.i.d(bytes, "(this as java.lang.String).getBytes(charset)");
                messageDigest.update(bytes, 0, bytes.length);
                byte[] bArrDigest = messageDigest.digest();
                l.y.c.i.d(bArrDigest, "digest.digest()");
                return com.facebook.j0.v.b.c(bArrDigest);
            } catch (UnsupportedEncodingException e) {
                h0.e0("Failed to generate checksum: ", e);
                return "1";
            } catch (NoSuchAlgorithmException e2) {
                h0.e0("Failed to generate checksum: ", e2);
                return "0";
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(String str) {
            boolean zContains;
            if (str != null) {
                if (!(str.length() == 0) && str.length() <= 40) {
                    synchronized (c.f) {
                        zContains = c.f.contains(str);
                        s sVar = s.a;
                    }
                    if (zContains) {
                        return;
                    }
                    if (new l.d0.f("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").a(str)) {
                        synchronized (c.f) {
                            c.f.add(str);
                        }
                        return;
                    } else {
                        l.y.c.o oVar = l.y.c.o.a;
                        String str2 = String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", Arrays.copyOf(new Object[]{str}, 1));
                        l.y.c.i.d(str2, "java.lang.String.format(format, *args)");
                        throw new com.facebook.n(str2);
                    }
                }
            }
            if (str == null) {
                str = "<None Provided>";
            }
            l.y.c.o oVar2 = l.y.c.o.a;
            String str3 = String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{str, 40}, 2));
            l.y.c.i.d(str3, "java.lang.String.format(locale, format, *args)");
            throw new com.facebook.n(str3);
        }
    }

    public static final class b implements Serializable {
        private final String a;
        private final boolean b;
        private final boolean c;
        private final String d;

        public b(String str, boolean z, boolean z2, String str2) {
            l.y.c.i.e(str, "jsonString");
            this.a = str;
            this.b = z;
            this.c = z2;
            this.d = str2;
        }

        private final Object readResolve() {
            return new c(this.a, this.b, this.c, this.d, null);
        }
    }

    public c(String str, String str2, Double d, Bundle bundle, boolean z, boolean z2, UUID uuid) {
        l.y.c.i.e(str, "contextName");
        l.y.c.i.e(str2, "eventName");
        this.b = z;
        this.c = z2;
        this.d = str2;
        this.a = d(str, str2, d, bundle, uuid);
        this.e = b();
    }

    private c(String str, boolean z, boolean z2, String str2) {
        JSONObject jSONObject = new JSONObject(str);
        this.a = jSONObject;
        this.b = z;
        String strOptString = jSONObject.optString("_eventName");
        l.y.c.i.d(strOptString, "jsonObject.optString(Con…nts.EVENT_NAME_EVENT_KEY)");
        this.d = strOptString;
        this.e = str2;
        this.c = z2;
    }

    public /* synthetic */ c(String str, boolean z, boolean z2, String str2, l.y.c.f fVar) {
        this(str, z, z2, str2);
    }

    private final String b() {
        a aVar;
        String string;
        String str;
        if (Build.VERSION.SDK_INT > 19) {
            aVar = f640g;
            string = this.a.toString();
            str = "jsonObject.toString()";
        } else {
            ArrayList<String> arrayList = new ArrayList();
            Iterator<String> itKeys = this.a.keys();
            while (itKeys.hasNext()) {
                arrayList.add(itKeys.next());
            }
            q.p(arrayList);
            StringBuilder sb = new StringBuilder();
            for (String str2 : arrayList) {
                sb.append(str2);
                sb.append(" = ");
                sb.append(this.a.optString(str2));
                sb.append('\n');
            }
            aVar = f640g;
            string = sb.toString();
            str = "sb.toString()";
        }
        l.y.c.i.d(string, str);
        return aVar.c(string);
    }

    private final JSONObject d(String str, String str2, Double d, Bundle bundle, UUID uuid) throws JSONException {
        a aVar = f640g;
        aVar.d(str2);
        JSONObject jSONObject = new JSONObject();
        String strE = com.facebook.j0.y.a.e(str2);
        jSONObject.put("_eventName", strE);
        jSONObject.put("_eventName_md5", aVar.c(strE));
        jSONObject.put("_logTime", System.currentTimeMillis() / ((long) FFVoiceConst.FFVoiceEvent.FFVoice_EVENT_EOF));
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (bundle != null) {
            Map<String, String> mapI = i(bundle);
            for (String str3 : mapI.keySet()) {
                jSONObject.put(str3, mapI.get(str3));
            }
        }
        if (d != null) {
            jSONObject.put("_valueToSum", d.doubleValue());
        }
        if (this.c) {
            jSONObject.put("_inBackground", "1");
        }
        if (this.b) {
            jSONObject.put("_implicitlyLogged", "1");
        } else {
            a0.a aVar2 = a0.f;
            com.facebook.a0 a0Var = com.facebook.a0.APP_EVENTS;
            String string = jSONObject.toString();
            l.y.c.i.d(string, "eventObject.toString()");
            aVar2.d(a0Var, "AppEvents", "Created app event '%s'", string);
        }
        return jSONObject;
    }

    private final Map<String, String> i(Bundle bundle) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            a aVar = f640g;
            l.y.c.i.d(str, "key");
            aVar.d(str);
            Object obj = bundle.get(str);
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                l.y.c.o oVar = l.y.c.o.a;
                String str2 = String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj, str}, 2));
                l.y.c.i.d(str2, "java.lang.String.format(format, *args)");
                throw new com.facebook.n(str2);
            }
            map.put(str, obj.toString());
        }
        com.facebook.j0.u.a.c(map);
        com.facebook.j0.y.a.f(l.y.c.p.b(map), this.d);
        com.facebook.j0.s.a.c(l.y.c.p.b(map), this.d);
        return map;
    }

    private final Object writeReplace() {
        String string = this.a.toString();
        l.y.c.i.d(string, "jsonObject.toString()");
        return new b(string, this.b, this.c, this.e);
    }

    public final boolean c() {
        return this.b;
    }

    public final JSONObject e() {
        return this.a;
    }

    public final String f() {
        return this.d;
    }

    public final boolean g() {
        if (this.e == null) {
            return true;
        }
        return l.y.c.i.a(b(), this.e);
    }

    public final boolean h() {
        return this.b;
    }

    public String toString() {
        l.y.c.o oVar = l.y.c.o.a;
        String str = String.format("\"%s\", implicit: %b, json: %s", Arrays.copyOf(new Object[]{this.a.optString("_eventName"), Boolean.valueOf(this.b), this.a.toString()}, 3));
        l.y.c.i.d(str, "java.lang.String.format(format, *args)");
        return str;
    }
}
