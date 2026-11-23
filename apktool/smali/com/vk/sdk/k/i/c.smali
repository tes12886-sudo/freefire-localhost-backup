.class public Lcom/vk/sdk/k/i/c;
.super Lcom/vk/sdk/k/i/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ResponseType:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/vk/sdk/k/i/a;"
    }
.end annotation


# instance fields
.field private final e:Lcom/vk/sdk/k/i/b$d;

.field protected f:Ljava/lang/Exception;

.field public g:Lcom/vk/sdk/k/i/b$f;

.field private h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/vk/sdk/k/i/b$d;)V
    .locals 0

    invoke-direct {p0}, Lcom/vk/sdk/k/i/a;-><init>()V

    iput-object p1, p0, Lcom/vk/sdk/k/i/c;->e:Lcom/vk/sdk/k/i/b$d;

    return-void
.end method


# virtual methods
.method public b()V
    .locals 0

    invoke-static {p0}, Lcom/vk/sdk/k/i/b;->b(Lcom/vk/sdk/k/i/c;)V

    invoke-super {p0}, Lcom/vk/sdk/k/i/a;->b()V

    return-void
.end method

.method public c()V
    .locals 0

    invoke-virtual {p0}, Lcom/vk/sdk/k/i/c;->n()Z

    invoke-super {p0}, Lcom/vk/sdk/k/i/a;->c()V

    return-void
.end method

.method public g(Ljava/util/concurrent/ExecutorService;)V
    .locals 1

    invoke-super {p0, p1}, Lcom/vk/sdk/k/i/a;->g(Ljava/util/concurrent/ExecutorService;)V

    sget-object p1, Lcom/vk/sdk/k/i/a$e;->c:Lcom/vk/sdk/k/i/a$e;

    invoke-virtual {p0, p1}, Lcom/vk/sdk/k/i/a;->f(Lcom/vk/sdk/k/i/a$e;)V

    :try_start_0
    iget-object p1, p0, Lcom/vk/sdk/k/i/c;->e:Lcom/vk/sdk/k/i/b$d;

    iget-boolean v0, p1, Lcom/vk/sdk/k/i/b$d;->f:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {p1}, Lcom/vk/sdk/k/i/b;->d(Lcom/vk/sdk/k/i/b$d;)Lcom/vk/sdk/k/i/b$f;

    move-result-object p1

    iput-object p1, p0, Lcom/vk/sdk/k/i/c;->g:Lcom/vk/sdk/k/i/b$f;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iput-object p1, p0, Lcom/vk/sdk/k/i/c;->f:Ljava/lang/Exception;

    :goto_0
    sget-object p1, Lcom/vk/sdk/k/i/a$e;->e:Lcom/vk/sdk/k/i/a$e;

    invoke-virtual {p0, p1}, Lcom/vk/sdk/k/i/a;->f(Lcom/vk/sdk/k/i/a$e;)V

    return-void
.end method

.method protected i(Ljava/lang/Exception;)Lcom/vk/sdk/k/c;
    .locals 2

    invoke-virtual {p0}, Lcom/vk/sdk/k/i/a;->h()Lcom/vk/sdk/k/i/a$e;

    move-result-object v0

    sget-object v1, Lcom/vk/sdk/k/i/a$e;->f:Lcom/vk/sdk/k/i/a$e;

    if-ne v0, v1, :cond_0

    new-instance v0, Lcom/vk/sdk/k/c;

    const/16 v1, -0x66

    invoke-direct {v0, v1}, Lcom/vk/sdk/k/c;-><init>(I)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/vk/sdk/k/c;

    const/16 v1, -0x69

    invoke-direct {v0, v1}, Lcom/vk/sdk/k/c;-><init>(I)V

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/vk/sdk/k/c;->f:Ljava/lang/String;

    if-nez v1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/vk/sdk/k/c;->f:Ljava/lang/String;

    :cond_1
    return-object v0
.end method

.method public j()[B
    .locals 1

    iget-object v0, p0, Lcom/vk/sdk/k/i/c;->g:Lcom/vk/sdk/k/i/b$f;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/vk/sdk/k/i/b$f;->d:[B

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public k()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/vk/sdk/k/i/c;->g:Lcom/vk/sdk/k/i/b$f;

    if-eqz v0, :cond_2

    iget-object v0, v0, Lcom/vk/sdk/k/i/b$f;->d:[B

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/vk/sdk/k/i/c;->h:Ljava/lang/String;

    if-nez v0, :cond_1

    :try_start_0
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/vk/sdk/k/i/c;->g:Lcom/vk/sdk/k/i/b$f;

    iget-object v1, v1, Lcom/vk/sdk/k/i/b$f;->d:[B

    const-string v2, "UTF-8"

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    iput-object v0, p0, Lcom/vk/sdk/k/i/c;->h:Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iput-object v0, p0, Lcom/vk/sdk/k/i/c;->f:Ljava/lang/Exception;

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/vk/sdk/k/i/c;->h:Ljava/lang/String;

    return-object v0

    :cond_2
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public l()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TResponseType;"
        }
    .end annotation

    iget-object v0, p0, Lcom/vk/sdk/k/i/c;->g:Lcom/vk/sdk/k/i/b$f;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/vk/sdk/k/i/b$f;->d:[B

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public m()Lcom/vk/sdk/k/i/b$d;
    .locals 1

    iget-object v0, p0, Lcom/vk/sdk/k/i/c;->e:Lcom/vk/sdk/k/i/b$d;

    return-object v0
.end method

.method protected n()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public o(Lcom/vk/sdk/k/i/a$c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<OperationType:",
            "Lcom/vk/sdk/k/i/c;",
            ">(",
            "Lcom/vk/sdk/k/i/a$c<",
            "TOperationType;TResponseType;>;)V"
        }
    .end annotation

    new-instance v0, Lcom/vk/sdk/k/i/c$a;

    invoke-direct {v0, p0, p1}, Lcom/vk/sdk/k/i/c$a;-><init>(Lcom/vk/sdk/k/i/c;Lcom/vk/sdk/k/i/a$c;)V

    invoke-virtual {p0, v0}, Lcom/vk/sdk/k/i/a;->e(Lcom/vk/sdk/k/i/a$d;)V

    return-void
.end method
