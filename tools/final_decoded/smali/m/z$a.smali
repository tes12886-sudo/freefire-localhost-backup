.class public final Lm/z$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private A:I

.field private B:I

.field private C:J

.field private D:Lm/h0/h/h;

.field private a:Lm/p;

.field private b:Lm/k;

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

.field private e:Lm/r$b;

.field private f:Z

.field private g:Lm/b;

.field private h:Z

.field private i:Z

.field private j:Lm/n;

.field private k:Lm/c;

.field private l:Lm/q;

.field private m:Ljava/net/Proxy;

.field private n:Ljava/net/ProxySelector;

.field private o:Lm/b;

.field private p:Ljavax/net/SocketFactory;

.field private q:Ljavax/net/ssl/SSLSocketFactory;

.field private r:Ljavax/net/ssl/X509TrustManager;

.field private s:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lm/l;",
            ">;"
        }
    .end annotation
.end field

.field private t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lm/a0;",
            ">;"
        }
    .end annotation
.end field

.field private u:Ljavax/net/ssl/HostnameVerifier;

.field private v:Lm/g;

.field private w:Lm/h0/n/c;

.field private x:I

.field private y:I

.field private z:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lm/p;

    invoke-direct {v0}, Lm/p;-><init>()V

    iput-object v0, p0, Lm/z$a;->a:Lm/p;

    new-instance v0, Lm/k;

    invoke-direct {v0}, Lm/k;-><init>()V

    iput-object v0, p0, Lm/z$a;->b:Lm/k;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lm/z$a;->c:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lm/z$a;->d:Ljava/util/List;

    sget-object v0, Lm/r;->a:Lm/r;

    invoke-static {v0}, Lm/h0/d;->e(Lm/r;)Lm/r$b;

    move-result-object v0

    iput-object v0, p0, Lm/z$a;->e:Lm/r$b;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lm/z$a;->f:Z

    sget-object v1, Lm/b;->a:Lm/b;

    iput-object v1, p0, Lm/z$a;->g:Lm/b;

    iput-boolean v0, p0, Lm/z$a;->h:Z

    iput-boolean v0, p0, Lm/z$a;->i:Z

    sget-object v0, Lm/n;->a:Lm/n;

    iput-object v0, p0, Lm/z$a;->j:Lm/n;

    sget-object v0, Lm/q;->a:Lm/q;

    iput-object v0, p0, Lm/z$a;->l:Lm/q;

    iput-object v1, p0, Lm/z$a;->o:Lm/b;

    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    move-result-object v0

    const-string v1, "getDefault()"

    invoke-static {v0, v1}, Ll/y/c/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lm/z$a;->p:Ljavax/net/SocketFactory;

    sget-object v0, Lm/z;->M:Lm/z$b;

    invoke-virtual {v0}, Lm/z$b;->a()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lm/z$a;->s:Ljava/util/List;

    invoke-virtual {v0}, Lm/z$b;->b()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lm/z$a;->t:Ljava/util/List;

    sget-object v0, Lm/h0/n/d;->a:Lm/h0/n/d;

    iput-object v0, p0, Lm/z$a;->u:Ljavax/net/ssl/HostnameVerifier;

    sget-object v0, Lm/g;->d:Lm/g;

    iput-object v0, p0, Lm/z$a;->v:Lm/g;

    const/16 v0, 0x2710

    iput v0, p0, Lm/z$a;->y:I

    iput v0, p0, Lm/z$a;->z:I

    iput v0, p0, Lm/z$a;->A:I

    const-wide/16 v0, 0x400

    iput-wide v0, p0, Lm/z$a;->C:J

    return-void
.end method


# virtual methods
.method public final A()I
    .locals 1

    iget v0, p0, Lm/z$a;->z:I

    return v0
.end method

.method public final B()Z
    .locals 1

    iget-boolean v0, p0, Lm/z$a;->f:Z

    return v0
.end method

.method public final C()Lm/h0/h/h;
    .locals 1

    iget-object v0, p0, Lm/z$a;->D:Lm/h0/h/h;

    return-object v0
.end method

.method public final D()Ljavax/net/SocketFactory;
    .locals 1

    iget-object v0, p0, Lm/z$a;->p:Ljavax/net/SocketFactory;

    return-object v0
.end method

.method public final E()Ljavax/net/ssl/SSLSocketFactory;
    .locals 1

    iget-object v0, p0, Lm/z$a;->q:Ljavax/net/ssl/SSLSocketFactory;

    return-object v0
.end method

.method public final F()I
    .locals 1

    iget v0, p0, Lm/z$a;->A:I

    return v0
