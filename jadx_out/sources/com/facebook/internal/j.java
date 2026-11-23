package com.facebook.internal;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.util.Log;
import java.util.List;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object<CONTENT, RESULT>] */
/* JADX INFO: loaded from: classes.dex */
public abstract class j<CONTENT, RESULT> {
    public static final Object f = new Object();
    private final Activity a;
    private final v b;
    private List<? extends j<CONTENT, RESULT>.a> c;
    private int d;
    private com.facebook.j e;

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract class a {
        private Object a = j.f;

        public a(j jVar) {
        }

        /* JADX WARN: Failed to parse method signature: (TCONTENTZ)Z
        jadx.core.utils.exceptions.JadxRuntimeException: Can't parse type: (TCONTENTZ)Z at position 2 ('C'), unexpected: T
        	at jadx.core.dex.nodes.parser.SignatureParser.consumeType(SignatureParser.java:169)
        	at jadx.core.dex.nodes.parser.SignatureParser.consumeMethodArgs(SignatureParser.java:336)
        	at jadx.core.dex.visitors.SignatureProcessor.parseMethodSignature(SignatureProcessor.java:187)
        	at jadx.core.dex.visitors.SignatureProcessor.visit(SignatureProcessor.java:40)
         */
        public abstract boolean a(Object obj, boolean z);

        /* JADX WARN: Failed to parse method signature: (TCONTENT)Lcom/facebook/internal/a;
        jadx.core.utils.exceptions.JadxRuntimeException: Bad name for type variable: CONTENT)Lcom/facebook/internal/a
        	at jadx.core.dex.nodes.parser.SignatureParser.consumeType(SignatureParser.java:149)
        	at jadx.core.dex.nodes.parser.SignatureParser.consumeMethodArgs(SignatureParser.java:336)
        	at jadx.core.dex.visitors.SignatureProcessor.parseMethodSignature(SignatureProcessor.java:187)
        	at jadx.core.dex.visitors.SignatureProcessor.visit(SignatureProcessor.java:40)
         */
        public abstract com.facebook.internal.a b(Object obj);

        public Object c() {
            return this.a;
        }
    }

    protected j(Activity activity, int i2) {
        l.y.c.i.e(activity, "activity");
        this.a = activity;
        this.b = null;
        this.d = i2;
        this.e = null;
    }

    private final List<j<CONTENT, RESULT>.a> a() {
        if (this.c == null) {
            this.c = g();
        }
        List<? extends j<CONTENT, RESULT>.a> list = this.c;
        if (list != null) {
            return list;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<com.facebook.internal.FacebookDialogBase<CONTENT, RESULT>.ModeHandler>");
    }

    private final com.facebook.internal.a d(CONTENT content, Object obj) {
        boolean z = obj == f;
        com.facebook.internal.a aVarB = null;
        for (j<CONTENT, RESULT>.a aVar : a()) {
            if (z || h0.c(aVar.c(), obj)) {
                if (aVar.a(content, true)) {
                    try {
                        aVarB = aVar.b(content);
                        break;
                    } catch (com.facebook.n e) {
                        com.facebook.internal.a aVarE = e();
                        i.k(aVarE, e);
                        aVarB = aVarE;
                    }
                }
            }
        }
        if (aVarB != null) {
            return aVarB;
        }
        com.facebook.internal.a aVarE2 = e();
        i.g(aVarE2);
        return aVarE2;
    }

    private final void i(com.facebook.j jVar) {
        com.facebook.j jVar2 = this.e;
        if (jVar2 == null) {
            this.e = jVar;
        } else if (jVar2 != jVar) {
            Log.w("FacebookDialog", "You're registering a callback on a Facebook dialog with two different callback managers. It's almost wrong and may cause unexpected results. Only the first callback manager will be used for handling activity result with androidx.");
        }
    }

    public boolean b(CONTENT content) {
        return c(content, f);
    }

    protected boolean c(CONTENT content, Object obj) {
        l.y.c.i.e(obj, "mode");
        boolean z = obj == f;
        for (j<CONTENT, RESULT>.a aVar : a()) {
            if (z || h0.c(aVar.c(), obj)) {
                if (aVar.a(content, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    protected abstract com.facebook.internal.a e();

    protected final Activity f() {
        Activity activity = this.a;
        if (activity != null) {
            return activity;
        }
        v vVar = this.b;
        if (vVar != null) {
            return vVar.a();
        }
        return null;
    }

    protected abstract List<j<CONTENT, RESULT>.a> g();

    public final int h() {
        return this.d;
    }

    public void j(com.facebook.j jVar, com.facebook.l<RESULT> lVar) {
        l.y.c.i.e(jVar, "callbackManager");
        l.y.c.i.e(lVar, "callback");
        if (!(jVar instanceof e)) {
            throw new com.facebook.n("Unexpected CallbackManager, please use the provided Factory.");
        }
        i(jVar);
        k((e) jVar, lVar);
    }

    protected abstract void k(e eVar, com.facebook.l<RESULT> lVar);

    public void l(CONTENT content) {
        m(content, f);
    }

    protected void m(CONTENT content, Object obj) {
        l.y.c.i.e(obj, "mode");
        com.facebook.internal.a aVarD = d(content, obj);
        if (aVarD == null) {
            Log.e("FacebookDialog", "No code path should ever result in a null appCall");
            if (!(!com.facebook.r.v())) {
                throw new IllegalStateException("No code path should ever result in a null appCall".toString());
            }
            return;
        }
        if (f() instanceof androidx.activity.result.e) {
            ComponentCallbacks2 componentCallbacks2F = f();
            if (componentCallbacks2F == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.activity.result.ActivityResultRegistryOwner");
            }
            androidx.activity.result.d dVarH = ((androidx.activity.result.e) componentCallbacks2F).h();
            l.y.c.i.d(dVarH, "registryOwner.activityResultRegistry");
            i.e(aVarD, dVarH, this.e);
            aVarD.g();
            return;
        }
        v vVar = this.b;
        if (vVar != null) {
            i.f(aVarD, vVar);
            return;
        }
        Activity activity = this.a;
        if (activity != null) {
            i.d(aVarD, activity);
        }
    }
}
