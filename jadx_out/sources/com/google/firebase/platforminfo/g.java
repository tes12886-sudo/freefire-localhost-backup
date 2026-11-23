package com.google.firebase.platforminfo;

import android.content.Context;
import com.google.firebase.components.n;
import com.google.firebase.components.o;
import com.google.firebase.components.q;
import com.google.firebase.components.t;

/* JADX INFO: loaded from: classes.dex */
public class g {

    public interface a<T> {
        String a(T t);
    }

    public static n<?> a(String str, String str2) {
        return n.g(f.a(str, str2), f.class);
    }

    public static n<?> b(final String str, final a<Context> aVar) {
        n.b bVarH = n.h(f.class);
        bVarH.b(t.j(Context.class));
        bVarH.f(new q() { // from class: com.google.firebase.platforminfo.b
            @Override // com.google.firebase.components.q
            public final Object a(o oVar) {
                return f.a(str, aVar.a((Context) oVar.a(Context.class)));
            }
        });
        return bVarH.d();
    }
}
