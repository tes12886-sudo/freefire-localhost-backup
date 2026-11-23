package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.facebook.internal.h0;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import l.t.d0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class q implements Parcelable {
    public static final a c = new a(null);
    private Map<String, String> a;
    public l b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(l.y.c.f fVar) {
            this();
        }

        public final com.facebook.a a(Bundle bundle, com.facebook.e eVar, String str) {
            String string;
            l.y.c.i.e(bundle, "bundle");
            l.y.c.i.e(str, "applicationId");
            Date dateW = h0.w(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
            ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            String string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
            Date dateW2 = h0.w(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
            if (string2 != null) {
                if (!(string2.length() == 0) && (string = bundle.getString("com.facebook.platform.extra.USER_ID")) != null) {
                    if (!(string.length() == 0)) {
                        return new com.facebook.a(string2, str, string, stringArrayList, null, null, eVar, dateW, new Date(), dateW2, bundle.getString("graph_domain"));
                    }
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0078  */
        /* JADX WARN: Code duplicated, block: B:29:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:42:0x00f8  */
        public final com.facebook.a b(Collection<String> collection, Bundle bundle, com.facebook.e eVar, String str) {
            Collection<String> collectionC;
            ArrayList arrayListC;
            ArrayList arrayListC2;
            l.y.c.i.e(bundle, "bundle");
            l.y.c.i.e(str, "applicationId");
            Date dateW = h0.w(bundle, "expires_in", new Date());
            String string = bundle.getString("access_token");
            if (string == null) {
                return null;
            }
            l.y.c.i.d(string, "bundle.getString(AccessT…TOKEN_KEY) ?: return null");
            Date dateW2 = h0.w(bundle, "data_access_expiration_time", new Date(0L));
            String string2 = bundle.getString("granted_scopes");
            if (string2 == null) {
                collectionC = collection;
            } else {
                if (string2.length() > 0) {
                    Object[] array = l.d0.q.i0(string2, new String[]{","}, false, 0, 6, null).toArray(new String[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    String[] strArr = (String[]) array;
                    collectionC = l.t.m.c((String[]) Arrays.copyOf(strArr, strArr.length));
                } else {
                    collectionC = collection;
                }
            }
            String string3 = bundle.getString("denied_scopes");
            if (string3 == null) {
                arrayListC = null;
            } else {
                if (string3.length() > 0) {
                    Object[] array2 = l.d0.q.i0(string3, new String[]{","}, false, 0, 6, null).toArray(new String[0]);
                    if (array2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    String[] strArr2 = (String[]) array2;
                    arrayListC = l.t.m.c((String[]) Arrays.copyOf(strArr2, strArr2.length));
                } else {
                    arrayListC = null;
                }
            }
            String string4 = bundle.getString("expired_scopes");
            if (string4 == null) {
                arrayListC2 = null;
            } else {
                if (string4.length() > 0) {
                    Object[] array3 = l.d0.q.i0(string4, new String[]{","}, false, 0, 6, null).toArray(new String[0]);
                    if (array3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    String[] strArr3 = (String[]) array3;
                    arrayListC2 = l.t.m.c((String[]) Arrays.copyOf(strArr3, strArr3.length));
                } else {
                    arrayListC2 = null;
                }
            }
            if (h0.Y(string)) {
                return null;
            }
            return new com.facebook.a(string, str, e(bundle.getString("signed_request")), collectionC, arrayListC, arrayListC2, eVar, dateW, new Date(), dateW2, bundle.getString("graph_domain"));
        }

        public final com.facebook.f c(Bundle bundle, String str) {
            l.y.c.i.e(bundle, "bundle");
            String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
            if (string != null) {
                if (!(string.length() == 0) && str != null) {
                    if (!(str.length() == 0)) {
                        try {
                            return new com.facebook.f(string, str);
                        } catch (Exception e) {
                            throw new com.facebook.n(e.getMessage());
                        }
                    }
                }
            }
            return null;
        }

        public final com.facebook.f d(Bundle bundle, String str) {
            l.y.c.i.e(bundle, "bundle");
            String string = bundle.getString("id_token");
            if (string != null) {
                if (!(string.length() == 0) && str != null) {
                    if (!(str.length() == 0)) {
                        try {
                            return new com.facebook.f(string, str);
                        } catch (Exception e) {
                            throw new com.facebook.n(e.getMessage(), e);
                        }
                    }
                }
            }
            return null;
        }

        public final String e(String str) {
            if (str != null) {
                if (!(str.length() == 0)) {
                    try {
                        Object[] array = l.d0.q.i0(str, new String[]{"."}, false, 0, 6, null).toArray(new String[0]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                        String[] strArr = (String[]) array;
                        if (strArr.length == 2) {
                            byte[] bArrDecode = Base64.decode(strArr[1], 0);
                            l.y.c.i.d(bArrDecode, "data");
                            String string = new JSONObject(new String(bArrDecode, l.d0.d.b)).getString("user_id");
                            l.y.c.i.d(string, "jsonObject.getString(\"user_id\")");
                            return string;
                        }
                        throw new com.facebook.n("Failed to retrieve user_id from signed_request");
                    } catch (UnsupportedEncodingException | JSONException unused) {
                    }
                }
            }
            throw new com.facebook.n("Authorization response does not contain the signed_request");
        }
    }

    protected q(Parcel parcel) {
        l.y.c.i.e(parcel, "source");
        Map<String, String> mapR0 = h0.r0(parcel);
        this.a = mapR0 != null ? d0.n(mapR0) : null;
    }

    public q(l lVar) {
        l.y.c.i.e(lVar, "loginClient");
        this.b = lVar;
    }

    public static final com.facebook.a c(Bundle bundle, com.facebook.e eVar, String str) {
        return c.a(bundle, eVar, str);
    }

    public static final com.facebook.a d(Collection<String> collection, Bundle bundle, com.facebook.e eVar, String str) {
        return c.b(collection, bundle, eVar, str);
    }

    public static final com.facebook.f e(Bundle bundle, String str) {
        return c.c(bundle, str);
    }

    public static final com.facebook.f f(Bundle bundle, String str) {
        return c.d(bundle, str);
    }

    protected void a(String str, Object obj) {
        if (this.a == null) {
            this.a = new HashMap();
        }
        Map<String, String> map = this.a;
        if (map != null) {
            map.put(str, obj != null ? obj.toString() : null);
        }
    }

    public void b() {
    }

    protected String g(String str) {
        l.y.c.i.e(str, "authId");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", str);
            jSONObject.put("3_method", j());
            n(jSONObject);
        } catch (JSONException e) {
            Log.w("LoginMethodHandler", "Error creating client state json: " + e.getMessage());
        }
        String string = jSONObject.toString();
        l.y.c.i.d(string, "param.toString()");
        return string;
    }

    public final l h() {
        l lVar = this.b;
        if (lVar != null) {
            return lVar;
        }
        l.y.c.i.q("loginClient");
        throw null;
    }

    public final Map<String, String> i() {
        return this.a;
    }

    public abstract String j();

    protected void k(String str) {
        l lVar = this.b;
        if (lVar == null) {
            l.y.c.i.q("loginClient");
            throw null;
        }
        l.d dVarQ = lVar.q();
        l.y.c.i.d(dVarQ, "loginClient.getPendingRequest()");
        String strA = dVarQ.a();
        l lVar2 = this.b;
        if (lVar2 == null) {
            l.y.c.i.q("loginClient");
            throw null;
        }
        com.facebook.j0.m mVar = new com.facebook.j0.m(lVar2.i(), strA);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", str);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString("app_id", strA);
        mVar.h("fb_dialogs_web_login_dialog_complete", null, bundle);
    }

    public boolean l() {
        return false;
    }

    public boolean m(int i2, int i3, Intent intent) {
        return false;
    }

    public void n(JSONObject jSONObject) {
        l.y.c.i.e(jSONObject, "param");
    }

    public final void o(l lVar) {
        l.y.c.i.e(lVar, "<set-?>");
        this.b = lVar;
    }

    public boolean p() {
        return false;
    }

    public abstract int q(l.d dVar);

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        l.y.c.i.e(parcel, "dest");
        h0.E0(parcel, this.a);
    }
}
