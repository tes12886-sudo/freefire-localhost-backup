package com.beetalk.sdk.plugin.e.b;

import android.app.Activity;
import android.content.Intent;
import com.facebook.j;
import com.facebook.l;
import com.facebook.login.p;
import com.facebook.login.r;
import com.facebook.n;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<S, T> extends com.beetalk.sdk.plugin.a<S, T> {
    protected S a;
    protected j b;

    /* JADX INFO: renamed from: com.beetalk.sdk.plugin.e.b.a$a, reason: collision with other inner class name */
    class C0034a implements l<r> {
        final /* synthetic */ Activity a;

        C0034a(Activity activity) {
            this.a = activity;
        }

        @Override // com.facebook.l
        public void a() {
            a.this.i(new com.beetalk.sdk.v.a("Login Cancelled"), this.a);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.facebook.l
        public void b(n nVar) {
            Exception aVar = nVar;
            if (nVar == null) {
                aVar = new com.beetalk.sdk.v.a("Login Failed for some reason");
            }
            a.this.i(aVar, this.a);
        }

        @Override // com.facebook.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(r rVar) {
            if (rVar.a() != null) {
                a.this.k(this.a);
            }
        }
    }

    private boolean l(Activity activity) {
        com.facebook.a aVarD = com.facebook.a.d();
        if (aVarD != null && !aVarD.p()) {
            k(activity);
            return true;
        }
        p.e().o(this.b, new C0034a(activity));
        p.e().j(activity, Arrays.asList("public_profile", "user_friends", "email"));
        return true;
    }

    @Override // com.beetalk.sdk.plugin.a
    protected void b(Activity activity, S s) {
        this.a = s;
        this.b = j.a.a();
        l(activity);
    }

    @Override // com.beetalk.sdk.plugin.a
    public boolean f(Activity activity, int i2, Intent intent) {
        return false;
    }

    public abstract void i(Exception exc, Activity activity);

    public boolean j(int i2, int i3, Intent intent) {
        return this.b.a(i2, i3, intent);
    }

    public abstract void k(Activity activity);
}
