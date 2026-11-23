package org.fmod;

import android.media.AudioTrack;
import android.util.Log;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class FMODAudioDevice implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f2378h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f2379i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f2380j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f2381k = 3;
    private volatile Thread a = null;
    private volatile boolean b = false;
    private AudioTrack c = null;
    private boolean d = false;
    private ByteBuffer e = null;
    private byte[] f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile a f2382g;

    private native int fmodGetInfo(int i2);

    private native int fmodProcess(ByteBuffer byteBuffer);

    private void releaseAudioTrack() {
        AudioTrack audioTrack = this.c;
        if (audioTrack != null) {
            if (audioTrack.getState() == 1) {
                this.c.stop();
            }
            this.c.release();
            this.c = null;
        }
        this.e = null;
        this.f = null;
        this.d = false;
    }

    public synchronized void close() {
        stop();
    }

    native int fmodProcessMicData(ByteBuffer byteBuffer, int i2);

    public boolean isRunning() {
        return this.a != null && this.a.isAlive();
    }

    @Override // java.lang.Runnable
    public void run() {
        int i2 = 3;
        while (this.b) {
            if (!this.d && i2 > 0) {
                releaseAudioTrack();
                int iFmodGetInfo = fmodGetInfo(f2378h);
                int iRound = Math.round(AudioTrack.getMinBufferSize(iFmodGetInfo, 3, 2) * 1.1f) & (-4);
                int iFmodGetInfo2 = fmodGetInfo(f2379i);
                int iFmodGetInfo3 = fmodGetInfo(f2380j) * iFmodGetInfo2 * 4;
                AudioTrack audioTrack = new AudioTrack(3, iFmodGetInfo, 3, 2, iFmodGetInfo3 > iRound ? iFmodGetInfo3 : iRound, 1);
                this.c = audioTrack;
                boolean z = audioTrack.getState() == 1;
                this.d = z;
                if (z) {
                    ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(iFmodGetInfo2 * 2 * 2);
                    this.e = byteBufferAllocateDirect;
                    this.f = new byte[byteBufferAllocateDirect.capacity()];
                    this.c.play();
                    i2 = 3;
                } else {
                    Log.e("FMOD", "AudioTrack failed to initialize (status " + this.c.getState() + ")");
                    releaseAudioTrack();
                    i2 += -1;
                }
            }
            if (this.d) {
                if (fmodGetInfo(f2381k) == 1) {
                    fmodProcess(this.e);
                    ByteBuffer byteBuffer = this.e;
                    byteBuffer.get(this.f, 0, byteBuffer.capacity());
                    this.c.write(this.f, 0, this.e.capacity());
                    this.e.position(0);
                } else {
                    releaseAudioTrack();
                }
            }
        }
        releaseAudioTrack();
    }

    public synchronized void start() {
        if (this.a != null) {
            stop();
        }
        this.a = new Thread(this, "FMODAudioDevice");
        this.a.setPriority(10);
        this.b = true;
        this.a.start();
        if (this.f2382g != null) {
            this.f2382g.b();
        }
    }

    public synchronized int startAudioRecord(int i2, int i3, int i4) {
        if (this.f2382g == null) {
            this.f2382g = new a(this, i2, i3);
            this.f2382g.b();
        }
        return this.f2382g.a();
    }

    public synchronized void stop() {
        while (this.a != null) {
            this.b = false;
            try {
                this.a.join();
                this.a = null;
            } catch (InterruptedException unused) {
            }
        }
        if (this.f2382g != null) {
            this.f2382g.c();
        }
    }

    public synchronized void stopAudioRecord() {
        if (this.f2382g != null) {
            this.f2382g.c();
            this.f2382g = null;
        }
    }
}
