.class Lcom/voxelbusters/androidlib/ReplayKitHandler$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/voxelbusters/androidlib/c/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxelbusters/androidlib/ReplayKitHandler;->startRecording(Ljava/lang/String;ZIFLjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:I

.field final synthetic c:F

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lcom/voxelbusters/androidlib/ReplayKitHandler;


# direct methods
.method constructor <init>(Lcom/voxelbusters/androidlib/ReplayKitHandler;ZIFLjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/voxelbusters/androidlib/ReplayKitHandler$e;->e:Lcom/voxelbusters/androidlib/ReplayKitHandler;

    iput-boolean p2, p0, Lcom/voxelbusters/androidlib/ReplayKitHandler$e;->a:Z

    iput p3, p0, Lcom/voxelbusters/androidlib/ReplayKitHandler$e;->b:I

    iput p4, p0, Lcom/voxelbusters/androidlib/ReplayKitHandler$e;->c:F

    iput-object p5, p0, Lcom/voxelbusters/androidlib/ReplayKitHandler$e;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 3

    invoke-static {}, Lcom/voxelbusters/androidlib/ReplayKitHandler;->access$000()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed while preparing for recording : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/voxelbusters/androidlib/ReplayKitHandler$e;->e:Lcom/voxelbusters/androidlib/ReplayKitHandler;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/voxelbusters/androidlib/ReplayKitHandler;->access$302(Lcom/voxelbusters/androidlib/ReplayKitHandler;Z)Z

    iget-object v0, p0, Lcom/voxelbusters/androidlib/ReplayKitHandler$e;->e:Lcom/voxelbusters/androidlib/ReplayKitHandler;

    invoke-virtual {v0, p1}, Lcom/voxelbusters/androidlib/ReplayKitHandler;->onRecordingFailed(Ljava/lang/String;)V

    return-void
.end method

.method public b()V
    .locals 5

    invoke-static {}, Lcom/voxelbusters/androidlib/ReplayKitHandler;->access$000()Ljava/lang/String;

    move-result-object v0

    const-string v1, "[Start Recording] onPrepareSuccess"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/voxelbusters/androidlib/ReplayKitHandler$e;->e:Lcom/voxelbusters/androidlib/ReplayKitHandler;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/voxelbusters/androidlib/ReplayKitHandler;->access$302(Lcom/voxelbusters/androidlib/ReplayKitHandler;Z)Z

    iget-object v0, p0, Lcom/voxelbusters/androidlib/ReplayKitHandler$e;->e:Lcom/voxelbusters/androidlib/ReplayKitHandler;

    iget-boolean v1, p0, Lcom/voxelbusters/androidlib/ReplayKitHandler$e;->a:Z

    iget v2, p0, Lcom/voxelbusters/androidlib/ReplayKitHandler$e;->b:I

    iget v3, p0, Lcom/voxelbusters/androidlib/ReplayKitHandler$e;->c:F

    iget-object v4, p0, Lcom/voxelbusters/androidlib/ReplayKitHandler$e;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/voxelbusters/androidlib/ReplayKitHandler;->access$400(Lcom/voxelbusters/androidlib/ReplayKitHandler;ZIFLjava/lang/String;)V

    return-void
.end method
