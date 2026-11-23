.class public final Lm/h0/h/f;
.super Lm/h0/k/f$c;
.source ""

# interfaces
.implements Lm/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm/h0/h/f$a;
    }
.end annotation


# instance fields
.field private final b:Lm/f0;

.field private c:Ljava/net/Socket;

.field private d:Ljava/net/Socket;

.field private e:Lm/t;

.field private f:Lm/a0;

.field private g:Lm/h0/k/f;

.field private h:Ln/d;

.field private i:Ln/c;

.field private j:Z

.field private k:Z

.field private l:I

.field private m:I

.field private n:I

.field private o:I

.field private final p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/ref/Reference<",
            "Lm/h0/h/e;",
            ">;>;"
        }
    .end annotation
.end field

.field private q:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lm/h0/h/g;Lm/f0;)V
    .locals 1

    const-string v0, "connectionPool"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "route"

    invoke-static {p2, p1}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lm/h0/k/f$c;-><init>()V

    iput-object p2, p0, Lm/h0/h/f;->b:Lm/f0;

    const/4 p1, 0x1

    iput p1, p0, Lm/h0/h/f;->o:I

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lm/h0/h/f;->p:Ljava/util/List;

    const-wide p1, 0x7fffffffffffffffL

    iput-wide p1, p0, Lm/h0/h/f;->q:J

    return-void
.end method

.method private final B(Ljava/util/List;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lm/f0;",
            ">;)Z"
        }
    .end annotation

    instance-of v0, p1, Ljava/util/Collection;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm/f0;

    invoke-virtual {v0}, Lm/f0;->b()Ljava/net/Proxy;

    move-result-object v3

    invoke-virtual {v3}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v3

    sget-object v4, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-ne v3, v4, :cond_3

    iget-object v3, p0, Lm/h0/h/f;->b:Lm/f0;

    invoke-virtual {v3}, Lm/f0;->b()Ljava/net/Proxy;

    move-result-object v3

    invoke-virtual {v3}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v3

    sget-object v4, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-ne v3, v4, :cond_3

    iget-object v3, p0, Lm/h0/h/f;->b:Lm/f0;

    invoke-virtual {v3}, Lm/f0;->d()Ljava/net/InetSocketAddress;

    move-result-object v3

    invoke-virtual {v0}, Lm/f0;->d()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-static {v3, v0}, Ll/y/c/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    :goto_1
    return v1
.end method

.method private final F(I)V
    .locals 7

    iget-object v0, p0, Lm/h0/h/f;->d:Ljava/net/Socket;

    invoke-static {v0}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    iget-object v1, p0, Lm/h0/h/f;->h:Ln/d;

    invoke-static {v1}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    iget-object v2, p0, Lm/h0/h/f;->i:Ln/c;

    invoke-static {v2}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Ljava/net/Socket;->setSoTimeout(I)V

    new-instance v4, Lm/h0/k/f$a;

    sget-object v5, Lm/h0/g/e;->i:Lm/h0/g/e;

    const/4 v6, 0x1

    invoke-direct {v4, v6, v5}, Lm/h0/k/f$a;-><init>(ZLm/h0/g/e;)V

    iget-object v5, p0, Lm/h0/h/f;->b:Lm/f0;

    invoke-virtual {v5}, Lm/f0;->a()Lm/a;

    move-result-object v5

    invoke-virtual {v5}, Lm/a;->l()Lm/v;

    move-result-object v5

    invoke-virtual {v5}, Lm/v;->i()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v0, v5, v1, v2}, Lm/h0/k/f$a;->s(Ljava/net/Socket;Ljava/lang/String;Ln/d;Ln/c;)Lm/h0/k/f$a;

    invoke-virtual {v4, p0}, Lm/h0/k/f$a;->k(Lm/h0/k/f$c;)Lm/h0/k/f$a;

    invoke-virtual {v4, p1}, Lm/h0/k/f$a;->l(I)Lm/h0/k/f$a;

    invoke-virtual {v4}, Lm/h0/k/f$a;->a()Lm/h0/k/f;

    move-result-object p1

    iput-object p1, p0, Lm/h0/h/f;->g:Lm/h0/k/f;

    sget-object v0, Lm/h0/k/f;->L:Lm/h0/k/f$b;

    invoke-virtual {v0}, Lm/h0/k/f$b;->a()Lm/h0/k/m;

    move-result-object v0

    invoke-virtual {v0}, Lm/h0/k/m;->d()I

    move-result v0

    iput v0, p0, Lm/h0/h/f;->o:I

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-static {p1, v3, v0, v1, v0}, Lm/h0/k/f;->K0(Lm/h0/k/f;ZLm/h0/g/e;ILjava/lang/Object;)V

    return-void
.end method

