package j.d.a.c.f.g;

/* JADX INFO: loaded from: classes.dex */
final class h implements com.google.firebase.i.d<com.google.firebase.messaging.d1.b> {
    static final h a = new h();
    private static final com.google.firebase.i.c b;

    static {
        com.google.firebase.i.c.b bVarA = com.google.firebase.i.c.a("messagingClientEvent");
        b0 b0Var = new b0();
        b0Var.a(1);
        bVarA.b(b0Var.b());
        b = bVarA.a();
    }

    private h() {
    }

    @Override // com.google.firebase.i.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ((com.google.firebase.i.e) obj2).f(b, ((com.google.firebase.messaging.d1.b) obj).a());
    }
}
