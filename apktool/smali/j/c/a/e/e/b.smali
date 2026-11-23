.class public Lj/c/a/e/e/b;
.super Landroid/content/BroadcastReceiver;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    invoke-static {p1}, Lj/c/a/e/l/c;->d(Landroid/content/Context;)Z

    move-result p2

    if-eqz p2, :cond_0

    const-string p2, "NETWORK_CHANGED : true"

    invoke-static {p2}, Lj/c/a/e/l/b;->d(Ljava/lang/String;)V

    const-string p2, "SCHEDULE_WAKE_CONNECT"

    invoke-static {p2}, Lj/c/a/e/l/b;->d(Ljava/lang/String;)V

    const/16 p2, 0x7530

    invoke-static {p1, p2}, Lj/c/a/e/l/a;->g(Landroid/content/Context;I)V

    invoke-static {}, Lj/c/a/e/a;->a()Lj/c/a/e/e/a;

    move-result-object p1

    invoke-virtual {p1}, Lj/c/a/e/e/a;->d()V

    :cond_0
    return-void
.end method
