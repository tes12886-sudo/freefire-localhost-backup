package com.beetalk.sdk.plugin.e.i;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.vk.sdk.j;
import com.vk.sdk.k.k.i;
import com.vk.sdk.k.k.r;
import com.vk.sdk.k.k.t;
import com.vk.sdk.k.k.w;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class d {
    private EditText a;
    private Button b;
    private ProgressBar c;
    private LinearLayout d;
    private HorizontalScrollView e;
    private g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.vk.sdk.k.l.b[] f529g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private t f530h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CharSequence f531i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.beetalk.sdk.plugin.e.i.c.a f532j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final f f533k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    View.OnClickListener f534l = new e();

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d.this.f533k.dismissAllowingStateLoss();
            if (d.this.f532j != null) {
                d.this.f532j.c();
            }
        }
    }

    class b extends com.vk.sdk.k.f.d {
        b() {
        }

        @Override // com.vk.sdk.k.f.d
        public void b(com.vk.sdk.k.g gVar) {
            for (i iVar : (t) gVar.c) {
                char c = 'q';
                if (iVar.f1583n.w('q') == null) {
                    c = 'p';
                    if (iVar.f1583n.w('p') == null) {
                        c = 'm';
                        if (iVar.f1583n.w('m') != null) {
                        }
                    }
                }
                d.this.j(iVar.f1583n.w(c));
            }
        }

        @Override // com.vk.sdk.k.f.d
        public void c(com.vk.sdk.k.c cVar) {
            if (d.this.f532j != null) {
                d.this.f532j.a(cVar);
            }
        }
    }

    class c extends com.vk.sdk.k.i.d.b {
        final /* synthetic */ String a;
        final /* synthetic */ int b;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c cVar = c.this;
                d.this.k(cVar.a, cVar.b + 1);
            }
        }

        c(String str, int i2) {
            this.a = str;
            this.b = i2;
        }

        @Override // com.vk.sdk.k.i.a.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(com.vk.sdk.k.i.d dVar, Bitmap bitmap) {
            if (bitmap == null) {
                new Handler(Looper.getMainLooper()).postDelayed(new a(), 1000L);
            } else {
                d.this.i(bitmap);
            }
        }

        @Override // com.vk.sdk.k.i.a.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(com.vk.sdk.k.i.d dVar, com.vk.sdk.k.c cVar) {
        }
    }

    /* JADX INFO: renamed from: com.beetalk.sdk.plugin.e.i.d$d, reason: collision with other inner class name */
    class C0046d extends com.vk.sdk.k.f.d {
        C0046d() {
        }

        @Override // com.vk.sdk.k.f.d
        public void b(com.vk.sdk.k.g gVar) {
            d.this.s(false);
            w wVar = (w) gVar.c;
            if (d.this.f532j != null) {
                d.this.f532j.b(wVar.a);
            }
            d.this.f533k.dismissAllowingStateLoss();
        }

        @Override // com.vk.sdk.k.f.d
        public void c(com.vk.sdk.k.c cVar) {
            d.this.s(false);
            if (d.this.f532j != null) {
                d.this.f532j.a(cVar);
            }
        }
    }

    class e implements View.OnClickListener {

        class a extends com.vk.sdk.k.f.d {
            a() {
            }

            @Override // com.vk.sdk.k.f.d
            public void b(com.vk.sdk.k.g gVar) {
                d.this.l(new r((t) gVar.c));
            }

            @Override // com.vk.sdk.k.f.d
            public void c(com.vk.sdk.k.c cVar) {
                d.this.s(false);
                if (d.this.f532j != null) {
                    d.this.f532j.a(cVar);
                }
            }
        }

        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d.this.s(true);
            if (d.this.f529g == null || com.vk.sdk.i.g() == null) {
                d.this.l(null);
            } else {
                new com.vk.sdk.k.l.d(d.this.f529g, Long.valueOf(Long.parseLong(com.vk.sdk.i.g().c)).longValue(), 0).n(new a());
            }
        }
    }

    public interface f {
        void dismissAllowingStateLoss();

        Activity getActivity();

        Dialog getDialog();

        Resources getResources();
    }

    private static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();
        public String a;
        public String b;

        class a implements Parcelable.Creator<g> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, (a) null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i2) {
                return new g[i2];
            }
        }

        private g(Parcel parcel) {
            this.a = parcel.readString();
            this.b = parcel.readString();
        }

        /* synthetic */ g(Parcel parcel, a aVar) {
            this(parcel);
        }

        public g(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.a);
            parcel.writeString(this.b);
        }
    }

    public d(f fVar) {
        this.f533k = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(Bitmap bitmap) {
        Bitmap bitmapB;
        if (this.f533k.getActivity() == null || (bitmapB = j.b(bitmap, 100, 3)) == null) {
            return;
        }
        ImageView imageView = new ImageView(this.f533k.getActivity());
        imageView.setImageBitmap(bitmapB);
        imageView.setAdjustViewBounds(true);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(this.d.getChildCount() > 0 ? 10 : 0, 0, 0, 0);
        this.d.addView(imageView, layoutParams);
        this.d.invalidate();
        this.e.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(String str) {
        k(str, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(String str, int i2) {
        if (i2 > 10) {
            return;
        }
        com.vk.sdk.k.i.d dVar = new com.vk.sdk.k.i.d(str);
        dVar.q(new c(str, i2));
        com.vk.sdk.k.i.b.c(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(r rVar) {
        if (rVar == null) {
            rVar = new r();
        }
        t tVar = this.f530h;
        if (tVar != null) {
            rVar.addAll(tVar);
        }
        if (this.f != null) {
            rVar.add(new com.vk.sdk.k.k.f(this.f.b));
        }
        String string = this.a.getText().toString();
        com.vk.sdk.k.a.b().d(com.vk.sdk.k.d.a("owner_id", Long.valueOf(Long.parseLong(com.vk.sdk.i.g().c)), "message", string, "attachments", rVar.u())).n(new C0046d());
    }

    private void p() {
        ArrayList arrayList = new ArrayList(this.f530h.size());
        for (i iVar : this.f530h) {
            arrayList.add("" + iVar.c + '_' + iVar.a);
        }
        new com.vk.sdk.k.f("photos.getById", com.vk.sdk.k.d.a("photo_sizes", 1, "photos", com.vk.sdk.m.b.a(arrayList, ",")), t.class).n(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(boolean z) {
        if (z) {
            this.b.setVisibility(8);
            this.c.setVisibility(0);
            this.a.setEnabled(false);
            this.d.setEnabled(false);
            return;
        }
        this.b.setVisibility(0);
        this.c.setVisibility(8);
        this.a.setEnabled(true);
        this.d.setEnabled(true);
    }

    public void m(DialogInterface dialogInterface) {
        com.beetalk.sdk.plugin.e.i.c.a aVar = this.f532j;
        if (aVar != null) {
            aVar.c();
        }
    }

    public Dialog n(Bundle bundle) {
        Activity activity = this.f533k.getActivity();
        View viewInflate = View.inflate(activity, j.c.b.f.e, null);
        viewInflate.findViewById(j.c.b.e.c).setOnClickListener(new a());
        this.b = (Button) viewInflate.findViewById(j.c.b.e.p);
        this.c = (ProgressBar) viewInflate.findViewById(j.c.b.e.q);
        this.d = (LinearLayout) viewInflate.findViewById(j.c.b.e.f);
        this.a = (EditText) viewInflate.findViewById(j.c.b.e.r);
        this.e = (HorizontalScrollView) viewInflate.findViewById(j.c.b.e.f1933g);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(j.c.b.e.a);
        this.b.setOnClickListener(this.f534l);
        if (bundle != null) {
            this.a.setText(bundle.getString("ShareText"));
            this.f = (g) bundle.getParcelable("ShareLink");
            this.f529g = (com.vk.sdk.k.l.b[]) bundle.getParcelableArray("ShareImages");
            this.f530h = (t) bundle.getParcelable("ShareUploadedImages");
        } else {
            CharSequence charSequence = this.f531i;
            if (charSequence != null) {
                this.a.setText(charSequence);
            }
        }
        this.d.removeAllViews();
        com.vk.sdk.k.l.b[] bVarArr = this.f529g;
        if (bVarArr != null) {
            for (com.vk.sdk.k.l.b bVar : bVarArr) {
                i(bVar.c);
            }
            this.d.setVisibility(0);
        }
        if (this.f530h != null) {
            p();
        }
        if (this.f530h == null && this.f529g == null) {
            this.d.setVisibility(8);
        }
        if (this.f != null) {
            TextView textView = (TextView) linearLayout.findViewById(j.c.b.e.f1935i);
            TextView textView2 = (TextView) linearLayout.findViewById(j.c.b.e.f1934h);
            textView.setText(this.f.a);
            textView2.setText(com.vk.sdk.m.c.d(this.f.b));
            linearLayout.setVisibility(0);
        } else {
            linearLayout.setVisibility(8);
        }
        Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(1);
        dialog.setContentView(viewInflate);
        dialog.setCancelable(true);
        return dialog;
    }

    public void o() {
        int dimensionPixelSize;
        if (Build.VERSION.SDK_INT >= 13) {
            Display defaultDisplay = ((WindowManager) this.f533k.getActivity().getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            dimensionPixelSize = point.x - (this.f533k.getResources().getDimensionPixelSize(j.c.b.c.a) * 2);
        } else {
            dimensionPixelSize = -2;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(this.f533k.getDialog().getWindow().getAttributes());
        layoutParams.height = -2;
        layoutParams.width = dimensionPixelSize;
        this.f533k.getDialog().getWindow().setAttributes(layoutParams);
    }

    public void q(com.vk.sdk.k.l.b[] bVarArr) {
        this.f529g = bVarArr;
    }

    public void r(String str, String str2) {
        this.f = new g(str, str2);
    }

    public void t(com.beetalk.sdk.plugin.e.i.c.a aVar) {
        this.f532j = aVar;
    }

    public void u(CharSequence charSequence) {
        this.f531i = charSequence;
    }

    public void v(t tVar) {
        this.f530h = tVar;
    }
}
