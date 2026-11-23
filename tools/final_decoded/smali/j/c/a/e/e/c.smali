.class public Lj/c/a/e/e/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj/c/a/e/f/c;


# instance fields
.field private final a:Landroid/content/Context;

.field private b:Lj/c/a/e/f/d;

.field private c:Lj/c/a/e/f/b;

.field private d:Lj/c/a/e/c;

.field private e:I

.field private final f:Lj/c/a/e/g/b;

.field private g:Lj/c/a/e/g/b;

.field private h:Lj/c/a/e/g/b;

.field private i:Lj/c/a/e/g/b;

.field private final j:Lj/c/a/e/g/b;

.field private final k:Lj/c/a/e/g/b;

.field private final l:Lj/c/a/e/g/b;

.field private m:Lj/c/a/e/g/b;

.field private n:Lj/c/a/e/l/b$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x7530

    iput v0, p0, Lj/c/a/e/e/c;->e:I

    new-instance v0, Lj/c/a/e/e/c$a;

    invoke-direct {v0, p0}, Lj/c/a/e/e/c$a;-><init>(Lj/c/a/e/e/c;)V

    iput-object v0, p0, Lj/c/a/e/e/c;->f:Lj/c/a/e/g/b;

    new-instance v0, Lj/c/a/e/e/c$b;

    invoke-direct {v0, p0}, Lj/c/a/e/e/c$b;-><init>(Lj/c/a/e/e/c;)V

    iput-object v0, p0, Lj/c/a/e/e/c;->g:Lj/c/a/e/g/b;

    new-instance v0, Lj/c/a/e/e/c$c;

    invoke-direct {v0, p0}, Lj/c/a/e/e/c$c;-><init>(Lj/c/a/e/e/c;)V

    iput-object v0, p0, Lj/c/a/e/e/c;->h:Lj/c/a/e/g/b;

    new-instance v0, Lj/c/a/e/e/c$d;

    invoke-direct {v0, p0}, Lj/c/a/e/e/c$d;-><init>(Lj/c/a/e/e/c;)V

    iput-object v0, p0, Lj/c/a/e/e/c;->i:Lj/c/a/e/g/b;

    new-instance v0, Lj/c/a/e/e/c$e;

    invoke-direct {v0, p0}, Lj/c/a/e/e/c$e;-><init>(Lj/c/a/e/e/c;)V

    iput-object v0, p0, Lj/c/a/e/e/c;->j:Lj/c/a/e/g/b;

    new-instance v0, Lj/c/a/e/e/c$f;

    invoke-direct {v0, p0}, Lj/c/a/e/e/c$f;-><init>(Lj/c/a/e/e/c;)V

    iput-object v0, p0, Lj/c/a/e/e/c;->k:Lj/c/a/e/g/b;

    new-instance v0, Lj/c/a/e/e/c$g;

    invoke-direct {v0, p0}, Lj/c/a/e/e/c$g;-><init>(Lj/c/a/e/e/c;)V

    iput-object v0, p0, Lj/c/a/e/e/c;->l:Lj/c/a/e/g/b;

    new-instance v0, Lj/c/a/e/e/c$h;

    invoke-direct {v0, p0}, Lj/c/a/e/e/c$h;-><init>(Lj/c/a/e/e/c;)V

    iput-object v0, p0, Lj/c/a/e/e/c;->m:Lj/c/a/e/g/b;

    new-instance v0, Lj/c/a/e/e/c$i;

    invoke-direct {v0, p0}, Lj/c/a/e/e/c$i;-><init>(Lj/c/a/e/e/c;)V

    iput-object v0, p0, Lj/c/a/e/e/c;->n:Lj/c/a/e/l/b$a;

    iput-object p1, p0, Lj/c/a/e/e/c;->a:Landroid/content/Context;

    new-instance p1, Lj/c/a/e/c;

    invoke-direct {p1, p0}, Lj/c/a/e/c;-><init>(Lj/c/a/e/f/c;)V

    iput-object p1, p0, Lj/c/a/e/e/c;->d:Lj/c/a/e/c;

    invoke-direct {p0}, Lj/c/a/e/e/c;->x()V

    return-void
.end method

.method private A()V
    .locals 1

    const-string v0, "SCHEDULE_PING_ALARM"

    invoke-static {v0}, Lj/c/a/e/l/b;->d(Ljava/lang/String;)V

    iget-object v0, p0, Lj/c/a/e/e/c;->a:Landroid/content/Context;

    invoke-static {v0}, Lj/c/a/e/l/a;->f(Landroid/content/Context;)V

    iget-object v0, p0, Lj/c/a/e/e/c;->a:Landroid/content/Context;

    invoke-static {v0}, Lj/c/a/e/l/a;->e(Landroid/content/Context;)V

    return-void
