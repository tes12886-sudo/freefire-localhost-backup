package com.gamesafe.ano;

/* JADX INFO: loaded from: classes.dex */
class i implements g.a {
    final /* synthetic */ h a;

    i(h hVar) {
        this.a = hVar;
    }

    @Override // com.gamesafe.ano.g.a
    public void a(int i2) {
        String str = this.a.c;
        if (this.a.c == null) {
            this.a.c = "0";
        }
        if (this.a.b != null) {
            this.a.b = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a.a("hnb_wjs_ydnhdnn:ntn:"));
        sb.append(a.a("|hnb_wjs_dy=") + str);
        sb.append(a.a("|woi_dy=") + i2);
        b.a(sb.toString());
    }
}
