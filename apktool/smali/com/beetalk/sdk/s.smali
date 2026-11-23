.class public Lcom/beetalk/sdk/s;
.super Lcom/beetalk/sdk/e;
.source ""

# interfaces
.implements Lcom/beetalk/sdk/b0/a$d;


# instance fields
.field private final b:Lcom/beetalk/sdk/b0/a;


# direct methods
.method public constructor <init>(Lcom/beetalk/sdk/b;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/e;-><init>(Lcom/beetalk/sdk/b;)V

    new-instance v0, Lcom/beetalk/sdk/b0/a;

    invoke-virtual {p1}, Lcom/beetalk/sdk/b;->e()Lcom/beetalk/sdk/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/beetalk/sdk/a;->a()Landroid/app/Activity;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/beetalk/sdk/b0/a;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/beetalk/sdk/s;->b:Lcom/beetalk/sdk/b0/a;

    invoke-virtual {v0, p0}, Lcom/beetalk/sdk/b0/a;->f(Lcom/beetalk/sdk/b0/a$d;)V

    return-void
.end method

.method private f(Ljava/lang/String;)Li/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Li/i<",
            "Lcom/beetalk/sdk/b$e;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    invoke-virtual {v0}, Lcom/beetalk/sdk/b;->i()Lcom/beetalk/sdk/b$c;

    move-result-object v0

    new-instance v1, Lcom/beetalk/sdk/s$c;

    invoke-direct {v1, p0, v0, p1}, Lcom/beetalk/sdk/s$c;-><init>(Lcom/beetalk/sdk/s;Lcom/beetalk/sdk/b$c;Ljava/lang/String;)V

    invoke-static {v1}, Li/i;->e(Ljava/util/concurrent/Callable;)Li/i;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a(Lcom/vk/sdk/k/c;)V
    .locals 4

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string v1, "vk auth err: %s"

    invoke-static {v1, v0}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    invoke-virtual {v0}, Lcom/beetalk/sdk/b;->i()Lcom/beetalk/sdk/b$c;

    move-result-object v0

    if-eqz p1, :cond_0

    iget v1, p1, Lcom/vk/sdk/k/c;->e:I

    const/16 v2, -0x66

    if-ne v1, v2, :cond_0

    iget-object p1, p0, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    sget-object v1, Lcom/garena/pay/android/b;->f:Lcom/garena/pay/android/b;

    invoke-virtual {v1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v0, v1}, Lcom/beetalk/sdk/b$e;->a(Lcom/beetalk/sdk/b$c;I)Lcom/beetalk/sdk/b$e;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/beetalk/sdk/b;->k(Lcom/beetalk/sdk/b$e;)V

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    if-eqz p1, :cond_1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p1, Lcom/vk/sdk/k/c;->e:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ") "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Lcom/vk/sdk/k/c;->f:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    const-string p1, ""

    :goto_0
    sget-object v2, Lcom/garena/pay/android/b;->h:Lcom/garena/pay/android/b;

    invoke-virtual {v2}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const-string v3, "error"

    invoke-static {v0, v3, p1, v2}, Lcom/beetalk/sdk/b$e;->b(Lcom/beetalk/sdk/b$c;Ljava/lang/String;Ljava/lang/String;I)Lcom/beetalk/sdk/b$e;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/beetalk/sdk/b;->k(Lcom/beetalk/sdk/b$e;)V

    :goto_1
    return-void
.end method

.method public b()V
    .locals 5

    invoke-static {}, Lcom/vk/sdk/e;->b()Lcom/vk/sdk/e;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, v0, Lcom/vk/sdk/e;->a:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, v0, Lcom/vk/sdk/e;->a:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "vk auth success: %s"

    invoke-static {v2, v1}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v1, Landroid/app/Dialog;

    iget-object v2, p0, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    invoke-virtual {v2}, Lcom/beetalk/sdk/b;->f()Landroid/content/Context;

    move-result-object v2

    sget v4, Lj/c/b/h;->a:I

    invoke-direct {v1, v2, v4}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    sget v2, Lj/c/b/f;->d:I

    invoke-virtual {v1, v2}, Landroid/app/Dialog;->setContentView(I)V

    invoke-virtual {v1, v3}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    new-instance v2, Lcom/beetalk/sdk/s$a;

    invoke-direct {v2, p0}, Lcom/beetalk/sdk/s$a;-><init>(Lcom/beetalk/sdk/s;)V

    invoke-virtual {v1, v2}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    :try_start_0
    invoke-virtual {v1}, Landroid/app/Dialog;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    iget-object v0, v0, Lcom/vk/sdk/e;->a:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/beetalk/sdk/s;->f(Ljava/lang/String;)Li/i;

    move-result-object v0

    new-instance v2, Lcom/beetalk/sdk/s$b;

    invoke-direct {v2, p0, v1}, Lcom/beetalk/sdk/s$b;-><init>(Lcom/beetalk/sdk/s;Landroid/app/Dialog;)V

    sget-object v1, Li/i;->k:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v2, v1}, Li/i;->j(Li/g;Ljava/util/concurrent/Executor;)Li/i;

    return-void

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    invoke-virtual {v0}, Lcom/beetalk/sdk/b;->i()Lcom/beetalk/sdk/b$c;

    move-result-object v1

    sget-object v2, Lcom/garena/pay/android/b;->h:Lcom/garena/pay/android/b;

    invoke-virtual {v2}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const-string v3, "error"

    const-string v4, "vk access token is null"

    invoke-static {v1, v3, v4, v2}, Lcom/beetalk/sdk/b$e;->b(Lcom/beetalk/sdk/b$c;Ljava/lang/String;Ljava/lang/String;I)Lcom/beetalk/sdk/b$e;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beetalk/sdk/b;->k(Lcom/beetalk/sdk/b$e;)V

    return-void
.end method

.method d(IILandroid/content/Intent;Lcom/beetalk/sdk/b$c;)Z
    .locals 0

    iget-object p1, p0, Lcom/beetalk/sdk/s;->b:Lcom/beetalk/sdk/b0/a;

    invoke-virtual {p1, p2, p3}, Lcom/beetalk/sdk/b0/a;->e(ILandroid/content/Intent;)Z

    move-result p1

    return p1
.end method

.method e(Lcom/beetalk/sdk/b$c;)Z
    .locals 3

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "start VK Auth"

    invoke-static {v2, v1}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object p1, p0, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    invoke-virtual {p1}, Lcom/beetalk/sdk/b;->f()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/beetalk/sdk/b0/c;->a(Landroid/content/Context;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_1

    iget-object p1, p0, Lcom/beetalk/sdk/s;->b:Lcom/beetalk/sdk/b0/a;

    invoke-virtual {p1}, Lcom/beetalk/sdk/b0/a;->g()V

    const/4 p1, 0x1

    return p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Forget add <integer name=\"com_vk_sdk_AppId\">your_app_id</integer> in your values dir?"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
