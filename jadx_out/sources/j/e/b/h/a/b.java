package j.e.b.h.a;

import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
abstract class b<T> implements j.e.b.h.a.a.c<T> {
    private final j.e.b.h.a.a.b a;

    b() {
        this(new j.e.b.h.a.a.b());
    }

    private b(j.e.b.h.a.a.b bVar) {
        this.a = bVar;
    }

    @Override // j.e.b.h.a.a.c
    public final T a(InputStream inputStream) throws IOException {
        try {
            return b(this.a.a(inputStream));
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }

    abstract T b(JSONObject jSONObject);
}
