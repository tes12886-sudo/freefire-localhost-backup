.class final Lcom/facebook/j0/x/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/j0/x/a;->c(Ljava/lang/String;Lcom/facebook/j0/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/facebook/j0/c;


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/facebook/j0/c;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/j0/x/a$a;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/facebook/j0/x/a$a;->b:Lcom/facebook/j0/c;

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
    iget-object v0, p0, Lcom/facebook/j0/x/a$a;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/facebook/j0/x/a$a;->b:Lcom/facebook/j0/c;

    invoke-static {v1}, Ll/t/k;->b(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/j0/x/c;->c(Ljava/lang/String;Ljava/util/List;)Lcom/facebook/j0/x/c$c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0, p0}, Lcom/facebook/internal/m0/i/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method
