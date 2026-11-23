.class public Lj/c/a/e/e/a;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private a:Lj/c/a/e/e/b;

.field private b:Z

.field private c:Landroid/content/BroadcastReceiver;

.field private d:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lj/c/a/e/e/a;->b:Z

    iput-object p1, p0, Lj/c/a/e/e/a;->d:Landroid/content/Context;

    new-instance p1, Lj/c/a/e/e/b;

    invoke-direct {p1}, Lj/c/a/e/e/b;-><init>()V

    iput-object p1, p0, Lj/c/a/e/e/a;->a:Lj/c/a/e/e/b;

    return-void
.end method


# virtual methods
.method public a(Landroid/content/BroadcastReceiver;)V
    .locals 2

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "com.garena.android.gpns.local"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iget-object v1, p0, Lj/c/a/e/e/a;->d:Landroid/content/Context;

    invoke-virtual {v1, p1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    iput-object p1, p0, Lj/c/a/e/e/a;->c:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method public b()V
    .locals 3

    iget-boolean v0, p0, Lj/c/a/e/e/a;->b:Z

    if-nez v0, :cond_0

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iget-object v1, p0, Lj/c/a/e/e/a;->d:Landroid/content/Context;

    iget-object v2, p0, Lj/c/a/e/e/a;->a:Lj/c/a/e/e/b;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lj/c/a/e/e/a;->b:Z

    return-void
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, Lj/c/a/e/e/a;->c:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lj/c/a/e/e/a;->d:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    :cond_0
    return-void
.end method

.method public d()V
    .locals 2

    iget-boolean v0, p0, Lj/c/a/e/e/a;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lj/c/a/e/e/a;->d:Landroid/content/Context;

    iget-object v1, p0, Lj/c/a/e/e/a;->a:Lj/c/a/e/e/b;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lj/c/a/e/e/a;->b:Z

    return-void
.end method
