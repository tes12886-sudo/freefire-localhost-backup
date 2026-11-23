.class Lh/d/b/c$b;
.super Lg/b/a/a$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh/d/b/c;->c(Lh/d/b/b;)Lg/b/a/a$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private a:Landroid/os/Handler;

.field final synthetic b:Lh/d/b/b;


# direct methods
.method constructor <init>(Lh/d/b/c;Lh/d/b/b;)V
    .locals 0

    invoke-direct {p0}, Lg/b/a/a$a;-><init>()V

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lh/d/b/c$b;->a:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public F0(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lh/d/b/c$b;->b:Lh/d/b/b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lh/d/b/c$b;->a:Landroid/os/Handler;

    new-instance v1, Lh/d/b/c$b$d;

    invoke-direct {v1, p0, p1, p2}, Lh/d/b/c$b$d;-><init>(Lh/d/b/c$b;Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public O0(Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lh/d/b/c$b;->b:Lh/d/b/b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lh/d/b/c$b;->a:Landroid/os/Handler;

    new-instance v1, Lh/d/b/c$b$c;

    invoke-direct {v1, p0, p1}, Lh/d/b/c$b$c;-><init>(Lh/d/b/c$b;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public V(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lh/d/b/c$b;->b:Lh/d/b/b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lh/d/b/c$b;->a:Landroid/os/Handler;

    new-instance v1, Lh/d/b/c$b$b;

    invoke-direct {v1, p0, p1, p2}, Lh/d/b/c$b$b;-><init>(Lh/d/b/c$b;Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public Y0(ILandroid/net/Uri;ZLandroid/os/Bundle;)V
    .locals 8

    iget-object v0, p0, Lh/d/b/c$b;->b:Lh/d/b/b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lh/d/b/c$b;->a:Landroid/os/Handler;

    new-instance v7, Lh/d/b/c$b$e;

    move-object v1, v7

    move-object v2, p0

    move v3, p1

    move-object v4, p2

    move v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lh/d/b/c$b$e;-><init>(Lh/d/b/c$b;ILandroid/net/Uri;ZLandroid/os/Bundle;)V

    invoke-virtual {v0, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public j0(ILandroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lh/d/b/c$b;->b:Lh/d/b/b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lh/d/b/c$b;->a:Landroid/os/Handler;

    new-instance v1, Lh/d/b/c$b$a;

    invoke-direct {v1, p0, p1, p2}, Lh/d/b/c$b$a;-><init>(Lh/d/b/c$b;ILandroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public q0(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 2

    iget-object v0, p0, Lh/d/b/c$b;->b:Lh/d/b/b;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v0, p1, p2}, Lh/d/b/b;->b(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    throw v1
.end method
