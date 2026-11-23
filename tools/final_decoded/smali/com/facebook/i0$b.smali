.class final Lcom/facebook/i0$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/i0;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:J


# direct methods
.method constructor <init>(J)V
    .locals 0

    iput-wide p1, p0, Lcom/facebook/i0$b;->a:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    const-string v0, "auto_event_setup_enabled"

    invoke-static {p0}, Lcom/facebook/internal/m0/i/a;->d(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    sget-object v1, Lcom/facebook/i0;->j:Lcom/facebook/i0;

    invoke-static {v1}, Lcom/facebook/i0;->a(Lcom/facebook/i0;)Lcom/facebook/i0$a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/i0$a;->e()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    invoke-static {}, Lcom/facebook/r;->g()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3}, Lcom/facebook/internal/u;->o(Ljava/lang/String;Z)Lcom/facebook/internal/t;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lcom/facebook/internal/t;->b()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {}, Lcom/facebook/r;->f()Landroid/content/Context;

    move-result-object v2

    sget-object v4, Lcom/facebook/internal/b;->h:Lcom/facebook/internal/b$a;

    invoke-virtual {v4, v2}, Lcom/facebook/internal/b$a;->e(Landroid/content/Context;)Lcom/facebook/internal/b;

    move-result-object v2

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lcom/facebook/internal/b;->h()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {v2}, Lcom/facebook/internal/b;->h()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_1
    move-object v2, v4

    :goto_0
    if-eqz v2, :cond_2

    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    const-string v6, "advertiser_id"

    invoke-virtual {v5, v6, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "fields"

    invoke-virtual {v5, v2, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v2, Lcom/facebook/u;->t:Lcom/facebook/u$c;

    invoke-static {}, Lcom/facebook/r;->g()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v4, v6, v4}, Lcom/facebook/u$c;->v(Lcom/facebook/a;Ljava/lang/String;Lcom/facebook/u$b;)Lcom/facebook/u;

    move-result-object v2

    const/4 v4, 0x1

    invoke-virtual {v2, v4}, Lcom/facebook/u;->H(Z)V

    invoke-virtual {v2, v5}, Lcom/facebook/u;->G(Landroid/os/Bundle;)V

    invoke-virtual {v2}, Lcom/facebook/u;->i()Lcom/facebook/x;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/x;->c()Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-static {v1}, Lcom/facebook/i0;->b(Lcom/facebook/i0;)Lcom/facebook/i0$a;

    move-result-object v4

    invoke-virtual {v2, v0, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/facebook/i0$a;->g(Ljava/lang/Boolean;)V

    invoke-static {v1}, Lcom/facebook/i0;->b(Lcom/facebook/i0;)Lcom/facebook/i0$a;

    move-result-object v0

    iget-wide v4, p0, Lcom/facebook/i0$b;->a:J

    invoke-virtual {v0, v4, v5}, Lcom/facebook/i0$a;->f(J)V

    invoke-static {v1}, Lcom/facebook/i0;->b(Lcom/facebook/i0;)Lcom/facebook/i0$a;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/facebook/i0;->d(Lcom/facebook/i0;Lcom/facebook/i0$a;)V

    :cond_2
    invoke-static {v1}, Lcom/facebook/i0;->c(Lcom/facebook/i0;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0, p0}, Lcom/facebook/internal/m0/i/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method
