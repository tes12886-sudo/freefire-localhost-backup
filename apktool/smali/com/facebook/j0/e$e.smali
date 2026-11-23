.class final Lcom/facebook/j0/e$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/j0/e;->n(Lcom/facebook/j0/a;Lcom/facebook/u;Lcom/facebook/x;Lcom/facebook/j0/o;Lcom/facebook/j0/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/j0/a;

.field final synthetic b:Lcom/facebook/j0/o;


# direct methods
.method constructor <init>(Lcom/facebook/j0/a;Lcom/facebook/j0/o;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/j0/e$e;->a:Lcom/facebook/j0/a;

    iput-object p2, p0, Lcom/facebook/j0/e$e;->b:Lcom/facebook/j0/o;

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
    iget-object v0, p0, Lcom/facebook/j0/e$e;->a:Lcom/facebook/j0/a;

    iget-object v1, p0, Lcom/facebook/j0/e$e;->b:Lcom/facebook/j0/o;

    invoke-static {v0, v1}, Lcom/facebook/j0/f;->a(Lcom/facebook/j0/a;Lcom/facebook/j0/o;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0, p0}, Lcom/facebook/internal/m0/i/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method
