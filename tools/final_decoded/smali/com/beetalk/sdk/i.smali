.class public Lcom/beetalk/sdk/i;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beetalk/sdk/i$g;
    }
.end annotation


# static fields
.field private static volatile a:Landroid/app/Activity; = null

.field private static volatile b:Lcom/beetalk/sdk/t/c; = null

.field private static c:Ljava/lang/String; = "0"

.field private static d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static A(Landroid/app/Activity;)V
    .locals 2

    sput-object p0, Lcom/beetalk/sdk/i;->a:Landroid/app/Activity;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Lcom/beetalk/sdk/g;->J(Landroid/content/Context;)V

    invoke-static {p0}, Lcom/beetalk/sdk/z/b;->c(Landroid/content/Context;)V

    invoke-static {p0}, Lcom/beetalk/sdk/b0/c;->a(Landroid/content/Context;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    sget-object v1, Lcom/beetalk/sdk/p;->l:Ljava/lang/String;

    invoke-static {p0, v0, v1}, Lcom/vk/sdk/i;->e(Landroid/content/Context;ILjava/lang/String;)Lcom/vk/sdk/i;

    :cond_0
    sget-object p0, Lcom/beetalk/sdk/i;->b:Lcom/beetalk/sdk/t/c;

    if-nez p0, :cond_1

    new-instance p0, Lcom/beetalk/sdk/t/c;

    sget-object v0, Lcom/beetalk/sdk/i;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/beetalk/sdk/t/c;-><init>(Landroid/content/Context;)V

    sput-object p0, Lcom/beetalk/sdk/i;->b:Lcom/beetalk/sdk/t/c;

    sget-object p0, Lcom/beetalk/sdk/i;->b:Lcom/beetalk/sdk/t/c;

    invoke-virtual {p0}, Lcom/beetalk/sdk/t/c;->c()V

    :cond_1
    return-void
.end method

.method public static B(Lcom/beetalk/sdk/g;)V
    .locals 3

    invoke-static {}, Lcom/beetalk/sdk/g;->s()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/beetalk/sdk/b0/c;->a(Landroid/content/Context;)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    sget-object v2, Lcom/beetalk/sdk/p;->l:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/vk/sdk/i;->e(Landroid/content/Context;ILjava/lang/String;)Lcom/vk/sdk/i;

    :cond_0
    invoke-static {p0}, Lcom/beetalk/sdk/g;->h0(Lcom/beetalk/sdk/g;)V

    sget-object p0, Lcom/beetalk/sdk/i;->b:Lcom/beetalk/sdk/t/c;

    if-nez p0, :cond_1

    new-instance p0, Lcom/beetalk/sdk/t/c;

    invoke-static {}, Lcom/beetalk/sdk/g;->s()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/beetalk/sdk/t/c;-><init>(Landroid/content/Context;)V

    sput-object p0, Lcom/beetalk/sdk/i;->b:Lcom/beetalk/sdk/t/c;

    sget-object p0, Lcom/beetalk/sdk/i;->b:Lcom/beetalk/sdk/t/c;

    invoke-virtual {p0}, Lcom/beetalk/sdk/t/c;->c()V

    :cond_1
    return-void
.end method

.method public static C(Lcom/beetalk/sdk/g;)V
    .locals 3

    invoke-static {}, Lcom/beetalk/sdk/g;->s()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/beetalk/sdk/b0/c;->a(Landroid/content/Context;)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    sget-object v2, Lcom/beetalk/sdk/p;->l:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/vk/sdk/i;->e(Landroid/content/Context;ILjava/lang/String;)Lcom/vk/sdk/i;

    :cond_0
    invoke-static {p0}, Lcom/beetalk/sdk/g;->f0(Lcom/beetalk/sdk/g;)V

    sget-object p0, Lcom/beetalk/sdk/i;->b:Lcom/beetalk/sdk/t/c;

    if-nez p0, :cond_1

    new-instance p0, Lcom/beetalk/sdk/t/c;

    invoke-static {}, Lcom/beetalk/sdk/g;->s()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/beetalk/sdk/t/c;-><init>(Landroid/content/Context;)V

    sput-object p0, Lcom/beetalk/sdk/i;->b:Lcom/beetalk/sdk/t/c;

    sget-object p0, Lcom/beetalk/sdk/i;->b:Lcom/beetalk/sdk/t/c;

    invoke-virtual {p0}, Lcom/beetalk/sdk/t/c;->c()V

    :cond_1
    return-void
.end method

.method public static D(Lcom/beetalk/sdk/g;)V
    .locals 3

    invoke-static {}, Lcom/beetalk/sdk/g;->s()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/beetalk/sdk/b0/c;->a(Landroid/content/Context;)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    sget-object v2, Lcom/beetalk/sdk/p;->l:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/vk/sdk/i;->e(Landroid/content/Context;ILjava/lang/String;)Lcom/vk/sdk/i;

    :cond_0
    invoke-static {p0}, Lcom/beetalk/sdk/g;->g0(Lcom/beetalk/sdk/g;)V

    sget-object p0, Lcom/beetalk/sdk/i;->b:Lcom/beetalk/sdk/t/c;

    if-nez p0, :cond_1

    new-instance p0, Lcom/beetalk/sdk/t/c;

    invoke-static {}, Lcom/beetalk/sdk/g;->s()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/beetalk/sdk/t/c;-><init>(Landroid/content/Context;)V

    sput-object p0, Lcom/beetalk/sdk/i;->b:Lcom/beetalk/sdk/t/c;

    sget-object p0, Lcom/beetalk/sdk/i;->b:Lcom/beetalk/sdk/t/c;

    invoke-virtual {p0}, Lcom/beetalk/sdk/t/c;->c()V

    :cond_1
    return-void
.end method

.method public static E(Landroid/app/Activity;Lcom/beetalk/sdk/g$n;)V
    .locals 1

    sput-object p0, Lcom/beetalk/sdk/i;->a:Landroid/app/Activity;

    invoke-static {p1}, Lcom/beetalk/sdk/i;->I(Lcom/beetalk/sdk/g$n;)Lcom/beetalk/sdk/g$n;

    move-result-object p1

    invoke-static {p0}, Lcom/beetalk/sdk/x/d;->n(Landroid/content/Context;)Z

    move-result p0

    if-nez p0, :cond_1

    invoke-static {}, Lcom/beetalk/sdk/g;->y()Lcom/beetalk/sdk/g;

    move-result-object p0

    if-eqz p0, :cond_0

    sget-object v0, Lcom/beetalk/sdk/q;->e:Lcom/beetalk/sdk/q;

    invoke-virtual {p0, v0}, Lcom/beetalk/sdk/g;->j0(Lcom/beetalk/sdk/q;)V

    sget-object v0, Lcom/garena/pay/android/b;->l:Lcom/garena/pay/android/b;

    invoke-virtual {v0}, Lcom/garena/pay/android/b;->c()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/beetalk/sdk/g;->i0(I)V

    const/4 v0, 0x0

    invoke-interface {p1, p0, v0}, Lcom/beetalk/sdk/g$n;->onSessionProcessed(Lcom/beetalk/sdk/g;Ljava/lang/Exception;)V

    :cond_0
    return-void

    :cond_1
    sget-object p0, Lcom/beetalk/sdk/i;->a:Landroid/app/Activity;

    const/4 v0, 0x1

    invoke-static {p0, v0, p1}, Lcom/beetalk/sdk/g;->U(Landroid/app/Activity;ZLcom/beetalk/sdk/g$n;)Lcom/beetalk/sdk/g;

    return-void
.end method

.method private static F(Lcom/beetalk/sdk/g;Lcom/beetalk/sdk/g$n;)V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/beetalk/sdk/g;->G()Lcom/beetalk/sdk/q;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "ndk_login_auth_callback error %s"

    invoke-static {v1, v0}, Lcom/beetalk/sdk/x/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Lcom/beetalk/sdk/g$l;

    sget-object v1, Lcom/beetalk/sdk/i;->a:Landroid/app/Activity;

    invoke-direct {v0, v1}, Lcom/beetalk/sdk/g$l;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0}, Lcom/beetalk/sdk/g;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beetalk/sdk/g$l;->c(Ljava/lang/String;)Lcom/beetalk/sdk/g$l;

    invoke-virtual {p0}, Lcom/beetalk/sdk/g;->B()Lcom/beetalk/sdk/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beetalk/sdk/g$l;->d(Lcom/beetalk/sdk/c;)Lcom/beetalk/sdk/g$l;

    invoke-virtual {p0}, Lcom/beetalk/sdk/g;->t()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beetalk/sdk/g$l;->b(Ljava/lang/String;)Lcom/beetalk/sdk/g$l;

    invoke-virtual {p0}, Lcom/beetalk/sdk/g;->F()Lcom/beetalk/sdk/g$o;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beetalk/sdk/g$l;->f(Lcom/beetalk/sdk/g$o;)Lcom/beetalk/sdk/g$l;

    invoke-virtual {p0}, Lcom/beetalk/sdk/g;->E()I

    move-result p0

    invoke-virtual {v0, p0}, Lcom/beetalk/sdk/g$l;->e(I)Lcom/beetalk/sdk/g$l;

    invoke-virtual {v0}, Lcom/beetalk/sdk/g$l;->a()Lcom/beetalk/sdk/g;

    move-result-object p0

    invoke-static {p0}, Lcom/beetalk/sdk/g;->h0(Lcom/beetalk/sdk/g;)V

    sget-object p0, Lcom/beetalk/sdk/i;->a:Landroid/app/Activity;

    invoke-static {p0, p1}, Lcom/beetalk/sdk/g;->r(Landroid/app/Activity;Lcom/beetalk/sdk/g$n;)Lcom/beetalk/sdk/g;

    return-void
