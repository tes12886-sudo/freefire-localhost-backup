package com.voxelbusters.androidlib.e;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import com.voxelbusters.androidlib.c.j;
import com.voxelbusters.androidlib.d.d;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class b implements SurfaceTexture.OnFrameAvailableListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnInfoListener {
    private Context a;
    private SurfaceTexture b;
    private com.voxelbusters.androidlib.e.a c;
    private MediaPlayer d;
    private boolean e;
    private EnumC0172b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private EnumC0172b f1635g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Uri f1636h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f1637i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f1638j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f1639k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private j f1640l;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC0172b.values().length];
            a = iArr;
            try {
                iArr[EnumC0172b.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC0172b.PLAYBACKCOMPLETED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[EnumC0172b.PREPARED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.voxelbusters.androidlib.e.b$b, reason: collision with other inner class name */
    public enum EnumC0172b {
        IDLE,
        INITIALIZED,
        PREPARED,
        PREPARING,
        STARTED,
        STOPPED,
        PAUSED,
        PLAYBACKCOMPLETED,
        ERROR,
        END
    }

    public b(Context context, j jVar) {
        this.a = context;
        this.f1640l = jVar;
        g();
    }

    private void g() {
        Log.d("VideoPlayer", "init");
        this.f = EnumC0172b.IDLE;
        this.d = null;
        this.f1638j = false;
        this.f1639k = false;
        this.e = false;
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.d = mediaPlayer;
        mediaPlayer.setOnInfoListener(this);
        this.d.setOnErrorListener(this);
        this.d.setOnPreparedListener(this);
        this.d.setOnCompletionListener(this);
        this.d.setOnSeekCompleteListener(this);
        this.d.setAudioStreamType(3);
    }

    public void a() {
        Log.d("VideoPlayer", "Close");
        this.e = false;
        this.f1639k = false;
        this.f1640l = null;
        SurfaceTexture surfaceTexture = this.b;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(null);
            this.b.release();
            this.b = null;
        }
        MediaPlayer mediaPlayer = this.d;
        if (mediaPlayer != null) {
            mediaPlayer.setOnPreparedListener(null);
            this.d.setOnErrorListener(null);
            this.d.setOnSeekCompleteListener(null);
            this.d.setOnCompletionListener(null);
            this.d.setOnInfoListener(null);
            this.d.release();
            this.d = null;
        }
        this.f = EnumC0172b.END;
    }

    public void b(Uri uri, int i2, int i3, int i4) throws IOException {
        Log.d("VideoPlayer", "Play");
        if (Build.VERSION.SDK_INT < 22) {
            throw new RuntimeException("VERSION is Low");
        }
        if (this.d == null) {
            throw new RuntimeException("Media Player is not initialized");
        }
        if (this.f != EnumC0172b.IDLE) {
            throw new IllegalStateException("FullscreenVideoView Invalid State: " + this.f);
        }
        Log.d("VideoPlayer", "setVideoURI ->" + d.b(this.a, uri).toString() + "  unityTextureId : " + i2 + "  width : " + i3 + " height ：" + i4);
        int iD = com.voxelbusters.androidlib.d.a.d();
        SurfaceTexture surfaceTexture = new SurfaceTexture(iD);
        this.b = surfaceTexture;
        surfaceTexture.setDefaultBufferSize(i3, i4);
        this.b.setOnFrameAvailableListener(this);
        this.c = new com.voxelbusters.androidlib.e.a(i3, i4, i2, iD);
        this.d.setSurface(new Surface(this.b));
        this.f1636h = uri;
        this.d.setDataSource(this.a, uri);
        this.f = EnumC0172b.INITIALIZED;
        k();
    }

    public void c(String str, int i2, int i3, int i4) throws IOException {
        Log.d("VideoPlayer", "Play");
        if (Build.VERSION.SDK_INT < 22) {
            throw new RuntimeException("VERSION is Low");
        }
        if (this.d == null) {
            throw new RuntimeException("Media Player is not initialized");
        }
        if (this.f != EnumC0172b.IDLE) {
            throw new IllegalStateException("FullscreenVideoView Invalid State: " + this.f);
        }
        Log.d("VideoPlayer", "setVideoPath ->" + str + "  unityTextureId : " + i2 + "  width : " + i3 + " height ：" + i4);
        int iD = com.voxelbusters.androidlib.d.a.d();
        SurfaceTexture surfaceTexture = new SurfaceTexture(iD);
        this.b = surfaceTexture;
        surfaceTexture.setDefaultBufferSize(i3, i4);
        this.b.setOnFrameAvailableListener(this);
        this.c = new com.voxelbusters.androidlib.e.a(i3, i4, i2, iD);
        this.d.setSurface(new Surface(this.b));
        this.f1637i = str;
        this.d.setDataSource(str);
        this.f = EnumC0172b.INITIALIZED;
        k();
    }

    public int d() {
        MediaPlayer mediaPlayer = this.d;
        if (mediaPlayer != null) {
            return mediaPlayer.getCurrentPosition();
        }
        throw new RuntimeException("Media Player is not initialized");
    }

    public int e() {
        MediaPlayer mediaPlayer = this.d;
        if (mediaPlayer != null) {
            return mediaPlayer.getDuration();
        }
        throw new RuntimeException("Media Player is not initialized");
    }

    public EnumC0172b f() {
        return this.f;
    }

    public boolean h() {
        MediaPlayer mediaPlayer = this.d;
        if (mediaPlayer != null) {
            return mediaPlayer.isPlaying();
        }
        throw new RuntimeException("Media Player is not initialized");
    }

    public boolean i() {
        return this.e && this.f1639k;
    }

    public void j() {
        Log.d("VideoPlayer", "pause");
        MediaPlayer mediaPlayer = this.d;
        if (mediaPlayer == null) {
            throw new RuntimeException("Media Player is not initialized");
        }
        this.f = EnumC0172b.PAUSED;
        mediaPlayer.pause();
    }

    protected void k() {
        Log.d("VideoPlayer", "prepare");
        this.f = EnumC0172b.PREPARING;
        this.d.prepareAsync();
    }

    public void l(int i2) {
        Log.d("VideoPlayer", "seekTo = " + i2);
        MediaPlayer mediaPlayer = this.d;
        if (mediaPlayer == null) {
            throw new RuntimeException("Media Player is not initialized");
        }
        if (mediaPlayer.getDuration() <= -1 || i2 > this.d.getDuration()) {
            return;
        }
        this.f1635g = this.f;
        j();
        this.d.seekTo(i2);
    }

    public void m(boolean z) {
        this.f1638j = z;
    }

    public void n() {
        Log.d("VideoPlayer", "start");
        MediaPlayer mediaPlayer = this.d;
        if (mediaPlayer == null) {
            throw new RuntimeException("Media Player is not initialized");
        }
        this.f = EnumC0172b.STARTED;
        mediaPlayer.setOnCompletionListener(this);
        this.d.start();
    }

    public void o() {
        Log.d("VideoPlayer", "stop");
        MediaPlayer mediaPlayer = this.d;
        if (mediaPlayer == null) {
            throw new RuntimeException("Media Player is not initialized");
        }
        this.f = EnumC0172b.STOPPED;
        mediaPlayer.stop();
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        if (this.d != null && this.f != EnumC0172b.ERROR) {
            Log.d("VideoPlayer", "onCompletion");
            if (this.d.isLooping()) {
                n();
            } else {
                this.f = EnumC0172b.PLAYBACKCOMPLETED;
            }
        }
        j jVar = this.f1640l;
        if (jVar != null) {
            String strB = this.f1637i;
            if (strB == null) {
                strB = d.b(this.a, this.f1636h);
            }
            jVar.OnVideoCompletion(strB);
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
        Log.d("VideoPlayer", "onError called - " + i2 + " - " + i3);
        this.f = EnumC0172b.ERROR;
        return false;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.e = true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public boolean onInfo(MediaPlayer mediaPlayer, int i2, int i3) {
        Log.d("VideoPlayer", "onInfo " + i2);
        return false;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        Log.d("VideoPlayer", "onPrepared called");
        this.f1639k = true;
        p();
        j jVar = this.f1640l;
        if (jVar != null) {
            String strB = this.f1637i;
            if (strB == null) {
                strB = d.b(this.a, this.f1636h);
            }
            jVar.OnVideoPrepared(strB);
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public void onSeekComplete(MediaPlayer mediaPlayer) {
        EnumC0172b enumC0172b;
        Log.d("VideoPlayer", "onSeekComplete");
        EnumC0172b enumC0172b2 = this.f1635g;
        if (enumC0172b2 != null) {
            int i2 = a.a[enumC0172b2.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    enumC0172b = EnumC0172b.PLAYBACKCOMPLETED;
                } else if (i2 == 3) {
                    enumC0172b = EnumC0172b.PREPARED;
                }
                this.f = enumC0172b;
            } else {
                n();
            }
        }
        j jVar = this.f1640l;
        if (jVar != null) {
            String strB = this.f1637i;
            if (strB == null) {
                strB = d.b(this.a, this.f1636h);
            }
            jVar.OnVideoSeekComplete(strB);
        }
    }

    protected void p() {
        Log.d("VideoPlayer", "tryToPrepare");
        if (this.f1639k) {
            this.f = EnumC0172b.PREPARED;
            if (this.f1638j) {
                n();
            }
            j jVar = this.f1640l;
            if (jVar != null) {
                String strB = this.f1637i;
                if (strB == null) {
                    strB = d.b(this.a, this.f1636h);
                }
                jVar.OnVideoStared(strB);
            }
        }
    }

    public void q() {
        this.e = false;
        this.b.updateTexImage();
        this.c.a();
    }
}
