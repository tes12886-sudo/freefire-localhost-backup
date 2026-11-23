package i;

/* JADX INFO: loaded from: classes.dex */
class k {
    private i<?> a;

    public k(i<?> iVar) {
        this.a = iVar;
    }

    public void a() {
        this.a = null;
    }

    protected void finalize() throws Throwable {
        i.m mVarU;
        try {
            i<?> iVar = this.a;
            if (iVar != null && (mVarU = i.u()) != null) {
                mVarU.a(iVar, new l(iVar.s()));
            }
        } finally {
            super.finalize();
        }
    }
}
