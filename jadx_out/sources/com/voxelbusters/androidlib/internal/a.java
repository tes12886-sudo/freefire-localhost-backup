package com.voxelbusters.androidlib.internal;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.util.Log;
import android.view.Surface;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private MediaCodec a;
    private MediaCodec.BufferInfo d;
    private int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f1653g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f1656j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.voxelbusters.androidlib.c.b f1657k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f1658l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f1659m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f1660n;
    private ByteBuffer[] b = null;
    private ByteBuffer[] c = null;
    private FileOutputStream e = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f1654h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList<com.voxelbusters.androidlib.b.a> f1655i = new ArrayList<>();

    /* JADX INFO: renamed from: com.voxelbusters.androidlib.internal.a$a, reason: collision with other inner class name */
    class RunnableC0173a implements Runnable {
        RunnableC0173a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x00d4, code lost:
        
            com.voxelbusters.androidlib.internal.a.i(r14.a);
            r8 = r2.a(r14.a.f1653g, Short.MAX_VALUE, r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00e5, code lost:
        
            if (r8 > 0) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00e9, code lost:
        
            r6 = r14.a.a.dequeueInputBuffer(10000);
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00f5, code lost:
        
            if (r6 < 0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00f7, code lost:
        
            r1 = r14.a.b[r6];
            r1.clear();
            r1.put(r0, 0, r8);
            r1.limit(r8);
            r14.a.a.queueInputBuffer(r6, 0, r8, r14.a.s(r8), 0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0119, code lost:
        
            r1 = r14.a.a.dequeueOutputBuffer(r14.a.d, 10000);
            r2 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x012a, code lost:
        
            if (r1 < 0) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x012c, code lost:
        
            r4 = r14.a.d.size;
            r5 = r4 + 7;
            r6 = r14.a.c[r1];
            r6.position(r14.a.d.offset);
            r6.limit(r14.a.d.offset + r4);
            r14.a.p(r0, r2, r5);
            r6.get(r0, r2 + 7, r4);
            r6.position(r14.a.d.offset);
            r2 = r2 + r5;
            r14.a.a.releaseOutputBuffer(r1, false);
            r1 = r14.a.a.dequeueOutputBuffer(r14.a.d, 10000);
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0185, code lost:
        
            r14.a.e.write(r0, 0, r2);
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            try {
                byte[] bArr = new byte[131072];
                while (true) {
                    synchronized (a.this.f1655i) {
                        try {
                            if (!a.this.f1656j) {
                                if (a.this.f1655i.isEmpty()) {
                                    break;
                                }
                                double d = a.this.f1658l - a.this.f1659m;
                                double d2 = a.this.f1660n;
                                Double.isNaN(d);
                                Double.isNaN(d2);
                                int iRound = (int) Math.round((d / d2) * 100.0d);
                                if (a.this.f1657k != null) {
                                    a.this.f1657k.onAudioEncodeProgress(iRound);
                                }
                                e.printStackTrace();
                            }
                            if (!a.this.f1655i.isEmpty()) {
                                com.voxelbusters.androidlib.b.a aVar = (com.voxelbusters.androidlib.b.a) a.this.f1655i.get(0);
                                a.this.f1655i.remove(0);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                Log.d("AacEncode", "audio real record stop write count = " + a.this.f1658l + "  encode count" + a.this.f1659m);
                a.this.a.stop();
                a.this.a.release();
                a.this.e.close();
                if (a.this.f1657k != null) {
                    a.this.f1657k.onAudioEncodeComplete();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    static /* synthetic */ long i(a aVar) {
        long j2 = aVar.f1659m;
        aVar.f1659m = 1 + j2;
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(byte[] bArr, int i2, int i3) {
        int i4 = this.f1654h;
        int i5 = this.f1653g;
        bArr[i2 + 0] = -1;
        bArr[i2 + 1] = -15;
        bArr[i2 + 2] = (byte) (64 + (i4 << 2) + (i5 >> 2));
        bArr[i2 + 3] = (byte) (((i5 & 3) << 6) + (i3 >> 11));
        bArr[i2 + 4] = (byte) ((i3 & 2047) >> 3);
        bArr[i2 + 5] = (byte) (((i3 & 7) << 5) + 31);
        bArr[i2 + 6] = -4;
    }

    private void q(int i2) {
        int[] iArr = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
        this.f1654h = 3;
        for (int i3 = 0; i3 < 13; i3++) {
            if (i2 == iArr[i3]) {
                this.f1654h = i3;
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long s(int i2) {
        return (((((long) i2) * 1000000) / ((long) this.f1653g)) / ((long) this.f)) / 2;
    }

    public void r(float[] fArr, int i2) {
        if (this.f1656j) {
            this.f1658l++;
            com.voxelbusters.androidlib.b.a aVar = new com.voxelbusters.androidlib.b.a(i2, fArr);
            synchronized (this.f1655i) {
                this.f1655i.add(aVar);
            }
        }
    }

    public void t(int i2) {
        Log.d("AacEncode", "setChannels :" + i2);
        this.f1653g = i2;
    }

    public void u(String str) {
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        try {
            this.e = new FileOutputStream(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void v(int i2) {
        this.f = i2;
        Log.d("AacEncode", "setSampleRate :" + i2);
        q(i2);
    }

    public void w(com.voxelbusters.androidlib.c.b bVar) {
        Log.d("AacEncode", "start   SampleRate = " + this.f + "   Channels = " + this.f1653g);
        this.f1659m = 0L;
        this.f1658l = 0L;
        this.f1657k = bVar;
        try {
            this.a = MediaCodec.createEncoderByType("audio/mp4a-latm");
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.f1655i.clear();
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", this.f, this.f1653g);
        mediaFormatCreateAudioFormat.setString("mime", "audio/mp4a-latm");
        mediaFormatCreateAudioFormat.setInteger("aac-profile", 2);
        mediaFormatCreateAudioFormat.setInteger("bitrate", this.f * this.f1653g * 2);
        this.a.configure(mediaFormatCreateAudioFormat, (Surface) null, (MediaCrypto) null, 1);
        this.a.start();
        this.b = this.a.getInputBuffers();
        this.c = this.a.getOutputBuffers();
        this.d = new MediaCodec.BufferInfo();
        this.f1656j = true;
        new Thread(new RunnableC0173a()).start();
    }

    public void x() {
        try {
            Log.d("AacEncode", "audio record stop");
            this.f1656j = false;
            long j2 = this.f1658l - this.f1659m;
            this.f1660n = j2;
            if (j2 <= 0) {
                this.f1660n = 1L;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
