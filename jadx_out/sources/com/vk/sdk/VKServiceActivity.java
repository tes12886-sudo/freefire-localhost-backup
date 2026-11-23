package com.vk.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class VKServiceActivity extends Activity implements DialogInterface.OnDismissListener {

    class a implements g<e> {
        a() {
        }

        @Override // com.vk.sdk.g
        public void a(com.vk.sdk.k.c cVar) {
            com.vk.sdk.k.c cVar2;
            com.vk.sdk.k.f fVar;
            h hVarA = h.a(VKServiceActivity.this.c());
            if ((hVarA instanceof com.vk.sdk.k.c) && (fVar = (cVar2 = (com.vk.sdk.k.c) hVarA).d) != null) {
                fVar.m();
                com.vk.sdk.k.f.d dVar = cVar2.d.f1554o;
                if (dVar != null) {
                    dVar.c(cVar);
                }
            }
            if (cVar != null) {
                VKServiceActivity vKServiceActivity = VKServiceActivity.this;
                vKServiceActivity.setResult(0, vKServiceActivity.getIntent().putExtra("vk_extra_error_id", cVar.b()));
            } else {
                VKServiceActivity.this.setResult(0);
            }
            VKServiceActivity.this.finish();
        }

        @Override // com.vk.sdk.g
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(e eVar) {
            VKServiceActivity.this.setResult(-1);
            VKServiceActivity.this.finish();
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.Authorization.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.Captcha.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.Validation.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum c {
        Authorization(10485),
        Captcha(14079),
        Validation(11477);

        private int a;

        c(int i2) {
            this.a = i2;
        }

        public int a() {
            return this.a;
        }
    }

    private static Intent b(Context context, c cVar) {
        Intent intent = new Intent(context, (Class<?>) VKServiceActivity.class);
        intent.putExtra("arg1", cVar.name());
        intent.putExtra("arg4", i.m());
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long c() {
        return getIntent().getLongExtra("arg3", 0L);
    }

    private ArrayList<String> d() {
        return getIntent().getStringArrayListExtra("arg2");
    }

    private c e() {
        return c.valueOf(getIntent().getStringExtra("arg1"));
    }

    public static void f(Context context, com.vk.sdk.k.c cVar, c cVar2) {
        Intent intentB = b(context, cVar2);
        intentB.setFlags(268435456);
        intentB.putExtra("arg3", cVar.b());
        if (context != null) {
            context.startActivity(intentB);
        }
    }

    static void h(Activity activity, ArrayList<String> arrayList) {
        Context applicationContext = activity.getApplicationContext();
        c cVar = c.Authorization;
        Intent intentB = b(applicationContext, cVar);
        intentB.putStringArrayListExtra("arg2", arrayList);
        activity.startActivityForResult(intentB, cVar.a());
    }

    public void g(int i2, int i3, Intent intent) {
        onActivityResult(i2, i3, intent);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == c.Authorization.a() || i2 == c.Validation.a()) {
            i.u(this, i3, intent, new a());
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        StringBuilder sb;
        super.onCreate(bundle);
        if (getIntent().getBooleanExtra("arg4", false)) {
            i.e(this, 0, null);
        }
        i.A(getApplicationContext());
        int i2 = b.a[e().ordinal()];
        if (i2 == 1) {
            Context applicationContext = getApplicationContext();
            Bundle bundle2 = new Bundle();
            bundle2.putString("version", i.h());
            bundle2.putInt("client_id", i.k());
            bundle2.putBoolean("revoke", true);
            bundle2.putString("scope", com.vk.sdk.m.b.a(d(), ","));
            String[] strArrC = com.vk.sdk.m.c.c(applicationContext, "com.vkontakte.android");
            if (!com.vk.sdk.m.c.e(applicationContext, "com.vkontakte.android") || !com.vk.sdk.m.c.f(applicationContext, "com.vkontakte.android.action.SDK_AUTH") || strArrC.length <= 0 || !strArrC[0].equals("48761EEF50EE53AFC4CC9C5F10E6BDE7F8F5B82F")) {
                new com.vk.sdk.l.b().h(this, bundle2, c.Authorization.a(), null);
                return;
            } else {
                if (bundle == null) {
                    Intent intent = new Intent("com.vkontakte.android.action.SDK_AUTH", (Uri) null);
                    intent.setPackage("com.vkontakte.android");
                    intent.putExtras(bundle2);
                    startActivityForResult(intent, c.Authorization.a());
                    return;
                }
                return;
            }
        }
        if (i2 == 2) {
            com.vk.sdk.k.c cVar = (com.vk.sdk.k.c) h.a(c());
            if (cVar != null) {
                new com.vk.sdk.l.a(cVar).h(this, this);
                return;
            }
        } else {
            if (i2 != 3) {
                return;
            }
            com.vk.sdk.k.c cVar2 = (com.vk.sdk.k.c) h.a(c());
            if (cVar2 != null) {
                if (!TextUtils.isEmpty(cVar2.f1545j) && !cVar2.f1545j.contains("&ui=vk_sdk") && !cVar2.f1545j.contains("?ui=vk_sdk")) {
                    if (cVar2.f1545j.indexOf(63) > 0) {
                        sb = new StringBuilder();
                        sb.append(cVar2.f1545j);
                        sb.append("&ui=vk_sdk");
                    } else {
                        sb = new StringBuilder();
                        sb.append(cVar2.f1545j);
                        sb.append("?ui=vk_sdk");
                    }
                    cVar2.f1545j = sb.toString();
                }
                new com.vk.sdk.l.b().h(this, new Bundle(), c.Validation.a(), cVar2);
                return;
            }
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        finish();
    }
}
