.class public Lm/z;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Cloneable;
.implements Lm/e$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm/z$a;,
        Lm/z$b;
    }
.end annotation


# static fields
.field public static final M:Lm/z$b;

.field private static final N:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lm/a0;",
            ">;"
        }
    .end annotation
.end field

.field private static final O:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lm/l;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final F:Lm/h0/n/c;

.field private final G:I

.field private final H:I

.field private final I:I

.field private final J:I

.field private final K:I

.field private final L:Lm/h0/h/h;

.field private final a:Lm/p;

.field private final b:Lm/k;

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lm/w;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lm/w;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lm/r$b;

.field private final f:Z

.field private final g:Lm/b;

.field private final h:Z

.field private final i:Z

.field private final j:Lm/n;

.field private final k:Lm/c;

.field private final l:Lm/q;

.field private final m:Ljava/net/Proxy;

.field private final n:Ljava/net/ProxySelector;

.field private final o:Lm/b;

.field private final p:Ljavax/net/SocketFactory;

.field private final q:Ljavax/net/ssl/SSLSocketFactory;

.field private final r:Ljavax/net/ssl/X509TrustManager;

.field private final s:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lm/l;",
            ">;"
        }
    .end annotation
.end field

.field private final t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lm/a0;",
            ">;"
        }
    .end annotation
.end field

.field private final u:Ljavax/net/ssl/HostnameVerifier;

