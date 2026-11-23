package com.gamesafe.ano;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class d implements g {
    private Context b;
    private String c;
    private String d;
    private String e;
    private int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f806g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f807h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private g.a f808i;
    AlertDialog a = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private DialogInterface.OnDismissListener f809j = new e(this);

    public d(Context context, String str, String str2, String str3, int i2, int i3, g.a aVar) {
        this.b = context;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = i2;
        this.f806g = i3;
        this.f808i = aVar;
    }

    private int a(Context context, int i2) {
        return (int) ((i2 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private Drawable a(Context context, String str, boolean z) {
        PackageManager packageManager = context.getPackageManager();
        try {
            Drawable drawableLoadIcon = packageManager.getPackageInfo(str, 0).applicationInfo.loadIcon(packageManager);
            if (z) {
                a(context, drawableLoadIcon);
            }
            return drawableLoadIcon;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private TextView a(String str) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        TextView textView = new TextView(this.b);
        textView.setLayoutParams(layoutParams);
        textView.setText(str);
        a(textView);
        return textView;
    }

    private void a(Context context, Drawable drawable) {
        if (drawable != null) {
            int iA = a(context, 36);
            drawable.setBounds(0, 0, iA, iA);
        }
    }

    private void a(SeekBar seekBar) {
        int iA = a(this.b, 20);
        int iA2 = a(this.b, 1);
        int iA3 = a(this.b, 5);
        seekBar.setBackgroundColor(Color.parseColor("#000000"));
        seekBar.setPadding(iA, iA2, iA, iA3);
    }

    private void a(TextView textView) {
        int iA = a(this.b, 20);
        int iA2 = a(this.b, 6);
        int iA3 = a(this.b, 10);
        textView.setTextColor(Color.parseColor("#FFFFFF"));
        textView.setTextSize(2, 18.0f);
        textView.setBackgroundColor(Color.parseColor("#000000"));
        textView.setPadding(iA, iA2, iA, iA3);
    }

    private View d() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int iA = a(this.b, 10);
        int i2 = iA / 2;
        layoutParams.setMargins(iA, i2, iA, i2);
        LinearLayout linearLayout = new LinearLayout(this.b);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        linearLayout.addView(e());
        linearLayout.addView(f());
        return linearLayout;
    }

    private TextView e() {
        String str;
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        TextView textView = new TextView(this.b);
        textView.setLayoutParams(layoutParams);
        textView.setText(this.c);
        textView.setGravity(17);
        a(textView);
        String[] strArrSplit = this.c.split(":");
        if (strArrSplit != null && strArrSplit.length == 3) {
            Drawable drawableA = a(this.b, strArrSplit[1], true);
            if (drawableA != null) {
                textView.setCompoundDrawables(drawableA, null, null, null);
                str = "  " + strArrSplit[2];
            } else {
                str = strArrSplit[2];
            }
            textView.setText(str);
        }
        return textView;
    }

    private View f() {
        LinearLayout linearLayout = new LinearLayout(this.b);
        linearLayout.setOrientation(1);
        linearLayout.addView(a(this.d));
        TextView textViewA = a(String.format(Locale.ENGLISH, "%s%d", this.e, 0));
        SeekBar seekBar = new SeekBar(this.b);
        seekBar.setMax(this.f);
        seekBar.setKeyProgressIncrement(1);
        a(seekBar);
        seekBar.setOnSeekBarChangeListener(new f(this, textViewA));
        linearLayout.addView(seekBar);
        linearLayout.addView(textViewA);
        return linearLayout;
    }

    @Override // com.gamesafe.ano.g
    public void a() {
        if (this.d == null || this.e == null || this.f < this.f806g) {
            return;
        }
        AlertDialog.Builder builder = Build.VERSION.SDK_INT >= 11 ? new AlertDialog.Builder(this.b, 1) : new AlertDialog.Builder(this.b);
        builder.setCancelable(false);
        builder.setView(d());
        AlertDialog alertDialogCreate = builder.create();
        this.a = alertDialogCreate;
        alertDialogCreate.setOnDismissListener(this.f809j);
        this.a.show();
        b();
    }

    protected void b() {
        AlertDialog alertDialog;
        float f;
        float f2;
        if (this.b == null || (alertDialog = this.a) == null) {
            return;
        }
        WindowManager.LayoutParams attributes = alertDialog.getWindow().getAttributes();
        Display defaultDisplay = ((WindowManager) this.b.getSystemService(a.a("rdiyjr"))).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        int i2 = point.y;
        int i3 = point.x;
        if (i2 > i3) {
            f = i3;
            f2 = 0.9f;
        } else {
            f = i3;
            f2 = 0.6f;
        }
        attributes.width = (int) (f * f2);
        this.a.getWindow().setAttributes(attributes);
        this.a.getWindow().setGravity(17);
        this.a.setCanceledOnTouchOutside(false);
    }

    @Override // com.gamesafe.ano.g
    public void c() {
        AlertDialog alertDialog = this.a;
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.a = null;
        }
    }
}
