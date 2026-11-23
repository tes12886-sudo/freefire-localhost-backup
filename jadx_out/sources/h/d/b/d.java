package h.d.b;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.SparseArray;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final Intent a;
    public final Bundle b;

    public static final class a {
        private ArrayList<Bundle> c;
        private Bundle d;
        private ArrayList<Bundle> e;
        private SparseArray<Bundle> f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Bundle f1767g;
        private final Intent a = new Intent("android.intent.action.VIEW");
        private final h.d.b.a.C0186a b = new h.d.b.a.C0186a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f1768h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f1769i = true;

        public a() {
        }

        public a(f fVar) {
            if (fVar != null) {
                b(fVar);
            }
        }

        private void c(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            androidx.core.app.e.b(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.a.putExtras(bundle);
        }

        public d a() {
            if (!this.a.hasExtra("android.support.customtabs.extra.SESSION")) {
                c(null, null);
            }
            ArrayList<Bundle> arrayList = this.c;
            if (arrayList != null) {
                this.a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.e;
            if (arrayList2 != null) {
                this.a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f1769i);
            this.a.putExtras(this.b.a().a());
            Bundle bundle = this.f1767g;
            if (bundle != null) {
                this.a.putExtras(bundle);
            }
            if (this.f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f);
                this.a.putExtras(bundle2);
            }
            this.a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f1768h);
            return new d(this.a, this.d);
        }

        public a b(f fVar) {
            this.a.setPackage(fVar.d().getPackageName());
            c(fVar.c(), fVar.e());
            return this;
        }

        @Deprecated
        public a d(int i2) {
            this.b.b(i2);
            return this;
        }
    }

    d(Intent intent, Bundle bundle) {
        this.a = intent;
        this.b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.a.setData(uri);
        androidx.core.content.a.l(context, this.a, this.b);
    }
}
