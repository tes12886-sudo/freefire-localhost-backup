package j.d.a.c.b.a;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.i;
import com.google.android.gms.common.internal.d;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class g extends com.google.android.gms.common.api.a.AbstractC0120a<i, GoogleSignInOptions> {
    g() {
    }

    @Override // com.google.android.gms.common.api.a.e
    public final /* synthetic */ List a(Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        return googleSignInOptions == null ? Collections.emptyList() : googleSignInOptions.j();
    }

    @Override // com.google.android.gms.common.api.a.AbstractC0120a
    public final /* synthetic */ com.google.android.gms.common.api.a.f c(Context context, Looper looper, d dVar, GoogleSignInOptions googleSignInOptions, com.google.android.gms.common.api.e.b bVar, com.google.android.gms.common.api.e.c cVar) {
        return new i(context, looper, dVar, googleSignInOptions, bVar, cVar);
    }
}
