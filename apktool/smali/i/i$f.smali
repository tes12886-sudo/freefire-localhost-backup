.class final Li/i$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li/i;->g(Li/j;Li/g;Li/i;Ljava/util/concurrent/Executor;Li/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Li/d;

.field final synthetic b:Li/j;

.field final synthetic c:Li/g;

.field final synthetic d:Li/i;


# direct methods
.method constructor <init>(Li/d;Li/j;Li/g;Li/i;)V
    .locals 0

    iput-object p1, p0, Li/i$f;->a:Li/d;

    iput-object p2, p0, Li/i$f;->b:Li/j;

    iput-object p3, p0, Li/i$f;->c:Li/g;

    iput-object p4, p0, Li/i$f;->d:Li/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Li/i$f;->a:Li/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Li/d;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Li/i$f;->b:Li/j;

    invoke-virtual {v0}, Li/j;->b()V

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Li/i$f;->c:Li/g;

    iget-object v1, p0, Li/i$f;->d:Li/i;

    invoke-interface {v0, v1}, Li/g;->a(Li/i;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li/i;

    if-nez v0, :cond_1

    iget-object v0, p0, Li/i$f;->b:Li/j;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Li/j;->d(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    new-instance v1, Li/i$f$a;

    invoke-direct {v1, p0}, Li/i$f$a;-><init>(Li/i$f;)V

    invoke-virtual {v0, v1}, Li/i;->i(Li/g;)Li/i;
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Li/i$f;->b:Li/j;

    invoke-virtual {v1, v0}, Li/j;->c(Ljava/lang/Exception;)V

    goto :goto_0

    :catch_1
    iget-object v0, p0, Li/i$f;->b:Li/j;

    invoke-virtual {v0}, Li/j;->b()V

    :goto_0
    return-void
.end method
