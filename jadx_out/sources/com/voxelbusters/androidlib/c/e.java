package com.voxelbusters.androidlib.c;

/* JADX INFO: loaded from: classes.dex */
public interface e {
    void onDiscardVideo(String str);

    void onInitialiseFailed(String str);

    void onInitialiseSuccess();

    void onPrepareRecordingSuccess();

    void onPreviewSaveFailed(String str);

    void onPreviewSaveSuccess(String str);

    void onPreviewVideo(String str);

    void onRecordingAvailable(String str);

    void onRecordingFailed(String str);

    void onRecordingStarted();

    void onRecordingStopped();

    void onThumbnail(String str, String str2);

    void onVideoInfo(String str, long j2, long j3);
}
