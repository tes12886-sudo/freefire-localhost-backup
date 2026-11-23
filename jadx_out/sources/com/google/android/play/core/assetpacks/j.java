package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class j<T> extends j.d.a.d.a.b.p0 {
    final j.d.a.d.a.f.p<T> a;
    final /* synthetic */ o b;

    j(o oVar, j.d.a.d.a.f.p<T> pVar) {
        this.b = oVar;
        this.a = pVar;
    }

    j(o oVar, j.d.a.d.a.f.p pVar, byte[] bArr) {
        this(oVar, pVar);
    }

    j(o oVar, j.d.a.d.a.f.p pVar, char[] cArr) {
        this(oVar, pVar);
    }

    j(o oVar, j.d.a.d.a.f.p pVar, int[] iArr) {
        this(oVar, pVar);
    }

    @Override // j.d.a.d.a.b.q0
    public void C0(List<Bundle> list) {
        this.b.c.b();
        o.f.d("onGetSessionStates", new Object[0]);
    }

    @Override // j.d.a.d.a.b.q0
    public void D() {
        this.b.c.b();
        o.f.d("onRemoveModule()", new Object[0]);
    }

    @Override // j.d.a.d.a.b.q0
    public void V0(Bundle bundle, Bundle bundle2) {
        this.b.c.b();
        o.f.d("onRequestDownloadInfo()", new Object[0]);
    }

    @Override // j.d.a.d.a.b.q0
    public void Y(Bundle bundle) {
        this.b.c.b();
        o.f.d("onNotifyModuleCompleted(%s, sessionId=%d)", bundle.getString("module_name"), Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // j.d.a.d.a.b.q0
    public void c0(Bundle bundle, Bundle bundle2) {
        this.b.d.b();
        o.f.d("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }

    @Override // j.d.a.d.a.b.q0
    public void i1() {
        this.b.c.b();
        o.f.d("onCancelDownloads()", new Object[0]);
    }

    @Override // j.d.a.d.a.b.q0
    public void m0(Bundle bundle) {
        this.b.c.b();
        o.f.d("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle.getString("module_name"), bundle.getString("slice_id"), Integer.valueOf(bundle.getInt("chunk_number")), Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // j.d.a.d.a.b.q0
    public final void n0(int i2) {
        this.b.c.b();
        o.f.d("onCancelDownload(%d)", Integer.valueOf(i2));
    }

    @Override // j.d.a.d.a.b.q0
    public final void n1(int i2) {
        this.b.c.b();
        o.f.d("onGetSession(%d)", Integer.valueOf(i2));
    }

    @Override // j.d.a.d.a.b.q0
    public void o0(Bundle bundle) {
        this.b.c.b();
        int i2 = bundle.getInt("error_code");
        o.f.b("onError(%d)", Integer.valueOf(i2));
        this.a.d(new a(i2));
    }

    @Override // j.d.a.d.a.b.q0
    public void r(Bundle bundle) {
        this.b.c.b();
        o.f.d("onNotifySessionFailed(%d)", Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // j.d.a.d.a.b.q0
    public void r0(Bundle bundle, Bundle bundle2) {
        this.b.c.b();
        o.f.d("onGetChunkFileDescriptor", new Object[0]);
    }

    @Override // j.d.a.d.a.b.q0
    public void t(int i2, Bundle bundle) {
        this.b.c.b();
        o.f.d("onStartDownload(%d)", Integer.valueOf(i2));
    }
}
