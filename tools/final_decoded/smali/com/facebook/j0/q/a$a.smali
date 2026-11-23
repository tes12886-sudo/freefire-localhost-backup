.class final Lcom/facebook/j0/q/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/j0/q/a;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/facebook/j0/q/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/j0/q/a$a;

    invoke-direct {v0}, Lcom/facebook/j0/q/a$a;-><init>()V

    sput-object v0, Lcom/facebook/j0/q/a$a;->a:Lcom/facebook/j0/q/a$a;

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
    invoke-static {}, Lcom/facebook/r;->f()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/facebook/internal/b;->h:Lcom/facebook/internal/b$a;

    invoke-virtual {v1, v0}, Lcom/facebook/internal/b$a;->h(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/facebook/j0/q/a;->c:Lcom/facebook/j0/q/a;

    invoke-static {v0}, Lcom/facebook/j0/q/a;->b(Lcom/facebook/j0/q/a;)V

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/facebook/j0/q/a;->a(Lcom/facebook/j0/q/a;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0, p0}, Lcom/facebook/internal/m0/i/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method
