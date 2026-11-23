package com.facebook.share.b;

import android.os.Bundle;
import com.facebook.internal.h0;
import com.facebook.internal.i0;
import com.facebook.share.c.u;
import com.facebook.share.c.v;
import com.facebook.share.c.x;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class h {
    private static Bundle a(com.facebook.share.c.d dVar, Bundle bundle, boolean z) {
        Bundle bundleL = l(dVar, z);
        h0.o0(bundleL, "effect_id", dVar.i());
        if (bundle != null) {
            bundleL.putBundle("effect_textures", bundle);
        }
        try {
            JSONObject jSONObjectA = b.a(dVar.h());
            if (jSONObjectA != null) {
                h0.o0(bundleL, "effect_arguments", jSONObjectA.toString());
            }
            return bundleL;
        } catch (JSONException e) {
            throw new com.facebook.n("Unable to create a JSON Object from the provided CameraEffectArguments: " + e.getMessage());
        }
    }

    private static Bundle b(com.facebook.share.c.g gVar, boolean z) {
        Bundle bundleL = l(gVar, z);
        h0.o0(bundleL, "TITLE", gVar.i());
        h0.o0(bundleL, "DESCRIPTION", gVar.h());
        h0.p0(bundleL, "IMAGE", gVar.j());
        h0.o0(bundleL, "QUOTE", gVar.k());
        h0.p0(bundleL, "MESSENGER_LINK", gVar.a());
        h0.p0(bundleL, "TARGET_DISPLAY", gVar.a());
        return bundleL;
    }

    private static Bundle c(com.facebook.share.c.i iVar, List<Bundle> list, boolean z) {
        Bundle bundleL = l(iVar, z);
        bundleL.putParcelableArrayList("MEDIA", new ArrayList<>(list));
        return bundleL;
    }

    private static Bundle d(com.facebook.share.c.k kVar, boolean z) {
        Bundle bundleL = l(kVar, z);
        try {
            g.b(bundleL, kVar);
            return bundleL;
        } catch (JSONException e) {
            throw new com.facebook.n("Unable to create a JSON Object from the provided ShareMessengerGenericTemplateContent: " + e.getMessage());
        }
    }

    private static Bundle e(com.facebook.share.c.m mVar, boolean z) {
        Bundle bundleL = l(mVar, z);
        try {
            g.d(bundleL, mVar);
            return bundleL;
        } catch (JSONException e) {
            throw new com.facebook.n("Unable to create a JSON Object from the provided ShareMessengerMediaTemplateContent: " + e.getMessage());
        }
    }

    private static Bundle f(com.facebook.share.c.n nVar, boolean z) {
        Bundle bundleL = l(nVar, z);
        try {
            g.f(bundleL, nVar);
            return bundleL;
        } catch (JSONException e) {
            throw new com.facebook.n("Unable to create a JSON Object from the provided ShareMessengerOpenGraphMusicTemplateContent: " + e.getMessage());
        }
    }

    private static Bundle g(com.facebook.share.c.q qVar, JSONObject jSONObject, boolean z) {
        Bundle bundleL = l(qVar, z);
        h0.o0(bundleL, "PREVIEW_PROPERTY_NAME", (String) o.f(qVar.i()).second);
        h0.o0(bundleL, "ACTION_TYPE", qVar.h().e());
        h0.o0(bundleL, "ACTION", jSONObject.toString());
        return bundleL;
    }

    private static Bundle h(u uVar, List<String> list, boolean z) {
        Bundle bundleL = l(uVar, z);
        bundleL.putStringArrayList("PHOTOS", new ArrayList<>(list));
        return bundleL;
    }

    private static Bundle i(v vVar, Bundle bundle, Bundle bundle2, boolean z) {
        Bundle bundleL = l(vVar, z);
        if (bundle != null) {
            bundleL.putParcelable("bg_asset", bundle);
        }
        if (bundle2 != null) {
            bundleL.putParcelable("interactive_asset_uri", bundle2);
        }
        List<String> listJ = vVar.j();
        if (!h0.Z(listJ)) {
            bundleL.putStringArrayList("top_background_color_list", new ArrayList<>(listJ));
        }
        h0.o0(bundleL, "content_url", vVar.h());
        return bundleL;
    }

    private static Bundle j(x xVar, String str, boolean z) {
        Bundle bundleL = l(xVar, z);
        h0.o0(bundleL, "TITLE", xVar.i());
        h0.o0(bundleL, "DESCRIPTION", xVar.h());
        h0.o0(bundleL, "VIDEO", str);
        return bundleL;
    }

    public static Bundle k(UUID uuid, com.facebook.share.c.e eVar, boolean z) {
        i0.m(eVar, "shareContent");
        i0.m(uuid, "callId");
        if (eVar instanceof com.facebook.share.c.g) {
            return b((com.facebook.share.c.g) eVar, z);
        }
        if (eVar instanceof u) {
            u uVar = (u) eVar;
            return h(uVar, o.i(uVar, uuid), z);
        }
        if (eVar instanceof x) {
            x xVar = (x) eVar;
            return j(xVar, o.o(xVar, uuid), z);
        }
        if (eVar instanceof com.facebook.share.c.q) {
            com.facebook.share.c.q qVar = (com.facebook.share.c.q) eVar;
            try {
                return g(qVar, o.z(o.A(uuid, qVar), false), z);
            } catch (JSONException e) {
                throw new com.facebook.n("Unable to create a JSON Object from the provided ShareOpenGraphContent: " + e.getMessage());
            }
        }
        if (eVar instanceof com.facebook.share.c.i) {
            com.facebook.share.c.i iVar = (com.facebook.share.c.i) eVar;
            return c(iVar, o.g(iVar, uuid), z);
        }
        if (eVar instanceof com.facebook.share.c.d) {
            com.facebook.share.c.d dVar = (com.facebook.share.c.d) eVar;
            return a(dVar, o.m(dVar, uuid), z);
        }
        if (eVar instanceof com.facebook.share.c.k) {
            return d((com.facebook.share.c.k) eVar, z);
        }
        if (eVar instanceof com.facebook.share.c.n) {
            return f((com.facebook.share.c.n) eVar, z);
        }
        if (eVar instanceof com.facebook.share.c.m) {
            return e((com.facebook.share.c.m) eVar, z);
        }
        if (!(eVar instanceof v)) {
            return null;
        }
        v vVar = (v) eVar;
        return i(vVar, o.e(vVar, uuid), o.l(vVar, uuid), z);
    }

    private static Bundle l(com.facebook.share.c.e eVar, boolean z) {
        Bundle bundle = new Bundle();
        h0.p0(bundle, "LINK", eVar.a());
        h0.o0(bundle, "PLACE", eVar.d());
        h0.o0(bundle, "PAGE", eVar.b());
        h0.o0(bundle, "REF", eVar.e());
        bundle.putBoolean("DATA_FAILURES_FATAL", z);
        List<String> listC = eVar.c();
        if (!h0.Z(listC)) {
            bundle.putStringArrayList("FRIENDS", new ArrayList<>(listC));
        }
        com.facebook.share.c.f fVarF = eVar.f();
        if (fVarF != null) {
            h0.o0(bundle, "HASHTAG", fVarF.a());
        }
        return bundle;
    }
}