.end method

.method public final G()Ljavax/net/ssl/X509TrustManager;
    .locals 1

    iget-object v0, p0, Lm/z$a;->r:Ljavax/net/ssl/X509TrustManager;

    return-object v0
.end method

.method public final H(Lm/g;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lm/z$a;->v:Lm/g;

    return-void
.end method

.method public final I(Lm/h0/h/h;)V
    .locals 0

    iput-object p1, p0, Lm/z$a;->D:Lm/h0/h/h;

    return-void
.end method

.method public final a(Lm/w;)Lm/z$a;
    .locals 1

    const-string v0, "interceptor"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lm/z$a;->s()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final b()Lm/z;
    .locals 1

    new-instance v0, Lm/z;

    invoke-direct {v0, p0}, Lm/z;-><init>(Lm/z$a;)V

    return-object v0
.end method

.method public final c(Lm/g;)Lm/z$a;
    .locals 1

    const-string v0, "certificatePinner"

    invoke-static {p1, v0}, Ll/y/c/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lm/z$a;->h()Lm/g;

    move-result-object v0

    invoke-static {p1, v0}, Ll/y/c/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lm/z$a;->I(Lm/h0/h/h;)V

    :cond_0
    invoke-virtual {p0, p1}, Lm/z$a;->H(Lm/g;)V

    return-object p0
.end method

.method public final d()Lm/b;
    .locals 1

    iget-object v0, p0, Lm/z$a;->g:Lm/b;

    return-object v0
.end method

.method public final e()Lm/c;
    .locals 1

    iget-object v0, p0, Lm/z$a;->k:Lm/c;

    return-object v0
.end method

.method public final f()I
    .locals 1

    iget v0, p0, Lm/z$a;->x:I

    return v0
.end method

.method public final g()Lm/h0/n/c;
    .locals 1

    iget-object v0, p0, Lm/z$a;->w:Lm/h0/n/c;

    return-object v0
.end method

.method public final h()Lm/g;
    .locals 1

    iget-object v0, p0, Lm/z$a;->v:Lm/g;

    return-object v0
.end method

.method public final i()I
    .locals 1

    iget v0, p0, Lm/z$a;->y:I

    return v0
.end method

.method public final j()Lm/k;
    .locals 1

    iget-object v0, p0, Lm/z$a;->b:Lm/k;

    return-object v0
.end method

.method public final k()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lm/l;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lm/z$a;->s:Ljava/util/List;

    return-object v0
.end method

.method public final l()Lm/n;
    .locals 1

    iget-object v0, p0, Lm/z$a;->j:Lm/n;

    return-object v0
.end method

.method public final m()Lm/p;
    .locals 1

    iget-object v0, p0, Lm/z$a;->a:Lm/p;

    return-object v0
.end method

.method public final n()Lm/q;
    .locals 1

    iget-object v0, p0, Lm/z$a;->l:Lm/q;

    return-object v0
.end method

.method public final o()Lm/r$b;
    .locals 1

    iget-object v0, p0, Lm/z$a;->e:Lm/r$b;

    return-object v0
.end method

.method public final p()Z
    .locals 1

    iget-boolean v0, p0, Lm/z$a;->h:Z

    return v0
.end method

.method public final q()Z
    .locals 1

    iget-boolean v0, p0, Lm/z$a;->i:Z

    return v0
.end method

.method public final r()Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    iget-object v0, p0, Lm/z$a;->u:Ljavax/net/ssl/HostnameVerifier;

    return-object v0
.end method

.method public final s()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lm/w;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lm/z$a;->c:Ljava/util/List;

    return-object v0
.end method

.method public final t()J
    .locals 2

    iget-wide v0, p0, Lm/z$a;->C:J

    return-wide v0
.end method

.method public final u()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lm/w;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lm/z$a;->d:Ljava/util/List;

    return-object v0
.end method

.method public final v()I
    .locals 1

    iget v0, p0, Lm/z$a;->B:I

    return v0
.end method

.method public final w()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lm/a0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lm/z$a;->t:Ljava/util/List;

    return-object v0
.end method

.method public final x()Ljava/net/Proxy;
    .locals 1

    iget-object v0, p0, Lm/z$a;->m:Ljava/net/Proxy;

    return-object v0
.end method

.method public final y()Lm/b;
    .locals 1

    iget-object v0, p0, Lm/z$a;->o:Lm/b;

    return-object v0
.end method

.method public final z()Ljava/net/ProxySelector;
    .locals 1

    iget-object v0, p0, Lm/z$a;->n:Ljava/net/ProxySelector;

    return-object v0
.end method
