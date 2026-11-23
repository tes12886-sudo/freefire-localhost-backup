package com.vk.sdk.k.i;

import com.FF.voiceengine.FFVoiceConst;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class c<ResponseType> extends com.vk.sdk.k.i.a {
    private final b.d e;
    protected Exception f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b.f f1557g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f1558h;

    class a implements com.vk.sdk.k.i.a.d {
        final /* synthetic */ com.vk.sdk.k.i.a.c a;

        a(com.vk.sdk.k.i.a.c cVar) {
            this.a = cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.vk.sdk.k.i.a.d
        public void onComplete() {
            if (c.this.h() == com.vk.sdk.k.i.a.e.Finished) {
                c cVar = c.this;
                if (cVar.f == null) {
                    this.a.a(cVar, cVar.l());
                    return;
                }
            }
            com.vk.sdk.k.i.a.c cVar2 = this.a;
            c cVar3 = c.this;
            cVar2.b(cVar3, cVar3.i(cVar3.f));
        }
    }

    public c(b.d dVar) {
        this.e = dVar;
    }

    @Override // com.vk.sdk.k.i.a
    public void b() {
        b.b(this);
        super.b();
    }

    @Override // com.vk.sdk.k.i.a
    public void c() {
        n();
        super.c();
    }

    @Override // com.vk.sdk.k.i.a
    public void g(ExecutorService executorService) {
        super.g(executorService);
        f(com.vk.sdk.k.i.a.e.Executing);
        try {
            b.d dVar = this.e;
            if (dVar.f) {
                return;
            } else {
                this.f1557g = b.d(dVar);
            }
        } catch (IOException e) {
            this.f = e;
        }
        f(com.vk.sdk.k.i.a.e.Finished);
    }

    protected com.vk.sdk.k.c i(Exception exc) {
        com.vk.sdk.k.c cVar = h() == com.vk.sdk.k.i.a.e.Canceled ? new com.vk.sdk.k.c(FFVoiceConst.FFVoiceErrorCode.FFVoice_ERROR_STOP_FAILED) : new com.vk.sdk.k.c(FFVoiceConst.FFVoiceErrorCode.FFVoice_ERROR_NETWORK_ERROR);
        if (exc != null) {
            String message = exc.getMessage();
            cVar.f = message;
            if (message == null) {
                cVar.f = exc.toString();
            }
        }
        return cVar;
    }

    public byte[] j() {
        b.f fVar = this.f1557g;
        if (fVar != null) {
            return fVar.d;
        }
        return null;
    }

    public String k() {
        b.f fVar = this.f1557g;
        if (fVar == null || fVar.d == null) {
            return null;
        }
        if (this.f1558h == null) {
            try {
                this.f1558h = new String(this.f1557g.d, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                this.f = e;
            }
        }
        return this.f1558h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ResponseType l() {
        b.f fVar = this.f1557g;
        if (fVar != null) {
            return (ResponseType) fVar.d;
        }
        return null;
    }

    public b.d m() {
        return this.e;
    }

    protected boolean n() {
        return true;
    }

    public <OperationType extends c> void o(com.vk.sdk.k.i.a.c<OperationType, ResponseType> cVar) {
        e(new a(cVar));
    }
}
