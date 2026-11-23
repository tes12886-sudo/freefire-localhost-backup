package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.cct.c;
import com.google.firebase.components.n;
import com.google.firebase.components.o;
import com.google.firebase.components.q;
import com.google.firebase.components.r;
import com.google.firebase.components.t;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class TransportRegistrar implements r {
    static /* synthetic */ TransportFactory a(o oVar) {
        com.google.android.datatransport.h.r.f((Context) oVar.a(Context.class));
        return com.google.android.datatransport.h.r.c().g(c.f833g);
    }

    @Override // com.google.firebase.components.r
    public List<n<?>> getComponents() {
        n.b bVarA = n.a(TransportFactory.class);
        bVarA.b(t.j(Context.class));
        bVarA.f(new q() { // from class: com.google.firebase.datatransport.a
            @Override // com.google.firebase.components.q
            public final Object a(o oVar) {
                return TransportRegistrar.a(oVar);
            }
        });
        return Collections.singletonList(bVarA.d());
    }
}
