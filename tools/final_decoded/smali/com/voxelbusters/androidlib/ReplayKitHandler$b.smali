.class Lcom/voxelbusters/androidlib/ReplayKitHandler$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/voxelbusters/androidlib/c/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxelbusters/androidlib/ReplayKitHandler;->onPermissionGrantForRecording(ZIF)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/voxelbusters/androidlib/ReplayKitHandler;


# direct methods
.method constructor <init>(Lcom/voxelbusters/androidlib/ReplayKitHandler;)V
    .locals 0

    iput-object p1, p0, Lcom/voxelbusters/androidlib/ReplayKitHandler$b;->a:Lcom/voxelbusters/androidlib/ReplayKitHandler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, Lcom/voxelbusters/androidlib/ReplayKitHandler$b;->a:Lcom/voxelbusters/androidlib/ReplayKitHandler;

    invoke-static {v0, p1}, Lcom/voxelbusters/androidlib/ReplayKitHandler;->access$102(Lcom/voxelbusters/androidlib/ReplayKitHandler;Landroid/content/Intent;)Landroid/content/Intent;

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/voxelbusters/androidlib/ReplayKitHandler$b;->a:Lcom/voxelbusters/androidlib/ReplayKitHandler;

    invoke-virtual {v0, p1}, Lcom/voxelbusters/androidlib/ReplayKitHandler;->onRecordingFailed(Ljava/lang/String;)V

    return-void
.end method
