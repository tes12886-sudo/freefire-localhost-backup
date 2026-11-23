package com.facebook.share.b;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.w;
import com.facebook.internal.i0;
import com.facebook.u;
import com.facebook.x;
import com.facebook.y;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class c extends androidx.fragment.app.d {
    private static ScheduledThreadPoolExecutor D0;
    private volatile d A0;
    private volatile ScheduledFuture B0;
    private com.facebook.share.c.e C0;
    private ProgressBar x0;
    private TextView y0;
    private Dialog z0;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                c.this.z0.dismiss();
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    class b implements u.b {
        b() {
        }

        @Override // com.facebook.u.b
        public void b(x xVar) {
            com.facebook.q qVarB = xVar.b();
            if (qVarB != null) {
                c.this.b2(qVarB);
                return;
            }
            JSONObject jSONObjectC = xVar.c();
            d dVar = new d();
            try {
                dVar.d(jSONObjectC.getString("user_code"));
                dVar.c(jSONObjectC.getLong("expires_in"));
                c.this.e2(dVar);
            } catch (JSONException unused) {
                c.this.b2(new com.facebook.q(0, "", "Malformed server response"));
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.share.b.c$c, reason: collision with other inner class name */
    class RunnableC0101c implements Runnable {
        RunnableC0101c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                c.this.z0.dismiss();
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    private static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();
        private String a;
        private long b;

        static class a implements Parcelable.Creator<d> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i2) {
                return new d[i2];
            }
        }

        d() {
        }

        protected d(Parcel parcel) {
            this.a = parcel.readString();
            this.b = parcel.readLong();
        }

        public long a() {
            return this.b;
        }

        public String b() {
            return this.a;
        }

        public void c(long j2) {
            this.b = j2;
        }

        public void d(String str) {
            this.a = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.a);
            parcel.writeLong(this.b);
        }
    }

    private void Z1() {
        if (a0()) {
            w wVarM = A().m();
            wVarM.k(this);
            wVarM.f();
        }
    }

    private void a2(int i2, Intent intent) {
        if (this.A0 != null) {
            com.facebook.k0.a.a.a(this.A0.b());
        }
        com.facebook.q qVar = (com.facebook.q) intent.getParcelableExtra("error");
        if (qVar != null) {
            Toast.makeText(s(), qVar.c(), 0).show();
        }
        if (a0()) {
            androidx.fragment.app.e eVarM = m();
            eVarM.setResult(i2, intent);
            eVarM.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b2(com.facebook.q qVar) {
        Z1();
        Intent intent = new Intent();
        intent.putExtra("error", qVar);
        a2(-1, intent);
    }

    private static synchronized ScheduledThreadPoolExecutor c2() {
        if (D0 == null) {
            D0 = new ScheduledThreadPoolExecutor(1);
        }
        return D0;
    }

    private Bundle d2() {
        com.facebook.share.c.e eVar = this.C0;
        if (eVar == null) {
            return null;
        }
        if (eVar instanceof com.facebook.share.c.g) {
            return q.b((com.facebook.share.c.g) eVar);
        }
        if (eVar instanceof com.facebook.share.c.q) {
            return q.c((com.facebook.share.c.q) eVar);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e2(d dVar) {
        this.A0 = dVar;
        this.y0.setText(dVar.b());
        this.y0.setVisibility(0);
        this.x0.setVisibility(8);
        this.B0 = c2().schedule(new RunnableC0101c(), dVar.a(), TimeUnit.SECONDS);
    }

    private void g2() {
        Bundle bundleD2 = d2();
        if (bundleD2 == null || bundleD2.size() == 0) {
            b2(new com.facebook.q(0, "", "Failed to get share content"));
        }
        bundleD2.putString("access_token", i0.b() + "|" + i0.c());
        bundleD2.putString("device_info", com.facebook.k0.a.a.d());
        new u(null, "device/share", bundleD2, y.POST, new b()).j();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void M0(Bundle bundle) {
        super.M0(bundle);
        if (this.A0 != null) {
            bundle.putParcelable("request_state", this.A0);
        }
    }

    @Override // androidx.fragment.app.d
    public Dialog P1(Bundle bundle) {
        this.z0 = new Dialog(m(), com.facebook.common.e.b);
        View viewInflate = m().getLayoutInflater().inflate(com.facebook.common.c.b, (ViewGroup) null);
        this.x0 = (ProgressBar) viewInflate.findViewById(com.facebook.common.b.f);
        this.y0 = (TextView) viewInflate.findViewById(com.facebook.common.b.e);
        ((Button) viewInflate.findViewById(com.facebook.common.b.a)).setOnClickListener(new a());
        ((TextView) viewInflate.findViewById(com.facebook.common.b.b)).setText(Html.fromHtml(T(com.facebook.common.d.a)));
        this.z0.setContentView(viewInflate);
        g2();
        return this.z0;
    }

    public void f2(com.facebook.share.c.e eVar) {
        this.C0 = eVar;
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.B0 != null) {
            this.B0.cancel(true);
        }
        a2(-1, new Intent());
    }

    @Override // androidx.fragment.app.Fragment
    public View u0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        d dVar;
        View viewU0 = super.u0(layoutInflater, viewGroup, bundle);
        if (bundle != null && (dVar = (d) bundle.getParcelable("request_state")) != null) {
            e2(dVar);
        }
        return viewU0;
    }
}
