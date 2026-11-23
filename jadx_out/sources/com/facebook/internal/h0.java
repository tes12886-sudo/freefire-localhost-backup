package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.database.Cursor;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.view.autofill.AutofillManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes.dex */
public final class h0 {
    private static int a = 0;
    private static long b = -1;
    private static long c = -1;
    private static long d = -1;
    private static String e = "";
    private static String f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static String f604g = "NoCarrier";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h0 f605h = new h0();

    public interface a {
        void a(com.facebook.n nVar);

        void b(JSONObject jSONObject);
    }

    public interface b<T, K> {
        K apply(T t);
    }

    public static final class c {
        private List<String> a;
        private List<String> b;
        private List<String> c;

        public c(List<String> list, List<String> list2, List<String> list3) {
            l.y.c.i.e(list, "grantedPermissions");
            l.y.c.i.e(list2, "declinedPermissions");
            l.y.c.i.e(list3, "expiredPermissions");
            this.a = list;
            this.b = list2;
            this.c = list3;
        }

        public final List<String> a() {
            return this.b;
        }

        public final List<String> b() {
            return this.c;
        }

        public final List<String> c() {
            return this.a;
        }
    }

    static final class d implements com.facebook.u.b {
        final /* synthetic */ a a;
        final /* synthetic */ String b;

        d(a aVar, String str) {
            this.a = aVar;
            this.b = str;
        }

        @Override // com.facebook.u.b
        public final void b(com.facebook.x xVar) {
            l.y.c.i.e(xVar, "response");
            if (xVar.b() != null) {
                this.a.a(xVar.b().e());
                return;
            }
            String str = this.b;
            JSONObject jSONObjectD = xVar.d();
            if (jSONObjectD == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            e0.b(str, jSONObjectD);
            this.a.b(xVar.d());
        }
    }

    static final class e implements FilenameFilter {
        public static final e a = new e();

        e() {
        }

        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return Pattern.matches("cpu[0-9]+", str);
        }
    }

    private h0() {
    }

