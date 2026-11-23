.class public final Lcom/facebook/f0;
.super Ljava/io/FilterOutputStream;
.source ""

# interfaces
.implements Lcom/facebook/g0;


# instance fields
.field private final a:J

.field private b:J

.field private c:J

.field private d:Lcom/facebook/h0;

.field private final e:Lcom/facebook/w;

.field private final f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/facebook/u;",
            "Lcom/facebook/h0;",
            ">;"
        }
    .end annotation
.end field

.field private final g:J


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;Lcom/facebook/w;Ljava/util/Map;J)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/OutputStream;",
            "Lcom/facebook/w;",
            "Ljava/util/Map<",
            "Lcom/facebook/u;",
            "Lcom/facebook/h0;",
            ">;J)V"
        }
    .end annotation

    const-string v0, "out"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requests"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "progressMap"

    invoke-static {p3, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    iput-object p2, p0, Lcom/facebook/f0;->e:Lcom/facebook/w;

    iput-object p3, p0, Lcom/facebook/f0;->f:Ljava/util/Map;

    iput-wide p4, p0, Lcom/facebook/f0;->g:J

    invoke-static {}, Lcom/facebook/r;->t()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/facebook/f0;->a:J

    return-void
.end method

.method public static final synthetic c(Lcom/facebook/f0;)Lcom/facebook/w;
    .locals 0

    iget-object p0, p0, Lcom/facebook/f0;->e:Lcom/facebook/w;

    return-object p0
.end method

.method private final f(J)V
    .locals 4

    iget-object v0, p0, Lcom/facebook/f0;->d:Lcom/facebook/h0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lcom/facebook/h0;->a(J)V

    :cond_0
    iget-wide v0, p0, Lcom/facebook/f0;->b:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lcom/facebook/f0;->b:J

    iget-wide p1, p0, Lcom/facebook/f0;->c:J

    iget-wide v2, p0, Lcom/facebook/f0;->a:J

    add-long/2addr p1, v2

    cmp-long v2, v0, p1

    if-gez v2, :cond_1

    iget-wide p1, p0, Lcom/facebook/f0;->g:J

    cmp-long v2, v0, p1

    if-ltz v2, :cond_2

    :cond_1
    invoke-direct {p0}, Lcom/facebook/f0;->u()V

    :cond_2
    return-void
.end method

.method private final u()V
    .locals 10

    iget-wide v0, p0, Lcom/facebook/f0;->b:J

    iget-wide v2, p0, Lcom/facebook/f0;->c:J

    cmp-long v4, v0, v2

    if-lez v4, :cond_3

    iget-object v0, p0, Lcom/facebook/f0;->e:Lcom/facebook/w;

    invoke-virtual {v0}, Lcom/facebook/w;->t()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/w$a;

    instance-of v2, v1, Lcom/facebook/w$b;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/facebook/f0;->e:Lcom/facebook/w;

    invoke-virtual {v2}, Lcom/facebook/w;->s()Landroid/os/Handler;

    move-result-object v2

    if-eqz v2, :cond_1

    new-instance v3, Lcom/facebook/f0$a;

    invoke-direct {v3, p0, v1}, Lcom/facebook/f0$a;-><init>(Lcom/facebook/f0;Lcom/facebook/w$a;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_1
    move-object v4, v1

    check-cast v4, Lcom/facebook/w$b;

    iget-object v5, p0, Lcom/facebook/f0;->e:Lcom/facebook/w;

    iget-wide v6, p0, Lcom/facebook/f0;->b:J

    iget-wide v8, p0, Lcom/facebook/f0;->g:J

    invoke-interface/range {v4 .. v9}, Lcom/facebook/w$b;->b(Lcom/facebook/w;JJ)V

    goto :goto_0

    :cond_2
    iget-wide v0, p0, Lcom/facebook/f0;->b:J

    iput-wide v0, p0, Lcom/facebook/f0;->c:J

    :cond_3
    return-void
.end method


# virtual methods
.method public b(Lcom/facebook/u;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/facebook/f0;->f:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/facebook/h0;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lcom/facebook/f0;->d:Lcom/facebook/h0;

    return-void
.end method

.method public close()V
    .locals 2

    invoke-super {p0}, Ljava/io/FilterOutputStream;->close()V

    iget-object v0, p0, Lcom/facebook/f0;->f:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/h0;

    invoke-virtual {v1}, Lcom/facebook/h0;->c()V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/facebook/f0;->u()V

    return-void
.end method

.method public final j()J
    .locals 2

    iget-wide v0, p0, Lcom/facebook/f0;->b:J

    return-wide v0
.end method

.method public final l()J
    .locals 2

    iget-wide v0, p0, Lcom/facebook/f0;->g:J

    return-wide v0
.end method

.method public write(I)V
    .locals 2

    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    const-wide/16 v0, 0x1

    invoke-direct {p0, v0, v1}, Lcom/facebook/f0;->f(J)V

    return-void
.end method

.method public write([B)V
    .locals 2

    const-string v0, "buffer"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V

    array-length p1, p1

    int-to-long v0, p1

    invoke-direct {p0, v0, v1}, Lcom/facebook/f0;->f(J)V

    return-void
.end method

.method public write([BII)V
    .locals 1

    const-string v0, "buffer"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    int-to-long p1, p3

    invoke-direct {p0, p1, p2}, Lcom/facebook/f0;->f(J)V

    return-void
.end method
