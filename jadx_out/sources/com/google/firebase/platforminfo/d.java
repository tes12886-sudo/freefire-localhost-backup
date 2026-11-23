package com.google.firebase.platforminfo;

import com.google.firebase.components.n;
import com.google.firebase.components.o;
import com.google.firebase.components.q;
import com.google.firebase.components.t;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class d implements h {
    private final String a;
    private final GlobalLibraryVersionRegistrar b;

    d(Set<f> set, GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar) {
        this.a = d(set);
        this.b = globalLibraryVersionRegistrar;
    }

    public static n<h> b() {
        n.b bVarA = n.a(h.class);
        bVarA.b(t.k(f.class));
        bVarA.f(new q() { // from class: com.google.firebase.platforminfo.a
            @Override // com.google.firebase.components.q
            public final Object a(o oVar) {
                return d.c(oVar);
            }
        });
        return bVarA.d();
    }

    static /* synthetic */ h c(o oVar) {
        return new d(oVar.b(f.class), GlobalLibraryVersionRegistrar.getInstance());
    }

    private static String d(Set<f> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<f> it = set.iterator();
        while (it.hasNext()) {
            f next = it.next();
            sb.append(next.b());
            sb.append('/');
            sb.append(next.c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // com.google.firebase.platforminfo.h
    public String a() {
        if (this.b.getRegisteredVersions().isEmpty()) {
            return this.a;
        }
        return this.a + ' ' + d(this.b.getRegisteredVersions());
    }
}
