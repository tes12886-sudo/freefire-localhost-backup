package com.vk.sdk.l;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private final com.vk.sdk.k.c a;
    private EditText b;
    private ImageView c;
    private ProgressBar d;
    private float e;

    /* JADX INFO: renamed from: com.vk.sdk.l.a$a, reason: collision with other inner class name */
    class ViewOnFocusChangeListenerC0168a implements View.OnFocusChangeListener {
        final /* synthetic */ AlertDialog a;

        ViewOnFocusChangeListenerC0168a(a aVar, AlertDialog alertDialog) {
            this.a = alertDialog;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            if (z) {
                this.a.getWindow().setSoftInputMode(5);
            }
        }
    }

    class b implements TextView.OnEditorActionListener {
        final /* synthetic */ AlertDialog a;

        b(AlertDialog alertDialog) {
            this.a = alertDialog;
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
            if (i2 != 4) {
                return false;
            }
            a.this.g();
            this.a.dismiss();
            return true;
        }
    }

    class c implements DialogInterface.OnClickListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            a.this.g();
            dialogInterface.dismiss();
        }
    }

    class d implements DialogInterface.OnCancelListener {
        final /* synthetic */ AlertDialog a;

        d(AlertDialog alertDialog) {
            this.a = alertDialog;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            this.a.dismiss();
            a.this.a.d.m();
        }
    }

    class e extends com.vk.sdk.k.i.d.b {
        e() {
        }

        @Override // com.vk.sdk.k.i.a.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(com.vk.sdk.k.i.d dVar, Bitmap bitmap) {
            a.this.c.setImageBitmap(bitmap);
            a.this.c.setVisibility(0);
            a.this.d.setVisibility(8);
        }

        @Override // com.vk.sdk.k.i.a.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(com.vk.sdk.k.i.d dVar, com.vk.sdk.k.c cVar) {
            a.this.f();
        }
    }

    public a(com.vk.sdk.k.c cVar) {
        this.a = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        com.vk.sdk.k.i.d dVar = new com.vk.sdk.k.i.d(this.a.f1544i);
        dVar.f1559i = this.e;
        dVar.q(new e());
        com.vk.sdk.k.i.b.c(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        this.a.d(this.b.getText() != null ? this.b.getText().toString() : "");
    }

    public void h(Context context, DialogInterface.OnDismissListener onDismissListener) {
        View viewInflate = View.inflate(context, com.vk.sdk.b.a, null);
        this.b = (EditText) viewInflate.findViewById(com.vk.sdk.a.a);
        this.c = (ImageView) viewInflate.findViewById(com.vk.sdk.a.c);
        this.d = (ProgressBar) viewInflate.findViewById(com.vk.sdk.a.e);
        this.e = context.getResources().getDisplayMetrics().density;
        AlertDialog alertDialogCreate = new AlertDialog.Builder(context).setView(viewInflate).create();
        this.b.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0168a(this, alertDialogCreate));
        this.b.setOnEditorActionListener(new b(alertDialogCreate));
        alertDialogCreate.setButton(-2, context.getString(R.string.ok), new c());
        alertDialogCreate.setOnCancelListener(new d(alertDialogCreate));
        if (onDismissListener != null) {
            alertDialogCreate.setOnDismissListener(onDismissListener);
        }
        f();
        alertDialogCreate.show();
    }
}
