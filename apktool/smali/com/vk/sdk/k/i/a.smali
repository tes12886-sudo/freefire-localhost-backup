.class public abstract Lcom/vk/sdk/k/i/a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/vk/sdk/k/i/a$c;,
        Lcom/vk/sdk/k/i/a$d;,
        Lcom/vk/sdk/k/i/a$e;
    }
.end annotation


# instance fields
.field private a:Lcom/vk/sdk/k/i/a$d;

.field private b:Lcom/vk/sdk/k/i/a$e;

.field private c:Z

.field private d:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/vk/sdk/k/i/a$e;->a:Lcom/vk/sdk/k/i/a$e;

    iput-object v0, p0, Lcom/vk/sdk/k/i/a;->b:Lcom/vk/sdk/k/i/a$e;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/vk/sdk/k/i/a;->c:Z

    sget-object v0, Lcom/vk/sdk/k/i/a$e;->b:Lcom/vk/sdk/k/i/a$e;

    invoke-virtual {p0, v0}, Lcom/vk/sdk/k/i/a;->f(Lcom/vk/sdk/k/i/a$e;)V

    return-void
.end method

.method static synthetic a(Lcom/vk/sdk/k/i/a;)Lcom/vk/sdk/k/i/a$d;
    .locals 0

    iget-object p0, p0, Lcom/vk/sdk/k/i/a;->a:Lcom/vk/sdk/k/i/a$d;

    return-object p0
.end method

.method private d(Lcom/vk/sdk/k/i/a$e;Lcom/vk/sdk/k/i/a$e;Z)Z
    .locals 7

    sget-object v0, Lcom/vk/sdk/k/i/a$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v1, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq p1, v3, :cond_6

    const/4 v4, 0x2

    const/4 v5, 0x4

    if-eq p1, v4, :cond_4

    if-eq p1, v1, :cond_3

    if-eq p1, v5, :cond_3

    const/4 v6, 0x5

    if-eq p1, v6, :cond_0

    return v2

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    if-eq p1, v3, :cond_2

    if-eq p1, v4, :cond_2

    if-eq p1, v1, :cond_2

    if-eq p1, v5, :cond_1

    return v3

    :cond_1
    xor-int/lit8 p1, p3, 0x1

    return p1

    :cond_2
    return v2

    :cond_3
    return v3

    :cond_4
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    if-eq p1, v3, :cond_5

    if-eq p1, v1, :cond_5

    if-eq p1, v5, :cond_5

    return v3

    :cond_5
    return v2

    :cond_6
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    if-eq p1, v1, :cond_7

    sget-object p1, Lcom/vk/sdk/k/i/a$e;->b:Lcom/vk/sdk/k/i/a$e;

    if-eq p2, p1, :cond_7

    const/4 v2, 0x1

    :cond_7
    return v2
.end method


# virtual methods
.method public b()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/vk/sdk/k/i/a;->c:Z

    sget-object v0, Lcom/vk/sdk/k/i/a$e;->f:Lcom/vk/sdk/k/i/a$e;

    invoke-virtual {p0, v0}, Lcom/vk/sdk/k/i/a;->f(Lcom/vk/sdk/k/i/a$e;)V

    return-void
.end method

.method public c()V
    .locals 2

    new-instance v0, Lcom/vk/sdk/k/i/a$a;

    invoke-direct {v0, p0}, Lcom/vk/sdk/k/i/a$a;-><init>(Lcom/vk/sdk/k/i/a;)V

    iget-object v1, p0, Lcom/vk/sdk/k/i/a;->d:Ljava/util/concurrent/ExecutorService;

    if-eqz v1, :cond_0

    invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :goto_0
    return-void
.end method

.method protected e(Lcom/vk/sdk/k/i/a$d;)V
    .locals 0

    iput-object p1, p0, Lcom/vk/sdk/k/i/a;->a:Lcom/vk/sdk/k/i/a$d;

    return-void
.end method

.method protected f(Lcom/vk/sdk/k/i/a$e;)V
    .locals 2

    iget-object v0, p0, Lcom/vk/sdk/k/i/a;->b:Lcom/vk/sdk/k/i/a$e;

    iget-boolean v1, p0, Lcom/vk/sdk/k/i/a;->c:Z

    invoke-direct {p0, v0, p1, v1}, Lcom/vk/sdk/k/i/a;->d(Lcom/vk/sdk/k/i/a$e;Lcom/vk/sdk/k/i/a$e;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lcom/vk/sdk/k/i/a;->b:Lcom/vk/sdk/k/i/a$e;

    sget-object v0, Lcom/vk/sdk/k/i/a$e;->e:Lcom/vk/sdk/k/i/a$e;

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/vk/sdk/k/i/a$e;->f:Lcom/vk/sdk/k/i/a$e;

    if-ne p1, v0, :cond_2

    :cond_1
    invoke-virtual {p0}, Lcom/vk/sdk/k/i/a;->c()V

    :cond_2
    return-void
.end method

.method public g(Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    iput-object p1, p0, Lcom/vk/sdk/k/i/a;->d:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method protected h()Lcom/vk/sdk/k/i/a$e;
    .locals 1

    iget-object v0, p0, Lcom/vk/sdk/k/i/a;->b:Lcom/vk/sdk/k/i/a$e;

    return-object v0
.end method
