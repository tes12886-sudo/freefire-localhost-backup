.class public abstract Lcom/beetalk/sdk/plugin/e/i/a;
.super Lcom/beetalk/sdk/plugin/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Ljava/lang/Object;",
        "T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/beetalk/sdk/plugin/a<",
        "TS;TT;>;"
    }
.end annotation


# instance fields
.field private a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TS;"
        }
    .end annotation
.end field

.field private b:Lcom/beetalk/sdk/b0/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/beetalk/sdk/plugin/a;-><init>()V

    return-void
.end method

.method static synthetic i(Lcom/beetalk/sdk/plugin/e/i/a;Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/beetalk/sdk/plugin/e/i/a;->k(Landroid/app/Activity;)V

    return-void
.end method

.method private k(Landroid/app/Activity;)V
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/i/a;->a:Ljava/lang/Object;

    if-nez v0, :cond_0

    sget-object v0, Lcom/garena/pay/android/b;->p:Lcom/garena/pay/android/b;

    invoke-virtual {v0}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/beetalk/sdk/plugin/a;->g(Landroid/app/Activity;I)V

    return-void

    :cond_0
    invoke-virtual {p0, p1, v0}, Lcom/beetalk/sdk/plugin/e/i/a;->j(Landroid/app/Activity;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method protected b(Landroid/app/Activity;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "TS;)V"
        }
    .end annotation

    if-nez p2, :cond_0

    sget-object p2, Lcom/garena/pay/android/b;->p:Lcom/garena/pay/android/b;

    invoke-virtual {p2}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/beetalk/sdk/plugin/a;->g(Landroid/app/Activity;I)V

    return-void

    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "checking vk session"

    invoke-static {v1, v0}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iput-object p2, p0, Lcom/beetalk/sdk/plugin/e/i/a;->a:Ljava/lang/Object;

    new-instance p2, Lcom/beetalk/sdk/b0/a;

    invoke-direct {p2, p1}, Lcom/beetalk/sdk/b0/a;-><init>(Landroid/app/Activity;)V

    iput-object p2, p0, Lcom/beetalk/sdk/plugin/e/i/a;->b:Lcom/beetalk/sdk/b0/a;

    new-instance v0, Lcom/beetalk/sdk/plugin/e/i/a$a;

    invoke-direct {v0, p0, p1}, Lcom/beetalk/sdk/plugin/e/i/a$a;-><init>(Lcom/beetalk/sdk/plugin/e/i/a;Landroid/app/Activity;)V

    invoke-virtual {p2, v0}, Lcom/beetalk/sdk/b0/a;->f(Lcom/beetalk/sdk/b0/a$d;)V

    iget-object p1, p0, Lcom/beetalk/sdk/plugin/e/i/a;->b:Lcom/beetalk/sdk/b0/a;

    invoke-virtual {p1}, Lcom/beetalk/sdk/b0/a;->g()V

    return-void
.end method

.method public e()Ljava/lang/Integer;
    .locals 1

    sget-object v0, Lcom/vk/sdk/VKServiceActivity$c;->b:Lcom/vk/sdk/VKServiceActivity$c;

    invoke-virtual {v0}, Lcom/vk/sdk/VKServiceActivity$c;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public f(Landroid/app/Activity;ILandroid/content/Intent;)Z
    .locals 1

    iget-object v0, p0, Lcom/beetalk/sdk/plugin/e/i/a;->b:Lcom/beetalk/sdk/b0/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p2, p3}, Lcom/beetalk/sdk/b0/a;->e(ILandroid/content/Intent;)Z

    goto :goto_0

    :cond_0
    sget-object p2, Lcom/garena/pay/android/b;->d0:Lcom/garena/pay/android/b;

    invoke-virtual {p2}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/beetalk/sdk/plugin/a;->g(Landroid/app/Activity;I)V

    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method protected abstract j(Landroid/app/Activity;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "TS;)V"
        }
    .end annotation
.end method
