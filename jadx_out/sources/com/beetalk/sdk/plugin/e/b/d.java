package com.beetalk.sdk.plugin.e.b;

import android.app.Activity;
import android.os.AsyncTask;
import com.beetalk.sdk.plugin.PluginResult;
import com.facebook.l;
import com.facebook.n;
import com.facebook.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class d extends com.beetalk.sdk.plugin.e.b.a<C0036d, PluginResult> {

    class a extends PluginResult {
        final /* synthetic */ Exception a;

        a(Exception exc) {
            this.a = exc;
            int iIntValue = com.garena.pay.android.b.SUCCESS.c().intValue();
            this.status = iIntValue;
            this.flag = iIntValue;
            this.message = exc != null ? exc.getMessage() : "Error";
            this.source = d.this.d();
        }
    }

    class b extends PluginResult {
        final /* synthetic */ int a;
        final /* synthetic */ String b;

        b(int i2, String str) {
            this.a = i2;
            this.b = str;
            this.status = i2;
            this.flag = i2;
            this.message = str;
            this.source = d.this.d();
        }
    }

    class c implements l<com.facebook.share.d.a.d> {
        final /* synthetic */ Activity a;

        class a extends PluginResult {
            a() {
                int iIntValue = com.garena.pay.android.b.SUCCESS.c().intValue();
                this.flag = iIntValue;
                this.status = iIntValue;
                this.message = "Successfully shared";
                this.source = d.this.d();
            }
        }

        c(Activity activity) {
            this.a = activity;
        }

        @Override // com.facebook.l
        public void a() {
            d.this.m(com.garena.pay.android.b.USER_CANCELLED.c().intValue(), "User Cancelled", this.a);
        }

        @Override // com.facebook.l
        public void b(n nVar) {
            if (nVar instanceof p) {
                d.this.m(com.garena.pay.android.b.USER_CANCELLED.c().intValue(), "User Cancelled", this.a);
            } else {
                d.this.n(nVar.getMessage(), this.a);
            }
        }

        @Override // com.facebook.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(com.facebook.share.d.a.d dVar) {
            com.beetalk.sdk.plugin.c.k().n(new a(), this.a, d.this.d());
        }
    }

    /* JADX INFO: renamed from: com.beetalk.sdk.plugin.e.b.d$d, reason: collision with other inner class name */
    public static class C0036d {
        public String a;
        public String b;
        public String c;
        public String d;
        public List<String> e;
    }

    private static class e {
        String a;

        private e() {
        }

        /* synthetic */ e(a aVar) {
            this();
        }
    }

    private class f extends AsyncTask<C0036d, Void, List<e>> {
        private Activity a;

        class a extends e {
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f fVar, String str) {
                super(null);
                this.b = str;
                this.a = str;
            }
        }

        private f(Activity activity) {
            this.a = activity;
        }

        /* synthetic */ f(d dVar, Activity activity, a aVar) {
            this(activity);
        }

        private List<e> b(JSONObject jSONObject) throws JSONException {
            JSONArray jSONArray = jSONObject.getJSONArray("friends");
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                arrayList.add(new a(this, jSONArray.getJSONObject(i2).getString("uid")));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<e> doInBackground(C0036d... c0036dArr) {
            JSONObject jSONObjectC = com.beetalk.sdk.z.i.d.c(c0036dArr[0].e);
            if (jSONObjectC == null || !jSONObjectC.has("friends")) {
                d.this.m(com.garena.pay.android.b.NETWORK_CONNECTION_EXCEPTION.c().intValue(), "Cannot Reach Server", this.a);
                return null;
            }
            try {
                return b(jSONObjectC);
            } catch (JSONException e) {
                com.beetalk.sdk.x.a.b(e);
                d.this.n("Exception raised. Cannot Parse the Data", this.a);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(List<e> list) {
            d.this.r(list, this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(int i2, String str, Activity activity) {
        com.beetalk.sdk.plugin.c.k().n(new b(i2, str), activity, d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(String str, Activity activity) {
        m(com.garena.pay.android.b.UNKNOWN_ERROR.c().intValue(), str, activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void r(List<e> list, Activity activity) {
        if (!com.facebook.share.d.a.o()) {
            m(com.garena.pay.android.b.UNKNOWN_ERROR.c().intValue(), "Facebook App Not install", activity);
            return;
        }
        if (list == null) {
            m(com.garena.pay.android.b.UNKNOWN_ERROR.c().intValue(), "Cant get any friends, token scope issue perhaps", activity);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<e> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a);
        }
        com.facebook.share.d.a aVar = new com.facebook.share.d.a(activity);
        aVar.j(this.b, new c(activity));
        com.facebook.share.c.c.C0104c c0104c = new com.facebook.share.c.c.C0104c();
        c0104c.m(((C0036d) this.a).b);
        c0104c.n(((C0036d) this.a).d);
        c0104c.p(((C0036d) this.a).a);
        c0104c.l(((C0036d) this.a).c);
        c0104c.o(arrayList);
        c0104c.k(com.facebook.share.c.c.b.SEND);
        aVar.l(c0104c.j());
    }

    @Override // com.beetalk.sdk.plugin.a
    public String d() {
        return "facebook.share.graph";
    }

    @Override // com.beetalk.sdk.plugin.a
    public Integer e() {
        return com.beetalk.sdk.p.d.d;
    }

    @Override // com.beetalk.sdk.plugin.e.b.a
    public void i(Exception exc, Activity activity) {
        com.beetalk.sdk.x.a.b(exc);
        com.beetalk.sdk.plugin.c.k().n(new a(exc), activity, d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.beetalk.sdk.plugin.e.b.a
    public void k(Activity activity) {
        new f(this, activity, null).execute((C0036d) this.a);
    }
}
