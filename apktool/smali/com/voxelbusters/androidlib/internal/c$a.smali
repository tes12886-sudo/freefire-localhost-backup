.class Lcom/voxelbusters/androidlib/internal/c$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxelbusters/androidlib/internal/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/voxelbusters/androidlib/internal/c;


# direct methods
.method constructor <init>(Lcom/voxelbusters/androidlib/internal/c;)V
    .locals 0

    iput-object p1, p0, Lcom/voxelbusters/androidlib/internal/c$a;->a:Lcom/voxelbusters/androidlib/internal/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 9

    const-string p1, "RecorderController"

    const-string v0, "On recording service connected!"

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    check-cast p2, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService$f;

    iget-object p1, p0, Lcom/voxelbusters/androidlib/internal/c$a;->a:Lcom/voxelbusters/androidlib/internal/c;

    invoke-virtual {p2}, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService$f;->a()Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/voxelbusters/androidlib/internal/c;->d(Lcom/voxelbusters/androidlib/internal/c;Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;)Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;

    iget-object p1, p0, Lcom/voxelbusters/androidlib/internal/c$a;->a:Lcom/voxelbusters/androidlib/internal/c;

    invoke-static {p1}, Lcom/voxelbusters/androidlib/internal/c;->e(Lcom/voxelbusters/androidlib/internal/c;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string p2, ""

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p2, p0, Lcom/voxelbusters/androidlib/internal/c$a;->a:Lcom/voxelbusters/androidlib/internal/c;

    invoke-static {p2}, Lcom/voxelbusters/androidlib/internal/c;->g(Lcom/voxelbusters/androidlib/internal/c;)Landroid/content/Context;

    move-result-object p2

    const/4 v0, 0x0

    invoke-static {p2, v0}, Lcom/voxelbusters/androidlib/d/b;->k(Landroid/content/Context;Z)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "/"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p2, ".mp4"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_1
    move-object v3, p1

    iget-object p1, p0, Lcom/voxelbusters/androidlib/internal/c$a;->a:Lcom/voxelbusters/androidlib/internal/c;

    invoke-static {p1}, Lcom/voxelbusters/androidlib/internal/c;->c(Lcom/voxelbusters/androidlib/internal/c;)Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;

    move-result-object p1

    iget-object p2, p0, Lcom/voxelbusters/androidlib/internal/c$a;->a:Lcom/voxelbusters/androidlib/internal/c;

    invoke-static {p2}, Lcom/voxelbusters/androidlib/internal/c;->h(Lcom/voxelbusters/androidlib/internal/c;)Lcom/voxelbusters/androidlib/c/e;

    move-result-object p2

    iget-object v0, p0, Lcom/voxelbusters/androidlib/internal/c$a;->a:Lcom/voxelbusters/androidlib/internal/c;

    invoke-static {v0}, Lcom/voxelbusters/androidlib/internal/c;->i(Lcom/voxelbusters/androidlib/internal/c;)Lcom/voxelbusters/androidlib/c/k;

    move-result-object v0

    iget-object v1, p0, Lcom/voxelbusters/androidlib/internal/c$a;->a:Lcom/voxelbusters/androidlib/internal/c;

    invoke-virtual {p1, p2, v0, v1}, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;->p(Lcom/voxelbusters/androidlib/c/e;Lcom/voxelbusters/androidlib/c/k;Lcom/voxelbusters/androidlib/c/i;)V

    iget-object p1, p0, Lcom/voxelbusters/androidlib/internal/c$a;->a:Lcom/voxelbusters/androidlib/internal/c;

    invoke-static {p1}, Lcom/voxelbusters/androidlib/internal/c;->c(Lcom/voxelbusters/androidlib/internal/c;)Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;

    move-result-object v0

    const/4 v1, -0x1

    iget-object p1, p0, Lcom/voxelbusters/androidlib/internal/c$a;->a:Lcom/voxelbusters/androidlib/internal/c;

    invoke-static {p1}, Lcom/voxelbusters/androidlib/internal/c;->j(Lcom/voxelbusters/androidlib/internal/c;)Landroid/content/Intent;

    move-result-object v2

    iget-object p1, p0, Lcom/voxelbusters/androidlib/internal/c$a;->a:Lcom/voxelbusters/androidlib/internal/c;

    invoke-static {p1}, Lcom/voxelbusters/androidlib/internal/c;->k(Lcom/voxelbusters/androidlib/internal/c;)Z

    move-result v4

    iget-object p1, p0, Lcom/voxelbusters/androidlib/internal/c$a;->a:Lcom/voxelbusters/androidlib/internal/c;

    invoke-static {p1}, Lcom/voxelbusters/androidlib/internal/c;->l(Lcom/voxelbusters/androidlib/internal/c;)I

    move-result v5

    iget-object p1, p0, Lcom/voxelbusters/androidlib/internal/c$a;->a:Lcom/voxelbusters/androidlib/internal/c;

    invoke-static {p1}, Lcom/voxelbusters/androidlib/internal/c;->m(Lcom/voxelbusters/androidlib/internal/c;)F

    move-result v6

    iget-object p1, p0, Lcom/voxelbusters/androidlib/internal/c$a;->a:Lcom/voxelbusters/androidlib/internal/c;

    invoke-static {p1}, Lcom/voxelbusters/androidlib/internal/c;->n(Lcom/voxelbusters/androidlib/internal/c;)Z

    move-result v7

    iget-object p1, p0, Lcom/voxelbusters/androidlib/internal/c$a;->a:Lcom/voxelbusters/androidlib/internal/c;

    invoke-static {p1}, Lcom/voxelbusters/androidlib/internal/c;->f(Lcom/voxelbusters/androidlib/internal/c;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {v0 .. v8}, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;->t(ILandroid/content/Intent;Ljava/lang/String;ZIFZLjava/lang/String;)V

    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    const-string p1, "RecorderController"

    const-string v0, "On recording service disconnected!"

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/voxelbusters/androidlib/internal/c$a;->a:Lcom/voxelbusters/androidlib/internal/c;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/voxelbusters/androidlib/internal/c;->d(Lcom/voxelbusters/androidlib/internal/c;Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;)Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;

    return-void
.end method
