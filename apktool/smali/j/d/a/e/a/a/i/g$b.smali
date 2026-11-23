.class Lj/d/a/e/a/a/i/g$b;
.super Landroid/content/BroadcastReceiver;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/d/a/e/a/a/i/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final a:Landroid/app/Service;

.field final synthetic b:Lj/d/a/e/a/a/i/g;


# direct methods
.method constructor <init>(Lj/d/a/e/a/a/i/g;Landroid/app/Service;)V
    .locals 0

    iput-object p1, p0, Lj/d/a/e/a/a/i/g$b;->b:Lj/d/a/e/a/a/i/g;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    iput-object p2, p0, Lj/d/a/e/a/a/i/g$b;->a:Landroid/app/Service;

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    iget-object p2, p0, Lj/d/a/e/a/a/i/g$b;->b:Lj/d/a/e/a/a/i/g;

    invoke-virtual {p2}, Lj/d/a/e/a/a/i/g;->pollNetworkState()V

    iget-object p2, p0, Lj/d/a/e/a/a/i/g$b;->b:Lj/d/a/e/a/a/i/g;

    invoke-static {p2}, Lj/d/a/e/a/a/i/g;->access$300(Lj/d/a/e/a/a/i/g;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-static {}, Lj/d/a/e/a/a/i/g;->access$400()Z

    move-result p2

    if-nez p2, :cond_0

    const-string p2, "LVLDL"

    const-string v0, "InnerBroadcastReceiver Called"

    invoke-static {p2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance p2, Landroid/content/Intent;

    iget-object v0, p0, Lj/d/a/e/a/a/i/g$b;->a:Landroid/app/Service;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-direct {p2, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object v0, p0, Lj/d/a/e/a/a/i/g$b;->b:Lj/d/a/e/a/a/i/g;

    invoke-static {v0}, Lj/d/a/e/a/a/i/g;->access$000(Lj/d/a/e/a/a/i/g;)Landroid/app/PendingIntent;

    move-result-object v0

    const-string v1, "EPI"

    invoke-virtual {p2, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    invoke-virtual {p1, p2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    :cond_0
    return-void
.end method