.method private final G(Lm/v;)Z
    .locals 4

    sget-boolean v0, Lm/h0/d;->g:Z

    if-eqz v0, :cond_1

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Thread "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " MUST hold lock on "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Lm/h0/h/f;->b:Lm/f0;

    invoke-virtual {v0}, Lm/f0;->a()Lm/a;

    move-result-object v0

    invoke-virtual {v0}, Lm/a;->l()Lm/v;

    move-result-object v0

    invoke-virtual {p1}, Lm/v;->n()I

    move-result v1

    invoke-virtual {v0}, Lm/v;->n()I

    move-result v2

    const/4 v3, 0x0

    if-eq v1, v2, :cond_2

    return v3

    :cond_2
    invoke-virtual {p1}, Lm/v;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lm/v;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ll/y/c/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    return v1

    :cond_3
    iget-boolean v0, p0, Lm/h0/h/f;->k:Z

    if-nez v0, :cond_4

    iget-object v0, p0, Lm/h0/h/f;->e:Lm/t;

    if-eqz v0, :cond_4

    invoke-static {v0}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    invoke-direct {p0, p1, v0}, Lm/h0/h/f;->f(Lm/v;Lm/t;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 v3, 0x1

    :cond_4
    return v3
.end method

.method public static final synthetic d(Lm/h0/h/f;)Lm/t;
    .locals 0

    iget-object p0, p0, Lm/h0/h/f;->e:Lm/t;

    return-object p0
.end method

.method private final f(Lm/v;Lm/t;)Z
    .locals 3

    invoke-virtual {p2}, Lm/t;->d()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    sget-object v0, Lm/h0/n/d;->a:Lm/h0/n/d;

    invoke-virtual {p1}, Lm/v;->i()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/security/cert/X509Certificate;

    invoke-virtual {v0, p1, p2}, Lm/h0/n/d;->e(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method private final i(IILm/e;Lm/r;)V
    .locals 4

    iget-object v0, p0, Lm/h0/h/f;->b:Lm/f0;

    invoke-virtual {v0}, Lm/f0;->b()Ljava/net/Proxy;

    move-result-object v0

    iget-object v1, p0, Lm/h0/h/f;->b:Lm/f0;

    invoke-virtual {v1}, Lm/f0;->a()Lm/a;

    move-result-object v1

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v2

    if-nez v2, :cond_0

    const/4 v2, -0x1

    goto :goto_0

    :cond_0
    sget-object v3, Lm/h0/h/f$a;->a:[I

    invoke-virtual {v2}, Ljava/net/Proxy$Type;->ordinal()I

    move-result v2

    aget v2, v3, v2

    :goto_0
    const/4 v3, 0x1

    if-eq v2, v3, :cond_1

    const/4 v3, 0x2

    if-eq v2, v3, :cond_1

    new-instance v1, Ljava/net/Socket;

    invoke-direct {v1, v0}, Ljava/net/Socket;-><init>(Ljava/net/Proxy;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lm/a;->j()Ljavax/net/SocketFactory;

    move-result-object v1

    invoke-virtual {v1}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    move-result-object v1

    invoke-static {v1}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    :goto_1
    iput-object v1, p0, Lm/h0/h/f;->c:Ljava/net/Socket;

    iget-object v2, p0, Lm/h0/h/f;->b:Lm/f0;

    invoke-virtual {v2}, Lm/f0;->d()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-virtual {p4, p3, v2, v0}, Lm/r;->j(Lm/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V

    invoke-virtual {v1, p2}, Ljava/net/Socket;->setSoTimeout(I)V

    :try_start_0
    sget-object p2, Lm/h0/l/h;->a:Lm/h0/l/h$a;

    invoke-virtual {p2}, Lm/h0/l/h$a;->g()Lm/h0/l/h;

    move-result-object p2

    iget-object p3, p0, Lm/h0/h/f;->b:Lm/f0;

    invoke-virtual {p3}, Lm/f0;->d()Ljava/net/InetSocketAddress;

    move-result-object p3

    invoke-virtual {p2, v1, p3, p1}, Lm/h0/l/h;->f(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V
    :try_end_0
    .catch Ljava/net/ConnectException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-static {v1}, Ln/l;->f(Ljava/net/Socket;)Ln/x;

    move-result-object p1

    invoke-static {p1}, Ln/l;->b(Ln/x;)Ln/d;

    move-result-object p1

    iput-object p1, p0, Lm/h0/h/f;->h:Ln/d;

    invoke-static {v1}, Ln/l;->d(Ljava/net/Socket;)Ln/v;

    move-result-object p1

    invoke-static {p1}, Ln/l;->a(Ln/v;)Ln/c;

    move-result-object p1

    iput-object p1, p0, Lm/h0/h/f;->i:Ln/c;
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/NullPointerException;->getMessage()Ljava/lang/String;

    move-result-object p2

    const-string p3, "throw with null exception"

    invoke-static {p2, p3}, Ll/y/c/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    :goto_2
    return-void

    :cond_2
    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    move-exception p1

    new-instance p2, Ljava/net/ConnectException;

    iget-object p3, p0, Lm/h0/h/f;->b:Lm/f0;

    invoke-virtual {p3}, Lm/f0;->d()Ljava/net/InetSocketAddress;

    move-result-object p3

    const-string p4, "Failed to connect to "

    invoke-static {p4, p3}, Ll/y/c/i;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3}, Ljava/net/ConnectException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/net/ConnectException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw p2
.end method

.method private final j(Lm/h0/h/b;)V
    .locals 10

    iget-object v0, p0, Lm/h0/h/f;->b:Lm/f0;

    invoke-virtual {v0}, Lm/f0;->a()Lm/a;

    move-result-object v0

    invoke-virtual {v0}, Lm/a;->k()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v1

    const/4 v2, 0x0

    :try_start_0
    invoke-static {v1}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    iget-object v3, p0, Lm/h0/h/f;->c:Ljava/net/Socket;

    invoke-virtual {v0}, Lm/a;->l()Lm/v;

    move-result-object v4

    invoke-virtual {v4}, Lm/v;->i()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lm/a;->l()Lm/v;

    move-result-object v5

    invoke-virtual {v5}, Lm/v;->n()I

    move-result v5

    const/4 v6, 0x1

    invoke-virtual {v1, v3, v4, v5, v6}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    move-result-object v1

    if-eqz v1, :cond_5

    check-cast v1, Ljavax/net/ssl/SSLSocket;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {p1, v1}, Lm/h0/h/b;->a(Ljavax/net/ssl/SSLSocket;)Lm/l;

    move-result-object p1

    invoke-virtual {p1}, Lm/l;->h()Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v3, Lm/h0/l/h;->a:Lm/h0/l/h$a;

    invoke-virtual {v3}, Lm/h0/l/h$a;->g()Lm/h0/l/h;

    move-result-object v3

    invoke-virtual {v0}, Lm/a;->l()Lm/v;

    move-result-object v4

    invoke-virtual {v4}, Lm/v;->i()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lm/a;->f()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v3, v1, v4, v5}, Lm/h0/l/h;->e(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V

    :cond_0
    invoke-virtual {v1}, Ljavax/net/ssl/SSLSocket;->startHandshake()V

    invoke-virtual {v1}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    move-result-object v3

    sget-object v4, Lm/t;->e:Lm/t$a;

    const-string v5, "sslSocketSession"

    invoke-static {v3, v5}, Ll/y/c/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Lm/t$a;->a(Ljavax/net/ssl/SSLSession;)Lm/t;

    move-result-object v4

    invoke-virtual {v0}, Lm/a;->e()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v5

    invoke-static {v5}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm/a;->l()Lm/v;

    move-result-object v7

    invoke-virtual {v7}, Lm/v;->i()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v5, v7, v3}, Ljavax/net/ssl/HostnameVerifier;->verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {v4}, Lm/t;->d()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    xor-int/2addr v3, v6

    if-eqz v3, :cond_1

    const/4 v3, 0x0

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/security/cert/X509Certificate;

    new-instance v3, Ljavax/net/ssl/SSLPeerUnverifiedException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\n              |Hostname "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lm/a;->l()Lm/v;

    move-result-object v0

    invoke-virtual {v0}, Lm/v;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " not verified:\n              |    certificate: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Lm/g;->c:Lm/g$b;

    invoke-virtual {v0, p1}, Lm/g$b;->a(Ljava/security/cert/Certificate;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n              |    DN: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object v0

    invoke-interface {v0}, Ljava/security/Principal;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "\n              |    subjectAltNames: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Lm/h0/n/d;->a:Lm/h0/n/d;

    invoke-virtual {v0, p1}, Lm/h0/n/d;->a(Ljava/security/cert/X509Certificate;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\n              "

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2, v6, v2}, Ll/d0/g;->e(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v3, p1}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw v3

    :cond_1
    new-instance p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Hostname "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lm/a;->l()Lm/v;

    move-result-object v0

    invoke-virtual {v0}, Lm/v;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " not verified (no certificates)"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-virtual {v0}, Lm/a;->a()Lm/g;

    move-result-object v3

    invoke-static {v3}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    new-instance v5, Lm/t;

    invoke-virtual {v4}, Lm/t;->e()Lm/g0;

    move-result-object v6

    invoke-virtual {v4}, Lm/t;->a()Lm/i;

    move-result-object v7

    invoke-virtual {v4}, Lm/t;->c()Ljava/util/List;

    move-result-object v8

    new-instance v9, Lm/h0/h/f$b;

    invoke-direct {v9, v3, v4, v0}, Lm/h0/h/f$b;-><init>(Lm/g;Lm/t;Lm/a;)V

    invoke-direct {v5, v6, v7, v8, v9}, Lm/t;-><init>(Lm/g0;Lm/i;Ljava/util/List;Ll/y/b/a;)V

    iput-object v5, p0, Lm/h0/h/f;->e:Lm/t;

    invoke-virtual {v0}, Lm/a;->l()Lm/v;

    move-result-object v0

    invoke-virtual {v0}, Lm/v;->i()Ljava/lang/String;

    move-result-object v0

    new-instance v4, Lm/h0/h/f$c;

    invoke-direct {v4, p0}, Lm/h0/h/f$c;-><init>(Lm/h0/h/f;)V

    invoke-virtual {v3, v0, v4}, Lm/g;->b(Ljava/lang/String;Ll/y/b/a;)V

    invoke-virtual {p1}, Lm/l;->h()Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Lm/h0/l/h;->a:Lm/h0/l/h$a;

    invoke-virtual {p1}, Lm/h0/l/h$a;->g()Lm/h0/l/h;

    move-result-object p1

    invoke-virtual {p1, v1}, Lm/h0/l/h;->g(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    move-result-object v2

    :cond_3
    iput-object v1, p0, Lm/h0/h/f;->d:Ljava/net/Socket;

    invoke-static {v1}, Ln/l;->f(Ljava/net/Socket;)Ln/x;

    move-result-object p1

    invoke-static {p1}, Ln/l;->b(Ln/x;)Ln/d;

    move-result-object p1

    iput-object p1, p0, Lm/h0/h/f;->h:Ln/d;

    invoke-static {v1}, Ln/l;->d(Ljava/net/Socket;)Ln/v;

    move-result-object p1

    invoke-static {p1}, Ln/l;->a(Ln/v;)Ln/c;

    move-result-object p1

    iput-object p1, p0, Lm/h0/h/f;->i:Ln/c;

    if-eqz v2, :cond_4

    sget-object p1, Lm/a0;->b:Lm/a0$a;

    invoke-virtual {p1, v2}, Lm/a0$a;->a(Ljava/lang/String;)Lm/a0;

    move-result-object p1

    goto :goto_0

    :cond_4
    sget-object p1, Lm/a0;->d:Lm/a0;

    :goto_0
    iput-object p1, p0, Lm/h0/h/f;->f:Lm/a0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sget-object p1, Lm/h0/l/h;->a:Lm/h0/l/h$a;

    invoke-virtual {p1}, Lm/h0/l/h$a;->g()Lm/h0/l/h;

    move-result-object p1

    invoke-virtual {p1, v1}, Lm/h0/l/h;->b(Ljavax/net/ssl/SSLSocket;)V

    return-void

    :catchall_0
    move-exception p1

    move-object v2, v1

    goto :goto_1

    :cond_5
    :try_start_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type javax.net.ssl.SSLSocket"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception p1

    :goto_1
    if-eqz v2, :cond_6

    sget-object v0, Lm/h0/l/h;->a:Lm/h0/l/h$a;

    invoke-virtual {v0}, Lm/h0/l/h$a;->g()Lm/h0/l/h;

    move-result-object v0

    invoke-virtual {v0, v2}, Lm/h0/l/h;->b(Ljavax/net/ssl/SSLSocket;)V

    :cond_6
    if-nez v2, :cond_7

    goto :goto_2

    :cond_7
    invoke-static {v2}, Lm/h0/d;->k(Ljava/net/Socket;)V

    :goto_2
    throw p1
.end method

.method private final k(IIILm/e;Lm/r;)V
    .locals 6

    invoke-direct {p0}, Lm/h0/h/f;->m()Lm/b0;

    move-result-object v0

    invoke-virtual {v0}, Lm/b0;->j()Lm/v;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x15

    if-ge v2, v3, :cond_2

    add-int/lit8 v2, v2, 0x1

    invoke-direct {p0, p1, p2, p4, p5}, Lm/h0/h/f;->i(IILm/e;Lm/r;)V

    invoke-direct {p0, p2, p3, v0, v1}, Lm/h0/h/f;->l(IILm/b0;Lm/v;)Lm/b0;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    iget-object v3, p0, Lm/h0/h/f;->c:Ljava/net/Socket;

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v3}, Lm/h0/d;->k(Ljava/net/Socket;)V

    :goto_1
    const/4 v3, 0x0

    iput-object v3, p0, Lm/h0/h/f;->c:Ljava/net/Socket;

    iput-object v3, p0, Lm/h0/h/f;->i:Ln/c;

    iput-object v3, p0, Lm/h0/h/f;->h:Ln/d;

    iget-object v4, p0, Lm/h0/h/f;->b:Lm/f0;

    invoke-virtual {v4}, Lm/f0;->d()Ljava/net/InetSocketAddress;

    move-result-object v4

    iget-object v5, p0, Lm/h0/h/f;->b:Lm/f0;

    invoke-virtual {v5}, Lm/f0;->b()Ljava/net/Proxy;

    move-result-object v5

    invoke-virtual {p5, p4, v4, v5, v3}, Lm/r;->h(Lm/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lm/a0;)V

    goto :goto_0

    :cond_2
    :goto_2
    return-void
.end method

.method private final l(IILm/b0;Lm/v;)Lm/b0;
    .locals 9

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CONNECT "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x1

    invoke-static {p4, v1}, Lm/h0/d;->P(Lm/v;Z)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, " HTTP/1.1"

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    :goto_0
    iget-object v0, p0, Lm/h0/h/f;->h:Ln/d;

    invoke-static {v0}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    iget-object v2, p0, Lm/h0/h/f;->i:Ln/c;

    invoke-static {v2}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    new-instance v3, Lm/h0/j/b;

    const/4 v4, 0x0

    invoke-direct {v3, v4, p0, v0, v2}, Lm/h0/j/b;-><init>(Lm/z;Lm/h0/h/f;Ln/d;Ln/c;)V

    invoke-interface {v0}, Ln/x;->d()Ln/y;

    move-result-object v5

    int-to-long v6, p1

    sget-object v8, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v5, v6, v7, v8}, Ln/y;->g(JLjava/util/concurrent/TimeUnit;)Ln/y;

    invoke-interface {v2}, Ln/v;->d()Ln/y;

    move-result-object v5

    int-to-long v6, p2

    invoke-virtual {v5, v6, v7, v8}, Ln/y;->g(JLjava/util/concurrent/TimeUnit;)Ln/y;

    invoke-virtual {p3}, Lm/b0;->e()Lm/u;

    move-result-object v5

    invoke-virtual {v3, v5, p4}, Lm/h0/j/b;->A(Lm/u;Ljava/lang/String;)V

    invoke-virtual {v3}, Lm/h0/j/b;->a()V

    const/4 v5, 0x0

    invoke-virtual {v3, v5}, Lm/h0/j/b;->g(Z)Lm/d0$a;

    move-result-object v5

    invoke-static {v5}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    invoke-virtual {v5, p3}, Lm/d0$a;->s(Lm/b0;)Lm/d0$a;

    invoke-virtual {v5}, Lm/d0$a;->c()Lm/d0;

    move-result-object p3

    invoke-virtual {v3, p3}, Lm/h0/j/b;->z(Lm/d0;)V

    invoke-virtual {p3}, Lm/d0;->l()I

    move-result v3

    const/16 v5, 0xc8

    if-eq v3, v5, :cond_3

    const/16 v0, 0x197

    if-ne v3, v0, :cond_2

    iget-object v0, p0, Lm/h0/h/f;->b:Lm/f0;

    invoke-virtual {v0}, Lm/f0;->a()Lm/a;

    move-result-object v0

    invoke-virtual {v0}, Lm/a;->h()Lm/b;

    move-result-object v0

    iget-object v2, p0, Lm/h0/h/f;->b:Lm/f0;

    invoke-interface {v0, v2, p3}, Lm/b;->a(Lm/f0;Lm/d0;)Lm/b0;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v2, 0x2

    const-string v3, "Connection"

    invoke-static {p3, v3, v4, v2, v4}, Lm/d0;->Q(Lm/d0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    const-string v2, "close"

    invoke-static {v2, p3, v1}, Ll/d0/g;->l(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p3

    if-eqz p3, :cond_0

    return-object v0

    :cond_0
    move-object p3, v0

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Failed to authenticate with proxy"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/io/IOException;

    invoke-virtual {p3}, Lm/d0;->l()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const-string p3, "Unexpected response code for CONNECT: "

    invoke-static {p3, p2}, Ll/y/c/i;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-interface {v0}, Ln/d;->a()Ln/b;

    move-result-object p1

    invoke-virtual {p1}, Ln/b;->z()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-interface {v2}, Ln/c;->a()Ln/b;

    move-result-object p1

    invoke-virtual {p1}, Ln/b;->z()Z

    move-result p1

    if-eqz p1, :cond_4

    return-object v4

    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string p2, "TLS tunnel buffered too many bytes!"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method private final m()Lm/b0;
    .locals 4

    new-instance v0, Lm/b0$a;

    invoke-direct {v0}, Lm/b0$a;-><init>()V

    iget-object v1, p0, Lm/h0/h/f;->b:Lm/f0;

    invoke-virtual {v1}, Lm/f0;->a()Lm/a;

    move-result-object v1

    invoke-virtual {v1}, Lm/a;->l()Lm/v;

    move-result-object v1

    invoke-virtual {v0, v1}, Lm/b0$a;->p(Lm/v;)Lm/b0$a;

    const-string v1, "CONNECT"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lm/b0$a;->f(Ljava/lang/String;Lm/c0;)Lm/b0$a;

    iget-object v1, p0, Lm/h0/h/f;->b:Lm/f0;

    invoke-virtual {v1}, Lm/f0;->a()Lm/a;

    move-result-object v1

    invoke-virtual {v1}, Lm/a;->l()Lm/v;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lm/h0/d;->P(Lm/v;Z)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Host"

    invoke-virtual {v0, v2, v1}, Lm/b0$a;->d(Ljava/lang/String;Ljava/lang/String;)Lm/b0$a;

    const-string v1, "Proxy-Connection"

    const-string v2, "Keep-Alive"

    invoke-virtual {v0, v1, v2}, Lm/b0$a;->d(Ljava/lang/String;Ljava/lang/String;)Lm/b0$a;

    const-string v1, "User-Agent"

    const-string v2, "okhttp/4.10.0"

    invoke-virtual {v0, v1, v2}, Lm/b0$a;->d(Ljava/lang/String;Ljava/lang/String;)Lm/b0$a;

    invoke-virtual {v0}, Lm/b0$a;->a()Lm/b0;

    move-result-object v0

    new-instance v1, Lm/d0$a;

    invoke-direct {v1}, Lm/d0$a;-><init>()V

    invoke-virtual {v1, v0}, Lm/d0$a;->s(Lm/b0;)Lm/d0$a;

    sget-object v2, Lm/a0;->d:Lm/a0;

    invoke-virtual {v1, v2}, Lm/d0$a;->q(Lm/a0;)Lm/d0$a;

    const/16 v2, 0x197

    invoke-virtual {v1, v2}, Lm/d0$a;->g(I)Lm/d0$a;

    const-string v2, "Preemptive Authenticate"

    invoke-virtual {v1, v2}, Lm/d0$a;->n(Ljava/lang/String;)Lm/d0$a;

    sget-object v2, Lm/h0/d;->c:Lm/e0;

    invoke-virtual {v1, v2}, Lm/d0$a;->b(Lm/e0;)Lm/d0$a;

    const-wide/16 v2, -0x1

    invoke-virtual {v1, v2, v3}, Lm/d0$a;->t(J)Lm/d0$a;

    invoke-virtual {v1, v2, v3}, Lm/d0$a;->r(J)Lm/d0$a;

    const-string v2, "Proxy-Authenticate"

    const-string v3, "OkHttp-Preemptive"

    invoke-virtual {v1, v2, v3}, Lm/d0$a;->k(Ljava/lang/String;Ljava/lang/String;)Lm/d0$a;

    invoke-virtual {v1}, Lm/d0$a;->c()Lm/d0;

    move-result-object v1

    iget-object v2, p0, Lm/h0/h/f;->b:Lm/f0;

    invoke-virtual {v2}, Lm/f0;->a()Lm/a;

    move-result-object v2

    invoke-virtual {v2}, Lm/a;->h()Lm/b;

    move-result-object v2

    iget-object v3, p0, Lm/h0/h/f;->b:Lm/f0;

    invoke-interface {v2, v3, v1}, Lm/b;->a(Lm/f0;Lm/d0;)Lm/b0;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    return-object v0
.end method

.method private final n(Lm/h0/h/b;ILm/e;Lm/r;)V
    .locals 1

    iget-object v0, p0, Lm/h0/h/f;->b:Lm/f0;

    invoke-virtual {v0}, Lm/f0;->a()Lm/a;

    move-result-object v0

    invoke-virtual {v0}, Lm/a;->k()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object p1, p0, Lm/h0/h/f;->b:Lm/f0;

    invoke-virtual {p1}, Lm/f0;->a()Lm/a;

    move-result-object p1

    invoke-virtual {p1}, Lm/a;->f()Ljava/util/List;

    move-result-object p1

    sget-object p3, Lm/a0;->g:Lm/a0;

    invoke-interface {p1, p3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lm/h0/h/f;->c:Ljava/net/Socket;

    iput-object p1, p0, Lm/h0/h/f;->d:Ljava/net/Socket;

    iput-object p3, p0, Lm/h0/h/f;->f:Lm/a0;

    invoke-direct {p0, p2}, Lm/h0/h/f;->F(I)V

    return-void

    :cond_0
    iget-object p1, p0, Lm/h0/h/f;->c:Ljava/net/Socket;

    iput-object p1, p0, Lm/h0/h/f;->d:Ljava/net/Socket;

    sget-object p1, Lm/a0;->d:Lm/a0;

    iput-object p1, p0, Lm/h0/h/f;->f:Lm/a0;

    return-void

    :cond_1
    invoke-virtual {p4, p3}, Lm/r;->C(Lm/e;)V

    invoke-direct {p0, p1}, Lm/h0/h/f;->j(Lm/h0/h/b;)V

    iget-object p1, p0, Lm/h0/h/f;->e:Lm/t;

    invoke-virtual {p4, p3, p1}, Lm/r;->B(Lm/e;Lm/t;)V

    iget-object p1, p0, Lm/h0/h/f;->f:Lm/a0;

    sget-object p3, Lm/a0;->f:Lm/a0;

    if-ne p1, p3, :cond_2

    invoke-direct {p0, p2}, Lm/h0/h/f;->F(I)V

    :cond_2
    return-void
.end method


# virtual methods
.method public A()Lm/f0;
    .locals 1

    iget-object v0, p0, Lm/h0/h/f;->b:Lm/f0;

    return-object v0
.end method

.method public final C(J)V
    .locals 0

    iput-wide p1, p0, Lm/h0/h/f;->q:J

    return-void
.end method

.method public final D(Z)V
    .locals 0

    iput-boolean p1, p0, Lm/h0/h/f;->j:Z

    return-void
.end method

.method public E()Ljava/net/Socket;
    .locals 1

    iget-object v0, p0, Lm/h0/h/f;->d:Ljava/net/Socket;

    invoke-static {v0}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final declared-synchronized H(Lm/h0/h/e;Ljava/io/IOException;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    const-string v0, "call"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lm/h0/k/n;

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    move-object v0, p2

    check-cast v0, Lm/h0/k/n;

    iget-object v0, v0, Lm/h0/k/n;->a:Lm/h0/k/b;

    sget-object v2, Lm/h0/k/b;->j:Lm/h0/k/b;

    if-ne v0, v2, :cond_0

    iget p1, p0, Lm/h0/h/f;->n:I

    add-int/2addr p1, v1

    iput p1, p0, Lm/h0/h/f;->n:I

    if-le p1, v1, :cond_5

    iput-boolean v1, p0, Lm/h0/h/f;->j:Z

    iget p1, p0, Lm/h0/h/f;->l:I

    :goto_0
    add-int/2addr p1, v1

    iput p1, p0, Lm/h0/h/f;->l:I

    goto :goto_1

    :cond_0
    check-cast p2, Lm/h0/k/n;

    iget-object p2, p2, Lm/h0/k/n;->a:Lm/h0/k/b;

    sget-object v0, Lm/h0/k/b;->k:Lm/h0/k/b;

    if-ne p2, v0, :cond_1

    invoke-virtual {p1}, Lm/h0/h/e;->f()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    iput-boolean v1, p0, Lm/h0/h/f;->j:Z

    iget p1, p0, Lm/h0/h/f;->l:I

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lm/h0/h/f;->w()Z

    move-result v0

    if-eqz v0, :cond_3

    instance-of v0, p2, Lm/h0/k/a;

    if-eqz v0, :cond_5

    :cond_3
    iput-boolean v1, p0, Lm/h0/h/f;->j:Z

    iget v0, p0, Lm/h0/h/f;->m:I

    if-nez v0, :cond_5

    if-eqz p2, :cond_4

    invoke-virtual {p1}, Lm/h0/h/e;->o()Lm/z;

    move-result-object p1

    iget-object v0, p0, Lm/h0/h/f;->b:Lm/f0;

    invoke-virtual {p0, p1, v0, p2}, Lm/h0/h/f;->h(Lm/z;Lm/f0;Ljava/io/IOException;)V

    :cond_4
    iget p1, p0, Lm/h0/h/f;->l:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_5
    :goto_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    goto :goto_3

    :goto_2
    throw p1

    :goto_3
    goto :goto_2
.end method

.method public a()Lm/a0;
    .locals 1

    iget-object v0, p0, Lm/h0/h/f;->f:Lm/a0;

    invoke-static {v0}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    return-object v0
.end method

.method public declared-synchronized b(Lm/h0/k/f;Lm/h0/k/m;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "connection"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "settings"

    invoke-static {p2, p1}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lm/h0/k/m;->d()I

    move-result p1

    iput p1, p0, Lm/h0/h/f;->o:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public c(Lm/h0/k/i;)V
    .locals 2

    const-string v0, "stream"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lm/h0/k/b;->j:Lm/h0/k/b;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lm/h0/k/i;->d(Lm/h0/k/b;Ljava/io/IOException;)V

    return-void
.end method

.method public final e()V
    .locals 1

    iget-object v0, p0, Lm/h0/h/f;->c:Ljava/net/Socket;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lm/h0/d;->k(Ljava/net/Socket;)V

    :goto_0
    return-void
.end method

.method public final g(IIIIZLm/e;Lm/r;)V
    .locals 16

    move-object/from16 v7, p0

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    const-string v0, "call"

    invoke-static {v8, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventListener"

    invoke-static {v9, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v7, Lm/h0/h/f;->f:Lm/a0;

    const/4 v10, 0x1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_d

    iget-object v0, v7, Lm/h0/h/f;->b:Lm/f0;

    invoke-virtual {v0}, Lm/f0;->a()Lm/a;

    move-result-object v0

    invoke-virtual {v0}, Lm/a;->b()Ljava/util/List;

    move-result-object v0

    new-instance v11, Lm/h0/h/b;

    invoke-direct {v11, v0}, Lm/h0/h/b;-><init>(Ljava/util/List;)V

    iget-object v1, v7, Lm/h0/h/f;->b:Lm/f0;

    invoke-virtual {v1}, Lm/f0;->a()Lm/a;

    move-result-object v1

    invoke-virtual {v1}, Lm/a;->k()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v1

    if-nez v1, :cond_3

    sget-object v1, Lm/l;->h:Lm/l;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, v7, Lm/h0/h/f;->b:Lm/f0;

    invoke-virtual {v0}, Lm/f0;->a()Lm/a;

    move-result-object v0

    invoke-virtual {v0}, Lm/a;->l()Lm/v;

    move-result-object v0

    invoke-virtual {v0}, Lm/v;->i()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lm/h0/l/h;->a:Lm/h0/l/h$a;

    invoke-virtual {v1}, Lm/h0/l/h$a;->g()Lm/h0/l/h;

    move-result-object v1

    invoke-virtual {v1, v0}, Lm/h0/l/h;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    new-instance v1, Lm/h0/h/i;

    new-instance v2, Ljava/net/UnknownServiceException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "CLEARTEXT communication to "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " not permitted by network security policy"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Lm/h0/h/i;-><init>(Ljava/io/IOException;)V

    throw v1

    :cond_2
    new-instance v0, Lm/h0/h/i;

    new-instance v1, Ljava/net/UnknownServiceException;

    const-string v2, "CLEARTEXT communication not enabled for client"

    invoke-direct {v1, v2}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lm/h0/h/i;-><init>(Ljava/io/IOException;)V

    throw v0

    :cond_3
    iget-object v0, v7, Lm/h0/h/f;->b:Lm/f0;

    invoke-virtual {v0}, Lm/f0;->a()Lm/a;

    move-result-object v0

    invoke-virtual {v0}, Lm/a;->f()Ljava/util/List;

    move-result-object v0

    sget-object v1, Lm/a0;->g:Lm/a0;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    :goto_1
    const/4 v12, 0x0

    move-object v13, v12

    :goto_2
    :try_start_0
    iget-object v0, v7, Lm/h0/h/f;->b:Lm/f0;

    invoke-virtual {v0}, Lm/f0;->c()Z

    move-result v0

    if-eqz v0, :cond_5

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    invoke-direct/range {v1 .. v6}, Lm/h0/h/f;->k(IIILm/e;Lm/r;)V

    iget-object v0, v7, Lm/h0/h/f;->c:Ljava/net/Socket;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    if-nez v0, :cond_4

    goto :goto_4

    :cond_4
    move/from16 v14, p1

    move/from16 v15, p2

    goto :goto_3

    :cond_5
    move/from16 v14, p1

    move/from16 v15, p2

    :try_start_1
    invoke-direct {v7, v14, v15, v8, v9}, Lm/h0/h/f;->i(IILm/e;Lm/r;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_3
    move/from16 v6, p4

    :try_start_2
    invoke-direct {v7, v11, v6, v8, v9}, Lm/h0/h/f;->n(Lm/h0/h/b;ILm/e;Lm/r;)V

    iget-object v0, v7, Lm/h0/h/f;->b:Lm/f0;

    invoke-virtual {v0}, Lm/f0;->d()Ljava/net/InetSocketAddress;

    move-result-object v0

    iget-object v1, v7, Lm/h0/h/f;->b:Lm/f0;

    invoke-virtual {v1}, Lm/f0;->b()Ljava/net/Proxy;

    move-result-object v1

    iget-object v2, v7, Lm/h0/h/f;->f:Lm/a0;

    invoke-virtual {v9, v8, v0, v1, v2}, Lm/r;->h(Lm/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lm/a0;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :goto_4
    iget-object v0, v7, Lm/h0/h/f;->b:Lm/f0;

    invoke-virtual {v0}, Lm/f0;->c()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, v7, Lm/h0/h/f;->c:Ljava/net/Socket;

    if-eqz v0, :cond_6

    goto :goto_5

    :cond_6
    new-instance v0, Lm/h0/h/i;

    new-instance v1, Ljava/net/ProtocolException;

    const-string v2, "Too many tunnel connections attempted: 21"

    invoke-direct {v1, v2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lm/h0/h/i;-><init>(Ljava/io/IOException;)V

    throw v0

    :cond_7
    :goto_5
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, v7, Lm/h0/h/f;->q:J

    return-void

    :catch_0
    move-exception v0

    goto :goto_7

    :catch_1
    move-exception v0

    goto :goto_6

    :catch_2
    move-exception v0

    move/from16 v14, p1

    move/from16 v15, p2

    :goto_6
    move/from16 v6, p4

    :goto_7
    iget-object v1, v7, Lm/h0/h/f;->d:Ljava/net/Socket;

    if-nez v1, :cond_8

    goto :goto_8

    :cond_8
    invoke-static {v1}, Lm/h0/d;->k(Ljava/net/Socket;)V

    :goto_8
    iget-object v1, v7, Lm/h0/h/f;->c:Ljava/net/Socket;

    if-nez v1, :cond_9

    goto :goto_9

    :cond_9
    invoke-static {v1}, Lm/h0/d;->k(Ljava/net/Socket;)V

    :goto_9
    iput-object v12, v7, Lm/h0/h/f;->d:Ljava/net/Socket;

    iput-object v12, v7, Lm/h0/h/f;->c:Ljava/net/Socket;

    iput-object v12, v7, Lm/h0/h/f;->h:Ln/d;

    iput-object v12, v7, Lm/h0/h/f;->i:Ln/c;

    iput-object v12, v7, Lm/h0/h/f;->e:Lm/t;

    iput-object v12, v7, Lm/h0/h/f;->f:Lm/a0;

    iput-object v12, v7, Lm/h0/h/f;->g:Lm/h0/k/f;

    iput v10, v7, Lm/h0/h/f;->o:I

    iget-object v1, v7, Lm/h0/h/f;->b:Lm/f0;

    invoke-virtual {v1}, Lm/f0;->d()Ljava/net/InetSocketAddress;

    move-result-object v3

    iget-object v1, v7, Lm/h0/h/f;->b:Lm/f0;

    invoke-virtual {v1}, Lm/f0;->b()Ljava/net/Proxy;

    move-result-object v4

    const/4 v5, 0x0

    move-object/from16 v1, p7

    move-object/from16 v2, p6

    move-object v6, v0

    invoke-virtual/range {v1 .. v6}, Lm/r;->i(Lm/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lm/a0;Ljava/io/IOException;)V

    if-nez v13, :cond_a

    new-instance v13, Lm/h0/h/i;

    invoke-direct {v13, v0}, Lm/h0/h/i;-><init>(Ljava/io/IOException;)V

    goto :goto_a

    :cond_a
    invoke-virtual {v13, v0}, Lm/h0/h/i;->a(Ljava/io/IOException;)V

    :goto_a
    if-eqz p5, :cond_b

    invoke-virtual {v11, v0}, Lm/h0/h/b;->b(Ljava/io/IOException;)Z

    move-result v0

    if-eqz v0, :cond_b

    goto/16 :goto_2

    :cond_b
    throw v13

    :cond_c
    new-instance v0, Lm/h0/h/i;

    new-instance v1, Ljava/net/UnknownServiceException;

    const-string v2, "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"

    invoke-direct {v1, v2}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lm/h0/h/i;-><init>(Ljava/io/IOException;)V

    throw v0

    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "already connected"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_c

    :goto_b
    throw v0

    :goto_c
    goto :goto_b
.end method

.method public final h(Lm/z;Lm/f0;Ljava/io/IOException;)V
    .locals 3

    const-string v0, "client"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "failedRoute"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "failure"

    invoke-static {p3, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lm/f0;->b()Ljava/net/Proxy;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v1, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v0, v1, :cond_0

    invoke-virtual {p2}, Lm/f0;->a()Lm/a;

    move-result-object v0

    invoke-virtual {v0}, Lm/a;->i()Ljava/net/ProxySelector;

    move-result-object v1

    invoke-virtual {v0}, Lm/a;->l()Lm/v;

    move-result-object v0

    invoke-virtual {v0}, Lm/v;->v()Ljava/net/URI;

    move-result-object v0

    invoke-virtual {p2}, Lm/f0;->b()Ljava/net/Proxy;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    move-result-object v2

    invoke-virtual {v1, v0, v2, p3}, Ljava/net/ProxySelector;->connectFailed(Ljava/net/URI;Ljava/net/SocketAddress;Ljava/io/IOException;)V

    :cond_0
    invoke-virtual {p1}, Lm/z;->w()Lm/h0/h/h;

    move-result-object p1

    invoke-virtual {p1, p2}, Lm/h0/h/h;->b(Lm/f0;)V

    return-void
.end method

.method public final o()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/ref/Reference<",
            "Lm/h0/h/e;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lm/h0/h/f;->p:Ljava/util/List;

    return-object v0
.end method

.method public final p()J
    .locals 2

    iget-wide v0, p0, Lm/h0/h/f;->q:J

    return-wide v0
.end method

.method public final q()Z
    .locals 1

    iget-boolean v0, p0, Lm/h0/h/f;->j:Z

    return v0
.end method

.method public final r()I
    .locals 1

    iget v0, p0, Lm/h0/h/f;->l:I

    return v0
.end method

.method public s()Lm/t;
    .locals 1

    iget-object v0, p0, Lm/h0/h/f;->e:Lm/t;

    return-object v0
.end method

.method public final declared-synchronized t()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lm/h0/h/f;->m:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lm/h0/h/f;->m:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Connection{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm/h0/h/f;->b:Lm/f0;

    invoke-virtual {v1}, Lm/f0;->a()Lm/a;

    move-result-object v1

    invoke-virtual {v1}, Lm/a;->l()Lm/v;

    move-result-object v1

    invoke-virtual {v1}, Lm/v;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3a

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm/h0/h/f;->b:Lm/f0;

    invoke-virtual {v1}, Lm/f0;->a()Lm/a;

    move-result-object v1

    invoke-virtual {v1}, Lm/a;->l()Lm/v;

    move-result-object v1

    invoke-virtual {v1}, Lm/v;->n()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", proxy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm/h0/h/f;->b:Lm/f0;

    invoke-virtual {v1}, Lm/f0;->b()Ljava/net/Proxy;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " hostAddress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm/h0/h/f;->b:Lm/f0;

    invoke-virtual {v1}, Lm/f0;->d()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " cipherSuite="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm/h0/h/f;->e:Lm/t;

    const-string v2, "none"

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lm/t;->a()Lm/i;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    move-object v2, v1

    :goto_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " protocol="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm/h0/h/f;->f:Lm/a0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(Lm/a;Ljava/util/List;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm/a;",
            "Ljava/util/List<",
            "Lm/f0;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "address"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-boolean v0, Lm/h0/d;->g:Z

    if-eqz v0, :cond_1

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Thread "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " MUST hold lock on "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Lm/h0/h/f;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lm/h0/h/f;->o:I

    const/4 v2, 0x0

    if-ge v0, v1, :cond_9

    iget-boolean v0, p0, Lm/h0/h/f;->j:Z

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lm/h0/h/f;->b:Lm/f0;

    invoke-virtual {v0}, Lm/f0;->a()Lm/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lm/a;->d(Lm/a;)Z

    move-result v0

    if-nez v0, :cond_3

    return v2

    :cond_3
    invoke-virtual {p1}, Lm/a;->l()Lm/v;

    move-result-object v0

    invoke-virtual {v0}, Lm/v;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lm/h0/h/f;->A()Lm/f0;

    move-result-object v1

    invoke-virtual {v1}, Lm/f0;->a()Lm/a;

    move-result-object v1

    invoke-virtual {v1}, Lm/a;->l()Lm/v;

    move-result-object v1

    invoke-virtual {v1}, Lm/v;->i()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/y/c/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_4

    return v1

    :cond_4
    iget-object v0, p0, Lm/h0/h/f;->g:Lm/h0/k/f;

    if-nez v0, :cond_5

    return v2

    :cond_5
    if-eqz p2, :cond_9

    invoke-direct {p0, p2}, Lm/h0/h/f;->B(Ljava/util/List;)Z

    move-result p2

    if-nez p2, :cond_6

    goto :goto_1

    :cond_6
    invoke-virtual {p1}, Lm/a;->e()Ljavax/net/ssl/HostnameVerifier;

    move-result-object p2

    sget-object v0, Lm/h0/n/d;->a:Lm/h0/n/d;

    if-eq p2, v0, :cond_7

    return v2

    :cond_7
    invoke-virtual {p1}, Lm/a;->l()Lm/v;

    move-result-object p2

    invoke-direct {p0, p2}, Lm/h0/h/f;->G(Lm/v;)Z

    move-result p2

    if-nez p2, :cond_8

    return v2

    :cond_8
    :try_start_0
    invoke-virtual {p1}, Lm/a;->a()Lm/g;

    move-result-object p2

    invoke-static {p2}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lm/a;->l()Lm/v;

    move-result-object p1

    invoke-virtual {p1}, Lm/v;->i()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lm/h0/h/f;->s()Lm/t;

    move-result-object v0

    invoke-static {v0}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm/t;->d()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Lm/g;->a(Ljava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    :cond_9
    :goto_1
    return v2
.end method

.method public final v(Z)Z
    .locals 7

    sget-boolean v0, Lm/h0/d;->g:Z

    if-eqz v0, :cond_1

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Thread "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " MUST NOT hold lock on "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iget-object v2, p0, Lm/h0/h/f;->c:Ljava/net/Socket;

    invoke-static {v2}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    iget-object v3, p0, Lm/h0/h/f;->d:Ljava/net/Socket;

    invoke-static {v3}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    iget-object v4, p0, Lm/h0/h/f;->h:Ln/d;

    invoke-static {v4}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/net/Socket;->isClosed()Z

    move-result v2

    if-nez v2, :cond_5

    invoke-virtual {v3}, Ljava/net/Socket;->isClosed()Z

    move-result v2

    if-nez v2, :cond_5

    invoke-virtual {v3}, Ljava/net/Socket;->isInputShutdown()Z

    move-result v2

    if-nez v2, :cond_5

    invoke-virtual {v3}, Ljava/net/Socket;->isOutputShutdown()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lm/h0/h/f;->g:Lm/h0/k/f;

    if-eqz v2, :cond_3

    invoke-virtual {v2, v0, v1}, Lm/h0/k/f;->v0(J)Z

    move-result p1

    return p1

    :cond_3
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lm/h0/h/f;->p()J

    move-result-wide v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sub-long/2addr v0, v5

    monitor-exit p0

    const-wide v5, 0x2540be400L

    cmp-long v2, v0, v5

    if-ltz v2, :cond_4

    if-eqz p1, :cond_4

    invoke-static {v3, v4}, Lm/h0/d;->C(Ljava/net/Socket;Ln/d;)Z

    move-result p1

    return p1

    :cond_4
    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1

    :cond_5
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final w()Z
    .locals 1

    iget-object v0, p0, Lm/h0/h/f;->g:Lm/h0/k/f;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final x(Lm/z;Lm/h0/i/g;)Lm/h0/i/d;
    .locals 6

    const-string v0, "client"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chain"

    invoke-static {p2, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm/h0/h/f;->d:Ljava/net/Socket;

    invoke-static {v0}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    iget-object v1, p0, Lm/h0/h/f;->h:Ln/d;

    invoke-static {v1}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    iget-object v2, p0, Lm/h0/h/f;->i:Ln/c;

    invoke-static {v2}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    iget-object v3, p0, Lm/h0/h/f;->g:Lm/h0/k/f;

    if-eqz v3, :cond_0

    new-instance v0, Lm/h0/k/g;

    invoke-direct {v0, p1, p0, p2, v3}, Lm/h0/k/g;-><init>(Lm/z;Lm/h0/h/f;Lm/h0/i/g;Lm/h0/k/f;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lm/h0/i/g;->l()I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/net/Socket;->setSoTimeout(I)V

    invoke-interface {v1}, Ln/x;->d()Ln/y;

    move-result-object v0

    invoke-virtual {p2}, Lm/h0/i/g;->i()I

    move-result v3

    int-to-long v3, v3

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v3, v4, v5}, Ln/y;->g(JLjava/util/concurrent/TimeUnit;)Ln/y;

    invoke-interface {v2}, Ln/v;->d()Ln/y;

    move-result-object v0

    invoke-virtual {p2}, Lm/h0/i/g;->k()I

    move-result p2

    int-to-long v3, p2

    invoke-virtual {v0, v3, v4, v5}, Ln/y;->g(JLjava/util/concurrent/TimeUnit;)Ln/y;

    new-instance v0, Lm/h0/j/b;

    invoke-direct {v0, p1, p0, v1, v2}, Lm/h0/j/b;-><init>(Lm/z;Lm/h0/h/f;Ln/d;Ln/c;)V

    :goto_0
    return-object v0
.end method

.method public final declared-synchronized y()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lm/h0/h/f;->k:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized z()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lm/h0/h/f;->j:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
