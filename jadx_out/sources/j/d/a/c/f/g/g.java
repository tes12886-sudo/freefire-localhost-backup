package j.d.a.c.f.g;

/* JADX INFO: loaded from: classes.dex */
final class g implements com.google.firebase.i.g {
    private boolean a = false;
    private boolean b = false;
    private com.google.firebase.i.c c;
    private final c d;

    g(c cVar) {
        this.d = cVar;
    }

    private final void b() {
        if (this.a) {
            throw new com.google.firebase.i.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
    }

    final void a(com.google.firebase.i.c cVar, boolean z) {
        this.a = false;
        this.c = cVar;
        this.b = z;
    }

    @Override // com.google.firebase.i.g
    public final com.google.firebase.i.g d(String str) {
        b();
        this.d.d(this.c, str, this.b);
        return this;
    }

    @Override // com.google.firebase.i.g
    public final com.google.firebase.i.g e(boolean z) {
        b();
        this.d.h(this.c, z ? 1 : 0, this.b);
        return this;
    }
}
