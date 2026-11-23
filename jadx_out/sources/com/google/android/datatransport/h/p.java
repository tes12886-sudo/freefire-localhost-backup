package com.google.android.datatransport.h;

/* JADX INFO: loaded from: classes.dex */
final class p<T> implements com.google.android.datatransport.f<T> {
    private final n a;
    private final String b;
    private final com.google.android.datatransport.b c;
    private final com.google.android.datatransport.e<T, byte[]> d;
    private final q e;

    p(n nVar, String str, com.google.android.datatransport.b bVar, com.google.android.datatransport.e<T, byte[]> eVar, q qVar) {
        this.a = nVar;
        this.b = str;
        this.c = bVar;
        this.d = eVar;
        this.e = qVar;
    }

    static /* synthetic */ void c(Exception exc) {
    }

    @Override // com.google.android.datatransport.f
    public void a(com.google.android.datatransport.c<T> cVar) {
        b(cVar, new com.google.android.datatransport.g() { // from class: com.google.android.datatransport.h.a
            @Override // com.google.android.datatransport.g
            public final void a(Exception exc) {
                p.c(exc);
            }
        });
    }

    @Override // com.google.android.datatransport.f
    public void b(com.google.android.datatransport.c<T> cVar, com.google.android.datatransport.g gVar) {
        q qVar = this.e;
        m.a aVarA = m.a();
        aVarA.e(this.a);
        aVarA.c(cVar);
        aVarA.f(this.b);
        aVarA.d(this.d);
        aVarA.b(this.c);
        qVar.a(aVarA.a(), gVar);
    }
}
