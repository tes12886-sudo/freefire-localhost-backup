package com.garena.pay.android.k;

import android.app.Activity;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class f extends g {

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view.getTag() != null && f.this.a.h() != null) {
                f.this.a.h().b(view.getTag());
            }
            f.this.a.g(false);
        }
    }

    public f(Activity activity, c cVar) {
        super(activity, cVar, j.c.b.f.a);
    }

    private void e(d dVar) {
        View view = this.b;
        if (view != null) {
            TextView textView = (TextView) view.findViewById(j.c.b.e.f1938l);
            ImageView imageView = (ImageView) this.b.findViewById(j.c.b.e.f1939m);
            TextView textView2 = (TextView) this.b.findViewById(j.c.b.e.e);
            LinearLayout linearLayout = (LinearLayout) this.b.findViewById(j.c.b.e.d);
            ((ImageView) this.b.findViewById(j.c.b.e.f1941o)).setVisibility(8);
            c(dVar, imageView);
            textView.setText(dVar.a);
            if (!TextUtils.isEmpty(dVar.f)) {
                String str = "\n" + dVar.f;
                SpannableString spannableString = new SpannableString(str);
                spannableString.setSpan(new ForegroundColorSpan(this.c.getResources().getColor(j.c.b.b.b)), 0, str.length(), 33);
                textView.append(spannableString);
            }
            if (!com.garena.pay.android.j.d.d(dVar.d)) {
                textView2.setText(dVar.d);
            }
            this.b.setTag(dVar.e);
            linearLayout.setTag(dVar.e);
            a aVar = new a();
            if (TextUtils.isEmpty(textView2.getText())) {
                this.b.setOnClickListener(aVar);
            } else {
                linearLayout.setOnClickListener(aVar);
            }
        }
    }

    @Override // com.garena.pay.android.k.g
    public void d(e eVar) {
        if (eVar instanceof d) {
            e((d) eVar);
        } else {
            super.d(eVar);
        }
    }
}