.field private final v:Lm/g;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lm/z$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm/z$b;-><init>(Ll/y/c/f;)V

    sput-object v0, Lm/z;->M:Lm/z$b;

    const/4 v0, 0x2

    new-array v1, v0, [Lm/a0;

    sget-object v2, Lm/a0;->f:Lm/a0;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Lm/a0;->d:Lm/a0;

    const/4 v4, 0x1

    aput-object v2, v1, v4

    invoke-static {v1}, Lm/h0/d;->t([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sput-object v1, Lm/z;->N:Ljava/util/List;

    new-array v0, v0, [Lm/l;

    sget-object v1, Lm/l;->g:Lm/l;

    aput-object v1, v0, v3

    sget-object v1, Lm/l;->h:Lm/l;

    aput-object v1, v0, v4

    invoke-static {v0}, Lm/h0/d;->t([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lm/z;->O:Ljava/util/List;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    new-instance v0, Lm/z$a;

    invoke-direct {v0}, Lm/z$a;-><init>()V

    invoke-direct {p0, v0}, Lm/z;-><init>(Lm/z$a;)V

    return-void
.end method

.method public constructor <init>(Lm/z$a;)V
    .locals 3

    const-string v0, "builder"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lm/z$a;->m()Lm/p;

    move-result-object v0

    iput-object v0, p0, Lm/z;->a:Lm/p;

    invoke-virtual {p1}, Lm/z$a;->j()Lm/k;

    move-result-object v0

    iput-object v0, p0, Lm/z;->b:Lm/k;

    invoke-virtual {p1}, Lm/z$a;->s()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm/h0/d;->R(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lm/z;->c:Ljava/util/List;

    invoke-virtual {p1}, Lm/z$a;->u()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm/h0/d;->R(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lm/z;->d:Ljava/util/List;

    invoke-virtual {p1}, Lm/z$a;->o()Lm/r$b;

    move-result-object v0

    iput-object v0, p0, Lm/z;->e:Lm/r$b;

    invoke-virtual {p1}, Lm/z$a;->B()Z

    move-result v0

    iput-boolean v0, p0, Lm/z;->f:Z

    invoke-virtual {p1}, Lm/z$a;->d()Lm/b;

    move-result-object v0

    iput-object v0, p0, Lm/z;->g:Lm/b;

    invoke-virtual {p1}, Lm/z$a;->p()Z

    move-result v0

    iput-boolean v0, p0, Lm/z;->h:Z

    invoke-virtual {p1}, Lm/z$a;->q()Z

    move-result v0

    iput-boolean v0, p0, Lm/z;->i:Z

    invoke-virtual {p1}, Lm/z$a;->l()Lm/n;

    move-result-object v0

    iput-object v0, p0, Lm/z;->j:Lm/n;

    invoke-virtual {p1}, Lm/z$a;->e()Lm/c;

    invoke-virtual {p1}, Lm/z$a;->n()Lm/q;

    move-result-object v0

    iput-object v0, p0, Lm/z;->l:Lm/q;

    invoke-virtual {p1}, Lm/z$a;->x()Ljava/net/Proxy;

    move-result-object v0

    iput-object v0, p0, Lm/z;->m:Ljava/net/Proxy;

    invoke-virtual {p1}, Lm/z$a;->x()Ljava/net/Proxy;

    move-result-object v0

    if-eqz v0, :cond_0

    :goto_0
    sget-object v0, Lm/h0/m/a;->a:Lm/h0/m/a;

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lm/z$a;->z()Ljava/net/ProxySelector;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {}, Ljava/net/ProxySelector;->getDefault()Ljava/net/ProxySelector;

    move-result-object v0

    :cond_1
    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    :goto_1
    iput-object v0, p0, Lm/z;->n:Ljava/net/ProxySelector;

    invoke-virtual {p1}, Lm/z$a;->y()Lm/b;

    move-result-object v0

    iput-object v0, p0, Lm/z;->o:Lm/b;

    invoke-virtual {p1}, Lm/z$a;->D()Ljavax/net/SocketFactory;

    move-result-object v0

    iput-object v0, p0, Lm/z;->p:Ljavax/net/SocketFactory;

    invoke-virtual {p1}, Lm/z$a;->k()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lm/z;->s:Ljava/util/List;

    invoke-virtual {p1}, Lm/z$a;->w()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lm/z;->t:Ljava/util/List;

    invoke-virtual {p1}, Lm/z$a;->r()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v1

    iput-object v1, p0, Lm/z;->u:Ljavax/net/ssl/HostnameVerifier;

    invoke-virtual {p1}, Lm/z$a;->f()I

    move-result v1

    iput v1, p0, Lm/z;->G:I

    invoke-virtual {p1}, Lm/z$a;->i()I

    move-result v1

    iput v1, p0, Lm/z;->H:I

    invoke-virtual {p1}, Lm/z$a;->A()I

    move-result v1

    iput v1, p0, Lm/z;->I:I

    invoke-virtual {p1}, Lm/z$a;->F()I

    move-result v1

    iput v1, p0, Lm/z;->J:I

    invoke-virtual {p1}, Lm/z$a;->v()I

    move-result v1

    iput v1, p0, Lm/z;->K:I

    invoke-virtual {p1}, Lm/z$a;->t()J

    invoke-virtual {p1}, Lm/z$a;->C()Lm/h0/h/h;

    move-result-object v1

    if-nez v1, :cond_3

    new-instance v1, Lm/h0/h/h;

    invoke-direct {v1}, Lm/h0/h/h;-><init>()V

    :cond_3
    iput-object v1, p0, Lm/z;->L:Lm/h0/h/h;

    instance-of v1, v0, Ljava/util/Collection;

    const/4 v2, 0x1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm/l;

    invoke-virtual {v1}, Lm/l;->f()Z

    move-result v1

    if-eqz v1, :cond_5

    const/4 v2, 0x0

    :cond_6
    :goto_2
    if-eqz v2, :cond_7

    const/4 p1, 0x0

    iput-object p1, p0, Lm/z;->q:Ljavax/net/ssl/SSLSocketFactory;

    iput-object p1, p0, Lm/z;->F:Lm/h0/n/c;

    iput-object p1, p0, Lm/z;->r:Ljavax/net/ssl/X509TrustManager;

    sget-object p1, Lm/g;->d:Lm/g;

    :goto_3
    iput-object p1, p0, Lm/z;->v:Lm/g;

    goto :goto_5

    :cond_7
    invoke-virtual {p1}, Lm/z$a;->E()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {p1}, Lm/z$a;->E()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    iput-object v0, p0, Lm/z;->q:Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {p1}, Lm/z$a;->g()Lm/h0/n/c;

    move-result-object v0

    invoke-static {v0}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    iput-object v0, p0, Lm/z;->F:Lm/h0/n/c;

    invoke-virtual {p1}, Lm/z$a;->G()Ljavax/net/ssl/X509TrustManager;

    move-result-object v1

    invoke-static {v1}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    iput-object v1, p0, Lm/z;->r:Ljavax/net/ssl/X509TrustManager;

    goto :goto_4

    :cond_8
    sget-object v0, Lm/h0/l/h;->a:Lm/h0/l/h$a;

    invoke-virtual {v0}, Lm/h0/l/h$a;->g()Lm/h0/l/h;

    move-result-object v1

    invoke-virtual {v1}, Lm/h0/l/h;->o()Ljavax/net/ssl/X509TrustManager;

    move-result-object v1

    iput-object v1, p0, Lm/z;->r:Ljavax/net/ssl/X509TrustManager;

    invoke-virtual {v0}, Lm/h0/l/h$a;->g()Lm/h0/l/h;

    move-result-object v0

    invoke-static {v1}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lm/h0/l/h;->n(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    iput-object v0, p0, Lm/z;->q:Ljavax/net/ssl/SSLSocketFactory;

    sget-object v0, Lm/h0/n/c;->a:Lm/h0/n/c$a;

    invoke-static {v1}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lm/h0/n/c$a;->a(Ljavax/net/ssl/X509TrustManager;)Lm/h0/n/c;

    move-result-object v0

    iput-object v0, p0, Lm/z;->F:Lm/h0/n/c;

    :goto_4
    invoke-virtual {p1}, Lm/z$a;->h()Lm/g;

    move-result-object p1

    invoke-static {v0}, Ll/y/c/i;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Lm/g;->e(Lm/h0/n/c;)Lm/g;

    move-result-object p1

    goto :goto_3

    :goto_5
    invoke-direct {p0}, Lm/z;->K()V

    return-void
.end method

.method private final K()V
    .locals 4

    iget-object v0, p0, Lm/z;->c:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x1

    xor-int/2addr v0, v2

    if-eqz v0, :cond_f

    iget-object v0, p0, Lm/z;->d:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    xor-int/2addr v0, v2

    if-eqz v0, :cond_e

    iget-object v0, p0, Lm/z;->s:Ljava/util/List;

    instance-of v1, v0, Ljava/util/Collection;

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm/l;

    invoke-virtual {v1}, Lm/l;->f()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_a

    iget-object v0, p0, Lm/z;->q:Ljavax/net/ssl/SSLSocketFactory;

    if-nez v0, :cond_3

    const/4 v0, 0x1

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    const-string v1, "Check failed."

    if-eqz v0, :cond_9

    iget-object v0, p0, Lm/z;->F:Lm/h0/n/c;

    if-nez v0, :cond_4

    const/4 v0, 0x1

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    :goto_2
    if-eqz v0, :cond_8

    iget-object v0, p0, Lm/z;->r:Ljavax/net/ssl/X509TrustManager;

    if-nez v0, :cond_5

    goto :goto_3

    :cond_5
    const/4 v2, 0x0

    :goto_3
    if-eqz v2, :cond_7

    iget-object v0, p0, Lm/z;->v:Lm/g;

    sget-object v2, Lm/g;->d:Lm/g;

    invoke-static {v0, v2}, Ll/y/c/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_4

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    iget-object v0, p0, Lm/z;->q:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v0, :cond_d

    iget-object v0, p0, Lm/z;->F:Lm/h0/n/c;

    if-eqz v0, :cond_c

    iget-object v0, p0, Lm/z;->r:Ljavax/net/ssl/X509TrustManager;

    if-eqz v0, :cond_b

    :goto_4
    return-void

    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "x509TrustManager == null"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "certificateChainCleaner == null"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "sslSocketFactory == null"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    invoke-virtual {p0}, Lm/z;->z()Ljava/util/List;

    move-result-object v0

    const-string v1, "Null network interceptor: "

    invoke-static {v1, v0}, Ll/y/c/i;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_f
    invoke-virtual {p0}, Lm/z;->y()Ljava/util/List;

    move-result-object v0

    const-string v1, "Null interceptor: "

    invoke-static {v1, v0}, Ll/y/c/i;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_6

    :goto_5
    throw v1

    :goto_6
    goto :goto_5
.end method

.method public static final synthetic d()Ljava/util/List;
    .locals 1

    sget-object v0, Lm/z;->O:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic e()Ljava/util/List;
    .locals 1

    sget-object v0, Lm/z;->N:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public final A()I
    .locals 1

    iget v0, p0, Lm/z;->K:I

    return v0
.end method

.method public final B()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lm/a0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lm/z;->t:Ljava/util/List;

    return-object v0
.end method

.method public final C()Ljava/net/Proxy;
    .locals 1

    iget-object v0, p0, Lm/z;->m:Ljava/net/Proxy;

    return-object v0
.end method

.method public final D()Lm/b;
    .locals 1

    iget-object v0, p0, Lm/z;->o:Lm/b;

    return-object v0
.end method

.method public final E()Ljava/net/ProxySelector;
    .locals 1

    iget-object v0, p0, Lm/z;->n:Ljava/net/ProxySelector;

    return-object v0
.end method

.method public final G()I
    .locals 1

    iget v0, p0, Lm/z;->I:I

    return v0
.end method

.method public final H()Z
    .locals 1

    iget-boolean v0, p0, Lm/z;->f:Z

    return v0
.end method

.method public final I()Ljavax/net/SocketFactory;
    .locals 1

    iget-object v0, p0, Lm/z;->p:Ljavax/net/SocketFactory;

    return-object v0
.end method

.method public final J()Ljavax/net/ssl/SSLSocketFactory;
    .locals 2

    iget-object v0, p0, Lm/z;->q:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "CLEARTEXT-only client"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final L()I
    .locals 1

    iget v0, p0, Lm/z;->J:I

    return v0
.end method

.method public a(Lm/b0;)Lm/e;
    .locals 2

    const-string v0, "request"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lm/h0/h/e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lm/h0/h/e;-><init>(Lm/z;Lm/b0;Z)V

    return-object v0
.end method

.method public clone()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final g()Lm/b;
    .locals 1

    iget-object v0, p0, Lm/z;->g:Lm/b;

    return-object v0
.end method

.method public final h()Lm/c;
    .locals 1

    iget-object v0, p0, Lm/z;->k:Lm/c;

    return-object v0
.end method

.method public final i()I
    .locals 1

    iget v0, p0, Lm/z;->G:I

    return v0
.end method

.method public final k()Lm/g;
    .locals 1

    iget-object v0, p0, Lm/z;->v:Lm/g;

    return-object v0
.end method

.method public final m()I
    .locals 1

    iget v0, p0, Lm/z;->H:I

    return v0
.end method

.method public final n()Lm/k;
    .locals 1

    iget-object v0, p0, Lm/z;->b:Lm/k;

    return-object v0
.end method

.method public final o()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lm/l;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lm/z;->s:Ljava/util/List;

    return-object v0
.end method

.method public final p()Lm/n;
    .locals 1

    iget-object v0, p0, Lm/z;->j:Lm/n;

    return-object v0
.end method

.method public final q()Lm/p;
    .locals 1

    iget-object v0, p0, Lm/z;->a:Lm/p;

    return-object v0
.end method

.method public final r()Lm/q;
    .locals 1

    iget-object v0, p0, Lm/z;->l:Lm/q;

    return-object v0
.end method

.method public final s()Lm/r$b;
    .locals 1

    iget-object v0, p0, Lm/z;->e:Lm/r$b;

    return-object v0
.end method

.method public final t()Z
    .locals 1

    iget-boolean v0, p0, Lm/z;->h:Z

    return v0
.end method

.method public final v()Z
    .locals 1

    iget-boolean v0, p0, Lm/z;->i:Z

    return v0
.end method

.method public final w()Lm/h0/h/h;
    .locals 1

    iget-object v0, p0, Lm/z;->L:Lm/h0/h/h;

    return-object v0
.end method

.method public final x()Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    iget-object v0, p0, Lm/z;->u:Ljavax/net/ssl/HostnameVerifier;

    return-object v0
.end method

.method public final y()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lm/w;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lm/z;->c:Ljava/util/List;

    return-object v0
.end method

.method public final z()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lm/w;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lm/z;->d:Ljava/util/List;

    return-object v0
.end method
