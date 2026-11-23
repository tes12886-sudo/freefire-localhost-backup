package j.e.b.h.a;

import android.content.Context;
import android.net.Uri;
import j.e.b.f;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    private static final j.e.b.h.a.a.c<f> c = new a();
    private final Uri a;
    private final j.e.b.h.a.a.a b;

    static class a extends b<f> {
        a() {
        }

        @Override // j.e.b.h.a.b
        final /* synthetic */ f b(JSONObject jSONObject) {
            String strOptString = jSONObject.optString("pictureUrl", null);
            return new f(jSONObject.getString("userId"), jSONObject.getString("displayName"), strOptString == null ? null : Uri.parse(strOptString), jSONObject.optString("statusMessage", null));
        }
    }

    public e(Context context, Uri uri) {
        this(uri, new j.e.b.h.a.a.a(context, "4.0.8"));
    }

    private e(Uri uri, j.e.b.h.a.a.a aVar) {
        this.a = uri;
        this.b = aVar;
    }

    public final j.e.b.c<f> a(j.e.b.h.e eVar) {
        Uri uriBuild = this.a.buildUpon().appendPath("profile").build();
        HashMap map = new HashMap(1);
        map.put("Authorization", "Bearer " + eVar.a);
        return this.b.f(uriBuild, map, Collections.emptyMap(), c);
    }
}
