package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class v9 implements pa {
    private static final ba b = new s9();
    private final ba a;

    public v9() {
        ba baVar;
        ba[] baVarArr = new ba[2];
        baVarArr[0] = u8.c();
        try {
            baVar = (ba) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            baVar = b;
        }
        baVarArr[1] = baVar;
        t9 t9Var = new t9(baVarArr);
        g9.b(t9Var, "messageInfoFactory");
        this.a = t9Var;
    }

    private static boolean b(aa aaVar) {
        return aaVar.b() == 1;
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public final <T> oa<T> a(Class<T> cls) {
        ia iaVarA;
        q9 q9VarC;
        db<?, ?> dbVarB;
        m8<?> m8VarB;
        y9 y9VarA;
        db<?, ?> dbVarA;
        m8<?> m8VarB2;
        qa.A(cls);
        aa aaVarB = this.a.b(cls);
        if (aaVarB.zza()) {
            if (z8.class.isAssignableFrom(cls)) {
                dbVarA = qa.c();
                m8VarB2 = o8.a();
            } else {
                dbVarA = qa.a();
                m8VarB2 = o8.b();
            }
            return ha.i(dbVarA, m8VarB2, aaVarB.zzb());
        }
        if (z8.class.isAssignableFrom(cls)) {
            boolean zB = b(aaVarB);
            iaVarA = ja.b();
            q9VarC = q9.d();
            dbVarB = qa.c();
            m8VarB = zB ? o8.a() : null;
            y9VarA = z9.b();
        } else {
            boolean zB2 = b(aaVarB);
            iaVarA = ja.a();
            q9VarC = q9.c();
            if (zB2) {
                dbVarB = qa.a();
                m8VarB = o8.b();
            } else {
                dbVarB = qa.b();
                m8VarB = null;
            }
            y9VarA = z9.a();
        }
        return ga.E(cls, aaVarB, iaVarA, q9VarC, dbVarB, m8VarB, y9VarA);
    }
}
