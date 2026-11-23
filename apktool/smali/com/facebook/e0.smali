.class public final Lcom/facebook/e0;
.super Ljava/io/OutputStream;
.source ""

# interfaces
.implements Lcom/facebook/g0;


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/facebook/u;",
            "Lcom/facebook/h0;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lcom/facebook/u;

.field private c:Lcom/facebook/h0;

.field private d:I

.field private final e:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 0

    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    iput-object p1, p0, Lcom/facebook/e0;->e:Landroid/os/Handler;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/facebook/e0;->a:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public b(Lcom/facebook/u;)V
    .locals 1

    iput-object p1, p0, Lcom/facebook/e0;->b:Lcom/facebook/u;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/facebook/e0;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/facebook/h0;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lcom/facebook/e0;->c:Lcom/facebook/h0;

    return-void
.end method

.method public final c(J)V
    .locals 3

    iget-object v0, p0, Lcom/facebook/e0;->b:Lcom/facebook/u;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/facebook/e0;->c:Lcom/facebook/h0;

    if-nez v1, :cond_0

    new-instance v1, Lcom/facebook/h0;

    iget-object v2, p0, Lcom/facebook/e0;->e:Landroid/os/Handler;

    invoke-direct {v1, v2, v0}, Lcom/facebook/h0;-><init>(Landroid/os/Handler;Lcom/facebook/u;)V

    iput-object v1, p0, Lcom/facebook/e0;->c:Lcom/facebook/h0;

    iget-object v2, p0, Lcom/facebook/e0;->a:Ljava/util/Map;

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, Lcom/facebook/e0;->c:Lcom/facebook/h0;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p2}, Lcom/facebook/h0;->b(J)V

    :cond_1
    iget v0, p0, Lcom/facebook/e0;->d:I

    long-to-int p2, p1

    add-int/2addr v0, p2

    iput v0, p0, Lcom/facebook/e0;->d:I

    :cond_2
    return-void
.end method

.method public final f()I
    .locals 1

    iget v0, p0, Lcom/facebook/e0;->d:I

    return v0
.end method

.method public final j()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lcom/facebook/u;",
            "Lcom/facebook/h0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/facebook/e0;->a:Ljava/util/Map;

    return-object v0
.end method

.method public write(I)V
    .locals 2

    const-wide/16 v0, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/facebook/e0;->c(J)V

    return-void
.end method

.method public write([B)V
    .locals 2

    const-string v0, "buffer"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    array-length p1, p1

    int-to-long v0, p1

    invoke-virtual {p0, v0, v1}, Lcom/facebook/e0;->c(J)V

    return-void
.end method

.method public write([BII)V
    .locals 0

    const-string p2, "buffer"

    invoke-static {p1, p2}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    int-to-long p1, p3

    invoke-virtual {p0, p1, p2}, Lcom/facebook/e0;->c(J)V

    return-void
.end method
