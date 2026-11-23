.class public final Lcom/facebook/h0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:J

.field private b:J

.field private c:J

.field private d:J

.field private final e:Landroid/os/Handler;

.field private final f:Lcom/facebook/u;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lcom/facebook/u;)V
    .locals 1

    const-string v0, "request"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/h0;->e:Landroid/os/Handler;

    iput-object p2, p0, Lcom/facebook/h0;->f:Lcom/facebook/u;

    invoke-static {}, Lcom/facebook/r;->t()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/facebook/h0;->a:J

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 4

    iget-wide v0, p0, Lcom/facebook/h0;->b:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lcom/facebook/h0;->b:J

    iget-wide p1, p0, Lcom/facebook/h0;->c:J

    iget-wide v2, p0, Lcom/facebook/h0;->a:J

    add-long/2addr p1, v2

    cmp-long v2, v0, p1

    if-gez v2, :cond_0

    iget-wide p1, p0, Lcom/facebook/h0;->d:J

    cmp-long v2, v0, p1

    if-ltz v2, :cond_1

    :cond_0
    invoke-virtual {p0}, Lcom/facebook/h0;->c()V

    :cond_1
    return-void
.end method

.method public final b(J)V
    .locals 2

    iget-wide v0, p0, Lcom/facebook/h0;->d:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lcom/facebook/h0;->d:J

    return-void
.end method

.method public final c()V
    .locals 8

    iget-wide v0, p0, Lcom/facebook/h0;->b:J

    iget-wide v2, p0, Lcom/facebook/h0;->c:J

    cmp-long v4, v0, v2

    if-lez v4, :cond_1

    iget-object v0, p0, Lcom/facebook/h0;->f:Lcom/facebook/u;

    invoke-virtual {v0}, Lcom/facebook/u;->m()Lcom/facebook/u$b;

    move-result-object v2

    iget-wide v5, p0, Lcom/facebook/h0;->d:J

    const-wide/16 v0, 0x0

    cmp-long v3, v5, v0

    if-lez v3, :cond_1

    instance-of v0, v2, Lcom/facebook/u$f;

    if-eqz v0, :cond_1

    iget-wide v3, p0, Lcom/facebook/h0;->b:J

    iget-object v0, p0, Lcom/facebook/h0;->e:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v7, Lcom/facebook/h0$a;

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lcom/facebook/h0$a;-><init>(Lcom/facebook/u$b;JJ)V

    invoke-virtual {v0, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    check-cast v2, Lcom/facebook/u$f;

    invoke-interface {v2, v3, v4, v5, v6}, Lcom/facebook/u$f;->a(JJ)V

    :goto_0
    iget-wide v0, p0, Lcom/facebook/h0;->b:J

    iput-wide v0, p0, Lcom/facebook/h0;->c:J

    :cond_1
    return-void
.end method