    public static final JSONObject A() {
        if (com.facebook.internal.m0.i.a.d(h0.class)) {
            return null;
        }
        try {
            String string = com.facebook.r.f().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, h0.class);
            return null;
        }
    }

    public static final void A0(JSONObject jSONObject, Context context) throws JSONException {
        String str;
        Locale locale;
        int i2;
        l.y.c.i.e(jSONObject, "params");
        l.y.c.i.e(context, "appContext");
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        f605h.v0(context);
        String packageName = context.getPackageName();
        int i3 = 0;
        int i4 = -1;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            if (packageInfo == null) {
                return;
            }
            i4 = packageInfo.versionCode;
            str = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = "";
        }
        jSONArray.put(packageName);
        jSONArray.put(i4);
        jSONArray.put(str);
        jSONArray.put(Build.VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            Resources resources = context.getResources();
            l.y.c.i.d(resources, "appContext.resources");
            locale = resources.getConfiguration().locale;
        } catch (Exception unused2) {
            locale = Locale.getDefault();
        }
        StringBuilder sb = new StringBuilder();
        l.y.c.i.d(locale, "locale");
        sb.append(locale.getLanguage());
        sb.append("_");
        sb.append(locale.getCountry());
        jSONArray.put(sb.toString());
        jSONArray.put(e);
        jSONArray.put(f604g);
        double d2 = 0.0d;
        try {
            Display defaultDisplay = null;
            if (Build.VERSION.SDK_INT >= 17) {
                Object systemService = context.getSystemService("display");
                if (!(systemService instanceof DisplayManager)) {
                    systemService = null;
                }
                DisplayManager displayManager = (DisplayManager) systemService;
                if (displayManager != null) {
                    defaultDisplay = displayManager.getDisplay(0);
                }
            } else {
                Object systemService2 = context.getSystemService("window");
                if (!(systemService2 instanceof WindowManager)) {
                    systemService2 = null;
                }
                WindowManager windowManager = (WindowManager) systemService2;
                if (windowManager != null) {
                    defaultDisplay = windowManager.getDefaultDisplay();
                }
            }
            if (defaultDisplay != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                int i5 = displayMetrics.widthPixels;
                try {
                    int i6 = displayMetrics.heightPixels;
                    try {
                        d2 = displayMetrics.density;
                    } catch (Exception unused3) {
                    }
                    i2 = i6;
                    i3 = i5;
                } catch (Exception unused4) {
                    i3 = i5;
                    i2 = 0;
                }
            } else {
                i2 = 0;
            }
        } catch (Exception unused5) {
        }
        jSONArray.put(i3);
        jSONArray.put(i2);
        jSONArray.put(new DecimalFormat("#.##").format(d2));
        jSONArray.put(f605h.t0());
        jSONArray.put(c);
        jSONArray.put(d);
        jSONArray.put(f);
        jSONObject.put("extinfo", jSONArray.toString());
    }

    public static final String B(String str) {
        boolean z;
        int i2;
        Object obj;
        String str2;
        String str3;
        String strO = com.facebook.r.o();
        if (str == null) {
            return strO;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -1253231569) {
            if (iHashCode != 28903346 || !str.equals("instagram")) {
                return strO;
            }
            z = false;
            i2 = 4;
            obj = null;
            str2 = "facebook.com";
            str3 = "instagram.com";
        } else {
            if (!str.equals("gaming")) {
                return strO;
            }
            z = false;
            i2 = 4;
            obj = null;
            str2 = "facebook.com";
            str3 = "fb.gg";
        }
        return l.d0.p.t(strO, str2, str3, z, i2, obj);
    }

    public static final String B0(byte[] bArr) {
        l.y.c.i.e(bArr, "bytes");
        return f605h.O("SHA-1", bArr);
    }

    private final com.facebook.u C(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", H(z()));
        bundle.putString("access_token", str);
        return new com.facebook.u(null, "me", bundle, com.facebook.y.GET, null, null, 32, null);
    }

    public static final String C0(String str) {
        if (str == null) {
            return null;
        }
        return f605h.N("SHA-256", str);
    }

    public static final void D(String str, a aVar) {
        l.y.c.i.e(str, "accessToken");
        l.y.c.i.e(aVar, "callback");
        JSONObject jSONObjectA = e0.a(str);
        if (jSONObjectA != null) {
            aVar.b(jSONObjectA);
            return;
        }
        d dVar = new d(aVar, str);
        com.facebook.u uVarC = f605h.C(str);
        uVarC.C(dVar);
        uVarC.j();
    }

    public static final <T> Collection<T> D0(T... tArr) {
        l.y.c.i.e(tArr, "ts");
        Collection<T> collectionUnmodifiableCollection = Collections.unmodifiableCollection(Arrays.asList(Arrays.copyOf(tArr, tArr.length)));
        l.y.c.i.d(collectionUnmodifiableCollection, "Collections.unmodifiable…ction(Arrays.asList(*ts))");
        return collectionUnmodifiableCollection;
    }

    public static final String E(Context context) {
        i0.m(context, "context");
        return com.facebook.r.g();
    }

    public static final void E0(Parcel parcel, Map<String, String> map) {
        l.y.c.i.e(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            parcel.writeString(key);
            parcel.writeString(value);
        }
    }

    public static final Method F(Class<?> cls, String str, Class<?>... clsArr) {
        l.y.c.i.e(cls, "clazz");
        l.y.c.i.e(str, "methodName");
        l.y.c.i.e(clsArr, "parameterTypes");
        try {
            return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static final Method G(String str, String str2, Class<?>... clsArr) {
        l.y.c.i.e(str, "className");
        l.y.c.i.e(str2, "methodName");
        l.y.c.i.e(clsArr, "parameterTypes");
        try {
            Class<?> cls = Class.forName(str);
            l.y.c.i.d(cls, "Class.forName(className)");
            return F(cls, str2, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private final String H(String str) {
        return l.y.c.i.a(str, "instagram") ? "id,name,profile_picture" : "id,name,first_name,middle_name,last_name";
    }

    public static final Locale I() {
        try {
            Resources resources = com.facebook.r.f().getResources();
            l.y.c.i.d(resources, "FacebookSdk.getApplicationContext().resources");
            return resources.getConfiguration().locale;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final Object J(JSONObject jSONObject, String str, String str2) throws JSONException {
        l.y.c.i.e(jSONObject, "jsonObject");
        Object objOpt = jSONObject.opt(str);
        if (objOpt != null && (objOpt instanceof String)) {
            objOpt = new JSONTokener((String) objOpt).nextValue();
        }
        if (objOpt == null || (objOpt instanceof JSONObject) || (objOpt instanceof JSONArray)) {
            return objOpt;
        }
        if (str2 == null) {
            throw new com.facebook.n("Got an unexpected non-JSON object.");
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putOpt(str2, objOpt);
        return jSONObject2;
    }

    public static final String K(Uri uri) {
        if (uri != null) {
            return uri.toString();
        }
        return null;
    }

    public static final c L(JSONObject jSONObject) throws JSONException {
        String strOptString;
        l.y.c.i.e(jSONObject, "result");
        JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        ArrayList arrayList2 = new ArrayList(jSONArray.length());
        ArrayList arrayList3 = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
            String strOptString2 = jSONObjectOptJSONObject.optString("permission");
            if (strOptString2 != null && !l.y.c.i.a(strOptString2, "installed") && (strOptString = jSONObjectOptJSONObject.optString("status")) != null) {
                if (l.y.c.i.a(strOptString, "granted")) {
                    arrayList.add(strOptString2);
                } else if (l.y.c.i.a(strOptString, "declined")) {
                    arrayList2.add(strOptString2);
                } else if (l.y.c.i.a(strOptString, "expired")) {
                    arrayList3.add(strOptString2);
                }
            }
        }
        return new c(arrayList, arrayList2, arrayList3);
    }

    private final String M(MessageDigest messageDigest, byte[] bArr) {
        messageDigest.update(bArr);
        byte[] bArrDigest = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArrDigest) {
            sb.append(Integer.toHexString((b2 >> 4) & 15));
            sb.append(Integer.toHexString((b2 >> 0) & 15));
        }
        String string = sb.toString();
        l.y.c.i.d(string, "builder.toString()");
        return string;
    }

    private final String N(String str, String str2) {
        Charset charset = l.d0.d.b;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = str2.getBytes(charset);
        l.y.c.i.d(bytes, "(this as java.lang.String).getBytes(charset)");
        return O(str, bytes);
    }

    private final String O(String str, byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            l.y.c.i.d(messageDigest, "hash");
            return M(messageDigest, bArr);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static final Object P(Object obj, Method method, Object... objArr) {
        l.y.c.i.e(method, "method");
        l.y.c.i.e(objArr, "args");
        try {
            return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static final boolean Q() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            l.y.c.o oVar = l.y.c.o.a;
            String str = String.format("fb%s://applinks", Arrays.copyOf(new Object[]{com.facebook.r.g()}, 1));
            l.y.c.i.d(str, "java.lang.String.format(format, *args)");
            intent.setData(Uri.parse(str));
            Context contextF = com.facebook.r.f();
            PackageManager packageManager = contextF.getPackageManager();
            String packageName = contextF.getPackageName();
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 65536).iterator();
            while (it.hasNext()) {
                if (l.y.c.i.a(packageName, it.next().activityInfo.packageName)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static final boolean R(Context context) {
        AutofillManager autofillManager;
        l.y.c.i.e(context, "context");
        return Build.VERSION.SDK_INT >= 26 && (autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class)) != null && autofillManager.isAutofillSupported() && autofillManager.isEnabled();
    }

    public static final boolean S(Context context) {
        l.y.c.i.e(context, "context");
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String str = Build.DEVICE;
        if (str != null) {
            l.y.c.i.d(str, "Build.DEVICE");
            if (new l.d0.f(".+_cheets|cheets_.+").a(str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean T(Uri uri) {
        return uri != null && l.d0.p.l("content", uri.getScheme(), true);
    }

    public static final boolean U(com.facebook.a aVar) {
        return aVar != null && l.y.c.i.a(aVar, com.facebook.a.p.e());
    }

    public static final boolean V() {
        if (com.facebook.internal.m0.i.a.d(h0.class)) {
            return false;
        }
        try {
            JSONObject jSONObjectA = A();
            if (jSONObjectA != null) {
                try {
                    JSONArray jSONArray = jSONObjectA.getJSONArray("data_processing_options");
                    int length = jSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        String string = jSONArray.getString(i2);
                        l.y.c.i.d(string, "options.getString(i)");
                        if (string == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        String lowerCase = string.toLowerCase();
                        l.y.c.i.d(lowerCase, "(this as java.lang.String).toLowerCase()");
                        if (l.y.c.i.a(lowerCase, "ldu")) {
                            return true;
                        }
                    }
                } catch (Exception unused) {
                }
            }
            return false;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, h0.class);
            return false;
        }
    }

    public static final boolean W(Uri uri) {
        return uri != null && l.d0.p.l("file", uri.getScheme(), true);
    }

    private final boolean X(Context context) {
        Method methodG = G("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (methodG == null) {
            return false;
        }
        Object objP = P(null, methodG, context);
        return (objP instanceof Integer) && !(l.y.c.i.a(objP, 0) ^ true);
    }

    public static final boolean Y(String str) {
        if (str != null) {
            if (!(str.length() == 0)) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean Z(Collection<? extends T> collection) {
        return collection == null || collection.isEmpty();
    }

    private final void a(JSONObject jSONObject, com.facebook.internal.b bVar, String str, Context context) throws JSONException {
        if (Build.VERSION.SDK_INT >= 31 && X(context) && bVar.k()) {
            return;
        }
        jSONObject.put("anon_id", str);
    }

    public static final boolean a0(Uri uri) {
        return uri != null && (l.d0.p.l("http", uri.getScheme(), true) || l.d0.p.l("https", uri.getScheme(), true) || l.d0.p.l("fbstaging", uri.getScheme(), true));
    }

    private final void b(JSONObject jSONObject, com.facebook.internal.b bVar, Context context) throws JSONException {
        if (Build.VERSION.SDK_INT >= 31 && X(context) && bVar.k()) {
            return;
        }
        jSONObject.put("attribution", bVar.j());
    }

    public static final Set<String> b0(JSONArray jSONArray) throws JSONException {
        l.y.c.i.e(jSONArray, "jsonArray");
        HashSet hashSet = new HashSet();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            String string = jSONArray.getString(i2);
            l.y.c.i.d(string, "jsonArray.getString(i)");
            hashSet.add(string);
        }
        return hashSet;
    }

    public static final <T> boolean c(T t, T t2) {
        if (t == null) {
            return t2 == null;
        }
        return l.y.c.i.a(t, t2);
    }

    public static final List<String> c0(JSONArray jSONArray) {
        l.y.c.i.e(jSONArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(jSONArray.getString(i2));
        }
        return arrayList;
    }

    public static final <T> List<T> d(T... tArr) {
        l.y.c.i.e(tArr, "array");
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final Map<String, String> d0(String str) {
        l.y.c.i.e(str, "str");
        if (str.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap map = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                l.y.c.i.d(next, "key");
                String string = jSONObject.getString(next);
                l.y.c.i.d(string, "jsonObject.getString(key)");
                map.put(next, string);
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public static final JSONObject e(String str) {
        l.y.c.i.e(str, "accessToken");
        JSONObject jSONObjectA = e0.a(str);
        if (jSONObjectA != null) {
            return jSONObjectA;
        }
        com.facebook.x xVarI = f605h.C(str).i();
        if (xVarI.b() != null) {
            return null;
        }
        return xVarI.d();
    }

    public static final void e0(String str, Exception exc) {
        if (!com.facebook.r.v() || str == null || exc == null) {
            return;
        }
        Log.d(str, exc.getClass().getSimpleName() + ": " + exc.getMessage());
    }

    public static final Uri f(String str, String str2, Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        Uri uriBuild = builder.build();
        l.y.c.i.d(uriBuild, "builder.build()");
        return uriBuild;
    }

    public static final void f0(String str, String str2) {
        if (!com.facebook.r.v() || str == null || str2 == null) {
            return;
        }
        Log.d(str, str2);
    }

    private final void g(Context context, String str) {
        CookieSyncManager.createInstance(context).sync();
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie != null) {
            Object[] array = l.d0.q.i0(cookie, new String[]{";"}, false, 0, 6, null).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            for (String str2 : (String[]) array) {
                Object[] array2 = l.d0.q.i0(str2, new String[]{"="}, false, 0, 6, null).toArray(new String[0]);
                if (array2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr = (String[]) array2;
                if (strArr.length > 0) {
                    StringBuilder sb = new StringBuilder();
                    String str3 = strArr[0];
                    int length = str3.length() - 1;
                    int i2 = 0;
                    boolean z = false;
                    while (i2 <= length) {
                        boolean z2 = l.y.c.i.g(str3.charAt(!z ? i2 : length), 32) <= 0;
                        if (z) {
                            if (!z2) {
                                break;
                            } else {
                                length--;
                            }
                        } else if (z2) {
                            i2++;
                        } else {
                            z = true;
                        }
                    }
                    sb.append(str3.subSequence(i2, length + 1).toString());
                    sb.append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                    cookieManager.setCookie(str, sb.toString());
                }
            }
            cookieManager.removeExpiredCookie();
        }
    }

    public static final void g0(String str, String str2, Throwable th) {
        if (!com.facebook.r.v() || Y(str)) {
            return;
        }
        Log.d(str, str2, th);
    }

    public static final void h(Context context) {
        l.y.c.i.e(context, "context");
        h0 h0Var = f605h;
        h0Var.g(context, "facebook.com");
        h0Var.g(context, ".facebook.com");
        h0Var.g(context, "https://facebook.com");
        h0Var.g(context, "https://.facebook.com");
    }

    public static final <T, K> List<K> h0(List<? extends T> list, b<T, K> bVar) {
        l.y.c.i.e(bVar, "mapper");
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = list.iterator();
        while (it.hasNext()) {
            K kApply = bVar.apply(it.next());
            if (kApply != null) {
                arrayList.add(kApply);
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    public static final void i(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final String i0(Map<String, String> map) {
        l.y.c.i.e(map, "map");
        String string = "";
        if (!map.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                string = jSONObject.toString();
            } catch (JSONException unused) {
            }
            l.y.c.i.d(string, "try {\n        val jsonOb…ion) {\n        \"\"\n      }");
        }
        return string;
    }

    public static final String j(String str, String str2) {
        return Y(str) ? str2 : str;
    }

    public static final String j0(String str) {
        l.y.c.i.e(str, "key");
        return f605h.N("MD5", str);
    }

    private final long k(double d2) {
        return Math.round(d2 / 1.073741824E9d);
    }

    public static final boolean k0(Context context) {
        l.y.c.i.e(context, "context");
        return R(context);
    }

    public static final List<String> l(JSONArray jSONArray) {
        l.y.c.i.e(jSONArray, "jsonArray");
        try {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                String string = jSONArray.getString(i2);
                l.y.c.i.d(string, "jsonArray.getString(i)");
                arrayList.add(string);
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    public static final Bundle l0(String str) {
        Bundle bundle = new Bundle();
        if (!Y(str)) {
            if (str == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            Object[] array = l.d0.q.i0(str, new String[]{"&"}, false, 0, 6, null).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            for (String str2 : (String[]) array) {
                Object[] array2 = l.d0.q.i0(str2, new String[]{"="}, false, 0, 6, null).toArray(new String[0]);
                if (array2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr = (String[]) array2;
                try {
                    if (strArr.length == 2) {
                        bundle.putString(URLDecoder.decode(strArr[0], "UTF-8"), URLDecoder.decode(strArr[1], "UTF-8"));
                    } else if (strArr.length == 1) {
                        bundle.putString(URLDecoder.decode(strArr[0], "UTF-8"), "");
                    }
                } catch (UnsupportedEncodingException e2) {
                    e0("FacebookSDK", e2);
                }
            }
        }
        return bundle;
    }

    public static final Map<String, Object> m(JSONObject jSONObject) {
        l.y.c.i.e(jSONObject, "jsonObject");
        HashMap map = new HashMap();
        JSONArray jSONArrayNames = jSONObject.names();
        if (jSONArrayNames != null) {
            int length = jSONArrayNames.length();
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    String string = jSONArrayNames.getString(i2);
                    l.y.c.i.d(string, "keys.getString(i)");
                    Object objM = jSONObject.get(string);
                    if (objM instanceof JSONObject) {
                        objM = m((JSONObject) objM);
                    }
                    l.y.c.i.d(objM, "value");
                    map.put(string, objM);
                } catch (JSONException unused) {
                }
            }
        }
        return map;
    }

    public static final void m0(Bundle bundle, String str, List<String> list) {
        l.y.c.i.e(bundle, "b");
        if (list != null) {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(",");
            }
            bundle.putString(str, sb.length() > 0 ? sb.substring(0, sb.length() - 1) : "");
        }
    }

    public static final Map<String, String> n(JSONObject jSONObject) {
        l.y.c.i.e(jSONObject, "jsonObject");
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = jSONObject.optString(next);
            if (strOptString != null) {
                l.y.c.i.d(next, "key");
                map.put(next, strOptString);
            }
        }
        return map;
    }

    public static final boolean n0(Bundle bundle, String str, Object obj) {
        String string;
        l.y.c.i.e(bundle, "bundle");
        if (obj == null) {
            bundle.remove(str);
            return true;
        }
        if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            return true;
        }
        if (obj instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) obj);
            return true;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Number) obj).doubleValue());
            return true;
        }
        if (obj instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) obj);
            return true;
        }
        if (obj instanceof Integer) {
            bundle.putInt(str, ((Number) obj).intValue());
            return true;
        }
        if (obj instanceof int[]) {
            bundle.putIntArray(str, (int[]) obj);
            return true;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Number) obj).longValue());
            return true;
        }
        if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
            return true;
        }
        if (obj instanceof String) {
            string = (String) obj;
        } else {
            if (!(obj instanceof JSONArray) && !(obj instanceof JSONObject)) {
                return false;
            }
            string = obj.toString();
        }
        bundle.putString(str, string);
        return true;
    }

    public static final int o(InputStream inputStream, OutputStream outputStream) throws Throwable {
        l.y.c.i.e(outputStream, "outputStream");
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream);
            try {
                byte[] bArr = new byte[8192];
                int i2 = 0;
                while (true) {
                    int i3 = bufferedInputStream2.read(bArr);
                    if (i3 == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, i3);
                    i2 += i3;
                }
                bufferedInputStream2.close();
                if (inputStream != null) {
                    inputStream.close();
                }
                return i2;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static final void o0(Bundle bundle, String str, String str2) {
        l.y.c.i.e(bundle, "b");
        if (Y(str2)) {
            return;
        }
        bundle.putString(str, str2);
    }

    public static final void p(File file) {
        File[] fileArrListFiles;
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                p(file2);
            }
        }
        file.delete();
    }

    public static final void p0(Bundle bundle, String str, Uri uri) {
        l.y.c.i.e(bundle, "b");
        if (uri != null) {
            o0(bundle, str, uri.toString());
        }
    }

    public static final void q(URLConnection uRLConnection) {
        if (uRLConnection == null || !(uRLConnection instanceof HttpURLConnection)) {
            return;
        }
        ((HttpURLConnection) uRLConnection).disconnect();
    }

    public static final String q0(InputStream inputStream) throws Throwable {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        InputStreamReader inputStreamReader;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
                try {
                    StringBuilder sb = new StringBuilder();
                    char[] cArr = new char[2048];
                    while (true) {
                        int i2 = inputStreamReader.read(cArr);
                        if (i2 == -1) {
                            String string = sb.toString();
                            l.y.c.i.d(string, "stringBuilder.toString()");
                            i(bufferedInputStream);
                            i(inputStreamReader);
                            return string;
                        }
                        sb.append(cArr, 0, i2);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i(bufferedInputStream);
                    i(inputStreamReader);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader = null;
            }
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th = th4;
            inputStreamReader = null;
        }
    }

    private final boolean r() {
        return l.y.c.i.a("mounted", Environment.getExternalStorageState());
    }

    public static final Map<String, String> r0(Parcel parcel) {
        l.y.c.i.e(parcel, "parcel");
        int i2 = parcel.readInt();
        if (i2 < 0) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i3 = 0; i3 < i2; i3++) {
            map.put(parcel.readString(), parcel.readString());
        }
        return map;
    }

    public static final String s(int i2) {
        String string = new BigInteger(i2 * 5, new Random()).toString(32);
        l.y.c.i.d(string, "BigInteger(length * 5, r).toString(32)");
        return string;
    }

    private final void s0() {
        try {
            if (r()) {
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                l.y.c.i.d(externalStorageDirectory, "path");
                StatFs statFs = new StatFs(externalStorageDirectory.getPath());
                d = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
            }
            d = k(d);
        } catch (Exception unused) {
        }
    }

    public static final String t(Context context) {
        if (context == null) {
            return "null";
        }
        if (context == context.getApplicationContext()) {
            return "unknown";
        }
        String simpleName = context.getClass().getSimpleName();
        l.y.c.i.d(simpleName, "context.javaClass.simpleName");
        return simpleName;
    }

    private final int t0() {
        int i2 = a;
        if (i2 > 0) {
            return i2;
        }
        try {
            File[] fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles(e.a);
            if (fileArrListFiles != null) {
                a = fileArrListFiles.length;
            }
        } catch (Exception unused) {
        }
        if (a <= 0) {
            a = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return a;
    }

    public static final String u(Context context) {
        String string;
        l.y.c.i.e(context, "context");
        try {
            String strH = com.facebook.r.h();
            if (strH != null) {
                return strH;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i2 = applicationInfo.labelRes;
            if (i2 == 0) {
                string = applicationInfo.nonLocalizedLabel.toString();
            } else {
                string = context.getString(i2);
                l.y.c.i.d(string, "context.getString(stringId)");
            }
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    private final void u0(Context context) {
        if (l.y.c.i.a(f604g, "NoCarrier")) {
            try {
                Object systemService = context.getSystemService("phone");
                if (systemService == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
                }
                String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
                l.y.c.i.d(networkOperatorName, "telephonyManager.networkOperatorName");
                f604g = networkOperatorName;
            } catch (Exception unused) {
            }
        }
    }

    public static final String v() {
        Context contextF = com.facebook.r.f();
        if (contextF != null) {
            try {
                PackageInfo packageInfo = contextF.getPackageManager().getPackageInfo(contextF.getPackageName(), 0);
                if (packageInfo != null) {
                    return packageInfo.versionName;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return null;
    }

    private final void v0(Context context) {
        if (b == -1 || System.currentTimeMillis() - b >= 1800000) {
            b = System.currentTimeMillis();
            w0();
            u0(context);
            x0();
            s0();
        }
    }

    public static final Date w(Bundle bundle, String str, Date date) {
        long jLongValue;
        l.y.c.i.e(date, "dateBase");
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (!(obj instanceof Long)) {
            if (obj instanceof String) {
                try {
                    jLongValue = Long.parseLong((String) obj);
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        jLongValue = ((Number) obj).longValue();
        return jLongValue == 0 ? new Date(Long.MAX_VALUE) : new Date(date.getTime() + (jLongValue * 1000));
    }

    private final void w0() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            String displayName = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
            l.y.c.i.d(displayName, "tz.getDisplayName(tz.inD…(Date()), TimeZone.SHORT)");
            e = displayName;
            l.y.c.i.d(timeZone, "tz");
            String id = timeZone.getID();
            l.y.c.i.d(id, "tz.id");
            f = id;
        } catch (AssertionError | Exception unused) {
        }
    }

    public static final long x(Uri uri) {
        l.y.c.i.e(uri, "contentUri");
        Cursor cursorQuery = null;
        try {
            cursorQuery = com.facebook.r.f().getContentResolver().query(uri, null, null, null, null);
            if (cursorQuery == null) {
                return 0L;
            }
            int columnIndex = cursorQuery.getColumnIndex("_size");
            cursorQuery.moveToFirst();
            long j2 = cursorQuery.getLong(columnIndex);
            cursorQuery.close();
            return j2;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    private final void x0() {
        try {
            if (r()) {
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                l.y.c.i.d(externalStorageDirectory, "path");
                StatFs statFs = new StatFs(externalStorageDirectory.getPath());
                c = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
            }
            c = k(c);
        } catch (Exception unused) {
        }
    }

    public static final Locale y() {
        Locale localeI = I();
        if (localeI != null) {
            return localeI;
        }
        Locale locale = Locale.getDefault();
        l.y.c.i.d(locale, "Locale.getDefault()");
        return locale;
    }

    public static final void y0(Runnable runnable) {
        try {
            com.facebook.r.n().execute(runnable);
        } catch (Exception unused) {
        }
    }

    private final String z() {
        com.facebook.a aVarE = com.facebook.a.p.e();
        return (aVarE == null || aVarE.i() == null) ? "facebook" : aVarE.i();
    }

    public static final void z0(JSONObject jSONObject, com.facebook.internal.b bVar, String str, boolean z, Context context) throws JSONException {
        l.y.c.i.e(jSONObject, "params");
        l.y.c.i.e(context, "context");
        p.b bVar2 = p.b.ServiceUpdateCompliance;
        if (!p.g(bVar2)) {
            jSONObject.put("anon_id", str);
        }
        jSONObject.put("application_tracking_enabled", !z);
        jSONObject.put("advertiser_id_collection_enabled", com.facebook.r.e());
        if (bVar != null) {
            if (p.g(bVar2)) {
                f605h.a(jSONObject, bVar, str, context);
            }
            if (bVar.j() != null) {
                if (p.g(bVar2)) {
                    f605h.b(jSONObject, bVar, context);
                } else {
                    jSONObject.put("attribution", bVar.j());
                }
            }
            if (bVar.h() != null) {
                jSONObject.put("advertiser_id", bVar.h());
                jSONObject.put("advertiser_tracking_enabled", !bVar.k());
            }
            if (!bVar.k()) {
                String strD = com.facebook.j0.p.d();
                if (!(strD.length() == 0)) {
                    jSONObject.put("ud", strD);
                }
            }
            if (bVar.i() != null) {
                jSONObject.put("installer_package", bVar.i());
            }
        }
    }
}
