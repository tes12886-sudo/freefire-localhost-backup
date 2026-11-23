.class public Lcom/facebook/login/b;
.super Lh/d/b/e;
.source ""


# static fields
.field private static b:Lh/d/b/c;

.field private static c:Lh/d/b/f;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lh/d/b/e;-><init>()V

    return-void
.end method

.method public static c()Lh/d/b/f;
    .locals 2

    sget-object v0, Lcom/facebook/login/b;->c:Lh/d/b/f;

    const/4 v1, 0x0

    sput-object v1, Lcom/facebook/login/b;->c:Lh/d/b/f;

    return-object v0
.end method

.method public static d(Landroid/net/Uri;)V
    .locals 2

    sget-object v0, Lcom/facebook/login/b;->c:Lh/d/b/f;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/facebook/login/b;->e()V

    :cond_0
    sget-object v0, Lcom/facebook/login/b;->c:Lh/d/b/f;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1, v1}, Lh/d/b/f;->f(Landroid/net/Uri;Landroid/os/Bundle;Ljava/util/List;)Z

    :cond_1
    return-void
.end method

.method private static e()V
    .locals 2

    sget-object v0, Lcom/facebook/login/b;->c:Lh/d/b/f;

    if-nez v0, :cond_0

    sget-object v0, Lcom/facebook/login/b;->b:Lh/d/b/c;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lh/d/b/c;->d(Lh/d/b/b;)Lh/d/b/f;

    move-result-object v0

    sput-object v0, Lcom/facebook/login/b;->c:Lh/d/b/f;

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Landroid/content/ComponentName;Lh/d/b/c;)V
    .locals 2

    sput-object p2, Lcom/facebook/login/b;->b:Lh/d/b/c;

    const-wide/16 v0, 0x0

    invoke-virtual {p2, v0, v1}, Lh/d/b/c;->f(J)Z

    invoke-static {}, Lcom/facebook/login/b;->e()V

    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 0

    return-void
.end method
