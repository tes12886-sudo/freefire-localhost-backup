.class final Lcom/facebook/j0/e$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/j0/e;->o()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/facebook/j0/e$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/j0/e$f;

    invoke-direct {v0}, Lcom/facebook/j0/e$f;-><init>()V

    sput-object v0, Lcom/facebook/j0/e$f;->a:Lcom/facebook/j0/e$f;

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

    invoke-static {v0}, Lcom/facebook/j0/e;->a(Lcom/facebook/j0/e;)Lcom/facebook/j0/d;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/j0/f;->b(Lcom/facebook/j0/d;)V

    new-instance v1, Lcom/facebook/j0/d;

    invoke-direct {v1}, Lcom/facebook/j0/d;-><init>()V

    invoke-static {v0, v1}, Lcom/facebook/j0/e;->f(Lcom/facebook/j0/e;Lcom/facebook/j0/d;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0, p0}, Lcom/facebook/internal/m0/i/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method
