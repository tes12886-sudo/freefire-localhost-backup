package j.e.b.h.a.a;

import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class b implements c<JSONObject> {
    private final d a = new d();

    @Override // j.e.b.h.a.a.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final JSONObject a(InputStream inputStream) throws IOException {
        try {
            return new JSONObject(this.a.a(inputStream));
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }
}
