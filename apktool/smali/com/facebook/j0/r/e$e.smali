.class final Lcom/facebook/j0/r/e$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/j0/r/e;->k(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/j0/r/e;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/facebook/j0/r/e;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/j0/r/e$e;->a:Lcom/facebook/j0/r/e;

    iput-object p2, p0, Lcom/facebook/j0/r/e$e;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    invoke-static {p0}, Lcom/facebook/internal/m0/i/a;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/facebook/j0/r/e$e;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/facebook/internal/h0;->j0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/facebook/a;->p:Lcom/facebook/a$c;

    invoke-virtual {v1}, Lcom/facebook/a$c;->e()Lcom/facebook/a;

    move-result-object v1

    if-eqz v0, :cond_1

    iget-object v2, p0, Lcom/facebook/j0/r/e$e;->a:Lcom/facebook/j0/r/e;

    invoke-static {v2}, Lcom/facebook/j0/r/e;->c(Lcom/facebook/j0/r/e;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Ll/y/c/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    return-void

    :cond_1
    sget-object v2, Lcom/facebook/j0/r/e;->f:Lcom/facebook/j0/r/e$a;

    iget-object v3, p0, Lcom/facebook/j0/r/e$e;->b:Ljava/lang/String;

    invoke-static {}, Lcom/facebook/r;->g()Ljava/lang/String;

    move-result-object v4

    const-string v5, "app_indexing"

    invoke-virtual {v2, v3, v1, v4, v5}, Lcom/facebook/j0/r/e$a;->a(Ljava/lang/String;Lcom/facebook/a;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/u;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/j0/r/e$e;->a:Lcom/facebook/j0/r/e;

    invoke-virtual {v2, v1, v0}, Lcom/facebook/j0/r/e;->i(Lcom/facebook/u;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0, p0}, Lcom/facebook/internal/m0/i/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method
