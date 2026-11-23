.class final Lcom/facebook/f0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/f0;->u()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/f0;

.field final synthetic b:Lcom/facebook/w$a;


# direct methods
.method constructor <init>(Lcom/facebook/f0;Lcom/facebook/w$a;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/f0$a;->a:Lcom/facebook/f0;

    iput-object p2, p0, Lcom/facebook/f0$a;->b:Lcom/facebook/w$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    invoke-static {p0}, Lcom/facebook/internal/m0/i/a;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/facebook/f0$a;->b:Lcom/facebook/w$a;

    move-object v1, v0

    check-cast v1, Lcom/facebook/w$b;

    iget-object v0, p0, Lcom/facebook/f0$a;->a:Lcom/facebook/f0;

    invoke-static {v0}, Lcom/facebook/f0;->c(Lcom/facebook/f0;)Lcom/facebook/w;

    move-result-object v2

    iget-object v0, p0, Lcom/facebook/f0$a;->a:Lcom/facebook/f0;

    invoke-virtual {v0}, Lcom/facebook/f0;->j()J

    move-result-wide v3

    iget-object v0, p0, Lcom/facebook/f0$a;->a:Lcom/facebook/f0;

    invoke-virtual {v0}, Lcom/facebook/f0;->l()J

    move-result-wide v5

    invoke-interface/range {v1 .. v6}, Lcom/facebook/w$b;->b(Lcom/facebook/w;JJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0, p0}, Lcom/facebook/internal/m0/i/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method