.end method

.method public static G(Ljava/lang/String;)V
    .locals 0

    sput-object p0, Lcom/beetalk/sdk/i;->c:Ljava/lang/String;

    return-void
.end method

.method public static H(Ljava/lang/String;)V
    .locals 0

    sput-object p0, Lcom/beetalk/sdk/i;->d:Ljava/lang/String;

    return-void
.end method

.method static I(Lcom/beetalk/sdk/g$n;)Lcom/beetalk/sdk/g$n;
    .locals 1

    const-string v0, "Session Callback to be wrapped cannot be null"

    invoke-static {p0, v0}, Lcom/beetalk/sdk/x/k;->b(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/beetalk/sdk/i;->J(Lcom/beetalk/sdk/g$n;Z)Lcom/beetalk/sdk/g$n;

    move-result-object p0

    return-object p0
.end method

.method static J(Lcom/beetalk/sdk/g$n;Z)Lcom/beetalk/sdk/g$n;
    .locals 1

    const-string v0, "Session Callback to be wrapped cannot be null"

    invoke-static {p0, v0}, Lcom/beetalk/sdk/x/k;->b(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/beetalk/sdk/i$e;

    invoke-direct {v0, p0, p1}, Lcom/beetalk/sdk/i$e;-><init>(Lcom/beetalk/sdk/g$n;Z)V

    return-object v0
.end method

.method static K(Lcom/beetalk/sdk/g$n;)Lcom/beetalk/sdk/g$n;
    .locals 1

    const-string v0, "Session Callback to be wrapped cannot be null"

    invoke-static {p0, v0}, Lcom/beetalk/sdk/x/k;->b(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/beetalk/sdk/i;->J(Lcom/beetalk/sdk/g$n;Z)Lcom/beetalk/sdk/g$n;

    move-result-object p0

    return-object p0
.end method

.method public static a()V
    .locals 1

    const/4 v0, 0x1

    invoke-static {v0}, Lcom/beetalk/sdk/p;->P(Z)V

    return-void
.end method

.method public static b()Ljava/lang/String;
    .locals 1

    const-string v0, "4.0.19P2"

    return-object v0
.end method

.method public static c(Landroid/app/Activity;Lcom/beetalk/sdk/g$n;)V
    .locals 0

    sput-object p0, Lcom/beetalk/sdk/i;->a:Landroid/app/Activity;

    invoke-static {p1}, Lcom/beetalk/sdk/i;->K(Lcom/beetalk/sdk/g$n;)Lcom/beetalk/sdk/g$n;

    move-result-object p0

    sget-object p1, Lcom/beetalk/sdk/i;->a:Landroid/app/Activity;

    invoke-static {p1, p0}, Lcom/beetalk/sdk/g;->P(Landroid/app/Activity;Lcom/beetalk/sdk/g$n;)Lcom/beetalk/sdk/g;

    return-void
.end method

.method public static d(Landroid/app/Activity;Lcom/beetalk/sdk/g$n;)V
    .locals 0

    sput-object p0, Lcom/beetalk/sdk/i;->a:Landroid/app/Activity;

    invoke-static {p1}, Lcom/beetalk/sdk/i;->K(Lcom/beetalk/sdk/g$n;)Lcom/beetalk/sdk/g$n;

    move-result-object p0

    sget-object p1, Lcom/beetalk/sdk/i;->a:Landroid/app/Activity;

    invoke-static {p1, p0}, Lcom/beetalk/sdk/g;->R(Landroid/app/Activity;Lcom/beetalk/sdk/g$n;)Lcom/beetalk/sdk/g;

    return-void
.end method

.method public static e(Landroid/app/Activity;I)Z
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eq p1, v1, :cond_3

    const/4 v1, 0x3

    if-eq p1, v1, :cond_2

    const/4 v1, 0x5

    if-eq p1, v1, :cond_1

    const/4 v1, 0x6

    if-eq p1, v1, :cond_0

    return v0

    :cond_0
    const-string p1, "jp.naver.line.android"

    :goto_0
    invoke-static {p1, p0}, Lcom/beetalk/sdk/x/d;->p(Ljava/lang/String;Landroid/content/Context;)Z

    move-result p0

    return p0

    :cond_1
    const-string p1, "com.vkontakte.android"

    goto :goto_0

    :cond_2
    const-string p1, "com.facebook.katana"

    goto :goto_0

    :cond_3
    const-string p1, "com.garena.gas"

    invoke-static {p1, p0}, Lcom/beetalk/sdk/x/d;->p(Ljava/lang/String;Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_4

    const-string p1, "com.garena.gaslite"

    invoke-static {p1, p0}, Lcom/beetalk/sdk/x/d;->p(Ljava/lang/String;Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_5

    :cond_4
    const/4 v0, 0x1

    :cond_5
    return v0
.end method

.method public static f(Landroid/app/Activity;I)I
    .locals 1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    const/4 v0, 0x5

    if-eq p1, v0, :cond_1

    const/4 v0, 0x6

    if-eq p1, v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const-string p1, "jp.naver.line.android"

    :goto_0
    invoke-static {p0, p1}, Lcom/beetalk/sdk/x/d;->i(Landroid/content/Context;Ljava/lang/String;)I

    move-result p0

    return p0

    :cond_1
    const-string p1, "com.vkontakte.android"

    goto :goto_0

    :cond_2
    const-string p1, "com.facebook.katana"

    goto :goto_0

    :cond_3
    const-string p1, "com.garena.gas"

    invoke-static {p1, p0}, Lcom/beetalk/sdk/x/d;->p(Ljava/lang/String;Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {p0, p1}, Lcom/beetalk/sdk/x/d;->i(Landroid/content/Context;Ljava/lang/String;)I

    move-result p0

    return p0

    :cond_4
    const-string p1, "com.garena.gaslite"

    goto :goto_0
.end method

.method public static g(Landroid/app/Activity;Lj/c/a/f/a;)V
    .locals 0

    invoke-static {p0, p1}, Lj/c/a/b;->d(Landroid/content/Context;Lj/c/a/f/a;)V

    invoke-static {}, Lj/c/a/b;->a()Lj/c/a/b;

    move-result-object p0

    invoke-virtual {p0}, Lj/c/a/b;->e()V

    return-void
.end method

.method public static h(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lcom/beetalk/sdk/g;->x()Lcom/beetalk/sdk/g;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lcom/beetalk/sdk/t/j;

    invoke-direct {v1, p0}, Lcom/beetalk/sdk/t/j;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lcom/beetalk/sdk/g;->e0(Lcom/beetalk/sdk/t/k;)V

    invoke-static {v0}, Lcom/beetalk/sdk/g;->h0(Lcom/beetalk/sdk/g;)V

    new-instance v1, Lcom/beetalk/sdk/t/j;

    invoke-direct {v1, p0}, Lcom/beetalk/sdk/t/j;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/beetalk/sdk/g;->I()Lcom/beetalk/sdk/u/a;

    move-result-object p0

    invoke-virtual {v1, p0}, Lcom/beetalk/sdk/t/k;->l(Lcom/beetalk/sdk/u/a;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/beetalk/sdk/g;->n()Z

    :goto_0
    invoke-static {}, Lcom/beetalk/sdk/t/a;->s()Lcom/beetalk/sdk/t/a;

    move-result-object p0

    invoke-virtual {p0}, Lcom/beetalk/sdk/t/a;->p()V

    invoke-static {}, Lcom/beetalk/sdk/t/g;->s()Lcom/beetalk/sdk/t/g;

    move-result-object p0

    invoke-virtual {p0}, Lcom/beetalk/sdk/t/k;->b()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static i(Landroid/app/Activity;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/beetalk/sdk/plugin/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "J",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/beetalk/sdk/plugin/b<",
            "Lcom/beetalk/sdk/plugin/PluginResult;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lcom/beetalk/sdk/plugin/e/b/j/a$b;

    invoke-direct {v0}, Lcom/beetalk/sdk/plugin/e/b/j/a$b;-><init>()V

    invoke-virtual {v0, p1, p2}, Lcom/beetalk/sdk/plugin/e/b/j/a$b;->m(J)Lcom/beetalk/sdk/plugin/e/b/j/a$b;

    invoke-virtual {v0, p3}, Lcom/beetalk/sdk/plugin/e/b/j/a$b;->l(Ljava/lang/String;)Lcom/beetalk/sdk/plugin/e/b/j/a$b;

    invoke-virtual {v0, p4}, Lcom/beetalk/sdk/plugin/e/b/j/a$b;->j(Ljava/lang/String;)Lcom/beetalk/sdk/plugin/e/b/j/a$b;

    invoke-virtual {v0, p5}, Lcom/beetalk/sdk/plugin/e/b/j/a$b;->i(Ljava/lang/String;)Lcom/beetalk/sdk/plugin/e/b/j/a$b;

    invoke-virtual {v0}, Lcom/beetalk/sdk/plugin/e/b/j/a$b;->g()Lcom/beetalk/sdk/plugin/e/b/j/a;

    move-result-object p1

    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object p2

    const-string p3, "facebook.game.message"

    invoke-virtual {p2, p0, p3, p1, p6}, Lcom/beetalk/sdk/plugin/c;->m(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Object;Lcom/beetalk/sdk/plugin/b;)V

    return-void
.end method

.method public static j(Landroid/app/Activity;Lcom/beetalk/sdk/j;Lcom/beetalk/sdk/plugin/b;)V
    .locals 2

    invoke-static {}, Lcom/beetalk/sdk/g;->y()Lcom/beetalk/sdk/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beetalk/sdk/g;->F()Lcom/beetalk/sdk/g$o;

    move-result-object v0

    sget-object v1, Lcom/beetalk/sdk/g$o;->b:Lcom/beetalk/sdk/g$o;

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object v0

    const-string v1, "gas.share.text"

    invoke-virtual {v0, p0, v1, p1, p2}, Lcom/beetalk/sdk/plugin/c;->m(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Object;Lcom/beetalk/sdk/plugin/b;)V

    :cond_0
    return-void
.end method

.method public static k(Landroid/app/Activity;Lcom/beetalk/sdk/w/b;Lcom/beetalk/sdk/plugin/b;)V
    .locals 2

    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object v0

    const-string v1, "facebook.share.fallback"

    invoke-virtual {v0, p0, v1, p1, p2}, Lcom/beetalk/sdk/plugin/c;->m(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Object;Lcom/beetalk/sdk/plugin/b;)V

    return-void
.end method

.method public static l(Landroid/app/Activity;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/beetalk/sdk/i$g;)V
    .locals 6

    invoke-static {}, Lcom/beetalk/sdk/g;->y()Lcom/beetalk/sdk/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beetalk/sdk/g;->t()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {}, Lcom/beetalk/sdk/g;->y()Lcom/beetalk/sdk/g;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beetalk/sdk/g;->D()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 p2, 0x3

    if-eq v1, p2, :cond_0

    const/4 p0, 0x0

    new-array p0, p0, [Ljava/lang/Object;

    const-string p1, "Unsupported Platform Chosen"

    invoke-static {p1, p0}, Lcom/beetalk/sdk/x/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    if-ne p1, v2, :cond_1

    new-instance p1, Lcom/beetalk/sdk/w/b;

    move-object v0, p1

    move-object v1, p4

    move-object v2, p5

    move-object v3, p6

    move-object v4, p3

    move-object v5, p7

    invoke-direct/range {v0 .. v5}, Lcom/beetalk/sdk/w/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance p2, Lcom/beetalk/sdk/i$a;

    invoke-direct {p2, p8}, Lcom/beetalk/sdk/i$a;-><init>(Lcom/beetalk/sdk/i$g;)V

    invoke-static {p0, p1, p2}, Lcom/beetalk/sdk/i;->k(Landroid/app/Activity;Lcom/beetalk/sdk/w/b;Lcom/beetalk/sdk/plugin/b;)V

    goto :goto_0

    :cond_1
    new-instance v5, Lcom/beetalk/sdk/i$b;

    invoke-direct {v5, p8}, Lcom/beetalk/sdk/i$b;-><init>(Lcom/beetalk/sdk/i$g;)V

    move-object v0, p0

    move-object v1, p4

    move-object v2, p6

    move-object v3, p3

    move-object v4, p7

    invoke-static/range {v0 .. v5}, Lcom/beetalk/sdk/i;->n(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/beetalk/sdk/plugin/b;)V

    goto :goto_0

    :cond_2
    new-instance p5, Lcom/beetalk/sdk/j$a;

    invoke-direct {p5, v0}, Lcom/beetalk/sdk/j$a;-><init>(I)V

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p5, p1}, Lcom/beetalk/sdk/j$a;->e(Ljava/lang/Integer;)Lcom/beetalk/sdk/j$a;

    invoke-virtual {p5, p6}, Lcom/beetalk/sdk/j$a;->c(Ljava/lang/String;)Lcom/beetalk/sdk/j$a;

    invoke-virtual {p5, p2}, Lcom/beetalk/sdk/j$a;->d(Ljava/lang/String;)Lcom/beetalk/sdk/j$a;

    invoke-virtual {p5, p4}, Lcom/beetalk/sdk/j$a;->f(Ljava/lang/String;)Lcom/beetalk/sdk/j$a;

    invoke-virtual {p5, p3}, Lcom/beetalk/sdk/j$a;->g(Ljava/lang/String;)Lcom/beetalk/sdk/j$a;

    invoke-virtual {p5}, Lcom/beetalk/sdk/j$a;->a()Lcom/beetalk/sdk/j;

    move-result-object p1

    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object p2

    new-instance p3, Lcom/beetalk/sdk/i$c;

    invoke-direct {p3, p8}, Lcom/beetalk/sdk/i$c;-><init>(Lcom/beetalk/sdk/i$g;)V

    const-string p4, "gas.share.url"

    invoke-virtual {p2, p0, p4, p1, p3}, Lcom/beetalk/sdk/plugin/c;->m(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Object;Lcom/beetalk/sdk/plugin/b;)V

    :goto_0
    return-void
.end method

.method public static m(Landroid/app/Activity;Lcom/beetalk/sdk/h;Lcom/beetalk/sdk/plugin/b;)V
    .locals 2

    invoke-static {}, Lcom/beetalk/sdk/g;->y()Lcom/beetalk/sdk/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beetalk/sdk/g;->F()Lcom/beetalk/sdk/g$o;

    move-result-object v0

    sget-object v1, Lcom/beetalk/sdk/g$o;->b:Lcom/beetalk/sdk/g$o;

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object v0

    const-string v1, "gas.share.photo"

    invoke-virtual {v0, p0, v1, p1, p2}, Lcom/beetalk/sdk/plugin/c;->m(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Object;Lcom/beetalk/sdk/plugin/b;)V

    :cond_0
    return-void
.end method

.method public static n(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/beetalk/sdk/plugin/b;)V
    .locals 1

    new-instance v0, Lcom/beetalk/sdk/plugin/e/b/j/a$b;

    invoke-direct {v0}, Lcom/beetalk/sdk/plugin/e/b/j/a$b;-><init>()V

    invoke-virtual {v0, p1}, Lcom/beetalk/sdk/plugin/e/b/j/a$b;->l(Ljava/lang/String;)Lcom/beetalk/sdk/plugin/e/b/j/a$b;

    invoke-virtual {v0, p2}, Lcom/beetalk/sdk/plugin/e/b/j/a$b;->j(Ljava/lang/String;)Lcom/beetalk/sdk/plugin/e/b/j/a$b;

    invoke-virtual {v0, p3}, Lcom/beetalk/sdk/plugin/e/b/j/a$b;->h(Ljava/lang/String;)Lcom/beetalk/sdk/plugin/e/b/j/a$b;

    invoke-virtual {v0, p4}, Lcom/beetalk/sdk/plugin/e/b/j/a$b;->k(Ljava/lang/String;)Lcom/beetalk/sdk/plugin/e/b/j/a$b;

    invoke-virtual {v0}, Lcom/beetalk/sdk/plugin/e/b/j/a$b;->g()Lcom/beetalk/sdk/plugin/e/b/j/a;

    move-result-object p1

    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object p2

    const-string p3, "facebook.message"

    invoke-virtual {p2, p0, p3, p1, p5}, Lcom/beetalk/sdk/plugin/c;->m(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Object;Lcom/beetalk/sdk/plugin/b;)V

    return-void
.end method

.method public static o(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lcom/beetalk/sdk/plugin/b;)V
    .locals 2

    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object v0

    new-instance v1, Lcom/beetalk/sdk/i$f;

    invoke-direct {v1, p1, p2}, Lcom/beetalk/sdk/i$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "facebook.invite"

    invoke-virtual {v0, p0, p1, v1, p3}, Lcom/beetalk/sdk/plugin/c;->m(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Object;Lcom/beetalk/sdk/plugin/b;)V

    return-void
.end method

.method public static p(Lcom/beetalk/sdk/p$c;)V
    .locals 0

    invoke-static {p0}, Lcom/beetalk/sdk/p;->S(Lcom/beetalk/sdk/p$c;)V

    return-void
.end method

.method public static q(Landroid/app/Activity;Lcom/beetalk/sdk/w/b;Lcom/beetalk/sdk/plugin/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lcom/beetalk/sdk/w/b;",
            "Lcom/beetalk/sdk/plugin/b<",
            "Lcom/beetalk/sdk/plugin/PluginResult;",
            ">;)V"
        }
    .end annotation

    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object v0

    const-string v1, "facebook.share"

    invoke-virtual {v0, p0, v1, p1, p2}, Lcom/beetalk/sdk/plugin/c;->m(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Object;Lcom/beetalk/sdk/plugin/b;)V

    return-void
.end method

.method public static r(Landroid/app/Activity;Lcom/beetalk/sdk/b0/b;Lcom/beetalk/sdk/plugin/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lcom/beetalk/sdk/b0/b;",
            "Lcom/beetalk/sdk/plugin/b<",
            "Lcom/beetalk/sdk/plugin/PluginResult;",
            ">;)V"
        }
    .end annotation

    invoke-static {}, Lcom/beetalk/sdk/plugin/c;->k()Lcom/beetalk/sdk/plugin/c;

    move-result-object v0

    const-string v1, "vk.share"

    invoke-virtual {v0, p0, v1, p1, p2}, Lcom/beetalk/sdk/plugin/c;->m(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Object;Lcom/beetalk/sdk/plugin/b;)V

    return-void
.end method

.method static synthetic s(Lcom/beetalk/sdk/g;Lcom/beetalk/sdk/g$n;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/beetalk/sdk/i;->F(Lcom/beetalk/sdk/g;Lcom/beetalk/sdk/g$n;)V

    return-void
.end method

.method public static t()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/beetalk/sdk/i;->c:Ljava/lang/String;

    return-object v0
.end method

.method public static u()Ljava/lang/Integer;
    .locals 2

    invoke-static {}, Lcom/beetalk/sdk/g;->y()Lcom/beetalk/sdk/g;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/beetalk/sdk/g;->y()Lcom/beetalk/sdk/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beetalk/sdk/g;->H()Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Lcom/beetalk/sdk/i;->a:Landroid/app/Activity;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/beetalk/sdk/i;->a:Landroid/app/Activity;

    invoke-static {v0}, Lcom/beetalk/sdk/x/d;->g(Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Lcom/beetalk/sdk/v/b;

    const-string v1, "Please initialize the session before continuing"

    invoke-direct {v0, v1}, Lcom/beetalk/sdk/v/b;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static v()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/beetalk/sdk/i;->d:Ljava/lang/String;

    return-object v0
.end method

.method public static w()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/beetalk/sdk/t/a;->s()Lcom/beetalk/sdk/t/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beetalk/sdk/t/k;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static x()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/beetalk/sdk/t/a;->s()Lcom/beetalk/sdk/t/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beetalk/sdk/t/k;->f()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static y(Landroid/app/Activity;)Z
    .locals 3

    new-instance v0, Lcom/beetalk/sdk/t/j;

    invoke-direct {v0, p0}, Lcom/beetalk/sdk/t/j;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/beetalk/sdk/t/k;->h()Lcom/beetalk/sdk/u/a;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/beetalk/sdk/u/a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Lcom/beetalk/sdk/u/a;->h()Lcom/beetalk/sdk/u/l;

    move-result-object v0

    sget-object v2, Lcom/beetalk/sdk/i$d;->b:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v2, v0

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lcom/beetalk/sdk/g$o;->h:Lcom/beetalk/sdk/g$o;

    goto :goto_0

    :pswitch_0
    sget-object v0, Lcom/beetalk/sdk/g$o;->i:Lcom/beetalk/sdk/g$o;

    goto :goto_0

    :pswitch_1
    sget-object v0, Lcom/beetalk/sdk/g$o;->g:Lcom/beetalk/sdk/g$o;

    goto :goto_0

    :pswitch_2
    sget-object v0, Lcom/beetalk/sdk/g$o;->f:Lcom/beetalk/sdk/g$o;

    goto :goto_0

    :pswitch_3
    sget-object v0, Lcom/beetalk/sdk/g$o;->e:Lcom/beetalk/sdk/g$o;

    goto :goto_0

    :pswitch_4
    sget-object v0, Lcom/beetalk/sdk/g$o;->d:Lcom/beetalk/sdk/g$o;

    goto :goto_0

    :pswitch_5
    sget-object v0, Lcom/beetalk/sdk/g$o;->b:Lcom/beetalk/sdk/g$o;

    goto :goto_0

    :pswitch_6
    sget-object v0, Lcom/beetalk/sdk/g$o;->c:Lcom/beetalk/sdk/g$o;

    :goto_0
    new-instance v2, Lcom/beetalk/sdk/g$l;

    invoke-direct {v2, p0}, Lcom/beetalk/sdk/g$l;-><init>(Landroid/content/Context;)V

    sget-object p0, Lcom/beetalk/sdk/i;->c:Ljava/lang/String;

    invoke-virtual {v2, p0}, Lcom/beetalk/sdk/g$l;->b(Ljava/lang/String;)Lcom/beetalk/sdk/g$l;

    const-string p0, ""

    invoke-virtual {v2, p0}, Lcom/beetalk/sdk/g$l;->c(Ljava/lang/String;)Lcom/beetalk/sdk/g$l;

    sget-object p0, Lcom/beetalk/sdk/c;->c:Lcom/beetalk/sdk/c;

    invoke-virtual {v2, p0}, Lcom/beetalk/sdk/g$l;->d(Lcom/beetalk/sdk/c;)Lcom/beetalk/sdk/g$l;

    invoke-virtual {v2, v0}, Lcom/beetalk/sdk/g$l;->f(Lcom/beetalk/sdk/g$o;)Lcom/beetalk/sdk/g$l;

    invoke-virtual {v2}, Lcom/beetalk/sdk/g$l;->a()Lcom/beetalk/sdk/g;

    move-result-object p0

    invoke-virtual {p0}, Lcom/beetalk/sdk/g;->G()Lcom/beetalk/sdk/q;

    move-result-object v0

    sget-object v2, Lcom/beetalk/sdk/q;->c:Lcom/beetalk/sdk/q;

    if-ne v0, v2, :cond_1

    invoke-static {p0}, Lcom/beetalk/sdk/i;->B(Lcom/beetalk/sdk/g;)V

    const/4 p0, 0x1

    return p0

    :cond_1
    :goto_1
    return v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static z(Landroid/app/Activity;IILandroid/content/Intent;)V
    .locals 1

    sget-object v0, Lcom/beetalk/sdk/p;->i:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne p1, v0, :cond_0

    invoke-static {}, Lcom/beetalk/sdk/g;->w()Lcom/beetalk/sdk/g;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {}, Lcom/beetalk/sdk/g;->w()Lcom/beetalk/sdk/g;

    move-result-object v0

    :goto_0
    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/beetalk/sdk/g;->W(Landroid/app/Activity;IILandroid/content/Intent;)Z

    goto :goto_1

    :cond_0
    sget-object v0, Lcom/beetalk/sdk/p;->h:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne p1, v0, :cond_1

    invoke-static {}, Lcom/beetalk/sdk/g;->x()Lcom/beetalk/sdk/g;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {}, Lcom/beetalk/sdk/g;->x()Lcom/beetalk/sdk/g;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/beetalk/sdk/g;->y()Lcom/beetalk/sdk/g;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/beetalk/sdk/g;->y()Lcom/beetalk/sdk/g;

    move-result-object v0

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    new-array p0, p0, [Ljava/lang/Object;

    const-string p1, "onActivityResult: no available session"

    invoke-static {p1, p0}, Lcom/beetalk/sdk/x/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    :goto_1
    return-void
.end method
