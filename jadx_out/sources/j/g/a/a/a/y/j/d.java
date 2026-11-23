package j.g.a.a.a.y.j;

import android.net.Uri;
import j.g.a.a.a.j;
import j.g.a.a.a.p;
import j.g.a.a.a.q;
import j.g.a.a.a.r;
import j.g.a.a.a.u;
import j.g.a.a.a.v;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;
import m.e0;
import o.a0.i;
import o.a0.o;
import o.a0.t;

/* JADX INFO: loaded from: classes.dex */
public class d extends h {
    b e;

    class a extends j.g.a.a.a.c<e0> {
        final /* synthetic */ j.g.a.a.a.c a;

        a(d dVar, j.g.a.a.a.c cVar) {
            this.a = cVar;
        }

        @Override // j.g.a.a.a.c
        public void c(v vVar) {
            this.a.c(vVar);
        }

        @Override // j.g.a.a.a.c
        public void d(j<e0> jVar) throws Throwable {
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = null;
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(jVar.a.b()));
                    while (true) {
                        try {
                            String line = bufferedReader2.readLine();
                            if (line == null) {
                                break;
                            } else {
                                sb.append(line);
                            }
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            throw th;
                        }
                    }
                    bufferedReader2.close();
                    String string = sb.toString();
                    g gVarJ = d.j(string);
                    if (gVarJ != null) {
                        this.a.d(new j(gVarJ, null));
                        return;
                    }
                    this.a.c(new q("Failed to parse auth response: " + string));
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e) {
                this.a.c(new q(e.getMessage(), e));
            }
        }
    }

    interface b {
        @o("/oauth/access_token")
        o.d<e0> a(@i("Authorization") String str, @t("oauth_verifier") String str2);

        @o("/oauth/request_token")
        o.d<e0> b(@i("Authorization") String str);
    }

    public d(u uVar, j.g.a.a.a.y.g gVar) {
        super(uVar, gVar);
        this.e = (b) b().b(b.class);
    }

    public static g j(String str) {
        TreeMap<String, String> treeMapA = j.g.a.a.a.y.i.c.a(str, false);
        String str2 = treeMapA.get("oauth_token");
        String str3 = treeMapA.get("oauth_token_secret");
        String str4 = treeMapA.get("screen_name");
        long j2 = treeMapA.containsKey("user_id") ? Long.parseLong(treeMapA.get("user_id")) : 0L;
        if (str2 == null || str3 == null) {
            return null;
        }
        return new g(new r(str2, str3), str4, j2);
    }

    public String e(p pVar) {
        return Uri.parse("twittersdk://callback").buildUpon().appendQueryParameter("version", c().h()).appendQueryParameter("app", pVar.a()).build().toString();
    }

    String f() {
        return a().c() + "/oauth/access_token";
    }

    public String g(r rVar) {
        return a().a("oauth", "authorize").appendQueryParameter("oauth_token", rVar.a).build().toString();
    }

    j.g.a.a.a.c<e0> h(j.g.a.a.a.c<g> cVar) {
        return new a(this, cVar);
    }

    String i() {
        return a().c() + "/oauth/request_token";
    }

    public void k(j.g.a.a.a.c<g> cVar, r rVar, String str) {
        this.e.a(new j.g.a.a.a.y.j.b().a(c().c(), rVar, null, "POST", f(), null), str).Q(h(cVar));
    }

    public void l(j.g.a.a.a.c<g> cVar) {
        p pVarC = c().c();
        this.e.b(new j.g.a.a.a.y.j.b().a(pVarC, null, e(pVarC), "POST", i(), null)).Q(h(cVar));
    }
}
