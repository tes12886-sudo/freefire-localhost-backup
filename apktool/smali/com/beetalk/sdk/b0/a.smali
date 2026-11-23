.class public Lcom/beetalk/sdk/b0/a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beetalk/sdk/b0/a$d;
    }
.end annotation


# static fields
.field private static final c:[Ljava/lang/String;


# instance fields
.field private final a:Landroid/app/Activity;

.field private b:Lcom/beetalk/sdk/b0/a$d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "wall"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "photos"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "friends"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "offline"

    aput-object v2, v0, v1

    sput-object v0, Lcom/beetalk/sdk/b0/a;->c:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/beetalk/sdk/b0/a;->a:Landroid/app/Activity;

    return-void
.end method

.method static synthetic a(Lcom/beetalk/sdk/b0/a;)Landroid/app/Activity;
    .locals 0

    iget-object p0, p0, Lcom/beetalk/sdk/b0/a;->a:Landroid/app/Activity;

    return-object p0
.end method

.method static synthetic b(Lcom/beetalk/sdk/b0/a;Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/b0/a;->i(Landroid/app/Activity;)V

    return-void
.end method

.method static synthetic c(Lcom/beetalk/sdk/b0/a;Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/b0/a;->h(Landroid/app/Activity;)V

    return-void
.end method

.method static synthetic d(Lcom/beetalk/sdk/b0/a;)Lcom/beetalk/sdk/b0/a$d;
    .locals 0

    iget-object p0, p0, Lcom/beetalk/sdk/b0/a;->b:Lcom/beetalk/sdk/b0/a$d;

    return-object p0
.end method

.method private h(Landroid/app/Activity;)V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "vk login required, start login"

    invoke-static {v1, v0}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v0, Lcom/beetalk/sdk/b0/a;->c:[Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/vk/sdk/i;->n(Landroid/app/Activity;[Ljava/lang/String;)V

    return-void
.end method

.method private i(Landroid/app/Activity;)V
    .locals 5

    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/Object;

    sget-object v2, Lcom/beetalk/sdk/b0/a;->c:[Ljava/lang/String;

    invoke-static {v2}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v1, v4

    const-string v3, "vk verifying scopes: %s"

    invoke-static {v3, v1}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Lcom/vk/sdk/e;->b()Lcom/vk/sdk/e;

    move-result-object v1

    if-eqz v1, :cond_0

    :try_start_0
    invoke-virtual {v1, v2}, Lcom/vk/sdk/e;->c([Ljava/lang/String;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_0

    goto :goto_0

    :catch_0
    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    new-array p1, v4, [Ljava/lang/Object;

    const-string v0, "vk scopes verified"

    invoke-static {v0, p1}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/beetalk/sdk/b0/a;->b:Lcom/beetalk/sdk/b0/a$d;

    if-eqz p1, :cond_2

    invoke-interface {p1}, Lcom/beetalk/sdk/b0/a$d;->b()V

    goto :goto_1

    :cond_1
    new-array v0, v4, [Ljava/lang/Object;

    const-string v1, "vk scopes verification failed"

    invoke-static {v1, v0}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/b0/a;->h(Landroid/app/Activity;)V

    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method public e(ILandroid/content/Intent;)Z
    .locals 2

    sget-object v0, Lcom/vk/sdk/VKServiceActivity$c;->b:Lcom/vk/sdk/VKServiceActivity$c;

    invoke-virtual {v0}, Lcom/vk/sdk/VKServiceActivity$c;->a()I

    move-result v0

    new-instance v1, Lcom/beetalk/sdk/b0/a$b;

    invoke-direct {v1, p0}, Lcom/beetalk/sdk/b0/a$b;-><init>(Lcom/beetalk/sdk/b0/a;)V

    invoke-static {v0, p1, p2, v1}, Lcom/vk/sdk/i;->s(IILandroid/content/Intent;Lcom/vk/sdk/g;)Z

    move-result p1

    return p1
.end method

.method public f(Lcom/beetalk/sdk/b0/a$d;)V
    .locals 0

    iput-object p1, p0, Lcom/beetalk/sdk/b0/a;->b:Lcom/beetalk/sdk/b0/a$d;

    return-void
.end method

.method public g()V
    .locals 2

    iget-object v0, p0, Lcom/beetalk/sdk/b0/a;->a:Landroid/app/Activity;

    new-instance v1, Lcom/beetalk/sdk/b0/a$a;

    invoke-direct {v1, p0}, Lcom/beetalk/sdk/b0/a$a;-><init>(Lcom/beetalk/sdk/b0/a;)V

    invoke-static {v0, v1}, Lcom/vk/sdk/i;->B(Landroid/content/Context;Lcom/vk/sdk/g;)Z

    return-void
.end method