.end method

.method private B(I)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SCHEDULE_WAKE_CONNECT : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lj/c/a/e/l/b;->d(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lj/c/a/e/l/b;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lj/c/a/e/e/c;->a:Landroid/content/Context;

    invoke-static {v0}, Lj/c/a/e/l/a;->b(Landroid/content/Context;)V

    iget-object v0, p0, Lj/c/a/e/e/c;->a:Landroid/content/Context;

    invoke-static {v0}, Lj/c/a/e/l/a;->a(Landroid/content/Context;)V

    iget-object v0, p0, Lj/c/a/e/e/c;->a:Landroid/content/Context;

    invoke-static {v0, p1}, Lj/c/a/e/l/a;->g(Landroid/content/Context;I)V

    return-void
.end method

.method private C()V
    .locals 2

    invoke-static {}, Lj/c/a/e/l/e;->b()Lj/c/a/e/f/l/b;

    move-result-object v0

    iget-object v1, p0, Lj/c/a/e/e/c;->c:Lj/c/a/e/f/b;

    invoke-interface {v1, v0}, Lj/c/a/e/f/b;->c(Lj/c/a/e/f/l/b;)V

    return-void
.end method

.method private D()V
    .locals 2

    invoke-static {}, Lj/c/a/e/l/e;->f()Lj/c/a/e/f/l/b;

    move-result-object v0

    iget-object v1, p0, Lj/c/a/e/e/c;->c:Lj/c/a/e/f/b;

    invoke-interface {v1, v0}, Lj/c/a/e/f/b;->c(Lj/c/a/e/f/l/b;)V

    return-void
.end method

.method static synthetic f(Lj/c/a/e/e/c;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lj/c/a/e/e/c;->a:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic g(Lj/c/a/e/e/c;)V
    .locals 0

    invoke-direct {p0}, Lj/c/a/e/e/c;->s()V

    return-void
.end method

.method static synthetic h(Lj/c/a/e/e/c;)V
    .locals 0

    invoke-direct {p0}, Lj/c/a/e/e/c;->q()V

    return-void
.end method

.method static synthetic i(Lj/c/a/e/e/c;)Z
    .locals 0

    invoke-direct {p0}, Lj/c/a/e/e/c;->v()Z

    move-result p0

    return p0
.end method

.method static synthetic j(Lj/c/a/e/e/c;)Lj/c/a/e/f/d;
    .locals 0

    iget-object p0, p0, Lj/c/a/e/e/c;->b:Lj/c/a/e/f/d;

    return-object p0
.end method

.method static synthetic k(Lj/c/a/e/e/c;I)V
    .locals 0

    invoke-direct {p0, p1}, Lj/c/a/e/e/c;->B(I)V

    return-void
.end method

.method static synthetic l(Lj/c/a/e/e/c;)V
    .locals 0

    invoke-direct {p0}, Lj/c/a/e/e/c;->w()V

    return-void
.end method

.method static synthetic m(Lj/c/a/e/e/c;)Lj/c/a/e/f/b;
    .locals 0

    iget-object p0, p0, Lj/c/a/e/e/c;->c:Lj/c/a/e/f/b;

    return-object p0
.end method

.method static synthetic n(Lj/c/a/e/e/c;)V
    .locals 0

    invoke-direct {p0}, Lj/c/a/e/e/c;->r()V

    return-void
.end method

.method static synthetic o(Lj/c/a/e/e/c;)I
    .locals 0

    invoke-direct {p0}, Lj/c/a/e/e/c;->u()I

    move-result p0

    return p0
.end method

.method private q()V
    .locals 2

    iget-object v0, p0, Lj/c/a/e/e/c;->b:Lj/c/a/e/f/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/os/HandlerThread;->isAlive()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    new-instance v0, Lj/c/a/e/f/d;

    iget-object v1, p0, Lj/c/a/e/e/c;->d:Lj/c/a/e/c;

    invoke-direct {v0, v1}, Lj/c/a/e/f/d;-><init>(Lj/c/a/e/f/c;)V

    iput-object v0, p0, Lj/c/a/e/e/c;->b:Lj/c/a/e/f/d;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    iget-object v0, p0, Lj/c/a/e/e/c;->b:Lj/c/a/e/f/d;

    iget-object v1, p0, Lj/c/a/e/e/c;->n:Lj/c/a/e/l/b$a;

    invoke-virtual {v0, v1}, Landroid/os/HandlerThread;->setUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    iget-object v0, p0, Lj/c/a/e/e/c;->b:Lj/c/a/e/f/d;

    invoke-virtual {v0}, Lj/c/a/e/f/d;->j()Lj/c/a/e/f/b;

    move-result-object v0

    iput-object v0, p0, Lj/c/a/e/e/c;->c:Lj/c/a/e/f/b;

    :cond_1
    iget-object v0, p0, Lj/c/a/e/e/c;->c:Lj/c/a/e/f/b;

    invoke-interface {v0}, Lj/c/a/e/f/b;->d()V

    return-void
.end method

.method private r()V
    .locals 2

    iget-object v0, p0, Lj/c/a/e/e/c;->b:Lj/c/a/e/f/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/os/HandlerThread;->isAlive()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    new-instance v0, Lj/c/a/e/f/d;

    iget-object v1, p0, Lj/c/a/e/e/c;->d:Lj/c/a/e/c;

    invoke-direct {v0, v1}, Lj/c/a/e/f/d;-><init>(Lj/c/a/e/f/c;)V

    iput-object v0, p0, Lj/c/a/e/e/c;->b:Lj/c/a/e/f/d;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    iget-object v0, p0, Lj/c/a/e/e/c;->b:Lj/c/a/e/f/d;

    iget-object v1, p0, Lj/c/a/e/e/c;->n:Lj/c/a/e/l/b$a;

    invoke-virtual {v0, v1}, Landroid/os/HandlerThread;->setUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    iget-object v0, p0, Lj/c/a/e/e/c;->b:Lj/c/a/e/f/d;

    invoke-virtual {v0}, Lj/c/a/e/f/d;->j()Lj/c/a/e/f/b;

    move-result-object v0

    iput-object v0, p0, Lj/c/a/e/e/c;->c:Lj/c/a/e/f/b;

    :cond_1
    iget-object v0, p0, Lj/c/a/e/e/c;->c:Lj/c/a/e/f/b;

    invoke-interface {v0}, Lj/c/a/e/f/b;->a()V

    return-void
.end method

.method private s()V
    .locals 2

    iget-object v0, p0, Lj/c/a/e/e/c;->b:Lj/c/a/e/f/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/os/HandlerThread;->isAlive()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    new-instance v0, Lj/c/a/e/f/d;

    iget-object v1, p0, Lj/c/a/e/e/c;->d:Lj/c/a/e/c;

    invoke-direct {v0, v1}, Lj/c/a/e/f/d;-><init>(Lj/c/a/e/f/c;)V

    iput-object v0, p0, Lj/c/a/e/e/c;->b:Lj/c/a/e/f/d;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    iget-object v0, p0, Lj/c/a/e/e/c;->b:Lj/c/a/e/f/d;

    iget-object v1, p0, Lj/c/a/e/e/c;->n:Lj/c/a/e/l/b$a;

    invoke-virtual {v0, v1}, Landroid/os/HandlerThread;->setUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    iget-object v0, p0, Lj/c/a/e/e/c;->b:Lj/c/a/e/f/d;

    invoke-virtual {v0}, Lj/c/a/e/f/d;->j()Lj/c/a/e/f/b;

    move-result-object v0

    iput-object v0, p0, Lj/c/a/e/e/c;->c:Lj/c/a/e/f/b;

    :cond_1
    iget-object v0, p0, Lj/c/a/e/e/c;->c:Lj/c/a/e/f/b;

    invoke-interface {v0}, Lj/c/a/e/f/b;->f()V

    return-void
.end method

.method private u()I
    .locals 2

    iget v0, p0, Lj/c/a/e/e/c;->e:I

    const v1, 0x927c0

    if-le v0, v1, :cond_0

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    mul-int/lit8 v0, v0, 0x2

    iput v0, p0, Lj/c/a/e/e/c;->e:I

    return v1
.end method

.method private v()Z
    .locals 1

    iget-object v0, p0, Lj/c/a/e/e/c;->b:Lj/c/a/e/f/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lj/c/a/e/e/c;->c:Lj/c/a/e/f/b;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private w()V
    .locals 1

    const-string v0, "NOTIFY_INTERNET_DISCONNECTED"

    invoke-static {v0}, Lj/c/a/e/l/b;->d(Ljava/lang/String;)V

    invoke-static {v0}, Lj/c/a/e/l/b;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lj/c/a/e/e/c;->a:Landroid/content/Context;

    invoke-static {v0}, Lj/c/a/e/l/a;->b(Landroid/content/Context;)V

    iget-object v0, p0, Lj/c/a/e/e/c;->a:Landroid/content/Context;

    invoke-static {v0}, Lj/c/a/e/l/a;->a(Landroid/content/Context;)V

    invoke-static {}, Lj/c/a/e/a;->a()Lj/c/a/e/e/a;

    move-result-object v0

    invoke-virtual {v0}, Lj/c/a/e/e/a;->b()V

    return-void
.end method

.method private x()V
    .locals 3

    invoke-static {}, Lj/c/a/e/a;->b()Lj/c/a/e/g/a;

    move-result-object v0

    iget-object v1, p0, Lj/c/a/e/e/c;->g:Lj/c/a/e/g/b;

    const-string v2, "WAKE_CONNECT"

    invoke-virtual {v0, v2, v1}, Lj/c/a/e/g/a;->c(Ljava/lang/String;Lj/c/a/e/g/b;)V

    invoke-static {}, Lj/c/a/e/a;->b()Lj/c/a/e/g/a;

    move-result-object v0

    iget-object v1, p0, Lj/c/a/e/e/c;->h:Lj/c/a/e/g/b;

    const-string v2, "SHORT_PING"

    invoke-virtual {v0, v2, v1}, Lj/c/a/e/g/a;->c(Ljava/lang/String;Lj/c/a/e/g/b;)V

    invoke-static {}, Lj/c/a/e/a;->b()Lj/c/a/e/g/a;

    move-result-object v0

    iget-object v1, p0, Lj/c/a/e/e/c;->i:Lj/c/a/e/g/b;

    const-string v2, "LONG_PING"

    invoke-virtual {v0, v2, v1}, Lj/c/a/e/g/a;->c(Ljava/lang/String;Lj/c/a/e/g/b;)V

    invoke-static {}, Lj/c/a/e/a;->b()Lj/c/a/e/g/a;

    move-result-object v0

    iget-object v1, p0, Lj/c/a/e/e/c;->k:Lj/c/a/e/g/b;

    const-string v2, "CONNECT_NOTIFICATION_SERVER"

    invoke-virtual {v0, v2, v1}, Lj/c/a/e/g/a;->c(Ljava/lang/String;Lj/c/a/e/g/b;)V

    invoke-static {}, Lj/c/a/e/a;->b()Lj/c/a/e/g/a;

    move-result-object v0

    iget-object v1, p0, Lj/c/a/e/e/c;->l:Lj/c/a/e/g/b;

    const-string v2, "ACK_PUSH_MSG"

    invoke-virtual {v0, v2, v1}, Lj/c/a/e/g/a;->c(Ljava/lang/String;Lj/c/a/e/g/b;)V

    invoke-static {}, Lj/c/a/e/a;->b()Lj/c/a/e/g/a;

    move-result-object v0

    iget-object v1, p0, Lj/c/a/e/e/c;->m:Lj/c/a/e/g/b;

    const-string v2, "PERFORM_PING"

    invoke-virtual {v0, v2, v1}, Lj/c/a/e/g/a;->c(Ljava/lang/String;Lj/c/a/e/g/b;)V

    invoke-static {}, Lj/c/a/e/a;->b()Lj/c/a/e/g/a;

    move-result-object v0

    iget-object v1, p0, Lj/c/a/e/e/c;->j:Lj/c/a/e/g/b;

    const-string v2, "CONNECT_AUTHENTICATION_SERVER"

    invoke-virtual {v0, v2, v1}, Lj/c/a/e/g/a;->c(Ljava/lang/String;Lj/c/a/e/g/b;)V

    invoke-static {}, Lj/c/a/e/a;->b()Lj/c/a/e/g/a;

    move-result-object v0

    iget-object v1, p0, Lj/c/a/e/e/c;->f:Lj/c/a/e/g/b;

    const-string v2, "RECONNECT_WHEN_INVALID_GIP_RECEIVED"

    invoke-virtual {v0, v2, v1}, Lj/c/a/e/g/a;->c(Ljava/lang/String;Lj/c/a/e/g/b;)V

    return-void
.end method

.method private y()V
    .locals 2

    invoke-static {}, Lj/c/a/e/i/a;->d()J

    move-result-wide v0

    invoke-static {v0, v1}, Lj/c/a/e/l/e;->c(J)Lj/c/a/e/f/l/b;

    move-result-object v0

    iget-object v1, p0, Lj/c/a/e/e/c;->c:Lj/c/a/e/f/b;

    invoke-interface {v1, v0}, Lj/c/a/e/f/b;->c(Lj/c/a/e/f/l/b;)V

    return-void
.end method

.method private z()V
    .locals 1

    const/16 v0, 0x7530

    iput v0, p0, Lj/c/a/e/e/c;->e:I

    return-void
.end method


# virtual methods
.method public E()V
    .locals 1

    const/16 v0, 0x2710

    invoke-direct {p0, v0}, Lj/c/a/e/e/c;->B(I)V

    return-void
.end method

.method public a(I)V
    .locals 1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lj/c/a/e/e/c;->a:Landroid/content/Context;

    invoke-static {p1}, Lj/c/a/e/l/c;->d(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lj/c/a/e/e/c;->u()I

    move-result p1

    invoke-direct {p0, p1}, Lj/c/a/e/e/c;->B(I)V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lj/c/a/e/e/c;->w()V

    :goto_0
    return-void
.end method

.method public b(I)V
    .locals 1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lj/c/a/e/e/c;->a:Landroid/content/Context;

    invoke-static {p1}, Lj/c/a/e/l/c;->d(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lj/c/a/e/e/c;->u()I

    move-result p1

    invoke-direct {p0, p1}, Lj/c/a/e/e/c;->B(I)V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lj/c/a/e/e/c;->w()V

    :goto_0
    return-void
.end method

.method public c(I)V
    .locals 1

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "onConnectionOK, sendRegionPacket()"

    invoke-static {p1}, Lj/c/a/e/l/b;->a(Ljava/lang/String;)V

    invoke-direct {p0}, Lj/c/a/e/e/c;->D()V

    goto :goto_0

    :cond_1
    const-string p1, "onConnectionOK, requestNotification()"

    invoke-static {p1}, Lj/c/a/e/l/b;->a(Ljava/lang/String;)V

    invoke-direct {p0}, Lj/c/a/e/e/c;->y()V

    invoke-direct {p0}, Lj/c/a/e/e/c;->A()V

    invoke-direct {p0}, Lj/c/a/e/e/c;->z()V

    goto :goto_0

    :cond_2
    const-string p1, "onConnectionOK, sendAuthPacket()"

    invoke-static {p1}, Lj/c/a/e/l/b;->a(Ljava/lang/String;)V

    invoke-direct {p0}, Lj/c/a/e/e/c;->C()V

    :goto_0
    return-void
.end method

.method public d(Lj/c/a/e/f/l/b;)V
    .locals 0

    iget-object p1, p0, Lj/c/a/e/e/c;->a:Landroid/content/Context;

    invoke-static {p1}, Lj/c/a/e/l/c;->d(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lj/c/a/e/e/c;->u()I

    move-result p1

    invoke-direct {p0, p1}, Lj/c/a/e/e/c;->B(I)V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lj/c/a/e/e/c;->w()V

    :goto_0
    return-void
.end method

.method public e(Lj/c/a/e/f/l/b;)V
    .locals 0

    invoke-static {p1}, Lj/c/a/e/f/f;->c(Lj/c/a/e/f/l/b;)V

    return-void
.end method

.method public p()V
    .locals 1

    iget-object v0, p0, Lj/c/a/e/e/c;->a:Landroid/content/Context;

    invoke-static {v0}, Lj/c/a/e/l/a;->a(Landroid/content/Context;)V

    iget-object v0, p0, Lj/c/a/e/e/c;->a:Landroid/content/Context;

    invoke-static {v0}, Lj/c/a/e/l/a;->b(Landroid/content/Context;)V

    iget-object v0, p0, Lj/c/a/e/e/c;->a:Landroid/content/Context;

    invoke-static {v0}, Lj/c/a/e/l/a;->c(Landroid/content/Context;)V

    return-void
.end method

.method public t()V
    .locals 1

    invoke-static {}, Lj/c/a/e/a;->b()Lj/c/a/e/g/a;

    move-result-object v0

    invoke-virtual {v0}, Lj/c/a/e/g/a;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, Lj/c/a/e/e/c;->d:Lj/c/a/e/c;

    iget-object v0, p0, Lj/c/a/e/e/c;->b:Lj/c/a/e/f/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lj/c/a/e/f/d;->quit()Z

    :cond_0
    return-void
.end method
