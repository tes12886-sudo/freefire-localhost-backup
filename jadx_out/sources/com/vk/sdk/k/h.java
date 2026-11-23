package com.vk.sdk.k;

import com.FF.voiceengine.FFVoiceConst;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends f {

    private class b extends com.vk.sdk.k.i.a {
        protected com.vk.sdk.k.i.a e;

        class a extends f.d {
            final /* synthetic */ f.d a;

            a(f.d dVar) {
                this.a = dVar;
            }

            @Override // com.vk.sdk.k.f.d
            public void b(g gVar) {
                b.this.f(com.vk.sdk.k.i.a.e.Finished);
                gVar.a = h.this;
                f.d dVar = this.a;
                if (dVar != null) {
                    dVar.b(gVar);
                }
            }

            @Override // com.vk.sdk.k.f.d
            public void c(c cVar) {
                b.this.f(com.vk.sdk.k.i.a.e.Finished);
                cVar.d = h.this;
                f.d dVar = this.a;
                if (dVar != null) {
                    dVar.c(cVar);
                }
            }
        }

        /* JADX INFO: renamed from: com.vk.sdk.k.h$b$b, reason: collision with other inner class name */
        private class C0162b extends f.d {

            /* JADX INFO: renamed from: com.vk.sdk.k.h$b$b$a */
            class a extends com.vk.sdk.k.i.e.a {

                /* JADX INFO: renamed from: com.vk.sdk.k.h$b$b$a$a, reason: collision with other inner class name */
                class C0163a extends f.d {
                    C0163a() {
                    }

                    @Override // com.vk.sdk.k.f.d
                    public void b(g gVar) {
                        f.d dVar = h.this.f1554o;
                        if (dVar != null) {
                            dVar.b(gVar);
                        }
                        b.this.f(com.vk.sdk.k.i.a.e.Finished);
                    }

                    @Override // com.vk.sdk.k.f.d
                    public void c(c cVar) {
                        f.d dVar = h.this.f1554o;
                        if (dVar != null) {
                            dVar.c(cVar);
                        }
                    }
                }

                a() {
                }

                @Override // com.vk.sdk.k.i.a.c
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void a(com.vk.sdk.k.i.e eVar, JSONObject jSONObject) {
                    f fVarF = h.this.F(jSONObject);
                    fVarF.D(new C0163a());
                    b.this.e = fVarF.s();
                    com.vk.sdk.k.i.b.c(b.this.e);
                }

                @Override // com.vk.sdk.k.i.a.c
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void b(com.vk.sdk.k.i.e eVar, c cVar) {
                    f.d dVar = h.this.f1554o;
                    if (dVar != null) {
                        dVar.c(cVar);
                    }
                }
            }

            private C0162b() {
            }

            @Override // com.vk.sdk.k.f.d
            public void b(g gVar) {
                try {
                    com.vk.sdk.k.i.e eVarH = h.this.H(gVar.b.getJSONObject("response").getString("upload_url"));
                    eVarH.o(new a());
                    b.this.e = eVarH;
                    com.vk.sdk.k.i.b.c(eVarH);
                } catch (JSONException e) {
                    c cVar = new c(FFVoiceConst.FFVoiceErrorCode.FFVoice_ERROR_SERVER_INVALID);
                    cVar.f = e.getMessage();
                    f.d dVar = h.this.f1554o;
                    if (dVar != null) {
                        dVar.c(cVar);
                    }
                }
            }

            @Override // com.vk.sdk.k.f.d
            public void c(c cVar) {
                f.d dVar = h.this.f1554o;
                if (dVar != null) {
                    dVar.c(cVar);
                }
            }
        }

        private b() {
        }

        @Override // com.vk.sdk.k.i.a
        public void b() {
            com.vk.sdk.k.i.a aVar = this.e;
            if (aVar != null) {
                aVar.b();
            }
            super.b();
        }

        @Override // com.vk.sdk.k.i.a
        public void c() {
            super.c();
            this.e = null;
        }

        @Override // com.vk.sdk.k.i.a
        public void g(ExecutorService executorService) {
            super.g(executorService);
            h hVar = h.this;
            hVar.f1554o = new a(hVar.f1554o);
            f(com.vk.sdk.k.i.a.e.Executing);
            f fVarG = h.this.G();
            fVarG.D(new C0162b());
            com.vk.sdk.k.i.a aVarS = fVarG.s();
            this.e = aVarS;
            com.vk.sdk.k.i.b.c(aVarS);
        }
    }

    public h() {
        super(null);
    }

    protected abstract f F(JSONObject jSONObject);

    protected abstract f G();

    protected abstract com.vk.sdk.k.i.e H(String str);

    @Override // com.vk.sdk.k.f
    public com.vk.sdk.k.i.a s() {
        return new b();
    }
}
