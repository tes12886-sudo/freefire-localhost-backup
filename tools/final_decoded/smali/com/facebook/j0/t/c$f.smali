.class final Lcom/facebook/j0/t/c$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/j0/t/c;->p(Ljava/lang/String;Ljava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/j0/t/c;

.field final synthetic b:Ljava/lang/Runnable;


# direct methods
.method constructor <init>(Lcom/facebook/j0/t/c;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/j0/t/c$f;->a:Lcom/facebook/j0/t/c;

    iput-object p2, p0, Lcom/facebook/j0/t/c$f;->b:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    invoke-static {p0}, Lcom/facebook/internal/m0/i/a;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/facebook/j0/t/c$f;->a:Lcom/facebook/j0/t/c;

    const-string v1, "inapp"

    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Lcom/facebook/j0/t/c$f;->a:Lcom/facebook/j0/t/c;

    invoke-static {v3}, Lcom/facebook/j0/t/c;->d(Lcom/facebook/j0/t/c;)Ljava/util/Set;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v3, p0, Lcom/facebook/j0/t/c$f;->b:Ljava/lang/Runnable;

    invoke-static {v0, v1, v2, v3}, Lcom/facebook/j0/t/c;->l(Lcom/facebook/j0/t/c;Ljava/lang/String;Ljava/util/List;Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0, p0}, Lcom/facebook/internal/m0/i/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method
