package com.facebook.j0.z;

import android.util.Patterns;
import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.regex.Pattern;
import l.d0.q;
import l.p;
import l.t.d0;
import l.y.c.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static Map<String, String> a;
    private static Map<String, String> b;
    private static Map<String, String> c;
    private static JSONObject d;
    private static boolean e;
    public static final a f = new a();

    private a() {
    }

    public static final float[] a(JSONObject jSONObject, String str) {
        if (com.facebook.internal.m0.i.a.d(a.class)) {
            return null;
        }
        try {
            i.e(jSONObject, "viewHierarchy");
            i.e(str, "appName");
            if (!e) {
                return null;
            }
            float[] fArr = new float[30];
            for (int i2 = 0; i2 < 30; i2++) {
                fArr[i2] = 0.0f;
            }
            try {
                String lowerCase = str.toLowerCase();
                i.d(lowerCase, "(this as java.lang.String).toLowerCase()");
                JSONObject jSONObject2 = new JSONObject(jSONObject.optJSONObject("view").toString());
                String strOptString = jSONObject.optString("screenname");
                JSONArray jSONArray = new JSONArray();
                a aVar = f;
                aVar.j(jSONObject2, jSONArray);
                aVar.m(fArr, aVar.i(jSONObject2));
                JSONObject jSONObjectB = aVar.b(jSONObject2);
                if (jSONObjectB == null) {
                    return null;
                }
                i.d(strOptString, "screenName");
                String string = jSONObject2.toString();
                i.d(string, "viewTree.toString()");
                aVar.m(fArr, aVar.h(jSONObjectB, jSONArray, strOptString, string, lowerCase));
                return fArr;
            } catch (JSONException unused) {
                return fArr;
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, a.class);
            return null;
        }
    }

    private final JSONObject b(JSONObject jSONObject) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return jSONObject;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
            if (jSONArrayOptJSONArray == null) {
                return null;
            }
            int length = jSONArrayOptJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i2);
                i.d(jSONObject2, "children.getJSONObject(i)");
                JSONObject jSONObjectB = b(jSONObject2);
                if (jSONObjectB != null) {
                    return jSONObjectB;
                }
            }
        } catch (JSONException unused) {
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
        return null;
    }

    public static final String c(String str, String str2, String str3) {
        if (com.facebook.internal.m0.i.a.d(a.class)) {
            return null;
        }
        try {
            i.e(str, "buttonText");
            i.e(str2, "activityName");
            i.e(str3, "appName");
            String str4 = str3 + " | " + str2 + ", " + str;
            if (str4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = str4.toLowerCase();
            i.d(lowerCase, "(this as java.lang.String).toLowerCase()");
            return lowerCase;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, a.class);
            return null;
        }
    }

    public static final void d(File file) {
        if (com.facebook.internal.m0.i.a.d(a.class)) {
            return;
        }
        try {
            try {
                d = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                d = new JSONObject(new String(bArr, l.d0.d.b));
                a = d0.f(p.a("ENGLISH", "1"), p.a("GERMAN", "2"), p.a("SPANISH", "3"), p.a("JAPANESE", "4"));
                b = d0.f(p.a("VIEW_CONTENT", "0"), p.a("SEARCH", "1"), p.a("ADD_TO_CART", "2"), p.a("ADD_TO_WISHLIST", "3"), p.a("INITIATE_CHECKOUT", "4"), p.a("ADD_PAYMENT_INFO", "5"), p.a("PURCHASE", "6"), p.a("LEAD", "7"), p.a("COMPLETE_REGISTRATION", "8"));
                c = d0.f(p.a("BUTTON_TEXT", "1"), p.a("PAGE_TITLE", "2"), p.a("RESOLVED_DOCUMENT_LINK", "3"), p.a("BUTTON_ID", "4"));
                e = true;
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, a.class);
            }
        } catch (Exception unused) {
        }
    }

    private final boolean e(JSONObject jSONObject) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return false;
        }
        try {
            return ((jSONObject.optInt("classtypebitmask") & 1) << 5) > 0;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return false;
        }
    }

    public static final boolean f() {
        if (com.facebook.internal.m0.i.a.d(a.class)) {
            return false;
        }
        try {
            return e;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, a.class);
            return false;
        }
    }

    private final boolean g(String[] strArr, String[] strArr2) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return false;
        }
        try {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (q.C(str2, str, false, 2, null)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return false;
        }
    }

    private final float[] h(JSONObject jSONObject, JSONArray jSONArray, String str, String str2, String str3) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i2 = 0; i2 < 30; i2++) {
                fArr[i2] = 0.0f;
            }
            int length = jSONArray.length();
            fArr[3] = length > 1 ? length - 1.0f : 0.0f;
            try {
                int length2 = jSONArray.length();
                for (int i3 = 0; i3 < length2; i3++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                    i.d(jSONObject2, "siblings.getJSONObject(i)");
                    if (e(jSONObject2)) {
                        fArr[9] = fArr[9] + 1.0f;
                    }
                }
            } catch (JSONException unused) {
            }
            fArr[13] = -1.0f;
            fArr[14] = -1.0f;
            String str4 = str + '|' + str3;
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            n(jSONObject, sb2, sb);
            String string = sb.toString();
            i.d(string, "hintSB.toString()");
            String string2 = sb2.toString();
            i.d(string2, "textSB.toString()");
            fArr[15] = l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_TEXT", string2) ? 1.0f : 0.0f;
            fArr[16] = l("ENGLISH", "COMPLETE_REGISTRATION", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            fArr[17] = l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_ID", string) ? 1.0f : 0.0f;
            fArr[18] = q.C(str2, "password", false, 2, null) ? 1.0f : 0.0f;
            fArr[19] = k("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", str2) ? 1.0f : 0.0f;
            fArr[20] = k("(?i)(sign in)|login|signIn", str2) ? 1.0f : 0.0f;
            fArr[21] = k("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", str2) ? 1.0f : 0.0f;
            fArr[22] = l("ENGLISH", "PURCHASE", "BUTTON_TEXT", string2) ? 1.0f : 0.0f;
            fArr[24] = l("ENGLISH", "PURCHASE", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            fArr[25] = k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", string2) ? 1.0f : 0.0f;
            fArr[27] = k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str4) ? 1.0f : 0.0f;
            fArr[28] = l("ENGLISH", "LEAD", "BUTTON_TEXT", string2) ? 1.0f : 0.0f;
            fArr[29] = l("ENGLISH", "LEAD", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            return fArr;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    private final float[] i(JSONObject jSONObject) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i2 = 0; i2 < 30; i2++) {
                fArr[i2] = 0.0f;
            }
            String strOptString = jSONObject.optString("text");
            i.d(strOptString, "node.optString(TEXT_KEY)");
            if (strOptString == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = strOptString.toLowerCase();
            i.d(lowerCase, "(this as java.lang.String).toLowerCase()");
            String strOptString2 = jSONObject.optString("hint");
            i.d(strOptString2, "node.optString(HINT_KEY)");
            if (strOptString2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase2 = strOptString2.toLowerCase();
            i.d(lowerCase2, "(this as java.lang.String).toLowerCase()");
            String strOptString3 = jSONObject.optString("classname");
            i.d(strOptString3, "node.optString(CLASS_NAME_KEY)");
            if (strOptString3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase3 = strOptString3.toLowerCase();
            i.d(lowerCase3, "(this as java.lang.String).toLowerCase()");
            int iOptInt = jSONObject.optInt("inputtype", -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (g(new String[]{"$", "amount", "price", "total"}, strArr)) {
                fArr[0] = fArr[0] + 1.0f;
            }
            if (g(new String[]{"password", "pwd"}, strArr)) {
                fArr[1] = fArr[1] + 1.0f;
            }
            if (g(new String[]{"tel", "phone"}, strArr)) {
                fArr[2] = fArr[2] + 1.0f;
            }
            if (g(new String[]{"search"}, strArr)) {
                fArr[4] = fArr[4] + 1.0f;
            }
            if (iOptInt >= 0) {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (iOptInt == 3 || iOptInt == 2) {
                fArr[6] = fArr[6] + 1.0f;
            }
            if (iOptInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                fArr[7] = fArr[7] + 1.0f;
            }
            if (q.C(lowerCase3, "checkbox", false, 2, null)) {
                fArr[8] = fArr[8] + 1.0f;
            }
            if (g(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = fArr[10] + 1.0f;
            }
            if (q.C(lowerCase3, "radio", false, 2, null) && q.C(lowerCase3, "button", false, 2, null)) {
                fArr[12] = fArr[12] + 1.0f;
            }
            try {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
                int length = jSONArrayOptJSONArray.length();
                for (int i3 = 0; i3 < length; i3++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i3);
                    i.d(jSONObject2, "childViews.getJSONObject(i)");
                    m(fArr, i(jSONObject2));
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    private final boolean j(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z;
        boolean z2;
        if (com.facebook.internal.m0.i.a.d(this)) {
            return false;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return true;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
            int length = jSONArrayOptJSONArray.length();
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = false;
                    z2 = false;
                    break;
                }
                if (jSONArrayOptJSONArray.getJSONObject(i2).optBoolean("is_interacted")) {
                    z = true;
                    z2 = true;
                    break;
                }
                i2++;
            }
            JSONArray jSONArray2 = new JSONArray();
            if (z) {
                int length2 = jSONArrayOptJSONArray.length();
                for (int i3 = 0; i3 < length2; i3++) {
                    jSONArray.put(jSONArrayOptJSONArray.getJSONObject(i3));
                }
            } else {
                int length3 = jSONArrayOptJSONArray.length();
                for (int i4 = 0; i4 < length3; i4++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i4);
                    i.d(jSONObject2, "child");
                    if (j(jSONObject2, jSONArray)) {
                        jSONArray2.put(jSONObject2);
                        z2 = true;
                    }
                }
                jSONObject.put("childviews", jSONArray2);
            }
            return z2;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return false;
        }
    }

    private final boolean k(String str, String str2) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return false;
        }
    }

    private final boolean l(String str, String str2, String str3, String str4) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        if (com.facebook.internal.m0.i.a.d(this)) {
            return false;
        }
        try {
            JSONObject jSONObject = d;
            String strOptString = null;
            if (jSONObject == null) {
                i.q("rules");
                throw null;
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("rulesForLanguage");
            if (jSONObjectOptJSONObject3 != null) {
                Map<String, String> map = a;
                if (map == null) {
                    i.q("languageInfo");
                    throw null;
                }
                JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject(map.get(str));
                if (jSONObjectOptJSONObject4 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject4.optJSONObject("rulesForEvent")) != null) {
                    Map<String, String> map2 = b;
                    if (map2 == null) {
                        i.q("eventInfo");
                        throw null;
                    }
                    JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject.optJSONObject(map2.get(str2));
                    if (jSONObjectOptJSONObject5 != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject5.optJSONObject("positiveRules")) != null) {
                        Map<String, String> map3 = c;
                        if (map3 == null) {
                            i.q("textTypeInfo");
                            throw null;
                        }
                        strOptString = jSONObjectOptJSONObject2.optString(map3.get(str3));
                    }
                }
            }
            if (strOptString == null) {
                return false;
            }
            return k(strOptString, str4);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return false;
        }
    }

    private final void m(float[] fArr, float[] fArr2) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            int length = fArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                fArr[i2] = fArr[i2] + fArr2[i2];
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    private final void n(JSONObject jSONObject, StringBuilder sb, StringBuilder sb2) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            String strOptString = jSONObject.optString("text", "");
            i.d(strOptString, "view.optString(TEXT_KEY, \"\")");
            if (strOptString == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = strOptString.toLowerCase();
            i.d(lowerCase, "(this as java.lang.String).toLowerCase()");
            String strOptString2 = jSONObject.optString("hint", "");
            i.d(strOptString2, "view.optString(HINT_KEY, \"\")");
            if (strOptString2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase2 = strOptString2.toLowerCase();
            i.d(lowerCase2, "(this as java.lang.String).toLowerCase()");
            boolean z = true;
            if (lowerCase.length() > 0) {
                sb.append(lowerCase);
                sb.append(" ");
            }
            if (lowerCase2.length() <= 0) {
                z = false;
            }
            if (z) {
                sb2.append(lowerCase2);
                sb2.append(" ");
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    try {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i2);
                        i.d(jSONObject2, "currentChildView");
                        n(jSONObject2, sb, sb2);
                    } catch (JSONException unused) {
                    }
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }
}
