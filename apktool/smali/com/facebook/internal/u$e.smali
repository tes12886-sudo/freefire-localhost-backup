.class final Lcom/facebook/internal/u$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/internal/u;->n()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/internal/u$b;

.field final synthetic b:Lcom/facebook/internal/t;


# direct methods
.method constructor <init>(Lcom/facebook/internal/u$b;Lcom/facebook/internal/t;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/internal/u$e;->a:Lcom/facebook/internal/u$b;

    iput-object p2, p0, Lcom/facebook/internal/u$e;->b:Lcom/facebook/internal/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    invoke-static {p0}, Lcom/facebook/internal/m0/i/a;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/facebook/internal/u$e;->a:Lcom/facebook/internal/u$b;

    iget-object v1, p0, Lcom/facebook/internal/u$e;->b:Lcom/facebook/internal/t;

    invoke-interface {v0, v1}, Lcom/facebook/internal/u$b;->b(Lcom/facebook/internal/t;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0, p0}, Lcom/facebook/internal/m0/i/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method
