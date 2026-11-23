package j.e.b.h.a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import j.e.b.h.f;
import j.e.b.h.g;
import j.e.b.h.h;
import java.util.Arrays;
import java.util.Collections;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final j.e.b.h.a.a.c<g> c;
    public static final j.e.b.h.a.a.c<f> d;
    public final Uri a;
    public final j.e.b.h.a.a.a b;

    private static class a extends j.e.b.h.a.b<f> {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        @Override // j.e.b.h.a.b
        final /* synthetic */ f b(JSONObject jSONObject) throws JSONException {
            String string = jSONObject.getString(j.c.a.a.EXTRA_TOKEN_TYPE);
            if ("Bearer".equals(string)) {
                String strOptString = jSONObject.optString("scope");
                return new f(new j.e.b.h.e(jSONObject.getString("access_token"), jSONObject.getLong("expires_in") * 1000, System.currentTimeMillis(), jSONObject.getString("refresh_token")), TextUtils.isEmpty(strOptString) ? Collections.emptyList() : Arrays.asList(strOptString.split(" ")));
            }
            throw new JSONException("Illegal token type. token_type=" + string);
        }
    }

    private static class b extends j.e.b.h.a.b<g> {
        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }

        @Override // j.e.b.h.a.b
        final /* synthetic */ g b(JSONObject jSONObject) {
            return new g(jSONObject.getString("otpId"), jSONObject.getString("otp"));
        }
    }

    /* JADX INFO: renamed from: j.e.b.h.a.c$c, reason: collision with other inner class name */
    private static class C0249c extends j.e.b.h.a.b<h> {
        private C0249c() {
        }

        /* synthetic */ C0249c(byte b) {
            this();
        }

        @Override // j.e.b.h.a.b
        final /* synthetic */ h b(JSONObject jSONObject) throws JSONException {
            String string = jSONObject.getString(j.c.a.a.EXTRA_TOKEN_TYPE);
            if ("Bearer".equals(string)) {
                return new h(jSONObject.getString("access_token"), jSONObject.getLong("expires_in") * 1000, jSONObject.optString("refresh_token"));
            }
            throw new JSONException("Illegal token type. token_type=" + string);
        }
    }

    private static class d extends j.e.b.h.a.b<j.e.b.h.c> {
        private d() {
        }

        /* synthetic */ d(byte b) {
            this();
        }

        @Override // j.e.b.h.a.b
        final /* synthetic */ j.e.b.h.c b(JSONObject jSONObject) {
            String strOptString = jSONObject.optString("scope");
            return new j.e.b.h.c(jSONObject.getString("client_id"), jSONObject.getLong("expires_in") * 1000, TextUtils.isEmpty(strOptString) ? Collections.emptyList() : Arrays.asList(strOptString.split(" ")));
        }
    }

    static {
        byte b2 = 0;
        c = new b(b2);
        d = new a(b2);
        new d(b2);
        new C0249c(b2);
    }

    public c(Context context, Uri uri) {
        this(uri, new j.e.b.h.a.a.a(context, "4.0.8"));
    }

    private c(Uri uri, j.e.b.h.a.a.a aVar) {
        this.a = uri;
        this.b = aVar;
    }
}
