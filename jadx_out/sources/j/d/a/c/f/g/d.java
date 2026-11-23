package j.d.a.c.f.g;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class d implements com.google.firebase.i.d {
    static final com.google.firebase.i.d a = new d();

    private d() {
    }

    @Override // com.google.firebase.i.d
    public final void a(Object obj, Object obj2) {
        int i2 = e.e;
        String strValueOf = String.valueOf(obj.getClass().getCanonicalName());
        throw new com.google.firebase.i.b(strValueOf.length() != 0 ? "Couldn't find encoder for type ".concat(strValueOf) : new String("Couldn't find encoder for type "));
    }
}
