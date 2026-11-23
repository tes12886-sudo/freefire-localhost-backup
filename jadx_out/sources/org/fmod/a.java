package org.fmod;

import android.media.AudioRecord;
import android.util.Log;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
final class a implements Runnable {
    private final FMODAudioDevice a;
    private final ByteBuffer b;
    private final int c;
    private final int d;
    private final int e = 2;
    private volatile Thread f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile boolean f2383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AudioRecord f2384h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f2385i;

    a(FMODAudioDevice fMODAudioDevice, int i2, int i3) {
        this.a = fMODAudioDevice;
        this.c = i2;
        this.d = i3;
        this.b = ByteBuffer.allocateDirect(AudioRecord.getMinBufferSize(i2, i3, 2));
    }

    private void d() {
        AudioRecord audioRecord = this.f2384h;
        if (audioRecord != null) {
            if (audioRecord.getState() == 1) {
                this.f2384h.stop();
            }
            this.f2384h.release();
            this.f2384h = null;
        }
        this.b.position(0);
        this.f2385i = false;
    }

    public final int a() {
        return this.b.capacity();
    }

    public final void b() {
        if (this.f != null) {
            c();
        }
        this.f2383g = true;
        this.f = new Thread(this);
        this.f.start();
    }

    public final void c() {
        while (this.f != null) {
            this.f2383g = false;
            try {
                this.f.join();
                this.f = null;
            } catch (InterruptedException unused) {
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = 3;
        while (this.f2383g) {
            if (!this.f2385i && i2 > 0) {
                d();
                AudioRecord audioRecord = new AudioRecord(1, this.c, this.d, this.e, this.b.capacity());
                this.f2384h = audioRecord;
                boolean z = audioRecord.getState() == 1;
                this.f2385i = z;
                if (z) {
                    this.b.position(0);
                    this.f2384h.startRecording();
                    i2 = 3;
                } else {
                    Log.e("FMOD", "AudioRecord failed to initialize (status " + this.f2384h.getState() + ")");
                    i2 += -1;
                    d();
                }
            }
            if (this.f2385i && this.f2384h.getRecordingState() == 3) {
                AudioRecord audioRecord2 = this.f2384h;
                ByteBuffer byteBuffer = this.b;
                this.a.fmodProcessMicData(this.b, audioRecord2.read(byteBuffer, byteBuffer.capacity()));
                this.b.position(0);
            }
        }
        d();
    }
}
