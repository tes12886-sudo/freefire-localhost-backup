.class final Lcom/facebook/j0/e$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/j0/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/facebook/j0/e$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/j0/e$d;

    invoke-direct {v0}, Lcom/facebook/j0/e$d;-><init>()V

    sput-object v0, Lcom/facebook/j0/e$d;->a:Lcom/facebook/j0/e$d;

    return-void
.end method

.method constructor <init>()V
    .locals 0

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
    sget-object v0, Lcom/facebook/j0/e;->g:Lcom/facebook/j0/e;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/j0/e;->g(Lcom/facebook/j0/e;Ljava/util/concurrent/ScheduledFuture;)V

    sget-object v0, Lcom/facebook/j0/g;->b:Lcom/facebook/j0/g$a;

    invoke-virtual {v0}, Lcom/facebook/j0/g$a;->c()Lcom/facebook/j0/g$b;

    move-result-object v0

    sget-object v1, Lcom/facebook/j0/g$b;->b:Lcom/facebook/j0/g$b;

    if-eq v0, v1, :cond_1

    sget-object v0, Lcom/facebook/j0/j;->b:Lcom/facebook/j0/j;

    invoke-static {v0}, Lcom/facebook/j0/e;->l(Lcom/facebook/j0/j;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0, p0}, Lcom/facebook/internal/m0/i/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method
