package com.voxelbusters.androidlib;

import android.R;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.util.Size;
import androidx.core.content.FileProvider;
import com.unity3d.player.UnityPlayer;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ReplayKitHandler implements com.voxelbusters.androidlib.c.e, com.voxelbusters.androidlib.c.g, com.voxelbusters.androidlib.c.j, com.voxelbusters.androidlib.c.b, com.voxelbusters.androidlib.c.k {
    private static ReplayKitHandler INSTANCE = null;
    private static String TAG = "ReplayKitHandler";
    private com.voxelbusters.androidlib.internal.a audioEncode;
    private Activity mActivity;
    private String mAudioPath;
    private Context mContext;
    private com.voxelbusters.androidlib.c.f mListener;
    private boolean mMicrophoneEnabled;
    private boolean mPrioritiseAppAudioWhenUsingMicrophone;
    private String mRecordingPath;
    private String mRecordingServiceMessage;
    private int mVideoBitRate;
    private float mVideoFrameRate;
    private com.voxelbusters.androidlib.e.b mVideoPlayer;
    private com.voxelbusters.androidlib.internal.c screenRecorderController;
    private com.voxelbusters.androidlib.internal.d screenRecorderPermissionFragment;
    private Intent screenRecordingPermissionIntentData;
    private boolean startRecordingRequestProcessing;
    private ArrayList<com.voxelbusters.androidlib.c.d> prepareListeners = new ArrayList<>();
    private boolean isRecordingAvailable = false;
    private boolean isAudioEncodeComplete = false;

    class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        /* JADX INFO: renamed from: com.voxelbusters.androidlib.ReplayKitHandler$a$a, reason: collision with other inner class name */
        class C0171a implements com.voxelbusters.androidlib.c.c {
            final /* synthetic */ Context a;
            final /* synthetic */ String b;

            C0171a(Context context, String str) {
                this.a = context;
                this.b = str;
            }

            @Override // com.voxelbusters.androidlib.c.c
            public void a() {
                ReplayKitHandler.this.showMessage("Need external storage permission for saving video to gallery : STORAGE_PERMISSION_UNAVAILABLE");
                ReplayKitHandler.this.onPreviewSaveFailed("STORAGE_PERMISSION_UNAVAILABLE");
            }

            @Override // com.voxelbusters.androidlib.c.c
            public void b() {
                String strK = com.voxelbusters.androidlib.d.b.k(this.a, true);
                new File(strK).mkdirs();
                File file = new File(this.b);
                File file2 = new File(strK + "/" + a.this.b + ".mp4");
                com.voxelbusters.androidlib.d.b.b(file, file2);
                com.voxelbusters.androidlib.d.b.r(this.a, file2.getAbsolutePath());
                ReplayKitHandler.this.onPreviewSaveSuccess(file2.getAbsolutePath());
                file.delete();
            }
        }

        a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zA;
            if (ReplayKitHandler.this.mMicrophoneEnabled) {
                try {
                    zA = com.voxelbusters.androidlib.d.c.a(ReplayKitHandler.this.mRecordingPath, ReplayKitHandler.this.mAudioPath, this.a, ReplayKitHandler.this.mVideoBitRate, ReplayKitHandler.this.mVideoFrameRate, ReplayKitHandler.this);
                } catch (Exception e) {
                    e.printStackTrace();
                    zA = false;
                }
            } else {
                zA = false;
            }
            String str = zA ? this.a : ReplayKitHandler.this.mRecordingPath;
            if (com.voxelbusters.androidlib.d.b.m(str)) {
                ReplayKitHandler.this.onPreviewSaveFailed("PREVIEW_UNAVAILABLE");
                return;
            }
            Context context = ReplayKitHandler.this.mContext;
            if (Build.VERSION.SDK_INT < 29) {
                com.voxelbusters.androidlib.d.b.p(context, "android.permission.WRITE_EXTERNAL_STORAGE", "Need external storage access for saving video to gallery", new C0171a(context, str));
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("title", this.b);
            contentValues.put("_display_name", this.b);
            contentValues.put("mime_type", "video/mp4");
            contentValues.put("is_pending", (Integer) 1);
            contentValues.put("relative_path", "Movies/" + com.voxelbusters.androidlib.d.b.e(ReplayKitHandler.this.mContext));
            ContentResolver contentResolver = ReplayKitHandler.this.mContext.getContentResolver();
            Uri uriInsert = contentResolver.insert(MediaStore.Video.Media.getContentUri("external_primary"), contentValues);
            try {
                File file = new File(str);
                FileInputStream fileInputStream = new FileInputStream(file);
                OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                byte[] bArr = new byte[2048];
                while (true) {
                    int i2 = fileInputStream.read(bArr);
                    if (i2 <= 0) {
                        outputStreamOpenOutputStream.close();
                        fileInputStream.close();
                        Log.d(ReplayKitHandler.TAG, "savePreviewRecordingToGallery  Uri->" + uriInsert.toString());
                        contentValues.clear();
                        contentValues.put("is_pending", (Integer) 0);
                        ReplayKitHandler.this.mContext.getContentResolver().update(uriInsert, contentValues, null, null);
                        ReplayKitHandler replayKitHandler = ReplayKitHandler.this;
                        replayKitHandler.onPreviewSaveSuccess(com.voxelbusters.androidlib.d.d.b(replayKitHandler.mContext, uriInsert));
                        file.delete();
                        return;
                    }
                    outputStreamOpenOutputStream.write(bArr, 0, i2);
                }
            } catch (Exception e2) {
                contentValues.clear();
                contentValues.put("is_pending", (Integer) 0);
                ReplayKitHandler.this.mContext.getContentResolver().update(uriInsert, contentValues, null, null);
                ReplayKitHandler.this.onPreviewSaveFailed("UNKNOWN");
                e2.printStackTrace();
            }
        }
    }

    class b implements com.voxelbusters.androidlib.c.h {
        b() {
        }

        @Override // com.voxelbusters.androidlib.c.h
        public void a(Intent intent) {
            ReplayKitHandler.this.screenRecordingPermissionIntentData = intent;
        }

        @Override // com.voxelbusters.androidlib.c.h
        public void b(String str) {
            ReplayKitHandler.this.onRecordingFailed(str);
        }
    }

    class c implements com.voxelbusters.androidlib.c.d {
        c() {
        }

        @Override // com.voxelbusters.androidlib.c.d
        public void a(String str) {
            Log.e(ReplayKitHandler.TAG, "Prepare recording failed with error : " + str);
            ReplayKitHandler.this.onRecordingFailed(str);
        }

        @Override // com.voxelbusters.androidlib.c.d
        public void b() {
            Log.d(ReplayKitHandler.TAG, "Prepare recording successful");
            ReplayKitHandler.this.onPrepareRecordingSuccess();
        }
    }

    class d implements com.voxelbusters.androidlib.c.h {
        d() {
        }

        @Override // com.voxelbusters.androidlib.c.h
        public void a(Intent intent) {
            ReplayKitHandler.this.screenRecordingPermissionIntentData = intent;
            ReplayKitHandler.this.notifyPrepareRecordingListeners(null);
        }

        @Override // com.voxelbusters.androidlib.c.h
        public void b(String str) {
            ReplayKitHandler.this.notifyPrepareRecordingListeners(str);
        }
    }

    class e implements com.voxelbusters.androidlib.c.d {
        final /* synthetic */ boolean a;
        final /* synthetic */ int b;
        final /* synthetic */ float c;
        final /* synthetic */ String d;

        e(boolean z, int i2, float f, String str) {
            this.a = z;
            this.b = i2;
            this.c = f;
            this.d = str;
        }

        @Override // com.voxelbusters.androidlib.c.d
        public void a(String str) {
            Log.e(ReplayKitHandler.TAG, "Failed while preparing for recording : " + str);
            ReplayKitHandler.this.startRecordingRequestProcessing = false;
            ReplayKitHandler.this.onRecordingFailed(str);
        }

        @Override // com.voxelbusters.androidlib.c.d
        public void b() {
            Log.d(ReplayKitHandler.TAG, "[Start Recording] onPrepareSuccess");
            ReplayKitHandler.this.startRecordingRequestProcessing = false;
            ReplayKitHandler.this.startRecordingInternal(this.a, this.b, this.c, this.d);
        }
    }

    class f implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ Intent b;

        f(ReplayKitHandler replayKitHandler, Context context, Intent intent) {
            this.a = context;
            this.b = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.startActivity(this.b);
        }
    }

    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ReplayKitHandler.this.discardRecording();
        }
    }

    class h implements com.voxelbusters.androidlib.c.c {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;

        h(Context context, String str) {
            this.a = context;
            this.b = str;
        }

        @Override // com.voxelbusters.androidlib.c.c
        public void a() {
            ReplayKitHandler.this.onDiscardVideo("");
        }

        @Override // com.voxelbusters.androidlib.c.c
        public void b() {
            com.voxelbusters.androidlib.d.b.c(this.a, new File(this.b));
            ReplayKitHandler.this.onDiscardVideo(this.b);
        }
    }

    class i implements com.voxelbusters.androidlib.c.c {
        final /* synthetic */ String a;

        i(String str) {
            this.a = str;
        }

        @Override // com.voxelbusters.androidlib.c.c
        public void a() {
            Log.d(ReplayKitHandler.TAG, "previewvideo  onPermissionDeny=android.permission.READ_EXTERNAL_STORAGE");
            ReplayKitHandler.this.onPreviewVideo("");
        }

        @Override // com.voxelbusters.androidlib.c.c
        public void b() {
            Log.d(ReplayKitHandler.TAG, "previewvideo  onPermissionGrant=android.permission.READ_EXTERNAL_STORAGE");
            ReplayKitHandler.this.onPreviewVideo(this.a);
        }
    }

    class j implements com.voxelbusters.androidlib.c.c {
        final /* synthetic */ String a;
        final /* synthetic */ int b;
        final /* synthetic */ String c;

        j(String str, int i2, String str2) {
            this.a = str;
            this.b = i2;
            this.c = str2;
        }

        @Override // com.voxelbusters.androidlib.c.c
        public void a() {
            ReplayKitHandler.this.onThumbnail(this.a, "");
        }

        @Override // com.voxelbusters.androidlib.c.c
        public void b() {
            Bitmap bitmapCreateVideoThumbnail = ThumbnailUtils.createVideoThumbnail(this.a, this.b);
            if (bitmapCreateVideoThumbnail != null) {
                File file = new File(this.c);
                if (file.exists()) {
                    file.delete();
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    bitmapCreateVideoThumbnail.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    ReplayKitHandler.this.onThumbnail(this.a, this.c);
                } catch (Exception e) {
                    e.printStackTrace();
                    ReplayKitHandler.this.onThumbnail(this.a, "");
                }
            }
        }
    }

    class k implements com.voxelbusters.androidlib.c.c {
        final /* synthetic */ String a;

        k(String str) {
            this.a = str;
        }

        @Override // com.voxelbusters.androidlib.c.c
        public void a() {
            ReplayKitHandler.this.onVideoInfo(this.a, 0L, 0L);
        }

        @Override // com.voxelbusters.androidlib.c.c
        public void b() {
            try {
                MediaExtractor mediaExtractor = new MediaExtractor();
                mediaExtractor.setDataSource(this.a);
                long j2 = 0;
                for (int i2 = 0; i2 < mediaExtractor.getTrackCount(); i2++) {
                    MediaFormat trackFormat = mediaExtractor.getTrackFormat(i2);
                    if (trackFormat.containsKey("durationUs")) {
                        long j3 = trackFormat.getLong("durationUs");
                        if (j3 > j2) {
                            j2 = j3;
                        }
                    }
                }
                long j4 = j2 / 1000000;
                if (j4 <= 0) {
                    j4 = 1;
                }
                long j5 = j4;
                long length = new File(this.a).length();
                Log.d(ReplayKitHandler.TAG, "getVideoInfo duration=" + j5 + ",size =" + length);
                ReplayKitHandler.this.onVideoInfo(this.a, length, j5);
            } catch (Exception e) {
                e.printStackTrace();
                ReplayKitHandler.this.onVideoInfo(this.a, 0L, 0L);
            }
        }
    }

    private ReplayKitHandler() {
        Activity activity = UnityPlayer.currentActivity;
        this.mContext = activity;
        this.mActivity = activity;
        setListener(new com.voxelbusters.androidlib.a());
        this.screenRecorderController = new com.voxelbusters.androidlib.internal.c(this.mContext, this, this);
    }

    private void SendRecordingAvailableCallback() {
        com.voxelbusters.androidlib.c.f fVar;
        if (this.isRecordingAvailable) {
            if ((!this.mMicrophoneEnabled || this.isAudioEncodeComplete) && (fVar = this.mListener) != null) {
                fVar.onRecordingAvailable(this.mRecordingPath);
            }
        }
    }

    private void discardRecordingAsync() {
        new Thread(new g()).start();
    }

    public static ReplayKitHandler getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ReplayKitHandler();
        }
        return INSTANCE;
    }

    private String getPermissionDeniedForRecordingMessage(boolean z) {
        return (!z || com.voxelbusters.androidlib.d.b.l(this.mContext, "android.permission.RECORD_AUDIO")) ? "UNKNOWN" : "MICROPHONE_PERMISSION_UNAVAILABLE";
    }

    private ArrayList<String> getRequiredPermissions(boolean z) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (z) {
            arrayList.add("android.permission.RECORD_AUDIO");
        }
        return arrayList;
    }

    public static boolean isExistVideo(String str) {
        if (com.voxelbusters.androidlib.d.b.m(str)) {
            return false;
        }
        try {
            return new File(str).exists();
        } catch (Exception unused) {
        }
    }

    public static boolean isRecordingApiAvailable() {
        return Build.VERSION.SDK_INT >= 21;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyPrepareRecordingListeners(String str) {
        Log.d(TAG, "Notifying prepare recording listeners..." + str);
        if (this.prepareListeners.size() > 0) {
            for (com.voxelbusters.androidlib.c.d dVar : this.prepareListeners) {
                if (str == null || str == "") {
                    dVar.b();
                } else {
                    dVar.a(str);
                }
            }
        }
        this.prepareListeners.clear();
    }

    private void onPermissionGrantForRecording(boolean z, int i2, float f2) {
        requestScreenRecordingPermissionFragment(new b());
    }

    private void prepareRecordingInternal(com.voxelbusters.androidlib.c.d dVar) {
        this.prepareListeners.add(dVar);
        if (this.prepareListeners.size() == 1) {
            requestScreenRecordingPermissionFragment(new d());
        }
    }

    private void requestScreenRecordingPermissionFragment(com.voxelbusters.androidlib.c.h hVar) {
        Intent intent = this.screenRecordingPermissionIntentData;
        if (intent != null) {
            if (hVar != null) {
                hVar.a((Intent) intent.clone());
            }
        } else {
            this.screenRecorderPermissionFragment = new com.voxelbusters.androidlib.internal.d();
            FragmentTransaction fragmentTransactionBeginTransaction = ((Activity) this.mContext).getFragmentManager().beginTransaction();
            fragmentTransactionBeginTransaction.add(R.id.content, this.screenRecorderPermissionFragment);
            this.screenRecorderPermissionFragment.d(hVar);
            fragmentTransactionBeginTransaction.commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startRecordingInternal(boolean z, int i2, float f2, String str) {
        Log.d(TAG, "Start Recording");
        if (!isRecordingApiAvailable()) {
            onRecordingFailed("API_UNAVAILABLE");
        } else {
            this.mRecordingServiceMessage = str;
            this.screenRecorderController.q(this.mRecordingPath, z, i2, f2, this.screenRecordingPermissionIntentData, this.mPrioritiseAppAudioWhenUsingMicrophone, str);
        }
    }

    @Override // com.voxelbusters.androidlib.c.j
    public void OnVideoCompletion(String str) {
        com.voxelbusters.androidlib.c.f fVar = this.mListener;
        if (fVar != null) {
            fVar.OnVideoCompletion(str);
        }
    }

    @Override // com.voxelbusters.androidlib.c.j
    public void OnVideoPrepared(String str) {
        com.voxelbusters.androidlib.c.f fVar = this.mListener;
        if (fVar != null) {
            fVar.OnVideoPrepared(str);
        }
    }

    @Override // com.voxelbusters.androidlib.c.j
    public void OnVideoSeekComplete(String str) {
        com.voxelbusters.androidlib.c.f fVar = this.mListener;
        if (fVar != null) {
            fVar.OnVideoSeekComplete(str);
        }
    }

    @Override // com.voxelbusters.androidlib.c.j
    public void OnVideoStared(String str) {
        com.voxelbusters.androidlib.c.f fVar = this.mListener;
        if (fVar != null) {
            fVar.OnVideoStared(str);
        }
    }

    public void closeVideo() {
        com.voxelbusters.androidlib.e.b bVar = this.mVideoPlayer;
        if (bVar == null) {
            return;
        }
        bVar.a();
        this.mVideoPlayer = null;
    }

    public boolean discardRecording() {
        if (!isRecordingApiAvailable()) {
            return false;
        }
        if (!com.voxelbusters.androidlib.d.b.m(this.mRecordingPath)) {
            File file = new File(this.mRecordingPath);
            if (this.mRecordingPath.contains(Environment.getExternalStorageDirectory().getAbsolutePath())) {
                com.voxelbusters.androidlib.d.b.c(this.mContext, file);
            } else if (file.exists()) {
                file.delete();
            }
            this.mRecordingPath = null;
        }
        if (com.voxelbusters.androidlib.d.b.m(this.mAudioPath)) {
            return true;
        }
        File file2 = new File(this.mAudioPath);
        if (!file2.exists()) {
            return true;
        }
        file2.delete();
        this.mAudioPath = null;
        return true;
    }

    public boolean discardRecording(String str) {
        if (!isRecordingApiAvailable()) {
            return false;
        }
        try {
            if (!com.voxelbusters.androidlib.d.b.m(str)) {
                File file = new File(str);
                if (file.exists()) {
                    file.delete();
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public void discardvideo(String str) {
        Log.d(TAG, "discardvideo,filePath=" + str);
        if (com.voxelbusters.androidlib.d.b.m(str)) {
            onDiscardVideo("");
            return;
        }
        if (Build.VERSION.SDK_INT < 29) {
            Context context = this.mContext;
            ArrayList arrayList = new ArrayList();
            arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
            arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
            com.voxelbusters.androidlib.d.b.q(this.mContext, arrayList, "Need external read and write permission to discard video", new h(context, str));
            return;
        }
        Uri uriA = com.voxelbusters.androidlib.d.d.a(str, this.mContext);
        Log.d(TAG, "discardvideo,input=" + str + ",uri=" + uriA.getPath());
        this.mContext.getContentResolver().delete(uriA, null, null);
        onDiscardVideo(str);
    }

    public String getRecordingPath() {
        return this.mRecordingPath;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:32:0x0099  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    public void getThumbnail(String str, int i2, String str2) throws Throwable {
        MediaMetadataRetriever mediaMetadataRetriever;
        File file;
        Log.d(TAG, "getThumbnail->input=" + str + ",output=" + str2);
        if (!isExistVideo(str)) {
            onThumbnail(str, "");
            return;
        }
        Size sizeA = com.voxelbusters.androidlib.d.b.a(this.mContext);
        if (Build.VERSION.SDK_INT < 29) {
            com.voxelbusters.androidlib.d.b.p(this.mContext, "android.permission.READ_EXTERNAL_STORAGE", "Need external read permission to get thumbnail", new j(str, i2, str2));
            return;
        }
        Uri uriA = com.voxelbusters.androidlib.d.d.a(str, this.mContext);
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        scaledFrameAtTime = null;
        Bitmap scaledFrameAtTime = null;
        try {
            try {
                mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    mediaMetadataRetriever.setDataSource(this.mContext, uriA);
                    scaledFrameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(1000L, 2, sizeA.getWidth(), sizeA.getHeight());
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    if (mediaMetadataRetriever != null) {
                    }
                    if (scaledFrameAtTime != null) {
                        file = new File(str2);
                        if (file.exists()) {
                            file.delete();
                        }
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            scaledFrameAtTime.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            onThumbnail(str, str2);
                        } catch (Exception e3) {
                            e3.printStackTrace();
                            onThumbnail(str, "");
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                th = th;
                mediaMetadataRetriever2 = mediaMetadataRetriever;
                if (mediaMetadataRetriever2 != null) {
                    mediaMetadataRetriever2.release();
                }
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            mediaMetadataRetriever = null;
        } catch (Throwable th2) {
            th = th2;
            if (mediaMetadataRetriever2 != null) {
                mediaMetadataRetriever2.release();
            }
            throw th;
        }
        mediaMetadataRetriever.release();
        if (scaledFrameAtTime != null) {
            file = new File(str2);
            if (file.exists()) {
                file.delete();
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            scaledFrameAtTime.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream2);
            fileOutputStream2.flush();
            fileOutputStream2.close();
            onThumbnail(str, str2);
        }
    }

    public int getVideoDuration() {
        com.voxelbusters.androidlib.e.b bVar = this.mVideoPlayer;
        if (bVar == null) {
            return 0;
        }
        return bVar.e();
    }

    public void getVideoInfo(String str) {
        Log.d(TAG, "getVideoInfo->" + str);
        if (!isExistVideo(str)) {
            onVideoInfo(str, 0L, 0L);
            return;
        }
        if (Build.VERSION.SDK_INT < 29) {
            com.voxelbusters.androidlib.d.b.p(this.mContext, "android.permission.READ_EXTERNAL_STORAGE", "Need external read permission to get video info", new k(str));
            return;
        }
        try {
            Uri uriA = com.voxelbusters.androidlib.d.d.a(str, this.mContext);
            MediaExtractor mediaExtractor = new MediaExtractor();
            mediaExtractor.setDataSource(this.mContext, uriA, (Map<String, String>) null);
            long j2 = 0;
            for (int i2 = 0; i2 < mediaExtractor.getTrackCount(); i2++) {
                long j3 = mediaExtractor.getTrackFormat(i2).getLong("durationUs");
                if (j3 > j2) {
                    j2 = j3;
                }
            }
            long j4 = j2 / 1000000;
            if (j4 <= 0) {
                j4 = 1;
            }
            long j5 = j4;
            long length = new File(str).length();
            Log.d(TAG, "getVideoInfo duration=" + j5 + ",size =" + length);
            onVideoInfo(str, length, j5);
        } catch (Exception e2) {
            e2.printStackTrace();
            onVideoInfo(str, 0L, 0L);
        }
    }

    public int getVideoPosition() {
        com.voxelbusters.androidlib.e.b bVar = this.mVideoPlayer;
        if (bVar == null) {
            return 0;
        }
        return bVar.d();
    }

    public int getVideoState() {
        com.voxelbusters.androidlib.e.b bVar = this.mVideoPlayer;
        return (bVar == null ? com.voxelbusters.androidlib.e.b.EnumC0172b.IDLE : bVar.f()).ordinal();
    }

    public void hideCameraPreview() {
    }

    public void initialise() {
        Log.d(TAG, "initialise");
        onInitialiseSuccess();
    }

    public boolean isPreviewAvailable() {
        return this.mRecordingPath != null;
    }

    public boolean isRecording() {
        com.voxelbusters.androidlib.internal.c cVar = this.screenRecorderController;
        if (cVar != null) {
            return cVar.p();
        }
        return false;
    }

    public boolean isVideoPlaying() {
        com.voxelbusters.androidlib.e.b bVar = this.mVideoPlayer;
        if (bVar == null) {
            return false;
        }
        try {
            try {
                return bVar.h();
            } catch (Exception e2) {
                e2.printStackTrace();
                return false;
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean isVideoUpdateFrame() {
        com.voxelbusters.androidlib.e.b bVar = this.mVideoPlayer;
        if (bVar == null) {
            return false;
        }
        return bVar.i();
    }

    @Override // com.voxelbusters.androidlib.c.b
    public void onAudioEncodeComplete() {
        Log.d(TAG, "On AudioEncode stopped.");
        this.isAudioEncodeComplete = true;
        SendRecordingAvailableCallback();
    }

    @Override // com.voxelbusters.androidlib.c.a
    public void onAudioEncodeProgress(int i2) {
        com.voxelbusters.androidlib.c.f fVar = this.mListener;
        if (fVar != null) {
            fVar.onAudioEncodeProgress(i2);
        }
    }

    @Override // com.voxelbusters.androidlib.c.e
    public void onDiscardVideo(String str) {
        com.voxelbusters.androidlib.c.f fVar = this.mListener;
        if (fVar != null) {
            fVar.onDiscardVideo(str);
        }
    }

    @Override // com.voxelbusters.androidlib.c.e
    public void onInitialiseFailed(String str) {
        com.voxelbusters.androidlib.c.f fVar = this.mListener;
        if (fVar != null) {
            fVar.onInitialiseFailed(str);
        }
    }

    @Override // com.voxelbusters.androidlib.c.e
    public void onInitialiseSuccess() {
        com.voxelbusters.androidlib.c.f fVar = this.mListener;
        if (fVar != null) {
            fVar.onInitialiseSuccess();
        }
    }

    @Override // com.voxelbusters.androidlib.c.g
    public void onMuxerEnd() {
        Log.d(TAG, "On Muxer End");
        com.voxelbusters.androidlib.c.f fVar = this.mListener;
        if (fVar != null) {
            fVar.onMuxerEnd();
        }
    }

    @Override // com.voxelbusters.androidlib.c.g
    public void onMuxerProgress(int i2) {
        com.voxelbusters.androidlib.c.f fVar = this.mListener;
        if (fVar != null) {
            fVar.onMuxerProgress(i2);
        }
    }

    @Override // com.voxelbusters.androidlib.c.g
    public void onMuxerStart() {
        Log.d(TAG, "On Muxer Start");
        com.voxelbusters.androidlib.c.f fVar = this.mListener;
        if (fVar != null) {
            fVar.onMuxerStart();
        }
    }

    @Override // com.voxelbusters.androidlib.c.e
    public void onPrepareRecordingSuccess() {
        Log.d(TAG, "On prepare recording success");
        com.voxelbusters.androidlib.c.f fVar = this.mListener;
        if (fVar != null) {
            fVar.onPrepareRecordingSuccess();
        }
    }

    @Override // com.voxelbusters.androidlib.c.e
    public void onPreviewSaveFailed(String str) {
        Log.d(TAG, "On preview save failed : " + str);
        com.voxelbusters.androidlib.c.f fVar = this.mListener;
        if (fVar != null) {
            fVar.onPreviewSaveFailed(str);
        }
    }

    @Override // com.voxelbusters.androidlib.c.e
    public void onPreviewSaveSuccess(String str) {
        Log.d(TAG, "On preview save success: " + str);
        com.voxelbusters.androidlib.c.f fVar = this.mListener;
        if (fVar != null) {
            fVar.onPreviewSaveSuccess(str);
        }
    }

    @Override // com.voxelbusters.androidlib.c.e
    public void onPreviewVideo(String str) {
        com.voxelbusters.androidlib.c.f fVar = this.mListener;
        if (fVar != null) {
            fVar.onPreviewVideo(str);
        }
    }

    @Override // com.voxelbusters.androidlib.c.e
    public void onRecordingAvailable(String str) {
        Log.d(TAG, "onRecordingAvailable : " + str);
        this.mRecordingPath = str;
        this.isRecordingAvailable = true;
        SendRecordingAvailableCallback();
    }

    @Override // com.voxelbusters.androidlib.c.e
    public void onRecordingFailed(String str) {
        Log.d(TAG, "onRecordingFailed : " + str);
        this.mRecordingPath = null;
        com.voxelbusters.androidlib.c.f fVar = this.mListener;
        if (fVar != null) {
            fVar.onRecordingFailed(str);
        }
    }

    @Override // com.voxelbusters.androidlib.c.e
    public void onRecordingStarted() {
        Log.d(TAG, "On recording started.");
        com.voxelbusters.androidlib.c.f fVar = this.mListener;
        if (fVar != null) {
            fVar.onRecordingStarted();
        }
        this.isRecordingAvailable = false;
        this.isAudioEncodeComplete = false;
    }

    @Override // com.voxelbusters.androidlib.c.e
    public void onRecordingStopped() {
        Log.d(TAG, "On recording stopped.");
        com.voxelbusters.androidlib.c.f fVar = this.mListener;
        if (fVar != null) {
            fVar.onRecordingStopped();
        }
    }

    @Override // com.voxelbusters.androidlib.c.e
    public void onThumbnail(String str, String str2) {
        com.voxelbusters.androidlib.c.f fVar = this.mListener;
        if (fVar != null) {
            fVar.onThumbnail(str, str2);
        }
    }

    @Override // com.voxelbusters.androidlib.c.e
    public void onVideoInfo(String str, long j2, long j3) {
        com.voxelbusters.androidlib.c.f fVar = this.mListener;
        if (fVar != null) {
            fVar.onVideoInfo(str, j2, j3);
        }
    }

    public boolean pauseVideo() {
        com.voxelbusters.androidlib.e.b bVar = this.mVideoPlayer;
        if (bVar == null) {
            return false;
        }
        try {
            bVar.j();
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public boolean playVideo(String str, int i2, int i3, int i4, boolean z) {
        com.voxelbusters.androidlib.e.b bVar = this.mVideoPlayer;
        if (bVar != null) {
            bVar.a();
        }
        com.voxelbusters.androidlib.e.b bVar2 = new com.voxelbusters.androidlib.e.b(this.mContext, this);
        this.mVideoPlayer = bVar2;
        try {
            bVar2.m(z);
            if (Build.VERSION.SDK_INT >= 29) {
                this.mVideoPlayer.b(com.voxelbusters.androidlib.d.d.a(str, this.mContext), i2, i3, i4);
                return true;
            }
            this.mVideoPlayer.c(str, i2, i3, i4);
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public void prepareRecording() {
        prepareRecordingInternal(new c());
    }

    public boolean previewRecording() {
        if (!isRecordingApiAvailable()) {
            return false;
        }
        if (this.mRecordingPath == null) {
            Log.e(TAG, "No recording found!");
            return false;
        }
        Context context = this.mContext;
        File file = new File(this.mRecordingPath);
        Context context2 = this.mContext;
        Uri uriE = FileProvider.e(context2, com.voxelbusters.androidlib.d.b.g(context2), file);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(uriE, "video/mp4");
        intent.setFlags(1);
        intent.putExtra("android.intent.extra.finishOnCompletion", false);
        ((Activity) context).runOnUiThread(new f(this, context, intent));
        return true;
    }

    public void previewvideo(String str) {
        Log.d(TAG, "previewvideo,filePath=" + str);
        if (com.voxelbusters.androidlib.d.b.m(str)) {
            onPreviewVideo("");
            return;
        }
        if (!isExistVideo(str)) {
            onPreviewVideo("");
        } else if (Build.VERSION.SDK_INT > 29) {
            onPreviewVideo(str);
        } else {
            com.voxelbusters.androidlib.d.b.p(this.mContext, "android.permission.READ_EXTERNAL_STORAGE", "Need external read and write permission to preview video", new i(str));
        }
    }

    public void savePreviewRecordingToGallery(String str, String str2) {
        Log.d(TAG, "savePreviewRecordingToGallery  video->" + this.mRecordingPath + "  audio->" + this.mAudioPath + "   output->" + str2);
        if (com.voxelbusters.androidlib.d.b.m(str)) {
            str = "" + System.currentTimeMillis();
        }
        new Thread(new a(str2, str)).start();
    }

    public boolean seekToVideo(int i2) {
        com.voxelbusters.androidlib.e.b bVar = this.mVideoPlayer;
        if (bVar == null) {
            return false;
        }
        try {
            bVar.l(i2);
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public void setAudio(String str, int i2, int i3) {
        Log.d(TAG, "setAudio : " + str + "  sampleRate = " + i2 + "   channels = " + i3);
        this.mAudioPath = str;
        com.voxelbusters.androidlib.internal.a aVar = new com.voxelbusters.androidlib.internal.a();
        this.audioEncode = aVar;
        aVar.u(str);
        this.audioEncode.t(i3);
        this.audioEncode.v(i2);
        this.audioEncode.w(this);
    }

    public void setIsAppAudioPriorityOverMicrophone(boolean z) {
        this.mPrioritiseAppAudioWhenUsingMicrophone = z;
    }

    public void setListener(com.voxelbusters.androidlib.c.f fVar) {
        this.mListener = fVar;
    }

    public void setMicrophoneStatus(boolean z) {
        this.mMicrophoneEnabled = z;
    }

    public void setRecordingUIVisibility(boolean z) {
        Log.e(TAG, "Not yet implemented on Android");
    }

    @Override // com.voxelbusters.androidlib.c.k
    public void setVideoBitRate(int i2) {
        this.mVideoBitRate = i2;
    }

    @Override // com.voxelbusters.androidlib.c.k
    public void setVideoFrameRate(float f2) {
        this.mVideoFrameRate = f2;
    }

    public void sharePreviewRecording(String str, String str2) {
        String str3 = this.mRecordingPath;
        if (str3 == null || str3.equals("")) {
            return;
        }
        com.voxelbusters.androidlib.d.b.s(this.mContext, this.mRecordingPath, str, str2);
    }

    public boolean showCameraPreviewAt(int i2, int i3) {
        return false;
    }

    public void showMessage(String str) {
        Log.w(TAG, str);
    }

    public void startRecording(String str, int i2, float f2) {
        startRecording(str, this.mMicrophoneEnabled, i2, f2, "Recording is in progress");
    }

    public void startRecording(String str, boolean z, int i2, float f2) {
        startRecording(str, z, i2, f2, "Recording is in progress");
    }

    public void startRecording(String str, boolean z, int i2, float f2, String str2) {
        boolean z2;
        Log.d(TAG, "startRecording_1");
        if (isRecording() || (z2 = this.startRecordingRequestProcessing)) {
            Log.d(TAG, "Already recording in progress!");
            return;
        }
        if (!z2) {
            this.startRecordingRequestProcessing = true;
        }
        this.mRecordingPath = str;
        Log.d(TAG, "startRecording_2");
        prepareRecordingInternal(new e(z, i2, f2, str2));
    }

    public boolean startVideo() {
        com.voxelbusters.androidlib.e.b bVar = this.mVideoPlayer;
        if (bVar == null) {
            return false;
        }
        try {
            bVar.n();
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public void stopRecording() {
        Log.d(TAG, "Stop Recording");
        if (!isRecordingApiAvailable()) {
            com.voxelbusters.androidlib.c.f fVar = this.mListener;
            if (fVar != null) {
                fVar.onRecordingFailed("API_UNAVAILABLE");
                return;
            }
            return;
        }
        com.voxelbusters.androidlib.internal.a aVar = this.audioEncode;
        if (aVar != null) {
            aVar.x();
            this.audioEncode = null;
        }
        com.voxelbusters.androidlib.internal.c cVar = this.screenRecorderController;
        if (cVar != null) {
            cVar.r();
        }
    }

    public boolean stopVideo() {
        com.voxelbusters.androidlib.e.b bVar = this.mVideoPlayer;
        if (bVar == null) {
            return false;
        }
        try {
            bVar.o();
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public void updateVideoTexture() {
        com.voxelbusters.androidlib.e.b bVar = this.mVideoPlayer;
        if (bVar == null) {
            return;
        }
        bVar.q();
    }

    public void writeAudioData(float[] fArr, int i2) {
        com.voxelbusters.androidlib.internal.a aVar;
        if (fArr == null || !this.mMicrophoneEnabled || (aVar = this.audioEncode) == null) {
            return;
        }
        try {
            aVar.r(fArr, i2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
