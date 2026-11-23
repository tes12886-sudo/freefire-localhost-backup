.class Lcom/vk/sdk/k/h$b;
.super Lcom/vk/sdk/k/i/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/vk/sdk/k/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/vk/sdk/k/h$b$b;
    }
.end annotation


# instance fields
.field protected e:Lcom/vk/sdk/k/i/a;

.field final synthetic f:Lcom/vk/sdk/k/h;


# direct methods
.method private constructor <init>(Lcom/vk/sdk/k/h;)V
    .locals 0

    iput-object p1, p0, Lcom/vk/sdk/k/h$b;->f:Lcom/vk/sdk/k/h;

    invoke-direct {p0}, Lcom/vk/sdk/k/i/a;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/vk/sdk/k/h;Lcom/vk/sdk/k/h$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/vk/sdk/k/h$b;-><init>(Lcom/vk/sdk/k/h;)V

    return-void
.end method

.method static synthetic i(Lcom/vk/sdk/k/h$b;Lcom/vk/sdk/k/i/a$e;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/vk/sdk/k/i/a;->f(Lcom/vk/sdk/k/i/a$e;)V

    return-void
.end method

.method static synthetic j(Lcom/vk/sdk/k/h$b;Lcom/vk/sdk/k/i/a$e;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/vk/sdk/k/i/a;->f(Lcom/vk/sdk/k/i/a$e;)V

    return-void
.end method

.method static synthetic k(Lcom/vk/sdk/k/h$b;Lcom/vk/sdk/k/i/a$e;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/vk/sdk/k/i/a;->f(Lcom/vk/sdk/k/i/a$e;)V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/vk/sdk/k/h$b;->e:Lcom/vk/sdk/k/i/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/vk/sdk/k/i/a;->b()V

    :cond_0
    invoke-super {p0}, Lcom/vk/sdk/k/i/a;->b()V

    return-void
.end method

.method public c()V
    .locals 1

    invoke-super {p0}, Lcom/vk/sdk/k/i/a;->c()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/vk/sdk/k/h$b;->e:Lcom/vk/sdk/k/i/a;

    return-void
.end method

.method public g(Ljava/util/concurrent/ExecutorService;)V
    .locals 2

    invoke-super {p0, p1}, Lcom/vk/sdk/k/i/a;->g(Ljava/util/concurrent/ExecutorService;)V

    iget-object p1, p0, Lcom/vk/sdk/k/h$b;->f:Lcom/vk/sdk/k/h;

    iget-object v0, p1, Lcom/vk/sdk/k/f;->o:Lcom/vk/sdk/k/f$d;

    new-instance v1, Lcom/vk/sdk/k/h$b$a;

    invoke-direct {v1, p0, v0}, Lcom/vk/sdk/k/h$b$a;-><init>(Lcom/vk/sdk/k/h$b;Lcom/vk/sdk/k/f$d;)V

    iput-object v1, p1, Lcom/vk/sdk/k/f;->o:Lcom/vk/sdk/k/f$d;

    sget-object p1, Lcom/vk/sdk/k/i/a$e;->c:Lcom/vk/sdk/k/i/a$e;

    invoke-virtual {p0, p1}, Lcom/vk/sdk/k/i/a;->f(Lcom/vk/sdk/k/i/a$e;)V

    iget-object p1, p0, Lcom/vk/sdk/k/h$b;->f:Lcom/vk/sdk/k/h;

    invoke-virtual {p1}, Lcom/vk/sdk/k/h;->G()Lcom/vk/sdk/k/f;

    move-result-object p1

    new-instance v0, Lcom/vk/sdk/k/h$b$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/vk/sdk/k/h$b$b;-><init>(Lcom/vk/sdk/k/h$b;Lcom/vk/sdk/k/h$a;)V

    invoke-virtual {p1, v0}, Lcom/vk/sdk/k/f;->D(Lcom/vk/sdk/k/f$d;)V

    invoke-virtual {p1}, Lcom/vk/sdk/k/f;->s()Lcom/vk/sdk/k/i/a;

    move-result-object p1

    iput-object p1, p0, Lcom/vk/sdk/k/h$b;->e:Lcom/vk/sdk/k/i/a;

    invoke-static {p1}, Lcom/vk/sdk/k/i/b;->c(Lcom/vk/sdk/k/i/a;)V

    return-void
.end method
