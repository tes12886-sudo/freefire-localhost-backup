.class public Lcom/voxelbusters/androidlib/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/voxelbusters/androidlib/c/f;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, Lcom/voxelbusters/androidlib/a;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    if-eqz p3, :cond_0

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "[Method : "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "] [Message : "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const-string v0, "UnityReplayKitListener"

    invoke-static {v0, p3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    const-string p3, "ReplayKitInternal"

    invoke-static {p3, p1, p2}, Lcom/unity3d/player/UnityPlayer;->UnitySendMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public OnVideoCompletion(Ljava/lang/String;)V
    .locals 1

    const-string v0, "OnVideoCompletion"

    invoke-direct {p0, v0, p1}, Lcom/voxelbusters/androidlib/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public OnVideoPrepared(Ljava/lang/String;)V
    .locals 1

    const-string v0, "OnVideoPrepared"

    invoke-direct {p0, v0, p1}, Lcom/voxelbusters/androidlib/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public OnVideoSeekComplete(Ljava/lang/String;)V
    .locals 1

    const-string v0, "OnVideoSeekComplete"

    invoke-direct {p0, v0, p1}, Lcom/voxelbusters/androidlib/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public OnVideoStared(Ljava/lang/String;)V
    .locals 1

    const-string v0, "OnVideoStared"

    invoke-direct {p0, v0, p1}, Lcom/voxelbusters/androidlib/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onAudioEncodeProgress(I)V
    .locals 2

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "OnReplayKitAudioEncodeProgress"

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1}, Lcom/voxelbusters/androidlib/a;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public onDiscardVideo(Ljava/lang/String;)V
    .locals 1

    const-string v0, "OnReplayKitDiscardVideoFinished"

    invoke-direct {p0, v0, p1}, Lcom/voxelbusters/androidlib/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onInitialiseFailed(Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, ""

    :goto_0
    const-string v0, "OnReplayKitInitialiseFailed"

    invoke-direct {p0, v0, p1}, Lcom/voxelbusters/androidlib/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onInitialiseSuccess()V
    .locals 2

    const-string v0, "OnReplayKitInitialiseSuccess"

    const-string v1, ""

    invoke-direct {p0, v0, v1}, Lcom/voxelbusters/androidlib/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onMuxerEnd()V
    .locals 2

    const-string v0, "OnReplayKitMuxerEnd"

    const-string v1, ""

    invoke-direct {p0, v0, v1}, Lcom/voxelbusters/androidlib/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onMuxerProgress(I)V
    .locals 2

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "OnReplayKitMuxerProgress"

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1}, Lcom/voxelbusters/androidlib/a;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public onMuxerStart()V
    .locals 2

    const-string v0, "OnReplayKitMuxerStart"

    const-string v1, ""

    invoke-direct {p0, v0, v1}, Lcom/voxelbusters/androidlib/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onPrepareRecordingSuccess()V
    .locals 2

    const-string v0, "OnPrepareRecordingSuccess"

    const-string v1, ""

    invoke-direct {p0, v0, v1}, Lcom/voxelbusters/androidlib/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onPreviewSaveFailed(Ljava/lang/String;)V
    .locals 1

    const-string v0, "OnReplayKitPreviewSaveFailed"

    invoke-direct {p0, v0, p1}, Lcom/voxelbusters/androidlib/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onPreviewSaveSuccess(Ljava/lang/String;)V
    .locals 1

    const-string v0, "OnReplayKitPreviewSaveSuccess"

    invoke-direct {p0, v0, p1}, Lcom/voxelbusters/androidlib/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onPreviewVideo(Ljava/lang/String;)V
    .locals 1

    const-string v0, "OnReplayKitPreviewVideo"

    invoke-direct {p0, v0, p1}, Lcom/voxelbusters/androidlib/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onRecordingAvailable(Ljava/lang/String;)V
    .locals 1

    const-string v0, "OnReplayKitRecordingAvailable"

    invoke-direct {p0, v0, p1}, Lcom/voxelbusters/androidlib/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onRecordingFailed(Ljava/lang/String;)V
    .locals 1

    if-nez p1, :cond_0

    const-string p1, "Unknown Error"

    :cond_0
    const-string v0, "OnReplayKitRecordingFailed"

    invoke-direct {p0, v0, p1}, Lcom/voxelbusters/androidlib/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onRecordingStarted()V
    .locals 2

    const-string v0, "OnReplayKitRecordingStarted"

    const-string v1, ""

    invoke-direct {p0, v0, v1}, Lcom/voxelbusters/androidlib/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onRecordingStopped()V
    .locals 2

    const-string v0, "OnReplayKitRecordingStopped"

    const-string v1, ""

    invoke-direct {p0, v0, v1}, Lcom/voxelbusters/androidlib/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onThumbnail(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "|"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "OnReplayKitGetThumbnail"

    invoke-direct {p0, p2, p1}, Lcom/voxelbusters/androidlib/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onVideoInfo(Ljava/lang/String;JJ)V
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "|"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "OnReplayKitGetVideoInfo"

    invoke-direct {p0, p2, p1}, Lcom/voxelbusters/androidlib/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
