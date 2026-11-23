package j.e.b.i;

import android.content.Context;
import android.content.Intent;
import com.linecorp.linesdk.auth.internal.LineAuthenticationActivity;
import j.e.b.h.d;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public static Intent a(Context context, a aVar, List<String> list) {
        if (!aVar.d()) {
            d.b(context);
        }
        return LineAuthenticationActivity.a(context, aVar, list);
    }

    public static Intent b(Context context, String str) {
        return a(context, new a.b(str).f(), Collections.emptyList());
    }

    public static c c(Intent intent) {
        return intent == null ? new c(j.e.b.d.INTERNAL_ERROR, new j.e.b.b("Callback intent is null")) : LineAuthenticationActivity.b(intent);
    }
}
