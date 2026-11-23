package com.facebook.j0.t;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import com.facebook.r;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l.d0.q;
import l.y.c.i;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final d f = new d();
    private static final HashMap<String, Method> a = new HashMap<>();
    private static final HashMap<String, Class<?>> b = new HashMap<>();
    private static final String c = r.f().getPackageName();
    private static final SharedPreferences d = r.f().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
    private static final SharedPreferences e = r.f().getSharedPreferences("com.facebook.internal.PURCHASE", 0);

    private d() {
    }

    public static final Object a(Context context, IBinder iBinder) {
        if (com.facebook.internal.m0.i.a.d(d.class)) {
            return null;
        }
        try {
            i.e(context, "context");
            return f.n(context, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{iBinder});
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, d.class);
            return null;
        }
    }

    public static final void b() {
        SharedPreferences.Editor editorPutLong;
        if (com.facebook.internal.m0.i.a.d(d.class)) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = d;
            long j2 = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
            if (j2 == 0) {
                editorPutLong = sharedPreferences.edit().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis);
            } else if (jCurrentTimeMillis - j2 <= 604800) {
                return;
            } else {
                editorPutLong = sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis);
            }
            editorPutLong.apply();
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, d.class);
        }
    }

    private final ArrayList<String> c(ArrayList<String> arrayList) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList2 = new ArrayList<>();
            SharedPreferences.Editor editorEdit = e.edit();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            for (String str : arrayList) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String string = jSONObject.getString("productId");
                    long j2 = jSONObject.getLong("purchaseTime");
                    String string2 = jSONObject.getString("purchaseToken");
                    if (jCurrentTimeMillis - (j2 / 1000) <= 86400 && !i.a(e.getString(string, ""), string2)) {
                        editorEdit.putString(string, string2);
                        arrayList2.add(str);
                    }
                } catch (JSONException unused) {
                }
            }
            editorEdit.apply();
            return arrayList2;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    private final Class<?> d(Context context, String str) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            HashMap<String, Class<?>> map = b;
            Class<?> clsLoadClass = map.get(str);
            if (clsLoadClass != null) {
                return clsLoadClass;
            }
            try {
                clsLoadClass = context.getClassLoader().loadClass(str);
                i.d(clsLoadClass, "classObj");
                map.put(str, clsLoadClass);
                return clsLoadClass;
            } catch (ClassNotFoundException unused) {
                return clsLoadClass;
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    private final Method e(Class<?> cls, String str) {
        Class[] clsArr;
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            HashMap<String, Method> map = a;
            Method declaredMethod = map.get(str);
            if (declaredMethod != null) {
                return declaredMethod;
            }
            try {
                switch (str) {
                    case "getPurchases":
                        Class cls2 = Integer.TYPE;
                        i.d(cls2, "Integer.TYPE");
                        clsArr = new Class[]{cls2, String.class, String.class, String.class};
                        break;
                    case "isBillingSupported":
                        Class cls3 = Integer.TYPE;
                        i.d(cls3, "Integer.TYPE");
                        clsArr = new Class[]{cls3, String.class, String.class};
                        break;
                    case "asInterface":
                        clsArr = new Class[]{IBinder.class};
                        break;
                    case "getPurchaseHistory":
                        Class cls4 = Integer.TYPE;
                        i.d(cls4, "Integer.TYPE");
                        clsArr = new Class[]{cls4, String.class, String.class, String.class, Bundle.class};
                        break;
                    case "getSkuDetails":
                        Class cls5 = Integer.TYPE;
                        i.d(cls5, "Integer.TYPE");
                        clsArr = new Class[]{cls5, String.class, String.class, Bundle.class};
                        break;
                    default:
                        clsArr = null;
                        break;
                }
                declaredMethod = clsArr == null ? cls.getDeclaredMethod(str, null) : cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
                map.put(str, declaredMethod);
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                return declaredMethod;
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0098  */
    private final ArrayList<String> f(Context context, Object obj, String str) {
        ArrayList<String> stringArrayList;
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            if (o(context, obj, str)) {
                String string = null;
                int i2 = 0;
                boolean z = false;
                do {
                    Object objN = n(context, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj, new Object[]{6, c, str, string, new Bundle()});
                    if (objN != null) {
                        long j2 = 1000;
                        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                        Bundle bundle = (Bundle) objN;
                        if (bundle.getInt("RESPONSE_CODE") != 0 || (stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) == null) {
                            string = null;
                        } else {
                            i.d(stringArrayList, "purchaseDetails.getStrin…SE_DATA_LIST) ?: continue");
                            for (String str2 : stringArrayList) {
                                try {
                                    if (jCurrentTimeMillis - (new JSONObject(str2).getLong("purchaseTime") / j2) > 1200) {
                                        z = true;
                                        break;
                                    }
                                    arrayList.add(str2);
                                    i2++;
                                } catch (JSONException unused) {
                                }
                                j2 = 1000;
                            }
                            string = bundle.getString("INAPP_CONTINUATION_TOKEN");
                        }
                    } else {
                        string = null;
                    }
                    if (i2 >= 30 || string == null) {
                        break;
                    }
                } while (!z);
            }
            return arrayList;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    public static final ArrayList<String> g(Context context, Object obj) {
        d dVar;
        Class<?> clsD;
        if (com.facebook.internal.m0.i.a.d(d.class)) {
            return null;
        }
        try {
            i.e(context, "context");
            ArrayList<String> arrayList = new ArrayList<>();
            return (obj == null || (clsD = (dVar = f).d(context, "com.android.vending.billing.IInAppBillingService")) == null || dVar.e(clsD, "getPurchaseHistory") == null) ? arrayList : dVar.c(dVar.f(context, obj, "inapp"));
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, d.class);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0060 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:30:0x0062 A[EDGE_INSN: B:30:0x0062->B:23:0x0062 BREAK  A[LOOP:0: B:11:0x0019->B:32:?], SYNTHETIC] */
    private final ArrayList<String> h(Context context, Object obj, String str) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            if (obj != null && o(context, obj, str)) {
                String string = null;
                int size = 0;
                do {
                    Object objN = n(context, "com.android.vending.billing.IInAppBillingService", "getPurchases", obj, new Object[]{3, c, str, string});
                    if (objN == null) {
                        string = null;
                        if (size < 30) {
                            break;
                            break;
                        }
                    } else {
                        Bundle bundle = (Bundle) objN;
                        if (bundle.getInt("RESPONSE_CODE") == 0) {
                            ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                            if (stringArrayList == null) {
                                break;
                            }
                            size += stringArrayList.size();
                            arrayList.addAll(stringArrayList);
                            string = bundle.getString("INAPP_CONTINUATION_TOKEN");
                        } else {
                            string = null;
                        }
                        if (size < 30) {
                            break;
                        }
                    }
                } while (string != null);
            }
            return arrayList;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    public static final ArrayList<String> i(Context context, Object obj) {
        if (com.facebook.internal.m0.i.a.d(d.class)) {
            return null;
        }
        try {
            i.e(context, "context");
            d dVar = f;
            return dVar.c(dVar.h(context, obj, "inapp"));
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, d.class);
            return null;
        }
    }

    public static final ArrayList<String> j(Context context, Object obj) {
        if (com.facebook.internal.m0.i.a.d(d.class)) {
            return null;
        }
        try {
            i.e(context, "context");
            d dVar = f;
            return dVar.c(dVar.h(context, obj, "subs"));
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, d.class);
            return null;
        }
    }

    public static final Map<String, String> k(Context context, ArrayList<String> arrayList, Object obj, boolean z) {
        if (com.facebook.internal.m0.i.a.d(d.class)) {
            return null;
        }
        try {
            i.e(context, "context");
            i.e(arrayList, "skuList");
            Map<String, String> mapP = f.p(arrayList);
            ArrayList<String> arrayList2 = new ArrayList<>();
            for (String str : arrayList) {
                if (!mapP.containsKey(str)) {
                    arrayList2.add(str);
                }
            }
            mapP.putAll(f.l(context, arrayList2, obj, z));
            return mapP;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, d.class);
            return null;
        }
    }

    private final Map<String, String> l(Context context, ArrayList<String> arrayList, Object obj, boolean z) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            Map<String, String> linkedHashMap = new LinkedHashMap<>();
            if (obj != null && !arrayList.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
                Object[] objArr = new Object[4];
                objArr[0] = 3;
                objArr[1] = c;
                objArr[2] = z ? "subs" : "inapp";
                objArr[3] = bundle;
                Object objN = n(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, objArr);
                if (objN != null) {
                    Bundle bundle2 = (Bundle) objN;
                    if (bundle2.getInt("RESPONSE_CODE") == 0) {
                        ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList != null && arrayList.size() == stringArrayList.size()) {
                            int size = arrayList.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                String str = arrayList.get(i2);
                                i.d(str, "skuList[i]");
                                String str2 = stringArrayList.get(i2);
                                i.d(str2, "skuDetailsList[i]");
                                linkedHashMap.put(str, str2);
                            }
                        }
                        q(linkedHashMap);
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    private final Object n(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method methodE;
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            Class<?> clsD = d(context, str);
            if (clsD != null && (methodE = e(clsD, str2)) != null) {
                if (obj != null) {
                    obj = clsD.cast(obj);
                }
                try {
                    return methodE.invoke(obj, Arrays.copyOf(objArr, objArr.length));
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    private final boolean o(Context context, Object obj, String str) {
        if (com.facebook.internal.m0.i.a.d(this) || obj == null) {
            return false;
        }
        try {
            Object objN = n(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, c, str});
            return objN != null && ((Integer) objN).intValue() == 0;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return false;
        }
    }

    private final Map<String, String> p(ArrayList<String> arrayList) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            for (String str : arrayList) {
                String string = d.getString(str, null);
                if (string != null) {
                    List listI0 = q.i0(string, new String[]{";"}, false, 2, 2, null);
                    if (jCurrentTimeMillis - Long.parseLong((String) listI0.get(0)) < 43200) {
                        i.d(str, "sku");
                        linkedHashMap.put(str, listI0.get(1));
                    } else {
                        continue;
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    private final void q(Map<String, String> map) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences.Editor editorEdit = d.edit();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                editorEdit.putString(entry.getKey(), jCurrentTimeMillis + ';' + entry.getValue());
            }
            editorEdit.apply();
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
        }
    }

    public final boolean m(String str) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return false;
        }
        try {
            i.e(str, "skuDetail");
            try {
                String strOptString = new JSONObject(str).optString("freeTrialPeriod");
                if (strOptString != null) {
                    return strOptString.length() > 0;
                }
                return false;
            } catch (JSONException unused) {
                return false;
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return false;
        }
    }
}
