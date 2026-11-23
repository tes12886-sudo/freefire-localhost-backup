package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class z {
    private static final String c;
    public static final a d = new a(null);
    private final String a;
    private final SharedPreferences b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }

        private final Date b(Bundle bundle, String str) {
            if (bundle == null) {
                return null;
            }
            long j2 = bundle.getLong(str, Long.MIN_VALUE);
            if (j2 == Long.MIN_VALUE) {
                return null;
            }
            return new Date(j2);
        }

        public final String a(Bundle bundle) {
            l.y.c.i.e(bundle, "bundle");
            return bundle.getString("com.facebook.TokenCachingStrategy.ApplicationId");
        }

        public final Date c(Bundle bundle) {
            l.y.c.i.e(bundle, "bundle");
            return b(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate");
        }

        public final Date d(Bundle bundle) {
            l.y.c.i.e(bundle, "bundle");
            return b(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate");
        }

        public final e e(Bundle bundle) {
            l.y.c.i.e(bundle, "bundle");
            if (bundle.containsKey("com.facebook.TokenCachingStrategy.AccessTokenSource")) {
                return (e) bundle.getSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource");
            }
            return bundle.getBoolean("com.facebook.TokenCachingStrategy.IsSSO") ? e.FACEBOOK_APPLICATION_WEB : e.WEB_VIEW;
        }

        public final String f(Bundle bundle) {
            l.y.c.i.e(bundle, "bundle");
            return bundle.getString("com.facebook.TokenCachingStrategy.Token");
        }

        public final boolean g(Bundle bundle) {
            String string;
            if (bundle == null || (string = bundle.getString("com.facebook.TokenCachingStrategy.Token")) == null) {
                return false;
            }
            return ((string.length() == 0) || bundle.getLong("com.facebook.TokenCachingStrategy.ExpirationDate", 0L) == 0) ? false : true;
        }
    }

    static {
        String simpleName = z.class.getSimpleName();
        l.y.c.i.d(simpleName, "LegacyTokenHelper::class.java.simpleName");
        c = simpleName;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0016  */
    public z(Context context, String str) {
        l.y.c.i.e(context, "context");
        if (str != null) {
            str = str.length() == 0 ? "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY" : str;
        }
        this.a = str;
        Context applicationContext = context.getApplicationContext();
        SharedPreferences sharedPreferences = (applicationContext != null ? applicationContext : context).getSharedPreferences(str, 0);
        l.y.c.i.d(sharedPreferences, "context.getSharedPrefere…ey, Context.MODE_PRIVATE)");
        this.b = sharedPreferences;
    }

    public /* synthetic */ z(Context context, String str, int i2, l.y.c.f fVar) {
        this(context, (i2 & 2) != 0 ? null : str);
    }

    private final void b(String str, Bundle bundle) throws JSONException {
        String str2;
        String string = this.b.getString(str, "{}");
        if (string == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        JSONObject jSONObject = new JSONObject(string);
        String string2 = jSONObject.getString("valueType");
        if (l.y.c.i.a(string2, "bool")) {
            bundle.putBoolean(str, jSONObject.getBoolean("value"));
            return;
        }
        int i2 = 0;
        if (l.y.c.i.a(string2, "bool[]")) {
            JSONArray jSONArray = jSONObject.getJSONArray("value");
            int length = jSONArray.length();
            boolean[] zArr = new boolean[length];
            while (i2 < length) {
                zArr[i2] = jSONArray.getBoolean(i2);
                i2++;
            }
            bundle.putBooleanArray(str, zArr);
            return;
        }
        if (l.y.c.i.a(string2, "byte")) {
            bundle.putByte(str, (byte) jSONObject.getInt("value"));
            return;
        }
        if (l.y.c.i.a(string2, "byte[]")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("value");
            int length2 = jSONArray2.length();
            byte[] bArr = new byte[length2];
            while (i2 < length2) {
                bArr[i2] = (byte) jSONArray2.getInt(i2);
                i2++;
            }
            bundle.putByteArray(str, bArr);
            return;
        }
        if (l.y.c.i.a(string2, "short")) {
            bundle.putShort(str, (short) jSONObject.getInt("value"));
            return;
        }
        if (l.y.c.i.a(string2, "short[]")) {
            JSONArray jSONArray3 = jSONObject.getJSONArray("value");
            int length3 = jSONArray3.length();
            short[] sArr = new short[length3];
            while (i2 < length3) {
                sArr[i2] = (short) jSONArray3.getInt(i2);
                i2++;
            }
            bundle.putShortArray(str, sArr);
            return;
        }
        if (l.y.c.i.a(string2, "int")) {
            bundle.putInt(str, jSONObject.getInt("value"));
            return;
        }
        if (l.y.c.i.a(string2, "int[]")) {
            JSONArray jSONArray4 = jSONObject.getJSONArray("value");
            int length4 = jSONArray4.length();
            int[] iArr = new int[length4];
            while (i2 < length4) {
                iArr[i2] = jSONArray4.getInt(i2);
                i2++;
            }
            bundle.putIntArray(str, iArr);
            return;
        }
        if (l.y.c.i.a(string2, "long")) {
            bundle.putLong(str, jSONObject.getLong("value"));
            return;
        }
        if (l.y.c.i.a(string2, "long[]")) {
            JSONArray jSONArray5 = jSONObject.getJSONArray("value");
            int length5 = jSONArray5.length();
            long[] jArr = new long[length5];
            while (i2 < length5) {
                jArr[i2] = jSONArray5.getLong(i2);
                i2++;
            }
            bundle.putLongArray(str, jArr);
            return;
        }
        if (l.y.c.i.a(string2, "float")) {
            bundle.putFloat(str, (float) jSONObject.getDouble("value"));
            return;
        }
        if (l.y.c.i.a(string2, "float[]")) {
            JSONArray jSONArray6 = jSONObject.getJSONArray("value");
            int length6 = jSONArray6.length();
            float[] fArr = new float[length6];
            while (i2 < length6) {
                fArr[i2] = (float) jSONArray6.getDouble(i2);
                i2++;
            }
            bundle.putFloatArray(str, fArr);
            return;
        }
        if (l.y.c.i.a(string2, "double")) {
            bundle.putDouble(str, jSONObject.getDouble("value"));
            return;
        }
        if (l.y.c.i.a(string2, "double[]")) {
            JSONArray jSONArray7 = jSONObject.getJSONArray("value");
            int length7 = jSONArray7.length();
            double[] dArr = new double[length7];
            while (i2 < length7) {
                dArr[i2] = jSONArray7.getDouble(i2);
                i2++;
            }
            bundle.putDoubleArray(str, dArr);
            return;
        }
        if (l.y.c.i.a(string2, "char")) {
            String string3 = jSONObject.getString("value");
            if (string3 == null || string3.length() != 1) {
                return;
            }
            bundle.putChar(str, string3.charAt(0));
            return;
        }
        if (l.y.c.i.a(string2, "char[]")) {
            JSONArray jSONArray8 = jSONObject.getJSONArray("value");
            int length8 = jSONArray8.length();
            char[] cArr = new char[length8];
            for (int i3 = 0; i3 < length8; i3++) {
                String string4 = jSONArray8.getString(i3);
                if (string4 != null && string4.length() == 1) {
                    cArr[i3] = string4.charAt(0);
                }
            }
            bundle.putCharArray(str, cArr);
            return;
        }
        if (l.y.c.i.a(string2, "string")) {
            bundle.putString(str, jSONObject.getString("value"));
            return;
        }
        if (!l.y.c.i.a(string2, "stringList")) {
            if (l.y.c.i.a(string2, "enum")) {
                try {
                    Class<?> cls = Class.forName(jSONObject.getString("enumType"));
                    if (cls == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<out kotlin.Enum<*>>");
                    }
                    bundle.putSerializable(str, Enum.valueOf(cls, jSONObject.getString("value")));
                    return;
                } catch (ClassNotFoundException | IllegalArgumentException unused) {
                    return;
                }
            }
            return;
        }
        JSONArray jSONArray9 = jSONObject.getJSONArray("value");
        int length9 = jSONArray9.length();
        ArrayList<String> arrayList = new ArrayList<>(length9);
        while (i2 < length9) {
            Object obj = jSONArray9.get(i2);
            if (obj == JSONObject.NULL) {
                str2 = null;
            } else {
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                str2 = (String) obj;
            }
            arrayList.add(i2, str2);
            i2++;
        }
        bundle.putStringArrayList(str, arrayList);
    }

    public final void a() {
        this.b.edit().clear().apply();
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        for (String str : this.b.getAll().keySet()) {
            try {
                l.y.c.i.d(str, "key");
                b(str, bundle);
            } catch (JSONException e) {
                com.facebook.internal.a0.f.a(a0.CACHE, 5, c, "Error reading cached value for key: '" + str + "' -- " + e);
                return null;
            }
        }
        return bundle;
    }
}
