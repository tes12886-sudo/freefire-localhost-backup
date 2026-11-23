package com.garena.pay.android.k;

import android.app.Activity;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class g {
    protected c a;
    protected View b;
    protected Activity c;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view.getTag() != null && g.this.a.h() != null) {
                g.this.a.h().b(view.getTag());
            }
            g.this.a.g(false);
        }
    }

    public g(Activity activity, c cVar) {
        this.a = cVar;
        a(activity, j.c.b.f.b);
    }

    public g(Activity activity, c cVar, int i2) {
        this.a = cVar;
        a(activity, i2);
    }

    protected void a(Activity activity, int i2) {
        this.c = activity;
        com.garena.pay.android.j.a.b(activity.getResources().getDisplayMetrics());
        this.b = this.c.getLayoutInflater().inflate(i2, (ViewGroup) null);
    }

    public View b() {
        return this.b;
    }

    protected void c(e eVar, ImageView imageView) {
        if (com.garena.pay.android.j.d.d(eVar.c)) {
            imageView.setImageResource(eVar.b);
            return;
        }
        com.beetalk.sdk.x.f.b bVarB = com.beetalk.sdk.x.f.b(eVar.c);
        bVarB.b(j.c.b.d.a);
        bVarB.a(imageView);
    }

    public void d(e eVar) {
        View view = this.b;
        if (view != null) {
            TextView textView = (TextView) view.findViewById(j.c.b.e.f1938l);
            ImageView imageView = (ImageView) this.b.findViewById(j.c.b.e.f1939m);
            Button button = (Button) this.b.findViewById(j.c.b.e.d);
            c(eVar, imageView);
            textView.setText(eVar.a);
            if (!TextUtils.isEmpty(eVar.f)) {
                String str = "  " + eVar.f;
                SpannableString spannableString = new SpannableString(str);
                spannableString.setSpan(new ForegroundColorSpan(this.c.getResources().getColor(j.c.b.b.b)), 0, str.length(), 33);
                textView.append(spannableString);
            }
            if (!com.garena.pay.android.j.d.d(eVar.d)) {
                button.setText(eVar.d);
            }
            this.b.setTag(eVar.e);
            button.setTag(eVar.e);
            a aVar = new a();
            if (TextUtils.isEmpty(button.getText())) {
                this.b.setOnClickListener(aVar);
            } else {
                button.setOnClickListener(aVar);
            }
        }
    }
}
