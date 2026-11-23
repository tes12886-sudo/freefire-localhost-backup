package com.facebook.share.b;

import android.os.Bundle;
import com.facebook.internal.h0;
import com.facebook.share.c.t;
import com.facebook.share.c.u;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class q {

    static class a implements h0.b<t, String> {
        a() {
        }

        @Override // com.facebook.internal.h0.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String apply(t tVar) {
            return tVar.e().toString();
        }
    }

    public static Bundle a(com.facebook.share.c.c cVar) {
        Bundle bundle = new Bundle();
        h0.o0(bundle, "message", cVar.d());
        h0.m0(bundle, "to", cVar.f());
        h0.o0(bundle, "title", cVar.h());
        h0.o0(bundle, "data", cVar.b());
        if (cVar.a() != null) {
            h0.o0(bundle, "action_type", cVar.a().toString().toLowerCase(Locale.ENGLISH));
        }
        h0.o0(bundle, "object_id", cVar.e());
        if (cVar.c() != null) {
            h0.o0(bundle, "filters", cVar.c().toString().toLowerCase(Locale.ENGLISH));
        }
        h0.m0(bundle, "suggestions", cVar.g());
        return bundle;
    }

    public static Bundle b(com.facebook.share.c.g gVar) {
        Bundle bundleE = e(gVar);
        h0.p0(bundleE, "href", gVar.a());
        h0.o0(bundleE, "quote", gVar.k());
        return bundleE;
    }

    public static Bundle c(com.facebook.share.c.q qVar) {
        Bundle bundleE = e(qVar);
        h0.o0(bundleE, "action_type", qVar.h().e());
        try {
            JSONObject jSONObjectZ = o.z(o.B(qVar), false);
            if (jSONObjectZ != null) {
                h0.o0(bundleE, "action_properties", jSONObjectZ.toString());
            }
            return bundleE;
        } catch (JSONException e) {
            throw new com.facebook.n("Unable to serialize the ShareOpenGraphContent to JSON", e);
        }
    }

    public static Bundle d(u uVar) {
        Bundle bundleE = e(uVar);
        String[] strArr = new String[uVar.h().size()];
        h0.h0(uVar.h(), new a()).toArray(strArr);
        bundleE.putStringArray("media", strArr);
        return bundleE;
    }

    public static Bundle e(com.facebook.share.c.e eVar) {
        Bundle bundle = new Bundle();
        com.facebook.share.c.f fVarF = eVar.f();
        if (fVarF != null) {
            h0.o0(bundle, "hashtag", fVarF.a());
        }
        return bundle;
    }

    public static Bundle f(n nVar) {
        Bundle bundle = new Bundle();
        h0.o0(bundle, "to", nVar.n());
        h0.o0(bundle, "link", nVar.h());
        h0.o0(bundle, "picture", nVar.m());
        h0.o0(bundle, "source", nVar.l());
        h0.o0(bundle, "name", nVar.k());
        h0.o0(bundle, "caption", nVar.i());
        h0.o0(bundle, "description", nVar.j());
        return bundle;
    }

    public static Bundle g(com.facebook.share.c.g gVar) {
        Bundle bundle = new Bundle();
        h0.o0(bundle, "name", gVar.i());
        h0.o0(bundle, "description", gVar.h());
        h0.o0(bundle, "link", h0.K(gVar.a()));
        h0.o0(bundle, "picture", h0.K(gVar.j()));
        h0.o0(bundle, "quote", gVar.k());
        if (gVar.f() != null) {
            h0.o0(bundle, "hashtag", gVar.f().a());
        }
        return bundle;
    }
}
