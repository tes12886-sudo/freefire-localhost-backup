.class final Lcom/facebook/h0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/h0;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/u$b;

.field final synthetic b:J

.field final synthetic c:J


# direct methods
.method constructor <init>(Lcom/facebook/u$b;JJ)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/h0$a;->a:Lcom/facebook/u$b;

    iput-wide p2, p0, Lcom/facebook/h0$a;->b:J

    iput-wide p4, p0, Lcom/facebook/h0$a;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    invoke-static {p0}, Lcom/facebook/internal/m0/i/a;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/facebook/h0$a;->a:Lcom/facebook/u$b;

    check-cast v0, Lcom/facebook/u$f;

    iget-wide v1, p0, Lcom/facebook/h0$a;->b:J

    iget-wide v3, p0, Lcom/facebook/h0$a;->c:J

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/facebook/u$f;->a(JJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0, p0}, Lcom/facebook/internal/m0/i/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method
