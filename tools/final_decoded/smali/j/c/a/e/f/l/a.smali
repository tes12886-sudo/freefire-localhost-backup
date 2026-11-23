.class public Lj/c/a/e/f/l/a;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:I

.field private c:I

.field private d:Ljava/net/Socket;

.field private e:Ljava/io/InputStream;

.field private f:Ljava/io/OutputStream;

.field private g:I

.field private h:Z

.field private i:Lj/c/a/e/f/l/c;


# direct methods
.method public constructor <init>(Ljava/lang/String;II)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lj/c/a/e/f/l/a;->g:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lj/c/a/e/f/l/a;->h:Z

    iput-object p1, p0, Lj/c/a/e/f/l/a;->a:Ljava/lang/String;

    iput p2, p0, Lj/c/a/e/f/l/a;->b:I

    iput p3, p0, Lj/c/a/e/f/l/a;->g:I

    return-void
.end method

.method private b(Ljava/io/Closeable;)V
    .locals 0

    if-eqz p1, :cond_0

    :try_start_0
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method private c(Ljava/net/Socket;)V
    .locals 0

    if-eqz p1, :cond_0

    :try_start_0
    invoke-virtual {p1}, Ljava/net/Socket;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method private n(I)V
    .locals 0

    iput p1, p0, Lj/c/a/e/f/l/a;->c:I

    return-void
.end method

.method private p()V
    .locals 1

    iget-object v0, p0, Lj/c/a/e/f/l/a;->i:Lj/c/a/e/f/l/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lj/c/a/e/f/l/c;->f()V

    :cond_0
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 1

    iget-object v0, p0, Lj/c/a/e/f/l/a;->d:Ljava/net/Socket;

    invoke-direct {p0, v0}, Lj/c/a/e/f/l/a;->c(Ljava/net/Socket;)V

    iget-object v0, p0, Lj/c/a/e/f/l/a;->e:Ljava/io/InputStream;

    invoke-direct {p0, v0}, Lj/c/a/e/f/l/a;->b(Ljava/io/Closeable;)V

    iget-object v0, p0, Lj/c/a/e/f/l/a;->f:Ljava/io/OutputStream;

    invoke-direct {p0, v0}, Lj/c/a/e/f/l/a;->b(Ljava/io/Closeable;)V

    return-void
.end method

.method public d()V
    .locals 3

    invoke-virtual {p0}, Lj/c/a/e/f/l/a;->e()V

    :try_start_0
    new-instance v0, Ljava/net/Socket;

    iget-object v1, p0, Lj/c/a/e/f/l/a;->a:Ljava/lang/String;

    iget v2, p0, Lj/c/a/e/f/l/a;->b:I

    invoke-direct {v0, v1, v2}, Ljava/net/Socket;-><init>(Ljava/lang/String;I)V

    iput-object v0, p0, Lj/c/a/e/f/l/a;->d:Ljava/net/Socket;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/net/Socket;->setTcpNoDelay(Z)V

    iget-object v0, p0, Lj/c/a/e/f/l/a;->d:Ljava/net/Socket;

    invoke-virtual {v0, v1}, Ljava/net/Socket;->setKeepAlive(Z)V

    iget-object v0, p0, Lj/c/a/e/f/l/a;->d:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    iput-object v0, p0, Lj/c/a/e/f/l/a;->e:Ljava/io/InputStream;

    iget-object v0, p0, Lj/c/a/e/f/l/a;->d:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    iput-object v0, p0, Lj/c/a/e/f/l/a;->f:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lj/c/a/e/f/l/a;->n(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-static {v0}, Lj/c/a/e/l/b;->b(Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lj/c/a/e/f/l/a;->e()V

    new-instance v1, Lj/c/a/e/f/k/d;

    invoke-direct {v1, v0}, Lj/c/a/e/f/k/d;-><init>(Ljava/lang/Exception;)V

    throw v1
.end method

.method public e()V
    .locals 1

    invoke-direct {p0}, Lj/c/a/e/f/l/a;->p()V

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lj/c/a/e/f/l/a;->n(I)V

    invoke-virtual {p0}, Lj/c/a/e/f/l/a;->a()V

    return-void
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lj/c/a/e/f/l/a;->g:I

    return v0
.end method

.method public g()Ljava/io/InputStream;
    .locals 1

    iget-object v0, p0, Lj/c/a/e/f/l/a;->e:Ljava/io/InputStream;

    return-object v0
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Lj/c/a/e/f/l/a;->h:Z

    return v0
.end method

.method public declared-synchronized i()Lj/c/a/e/f/l/c;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lj/c/a/e/f/l/a;->i:Lj/c/a/e/f/l/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public j()Z
    .locals 2

    iget v0, p0, Lj/c/a/e/f/l/a;->c:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public k([B)V
    .locals 2

    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lj/c/a/e/f/l/a;->l([BII)V

    return-void
.end method

.method public l([BII)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lj/c/a/e/f/l/a;->f:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    iget-object p1, p0, Lj/c/a/e/f/l/a;->f:Ljava/io/OutputStream;

    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-static {p1}, Lj/c/a/e/l/b;->b(Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lj/c/a/e/f/l/a;->e()V

    new-instance p2, Lj/c/a/e/f/k/b;

    invoke-direct {p2, p1}, Lj/c/a/e/f/k/b;-><init>(Ljava/lang/Exception;)V

    throw p2
.end method

.method public m(Z)V
    .locals 0

    iput-boolean p1, p0, Lj/c/a/e/f/l/a;->h:Z

    return-void
.end method

.method public declared-synchronized o(Lj/c/a/e/f/l/c;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lj/c/a/e/f/l/a;->p()V

    iput-object p1, p0, Lj/c/a/e/f/l/a;->i:Lj/c/a/e/f/l/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
