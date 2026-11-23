package com.voxelbusters.androidlib;

import android.util.Log;
import com.unity3d.player.UnityPlayer;
import com.voxelbusters.androidlib.c.f;

/* JADX INFO: loaded from: classes.dex */
public class a implements f {
    private void a(String str, String str2) {
        b(str, str2, true);
    }

    private void b(String str, String str2, boolean z) {
        if (z) {
            Log.d("UnityReplayKitListener", "[Method : " + str + "] [Message : " + str2 + "]");
        }
        UnityPlayer.UnitySendMessage("ReplayKitInternal", str, str2);
    }

    @Override // com.voxelbusters.androidlib.c.j
    public void OnVideoCompletion(String str) {
        a("OnVideoCompletion", str);
    }

    @Override // com.voxelbusters.androidlib.c.j
    public void OnVideoPrepared(String str) {
        a("OnVideoPrepared", str);
    }

    @Override // com.voxelbusters.androidlib.c.j
    public void OnVideoSeekComplete(String str) {
        a("OnVideoSeekComplete", str);
    }

    @Override // com.voxelbusters.androidlib.c.j
    public void OnVideoStared(String str) {
        a("OnVideoStared", str);
    }

    @Override // com.voxelbusters.androidlib.c.a
    public void onAudioEncodeProgress(int i2) {
        b("OnReplayKitAudioEncodeProgress", Integer.toString(i2), false);
    }

    @Override // com.voxelbusters.androidlib.c.e
    public void onDiscardVideo(String str) {
        a("OnReplayKitDiscardVideoFinished", str);
    }

    @Override // com.voxelbusters.androidlib.c.e
    public void onInitialiseFailed(String str) {
        if (str == null) {
            str = "";
        }
        a("OnReplayKitInitialiseFailed", str);
    }

    @Override // com.voxelbusters.androidlib.c.e
    public void onInitialiseSuccess() {
        a("OnReplayKitInitialiseSuccess", "");
    }

    @Override // com.voxelbusters.androidlib.c.g
    public void onMuxerEnd() {
        a("OnReplayKitMuxerEnd", "");
    }

    @Override // com.voxelbusters.androidlib.c.g
    public void onMuxerProgress(int i2) {
        b("OnReplayKitMuxerProgress", Integer.toString(i2), false);
    }

    @Override // com.voxelbusters.androidlib.c.g
    public void onMuxerStart() {
        a("OnReplayKitMuxerStart", "");
    }

    @Override // com.voxelbusters.androidlib.c.e
    public void onPrepareRecordingSuccess() {
        a("OnPrepareRecordingSuccess", "");
    }

    @Override // com.voxelbusters.androidlib.c.e
    public void onPreviewSaveFailed(String str) {
        a("OnReplayKitPreviewSaveFailed", str);
    }

    @Override // com.voxelbusters.androidlib.c.e
    public void onPreviewSaveSuccess(String str) {
        a("OnReplayKitPreviewSaveSuccess", str);
    }

    @Override // com.voxelbusters.androidlib.c.e
    public void onPreviewVideo(String str) {
        a("OnReplayKitPreviewVideo", str);
    }

    @Override // com.voxelbusters.androidlib.c.e
    public void onRecordingAvailable(String str) {
        a("OnReplayKitRecordingAvailable", str);
    }

    @Override // com.voxelbusters.androidlib.c.e
    public void onRecordingFailed(String str) {
        if (str == null) {
            str = "Unknown Error";
        }
        a("OnReplayKitRecordingFailed", str);
    }

    @Override // com.voxelbusters.androidlib.c.e
    public void onRecordingStarted() {
        a("OnReplayKitRecordingStarted", "");
    }

    @Override // com.voxelbusters.androidlib.c.e
    public void onRecordingStopped() {
        a("OnReplayKitRecordingStopped", "");
    }

    @Override // com.voxelbusters.androidlib.c.e
    public void onThumbnail(String str, String str2) {
        a("OnReplayKitGetThumbnail", str + "|" + str2);
    }

    @Override // com.voxelbusters.androidlib.c.e
    public void onVideoInfo(String str, long j2, long j3) {
        a("OnReplayKitGetVideoInfo", str + "|" + j2 + "|" + j3);
    }
}
