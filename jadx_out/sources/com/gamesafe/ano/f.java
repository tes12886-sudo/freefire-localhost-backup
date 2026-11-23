package com.gamesafe.ano;

import android.widget.SeekBar;
import android.widget.TextView;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
class f implements SeekBar.OnSeekBarChangeListener {
    final /* synthetic */ TextView a;
    final /* synthetic */ d b;

    f(d dVar, TextView textView) {
        this.b = dVar;
        this.a = textView;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
        this.a.setText(String.format(Locale.ENGLISH, "%s%d", this.b.e, Integer.valueOf(i2)));
        this.b.f807h = i2;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        AnoSdk.ioctl(String.format(Locale.ENGLISH, a.a("VyyVijOjpxcZqzio:xvko_kmjx=%y"), Integer.valueOf(this.b.f807h)));
        seekBar.setProgress(0);
    }
}
