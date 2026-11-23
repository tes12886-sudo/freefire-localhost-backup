package com.facebook.share.b;

import android.os.Bundle;
import com.facebook.internal.h0;
import com.facebook.internal.i0;
import com.facebook.share.c.u;
import com.facebook.share.c.x;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class e {
    private static Bundle a(com.facebook.share.c.g gVar, boolean z) {
        Bundle bundleF = f(gVar, z);
        h0.o0(bundleF, "com.facebook.platform.extra.TITLE", gVar.i());
        h0.o0(bundleF, "com.facebook.platform.extra.DESCRIPTION", gVar.h());
        h0.p0(bundleF, "com.facebook.platform.extra.IMAGE", gVar.j());
        return bundleF;
    }

    private static Bundle b(com.facebook.share.c.q qVar, JSONObject jSONObject, boolean z) {
        Bundle bundleF = f(qVar, z);
        h0.o0(bundleF, "com.facebook.platform.extra.PREVIEW_PROPERTY_NAME", qVar.i());
        h0.o0(bundleF, "com.facebook.platform.extra.ACTION_TYPE", qVar.h().e());
        h0.o0(bundleF, "com.facebook.platform.extra.ACTION", jSONObject.toString());
        return bundleF;
    }

    private static Bundle c(u uVar, List<String> list, boolean z) {
        Bundle bundleF = f(uVar, z);
        bundleF.putStringArrayList("com.facebook.platform.extra.PHOTOS", new ArrayList<>(list));
        return bundleF;
    }

    private static Bundle d(x xVar, boolean z) {
        return null;
    }

    public static Bundle e(UUID uuid, com.facebook.share.c.e eVar, boolean z) {
        i0.m(eVar, "shareContent");
        i0.m(uuid, "callId");
        if (eVar instanceof com.facebook.share.c.g) {
            return a((com.facebook.share.c.g) eVar, z);
        }
        if (eVar instanceof u) {
            u uVar = (u) eVar;
            return c(uVar, o.i(uVar, uuid), z);
        }
        if (eVar instanceof x) {
            return d((x) eVar, z);
        }
        if (!(eVar instanceof com.facebook.share.c.q)) {
            return null;
        }
        com.facebook.share.c.q qVar = (com.facebook.share.c.q) eVar;
        try {
            return b(qVar, o.A(uuid, qVar), z);
        } catch (JSONException e) {
            throw new com.facebook.n("Unable to create a JSON Object from the provided ShareOpenGraphContent: " + e.getMessage());
        }
    }

    private static Bundle f(com.facebook.share.c.e eVar, boolean z) {
        Bundle bundle = new Bundle();
        h0.p0(bundle, "com.facebook.platform.extra.LINK", eVar.a());
        h0.o0(bundle, "com.facebook.platform.extra.PLACE", eVar.d());
        h0.o0(bundle, "com.facebook.platform.extra.REF", eVar.e());
        bundle.putBoolean("com.facebook.platform.extra.DATA_FAILURES_FATAL", z);
        List<String> listC = eVar.c();
        if (!h0.Z(listC)) {
            bundle.putStringArrayList("com.facebook.platform.extra.FRIENDS", new ArrayList<>(listC));
        }
        return bundle;
    }
}
