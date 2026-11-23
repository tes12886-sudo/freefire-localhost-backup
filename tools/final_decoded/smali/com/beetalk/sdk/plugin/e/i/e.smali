.class public Lcom/beetalk/sdk/plugin/e/i/e;
.super Lcom/beetalk/sdk/plugin/e/i/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/beetalk/sdk/plugin/e/i/a<",
        "Lcom/beetalk/sdk/b0/b;",
        "Lcom/beetalk/sdk/plugin/PluginResult;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/beetalk/sdk/plugin/e/i/a;-><init>()V

    return-void
.end method

.method static synthetic l(Lcom/beetalk/sdk/plugin/e/i/e;Landroid/app/Activity;Lcom/garena/pay/android/b;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/beetalk/sdk/plugin/e/i/e;->n(Landroid/app/Activity;Lcom/garena/pay/android/b;)V

    return-void
.end method

.method private n(Landroid/app/Activity;Lcom/garena/pay/android/b;)V
    .locals 2

    new-instance v0, Lcom/beetalk/sdk/plugin/PluginResult;

    invoke-direct {v0}, Lcom/beetalk/sdk/plugin/PluginResult;-><init>()V

    invoke-virtual {p0}, Lcom/beetalk/sdk/plugin/e/i/e;->d()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/beetalk/sdk/plugin/PluginResult;->source:Ljava/lang/String;

    const/4 v1, -0x1

    iput v1, v0, Lcom/beetalk/sdk/plugin/PluginResult;->status:I

    invoke-virtual {p2}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iput v1, v0, Lcom/beetalk/sdk/plugin/PluginResult;->flag:I

    invoke-virtual {p2}, Lcom/garena/pay/android/b;->e()Ljava/lang/String;

    move-result-object p2

    iput-object p2, v0, Lcom/beetalk/sdk/plugin/PluginResult;->message:Ljava/lang/String;

    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object p2

    invoke-virtual {p0}, Lcom/beetalk/sdk/plugin/e/i/e;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, p1, v1}, Lcom/beetalk/sdk/plugin/c;->n(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "vk.share"

    return-object v0
.end method

.method protected bridge synthetic j(Landroid/app/Activity;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/beetalk/sdk/b0/b;

    invoke-virtual {p0, p1, p2}, Lcom/beetalk/sdk/plugin/e/i/e;->m(Landroid/app/Activity;Lcom/beetalk/sdk/b0/b;)V

    return-void
.end method

.method protected m(Landroid/app/Activity;Lcom/beetalk/sdk/b0/b;)V
    .locals 6

    new-instance v0, Lcom/beetalk/sdk/plugin/e/i/c;

    invoke-direct {v0}, Lcom/beetalk/sdk/plugin/e/i/c;-><init>()V

    iget-object v1, p2, Lcom/beetalk/sdk/b0/b;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/beetalk/sdk/plugin/e/i/c;->d(Ljava/lang/CharSequence;)Lcom/beetalk/sdk/plugin/e/i/c;

    iget-object v1, p2, Lcom/beetalk/sdk/b0/b;->c:[B

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    array-length v3, v1

    if-lez v3, :cond_0

    :try_start_0
    array-length v3, v1

    invoke-static {v1, v2, v3}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_0

    const/4 v3, 0x1

    new-array v3, v3, [Lcom/vk/sdk/k/l/b;

    new-instance v4, Lcom/vk/sdk/k/l/b;

    const v5, 0x3f4ccccd    # 0.8f

    invoke-static {v5}, Lcom/vk/sdk/k/l/a;->e(F)Lcom/vk/sdk/k/l/a;

    move-result-object v5

    invoke-direct {v4, v1, v5}, Lcom/vk/sdk/k/l/b;-><init>(Landroid/graphics/Bitmap;Lcom/vk/sdk/k/l/a;)V

    aput-object v4, v3, v2

    invoke-virtual {v0, v3}, Lcom/beetalk/sdk/plugin/e/i/c;->a([Lcom/vk/sdk/k/l/b;)Lcom/beetalk/sdk/plugin/e/i/c;

    goto :goto_0

    :catch_0
    new-array p2, v2, [Ljava/lang/Object;

    const-string v0, "failed to decode bitmap from byte array"

    invoke-static {v0, p2}, Lcom/beetalk/sdk/x/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p2, Lcom/garena/pay/android/b;->h0:Lcom/garena/pay/android/b;

    invoke-direct {p0, p1, p2}, Lcom/beetalk/sdk/plugin/e/i/e;->n(Landroid/app/Activity;Lcom/garena/pay/android/b;)V

    return-void

    :cond_0
    :goto_0
    iget-object v1, p2, Lcom/beetalk/sdk/b0/b;->b:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object p2, p2, Lcom/beetalk/sdk/b0/b;->b:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1, p2}, Lcom/beetalk/sdk/plugin/e/i/c;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/beetalk/sdk/plugin/e/i/c;

    :cond_1
    new-instance p2, Lcom/beetalk/sdk/plugin/e/i/e$a;

    invoke-direct {p2, p0, p1}, Lcom/beetalk/sdk/plugin/e/i/e$a;-><init>(Lcom/beetalk/sdk/plugin/e/i/e;Landroid/app/Activity;)V

    invoke-virtual {v0, p2}, Lcom/beetalk/sdk/plugin/e/i/c;->c(Lcom/beetalk/sdk/plugin/e/i/c$a;)Lcom/beetalk/sdk/plugin/e/i/c;

    new-array p2, v2, [Ljava/lang/Object;

    const-string v1, "launching vk share dialog"

    invoke-static {v1, p2}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p1

    const-string p2, "VK_SHARE_DIALOG"

    invoke-virtual {v0, p1, p2}, Lcom/beetalk/sdk/plugin/e/i/c;->e(Landroid/app/FragmentManager;Ljava/lang/String;)V

    return-void
.end method
