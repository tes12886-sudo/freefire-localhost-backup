.class public Lcom/voxelbusters/androidlib/internal/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/voxelbusters/androidlib/c/i;


# instance fields
.field private a:Lcom/voxelbusters/androidlib/c/e;

.field private b:Lcom/voxelbusters/androidlib/c/k;

.field private c:Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;

.field private d:Landroid/content/Context;

.field private e:Z

.field private f:I

.field private g:F

.field private h:Landroid/content/Intent;

.field private i:Z

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:Landroid/content/ServiceConnection;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/voxelbusters/androidlib/c/e;Lcom/voxelbusters/androidlib/c/k;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/voxelbusters/androidlib/internal/c$a;

    invoke-direct {v0, p0}, Lcom/voxelbusters/androidlib/internal/c$a;-><init>(Lcom/voxelbusters/androidlib/internal/c;)V

    iput-object v0, p0, Lcom/voxelbusters/androidlib/internal/c;->l:Landroid/content/ServiceConnection;

    iput-object p1, p0, Lcom/voxelbusters/androidlib/internal/c;->d:Landroid/content/Context;

    iput-object p2, p0, Lcom/voxelbusters/androidlib/internal/c;->a:Lcom/voxelbusters/androidlib/c/e;

    iput-object p3, p0, Lcom/voxelbusters/androidlib/internal/c;->b:Lcom/voxelbusters/androidlib/c/k;

    return-void
.end method

.method static synthetic c(Lcom/voxelbusters/androidlib/internal/c;)Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;
    .locals 0

    iget-object p0, p0, Lcom/voxelbusters/androidlib/internal/c;->c:Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;

    return-object p0
.end method

.method static synthetic d(Lcom/voxelbusters/androidlib/internal/c;Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;)Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;
    .locals 0

    iput-object p1, p0, Lcom/voxelbusters/androidlib/internal/c;->c:Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;

    return-object p1
.end method

.method static synthetic e(Lcom/voxelbusters/androidlib/internal/c;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/voxelbusters/androidlib/internal/c;->j:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic f(Lcom/voxelbusters/androidlib/internal/c;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/voxelbusters/androidlib/internal/c;->k:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic g(Lcom/voxelbusters/androidlib/internal/c;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/voxelbusters/androidlib/internal/c;->d:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic h(Lcom/voxelbusters/androidlib/internal/c;)Lcom/voxelbusters/androidlib/c/e;
    .locals 0

    iget-object p0, p0, Lcom/voxelbusters/androidlib/internal/c;->a:Lcom/voxelbusters/androidlib/c/e;

    return-object p0
.end method

.method static synthetic i(Lcom/voxelbusters/androidlib/internal/c;)Lcom/voxelbusters/androidlib/c/k;
    .locals 0

    iget-object p0, p0, Lcom/voxelbusters/androidlib/internal/c;->b:Lcom/voxelbusters/androidlib/c/k;

    return-object p0
.end method

.method static synthetic j(Lcom/voxelbusters/androidlib/internal/c;)Landroid/content/Intent;
    .locals 0

    iget-object p0, p0, Lcom/voxelbusters/androidlib/internal/c;->h:Landroid/content/Intent;

    return-object p0
.end method

.method static synthetic k(Lcom/voxelbusters/androidlib/internal/c;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/voxelbusters/androidlib/internal/c;->e:Z

    return p0
.end method

.method static synthetic l(Lcom/voxelbusters/androidlib/internal/c;)I
    .locals 0

    iget p0, p0, Lcom/voxelbusters/androidlib/internal/c;->f:I

    return p0
.end method

.method static synthetic m(Lcom/voxelbusters/androidlib/internal/c;)F
    .locals 0

    iget p0, p0, Lcom/voxelbusters/androidlib/internal/c;->g:F

    return p0
.end method

.method static synthetic n(Lcom/voxelbusters/androidlib/internal/c;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/voxelbusters/androidlib/internal/c;->i:Z

    return p0
.end method

.method private o()V
    .locals 4

    const-string v0, "RecorderController"

    const-string v1, "Binding recording service..."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/voxelbusters/androidlib/internal/c;->d:Landroid/content/Context;

    const-class v2, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object v1, p0, Lcom/voxelbusters/androidlib/internal/c;->d:Landroid/content/Context;

    iget-object v2, p0, Lcom/voxelbusters/androidlib/internal/c;->l:Landroid/content/ServiceConnection;

    const/4 v3, 0x1

    invoke-virtual {v1, v0, v2, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    return-void
.end method

.method private s()V
    .locals 2

    const-string v0, "RecorderController"

    const-string v1, "Unbinding recording service..."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/voxelbusters/androidlib/internal/c;->d:Landroid/content/Context;

    iget-object v1, p0, Lcom/voxelbusters/androidlib/internal/c;->l:Landroid/content/ServiceConnection;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/voxelbusters/androidlib/internal/c;->c:Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    const-string v0, "RecorderController"

    const-string v1, "Service Task Started!"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public b()V
    .locals 3

    const-string v0, "RecorderController"

    const-string v1, "Service Task ended!"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v1, p0, Lcom/voxelbusters/androidlib/internal/c;->c:Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;->n()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/voxelbusters/androidlib/internal/c;->j:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Recording is available at path : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/voxelbusters/androidlib/internal/c;->j:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-direct {p0}, Lcom/voxelbusters/androidlib/internal/c;->s()V

    :cond_0
    return-void
.end method

.method public p()Z
    .locals 1

    iget-object v0, p0, Lcom/voxelbusters/androidlib/internal/c;->c:Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public q(Ljava/lang/String;ZIFLandroid/content/Intent;ZLjava/lang/String;)V
    .locals 2

    iput-object p1, p0, Lcom/voxelbusters/androidlib/internal/c;->j:Ljava/lang/String;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1d

    if-lt p1, v0, :cond_0

    new-instance p1, Landroid/content/Intent;

    iget-object v0, p0, Lcom/voxelbusters/androidlib/internal/c;->d:Landroid/content/Context;

    const-class v1, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;

    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/voxelbusters/androidlib/internal/c;->d:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->startForegroundService(Landroid/content/Intent;)Landroid/content/ComponentName;

    :cond_0
    iput-boolean p2, p0, Lcom/voxelbusters/androidlib/internal/c;->e:Z

    iput p3, p0, Lcom/voxelbusters/androidlib/internal/c;->f:I

    iput p4, p0, Lcom/voxelbusters/androidlib/internal/c;->g:F

    iput-object p5, p0, Lcom/voxelbusters/androidlib/internal/c;->h:Landroid/content/Intent;

    iput-boolean p6, p0, Lcom/voxelbusters/androidlib/internal/c;->i:Z

    iput-object p7, p0, Lcom/voxelbusters/androidlib/internal/c;->k:Ljava/lang/String;

    invoke-direct {p0}, Lcom/voxelbusters/androidlib/internal/c;->o()V

    return-void
.end method

.method public r()V
    .locals 2

    iget-object v0, p0, Lcom/voxelbusters/androidlib/internal/c;->c:Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/voxelbusters/androidlib/internal/ScreenRecordingService;->v()V

    goto :goto_0

    :cond_0
    const-string v0, "Screen recording service is null. This means you don\'t have any active recording yet!"

    const-string v1, "RecorderController"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v1, p0, Lcom/voxelbusters/androidlib/internal/c;->a:Lcom/voxelbusters/androidlib/c/e;

    if-eqz v1, :cond_1

    invoke-interface {v1, v0}, Lcom/voxelbusters/androidlib/c/e;->onRecordingFailed(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method
