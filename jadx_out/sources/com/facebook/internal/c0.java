package com.facebook.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {
    private static final String a;
    private static final List<f> b;
    private static final List<f> c;
    private static final Map<String, List<f>> d;
    private static final AtomicBoolean e;
    private static final Integer[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c0 f599g;

    private static final class a extends f {
        @Override // com.facebook.internal.c0.f
        public /* bridge */ /* synthetic */ String c() {
            return (String) g();
        }

        @Override // com.facebook.internal.c0.f
        public String d() {
            return "com.facebook.arstudio.player";
        }

        public Void g() {
            return null;
        }
    }

    private static final class b extends f {
        @Override // com.facebook.internal.c0.f
        public String c() {
            return "com.facebook.lite.platform.LoginGDPDialogActivity";
        }

        @Override // com.facebook.internal.c0.f
        public String d() {
            return "com.facebook.lite";
        }
    }

    private static final class c extends f {
        @Override // com.facebook.internal.c0.f
        public String c() {
            return "com.instagram.platform.AppAuthorizeActivity";
        }

        @Override // com.facebook.internal.c0.f
        public String d() {
            return "com.instagram.android";
        }

        @Override // com.facebook.internal.c0.f
        public String e() {
            return "token,signed_request,graph_domain,granted_scopes";
        }
    }

    private static final class d extends f {
        private final boolean g() {
            return com.facebook.r.f().getApplicationInfo().targetSdkVersion >= 30;
        }

        @Override // com.facebook.internal.c0.f
        public String c() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // com.facebook.internal.c0.f
        public String d() {
            return "com.facebook.katana";
        }

        @Override // com.facebook.internal.c0.f
        public void f() {
            if (g()) {
                Log.w(c0.d(c0.f599g), "Apps that target Android API 30+ (Android 11+) cannot call Facebook native apps unless the package visibility needs are declared. Please follow https://developers.facebook.com/docs/android/troubleshooting/#faq_267321845055988 to make the declaration.");
            }
        }
    }

    private static final class e extends f {
        @Override // com.facebook.internal.c0.f
        public /* bridge */ /* synthetic */ String c() {
            return (String) g();
        }

        @Override // com.facebook.internal.c0.f
        public String d() {
            return "com.facebook.orca";
        }

        public Void g() {
            return null;
        }
    }

    public static abstract class f {
        private TreeSet<Integer> a;

        /* JADX WARN: Code duplicated, block: B:16:0x0024  */
        /* JADX WARN: Code duplicated, block: B:18:0x0027 A[Catch: all -> 0x002c, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x0009, B:10:0x0017, B:12:0x001b, B:18:0x0027, B:9:0x000f), top: B:24:0x0003 }] */
        /* JADX WARN: Code duplicated, block: B:9:0x000f A[Catch: all -> 0x002c, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x0009, B:10:0x0017, B:12:0x001b, B:18:0x0027, B:9:0x000f), top: B:24:0x0003 }] */
        public final synchronized void a(boolean z) {
            TreeSet<Integer> treeSet;
            boolean z2;
            if (z) {
                this.a = c0.a(c0.f599g, this);
                treeSet = this.a;
                if (treeSet != null) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (z2) {
                    f();
                }
            } else {
                TreeSet<Integer> treeSet2 = this.a;
                if (treeSet2 == null || treeSet2 == null || treeSet2.isEmpty()) {
                    this.a = c0.a(c0.f599g, this);
                }
                treeSet = this.a;
                if (treeSet != null || treeSet.isEmpty()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    f();
                }
            }
            throw th;
        }

        public final TreeSet<Integer> b() {
            TreeSet<Integer> treeSet = this.a;
            if (treeSet == null || treeSet == null || treeSet.isEmpty()) {
                a(false);
            }
            return this.a;
        }

        public abstract String c();

        public abstract String d();

        public String e() {
            return "id_token,token,signed_request,graph_domain";
        }

        public void f() {
        }
    }

    public static final class g {
        public static final a c = new a(null);
        private f a;
        private int b;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(l.y.c.f fVar) {
                this();
            }

            public final g a(f fVar, int i2) {
                g gVar = new g(null);
                gVar.a = fVar;
                gVar.b = i2;
                return gVar;
            }

            public final g b() {
                g gVar = new g(null);
                gVar.b = -1;
                return gVar;
            }
        }

        private g() {
        }

        public /* synthetic */ g(l.y.c.f fVar) {
            this();
        }

        public final f c() {
            return this.a;
        }

        public final int d() {
            return this.b;
        }
    }

    private static final class h extends f {
        @Override // com.facebook.internal.c0.f
        public String c() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // com.facebook.internal.c0.f
        public String d() {
            return "com.facebook.wakizashi";
        }
    }

    static final class i implements Runnable {
        public static final i a = new i();

        i() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                try {
                    Iterator it = c0.b(c0.f599g).iterator();
                    while (it.hasNext()) {
                        ((f) it.next()).a(true);
                    }
                    c0.c(c0.f599g).set(false);
                } catch (Throwable th) {
                    c0.c(c0.f599g).set(false);
                    throw th;
                }
            } catch (Throwable th2) {
                com.facebook.internal.m0.i.a.b(th2, this);
            }
        }
    }

    static {
        c0 c0Var = new c0();
        f599g = c0Var;
        String name = c0.class.getName();
        l.y.c.i.d(name, "NativeProtocol::class.java.name");
        a = name;
        b = c0Var.g();
        c = c0Var.f();
        d = c0Var.e();
        e = new AtomicBoolean(false);
        f = new Integer[]{20210906, 20170417, 20160327, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140204, 20131107, 20130618, 20130502, 20121101};
    }

    private c0() {
    }

    public static final Bundle A(Intent intent) {
        if (com.facebook.internal.m0.i.a.d(c0.class)) {
            return null;
        }
        try {
            l.y.c.i.e(intent, "intent");
            return !E(B(intent)) ? intent.getExtras() : intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c0.class);
            return null;
        }
    }

    public static final int B(Intent intent) {
        if (com.facebook.internal.m0.i.a.d(c0.class)) {
            return 0;
        }
        try {
            l.y.c.i.e(intent, "intent");
            return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c0.class);
            return 0;
        }
    }

    public static final Bundle C(Intent intent) {
        if (com.facebook.internal.m0.i.a.d(c0.class)) {
            return null;
        }
        try {
            l.y.c.i.e(intent, "resultIntent");
            int iB = B(intent);
            Bundle extras = intent.getExtras();
            if (E(iB) && extras != null) {
                return extras.getBundle("com.facebook.platform.protocol.RESULT_ARGS");
            }
            return extras;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c0.class);
            return null;
        }
    }

    public static final boolean D(Intent intent) {
        if (com.facebook.internal.m0.i.a.d(c0.class)) {
            return false;
        }
        try {
            l.y.c.i.e(intent, "resultIntent");
            Bundle bundleS = s(intent);
            return bundleS != null ? bundleS.containsKey("error") : intent.hasExtra("com.facebook.platform.status.ERROR_TYPE");
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c0.class);
            return false;
        }
    }

    public static final boolean E(int i2) {
        if (com.facebook.internal.m0.i.a.d(c0.class)) {
            return false;
        }
        try {
            return l.t.h.j(f, Integer.valueOf(i2)) && i2 >= 20140701;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c0.class);
            return false;
        }
    }

    public static final void F(Intent intent, String str, String str2, int i2, Bundle bundle) {
        if (com.facebook.internal.m0.i.a.d(c0.class)) {
            return;
        }
        try {
            l.y.c.i.e(intent, "intent");
            String strG = com.facebook.r.g();
            String strH = com.facebook.r.h();
            intent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", i2).putExtra("com.facebook.platform.protocol.PROTOCOL_ACTION", str2).putExtra("com.facebook.platform.extra.APPLICATION_ID", strG);
            if (!E(i2)) {
                intent.putExtra("com.facebook.platform.protocol.CALL_ID", str);
                if (!h0.Y(strH)) {
                    intent.putExtra("com.facebook.platform.extra.APPLICATION_NAME", strH);
                }
                if (bundle != null) {
                    intent.putExtras(bundle);
                    return;
                }
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("action_id", str);
            h0.o0(bundle2, "app_name", strH);
            intent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
            if (bundle == null) {
                bundle = new Bundle();
            }
            l.y.c.i.d(intent.putExtra("com.facebook.platform.protocol.METHOD_ARGS", bundle), "intent.putExtra(EXTRA_PR…OD_ARGS, methodArguments)");
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c0.class);
        }
    }

    public static final void G() {
        if (com.facebook.internal.m0.i.a.d(c0.class)) {
            return;
        }
        try {
            if (e.compareAndSet(false, true)) {
                com.facebook.r.n().execute(i.a);
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c0.class);
        }
    }

    public static final Intent H(Context context, Intent intent, f fVar) {
        ResolveInfo resolveInfoResolveActivity;
        if (com.facebook.internal.m0.i.a.d(c0.class)) {
            return null;
        }
        try {
            l.y.c.i.e(context, "context");
            if (intent == null || (resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 0)) == null) {
                return null;
            }
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            l.y.c.i.d(str, "resolveInfo.activityInfo.packageName");
            if (n.a(context, str)) {
                return intent;
            }
            return null;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c0.class);
            return null;
        }
    }

    public static final Intent I(Context context, Intent intent, f fVar) {
        ResolveInfo resolveInfoResolveService;
        if (com.facebook.internal.m0.i.a.d(c0.class)) {
            return null;
        }
        try {
            l.y.c.i.e(context, "context");
            if (intent == null || (resolveInfoResolveService = context.getPackageManager().resolveService(intent, 0)) == null) {
                return null;
            }
            String str = resolveInfoResolveService.serviceInfo.packageName;
            l.y.c.i.d(str, "resolveInfo.serviceInfo.packageName");
            if (n.a(context, str)) {
                return intent;
            }
            return null;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c0.class);
            return null;
        }
    }

    public static final /* synthetic */ TreeSet a(c0 c0Var, f fVar) {
        if (com.facebook.internal.m0.i.a.d(c0.class)) {
            return null;
        }
        try {
            return c0Var.r(fVar);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c0.class);
            return null;
        }
    }

    public static final /* synthetic */ List b(c0 c0Var) {
        if (com.facebook.internal.m0.i.a.d(c0.class)) {
            return null;
        }
        try {
            return b;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c0.class);
            return null;
        }
    }

    public static final /* synthetic */ AtomicBoolean c(c0 c0Var) {
        if (com.facebook.internal.m0.i.a.d(c0.class)) {
            return null;
        }
        try {
            return e;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c0.class);
            return null;
        }
    }

    public static final /* synthetic */ String d(c0 c0Var) {
        if (com.facebook.internal.m0.i.a.d(c0.class)) {
            return null;
        }
        try {
            return a;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c0.class);
            return null;
        }
    }

    private final Map<String, List<f>> e() {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new e());
            List<f> list = b;
            map.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", list);
            map.put("com.facebook.platform.action.request.FEED_DIALOG", list);
            map.put("com.facebook.platform.action.request.LIKE_DIALOG", list);
            map.put("com.facebook.platform.action.request.APPINVITES_DIALOG", list);
            map.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList);
            map.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList);
            map.put("com.facebook.platform.action.request.CAMERA_EFFECT", c);
            map.put("com.facebook.platform.action.request.SHARE_STORY", list);
            return map;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    private final List<f> f() {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            ArrayList arrayListC = l.t.m.c(new a());
            arrayListC.addAll(g());
            return arrayListC;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    private final List<f> g() {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            return l.t.m.c(new d(), new h());
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    private final Uri h(f fVar) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            Uri uri = Uri.parse("content://" + fVar.d() + ".provider.PlatformProvider/versions");
            l.y.c.i.d(uri, "Uri.parse(CONTENT_SCHEME…ATFORM_PROVIDER_VERSIONS)");
            return uri;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    public static final int i(TreeSet<Integer> treeSet, int i2, int[] iArr) {
        if (com.facebook.internal.m0.i.a.d(c0.class)) {
            return 0;
        }
        try {
            l.y.c.i.e(iArr, "versionSpec");
            if (treeSet == null) {
                return -1;
            }
            int length = iArr.length - 1;
            Iterator<Integer> itDescendingIterator = treeSet.descendingIterator();
            int iMax = -1;
            while (itDescendingIterator.hasNext()) {
                Integer next = itDescendingIterator.next();
                l.y.c.i.d(next, "fbAppVersion");
                iMax = Math.max(iMax, next.intValue());
                while (length >= 0 && iArr[length] > next.intValue()) {
                    length--;
                }
                if (length < 0) {
                    return -1;
                }
                if (iArr[length] == next.intValue()) {
                    if (length % 2 == 0) {
                        return Math.min(iMax, i2);
                    }
                    return -1;
                }
            }
            return -1;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c0.class);
            return 0;
        }
    }

    public static final Bundle j(com.facebook.n nVar) {
        if (com.facebook.internal.m0.i.a.d(c0.class) || nVar == null) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("error_description", nVar.toString());
            if (nVar instanceof com.facebook.p) {
                bundle.putString("error_type", "UserCanceled");
            }
            return bundle;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c0.class);
            return null;
        }
    }

    public static final Intent k(Context context, String str, Collection<String> collection, String str2, boolean z, boolean z2, com.facebook.login.c cVar, String str3, String str4, String str5, boolean z3, boolean z4, boolean z5) {
        if (com.facebook.internal.m0.i.a.d(c0.class)) {
            return null;
        }
        try {
            l.y.c.i.e(context, "context");
            l.y.c.i.e(str, "applicationId");
            l.y.c.i.e(collection, "permissions");
            l.y.c.i.e(str2, "e2e");
            l.y.c.i.e(cVar, "defaultAudience");
            l.y.c.i.e(str3, "clientState");
            l.y.c.i.e(str4, "authType");
            b bVar = new b();
            return H(context, f599g.m(bVar, str, collection, str2, z2, cVar, str3, str4, false, str5, z3, com.facebook.login.s.FACEBOOK, z4, z5, ""), bVar);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c0.class);
            return null;
        }
    }

    public static final Intent l(Context context, String str, Collection<String> collection, String str2, boolean z, boolean z2, com.facebook.login.c cVar, String str3, String str4, String str5, boolean z3, boolean z4, boolean z5) {
        if (com.facebook.internal.m0.i.a.d(c0.class)) {
            return null;
        }
        try {
            l.y.c.i.e(context, "context");
            l.y.c.i.e(str, "applicationId");
            l.y.c.i.e(collection, "permissions");
            l.y.c.i.e(str2, "e2e");
            l.y.c.i.e(cVar, "defaultAudience");
            l.y.c.i.e(str3, "clientState");
            l.y.c.i.e(str4, "authType");
            c cVar2 = new c();
            return H(context, f599g.m(cVar2, str, collection, str2, z2, cVar, str3, str4, false, str5, z3, com.facebook.login.s.INSTAGRAM, z4, z5, ""), cVar2);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c0.class);
            return null;
        }
    }

    private final Intent m(f fVar, String str, Collection<String> collection, String str2, boolean z, com.facebook.login.c cVar, String str3, String str4, boolean z2, String str5, boolean z3, com.facebook.login.s sVar, boolean z4, boolean z5, String str6) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            String strC = fVar.c();
            if (strC == null) {
                return null;
            }
            Intent intentPutExtra = new Intent().setClassName(fVar.d(), strC).putExtra("client_id", str);
            l.y.c.i.d(intentPutExtra, "Intent()\n            .se…PP_ID_KEY, applicationId)");
            intentPutExtra.putExtra("facebook_sdk_version", com.facebook.r.u());
            if (!h0.Z(collection)) {
                intentPutExtra.putExtra("scope", TextUtils.join(",", collection));
            }
            if (!h0.Y(str2)) {
                intentPutExtra.putExtra("e2e", str2);
            }
            intentPutExtra.putExtra("state", str3);
            intentPutExtra.putExtra("response_type", fVar.e());
            intentPutExtra.putExtra("nonce", str6);
            intentPutExtra.putExtra("return_scopes", "true");
            if (z) {
                intentPutExtra.putExtra("default_audience", cVar.a());
            }
            intentPutExtra.putExtra("legacy_override", com.facebook.r.p());
            intentPutExtra.putExtra("auth_type", str4);
            if (z2) {
                intentPutExtra.putExtra("fail_on_logged_out", true);
            }
            intentPutExtra.putExtra("messenger_page_id", str5);
            intentPutExtra.putExtra("reset_messenger_state", z3);
            if (z4) {
                intentPutExtra.putExtra("fx_app", sVar.toString());
            }
            if (z5) {
                intentPutExtra.putExtra("skip_dedupe", true);
            }
            return intentPutExtra;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    public static final Intent n(Context context, String str, String str2, g gVar, Bundle bundle) {
        f fVarC;
        Intent intentH;
        if (com.facebook.internal.m0.i.a.d(c0.class)) {
            return null;
        }
        try {
            l.y.c.i.e(context, "context");
            if (gVar == null || (fVarC = gVar.c()) == null || (intentH = H(context, new Intent().setAction("com.facebook.platform.PLATFORM_ACTIVITY").setPackage(fVarC.d()).addCategory("android.intent.category.DEFAULT"), fVarC)) == null) {
                return null;
            }
            F(intentH, str, str2, gVar.d(), bundle);
            return intentH;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c0.class);
            return null;
        }
    }

    public static final Intent o(Context context) {
        if (com.facebook.internal.m0.i.a.d(c0.class)) {
            return null;
        }
        try {
            l.y.c.i.e(context, "context");
            for (f fVar : b) {
                Intent intentI = I(context, new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(fVar.d()).addCategory("android.intent.category.DEFAULT"), fVar);
                if (intentI != null) {
                    return intentI;
                }
            }
            return null;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c0.class);
            return null;
        }
    }

    public static final Intent p(Intent intent, Bundle bundle, com.facebook.n nVar) {
        if (com.facebook.internal.m0.i.a.d(c0.class)) {
            return null;
        }
        try {
            l.y.c.i.e(intent, "requestIntent");
            UUID uuidT = t(intent);
            if (uuidT == null) {
                return null;
            }
            Intent intent2 = new Intent();
            intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", B(intent));
            Bundle bundle2 = new Bundle();
            bundle2.putString("action_id", uuidT.toString());
            if (nVar != null) {
                bundle2.putBundle("error", j(nVar));
            }
            intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
            if (bundle != null) {
                intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
            }
            return intent2;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c0.class);
            return null;
        }
    }

    public static final List<Intent> q(Context context, String str, Collection<String> collection, String str2, boolean z, boolean z2, com.facebook.login.c cVar, String str3, String str4, boolean z3, String str5, boolean z4, boolean z5, boolean z6, String str6) {
        if (com.facebook.internal.m0.i.a.d(c0.class)) {
            return null;
        }
        try {
            l.y.c.i.e(str, "applicationId");
            l.y.c.i.e(collection, "permissions");
            l.y.c.i.e(str2, "e2e");
            l.y.c.i.e(cVar, "defaultAudience");
            l.y.c.i.e(str3, "clientState");
            l.y.c.i.e(str4, "authType");
            List<f> list = b;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ArrayList arrayList2 = arrayList;
                Intent intentM = f599g.m((f) it.next(), str, collection, str2, z2, cVar, str3, str4, z3, str5, z4, com.facebook.login.s.FACEBOOK, z5, z6, str6);
                if (intentM != null) {
                    arrayList2.add(intentM);
                }
                arrayList = arrayList2;
            }
            return arrayList;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c0.class);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008b A[Catch: all -> 0x008f, TryCatch #6 {all -> 0x008f, blocks: (B:5:0x000c, B:36:0x008b, B:37:0x008e, B:31:0x0083), top: B:48:0x000c }] */
    private final TreeSet<Integer> r(f fVar) {
        Cursor cursor;
        ProviderInfo providerInfoResolveContentProvider;
        Cursor cursorQuery;
        String str;
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            TreeSet<Integer> treeSet = new TreeSet<>();
            ContentResolver contentResolver = com.facebook.r.f().getContentResolver();
            String[] strArr = {"version"};
            Uri uriH = h(fVar);
            try {
                try {
                    providerInfoResolveContentProvider = com.facebook.r.f().getPackageManager().resolveContentProvider(fVar.d() + ".provider.PlatformProvider", 0);
                } catch (RuntimeException e2) {
                    Log.e(a, "Failed to query content resolver.", e2);
                    providerInfoResolveContentProvider = null;
                }
                if (providerInfoResolveContentProvider != null) {
                    try {
                        try {
                            cursorQuery = contentResolver.query(uriH, strArr, null, null, null);
                        } catch (IllegalArgumentException unused) {
                            str = a;
                            Log.e(str, "Failed to query content resolver.");
                            cursorQuery = null;
                        }
                    } catch (NullPointerException unused2) {
                        str = a;
                        Log.e(str, "Failed to query content resolver.");
                        cursorQuery = null;
                    } catch (SecurityException unused3) {
                        str = a;
                        Log.e(str, "Failed to query content resolver.");
                        cursorQuery = null;
                    }
                    if (cursorQuery != null) {
                        while (cursorQuery.moveToNext()) {
                            try {
                                treeSet.add(Integer.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex("version"))));
                            } catch (Throwable th) {
                                cursor = cursorQuery;
                                th = th;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        }
                    }
                } else {
                    cursorQuery = null;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return treeSet;
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            com.facebook.internal.m0.i.a.b(th3, this);
            return null;
        }
    }

    public static final Bundle s(Intent intent) {
        if (com.facebook.internal.m0.i.a.d(c0.class)) {
            return null;
        }
        try {
            l.y.c.i.e(intent, "intent");
            if (E(B(intent))) {
                return intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
            }
            return null;
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c0.class);
            return null;
        }
    }

    public static final UUID t(Intent intent) {
        String stringExtra;
        if (com.facebook.internal.m0.i.a.d(c0.class) || intent == null) {
            return null;
        }
        try {
            if (E(B(intent))) {
                Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
                stringExtra = bundleExtra != null ? bundleExtra.getString("action_id") : null;
            } else {
                stringExtra = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
            }
            if (stringExtra == null) {
                return null;
            }
            try {
                return UUID.fromString(stringExtra);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c0.class);
            return null;
        }
    }

    public static final Bundle u(Intent intent) {
        if (com.facebook.internal.m0.i.a.d(c0.class)) {
            return null;
        }
        try {
            l.y.c.i.e(intent, "resultIntent");
            if (!D(intent)) {
                return null;
            }
            Bundle bundleS = s(intent);
            return bundleS != null ? bundleS.getBundle("error") : intent.getExtras();
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c0.class);
            return null;
        }
    }

    public static final com.facebook.n v(Bundle bundle) {
        if (com.facebook.internal.m0.i.a.d(c0.class) || bundle == null) {
            return null;
        }
        try {
            String string = bundle.getString("error_type");
            if (string == null) {
                string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
            }
            String string2 = bundle.getString("error_description");
            if (string2 == null) {
                string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
            }
            return (string == null || !l.d0.p.l(string, "UserCanceled", true)) ? new com.facebook.n(string2) : new com.facebook.p(string2);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c0.class);
            return null;
        }
    }

    public static final g w(String str, int[] iArr) {
        if (com.facebook.internal.m0.i.a.d(c0.class)) {
            return null;
        }
        try {
            l.y.c.i.e(str, "action");
            l.y.c.i.e(iArr, "versionSpec");
            List<f> listG = d.get(str);
            if (listG == null) {
                listG = l.t.m.g();
            }
            return f599g.x(listG, iArr);
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c0.class);
            return null;
        }
    }

    private final g x(List<? extends f> list, int[] iArr) {
        if (com.facebook.internal.m0.i.a.d(this)) {
            return null;
        }
        try {
            G();
            if (list == null) {
                return g.c.b();
            }
            for (f fVar : list) {
                int i2 = i(fVar.b(), z(), iArr);
                if (i2 != -1) {
                    return g.c.a(fVar, i2);
                }
            }
            return g.c.b();
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, this);
            return null;
        }
    }

    public static final int y(int i2) {
        if (com.facebook.internal.m0.i.a.d(c0.class)) {
            return 0;
        }
        try {
            return f599g.x(b, new int[]{i2}).d();
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c0.class);
            return 0;
        }
    }

    public static final int z() {
        if (com.facebook.internal.m0.i.a.d(c0.class)) {
            return 0;
        }
        try {
            return f[0].intValue();
        } catch (Throwable th) {
            com.facebook.internal.m0.i.a.b(th, c0.class);
            return 0;
        }
    }
}
