package com.facebook.login;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.FacebookActivity;
import com.facebook.internal.g0;
import com.facebook.internal.h0;
import com.facebook.internal.i0;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class d extends androidx.fragment.app.d {
    private com.facebook.login.e A0;
    private volatile com.facebook.v C0;
    private volatile ScheduledFuture D0;
    private volatile i E0;
    private View x0;
    private TextView y0;
    private TextView z0;
    private AtomicBoolean B0 = new AtomicBoolean();
    private boolean F0 = false;
    private boolean G0 = false;
    private l.d H0 = null;

    class a extends Dialog {
        a(Context context, int i2) {
            super(context, i2);
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            d.this.n2();
            super.onBackPressed();
        }
    }

    class b implements com.facebook.u.b {
        b() {
        }

        @Override // com.facebook.u.b
        public void b(com.facebook.x xVar) {
            if (d.this.F0) {
                return;
            }
            if (xVar.b() != null) {
                d.this.p2(xVar.b().e());
                return;
            }
            JSONObject jSONObjectC = xVar.c();
            i iVar = new i();
            try {
                iVar.h(jSONObjectC.getString("user_code"));
                iVar.g(jSONObjectC.getString("code"));
                iVar.e(jSONObjectC.getLong("interval"));
                d.this.u2(iVar);
            } catch (JSONException e) {
                d.this.p2(new com.facebook.n(e));
            }
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                d.this.o2();
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.d$d, reason: collision with other inner class name */
    class RunnableC0099d implements Runnable {
        RunnableC0099d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.facebook.internal.m0.i.a.d(this)) {
                return;
            }
            try {
                d.this.r2();
            } catch (Throwable th) {
                com.facebook.internal.m0.i.a.b(th, this);
            }
        }
    }

    class e implements com.facebook.u.b {
        e() {
        }

        @Override // com.facebook.u.b
        public void b(com.facebook.x xVar) {
            if (d.this.B0.get()) {
                return;
            }
            com.facebook.q qVarB = xVar.b();
            if (qVarB == null) {
                try {
                    JSONObject jSONObjectC = xVar.c();
                    d.this.q2(jSONObjectC.getString("access_token"), Long.valueOf(jSONObjectC.getLong("expires_in")), Long.valueOf(jSONObjectC.optLong("data_access_expiration_time")));
                    return;
                } catch (JSONException e) {
                    d.this.p2(new com.facebook.n(e));
                    return;
                }
            }
            int iG = qVarB.g();
            if (iG != 1349152) {
                switch (iG) {
                    case 1349172:
                    case 1349174:
                        d.this.t2();
                        break;
                    case 1349173:
                        break;
                    default:
                        d.this.p2(xVar.b().e());
                        break;
                }
                return;
            }
            if (d.this.E0 != null) {
                com.facebook.k0.a.a.a(d.this.E0.d());
            }
            if (d.this.H0 != null) {
                d dVar = d.this;
                dVar.v2(dVar.H0);
                return;
            }
            d.this.o2();
        }
    }

    class f implements DialogInterface.OnClickListener {
        f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            d.this.N1().setContentView(d.this.m2(false));
            d dVar = d.this;
            dVar.v2(dVar.H0);
        }
    }

    class g implements DialogInterface.OnClickListener {
        final /* synthetic */ String a;
        final /* synthetic */ h0.c b;
        final /* synthetic */ String c;
        final /* synthetic */ Date d;
        final /* synthetic */ Date e;

        g(String str, h0.c cVar, String str2, Date date, Date date2) {
            this.a = str;
            this.b = cVar;
            this.c = str2;
            this.d = date;
            this.e = date2;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            d.this.j2(this.a, this.b, this.c, this.d, this.e);
        }
    }

    class h implements com.facebook.u.b {
        final /* synthetic */ String a;
        final /* synthetic */ Date b;
        final /* synthetic */ Date c;

        h(String str, Date date, Date date2) {
            this.a = str;
            this.b = date;
            this.c = date2;
        }

        @Override // com.facebook.u.b
        public void b(com.facebook.x xVar) {
            if (d.this.B0.get()) {
                return;
            }
            if (xVar.b() != null) {
                d.this.p2(xVar.b().e());
                return;
            }
            try {
                JSONObject jSONObjectC = xVar.c();
                String string = jSONObjectC.getString("id");
                h0.c cVarL = h0.L(jSONObjectC);
                String string2 = jSONObjectC.getString("name");
                com.facebook.k0.a.a.a(d.this.E0.d());
                if (!com.facebook.internal.u.j(com.facebook.r.g()).k().contains(g0.RequireConfirm) || d.this.G0) {
                    d.this.j2(string, cVarL, this.a, this.b, this.c);
                } else {
                    d.this.G0 = true;
                    d.this.s2(string, cVarL, this.a, string2, this.b, this.c);
                }
            } catch (JSONException e) {
                d.this.p2(new com.facebook.n(e));
            }
        }
    }

    private static class i implements Parcelable {
        public static final Parcelable.Creator<i> CREATOR = new a();
        private String a;
        private String b;
        private String c;
        private long d;
        private long e;

        static class a implements Parcelable.Creator<i> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public i[] newArray(int i2) {
                return new i[i2];
            }
        }

        i() {
        }

        protected i(Parcel parcel) {
            this.a = parcel.readString();
            this.b = parcel.readString();
            this.c = parcel.readString();
            this.d = parcel.readLong();
            this.e = parcel.readLong();
        }

        public String a() {
            return this.a;
        }

        public long b() {
            return this.d;
        }

        public String c() {
            return this.c;
        }

        public String d() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public void e(long j2) {
            this.d = j2;
        }

        public void f(long j2) {
            this.e = j2;
        }

        public void g(String str) {
            this.c = str;
        }

        public void h(String str) {
            this.b = str;
            this.a = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", str);
        }

        public boolean i() {
            return this.e != 0 && (new Date().getTime() - this.e) - (this.d * 1000) < 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeLong(this.d);
            parcel.writeLong(this.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j2(String str, h0.c cVar, String str2, Date date, Date date2) {
        this.A0.v(str2, com.facebook.r.g(), str, cVar.c(), cVar.a(), cVar.b(), com.facebook.e.DEVICE_AUTH, date, null, date2);
        N1().dismiss();
    }

    private com.facebook.u l2() {
        Bundle bundle = new Bundle();
        bundle.putString("code", this.E0.c());
        return new com.facebook.u(null, "device/login_status", bundle, com.facebook.y.POST, new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q2(String str, Long l2, Long l3) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        Date date = null;
        Date date2 = l2.longValue() != 0 ? new Date(new Date().getTime() + (l2.longValue() * 1000)) : null;
        if (l3.longValue() != 0 && l3 != null) {
            date = new Date(l3.longValue() * 1000);
        }
        new com.facebook.u(new com.facebook.a(str, com.facebook.r.g(), "0", null, null, null, null, date2, null, date), "me", bundle, com.facebook.y.GET, new h(str, date2, date)).j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r2() {
        this.E0.f(new Date().getTime());
        this.C0 = l2().j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s2(String str, h0.c cVar, String str2, String str3, Date date, Date date2) {
        String string = M().getString(com.facebook.common.d.f574g);
        String string2 = M().getString(com.facebook.common.d.f);
        String string3 = M().getString(com.facebook.common.d.e);
        String str4 = String.format(string2, str3);
        AlertDialog.Builder builder = new AlertDialog.Builder(s());
        builder.setMessage(string).setCancelable(true).setNegativeButton(str4, new g(str, cVar, str2, date, date2)).setPositiveButton(string3, new f());
        builder.create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t2() {
        this.D0 = com.facebook.login.e.s().schedule(new RunnableC0099d(), this.E0.b(), TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u2(i iVar) {
        this.E0 = iVar;
        this.y0.setText(iVar.d());
        this.z0.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, new BitmapDrawable(M(), com.facebook.k0.a.a.c(iVar.a())), (Drawable) null, (Drawable) null);
        this.y0.setVisibility(0);
        this.x0.setVisibility(8);
        if (!this.G0 && com.facebook.k0.a.a.g(iVar.d())) {
            new com.facebook.j0.m(s()).f("fb_smart_login_service");
        }
        if (iVar.i()) {
            t2();
        } else {
            r2();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void M0(Bundle bundle) {
        super.M0(bundle);
        if (this.E0 != null) {
            bundle.putParcelable("request_state", this.E0);
        }
    }

    @Override // androidx.fragment.app.d
    public Dialog P1(Bundle bundle) {
        a aVar = new a(m(), com.facebook.common.e.b);
        aVar.setContentView(m2(com.facebook.k0.a.a.f() && !this.G0));
        return aVar;
    }

    Map<String, String> i2() {
        return null;
    }

    protected int k2(boolean z) {
        return z ? com.facebook.common.c.d : com.facebook.common.c.b;
    }

    protected View m2(boolean z) {
        View viewInflate = m().getLayoutInflater().inflate(k2(z), (ViewGroup) null);
        this.x0 = viewInflate.findViewById(com.facebook.common.b.f);
        this.y0 = (TextView) viewInflate.findViewById(com.facebook.common.b.e);
        ((Button) viewInflate.findViewById(com.facebook.common.b.a)).setOnClickListener(new c());
        TextView textView = (TextView) viewInflate.findViewById(com.facebook.common.b.b);
        this.z0 = textView;
        textView.setText(Html.fromHtml(T(com.facebook.common.d.a)));
        return viewInflate;
    }

    protected void n2() {
    }

    protected void o2() {
        if (this.B0.compareAndSet(false, true)) {
            if (this.E0 != null) {
                com.facebook.k0.a.a.a(this.E0.d());
            }
            com.facebook.login.e eVar = this.A0;
            if (eVar != null) {
                eVar.t();
            }
            N1().dismiss();
        }
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.F0) {
            return;
        }
        o2();
    }

    protected void p2(com.facebook.n nVar) {
        if (this.B0.compareAndSet(false, true)) {
            if (this.E0 != null) {
                com.facebook.k0.a.a.a(this.E0.d());
            }
            this.A0.u(nVar);
            N1().dismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View u0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i iVar;
        View viewU0 = super.u0(layoutInflater, viewGroup, bundle);
        this.A0 = (com.facebook.login.e) ((n) ((FacebookActivity) m()).B()).M1().j();
        if (bundle != null && (iVar = (i) bundle.getParcelable("request_state")) != null) {
            u2(iVar);
        }
        return viewU0;
    }

    public void v2(l.d dVar) {
        this.H0 = dVar;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", dVar.k()));
        String strF = dVar.f();
        if (strF != null) {
            bundle.putString("redirect_uri", strF);
        }
        String strE = dVar.e();
        if (strE != null) {
            bundle.putString("target_user_id", strE);
        }
        bundle.putString("access_token", i0.b() + "|" + i0.c());
        bundle.putString("device_info", com.facebook.k0.a.a.e(i2()));
        new com.facebook.u(null, "device/login", bundle, com.facebook.y.POST, new b()).j();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void x0() {
        this.F0 = true;
        this.B0.set(true);
        super.x0();
        if (this.C0 != null) {
            this.C0.cancel(true);
        }
        if (this.D0 != null) {
            this.D0.cancel(true);
        }
        this.x0 = null;
        this.y0 = null;
        this.z0 = null;
    }
}
