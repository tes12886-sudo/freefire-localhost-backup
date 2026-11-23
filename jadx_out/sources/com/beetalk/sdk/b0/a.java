package com.beetalk.sdk.b0;

import android.app.Activity;
import android.content.Intent;
import com.vk.sdk.VKServiceActivity;
import com.vk.sdk.e;
import com.vk.sdk.g;
import com.vk.sdk.i;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private static final String[] c = {"wall", "photos", "friends", "offline"};
    private final Activity a;
    private d b;

    /* JADX INFO: renamed from: com.beetalk.sdk.b0.a$a, reason: collision with other inner class name */
    class C0029a implements g<i.d> {
        C0029a() {
        }

        @Override // com.vk.sdk.g
        public void a(com.vk.sdk.k.c cVar) {
            com.beetalk.sdk.x.a.a("vk session check error: %s", cVar);
            if (a.this.b != null) {
                a.this.b.a(cVar);
            }
        }

        @Override // com.vk.sdk.g
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(i.d dVar) {
            com.beetalk.sdk.x.a.a("vk session state: %s", dVar);
            int i2 = c.a[dVar.ordinal()];
            if (i2 == 2) {
                com.beetalk.sdk.x.a.a("vk already logged in", new Object[0]);
                a aVar = a.this;
                aVar.i(aVar.a);
            } else if (i2 == 3 || i2 == 4) {
                a aVar2 = a.this;
                aVar2.h(aVar2.a);
            }
        }
    }

    class b implements g<e> {
        b() {
        }

        @Override // com.vk.sdk.g
        public void a(com.vk.sdk.k.c cVar) {
            com.beetalk.sdk.x.a.a("vk login error: %s", cVar);
            if (a.this.b != null) {
                a.this.b.a(cVar);
            }
        }

        @Override // com.vk.sdk.g
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(e eVar) {
            com.beetalk.sdk.x.a.a("vk login success: %s", eVar);
            if (a.this.b != null) {
                a.this.b.b();
            }
        }
    }

    static /* synthetic */ class c {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[i.d.values().length];
            a = iArr;
            try {
                iArr[i.d.Pending.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[i.d.LoggedIn.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[i.d.LoggedOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[i.d.Unknown.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface d {
        void a(com.vk.sdk.k.c cVar);

        void b();
    }

    public a(Activity activity) {
        this.a = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(Activity activity) {
        com.beetalk.sdk.x.a.a("vk login required, start login", new Object[0]);
        i.n(activity, c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    public void i(Activity activity) {
        boolean z;
        String[] strArr = c;
        com.beetalk.sdk.x.a.a("vk verifying scopes: %s", Arrays.toString(strArr));
        e eVarB = e.b();
        if (eVarB != null) {
            try {
                z = eVarB.c(strArr);
            } catch (NullPointerException unused) {
            }
        }
        if (!z) {
            com.beetalk.sdk.x.a.a("vk scopes verification failed", new Object[0]);
            h(activity);
            return;
        }
        com.beetalk.sdk.x.a.a("vk scopes verified", new Object[0]);
        d dVar = this.b;
        if (dVar != null) {
            dVar.b();
        }
    }

    public boolean e(int i2, Intent intent) {
        return i.s(VKServiceActivity.c.Authorization.a(), i2, intent, new b());
    }

    public void f(d dVar) {
        this.b = dVar;
    }

    public void g() {
        i.B(this.a, new C0029a());
    }
}
