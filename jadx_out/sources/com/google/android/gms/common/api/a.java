package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a.d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class a<O extends d> {
    private final AbstractC0120a a;
    private final g b;
    private final String c;

    /* JADX INFO: renamed from: com.google.android.gms.common.api.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0120a<T extends f, O> extends e<T, O> {
        @Deprecated
        public T c(Context context, Looper looper, com.google.android.gms.common.internal.d dVar, O o2, com.google.android.gms.common.api.e.b bVar, com.google.android.gms.common.api.e.c cVar) {
            return (T) d(context, looper, dVar, o2, bVar, cVar);
        }

        public T d(Context context, Looper looper, com.google.android.gms.common.internal.d dVar, O o2, com.google.android.gms.common.api.internal.f fVar, com.google.android.gms.common.api.internal.l lVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public interface b {
    }

    public static class c<C extends b> {
    }

    public interface d {

        /* JADX INFO: renamed from: com.google.android.gms.common.api.a$d$a, reason: collision with other inner class name */
        public interface InterfaceC0121a extends c, d {
            Account b();
        }

        public interface b extends c {
            GoogleSignInAccount d();
        }

        public interface c extends d {
        }

        /* JADX INFO: renamed from: com.google.android.gms.common.api.a$d$d, reason: collision with other inner class name */
        public static final class C0122d implements d {
            private C0122d() {
            }
        }
    }

    public static abstract class e<T extends b, O> {
        public List<Scope> a(O o2) {
            return Collections.emptyList();
        }

        public int b() {
            return Integer.MAX_VALUE;
        }
    }

    public interface f extends b {
        boolean a();

        void c(com.google.android.gms.common.internal.c.e eVar);

        boolean d();

        Set<Scope> e();

        void f(com.google.android.gms.common.internal.j jVar, Set<Scope> set);

        void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        void h(String str);

        boolean i();

        int k();

        boolean l();

        com.google.android.gms.common.c[] m();

        String n();

        String q();

        void r(com.google.android.gms.common.internal.c.InterfaceC0123c interfaceC0123c);

        void s();

        Intent t();

        boolean u();
    }

    public static final class g<C extends f> extends c<C> {
    }

    public <C extends f> a(String str, AbstractC0120a<C, O> abstractC0120a, g<C> gVar) {
        com.google.android.gms.common.internal.q.l(abstractC0120a, "Cannot construct an Api with a null ClientBuilder");
        com.google.android.gms.common.internal.q.l(gVar, "Cannot construct an Api with a null ClientKey");
        this.c = str;
        this.a = abstractC0120a;
        this.b = gVar;
    }

    public final AbstractC0120a a() {
        return this.a;
    }

    public final c b() {
        return this.b;
    }

    public final e c() {
        return this.a;
    }

    public final String d() {
        return this.c;
    }
}
