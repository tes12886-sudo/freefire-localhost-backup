.class Lcom/beetalk/sdk/r;
.super Lcom/beetalk/sdk/e;
.source ""


# static fields
.field public static final e:Ljava/lang/String;


# instance fields
.field private final b:Landroid/app/Activity;

.field private volatile c:Lcom/twitter/sdk/android/core/identity/h;

.field private d:Lj/g/a/a/a/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/g/a/a/a/c<",
            "Lj/g/a/a/a/x;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/beetalk/sdk/r;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/beetalk/sdk/r;->e:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Lcom/beetalk/sdk/b;)V
    .locals 3

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/e;-><init>(Lcom/beetalk/sdk/b;)V

    new-instance v0, Lcom/beetalk/sdk/r$a;

    invoke-direct {v0, p0}, Lcom/beetalk/sdk/r$a;-><init>(Lcom/beetalk/sdk/r;)V

    iput-object v0, p0, Lcom/beetalk/sdk/r;->d:Lj/g/a/a/a/c;

    invoke-virtual {p1}, Lcom/beetalk/sdk/b;->e()Lcom/beetalk/sdk/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/beetalk/sdk/a;->a()Landroid/app/Activity;

    move-result-object p1

    iput-object p1, p0, Lcom/beetalk/sdk/r;->b:Landroid/app/Activity;

    new-instance v0, Lj/g/a/a/a/s$b;

    invoke-direct {v0, p1}, Lj/g/a/a/a/s$b;-><init>(Landroid/content/Context;)V

    new-instance v1, Lj/g/a/a/a/d;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Lj/g/a/a/a/d;-><init>(I)V

    invoke-virtual {v0, v1}, Lj/g/a/a/a/s$b;->c(Lj/g/a/a/a/h;)Lj/g/a/a/a/s$b;

    new-instance v1, Lj/g/a/a/a/p;

    invoke-static {p1}, Lcom/beetalk/sdk/x/d;->l(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Lcom/beetalk/sdk/x/d;->m(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Lj/g/a/a/a/p;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lj/g/a/a/a/s$b;->d(Lj/g/a/a/a/p;)Lj/g/a/a/a/s$b;

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Lj/g/a/a/a/s$b;->b(Z)Lj/g/a/a/a/s$b;

    invoke-virtual {v0}, Lj/g/a/a/a/s$b;->a()Lj/g/a/a/a/s;

    move-result-object p1

    invoke-static {p1}, Lj/g/a/a/a/m;->i(Lj/g/a/a/a/s;)V

    :try_start_0
    invoke-static {}, Lj/g/a/a/a/u;->f()Lj/g/a/a/a/u;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-static {}, Lj/g/a/a/a/m;->g()Lj/g/a/a/a/h;

    move-result-object v0

    sget-object v1, Lcom/beetalk/sdk/r;->e:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lj/g/a/a/a/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method static synthetic f(Lcom/beetalk/sdk/r;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/beetalk/sdk/r;->m(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic g(Lcom/beetalk/sdk/r;Lcom/garena/pay/android/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/r;->k(Lcom/garena/pay/android/b;)V

    return-void
.end method

.method static synthetic h(Lcom/beetalk/sdk/r;Lcom/beetalk/sdk/b$e;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/r;->l(Lcom/beetalk/sdk/b$e;)V

    return-void
.end method

.method private i(Ljava/lang/String;Ljava/lang/String;Lcom/beetalk/sdk/b$c;)V
    .locals 2

    invoke-virtual {p3}, Lcom/beetalk/sdk/b$c;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3}, Lcom/beetalk/sdk/b$c;->e()I

    move-result v1

    invoke-static {p1, p2, v0, v1}, Lcom/beetalk/sdk/z/i/b;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Li/i;

    move-result-object p1

    new-instance p2, Lcom/beetalk/sdk/r$b;

    invoke-direct {p2, p0, p3}, Lcom/beetalk/sdk/r$b;-><init>(Lcom/beetalk/sdk/r;Lcom/beetalk/sdk/b$c;)V

    invoke-virtual {p1, p2}, Li/i;->i(Li/g;)Li/i;

    return-void
.end method

.method private j()Lcom/twitter/sdk/android/core/identity/h;
    .locals 2

    iget-object v0, p0, Lcom/beetalk/sdk/r;->c:Lcom/twitter/sdk/android/core/identity/h;

    if-nez v0, :cond_1

    const-class v0, Lcom/beetalk/sdk/r;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/beetalk/sdk/r;->c:Lcom/twitter/sdk/android/core/identity/h;

    if-nez v1, :cond_0

    new-instance v1, Lcom/twitter/sdk/android/core/identity/h;

    invoke-direct {v1}, Lcom/twitter/sdk/android/core/identity/h;-><init>()V

    iput-object v1, p0, Lcom/beetalk/sdk/r;->c:Lcom/twitter/sdk/android/core/identity/h;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/beetalk/sdk/r;->c:Lcom/twitter/sdk/android/core/identity/h;

    return-object v0
.end method

.method private k(Lcom/garena/pay/android/b;)V
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    invoke-virtual {v0}, Lcom/beetalk/sdk/b;->i()Lcom/beetalk/sdk/b$c;

    move-result-object v0

    invoke-virtual {p1}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, p1}, Lcom/beetalk/sdk/b$e;->a(Lcom/beetalk/sdk/b$c;I)Lcom/beetalk/sdk/b$e;

    move-result-object p1

    iget-object v0, p0, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    invoke-virtual {v0, p1}, Lcom/beetalk/sdk/b;->k(Lcom/beetalk/sdk/b$e;)V

    return-void
.end method

.method private l(Lcom/beetalk/sdk/b$e;)V
    .locals 3

    if-eqz p1, :cond_2

    iget-object v0, p1, Lcom/beetalk/sdk/b$e;->b:Lcom/beetalk/sdk/u/a;

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/beetalk/sdk/g;->y()Lcom/beetalk/sdk/g;

    move-result-object v0

    iget-object v1, p0, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    invoke-virtual {v1}, Lcom/beetalk/sdk/b;->i()Lcom/beetalk/sdk/b$c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beetalk/sdk/b$c;->e()I

    move-result v1

    sget-object v2, Lcom/beetalk/sdk/p;->i:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v1, v2, :cond_0

    invoke-static {}, Lcom/beetalk/sdk/g;->w()Lcom/beetalk/sdk/g;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    invoke-virtual {v1}, Lcom/beetalk/sdk/b;->i()Lcom/beetalk/sdk/b$c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beetalk/sdk/b$c;->e()I

    move-result v1

    sget-object v2, Lcom/beetalk/sdk/p;->h:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v1, v2, :cond_1

    invoke-static {}, Lcom/beetalk/sdk/g;->x()Lcom/beetalk/sdk/g;

    move-result-object v0

    :cond_1
    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/beetalk/sdk/g;->v()Lcom/beetalk/sdk/t/k;

    move-result-object v0

    iget-object v1, p1, Lcom/beetalk/sdk/b$e;->b:Lcom/beetalk/sdk/u/a;

    invoke-virtual {v0, v1}, Lcom/beetalk/sdk/t/k;->l(Lcom/beetalk/sdk/u/a;)V

    :cond_2
    iget-object v0, p0, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    invoke-virtual {v0, p1}, Lcom/beetalk/sdk/b;->k(Lcom/beetalk/sdk/b$e;)V

    return-void
.end method

.method private m(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    invoke-virtual {v0}, Lcom/beetalk/sdk/b;->i()Lcom/beetalk/sdk/b$c;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/beetalk/sdk/r;->i(Ljava/lang/String;Ljava/lang/String;Lcom/beetalk/sdk/b$c;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    invoke-virtual {p1}, Lcom/beetalk/sdk/b;->i()Lcom/beetalk/sdk/b$c;

    move-result-object p1

    sget-object p2, Lcom/garena/pay/android/b;->t:Lcom/garena/pay/android/b;

    invoke-virtual {p2}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lcom/beetalk/sdk/b$e;->a(Lcom/beetalk/sdk/b$c;I)Lcom/beetalk/sdk/b$e;

    move-result-object p1

    iget-object p2, p0, Lcom/beetalk/sdk/e;->a:Lcom/beetalk/sdk/b;

    invoke-virtual {p2, p1}, Lcom/beetalk/sdk/b;->k(Lcom/beetalk/sdk/b$e;)V

    :goto_0
    return-void
.end method


# virtual methods
.method d(IILandroid/content/Intent;Lcom/beetalk/sdk/b$c;)Z
    .locals 0

    invoke-direct {p0}, Lcom/beetalk/sdk/r;->j()Lcom/twitter/sdk/android/core/identity/h;

    move-result-object p4

    invoke-virtual {p4}, Lcom/twitter/sdk/android/core/identity/h;->d()I

    move-result p4

    if-ne p1, p4, :cond_0

    invoke-direct {p0}, Lcom/beetalk/sdk/r;->j()Lcom/twitter/sdk/android/core/identity/h;

    move-result-object p4

    invoke-virtual {p4, p1, p2, p3}, Lcom/twitter/sdk/android/core/identity/h;->f(IILandroid/content/Intent;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method e(Lcom/beetalk/sdk/b$c;)Z
    .locals 3

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "Start Twitter auth"

    invoke-static {v2, v1}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-direct {p0}, Lcom/beetalk/sdk/r;->j()Lcom/twitter/sdk/android/core/identity/h;

    move-result-object p1

    iget-object v0, p0, Lcom/beetalk/sdk/r;->b:Landroid/app/Activity;

    iget-object v1, p0, Lcom/beetalk/sdk/r;->d:Lj/g/a/a/a/c;

    invoke-virtual {p1, v0, v1}, Lcom/twitter/sdk/android/core/identity/h;->a(Landroid/app/Activity;Lj/g/a/a/a/c;)V

    const/4 p1, 0x1

    return p1
.end method
