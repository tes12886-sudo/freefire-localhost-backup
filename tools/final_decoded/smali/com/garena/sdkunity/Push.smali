.class public Lcom/garena/sdkunity/Push;
.super Lj/c/a/a;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lj/c/a/a;-><init>()V

    return-void
.end method


# virtual methods
.method protected getPushAppKey()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/garena/sdkunity/SdkUnity;->pushAppKey:Ljava/lang/String;

    return-object v0
.end method

.method public registerPush(Landroid/app/Activity;)V
    .locals 4

    new-instance v0, Lj/c/a/f/b;

    invoke-direct {v0}, Lj/c/a/f/b;-><init>()V

    sget-object v1, Lcom/garena/sdkunity/SdkUnity;->appId:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lj/c/a/f/b;->c(Ljava/lang/Integer;)Lj/c/a/f/b;

    sget-object v1, Lcom/garena/sdkunity/SdkUnity;->pushAppKey:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lj/c/a/f/b;->d(Ljava/lang/String;)Lj/c/a/f/b;

    invoke-static {}, Lcom/beetalk/sdk/g;->y()Lcom/beetalk/sdk/g;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/beetalk/sdk/g;->G()Lcom/beetalk/sdk/q;

    move-result-object v2

    sget-object v3, Lcom/beetalk/sdk/q;->c:Lcom/beetalk/sdk/q;

    if-ne v2, v3, :cond_0

    invoke-virtual {v1}, Lcom/beetalk/sdk/g;->C()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lj/c/a/f/b;->b(Ljava/lang/String;)Lj/c/a/f/b;

    const-string v1, "gender:male"

    invoke-virtual {v0, v1}, Lj/c/a/f/b;->e(Ljava/lang/String;)Lj/c/a/f/b;

    :cond_0
    invoke-virtual {v0}, Lj/c/a/f/b;->a()Lj/c/a/f/a;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/beetalk/sdk/i;->g(Landroid/app/Activity;Lj/c/a/f/a;)V

    return-void
.end method
