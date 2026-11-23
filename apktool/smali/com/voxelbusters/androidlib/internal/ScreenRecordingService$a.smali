.class Lcom/voxelbusters/androidlib/internal/ScreenRecordingService$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;->t(ILandroid/content/Intent;Ljava/lang/String;ZIFZLjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:F

.field final synthetic c:I

.field final synthetic d:Landroid/content/Intent;

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Z

.field final synthetic g:Z

.field final synthetic h:Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;


# direct methods
.method constructor <init>(Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;IFILandroid/content/Intent;Ljava/lang/String;ZZ)V
    .locals 0

    iput-object p1, p0, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService$a;->h:Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;

    iput p2, p0, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService$a;->a:I

    iput p3, p0, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService$a;->b:F

    iput p4, p0, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService$a;->c:I

    iput-object p5, p0, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService$a;->d:Landroid/content/Intent;

    iput-object p6, p0, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService$a;->e:Ljava/lang/String;

    iput-boolean p7, p0, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService$a;->f:Z

    iput-boolean p8, p0, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService$a;->g:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    :try_start_0
    iget-object v0, p0, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService$a;->h:Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;

    invoke-static {}, Lcom/voxelbusters/androidlib/internal/e;->values()[Lcom/voxelbusters/androidlib/internal/e;

    move-result-object v1

    iget v2, p0, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService$a;->a:I

    aget-object v1, v1, v2

    iget v2, p0, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService$a;->b:F

    invoke-static {v0, v1, v2}, Lcom/voxelbusters/androidlib/b/b;->b(Landroid/content/Context;Lcom/voxelbusters/androidlib/internal/e;F)Lcom/voxelbusters/androidlib/b/b;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService$a;->h:Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;

    invoke-static {v0}, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;->a(Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;)Lcom/voxelbusters/androidlib/c/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService$a;->h:Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;

    invoke-static {v0}, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;->a(Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;)Lcom/voxelbusters/androidlib/c/e;

    move-result-object v0

    const-string v1, "Get RecorderProfile Error"

    invoke-interface {v0, v1}, Lcom/voxelbusters/androidlib/c/e;->onRecordingFailed(Ljava/lang/String;)V

    :cond_0
    return-void

    :cond_1
    iget-object v1, p0, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService$a;->h:Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;

    invoke-static {v1}, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;->b(Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;)Lcom/voxelbusters/androidlib/c/k;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService$a;->h:Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;

    invoke-static {v1}, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;->b(Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;)Lcom/voxelbusters/androidlib/c/k;

    move-result-object v1

    iget v2, v0, Lcom/voxelbusters/androidlib/b/b;->e:I

    invoke-interface {v1, v2}, Lcom/voxelbusters/androidlib/c/k;->setVideoBitRate(I)V

    iget-object v1, p0, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService$a;->h:Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;

    invoke-static {v1}, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;->b(Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;)Lcom/voxelbusters/androidlib/c/k;

    move-result-object v1

    iget v2, v0, Lcom/voxelbusters/androidlib/b/b;->d:I

    int-to-float v2, v2

    invoke-interface {v1, v2}, Lcom/voxelbusters/androidlib/c/k;->setVideoFrameRate(F)V

    :cond_2
    iget-object v1, p0, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService$a;->h:Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;

    iget v2, p0, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService$a;->c:I

    iget-object v3, p0, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService$a;->d:Landroid/content/Intent;

    invoke-static {v1, v2, v3}, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;->e(Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;ILandroid/content/Intent;)V

    iget-object v1, p0, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService$a;->h:Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;

    iget-object v2, p0, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService$a;->e:Ljava/lang/String;

    const/4 v3, 0x0

    iget-boolean v4, p0, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService$a;->f:Z

    invoke-static {v1, v0, v2, v3, v4}, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;->f(Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;Lcom/voxelbusters/androidlib/b/b;Ljava/lang/String;ZZ)V

    iget-object v1, p0, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService$a;->h:Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;

    iget v2, v0, Lcom/voxelbusters/androidlib/b/b;->b:I

    iget v0, v0, Lcom/voxelbusters/androidlib/b/b;->c:I

    invoke-static {v1}, Lcom/voxelbusters/androidlib/d/b;->f(Landroid/content/Context;)I

    move-result v3

    invoke-static {v1, v2, v0, v3}, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;->g(Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;III)V

    iget-object v0, p0, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService$a;->h:Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;

    iget-boolean v1, p0, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService$a;->g:Z

    invoke-static {v0, v1}, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;->h(Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;Z)V

    iget-object v0, p0, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService$a;->h:Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;

    invoke-static {v0}, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;->i(Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;)Lcom/voxelbusters/androidlib/c/i;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService$a;->h:Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;

    invoke-static {v0}, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;->i(Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;)Lcom/voxelbusters/androidlib/c/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/voxelbusters/androidlib/c/i;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "ScreenRecordingService"

    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_3
    :goto_0
    return-void
.end method
